package com.github.guokaia.mekatok.common.asserts.impl;

import cn.hutool.core.util.ArrayUtil;
import com.github.guokaia.mekatok.common.asserts.AbstractAssert;
import lombok.NonNull;

/**
 * @author GuoKai
 * @date 2022/2/1
 */
public class ObjectAssert<T> extends AbstractAssert<ObjectAssert<T>, T> {

    /**
     * 构造器
     * @param actual 待断言对象
     */
    public ObjectAssert(@NonNull T actual) {
        super(actual);
    }

    @Override
    public ObjectAssert<T> is(T obj) {
        return exception(actual.equals(obj));
    }

    /**
     * 是数组
     * @return 断言工具
     */
    public ObjectAssert<T> isArray(){
        return exception(ArrayUtil.isArray(actual));
    }

    /**
     * 非数组
     * @return 断言工具
     */
    public ObjectAssert<T> isNotArray(){
        return exception(!ArrayUtil.isArray(actual));
    }

    /**
     * 是子类实例
     * @param clazz 类型
     * @return 断言工具
     */
    public ObjectAssert<T> isClass(Class<?> clazz){
        return exception(actual.getClass().isAssignableFrom(clazz));
    }

    /**
     * 不是子类实例
     * @param clazz 类型
     * @return 断言工具
     */
    public ObjectAssert<T> isNotClass(Class<?> clazz){
        return exception(!actual.getClass().isAssignableFrom(clazz));
    }
}
