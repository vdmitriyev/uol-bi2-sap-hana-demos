@echo off
echo 'Compiling LaTex to PDF. Please, wait ...'
latex 2013_07_26_Course_BI_external_connection_to_sap_hana
REM dvips presentation_template 
pdflatex 2013_07_26_Course_BI_external_connection_to_sap_hana
echo 'Ending...'