import binarytree.BinaryTree;
import graph.Graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @param <T>
 * @author Suranjan Poudel
 */
public class QuestionAnswers<T> {
    /**
     * Q5
     * 9. Using Java, implement a function that deletes duplicate value nodes from the list. (8 marks)
     */
    public List<T> removeDuplicates(List<T> givenList) {
        return givenList.stream().distinct().collect(Collectors.toList());
    }

    /**
     * Q6
     * 10. Implement a function that inserts a node in a given binary tree. (8 marks)
     */
    public void binaryTree() {
        Integer[] a = {7, 4, 20, 3, 22, 8, 9};
        BinaryTree.MyComparator<Integer> myComparator = (x, y) -> x - y;
        BinaryTree<Integer> tree = new BinaryTree<>(myComparator);
        for (Integer n : a) tree.insert(n);
        tree.preOrderTraversal();
    }

    /**
     * Q7
     * 11. Implement an unweighted, undirected graph structure in the programming language of your choice.
     * Implement the BFS or DFS traversal for this graph. (6 marks)
     */
    public void graph() {
        Graph<String> graph = new Graph<>();
        graph.joinVertex("Suranjan", "Developer");
        graph.joinVertex("Suranjan", "Student");
        graph.joinVertex("Samundra", "Developer");
        graph.joinVertex("Developer", "Backend");
        graph.joinVertex("Developer", "Frontend");
        graph.joinVertex("Student", "School");
        graph.joinVertex("Cow", "Barn");
        graph.BFS("Suranjan");
    }

    /**
     * Q1
     * 1. Write a method to reverse the characters from a string. (4 marks)
     * 2. Write the pseudocode for finding duplicate values in an array. (4 marks)
     */
    public void reverseString(String word) {
        System.out.println(new StringBuilder().append(word).reverse());
    }

    public void findDuplicates(T[] arr) {
        Map<T, Integer> dupMap = new HashMap<>();
        T dup;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(-1)) continue;
            dup = arr[i];
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (dup == arr[j]) {
                    count++;
                }
            }
            if (count > 0) dupMap.putIfAbsent(dup, count);
        }
        dupMap.forEach((key, value) -> System.out.println(key + " has " + value + " duplicate(s)"));
    }

    /**
     * Q2
     * 3. Read the degree of two polynomials and their coefficients, all integers, from the standard input. The polynomial is of the form ( ) = ∗ + ⋯ + 1 ∗ 1 + , where 0 ≠ 0.
     * a. Write the pseudocode for adding two polynomials. (4 marks)
     * 4. Write the pseudocode and code for a function that determines whether given word is palindrome. What is the time complexity (expressed using BigO notation)? (4 marks)
     */
    public void degreeOfPolynomialsAndAddThem(String polA, String polB) {

    }

    /**
     * Q3
     * 5. Write a program that accepts a string and return the reversed string using recursive function. (4 marks)
     * 6. Write a recursive version of linear search on an array of integers. What is the time complexity of the algorithm? Use the BigO notation to express it. (4 marks)
     */

    /**
     * Q4
     * 7. Implement a function to search an element in sequence using binary search. (4 marks)
     * 8. Use binary search in implementing a guessing game. One thinks of a number between 1 and 20000, the program attempts to guess the number and feedback is given whether my number is higher or lower. The program then makes a new guess and so on until it guesses the right number. (4 marks)
     */

    public static void main(String[] args) {
        QuestionAnswers<Integer> questionAnswers = new QuestionAnswers<>();

        questionAnswers.reverseString("Suranjan");

        questionAnswers.findDuplicates(new Integer[]{1, 2, 33, 1, 3, 2, 1, 3});
    }
}
