package Package1;

public class addListNode {




/**
 * 1.链表插入元素：【种类】【方法】【代码实现】
 * 根据位置插入，根据元素值插入。
 * 
 * 
 */



   
    /***
     * 将某个元素插入排序链表中(位置有插入节点值大小决定)
     * @param head
     * @param target
     * @return
     */
    public ListNode insetNode(ListNode head,int target){
        ListNode targetNode = new ListNode(target,null);//decided by the way you create the ListNode
        if(head == null || target<=head.value){
            targetNode.next = head;
            return targetNode;
        }
        ListNode cur = head;
        while(cur!=null){
            if(cur.next ==null || target>=cur.next.value){
                targetNode.next = cur.next;
                cur.next = targetNode;
            }
            cur = cur.next;
        }
        return head;
    }




}