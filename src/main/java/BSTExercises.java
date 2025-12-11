/**
 * Optional / extra credit: BST helper methods.
 */
public class BSTExercises {



    /**
     * Builds a BST<Integer> by inserting the elements of the array in order.
     * See the assignment handout for the expected behavior.
     */
    public static BST<Integer> fromArray(int[] values) {
        // TODO: implement Task 11 (optional)
        if (values == null)
            throw new IllegalArgumentException("Array cannot be null");

        BST<Integer> tree = new BST<>();
        for (int v : values) {
            tree.insert(v);
        }
        return tree;
    }
}