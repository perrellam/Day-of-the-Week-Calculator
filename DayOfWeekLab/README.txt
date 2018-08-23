Thought Questions and Answers:

1. True or not: In Java is it true that (a % 7) == (a - a/7*7) for a >= 0? ?				True
2. It’s rough to start a week on Saturday. What adjustments would be necessary to have a remainder of 0 associated with Sunday? (This might allow a mnemonic of Nun-day, One-day, Twos-day, Wednesday, Fours-day, Fives-day, Saturday.) ?										In my particular program, I used an array to hold the value associated with each day of the week.  That being said, I would need to change the order in which my day 0f the week strings lined up with their value.    Saturday is no longer 0. Saturday is 6th in my array. 
3. Why do you subtract 1 in a leap year if the date falls before March? ?			Because the “-1” allows for the program to accommodate for the leap year when the month given is in January or February.  If it were not used, the Day of the Week calculated would be incorrect in the case of a leap year.
4. It might be useful to compute the portion of any calculation associated with this year, modulo 7. Remembering that value will allow you to optimize your most frequent date calculations. What is the remainder associated with this year? ?												2016 % 7 = 4

