#!/bin/bash
#this is the starting script for HW #1, it has useful tips, comments and hints embedded in it.  Read it carefully and add your code to answer the questions


#TIP 1: you can pass a arguments (ie the filename to a bash script) using $1, $2, $3 ... 
#example here: https://unix.stackexchange.com/questions/31414/how-can-i-pass-a-command-line-argument-into-a-shell-script
#we want to be able to call our script on different files like this $ ./scrub_movie_info.sh mylist.csv 
INPUTFILE=$1
#from now on we can use the $FILENAME variable for our input file


#TIP 2: recall I said awk is useful for working with columns of data...sometimes when we export data from excel (or other sources) the delimiter (e.g. space, tab, comma) might be different than what awk is expecting. Also, the end of line character could be different than what awk is expecting.  You can change this. 
# examples: https://www.gnu.org/software/gawk/manual/html_node/Print-Examples.html
# so we can let awk know that we are using the comma as a delimiter in our data file.  See what happens, also see what happens when you use $2, $3 etc
awk -F "," '{print $1}' $INPUTFILE

#TIP 3: recall you can pipe many commands together, what info does the following do (copy and paste it onto the command line)
#cat movie_metadata.csv | grep 'Woody Allen' |  awk -F "," '{print $6}'


#Question 1 to answer: Which three films grossed the largest amount of money? Add the code below and redirect to a file movie_stat.txt 

cat movie_metadata.csv | sort -t ',' -k 8 -g |awk -F, '{print $11","$8'} | tail 

#Question 2 to answer: What is the average imdb score for all movies directed by Hayao Miyazaki? Add the code below and redirect (append) to the file movie_stats.txt created in Question #1 
cat movie_metadata.csv |grep ^'Hayao Miyazaki' | awk -F, '{sum+=$25} END {print " Hayao Miyazaki imdb score = ", sum/NR}'>> movie_stat.txt


#Question 3 to answer: How many movies did each director in the data-set direct (hint: we did a very similar task with the tutorial where we analyzd the dictionary words). Add the code to do this below, and redirect thw output to append to movie_stat.txt

# solution 1:
sort   movie_metadata.csv |awk -F, '{print $1'}  |uniq -c |sort -nr -k1 >> movie_stat.txt
# solution 2:
awk -F, '{arr[$1]++} END {for (i in arr) {print i,arr[i]}}' movie_metadata.csv >> movie_stat.txt

#Don't forget the final 2 tasks (manipulating movie_metadata.csv).  1. Reorder/filter the movie_metatdata.csv such that the movie_title is the first column followed by director_name, title_year, gross, imdb_score, movie_facebook_likes and redirect to a new file movie_metadata_filtered.csv. 2. Add a movie to the end of the list movie_metadata_filtered.csv. 3. Don't forget to add commit and push your changes to your branch

#task 1
awk -F, '{print $11,$1,$23,$8,$25,$26}' movie_metadata.csv >> movie_metadata_filtered.csv

#task 2

sed -i '$aLa La Land,Damien Chazelle,2016,151101803,8.2,91000' movie_metadata_filtered.csv


