Cron Expression Parser

This project implements a CLI using Java to parse cron expressions.

Supported features:

    asterisk (*)
    comma separated lists (ex: 1,2,3)
    time intervals using slashes (ex: */10)
    ranges using hyphens (ex: 3-5)
    capital abbreviations for months (ex: JAN-MAR)
    capital abbreviations for weekdays (ex: MON-WED)

Unsupported features or features for future development:

    Assumed all months to have 31 days.
    Non standard characters
    Non capital abbrevations for months and weekdays
    
Note that the weekdays numbering starts from 0 and the first weekday is Sunday

Your system should have java with version >= 11.0.13 

<h1>Running the parser</h1> 


Run the following command to parse cron expression:

    java ProjectCronExpression\src\MainClass.java "CRON_EXPRESSION"

For example:

       java ProjectCronExpression\src\MainClass.java "*/10 0 1,7 * 2-6 /user/local/msdn.sh"

For Running the unit tests cases

First Compile

        javac -cp junit-4.12.jar;. ProjectCronExpression\src\Test1.java
    
To Execute 

        java -cp junit-4.12.jar;hamcrest.jar;. org.junit.runner.JUnitCore ProjectCronExpression\src\Test1
