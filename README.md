
##mybatis中用到的设计模式

- 装饰者模式：cachingExceutord对Execctor进行包装
- 建造模式：SqlSessionFactoryBuilder去创建SqlSessionFactory，
- 工厂模式：SqlsessionFactory
- 模板方法模式：BaseExecutor、SimpleExecutor
- 动态代理：MapperProxy,log(eg：ConnectionLog、StatementLogger）
- 委派模式：createCacheKey
- 责任链模式：InterceptorChain
- 适配器： sl4j
- 策略模式：RoutingStatementHandler
- 单例模式：Configuration

##mybatis中update操作时序图

![image](./mybatis中update流程时序图.jpg)

##手写mybatis框架在mybatis_framework这个工程中