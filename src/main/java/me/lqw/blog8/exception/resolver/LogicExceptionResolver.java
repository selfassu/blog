package me.lqw.blog8.exception.resolver;

import me.lqw.blog8.exception.LogicException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.Map;

/**
 * 系统的逻辑异常，比如删除文章，发现文章未找到。这种会抛出 LogicException
 * ----> 查看文章，但文章未找到，这种会抛出 ResourceNotFoundException
 * 系统逻辑处理上的异常
 *
 * @author liqiwen
 * @version 1.0
 * @since 1.0
 */
public class LogicExceptionResolver implements ExceptionResolver {

    /**
     * 是否匹配逻辑异常
     *
     * @param ex ex
     * @return true | false
     */
    @Override
    public boolean match(Exception ex) {
        return ex instanceof LogicException;
    }

    /**
     * 从逻辑异常中获取错误信息
     *
     * @param request request
     * @param ex      ex
     * @return Map
     */
    @Override
    public Map<String, Object> readErrors(HttpServletRequest request, Exception ex) {
        return Collections.singletonMap("errors", ((LogicException) ex).getError());
    }

    /**
     * 获取状态码
     *
     * @param request request
     * @param ex      ex
     * @return HttpStatus
     */
    @Override
    public int getStatus(HttpServletRequest request, Exception ex) {
        return HttpServletResponse.SC_BAD_REQUEST;
    }
}
