package com.xingsk.initializr.custom;

import io.spring.initializr.generator.project.contributor.ProjectContributor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * DefaultFoldersContributor
 *
 * @author : xingshukui
 * @date : 2021/7/24 8:54 下午
 * @desc :
 */
public class DefaultFoldersContributor implements ProjectContributor {

    @Override
    public void contribute(Path projectRoot) throws IOException {
        Files.createDirectories(projectRoot.resolve("src/main/java/com/xingsk/utils"));
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
