# java-se-11-developer
Java SE 11 Developer 1Z0-819 OCP

Notes written by Patrick Sweeting. These notes are to help with revision and learning. Some notes may only make sense
to the developer that wrote them. 

# Chapter one

### Creating a package
Create a class in a package. You can right click on the src directory and create a package via creating a class.
e.g. name your new class you're creating garden.vegetable.VineVegetable. The last part ***VineVegetable***
will be you're created class inside your package layout.

### Execute FQCN
Terminal Command: `java -cp out/production/packages-imports garden.vegetable.VineVegetable` (Out directory used was 
created by intelli).

This executes the FQCN (Fully Qualified Class Name).

### Java compile directory
`javac -d build src/garden/vegetable/VineVegetable.java`

`javac -d build` allows you to specify where you would like the `build` directory to go and what you would like to 
build. You can name the `build` directory whatever you want.

If you do not use the `-d` flag in `javac build src/garden/vegetable/VineVegetable.java`. 
Java will compile the FQCN next to the defined java file.

---

| Reference Method | Example Code | When to use |
| --------------------------------- | ----------- | ------- |
| **A fully Qualified Class Name FQCN** | `java.util.ArrayList = new java.util.ArrayList();` |  Referencing one class or two |
| **A single-type-import declaration** | `import java.util.ArrayList;` `ArrayList aList = new ArrayList();` | most common and readable way |
| **A type-import-on-demand declaration** | `import java.util.*` `ArrayList aList = new ArrayList();` | Discouraged / bad do not use, but recognised by exam. Very hard to know what it's importing |
| **A single-static-import declaration** | `import static java.lang.Math.PI;` | Pulls in static member of a class, does not reference the declared type. |
| **A static-import-on-demand declaration** | `import static java.lang.Math.*;` | Pulls in ALL static members of a class reference, does not reference declared type. |


### Out of the Ordinary Concepts

- Multiple package statements. 
- A Package statement that is not the first line of code.
- Import statement not in the correct order, must be after a package statement if one exist and before any other code.
- Import `static` statement used in place of an import statement.
- Import statement using a higher level package with a wild card `*`, a wild card does not include classes in other
packages. Example import `a.*` does not also mean import, `a.b.*`
- A misplaced wildcard, for example the `*` at the end of a class name or a partial class name.

### Why Java?

- Java is derived from C, C++ but simplified.
- Java is Architecture neutral (Software that is designed without regard to the target platform).
- Java is Object Oriented.
- Java is Statically typed.
- Java is a Dynamic programming language. (Java supports dynamic binding, supports polymorphism)
- Java supports Multi-threaded processing. (Path followed when executing a program)
- Distributed Computing is supported by Java. (Basically means it works on many different types of machines and OS's)
- Memory management is handled by the Java environment, and not the developer. 