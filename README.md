algorithmTest
=============

Algorithm to rotate N positions one array

=============

I have tested by 3 differents ways.

First with an ArrayList. It uses an array inside him, is an array's wrapper. But is more easy to use because, as a wrapper, it has a lot of useful methods to work.
Then I've tried with a simple array. And the last was with System.arraycopy() jdk method.

I've tested them charging with 10 million items. 
The ArrayList and the array has similar performance times. The array is a bit more quickly because the ArrayList has more code involving the array, and it takes time to execute.
The System.arraycopy() was considerably more performant than the others. It takes around 30 times less to rotate the array. So, that's the better way to solve the problem.

If you Eclipse or similar, proced to import the proyect and run the algorithmTest as a JUnit Test.
Or, if you have Ant installed (in Ubuntu, just write 'sudo apt-get install ant' to install), run from command line these two commands: 
    'ant build' and 'ant AlgorithmTest' in order to build the project and then run the tests.
If not, you can compile and run with the jdk:
    javac src/algorithm/Algorithm.java (to compile)
    java -cp .:{path to your java instalation folder}/junit.jar org.junit.runner.JUnitCore AlgorithmTest

Take care that 3 stress tests are running, and is taking around 6 second each one to finish (5 seconds to charge the 10 millions of elements each method). If you don't want to run them, just open the AlgorithmTest.java file and remove or comment the @Test annotation from the 3 last methods/tests.

Regards!
