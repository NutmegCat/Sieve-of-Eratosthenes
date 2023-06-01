# **Sieve of Eratosthenes**

## Instructions
---


### What is the *Sieve of Eratosthenes*

<br>

- The *Sieve of Eratosthenes* is the name given to an algorithm (An algorithm is a set of instructions for performing some process in a finite number of steps.)for finding prime numbers (natural numbers having exactly two distinct natural number divisors, one and themselves). The sieve starts by considering all numbers greater than one as possible primes. 

> 2 3 4 5 6 7 8 9 10 11 12 13 14 15 ...

- The first number in this list, 2, must be prime but all multiples of two cannot be prime and hence can be eliminated from the list to give us

> 2 3 ~~4~~ 5 ~~6~~ 7 ~~8~~ ~~9~~ 10 11 ~~12~~ 13 ~~14~~ 15 ...

- The next number still in the list, 3, must also be prime since it was not eliminated when we found multiples of two. We can, however, eliminate all multiples of three to obtain

> 2 3 ~~4~~ 5 ~~6~~ 7 ~~8~~ ~~9~~ ~~10~~ 11 ~~12~~ 13 ~~14~~ 15 ...

- In the algorithm, this process continues (eliminating multiples of five, seven, and so on) until it is no longer possible to eliminate any multiples of values left in the table. The values that remain must all be primes.

## Objective
---
<br>

- Write a program to implement Eratosthenes' Sieve. The program should ask the user for an upper bound and should then print all the prime numbers less than or equal to that upper bound. In your program, use a boolean array to maintain a record of the numbers that are possible primes. The output should have eight values per line. 

<br>

- Has In.java
- Used Java version 1.2 ~~(*is updated though*)~~

### Criteria
- Fully functional program that meets the requirements
- Validation that meets the requirements
- Appropriate comments
- Efficient use of programming class time

<br></br>

***Made on May 2nd, 2023***\
***By: Aaron Prince Anu***


<sub>*Temporary?*</sub>