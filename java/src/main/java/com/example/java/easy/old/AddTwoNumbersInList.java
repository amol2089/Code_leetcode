package com.example.java.easy.old;

import com.example.java.easy.commonClass.*;
//Add javadocs
/**
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order, and each of their nodes contains a single digit. 
 * Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
2-->4-->3
5-->6-->4
----------
7-->0-->8

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbersInList {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int carry=0;

        while(l1!=null || l2!=null || carry>0){
            if(l1!=null){
                carry+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                carry+=l2.val;
                l2=l2.next;
            }
            curr.next=new ListNode(carry%10);
            carry/=10;
            curr=curr.next;
        }
        return dummy.next;
    }


    public static void main(String[] args) {
       
        
    }
   
}
