Secret functions

## Method

This challenge revolved around a file that was provided, within the instructions we were told to use a reverse engineering tool such as Ghidra or GDB to find out the secret function and therefore the flag.

On inspecting it with Ghidra I found that the main function has a few variables that are holding the data to the password. This is because it appears to request the data from iVar1 on line 37. The ivar1 information is contained in the function called decrypt.

![[Ghidra main]](Ghidra%20main.png)

Knowing this information I then loaded up the GDB

With GDB I did the following steps to find the flag.

I first used disassemble main to get a dump of the code that was within main.

Then I set a breakpoint for main and a second breakpoint for decrypt.

Commands:

break main
break decrypt

Then I used the command of run to start the program then next to slowly step through the program.

Once I got to decrypt I used the command of:

x/s (char *)$raxto inspect the output step through it.

The output was a plaintext string but was still encrypted so i used next again.

Then I ran the same command to get the password.

![[Password]](Password.png)

With the password found I could run the program normally and enter in the password to get the flag.

![[flag]](flag.png)
