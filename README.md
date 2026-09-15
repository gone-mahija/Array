# Array

Java Array Mastery Guide
100 Questions with Examples — Fundamentals First, Then Algorithm-Based Problems
This guide is split into two layers for each of 1D and 2D arrays:
Section A — Non-Algorithm-Based: Fundamental problems solvable with plain loops and logic, no named
technique required. Master these first.
Section B — Algorithm-Based: Problems grouped by the specific technique or algorithm they use (Kadane's,
Greedy, Two Pointer, etc.). Each group starts with a short explanation of the concept before its problems, so you
understand the 'why' before attempting the 'how'.
Every question includes a worked example so you know exactly what input/output is expected.
Algorithm / Technique Breakdown
Before you dive into Section B of either part, here's exactly how many questions come from each technique
across the whole guide. Use this to decide what to study first — e.g. if Dynamic Programming has the most
questions, make sure that concept is solid before starting those problems.
Technique / Algorithm # Questions
Dynamic Programming 5
Hashing 4
Two Pointer Technique 4
Graph Traversal (DFS/BFS) 4
Binary Search 4
Sliding Window 3
Kadane's Algorithm 3
Prefix Sum 3
Matrix Traversal 3
Sorting Algorithms 3
Matrix Rotation 2
In-place Matrix Manipulation 2
Cyclic Sort 2
Greedy 2
Moore's Voting Algorithm 1
Dutch National Flag Algorithm 1
Matrix Multiplication 1
Constraint Validation 1
Array Reshaping 1
Searching Technique 1
Total algorithm-based questions: 50 (25 from 1D arrays + 25 from 2D arrays). The remaining 50 questions
(25 per part) are non-algorithm-based fundamentals covered in Section A of each part.
Table of Contents
Algorithm / Technique Breakdown ............................ page 3
PART 1: ONE-DIMENSIONAL ARRAYS
Section A — Non-Algorithm-Based (Q1–Q25)
Section B — Algorithm-Based (Q26–Q50)
PART 2: TWO-DIMENSIONAL ARRAYS
Section A — Non-Algorithm-Based (Q51–Q75)
Section B — Algorithm-Based (Q76–Q100)
PART 1: ONE-DIMENSIONAL ARRAYS (Q1–Q50)
Section A — Non-Algorithm-Based Fundamentals (Q1–Q25)
Q1. Find the largest element in an array.
Example: Input: [3, 7, 2, 9, 4] ® Output: 9
Q2. Find the smallest element in an array.
Example: Input: [3, 7, 2, 9, 4] ® Output: 2
Q3. Calculate the sum of all elements in an array.
Example: Input: [1, 2, 3, 4] ® Output: 10
Q4. Calculate the average of all elements in an array.
Example: Input: [2, 4, 6, 8] ® Output: 5.0
Q5. Print all elements of an array in reverse order.
Example: Input: [1, 2, 3] ® Output: 3 2 1
Q6. Count how many even numbers are in an array.
Example: Input: [1, 2, 3, 4, 5, 6] ® Output: 3
Q7. Count how many odd numbers are in an array.
Example: Input: [1, 2, 3, 4, 5, 6] ® Output: 3
Q8. Find the second largest element in an array.
Example: Input: [3, 7, 2, 9, 4] ® Output: 7
Q9. Find the second smallest element in an array.
Example: Input: [3, 7, 2, 9, 4] ® Output: 3
Q10. Check if an array is sorted in ascending order.
Example: Input: [1, 2, 2, 5] ® Output: true
Q11. Reverse an array in place (without using a second array).
Example: Input: [1, 2, 3, 4] ® Output: [4, 3, 2, 1]
Q12. Copy all elements of one array into another array.
Example: Input: [5, 6, 7] ® Output: copy = [5, 6, 7]
Q13. Find the index of a given element in an array (Linear Search).
Example: Input: [4, 2, 7, 1], target = 7 ® Output: 2
Q14. Count the number of positive numbers in an array.
Example: Input: [-1, 2, -3, 4] ® Output: 2
Q15. Count the number of negative numbers in an array.
Example: Input: [-1, 2, -3, 4] ® Output: 2
Q16. Find the sum of all even numbers in an array.
Example: Input: [1, 2, 3, 4, 5, 6] ® Output: 12
Q17. Find the sum of all odd numbers in an array.
Example: Input: [1, 2, 3, 4, 5, 6] ® Output: 9
Q18. Swap the first and last elements of an array.
Example: Input: [1, 2, 3, 4] ® Output: [4, 2, 3, 1]
Q19. Check whether a given number exists in an array.
Example: Input: [3, 6, 9], target = 6 ® Output: true
Q20. Print the array elements separated by commas.
Example: Input: [1, 2, 3] ® Output: "1,2,3"
Q21. Merge two arrays into a third array.
Example: Input: [1,2], [3,4] ® Output: [1,2,3,4]
Q22. Insert an element at a given position in an array.
Example: Input: [1,2,4,5], insert 3 at index 2 ® Output: [1,2,3,4,5]
Q23. Delete an element from a given position in an array.
Example: Input: [1,2,3,4,5], delete index 2 ® Output: [1,2,4,5]
Q24. Find the frequency of a given element in an array.
Example: Input: [1,2,2,3,2], target = 2 ® Output: 3
Q25. Find all pairs of elements whose sum equals a given target (brute force).
Example: Input: [1,2,3,4], target = 5 ® Output: (1,4), (2,3)
Section B — Algorithm-Based (Q26–Q50)
Each group below starts with a short explanation of the technique. Read it first, then attempt the question(s) that
follow it.
Sorting Algorithms
Basic comparison-based sorting (Bubble, Selection, Insertion) that rearrange elements step by step using nested
loops and swaps. Foundation for understanding how sorting works before using built-in sort().
Q26. Sort an array using Bubble Sort.
Example: Input: [5,2,4,1] ® Output: [1,2,4,5]
Q27. Sort an array using Selection Sort.
Example: Input: [5,2,4,1] ® Output: [1,2,4,5]
Q28. Sort an array using Insertion Sort.
Example: Input: [5,2,4,1] ® Output: [1,2,4,5]
Two Pointer Technique
Uses two indices moving through the array (from both ends, or one ahead of the other) to solve problems in a single
pass instead of nested loops.
Q29. Check if a sorted array has a pair with a given sum.
Example: Input: [1,2,3,4,6], target = 6 ® Output: true (2 + 4)
Q30. Remove duplicates from a sorted array in place.
Example: Input: [1,1,2,2,3] ® Output: [1,2,3]
Q31. Reverse an array using the two-pointer technique.
Example: Input: [1,2,3,4] ® Output: [4,3,2,1]
Q32. Find the container that holds the most water, given bar heights.
Example: Input: [1,8,6,2,5,4,8,3,7] ® Output: 49
Sliding Window
Maintains a 'window' of elements that expands or slides across the array, used for problems about contiguous
subarrays of a fixed size or target sum.
Q33. Find the maximum sum of a subarray of size k.
Example: Input: [2,1,5,1,3,2], k = 3 ® Output: 9
Q34. Find the first negative number in every window of size k.
Example: Input: [12,-1,-7,8,-15,30], k = 3 ® Output: -1 -1 -7 -15
Q35. Find the length of the longest subarray with a sum equal to k.
Example: Input: [1,2,3,7,5], k = 12 ® Output: 3 (subarray [2,3,7])
Kadane's Algorithm
Tracks the best subarray sum ending at each position as you scan the array once, giving an O(n) solution to
maximum-subarray-type problems.
Q36. Find the maximum sum of a contiguous subarray.
Example: Input: [-2,1,-3,4,-1,2,1,-5,4] ® Output: 6 (subarray [4,-1,2,1])
Q37. Find the maximum sum of a circular subarray.
Example: Input: [5,-3,5] ® Output: 10 (wrap-around: 5 + 5)
Prefix Sum
Precomputes cumulative sums so the sum of any subarray/submatrix can be answered in O(1) after one O(n) pass
of preprocessing.
Q38. Find the equilibrium index of an array (sum of left equals sum of right).
Example: Input: [-7,1,5,2,-4,3,0] ® Output: 3
Q39. Answer multiple range-sum queries efficiently using a prefix sum array.
Example: Input: [1,2,3,4,5], query(1,3) ® Output: 9 (2+3+4)
Hashing
Uses a HashSet/HashMap to remember seen elements or frequencies, turning an O(n²) nested-loop search into an
O(n) lookup-based one.
Q40. Find the missing number in an array containing 1 to N.
Example: Input: [1,2,4,5], N = 5 ® Output: 3
Q41. Find the element that appears only once while all others appear twice.
Example: Input: [4,1,2,1,2] ® Output: 4
Q42. Find the intersection of two arrays.
Example: Input: [1,2,3], [2,3,4] ® Output: [2,3]
Q43. Find the union of two arrays.
Example: Input: [1,2,3], [2,3,4] ® Output: [1,2,3,4]
Moore's Voting Algorithm
An O(n) time, O(1) space technique to find the majority element (appearing more than n/2 times) using a running
candidate and a counter.
Q44. Find the majority element in an array (appears more than n/2 times).
Example: Input: [2,2,1,1,1,2,2] ® Output: 2
Dutch National Flag Algorithm
A single-pass, three-pointer technique to sort an array of only 0s, 1s, and 2s without extra space or a full sort.
Q45. Sort an array containing only 0s, 1s, and 2s in a single pass.
Example: Input: [0,1,2,0,1,2] ® Output: [0,0,1,1,2,2]
Cyclic Sort
Places each number at its 'correct' index (value == index) in one pass — ideal when array values are known to be in
a fixed range like 1 to N.
Q46. Find the missing number in an array of 1 to N using Cyclic Sort.
Example: Input: [3,1,2,5], N = 5 ® Output: 4
Q47. Find the duplicate number in an array using Cyclic Sort.
Example: Input: [1,3,4,2,2] ® Output: 2
Greedy
Makes the best-looking choice at each step without reconsidering past decisions, aiming for a globally good (often
optimal) result.
Q48. Find the maximum profit from buying and selling a stock once.
Example: Input: [7,1,5,3,6,4] ® Output: 5 (buy at 1, sell at 6)
Q49. Check if you can reach the last index of an array (Jump Game).
Example: Input: [2,3,1,1,4] ® Output: true
Binary Search
Repeatedly halves a sorted search space to find a target in O(log n) time; also adaptable to matrices and 'search
the answer' problems.
Q50. Search for a target value in a rotated sorted array.
Example: Input: [4,5,6,7,0,1,2], target = 0 ® Output: index 4
PART 2: TWO-DIMENSIONAL ARRAYS (Q51–Q100)
Section A — Non-Algorithm-Based Fundamentals (Q51–Q75)
Q51. Print all elements of a 2D array (row by row).
Example: Input: [[1,2],[3,4]] ® Output: 1 2 / 3 4
Q52. Find the sum of all elements in a 2D array.
Example: Input: [[1,2],[3,4]] ® Output: 10
Q53. Find the largest element in a 2D array.
Example: Input: [[1,9],[3,4]] ® Output: 9
Q54. Find the smallest element in a 2D array.
Example: Input: [[1,9],[3,4]] ® Output: 1
Q55. Find the sum of each row of a 2D array.
Example: Input: [[1,2],[3,4]] ® Output: [3, 7]
Q56. Find the sum of each column of a 2D array.
Example: Input: [[1,2],[3,4]] ® Output: [4, 6]
Q57. Print the transpose of a matrix.
Example: Input: [[1,2],[3,4]] ® Output: [[1,3],[2,4]]
Q58. Check whether a given matrix is a square matrix.
Example: Input: [[1,2],[3,4]] ® Output: true
Q59. Print the diagonal elements of a square matrix.
Example: Input: [[1,2],[3,4]] ® Output: 1 4
Q60. Find the sum of the diagonal elements of a square matrix.
Example: Input: [[1,2],[3,4]] ® Output: 5
Q61. Print a 2D array in reverse row order.
Example: Input: [[1,2],[3,4]] ® Output: [[3,4],[1,2]]
Q62. Print a 2D array column by column.
Example: Input: [[1,2],[3,4]] ® Output: 1 3 / 2 4
Q63. Add two matrices of the same size.
Example: Input: [[1,2],[3,4]] + [[5,6],[7,8]] ® Output: [[6,8],[10,12]]
Q64. Subtract two matrices of the same size.
Example: Input: [[5,6],[7,8]] - [[1,2],[3,4]] ® Output: [[4,4],[4,4]]
Q65. Check if two matrices are equal.
Example: Input: [[1,2]], [[1,2]] ® Output: true
Q66. Count the number of even and odd elements in a 2D array.
Example: Input: [[1,2],[3,4]] ® Output: Even = 2, Odd = 2
Q67. Find the sum of the boundary (border) elements of a matrix.
Example: Input: [[1,2,3],[4,5,6],[7,8,9]] ® Output: 40
Q68. Copy one 2D array into another 2D array.
Example: Input: [[1,2],[3,4]] ® Output: copy = [[1,2],[3,4]]
Q69. Find the row with the maximum sum in a 2D array.
Example: Input: [[1,2],[9,1]] ® Output: row 1 (sum = 10)
Q70. Find the column with the maximum sum in a 2D array.
Example: Input: [[1,9],[2,1]] ® Output: column 1 (sum = 10)
Q71. Check whether a matrix is symmetric.
Example: Input: [[1,2],[2,1]] ® Output: true
Q72. Check whether a matrix is an identity matrix.
Example: Input: [[1,0],[0,1]] ® Output: true
Q73. Find the sum of the upper triangular elements of a matrix.
Example: Input: [[1,2,3],[4,5,6],[7,8,9]] ® Output: 11 (2+3+6)
Q74. Find the sum of the lower triangular elements of a matrix.
Example: Input: [[1,2,3],[4,5,6],[7,8,9]] ® Output: 19 (4+7+8)
Q75. Check whether a matrix is sparse (majority of elements are zero).
Example: Input: [[0,0,3],[0,0,0],[0,4,0]] ® Output: true
Section B — Algorithm-Based (Q76–Q100)
Matrix Multiplication
The standard triple-nested-loop technique for multiplying two compatible matrices, row by column.
Q76. Multiply two matrices.
Example: Input: [[1,2],[3,4]] × [[5,6],[7,8]] ® Output: [[19,22],[43,50]]
Matrix Rotation
In-place techniques (layer-by-layer, or transpose + reverse) to rotate a matrix without allocating a second matrix.
Q77. Rotate a matrix by 90 degrees clockwise, in place.
Example: Input: [[1,2],[3,4]] ® Output: [[3,1],[4,2]]
Q78. Rotate a matrix by 90 degrees counter-clockwise.
Example: Input: [[1,2],[3,4]] ® Output: [[2,4],[1,3]]
Matrix Traversal
Non-standard visiting orders for matrix elements (spiral, zigzag, diagonal) using carefully tracked boundaries or
direction changes.
Q79. Print a matrix in spiral order.
Example: Input: [[1,2,3],[4,5,6],[7,8,9]] ® Output: 1 2 3 6 9 8 7 4 5
Q80. Print all elements of a matrix in zigzag order.
Example: Input: [[1,2,3],[4,5,6]] ® Output: 1 2 3 6 5 4
Q81. Print a matrix in diagonal order.
Example: Input: [[1,2,3],[4,5,6],[7,8,9]] ® Output: 1 2 4 7 5 3 6 8 9
Binary Search
Repeatedly halves a sorted search space to find a target in O(log n) time; also adaptable to matrices and 'search
the answer' problems.
Q82. Search for a given element in a matrix that is sorted row-wise and column-wise.
Example: Input: sorted matrix, target = 5 ® Output: found at (1,1)
Q83. Search for a target in a matrix that is fully sorted (treat rows as one sorted sequence).
Example: Input: [[1,3,5],[7,9,11]], target = 9 ® Output: true
Q84. Find the median of a row-wise sorted matrix.
Example: Input: [[1,3,5],[2,6,9],[3,6,9]] ® Output: 5
Prefix Sum
Precomputes cumulative sums so the sum of any subarray/submatrix can be answered in O(1) after one O(n) pass
of preprocessing.
Q85. Find the sum of any given submatrix efficiently using a 2D prefix sum array.
Example: Input: matrix + region (1,1)-(2,2) ® Output: sum of that region
Kadane's Algorithm
Tracks the best subarray sum ending at each position as you scan the array once, giving an O(n) solution to
maximum-subarray-type problems.
Q86. Find the maximum sum rectangle in a 2D matrix (2D Kadane's Algorithm).
Example: Input: small matrix of mixed +/- values ® Output: 29 (best rectangle sum)
In-place Matrix Manipulation
Modifying a matrix directly without extra space — usually the harder, memory-efficient version of a simpler problem.
Q87. Set an entire row and column to zero if an element in the matrix is zero.
Example: Input: [[1,1,1],[1,0,1],[1,1,1]] ® Output: [[1,0,1],[0,0,0],[1,0,1]]
Q88. Interchange the diagonals of a square matrix.
Example: Input: [[1,2,3],[4,5,6],[7,8,9]] ® Output: main and anti-diagonal values swapped
Graph Traversal (DFS/BFS)
Treats grid cells as graph nodes and adjacent cells as edges, using Depth-First or Breadth-First Search to explore
connected regions or find shortest paths.
Q89. Find the number of islands in a binary grid.
Example: Input: grid of 1s (land) and 0s (water) ® Output: 3 islands
Q90. Perform a flood fill operation on a matrix starting from a given cell.
Example: Input: grid, start = (1,1), new color = 2 ® Output: updated grid
Q91. Find the shortest path in a binary matrix from top-left to bottom-right.
Example: Input: 3x3 grid of 0s ® Output: 4 (path length)
Q92. Count the number of distinct island shapes in a grid.
Example: Input: grid with two islands of the same shape ® Output: 1 distinct shape
Dynamic Programming
Breaks a problem into overlapping subproblems and stores/reuses results (memoization or tabulation) to avoid
recomputation — common in grid path and optimization problems.
Q93. Find the number of unique paths from top-left to bottom-right, moving only right or down.
Example: Input: 3x3 grid ® Output: 6
Q94. Find the number of unique paths in a grid that contains obstacles.
Example: Input: grid with one obstacle ® Output: 2
Q95. Find the minimum path sum from top-left to bottom-right of a grid.
Example: Input: [[1,3,1],[1,5,1],[4,2,1]] ® Output: 7
Q96. Find the largest square of 1s in a binary matrix (Maximal Square).
Example: Input: binary matrix ® Output: 4 (area of largest square)
Q97. Find the longest increasing path in a matrix.
Example: Input: [[9,9,4],[6,6,8],[2,1,1]] ® Output: 4
Constraint Validation
Iterates through a structure while tracking rules with sets/hashmaps to confirm it satisfies a defined set of
constraints (e.g. a valid Sudoku board).
Q98. Check whether a given 9x9 Sudoku board is valid.
Example: Input: partially filled 9x9 board ® Output: true / false
Array Reshaping
Converts data between array dimensions/shapes while preserving the original element order.
Q99. Convert (reshape) a 1D array into a 2D array of given dimensions.
Example: Input: [1,2,3,4], rows = 2, cols = 2 ® Output: [[1,2],[3,4]]
Searching Technique
Finds elements with a specific structural property (like a saddle point) using a smarter traversal instead of
brute-force nested loops.
Q100. Find the saddle point of a matrix (minimum in its row, maximum in its column).
Example: Input: [[3,2,1],[6,5,4],[9,8,7]] ® Output: 3 (row 0, col 0)
How to Use This Guide
• Finish Section A of Part 1 (1D fundamentals) completely before touching Section B.
• In Section B, read the concept box, then try the question(s) under it — don't skip straight to code.
• Use the Algorithm Breakdown table at the front to decide which concept to review on YouTube first (the ones
with more questions are worth understanding deeply).
• For every question, trace through the given example by hand before coding — write out what happens step by
step.
• After solving with help, wait 2 days and re-solve without looking, exactly as you planned.
