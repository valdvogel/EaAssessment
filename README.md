# EaAssessment

This application solve this problem:

Imagine you are on a driving trip in a rectangular grid map - an N x M grid of cells. The top left corner cell of the maze is (0, 0) and the bottom right corner is (N-1, M-1). Each cell making up the maze can be either obstacle which you can’t enter, or an open space cell with a gas station that contains a certain amount of gas. The gas in an open space cell is automatically gathered once you enter that cell, and can only be gathered once. Starting from a cell, you can drive up/down/left/right to adjacent cells with a single step.
Your trip starts from a starting cell and ends in a destiny cell. You know where the starting and destiny cells are, that they are different, and that they are both open space cells. In order to save time, you must drive from the starting cell to the destiny cell taking as few steps as possible. If there are multiple choices for the path you could take, you must choose the one on which you collect as much gas as possible.

## Getting Started

Requirements:
Java 8 installed on machine;

Input:
input.in

Output
output.dat

* Input file should be added in EaAssessment/src/files/input/input.in;
* Output file will be generated in EaAssessment/src/files/output/output.dat;

How to run this application:

```
1. Open you terminal and clone this repo;

2. Goes to folder EaAssessment/src;
	cd EaAssessment/src
	
3. Run the file muzeEA.sh;
	sh muzeEA.sh;
```

Once you run this script the application compile and build the artifacts. 
After that run the application using the input file and generate a result that will be showed on you terminal and output.dat

Example:

```
Sample input.in

4
2 3
0 2 1 0
2 -1 5
3 -1 6
4 4
0 2 3 2
-1 1 1 2
1 1 1 1
2 -1 -1 1
1 1 1 1
2 3
0 2 1 0
2 3 5
3 -1 6
1 2
0 0 0 1
97 68
```

Sample output.dat

```
Case #1: Mission Impossible.
Case #2: 7
Case #3: 13
Case #4: 165
```
