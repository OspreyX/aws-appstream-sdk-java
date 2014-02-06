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

import java.util.List;


public interface Applications extends ResourceInfo {

    //-------------------------------------------------------------
    // Links
    //-------------------------------------------------------------

    @Link(relation = "application:by-id")
    Application getById(@UriVariable(name = "application_id") String applicationId);

    @Link(relation = "application:create", method = HttpMethodName.POST)
    Application create(CreateApplicationInput createApplicationInput);

    @Link(relation = "item")
    List<Application> getItems();

    @Link(relation = "next")
    Applications getNext();

    @Link(relation = "first")
    Applications getFirst();
}
