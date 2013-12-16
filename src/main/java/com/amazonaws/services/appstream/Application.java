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


import com.amazonaws.hal.Link;
import com.amazonaws.hal.ResourceInfo;
import com.amazonaws.hal.UriVariable;
import com.amazonaws.http.HttpMethodName;

import java.util.Date;


public interface Application extends ResourceInfo {

    //-------------------------------------------------------------
    // Links
    //-------------------------------------------------------------

    @Link(relation = "application:update", method = HttpMethodName.POST)
    Application update(UpdateApplicationInput updateApplicationInput);

    @Link(relation = "application:archive", method = HttpMethodName.PUT)
    ApplicationStatus archive(ArchiveApplicationInput archiveApplicationInput);

    @Link(relation = "application:reactivate", method = HttpMethodName.PUT)
    ApplicationStatus reactivate(ReactivateApplicationInput reactivateApplicationInput);

    @Link(relation = "application:delete", method = HttpMethodName.DELETE)
    Applications delete();

    @Link(relation = "application:status")
    ApplicationStatus getStatus();

    @Link(relation = "application:errors")
    ApplicationErrors getErrors();

    @Link(relation = "application:sessions")
    Sessions getSessions();

    @Link(relation = "session:by-id")
    Session getSessionById(@UriVariable(name = "session-id") String sessionId);

    @Link(relation = "session:entitle", method = HttpMethodName.POST)
    Session entitleSession(EntitleSessionInput entitleSessionInput);

    @Link(relation = "collection")
    Applications getCollection();


    //-------------------------------------------------------------
    // Properties
    //-------------------------------------------------------------

    String getId();
    String getName();
    String getDescription();
    String getInstallerUrl();
    String getInstallerParameters();
    String getLaunchCommand();
    int getApplicationErrorCount();
    int getActiveSessions();
    int getAvailableSessions();
    int getSessionErrorCount();
    Date getCreatedDate();
    Date getLastUpdatedDate();
}
