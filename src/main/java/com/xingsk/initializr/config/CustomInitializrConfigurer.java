package com.xingsk.initializr.config;

import com.xingsk.initializr.custom.DefaultFoldersContributor;
import com.xingsk.initializr.custom.DefaultProjectDescriptionCustomizer;
import com.xingsk.initializr.custom.DependenciesCustomizer;
import io.spring.initializr.generator.buildsystem.gradle.GradleBuild;
import io.spring.initializr.generator.project.ProjectGenerationConfiguration;
import io.spring.initializr.generator.spring.build.BuildCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * CustomInitializrConfigurer
 *
 * @author : xingshukui
 * @date : 2021/7/24 8:26 下午
 * @desc :
 */
@ProjectGenerationConfiguration
public class CustomInitializrConfigurer {

    @Bean
    public BuildCustomizer<GradleBuild> customDependencyConfigurer() {
        return new DependenciesCustomizer();
    }


    @Bean
    public DefaultFoldersContributor defaultFoldersContributor() {
        return new DefaultFoldersContributor();
    }

    @Bean
    public DefaultProjectDescriptionCustomizer defaultProjectDescriptionCustomizer() {
        return new DefaultProjectDescriptionCustomizer();
    }
//
//
//    @Bean
//    public CustomPluginCustomizer customPluginCustomizer() {
//        return new CustomPluginCustomizer();
//    }
//
//    @Bean
//    public CustomResourceCustomizer customResourceCustomizer() {
//        return new CustomResourceCustomizer();
//    }
//
//    @Bean
//    public CustomSettingCustomizer customSettingCustomizer() {
//        return new CustomSettingCustomizer();
//    }
//
//    @Bean
//    public AssemblyPropertiesProjectContributor assemblyPropertiesProjectContributor() {
//        return new AssemblyPropertiesProjectContributor();
//    }
//
//    @Bean
//    public DefaultConfigProjectContributor defaultConfigProjectContributor() {
//        return new DefaultConfigProjectContributor();
//    }
//
//    @Bean
//    public LogConfigProjectContributor logConfigProjectContributor() {
//        return new LogConfigProjectContributor();
//    }
}
