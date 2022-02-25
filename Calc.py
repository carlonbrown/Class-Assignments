#Carlon Brown
#Assigngment 1
#CIS 400
import math
import string
#Created a class called Calc which calls the functions add,sub,multiply, divide,sqrt_n for square root, and quad_s for quadratic formula
#Calling self because I will be calling the class to execute the functions
class Calc():
    def add(self):
        return(number_1 + number_2)
    def sub(self):
        return(number_1 - number_2)
    def multiply(self):
        return(number_1 * number_2)
    def divide(self):
        return(number_1 / number_2)
    def sqrt_n(self):
        return (result)
    def quad_s(self):
        return (quad_solution)
#Displaying 3 prompts to either use simple calculator, square root, or quadratic formula by entering either 1,2, or 3 as options
print("1) Would you like to use simple calculator? (+,-,*,/)?")
print("2) Or Find Square Root?")
print("3) Or Calculate the quadratic formula? ")
#Choice is user input for options above
choice = int(input(""))
#I made obj = to class Calc to be callable
obj = Calc
#these are the actions by what you select
if choice == 1:
    while True:
        try:
            #if you choose to do the simple calculator enter the numbers you want calculated
            number_1 = int(input("Enter First Number..:"))
            number_2 = int(input("Enter Second Number..:"))
            #I used a list comprehension to make if numbers are greater or less than zero displayed
            list = [number_1 , number_2]
            listcomp = [e for e in list if e >= 0 if e <= 0]  
        except ValueError:
            #exception if you dont input a integer it will reprompt you
            print("Not an integer! Try again.")
            continue
        else:
            print("You have entered", list, "as your inputs")
        print("Select +, for Addition")
        print("Select -, for Subtraction")
        print("Select *, for Multiplication")
        print("Select /, for Division")
        # I created a dictionary for the selection and calling the specefic funtions for what operation used
        dict = { "+": obj().add(), "-": obj().sub(), "*": obj().multiply(), "/": obj().divide()}
        #This will prompt to ask you what operation you want used
        operation = str(input("Pick an operation:"))
        op_v = (dict.get(operation))
        new_op_v = {k: op_v for (k,v) in dict.items()}
        #The variable new is a dictionary comprehension to get the operation selected and apply it
        #The if and else statments below are for if you dont input the simple operations then it will display what you entered is unknown
        if operation == "+":
            print(number_1, operation, number_2 , "is" , op_v)
        elif operation == "-":
            print(number_1, operation, number_2 , "is" , op_v)
        elif operation == "*":
            print(number_1, operation, number_2 , "is" , op_v)
        elif operation == "/":
            print(number_1, operation, number_2 , "is" , op_v)
        else:
            print(operation, "is unknown")
        #The input option prompts if you would like to continue or exit the simple calculator
        option = str(input("Would you like to continue the simple calculator? Type (yes) to continue or (e) to exit \n"))
        #The if options are for if the type yes it will continue , if they type exit it will stop
        #The try and exception allows me to reprompt user however if input is not yes or exit it will end with a statement
        if option == "yes":
            continue
        else:
            try:
                if option in "exit":
                    break
                print("Invalid input, program will end")
            except Exception as e:
                print(e)
            break
elif choice == 2:
    while True:
        try:
            #This calculates the square root of a number
            sqr_num = int(input("Enter number \n"))       
        except ValueError:
            print("Not an integer! Try again.")
            continue
        else:
            print("You have entered", sqr_num, "as your input")
        result = math.sqrt(sqr_num)
        print("The square root of", sqr_num, "is", result)
        #As described above the option to continue or exit will display unless those ae entered it will stop with a statement
        option = str(input("Would you like to continue the simple calculator? Type (yes) to continue or (e) to exit \n"))
        if option == "yes":
            continue
        else:
            try:
                if option in "exit":
                    break
                print("Invalid input, program will end")
            except Exception as e:
                print(e)
            break
elif choice == 3:
    while True:
        #This calculates the quadratic formula
        print("The Standard form of Quadratic equation (Ax^2 + Bx + C)")
        try:
            A = int(input("Enter first number : "))
            B = int(input("Enter second number : "))
            C = int(input("Enter third number : "))       
        except ValueError:
            print("Not an integer! Try again.")
            continue
        else:
            print("You have entered", A, B, C, "as your input")
        D = (B**2)-(4*A*C)
        solution1 = (-B-math.sqrt(D))/(2*A)
        solution2 = (-B+math.sqrt(D))/(2*A)
        quad_solution = (solution1, solution2)
        print("The solutions are", solution1, "and", solution2)
        option = str(input("Would you like to continue the simple calculator? Type (yes) to continue or (e) to exit \n"))
        if option == "yes":
            continue
        else:
            try:
                if option in "exit":
                    break
                print("Invalid input, program will end")
            except Exception as e:
                print(e)
            break
else:
    print("error")       
if __name__ == '__main__':
    #I am calling the class to execute all the functions in the program
    obj()