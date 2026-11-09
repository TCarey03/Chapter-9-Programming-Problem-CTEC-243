Corporate Merger Simulator Journal

Phase 1: The Company Model & The Market

How does the PriorityQueue know which company is the smallest?

The PriorityQueue knows which company is the smallest because I made my Company class implement Comparable. I used the compareTo() method to compare the sizes of two companies. This allows Java to automatically put the smallest company at the front of the queue.

If we wanted to merge the largest companies first instead of the smallest, what would we change?**

I would change the compareTo() method so that it compares the sizes in reverse order. This would make the largest company come out of the PriorityQueue first instead of the smallest.

Challenges:

One thing I had to understand was how Java compares objects instead of just numbers. Implementing Comparable allowed me to tell Java how to compare Company objects using their sizes.
