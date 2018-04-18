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

    This class models the patient
 */

public class Patient {

    private String fullname;
    private String sex;
    private String dob;
    private String email;
    private String password;

    private MedFriend friend;

    private Boolean shareMeds; // if to share meds with friend

    /*
    Patient constructor
    sets the Patient attributes
     */
    public Patient(String fullname, String sex, String dob, String email, String phone, String password){
        this.fullname = fullname;
        this.sex = sex;
        this.dob = dob;
        this.email = email;
        this.password = password;
    }

    /*
        Patient fullname getter
        Returns String
     */
    public String getFullname(){
        return this.fullname;
    }

    /*
        Patient sex getter
        Returns String
     */
    public String getSex(){
        return this.sex;
    }

    /*
        Patient dob getter
        Returns String
     */
    public String getDob() {
        return this.dob;
    }

    /*
        Patient email getter
        Returns String
     */
    public String getEmail() {
        return this.email;
    }

    /*
        Patient password getter
        Returns String
     */
    public String getPassword() {
        return this.password;
    }

    /*
        Patient medFriend accessor
        Sets medFriend object
     */
    public void setMedFriend(MedFriend friend){
        this.friend = friend;
    }

    /*
        Patient friend getter
        Returns MedFriend object
     */
    public MedFriend getFriend() {
        return this.friend;
    }

    /*
        Patient shareMeds accessor
        Sets shareMeds - Boolean
     */
    public void setShareMeds(Boolean shareMeds) {
        this.shareMeds = shareMeds;
    }

    /*
        Patient shareMeds getter
        Returns Boolean
     */
    public Boolean getShareMeds() {
        return this.shareMeds;
    }
}
