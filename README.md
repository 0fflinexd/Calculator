# Calculator
To find my program, go to my link, press “src” then you open the “Calculatorwindow.java" code 

https://github.com/0fflinexd/Calculator/blob/979368db4d827865418508adb1b444aa1cdf8f01/src/Calculatorwindow.java 

I have written a java program that creates a GUI for a calculator. It uses the java swing library to create elements like buttons text feilds and panels. The program implements the actionListener interface witch allows it to respont to the users interactions with the buttons 

I started of by creating a JFrame, here i can decide on what the size, layout and other properties of the frame will be. Then i made the JTextField. To be able to display the results of the calulations to the user. I set this text field to be disabled to make sure that the user can’t enter anything into it. 

After this i started to decidde on what diffrent buttons i wanted to have in my program, i made multiple JButtons for eatch calulator function, like add, sub, mul, and division. All these buttons are added into an array of JButtons called “functionButtons”. I also made an array of JButtons called “numberButtons” this array contains the buttons of the numbers 0-9. 

To make sure the buttons would actually be interacteble set up an action listener for eatch of the buttons. So now whenever the user presses a button the action listeners method is called, this makees sure that the appropriate calculation or operation is ran by the program 

Now that i had all the buttons and functions, i could start “building” the program. 
To “build” the calculator i made a JPanel, I set this panel up with a set grid layout to make it posible for me to decide on where every button will be placed. 

Lastly i wanted the program to show the useres last input to make it easier for the user to continue to make new calculations, to do this, I added a JLabel called “lastInput” to the GUI. I positioned it at the top of the window and made it red to not confuse the user from mistaking either of the fields from eatchother  

 
