package com.xingsk.initializr.custom;

import com.xingsk.initializr.custom.DependencyContainer;
import io.spring.initializr.generator.buildsystem.gradle.GradleBuild;
import io.spring.initializr.generator.spring.build.BuildCustomizer;

/**
 * DependenciesCustomizer
 *
 * @author : xingshukui
 * @date : 2021/7/24 8:27 下午
 * @desc :
 */
public class DependenciesCustomizer implements BuildCustomizer<GradleBuild> {


    @Override
    public void customize(GradleBuild build) {
        DependencyContainer.dependencies.forEach((s, dependency) -> build.dependencies().add(s, dependency));
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
