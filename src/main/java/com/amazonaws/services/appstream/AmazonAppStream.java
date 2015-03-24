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


import java.net.URI;
import java.util.Map;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.hal.HalService;
import com.amazonaws.util.AwsHostNameUtils;


public class AmazonAppStream {

    //-------------------------------------------------------------
    // Constants
    //-------------------------------------------------------------

    private static final String DEFAULT_ENDPOINT = "appstream.us-east-1.amazonaws.com";
    private static final String SERVICE_NAME = "appstream";
    private static final String DEFAULT_REGION_ID = "us-east-1";    


    //-------------------------------------------------------------
    // Variables - Private
    //-------------------------------------------------------------

    private HalService<AppStream> appStreamService;


    //-------------------------------------------------------------
    // Constructors
    //-------------------------------------------------------------

    public AmazonAppStream() {
        this(DEFAULT_ENDPOINT);
    }


    public AmazonAppStream(String endpoint) {
        this(endpoint, getRegion(endpoint));
    }
    
    public AmazonAppStream(String endpoint, String region){
        if (endpoint == null || region == null) {    
            throw new IllegalArgumentException("Endpoint and region cannot be null. Endpoint: " + endpoint + " Region: " + region);
        }
        this.appStreamService = new HalService<>(endpoint, SERVICE_NAME, region, AppStream.class);
    }


    //-------------------------------------------------------------
    // Methods - Configuration
    //-------------------------------------------------------------

    public AmazonAppStream with(ClientConfiguration clientConfiguration) {
        appStreamService.with(clientConfiguration);

        return this;
    }


    public AmazonAppStream with(AWSCredentialsProvider awsCredentialsProvider) {
        appStreamService.with(awsCredentialsProvider);

        return this;
    }


    public AmazonAppStream with(Map<String, Object> resourceCache) {
        appStreamService.with(resourceCache);

        return this;
    }


    //-------------------------------------------------------------
    // Methods - Getter/Setter
    //-------------------------------------------------------------

    public AppStream getAppStream() {
        return appStreamService.getRootResource();
    }
    

    //-------------------------------------------------------------
    // Methods - Get region from endpoint
    //-------------------------------------------------------------
    
    private static String getRegion(final String endpoint) {
        if (endpoint == null){
            return DEFAULT_REGION_ID;
        }
        
        if (endpoint.toLowerCase().contains("http")) {
            return AwsHostNameUtils.parseRegionName(URI.create(endpoint).getHost(), null);
        } else {
            return AwsHostNameUtils.parseRegionName(endpoint, null);
        }
    }
}
