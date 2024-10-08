package com.xingsk.initializr.custom;

import io.spring.initializr.generator.project.MutableProjectDescription;
import io.spring.initializr.generator.project.ProjectDescriptionCustomizer;

/**
 * DefaultProjectDescriptionCustomizer
 *
 * @author : xingshukui
 * @date : 2021/7/24 9:08 下午
 * @desc :
 */
public class DefaultProjectDescriptionCustomizer implements ProjectDescriptionCustomizer {

    @Override
    public void customize(MutableProjectDescription description) {
        description.setPackageName("com.xingsk");
    }

    /**
     * todo
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
