About
=======
Simple java class for connecting to the SAP HANA DB and running select query.

General options
=======

* Load sample data from '../../demo-import-csv-data/data/data_to_load_transaction.csv' to SAP HANA DB.
* Install JDK on your machine.
* Add path to your JDK's bin folder to the PATH variable (or JAVA_HOME).


Windows
=======
Run 'run_win.bat' and check created 'txt' file.
```
run_run.bat
```	
	
Linux(tested on Ubuntu):
=======

Make file 'run_linux' executable
```
sudo chmod +x run_linux
```
	
Compiling the code
```
./run_linux compile
```

Running the code
```	
./run_linux run
```

Cleaning the code (old version of .class)
```
./run_linux clean
```
	
Getting help
```
./run_linux help
```
	