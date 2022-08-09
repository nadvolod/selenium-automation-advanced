# Parallel Execution

<img src="https://media.giphy.com/media/3oAt1NNFH378qnqPKM/giphy.gif" alt="parallel" width="400"/>

## 🧠 You will learn

✅ How to create ridiculously fast test suites

✅ How to implement parallelization

## In today's world, it's improbable to succeed without parallelization

> "Once you have these automated tests, our analysis shows it’s important to run them regularly. Every commit should trigger a build of the software and running a set of fast, automated tests. Developers should get feedback from a more comprehensive suite of acceptance and performance tests every day. Furthermore, current builds should be available to testers for exploratory testing." (Nicole Forsgren PhD, Jez Humble, Gene Kim, Accelerate: The Science of Lean Software and DevOps: Building and Scaling High Performing Technology Organizations)

Try to run the current suite of tests:

```bash
mvn test -Dtest=E2ESolutionTests
```

This is how long my tests took

```java
[INFO] --------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] --------------------------------------------------------------
[INFO] Total time:  01:00 min
[INFO] Finished at: 2022-07-11T09:31:19-04:00
[INFO] --------------------------------------------------------------
```

60 sec/6 tests = 10 sec/test

---

### ❓What's the problem with this approach?

---

## 🏋️‍ Implement parallelization

1. Go to `pom.xml` and add the following at the same level as the `<dependencies>` node

```xml
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
                <configuration>
                    <parallel>all</parallel>
                    <threadCountMethods>100</threadCountMethods>
                    <useUnlimitedThreads>true</useUnlimitedThreads>
                    <redirectTestOutputToFile>false</redirectTestOutputToFile>
                </configuration>
            </plugin>
        </plugins>
    </build>
```

2. In terminal run

```bash
mvn test -Dtest=E2ESolutionTests
```

3. Login to saucelabs.com and watch tests run in parallel

My results

```
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  23.919 s
[INFO] Finished at: 2022-07-11T09:37:04-04:00
[INFO] ------------------------------------------------------------------------
```

## What we just achieved ✅ 💪

✅ ~62% speed improvement in < 5 min

✅ 0 degradation to our test quality

✅ Enabled parallel scaling

## 📝 Summary

✅ Parallel testing is awesome

## Extra resources

[Achieving 97% test suite run time improvement](https://devops.com/4-steps-to-achieve-a-66-reduction-in-test-run-time/)

## [⏭️ Let's summarize](CONCLUSIONS.MD)
