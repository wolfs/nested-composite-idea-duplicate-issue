# nested-composite-idea-duplicate-issue

Demonstrates an issue when subprojects of different included builds clash.
This is [IDEA-257366](https://youtrack.jetbrains.com/issue/IDEA-257366) or a variation of it.

## Reproduction instructions

You can run the build and everything works fine.

```console
$> cd root
$> ./gradlew help

```

Import the `root` project into IDEA.
The import fails with:

```
Duplicate modules names detected: IdeaModule{name='included-build-logic-idea', gradleProject='GradleProject{path=':idea'}', contentRoots=[IdeaContentRoot{rootDirectory=/Users/home/project-dir/nested-composite-idea-duplicate-issue/included/build-logic/idea, sourceDirectories count=2, testDirectories count=2, resourceDirectories count=1, testResourceDirectories count=1, excludeDirectories count=2}], compilerOutput=IdeaCompilerOutput{inheritOutputDirs=false, outputDir=null, testOutputDir=null}, dependencies count=32}
```