# README #

This is homework 2 (floating point calculations) for STC Fall 2017.

### Instructions ###

Please complete this assignment on isp.tacc.utexas.edu using a command line
editor (vim, emacs, nano) and command line tools.

This homework requires you to write source code (C/C++/Fortran and LaTeX).
Please use version control as you do your homework.

Please put your answers to Questions 4, 5, 6, and 7 in the file hw2.tex.  The
file hw2.tex must compile with `pdflatex hw2.tex` without any errors.

Do not hesitate to ask for help and also post to piazza.

1. Create a file called quadratic.c (or quadratic.f90/quadratic.C if you prefer
   fortran or C++)

2. In this file, write a program that takes three double precision numbers a, b
   and c and computes the two solutions of

   ax^2 + bx + c = 0.

   Use the classical formula you learned in high school to do this:

   x_1 = ( -b + sqrt(b^2 - 4ac) ) / 2a
   x_2 = ( -b - sqrt(b^2 - 4ac) ) / 2a

   You may assume b^2 > 4ac.  Store the solutions in variables called x_1 and
   x_2.

   We'll be exploring how different values of a, b and c affect your computed
   solutions, so you may choose to design your code to accept a, b and c on the
   command line or from an input file.  This is purely for your convenience; it
   is not necessary.

   Commit your source file.

3. Let a = 1 and c = 1.  Run your program for values b = 1e1, 1e2, 1e3, ...,
   1e15.  Record x_1 and x_2, for each value of b, to a file called roots.txt.
   This file should have 15 lines and two columns.  The first line should
   contain x_1 and x_2 for the case b = 1e1.  The last line should contain
   x_1 and x_2 for the case b = 1e15.  The first column should correspond to x_1
   for each value of b, and the second column should similarly correspond to
   x_2.

   How you produce the file doesn't matter.  Commit the file roots.txt to your
   git repo.

4. Prove, mathematically, that both roots are negative.  Put your answer in the
   file hw2.tex and commit it.

5. What is x_1 * x_2 in terms of a, b and c?  Put your answer in the file
   hw2.tex and commit it.

6. Look at your file roots.txt.  What do you notice about x_1?  Is the
   expression you found in Question 5 ever violated?  Put your answer in the
   file hw2.tex and commit it.

7. Look at the formula for the quadratic equation for the solution x_1.
   For fixed a and c, how do the magnitudes of terms in the numerator compare
   as b gets large?  Put your answer in the file hw2.tex and commit it.

8. Given your analysis in 7, discuss what you think is happening in the finite
   precision calculation of x_1?  Put your answer in the file hw2.tex and commit
   it.

9. Modify your code to fix the problem.  Hint: use the expression you found in
   Question 5.  Commit your fixed source file, and an updated roots.txt file.

Grading criteria:
i. Good incremental use of git with organised commits and useful messages.
ii. Correct answers, proofs and observations.
iii. Working out shown.

### Need Help? ###

Questions? Don't forget to use our piazza message
board! https://piazza.com/utexas/fall2017/sds335394 and also you can contact UV
Yadav udaivir.yadav@utmail.utexas.edu, Anne Bowen adb@tacc.utexas.edu or Damon
McDougall dmcdougall@tacc.utexas.edu
