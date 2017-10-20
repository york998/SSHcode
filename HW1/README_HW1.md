# README #

This is HW1 (git, bash scripting) for STC Fall 2017 
### Instructions ###

Please complete this assignment on isp.tacc.utexas.edu using a command line editor (vim, emacs, nano) and command line tools.  The goal is to give you some practice. DO not hesitate to ask for help and also post to the piazza 

1. Set-up your bitbucket account, ssh-keys and remote repo as instructed in class and in the 06_git_tutorial.pdf on canvas.  Be sure you are familiar with the basic git commands before proceeding.  
2. After you login to your bitbucket account, go to https://bitbucket.org/annedara/stc-hw and fork the repo (select the + in the far left column and then "fork this repository", name it lastname-firstname-stc-hw1 make the repository private (you will share it only with annedara, mcdougalld, udaivir.yadav@utexas.edu)
3. After you fork the repo, you will need to log in to isp.tacc.utexas.edu and clone it to your local space (use the URL given to you at the top of the "Overview" something like git clone git@bitbucket.org:yourbitbucketname/lastname-firstname-stc-hw.git)
4. cd into the lastname-firstname-stc-hw/HW1 directory
5. There is a starting bash script for you called: scrub_movie_info.sh it contains comments,code tips,hints and the questions you will need to answer the questions. Read it carefully.
6. Task 1:  Write code to answer the 3 questions and also redirect the output (with the actual answers) to a file movie_stats.txt
	Question 1: Which three films grossed the largest amount of money? Add the code below and redirect to a file movie_stat.txt
	Question 2: What is the average imdb score for all movies directed by Hayao Miyazaki? Add the code below and redirect (append) to the file movie_stats.txt created in Question #1
	Question 3: How many movies did each director in the data-set direct (hint: we did a very similar task with the tutorial where we analyzd the dictionary words). Add the code to do this below, and redirect the output to append to movie_stat.txt
7. Add and commit your changes incrementally with a commit message
8. Also add and commit your changes and push to your remote branch.
9. Reorder/filter the movie_metatdata.csv such that the movie_title is the first column followed by director_name, title_year, gross, imdb_score, movie_facebook_likes and redirect to a new file movie_metadata_filtered.csv. 
10. Add a movie to the end of the list movie_metadata_filtered.csv with the associated filtered metadata (movie_title, director_name, title_year, gross, imdb_score, movie_facebook_likes) 
11.  redirect the "git log" to a file git_commit_log.txt

Grading criteria: 1)Correct answers in movie_stats.txt  2)"show your work" bash scripts that get the answer in scrub_movie_info.sh 3)restructured movie_stat.txt 4)frequent, incremental git commits with meaningful error messages

### Need Help? ###

Questions? Don't forget to use our piazza message board!https://piazza.com/utexas/fall2017/sds335394
and also you can contact UV Yadav udaivir.yadav@utmail.utexas.edu, Anne Bowen adb@tacc.utexas.edu or Damon McDougall dmcdougall@tacc.utexas.edu
