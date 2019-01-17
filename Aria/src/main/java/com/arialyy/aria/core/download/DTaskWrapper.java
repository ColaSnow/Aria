/*
 * Copyright (C) 2016 AriaLyy(https://github.com/AriaLyy/Aria)
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
package com.arialyy.aria.core.download;

import com.arialyy.aria.core.inf.AbsTaskWrapper;

/**
 * Created by lyy on 2017/1/23. 下载任务实体和下载实体为一对一关系，下载实体删除，任务实体自动删除
 */
public class DTaskWrapper extends AbsTaskWrapper<DownloadEntity> {

  /**
   * 任务的url
   */
  private String url;

  /**
   * 所属的任务组组名，如果不属于任务组，则为null
   */
  private String groupName;

  /**
   * 该任务是否属于任务组
   */
  private boolean isGroupTask = false;

  /**
   * Task实体对应的key
   */
  private String key;

  public DTaskWrapper(DownloadEntity entity) {
    super(entity);
  }

  @Override public String getKey() {
    return key;
  }

  @Override public void setKey(String key) {
    this.key = key;
  }

  public String getUrl() {
    return url;
  }

  public String getGroupName() {
    return groupName;
  }

  public boolean isGroupTask() {
    return isGroupTask;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public void setGroupTask(boolean groupTask) {
    isGroupTask = groupTask;
  }
}
