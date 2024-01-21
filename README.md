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

Your system should have java with version >= 11.0.13 & Java(TM) SE Runtime Environment >= 18.9

<h1>Running the parser</h1> (Given the Main.jar file which can be used to run the cron Expression if you have java SE >=18.9)

How to <a href="https://help.eclipse.org/latest/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Ftasks%2Ftasks-37.htm"> create </a> the Jar file using Eclipse =
Also please add the JUnit 4 for unit tests => https://www.tutorialspoint.com/junit/junit_plug_with_eclipse.htm

Run the following command to parse cron expression:

    java -jar Main.jar "CRON_EXPRESSION"

For example:

    java -jar Main.jar "*/10 0 1,7 * 2-6 /user/local/msdn.sh"
