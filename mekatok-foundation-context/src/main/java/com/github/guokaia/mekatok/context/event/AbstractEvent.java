package com.github.guokaia.mekatok.context.event;

import org.springframework.context.ApplicationEvent;

/**
 * 平台内对于应用事件的包装
 * @author GuoKai
 * @date 2022/2/1
 */
@SuppressWarnings("all")
public abstract class AbstractEvent<T> extends ApplicationEvent {

    /**
     * 构造器
     * @param source 元数据
     */
    public AbstractEvent(T source) {
        super(source);
    }

    /**
     * 事件名称
     * @return 事件名称
     */
    public String name(){
        return getClass().getName();
    };

    /**
     * 事件备注
     * @return 事件备注
     */
    public String description(){
        return "默认事件描述";
    }

    /**
     * 事件数据
     * @return 事件数据
     */
    public T getMeta() {
        return (T) getSource();
    }

}
