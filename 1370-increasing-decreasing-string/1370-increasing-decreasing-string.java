class Solution {
    public String sortString(String s) {
        PriorityQueue<Character> pq = new PriorityQueue();
        for (char c : s.toCharArray())
            pq.offer(c);
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            PriorityQueue<Character> temp = new PriorityQueue(Collections.reverseOrder());
            sb.append(pq.poll());
            while (pq.peek() != null)
                if (pq.peek() <= sb.charAt(sb.length() - 1))
                    temp.offer(pq.poll());
                else
                    sb.append(pq.poll());
            while (!temp.isEmpty()) {
                sb.append(temp.poll());
                while (temp.peek() != null)
                    if (temp.peek() >= sb.charAt(sb.length() - 1))
                        pq.offer(temp.poll());
                    else
                        sb.append(temp.poll());
            }
        }
        return sb.toString();
    }
}