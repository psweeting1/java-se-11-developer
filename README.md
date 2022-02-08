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
