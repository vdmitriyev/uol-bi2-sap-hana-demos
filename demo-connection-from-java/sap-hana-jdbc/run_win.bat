REM	@author Viktor Dmitriyev
REM echo off
REM del program_output.txt
del SapHanaConnectionTest.class
set CLASSPATH=".;drivers/win_x64/ngdbc.jar"
javac SapHanaConnectionTest.java
java SapHanaConnectionTest > program_output.txt
pause