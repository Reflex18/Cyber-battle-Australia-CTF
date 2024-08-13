
This challenge resolves around a file that was provided called Regular_scripting-unknown.class.

First i had to understand what the file type was exactly, this required some googling to understand that it is a java class file.

## Understanding the code
I then looked up a decomplier program for java files and found one called jadx.

On opening this with the class file i found the following code.

![[Decomplied]](Decomplied.png)

From reading and understanding the code it takes in an input from the user of 
ctftech{bddd-edba-dddd-11ec}

With every single d being a digit.

Then it compares the string with an md5 hash of ad2e1c419eb66c002c3bdd7bad415203

Then if it is correct it prints out the same input as the flag, otherwise it prints out Wrong.

## Building a decoder

To understand what to input i ended up asking my good friend chat gpt about the problem and asked for a python code to brute force the solution and a way to test if the code is correct.

First i had to complie the program itself by using the following commands.

Create a new text doc and copy paste the class code into it and name it challenge.java

javac challenge.java 

This then creates the code.

Then i can run it with:
java challenge

The program will then wait for an input.

Now that the program is created i then created the decoder itself.

This was a simple python code that is linked to this readme.

![[brute_force]](brute_force.py)

It output the following information that i checked in the challenge.java file.

Flag = ctftech{b123-e4ba-3d45-11ec}