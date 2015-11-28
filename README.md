## ReactBoot
This is a Spring Boot project (by SpringBoot + Velocity + Mybatis + ReactJs)

This is a empty demo project, it just contains one module ,if necessary, you can split it to more modules .

You can start yourself project using the empty project , welcome fork.

#### Note That
1.If you use Intellij Idea , please change you run/debug setting , you should choose "$MODULE_DIR$" in this setting in order to reload the velocity templates when you change it's content.
2.If you need to use yourself data source ,please change application.properties config , this project use mysql.

#### Run
1.Compile React js
* install react-tools
```bash
sudo npm install -g react-tools
```
* compile jsx
```bash
 jsx --watch src/main/resources/static/1.0/dev/ src/main/resources/static/1.0/js/
```

2.Use mvn command(in the root directory of the project):
```bash
    mvn spring-boot:run
```

## ReactBoot

折腾了好久,总之是好了.这是一个空的架子,之后的项目都要在此基础上做了.

用了spring-boot,以后在docker或者其他平台,部署项目就方便多了.

应该没什么坑了,看以后有没有机会在实际中应用起来.

#### 编译/运行
* 编译react js文件,安装react-tools
```bash
sudo npm install -g react-tools
```
* 实时编译
```bash
 jsx --watch src/main/resources/static/1.0/dev/ src/main/resources/static/1.0/js/
```

* 项目启动
```bash
    mvn spring-boot:run
```
