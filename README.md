## boot-enable-annotation
示例是引入sping boot 自动注解的方式引入自己的例子。<br/>

### 项目介绍
#### boot-auto --基于META-INF:spring.factories 配置实现spring boot 自动装配功能
#### boot-auto-app -- 测试boot-auto自动装配应用
#### boot-enable --使用enable方式 @Import注解实现自动装配功能
#### boot-enable-app --使用boot-enable内的注解实现自动装配

##### 打包boot-auto和boot-enable打包
启动boot-auto-app访问： <br/>
localhost:8001/jon?word=hello uuuu <br/>
localhost:8001/plus?a=23&b=6 <br/>
启动boot-enable-app访问： <br/>
localhost:8002/jon?word=hello uuuu <br/>
localhost:8002/plus?a=23&b=6 <br/>

**原理：** Spring Boot 自动配置从classpath中搜寻所有的META-INF/spring.factories配置文件，
并将其中org.springframework.boot.autoconfigure.EnableutoConfiguration对应的配置项通过反射（Java Refletion）
实例化为对应的标注了@Configuration的JavaConfig形式的IoC容器配置类，
然后汇总为一个并加载到IoC容器。<br/>

**注册配置:** 
在resources目录下新建META-INF目录，然后在META-INF目录下创建spring.factories文件，
文件内容如下，表示设置自动配置类的位置，若有多个配置类用”,”隔开即可。eg: 
org.springframework.boot.autoconfigure.EnableAutoConfiguration=org.jon.lv.auto.EnableJonHandler <br/>

**注意：** @ConditionalOnClass注解主要是用来判断HelloService这个类在路径中是否存在，
在存在且容器中没有该类的Bean的情况下系统会自动配置需要的Bean，@ConditionalOnProperty注解则表示指定的属性要满足的条件。<br/>

**boot-auto使用：**<br/>

````
   1、pom中加入依赖包 
   <dependency>
     <groupId>org.jon.lv</groupId>
     <artifactId>boot-auto</artifactId>
     <version>1.0-SNAPSHOT</version>
   </dependency>
   
   2、application.yml加入需要的配置
       jon:
         lv:
           limit: 66
           name: jon
           ip-list:
           - 127.0.0.1
           - localhost 
           
    3、在需要使用的地方引入即可使用自定义jar包的中的服务
        @Autowired
        private JonServer jonServer;       
   
````

**boot-enable使用：**<br/>

````
   1、pom中加入依赖包 
   <dependency>
     <groupId>org.jon.lv</groupId>
     <artifactId>boot-enable</artifactId>
     <version>1.0-SNAPSHOT</version>
   </dependency>
   
   2、application.yml加入需要的配置
       jon:
         lv:
           limit: 66
           name: jon
           ip-list:
           - 127.0.0.1
           - localhost 
           
    3、在需要使用的地方引入即可使用自定义jar包的中的服务
        @Autowired
        private JonServer jonServer;       
   
````

#### 来点高效元素 o(*￣︶￣*)o
<img src="https://github.com/L316476844/boot-custom-autoconfiguration/blob/master/img/auto.png" alt="">

<img src="https://github.com/L316476844/boot-custom-autoconfiguration/blob/master/img/enable.png" alt="">

