[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/srXK_DK4)
# CS230X-assignment7-F24
# Sorting things out 

## Goals
* Better understanding of the Big-Oh algorithmic performance
* Working with different sorting algorithms
* Comparison of various sorting algorithms on random data
* Get experience writing a research report on experimental findings
* Have fun!

## Exercise: Compare and Plot the runtimes of sorting algorithms
* In this exercise, you are given a set of four sorting algorithms (insertionSort, selectionSort, mergeSort, quickSort). 
* Your goal is to create a driver program (client) to study their performance when they are used on a randomly-generated set of `n` data items.
* Once you complete the measurements, you need to write a short report explaining your findings.

* Recall that in Big-O notation we are interested in the relationship of the runtime of the algorithm **asymptotically** to the **size of the input (n)**
That is, we are interested in what happens to the running time of an algorithm as *n* changes and gets bigger and bigger. 
You will run  experiments to measure the actual running times of these famous sorting algorithms when used with a variety of data input sizes.

**How to start?**
To start, download the starter code, which contains several files and libraries. 

The two relevant java files are:
1. `Sorting.java`, which contains the five sorting algorithms already implemented for you. You are not required to investigate the algorithms already implemented in that code, but if you are curious, we are always here to answer any questions :) Also, you can find a detailed description of (most of) these algorithms in Chapter 13 of your textbook.
2. `SortingComparisons.java`, which is the starter file you will be mainly working with.

In the downloaded folder you will also find a template spreadsheet (.xls file) which you can use to collect your data. It has been populated with place-holder values (highlighted in yellow). Record your results and you will see the graphs drawn for you (or you can draw them the way you want.)

**What to do?**

Remember, your task is to study how long it
takes the sorting algorithms mentioned above to work on various sizes of data.

**Step 1**

In your client code, you have a helper method that generates arrays of **random Integers** of various lengths. Each element is a randomly chosen number among all positive Integer values. Use this method to generate sets of Integers (input) of varying lengths, starting at 10K. Then, test each of the sorting algorithms on these sets of Integers. With each test, make sure to record how long it took for each algorithm to complete the task, and record it in a spreadsheet (details below). The goal with varying the input sizes in all of these experiments is to be able to witness a trend that represents the big-O complexity of these algorithms.

`How to measure actual running time?` Use code similar to this, to measure how long each algorithm run takes:

```
long start = System.nanoTime(); //start counting time
// The code you want to time goes here
long end = System.nanoTime(); //end counting time
long durationInNanoseconds = end - start;
```

(Remember that a nanosecond is one billionth (1/10^9) of a second. You may want to convert durations to milliseconds or seconds as appropriate.)

**Step 2**

Collect your timing data and save it in the spreadsheet you downloaded.  Then, use  this data to create charts of the running time of each algorithm, as the input size increases.

Write up a short report in a file named `BigO_Sorting_Analysis.pdf`. In that report, include your measured data, as well as any charts that help us understand their performance visually. Make sure you include your name(s) in the report and you give it a title.

Describe the results of your overall experiment, and relate these results to what you know about the Big-O complexity of these algorithms. In particular: 
* Do the results you get make sense and are as you expected?
* What are the theoretical worst-case running times you were expecting?
Did you observe them in your experiments? Why or why not?
* Were there any surprises?
* Can you see the logarithmic, linear, linearithmic (nlogn) and quadratic trends in your data, according to what we discussed in class?

Consider this as a research paper, because it is a research paper!


## SAVING YOUR WORK ON GITHUB
As we have discussed in class, it is important to work on labs and assignments regularly and save frequently. You should test your work incrementally, which will require you to save your file before compiling/running it. In addition to saving your work on your local machine, you should also frequently push your work to this Github repository. You can refer to Lab0 and the [Git and Github tutorial](https://github.com/CS230X-F24/github-starter-course) for a refresher on using these tools. 

## SUBMITTING TO GRADESCOPE
Turn in your work submitting files SortingComparisons.java, sortingAnalysisDataPlotting.xlsx, and BigO_Sorting_Analysis.pdf to your Gradescope account for Assignment 7. [Click here for Gradescope instructions.](https://docs.google.com/document/d/1zGAJrbdAhfPZVlyDP9N3MmdKXWvNo7rQqehKNM5Q0_M/edit) 

## AUTOGRADER
When you submit your assignment to Gradecope, you will not immediately see feedback. You are welcome to resubmit as many times as you wish until the deadline but you will only receive feedback after the grades have been published. The autograder will check for accuracy, style, and documentation. Make sure there are no remaining `TODO` comments in your submission code. Click here for 230X instructions on: [testing your code](https://docs.google.com/document/d/19cKOyolT8UtSfMNrVw8MGgVWS-lYgHpBs8g2Cf_8Vvc/edit#heading=h.rt39ohf1jp6s), [styling your code](https://docs.google.com/document/d/14uwj9HAjNKfFBm0ZjUpWR7jdqKSj13rudIEJaG74mPk/edit), and [documenting your code](https://docs.google.com/document/d/15uqs_NH8y2sAuLLpiZuSxlI0UsL6a8CHuWY_qcvF4B4/edit). 

## ASSIGNMENT SOLUTIONS
Assignment solutions will not be shared. If you did not get full credit on the assignment, you should review the feedback and ask me or the TAs if you have further questions.   
