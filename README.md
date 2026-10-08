# Recursion and Binary Search Trees (Java)

A Maven project with recursion exercises and a binary search tree. Some classes came with the assignment and some are my own work.

## What is inside

| File | What it is |
|---|---|
| `recursionexample/RecursionExercises.java` | My solutions: recursive factorial, iterative factorial, recursive Fibonacci, recursive array sum with a helper, and recursive string reverse |
| `BSTExercises.java` | The optional task: `fromArray` builds a binary search tree by inserting the values of an array in order |
| `BST.java` and `Tree.java` | The generic binary search tree and its base class, provided with the assignment |
| `TestBST.java` | Builds a tree and prints its inorder, preorder, and postorder traversals |
| `recursionexample/Linear.java` and `NonLinear.java` | Provided examples of linear recursion (factorial) and non linear recursion (Fibonacci) |
| `pom.xml` | The Maven setup (Java 17) |

## How to run

In IntelliJ, open the folder that contains `pom.xml`. Maven imports the project automatically. Then run `TestBST`, `recursionexample.Linear`, or `recursionexample.NonLinear`.

From the command line, with JDK 17 or newer:

```
javac -d out $(find src -name '*.java')
java -cp out TestBST
java -cp out recursionexample.Linear 6
java -cp out recursionexample.NonLinear 10
```

`Linear` and `NonLinear` take an optional number to work on.

## Sample results

`RecursionExercises` gives these answers: factorial of 5 is 120, the 10th Fibonacci number is 55, the sum of 1, 2, 3, 4 is 10, and "abc" reversed is "cba".
