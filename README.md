# springboot_change-profile

## mvn起動時にプロファイルを指定

```
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

## 起動引数にプロファイルを設定

- Command line arguments(コマンドライン引数)

```
--spring.profiles.active=dev1
```

- Java System properties (System.getProperties())

```
-Dspring.profiles.active=dev1
```

## OSの環境変数

```
SPRING_PROFILES_ACTIVE
```

## JNDIも使用可能

```
<Context>
    <Environment type="java.lang.String"
                 name="spring.profiles.active"
                 value="local"/>
</Context>
```
