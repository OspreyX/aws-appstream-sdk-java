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


public class CreateApplicationInput {

    //-------------------------------------------------------------
    // Variables - Private
    //-------------------------------------------------------------

    private String name;
    private String description;
    private String installerUrl;
    private String installerParameters;
    private String launchPath;
    private String launchParameters;


    //-------------------------------------------------------------
    // Constructors
    //-------------------------------------------------------------

    public CreateApplicationInput() {
    }


    public CreateApplicationInput(String name, String description, String installerUrl,
                                  String installerParameters, String launchPath, String launchParameters) {
        this.name = name;
        this.description = description;
        this.installerUrl = installerUrl;
        this.installerParameters = installerParameters;
        this.launchPath = launchPath;
        this.launchParameters = launchParameters;
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


    public String getInstallerUrl() {
        return installerUrl;
    }


    public void setInstallerUrl(String installerUrl) {
        this.installerUrl = installerUrl;
    }


    public String getInstallerParameters() {
        return installerParameters;
    }


    public void setInstallerParameters(String installerParameters) {
        this.installerParameters = installerParameters;
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
}
