package Package1;

public class reverseListNode {
    
    
    /***
     * 循环方法实现链表反转
     * reverseListNodeWithIterative
     * @param head
     * @return
     */
    public ListNode reverseListNodeWithIterative(ListNode head){
        if(head ==null || head.next==null){
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    
    /***
     * 递归方法实现链表反转
     * reverseListNodeWithRecursive
     * @param head
     * @return
     */
    public ListNode reverseListNodeWithRecursive(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode nextNode = head.next;
        ListNode newHead = reverseListNodeWithRecursive(head);
        nextNode.next = head;
        head.next = null;
        return newHead;
    }





}