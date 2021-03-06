package com.github.guokaia.mekatok.oss.service;

import com.github.guokaia.mekatok.context.MekatokApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 对象存储服务启动类
 * @author GuoKai
 * @date 2022/2/5
 */
@SpringCloudApplication
public class OssApplication {
    public static void main(String[] args) {
        MekatokApplication.run(OssApplication.class, args);
    }
}
