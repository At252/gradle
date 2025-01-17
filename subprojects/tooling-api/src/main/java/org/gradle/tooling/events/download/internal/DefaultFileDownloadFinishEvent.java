/*
 * Copyright 2021 the original author or authors.
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

package org.gradle.tooling.events.download.internal;

import org.gradle.tooling.events.OperationResult;
import org.gradle.tooling.events.download.FileDownloadFinishEvent;
import org.gradle.tooling.events.download.FileDownloadOperationDescriptor;
import org.gradle.tooling.events.internal.DefaultFinishEvent;

public class DefaultFileDownloadFinishEvent extends DefaultFinishEvent implements FileDownloadFinishEvent {
    public DefaultFileDownloadFinishEvent(long eventTime, String displayName, FileDownloadOperationDescriptor descriptor, OperationResult result) {
        super(eventTime, displayName, descriptor, result);
    }

    @Override
    public FileDownloadOperationDescriptor getDescriptor() {
        return (FileDownloadOperationDescriptor) super.getDescriptor();
    }
}
