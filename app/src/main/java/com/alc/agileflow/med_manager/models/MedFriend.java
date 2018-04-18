/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alc.agileflow.med_manager.models;

/*
    Created by agileflow on 29/3/2018.

    This class models the patient medfriend -
    A family or friend of patient that helps the to remember to take meds medication
    MedFriend calendar is set for meds notification
 */

public class MedFriend {

    private String fullname;
    private String phone;
    private String email;

    /*
        MedFriend constructor
     */
    public MedFriend(String fullname, String phone, String email){
        this.fullname = fullname;
        this.phone = phone;
        this.email = email;
    }

    /*
        Gets MedFriend fullname
        Returns String
     */
    public String getFullname() {
        return this.fullname;
    }

    /*
        Gets MedFriend phone
        Returns String
     */
    public String getPhone() {
        return this.phone;
    }

    /*
        Gets MedFriend email
        Returns String
     */
    public String getEmail() {
        return this.email;
    }
}
