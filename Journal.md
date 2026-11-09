Corporate Merger Simulator Journal

Phase 1: The Company Model & The Market

How does the PriorityQueue know which company is the smallest?

The PriorityQueue knows which company is the smallest because I made my Company class implement Comparable. I used the compareTo() method to compare the sizes of two companies. This allows Java to automatically put the smallest company at the front of the queue.

If we wanted to merge the largest companies first instead of the smallest, what would we change?

I would change the compareTo() method so that it compares the sizes in reverse order. This would make the largest company come out of the PriorityQueue first instead of the smallest.

Challenges:

One thing I had to understand was how Java compares objects instead of just numbers. Implementing Comparable allowed me to tell Java how to compare Company objects using their sizes.

-----------------

Phase 2: The Merger Logic

Why is a PriorityQueue more efficient than using an ArrayList and sorting it inside the loop?

A PriorityQueue is more efficient because it automatically keeps track of the smallest company. I don't have to sort the entire list every time I want to find the two smallest companies. I can simply use poll() to remove them.

What is the time complexity of adding an item to a PriorityQueue versus sorting a whole list?

Adding an item to a PriorityQueue takes O(log N) time. Sorting an entire list takes O(N log N) time. This makes the PriorityQueue a better choice for this program because companies are constantly being added and removed.

Challenges:

One thing I had to understand was how to remove two companies, calculate their combined size with 10% synergy, and then add the new company back into the queue. The while loop allows this process to repeat automatically.
