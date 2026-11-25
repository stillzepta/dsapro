import java.util.*;

public class Codefile {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    static int question2(Node head){
        if(head == null) {
            return 0;
        }
        return 1 + question2(head.next);
    }
    static void question8(Node head, int k) {
        if(head == null) {
            return;
        }
        if(head.next.data == k) {
            head.next = head.next.next;
            return;
        }
        if(head.data == k) {
            head = head.next;
            return;
        }
        question8(head.next, k);
        

    }
    static Node question9(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return slow;
             }
        } return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;
        for(int i = 0; i < n; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        int k = sc.nextInt();
        question8(head, k);
        int length = question2(head);
        System.out.println(length);      
        sc.close();
    }
}
