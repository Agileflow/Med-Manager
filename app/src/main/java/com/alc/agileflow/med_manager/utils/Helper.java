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

package com.alc.agileflow.med_manager.utils;

import android.content.Context;
import android.widget.Toast;

/*
    Created by agileflow on 28/3/2018.

    Helper class
    This class contains helper functions that performs minor tasks
 */


public class Helper {

    /*
        This function parameters are context and a message
        and it shows a Toast
     */
    public static void showToast(Context context, String message){
        Toast.makeText(context,
                message,
                Toast.LENGTH_SHORT).show();
    }
}
