package dayofweek;

/**
 * DayOfWeek class calculates the day of the week for any given date between
 * January 1, 1900 to December 31, 2099. Attached README File provides answers
 * to Thought Questions, and 
 * 
 * @author Mason Perrella
 * @version 1.0
 */

public class DayOfWeek
{
    // Properties
    public final static int NO_VALUE = -1;
    private int myDayOfMonth;
    private int myNumericDayOfWeek;
    private int myMonthNum;
    private int myYear;

    public DayOfWeek(int month, int dayOfMonth, int year)
    {
        // Set properties equal to values given for date.
        myDayOfMonth = dayOfMonth;
        myYear = year;
        myMonthNum = month;
    }

    // Methods
    
 // Conditionals checking what month is inputed and verify that the
    // corresponding day of month is valid.
    public int getDayOfMonth()
    {
        if (getMonth() != NO_VALUE)
        {
            if (myMonthNum == 1 || myMonthNum == 3 || myMonthNum == 5 || myMonthNum == 7 || myMonthNum == 8
                    || myMonthNum == 10 || myMonthNum == 12)
            {
                if (myDayOfMonth <= 31 && myDayOfMonth >= 1)
                {
                    return myDayOfMonth;
                } else
                {
                    return NO_VALUE;
                }

            } else if (myMonthNum == 4 || myMonthNum == 6 || myMonthNum == 9 || myMonthNum == 11)
            {
                if (myDayOfMonth <= 30 && myDayOfMonth >= 1)
                {
                    return myDayOfMonth;
                } else
                {
                    return NO_VALUE;
                }
            } else if ((getYear() % 4) == 0)
            {
                if (myMonthNum == 2)
                {
                    if (myDayOfMonth <= 29 && myDayOfMonth >= 1)
                    {
                        return myDayOfMonth;
                    } else
                    {
                        return NO_VALUE;
                    }
                } else
                {
                    return NO_VALUE;
                }
            } else if (myMonthNum == 2)
            {
                if (myDayOfMonth <= 28 && myDayOfMonth >= 1)
                {
                    return myDayOfMonth;
                } else
                {
                    return NO_VALUE;
                }
            } else
            {
                return NO_VALUE;
            }

        } else
        {
            return NO_VALUE;
        }

    }
 // Checks if year, month, and day are valid. Then calculates the value for the Day of the Week.
    public int getNumericDayOfWeek()
    {
        
        if ((getYear() - 1900) < 0 || (getYear() - 1900) > 199 || getDayOfMonth() == NO_VALUE || getMonth() == NO_VALUE
                || getMonthString() == null)
        {
            return NO_VALUE;
        } else
        {
            int leapYear = (getYear() - 1900) / 4;
            this.myNumericDayOfWeek = ((getYear() - 1900) + getDayOfMonth() + leapYear + getAdjustment()) % 7;

            return myNumericDayOfWeek;
        }
    }

 // Checks if Numeric Value for the Day of the Week is valid, then returns String.
    public String getDayOfWeek()
    {
        int dayNum = getNumericDayOfWeek();
        if (dayNum == NO_VALUE)
        {
            return null;
        } else
        {
            String days[] = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
            return days[dayNum];
        }

    }

    // Verify myMonthNum is between 1 and 12. Then return myMonthNum.
    public int getMonth()
    {
        if(myDayOfMonth <= 0 || myDayOfMonth >= 32)
        {
            return NO_VALUE;
        }else  if (myMonthNum > 12 || myMonthNum < 1)
        {
            return NO_VALUE;
        } else
        {
            return myMonthNum;
        }
    }

    // Gives Month String once given the Month number.
    public String getMonthString()
    {
        if (getMonth() == NO_VALUE)
        {
            return null;
        } else
        {
            String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                    "October", "November", "December" };
            return months[getMonth() - 1];
        }

    }

    // Gives year.
    public int getYear()
    {
        return myYear;
    }

    // Checks month, and then allocates adjustment needed for that month.
    public int getAdjustment()
    {
        int adjust = 0;

        if (myMonthNum == 1)
        {
            adjust = 1;
        }
        if (myMonthNum == 2)
        {
            adjust = 4;
        }
        if (myMonthNum == 3)
        {
            adjust = 4;
        }
        if (myMonthNum == 4)
        {
            adjust = 0;
        }
        if (myMonthNum == 5)
        {
            adjust = 2;
        }
        if (myMonthNum == 6)
        {
            adjust = 5;
        }
        if (myMonthNum == 7)
        {
            adjust = 0;
        }
        if (myMonthNum == 8)
        {
            adjust = 3;
        }
        if (myMonthNum == 9)
        {
            adjust = 6;
        }
        if (myMonthNum == 10)
        {
            adjust = 1;
        }
        if (myMonthNum == 11)
        {
            adjust = 4;
        }
        if (myMonthNum == 12)
        {
            adjust = 6;
        }
        if (myYear % 4 == 0 && myYear != 1900 && (myMonthNum == 1 || myMonthNum == 2))
        {
            adjust = adjust - 1;
        }
        return adjust;
    }

}
