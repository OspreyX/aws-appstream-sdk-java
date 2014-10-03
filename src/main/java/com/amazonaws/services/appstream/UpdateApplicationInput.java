/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.appstream;


import java.util.List;


public class UpdateApplicationInput {

    //-------------------------------------------------------------
    // Variables - Private
    //-------------------------------------------------------------

    private String name;
    private String description;
    private String launchPath;
    private String launchParameters;
    private String logBucket;
    private List<String> logPaths;


    //-------------------------------------------------------------
    // Constructors
    //-------------------------------------------------------------

    public UpdateApplicationInput() {
    }


    public UpdateApplicationInput(String name, String description, String launchPath, String launchParameters,
                                  String logBucket, List<String> logPaths) {
        this.name = name;
        this.description = description;
        this.launchPath = launchPath;
        this.launchParameters = launchParameters;
        this.logBucket = logBucket;
        this.logPaths = logPaths;
    }


    //-------------------------------------------------------------
    // Methods - Getter/Setter
    //-------------------------------------------------------------

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getLaunchPath() {
        return launchPath;
    }


    public void setLaunchPath(String launchPath) {
        this.launchPath = launchPath;
    }


    public String getLaunchParameters() {
        return launchParameters;
    }


    public void setLaunchParameters(String launchParameters) {
        this.launchParameters = launchParameters;
    }


    public String getLogBucket() {
        return logBucket;
    }
    

    public void setLogBucket(String logBucket) {
        this.logBucket = logBucket;
    }


    public List<String> getLogPaths() {
        return logPaths;
    }


    public void setLogPaths(List<String> logPaths) {
        this.logPaths = logPaths;
    }
}
