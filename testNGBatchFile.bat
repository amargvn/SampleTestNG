set projectLocation=D:\QAWorkspace\SampleTestNG
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java -cp org.testng.TestNG %projectLocation%\testng.xml
pause
