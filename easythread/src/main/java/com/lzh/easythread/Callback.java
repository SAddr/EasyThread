/*
 * Copyright (C) 2017 Haoge
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lzh.easythread;

/**
 * A call to notify user when thread task occurs an error or completed
 */
public interface Callback {

    /**
     * This method will be invoked when thread has been occurs an error.
     * @param thread The thread who has been occurs an error
     * @param t The exception
     */
    void onError (Thread thread, Throwable t);

    /**
     * notify user to know that it completed.
     * @param thread The running thread
     */
    void onCompleted (Thread thread);

    /**
     * notify user that task start running
     * @param thread The running thread
     */
    void onStart (Thread thread);
}
