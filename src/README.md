Blog Boxes Task Instructions
=========

- Read the comments in the `blog-boxes.cs` file
- You can complete the task in C# or adapt it to any other programming language, however if you do, be sure to:
    - Write a similar driver file (like blog-boxes.cs)
    - Provide instructions on how to compile/run the source code along with any dependencies
    - Use comments to discuss any design decisions you've made and why
- Final deliverable should include:
    - All necessary project files
    - A README.md with the following information:
        - List of dependencies and how to install them
        - Instructions to compile/run the code
- Turn-in Options
    - Email us at `jobs@dragonbox.com`
    - Zip up and share or email (most likely you will need to rename the .Zip extension to attach it to email)
    - A shared private git repo is fine
    - A directory file share (e.g. Google Drive, DropBox) is also fine
- Note: Dockerized solutions are fine (and preferable if the environmental setup is complicated)

How to run
=========
This project uses Kotlin (with Java 18) and maven.
It doesn't use any dependency apart from the ones required to make a jar.

With IntelliJ: open project and run `fun main()` from `src/main/kotlin/Main.kt`

Using maven, generate a 'fat-jar', in a terminal run `mvn clean install`
go where `consoleApp-1.0-SNAPSHOT-jar-with-dependencies.jar` is located,
using Java, run ` java -jar consoleApp-1.0-SNAPSHOT-jar-with-dependencies.jar`

About
=========

All the comments are in the code, there are no unit tests.
The 'difficulty' was to figure out the 'symmetry' logic and when to start with a white box.

`String?` in Kotlin means nullable `String`, since the array of `String` is initialized with `null` values.


Misc.
=========
The original C# file is accessible from `src/main/resources/blog-boxes.cs`
