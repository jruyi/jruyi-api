## JRuyi API

[![Build Status](https://semaphoreci.com/api/v1/agemocui/jruyi-api/branches/master/shields_badge.svg)](https://semaphoreci.com/agemocui/jruyi-api)

An API lib for developing JRuyi based applications.

## Requirements

Oracle/OpenJDK JDK 7 and above.

## Binaries

Releases are available via JCenter.

For Gradle:

```gradle
repositories {
    jcenter()
}

dependencies {
    compile 'org.jruyi:jruyi-api:2.5.0'
}
```

For Maven:

```xml
<repositories>
    <repository>
        <id>jcenter</id>
        <url>https://jcenter.bintray.com</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>org.jruyi</groupId>
        <artifactId>jruyi-api</artifactId>
        <version>2.5.0</version>
    </dependency>
</dependencies>
```

Snapshots are available via JFrog.

For Gradle:

```gradle
repositories {
    maven {
        url 'https://oss.jfrog.org/libs-snapshot'
    }
}

dependencies {
    compile 'org.jruyi:jruyi-api:x.y.z-SNAPSHOT'
}
```

For Maven:

```xml
<repositories>
    <repository>
        <id>ojo</id>
        <url>https://oss.jfrog.org/libs-snapshot</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>org.jruyi</groupId>
        <artifactId>jruyi-api</artifactId>
        <version>x.y.z-SNAPSHOT</version>
    </dependency>
</dependencies>
```

## License

JRuyi API is licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html).
