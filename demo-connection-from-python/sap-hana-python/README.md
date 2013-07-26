About
=======
Simple python script for connecting to the SAP HANA DB and running select query.

General options
===============
* Load sample data from '../../demo-import-csv-data/data/data_to_load_transaction.csv' to SAP HANA DB.

Two options are available to access the data inside SAP HANA from python.
* Use delivered with SAP HANA Client API for python
* Install additional library for ODBC (https://code.google.com/p/pyodbc/)

Option #1
===============
* Install Python 2.7/2.6 on your machine (http://www.python.org/download/).
* Add path to your python execution folder to the PATH variable.
* Install additional libraries for the ODBC usage (https://code.google.com/p/pyodbc/).

Option #2
===============
* Add path to python that is shipped with "SAP HANA Client" to PATH variable.
* Copy 3 files(__init__.py, dbapi.py, resultthrow.py) from the 'hdbcli' folder to the "SAP HANA Client"'s Python's folder called 'Lib'.
* Copy 2 files(pyhdbcli.pdb, pyhdbcli.pyd) from the 'hdbclient' folder to the "SAP HANA Client"'s Python's folder 'Lib'.
* Additional (http://scn.sap.com/community/developer-center/hana/blog/2012/06/08/sap-hana-and-python-yes-sir)



Run on Windows
==============
Run 'run_win_option_xx.bat' and check created 'txt' file.
```
run_win_option_01.bat
```	

```
run_win_option_02.bat
```	
