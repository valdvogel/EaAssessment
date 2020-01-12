#!/bin/sh

javac *.java

jar cfm EA.jar Manifest.txt *.class

java -jar EA.jar
