mvn clean
mvn install (site folder generated into target) 
OR
clean org.jacoco:jacoco-maven-plugin:prepare-agent install

Maven Build-> sonar:sonar (Push to Sonar Server)
==========================




# sonar-example
What is sonar how to get start with it | Example

# Plugins:

<build>
		<plugins>
			<plugin>
				<groupId>org.sonarsource.scanner.maven</groupId>
				<artifactId>sonar-maven-plugin</artifactId>
				<version>3.4.0.905</version>
			</plugin>
			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>0.8.1</version>
			</plugin>
		</plugins>
	</build>


######
sonar:sonar -Dsonar.login=squ_93153813dbe94595e31c738352131cefc752492b
