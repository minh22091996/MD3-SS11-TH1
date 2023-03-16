package rikkei;

public class GenericStackClient {
    private static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("nam");
        stack.push("bon");
        stack.push("ba");
        stack.push("hai");
        stack.push("mot");
        System.out.println("size1 la: " + stack.size());
        System.out.println("element1 la :");
        while (!stack.isEmpty()){
            System.out.printf(" %s", stack.pop());
            System.out.println("");
        }
        System.out.println("size1 sau khi xoa la : " + stack.size());
    }
    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push((0));
        System.out.println("size2 la: " + stack.size());
        System.out.println("element2 la :");
        while (!stack.isEmpty()){
            System.out.printf(" %s", stack.pop());
            System.out.println("");
        }
        System.out.println("size2 sau khi xoa la : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("stack cua strings la : ");
        stackOfIStrings();
        System.out.println("stack cua integers la : ");
        stackOfIntegers();
    }
}
