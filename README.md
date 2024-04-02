<h1>Creating a Maven Project for Testing in VSC with Selenium and JUnit</h1>
<img src="./img/selenium-logo.png" alt="Selenium logo" height="100px">
<img src="./img/junit-logo.png" alt="JUnit logo" height="100px">

<hr>

<h2>Introduction</h2>

<h3>Selenium</h3>
Currently, <strong>Selenium</strong> is not only the most popular and demanded automation testing framework but also a starting point for other testing applications like <em>Appium</em> or <em>Katalon</em>. One of its greatest virtues is that it supports many programming languages, although the most used nowadays is Java.

<h3>JUnit</h3>
<strong>JUnit</strong> is a unit testing framework for Java and its also widely popular. Combined with Selenium, they become a very powerful tool for automating tests. We will be using both in our testing projects. 

<hr>

<h2>Preliminary steps</h2>
First of all, we must install the last version of <strong>Java Development Kit (JDK)</strong> which can be found <a href="https://www.oracle.com/java/technologies/downloads/">here</a>.
Then in VSC we must also install the <strong>Extension Pack for Java</strong> which includes all the necessary tools to create
Java Projects and finally we must install the browsers (<strong>Chrome, Firefox, Edge, Safari</strong>) on which we will be
running our tests.
<br>
<img src="./img/extension-pack-for-java.png" alt="Extension Pack for Java" height="75px">
<br>

<hr>

<h2>Setting Up the Project</h2>
Once in VSC, the first thing we must do is create a <strong>Maven</strong> project. An easy way to do that is by pressing <code>Ctrl + Shift + P</code> to open up the <em>Command Palette</em> and then search <strong>Java: Create Java Project --> Maven --> No archetype</strong>. Then we choose the project id (we can leave <em>com.example</em> by default), the project artifact (name) -we’ll call it <em>maven-testing-vsc</em> for now- and finally the folder where we are going to save it. Once created, the structure of the project should look something like this:
<br>
<img src="./img/folder-structure.png" alt="Folder structure">
<br>
The next step is to add both dependencies, Selenium and JUnit, so we open the <code>pom.xml</code> file and just before the closing tag called <code>&lt;/project&gt;</code> we must add the following code:
<pre>
    <dependencies>
    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
    <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.18.1</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/junit/junit -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
    </dependencies>
</pre>
