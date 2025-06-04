<p align="center"><h1 align="center">S1.08. Lambdas </h1></p>

<br>




## 👾 Exercises
### 📌 Level 1 - Maven.

In the application.properties file, set the server.port variable to 9000.
We will convert this application into a REST API:
Depending on the main package, create another subpackage called controller, and inside it, add the HelloWorldController class.
It should have two methods:

String hello
String hello2

These two methods will receive a String parameter called name, and will return the phrase:
“Hello, “ + name + “. You are running a Maven project”.
The first method will respond to a GET request, and must be configured to receive the parameter as a RequestParam. The “name” parameter will have the default value “UNKNOWN”.
It should respond to:
http://localhost:9000/HelloWorld
http://localhost:9000/HelloWorld?name=My name
The second method will respond to a GET request, and should be configured to receive the parameter as a PathVariable. The "name" parameter is optional.

It should respond to:
http://localhost:9000/HelloWorld2
http://localhost:9000/HelloWorld2/myname

### ▶️ Run it :
#### USING YOUR TERMINAL : from cd S4.T01.N01
mvn spring-boot:run

### EndPoints:
http://localhost:9000/hello
"Hola unknown. Estàs executant un projecte Maven"
http://localhost:9000/hello?nom=Zohra
"Hola Zohra. Estàs executant un projecte Maven"
http://localhost:9000/hello2
"Hola2 . Estàs executant un projecte Maven"
http://localhost:9000/hello2/Zohra
"Hola2 Zohra. Estàs executant un projecte Maven"


### 📌 Level 2 - Gradle.
Same as Level 1, using Gradle.
### ▶️ Run it :
#### USING YOUR TERMINAL : cd S4.T01.N02
./gradlew bootRun

### EndPoints:
http://localhost:9001/hello
"Hola unknown. Estàs executant un projecte Gradle"
http://localhost:9001/hello?nom=Zohra
"Hola Zohra. Estàs executant un projecte Gradle"
http://localhost:9001/hello2
"Hola2 . Estàs executant un projecte Gradle"
http://localhost:9001/hello2/Zohra
"Hola2 Zohra. Estàs executant un projecte Gradle"

