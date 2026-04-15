# CS2334_FinalProject_Sp2026
Research4All : CS2334 - Final Project

Spring 2026


Problem Statement

Recursion and iteration are two fundamental approaches to problem-solving in computer
science. While recursion often provides elegant and readable solutions, it carries signiﬁcant
overhead due to the Java Virtual Machine (JVM) call stack. Iteration is generally more
memory-efficient but can be more complex to implement for certain logic. Your task is to
investigate:
“At what input size does the overhead of recursion make an iterative approach signiﬁcantly
more efficient in practice?”

Assignment Components:
1. Literature Review:
	• Each team will ﬁnd articles/resources that explain the theoretical trade-offs between
		recursion and iteration, including the mechanics of the JVM Call Stack.
	• As a team, discuss and summarize what the theory says about the relative
		performance, memory limits (stack overﬂow), and the "cost" of a method call.

3. Implementation:
	a) Write your own implementations of the following algorithm, both Recursively and
	Iteratively.
		I. Fibonacci Sequence
		II. Factorial
		III. Binary Search
		IV. Fast Exponentiation(xn )
	b) Write code to experiment and test these three algorithm pairs: For each algorithm:
		I. Run experiments with speciﬁc input sizes: [5k,10k, 30k, 50k, 70k,100k].
		II. Record the runtime using System.nanoTime().
		III. Run each experiment multiple times (at least 10 times) and average the results for fairness.
		IV. Identify the "Recursion Cliff": Note the input size where a StackOverﬂowError occurs for recursive versions.
		V. Plot results in charts/graphs (Time vs. Input Size) to visualize trends.

4. Analyze the theoretical expectations with your experimental results. Discuss:
	I. When does the iterative implementation signiﬁcantly outperform the recursive one?
	II. Is there a "small-input" range where recursion is actually faster or comparable?
	III. Do your results align with the theory of the JVM Call Stack?
	IV. What were the speciﬁc limits of your system before recursion failed?

5. Deliverables
	I. Code: Submit your full Java implementations and experimental driver programs.
	II. Poster: Create a visually clear, creative poster that includes:
		• Introduction & motivation (why we care about this comparison).
		• Literature review (summary of theoretical trade-offs and JVM stack mechanics).
		• Methodology (the algorithms and input sizes tested).
		• Graphs/Charts of your comparative results showing the performance curves.
		• Key Conclusions: Under what circumstances should a developer prefer iteration over recursion?

6. Timeline
Week Dates Milestones

Week 1 Mar 09 – Mar 13 Teams formed; read and summarize articles on recursion vs. iteration.

Week 2 Mar 16 – Mar 20 Spring Break: (Optional) Review iterative logic for selected algorithms.

Week 3 Mar 23 – Mar 27 Begin coding recursive and iterative versions for the given algorithms.

Week 4 Mar 30 – Apr 03 Complete the Java programs for all algorithms and verify correctness.

Week 5 Apr 06 – Apr 10 Finalize all code implementations and debugging.

Week 6 Apr 13 – Apr 17 Run experiments for input sizes & record average times.

Week 7 Apr 20 – Apr 24 Finalize data collection; analyze results and identify failure points.

Week 8 Apr 27 – May 01 Create plots/charts and finalize the research poster and report.

Final May 07 OR 08 Final Submission of Code & Poster Presentation
