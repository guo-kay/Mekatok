package com.github.guokaia.mekatok.common.asserts.impl;

import cn.hutool.core.util.NumberUtil;
import com.github.guokaia.mekatok.common.asserts.AbstractAssert;

/**
 * @author GuoKai
 * @date 2022/2/1
 */
public class NumberAssert<T extends Number> extends AbstractAssert<NumberAssert<T>, T> {

    /**
     * 构造器
     * @param actual 待断言对象
     */
    public NumberAssert(T actual) {
        super(actual);
    }

    @Override
    public NumberAssert<T> is(T obj) {
        return exception(actual.equals(obj));
    }

    /**
     * 是有效数字
     * @return 断言工具
     */
    public NumberAssert<T> isValidNumber(){
        return exception(NumberUtil.isValidNumber(actual));
    }

    /**
     * 不是有效数字
     * @return 断言工具
     */
    public NumberAssert<T> isNotValidNumber(){
        return exception(!NumberUtil.isValidNumber(actual));
    }

    /**
     * 小于
     * @param obj 长度
     * @return 断言工具
     */
    public NumberAssert<T> lt(T obj){
        return exception(actual.doubleValue() < obj.doubleValue());
    }

    /**
     * 小于等于
     * @param obj 长度
     * @return 断言工具
     */
    public NumberAssert<T> le(T obj){
        return exception(actual.doubleValue() <= obj.doubleValue());
    }

    /**
     * 大于
     * @param obj 长度
     * @return 断言工具
     */
    public NumberAssert<T> gt(T obj){
        return exception(actual.doubleValue() > obj.doubleValue());
    }

    /**
     * 大于等于
     * @param obj 长度
     * @return 断言工具
     */
    public NumberAssert<T> ge(T obj){
        return exception(actual.doubleValue() >= obj.doubleValue());
    }

    /**
     * 不等于
     * @param obj 长度
     * @return 断言工具
     */
    public NumberAssert<T> ne(T obj){
        return exception(actual.doubleValue() != obj.doubleValue());
    }

}
