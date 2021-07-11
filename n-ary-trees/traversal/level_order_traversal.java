/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> output = new ArrayList<>();
        if (root==null) return output;
        
        LinkedList<Node> stack = new LinkedList<>();
        
        
        stack.add(root);
        
        while(!stack.isEmpty()){
            List<Integer> output_temp = new ArrayList<>();
            
            int size = stack.size();
            for(int i=0; i<size; ++i){
                Node node = stack.poll();
                output_temp.add(node.val);
                stack.addAll(node.children);
            }
            output.add(output_temp);
        }
        return output;
        
        
    }
}