package cn.tf.mybatis.framework.v2.executor;

public class SimpleExecutor implements Executor{
    public <T> T query(String statement, Object[] parameter, Class pojo) {
        StatementHandler statementHandler = new StatementHandler();
        return statementHandler.query(statement, parameter, pojo);
    }
}
