package com.xingsk.initializr.custom;

import io.spring.initializr.generator.buildsystem.Dependency;
import io.spring.initializr.generator.buildsystem.DependencyScope;
import io.spring.initializr.generator.version.VersionReference;

import java.util.HashMap;
import java.util.Map;

/**
 * DependencyContainer
 *
 * @author : xingshukui
 * @date : 2021/7/24 8:18 下午
 * @desc :
 */
public class DependencyContainer {
    public static Map<String, Dependency> dependencies = new HashMap<>();


    static {
        dependencies.put("lombok", Dependency.withCoordinates("org.projectlombok", "lombok").build());
        dependencies.put("spring-web", Dependency.withCoordinates("org.springframework.boot", "spring-boot-starter-web").build());

        dependencies.put("spock-spring", Dependency.withCoordinates("org.spockframework", "spock-spring").version(VersionReference.ofValue("1.3-RC1-groovy-2.4")).scope(DependencyScope.TEST_RUNTIME).build());
    }
}
