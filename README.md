# Assignment 2 — Stack and Queue (DS-3, Sections A & B)

## Question 1: Stack using an Array
Implemented Push, Pop, Peek, Display, Stack Overflow, and Stack Underflow.

## Question 2: Stack Operations

| Operation | Stack (bottom → top) |
|---|---|
| Initially empty | `[]` |
| Push(10) | `[10]` |
| Push(20) | `[10, 20]` |
| Push(30) | `[10, 20, 30]` |
| Pop() | `[10, 20]` |
| Push(40) | `[10, 20, 40]` |
| Pop() | `[10, 20]` |

Final Stack: `[10, 20]`  
Top Element: `20`

## Question 3: Queue using an Array
Implemented Enqueue, Dequeue, Front, Display, Queue Overflow, and Queue Underflow.

## Question 4: Queue Operations

| Operation | Queue (front → rear) |
|---|---|
| Initially empty | `[]` |
| Enqueue(10) | `[10]` |
| Enqueue(20) | `[10, 20]` |
| Enqueue(30) | `[10, 20, 30]` |
| Dequeue() | `[20, 30]` |
| Enqueue(40) | `[20, 30, 40]` |
| Dequeue() | `[30, 40]` |

Final Queue: `[30, 40]`  
Front Element: `30`

## How to Run

Compile and run the Stack program:

```bash
javac StackAssignment.java
java StackAssignment
```

Compile and run the Queue program:

```bash
javac QueueAssignment.java
java QueueAssignment
```
