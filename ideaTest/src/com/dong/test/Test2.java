package com.dong.test;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Test2 {
    public static void main(String[] args) {


        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;


        ListNode listNode = FindKthToTail(node1, 7);
        System.out.println(listNode.val);
    }

    private static ListNode FindKthToTail(ListNode head, int k) {

        if (head == null || k <= 0) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        if (stack.size() < k) {
            return null;
        } else {
            for (int i = 0; i < k - 1; i++) {
                stack.pop();
            }
        }
        return stack.pop();
    }
}





