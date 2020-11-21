import java.util.Stack;

public class resortStack {
    private static Stack<Integer> help;

    public resortStack() {
        this.help = new Stack<>();
    }

    public static void sortStackByStack(Stack<Integer> stack){
        while (!stack.isEmpty()){
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() < cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()){
            stack.push(help.pop());
        }
    }
}
