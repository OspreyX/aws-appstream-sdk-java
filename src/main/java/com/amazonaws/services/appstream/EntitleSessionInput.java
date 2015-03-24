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


public class EntitleSessionInput {

    //-------------------------------------------------------------
    // Variables - Private
    //-------------------------------------------------------------

    private String opaqueData;
    private long expirationDuration = 1;

    //-------------------------------------------------------------
    // Constructors
    //-------------------------------------------------------------

    public EntitleSessionInput() {
    }


    public EntitleSessionInput(String opaqueData) {
        this.opaqueData = opaqueData;
    }
    
    public EntitleSessionInput(long expirationDuration) {
        this.expirationDuration = expirationDuration;
    }
    
    public EntitleSessionInput(String opaqueData, long expirationDuration) {
        this.opaqueData = opaqueData;
        this.expirationDuration = expirationDuration;
    }

    //-------------------------------------------------------------
    // Methods - Getter/Setter
    //-------------------------------------------------------------

    public String getOpaqueData() {
        return opaqueData;
    }


    public void setOpaqueData(String opaqueData) {
        this.opaqueData = opaqueData;
    }
    
    
    public long getExpirationDuration() {
        return expirationDuration;
    }


    public void setExpirationDuration(long expirationDuration) {
        this.expirationDuration = expirationDuration;
    }
}
