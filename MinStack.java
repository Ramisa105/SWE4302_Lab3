import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
                  minStack.push(x);
        }
    }


    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        }

        int poppedValue = stack.pop();

        if (poppedValue == minStack.peek()) {
            minStack.pop();
        }
    }

    public int min() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
        }
        return minStack.peek();
    }
}

