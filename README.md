Airport-Dao-Generator
=====================

Demonstrates the GreenDao ORM tool.  This tool auto-generates database Entity model POJOs and DAO files
to perform normal CRUD and Query operations on your entity objects. (See http://greendao-orm.com/ for full GreenDAO details.)

This is intended to run with the "AirportsApp" Android Sample App project, so be sure to import both these projects locally.  

If you want to update the Airport Table with a new Column, or add a whole new Table, do so
in the AirportsDaoGenerator.java file.  Then, you'll need to execute this project by:

1.  Right-click on this project in Eclipse.
2.  Click "Run As..."
3.  Click "Java Application"
4.  Select "AirportsDaoGenerator" and click OK
5.  The 'Console' window should open up with the results.

You then can view the auto-generated files in the "AirportsApp" and see if your changes were added there.  However, 
first right-click on the "AirportsApp" project and click 'Refresh' to be sure your project is refreshed w/ your changes.






