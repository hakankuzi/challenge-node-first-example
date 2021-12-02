# challenge-node-first-example

The programming challenge:
Imagine an application that is deployed in 10 nodes. A node is a
separate JVM process, potentially can be running on different physical
machine.
Write an application that will be running on 10 nodes. The application
need to coordinate among the nodes and make sure that one and only one
of them does a System.out.println("We are started!"). Note that not all 10
nodes shall start at the same time.
It is possible that some will start couple of seconds/minutes later.
Some will not at all. Still we want this message to be printed and only
once.
You can use an existing library for the solution. No need to build a distributed
system from scratch.(spring cloud will be preferred) Providing an elegant
solution to the problem is what we seek.


1 - As a solution I implemented hazelcast library for this challenge. It is really easy to manage communication between each nodes 
