import dbapi
import traceback
import sap_hana_credentials as credentials

"""
    Author  : Viktor Dmitriyev
    Goal 	: Establish connection to SAP HANA DB using shipped with SAP HANA python client routine 
    		  and running simple select query.
    Date    : 25.07.2013
"""

def get_connection():
	"""
		(NoneType) -> (Object)

		Method that will return connection to the database using given credentials.
	"""

	return  dbapi.connect(credentials.SERVER,\
						  credentials.PORT,\
						  credentials.USER,\
						  credentials.PASSWORD)

def build_test_query01():
	"""
		(NoneType) -> (str)

		Building query for execution
	"""
	query =  'select  "ID", "AMOUNT", "TRAN_DATE", "POST_DATE", "DESCRIPTION", "CATEGORY_TEXT"' + \
				 'from DEMOUSER00.TBL_LOADED_DATA'

	return query

def fetch_row_into_str(row):
	"""
		(list) -> (str)

		Fetching values from the given row(tuple) that are presented in form of list.
	"""

	str_row = ""
	for value in row:		
		str_row = str_row + str(value) + ' | \t\t'
	return str_row[:-5]


def run_query(connection,query):		
	"""
		(Connection, str) -> NoneType

		Running given query and using given connection. 
		Fetching result rows and printing them to standard output.
	"""

	cursor = connection.cursor()
	executed_cur = cursor.execute(query)
	if executed_cur:
		result_cur = cursor.fetchall()
		for row in result_cur:
				print fetch_row_into_str(row)
	else:
		print "[e] Something wrong with execution."

def process_query():
	"""
		(NoneType) -> NoneType

		Processing query.
	"""

	connection = get_connection()
	query = build_test_query01()
	run_query(connection, query)

if __name__ == '__main__':
	process_query()
