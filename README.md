# Android context api

[![](https://jitpack.io/v/ve3344/android-context.svg)](https://jitpack.io/#ve3344/android-context)

使用统一的方式获取Android context

- 支持自定义初始化
- 支持使用 androidstartup 自动初始化
- 支持使用 appstartup 自动初始化
- 支持使用 contentprovider 自动初始化

# 安装

add repository

```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```

#### 使用自定义初始化或作为库使用时

```groovy
api 'me.lwb.context:api:<latest-version>'
```

#### 使用 content-provider 自动初始化

```groovy
api 'me.lwb.context:content-provider:<latest-version>'
```

#### 使用 androidstartup 自动初始化（如果已经使用androidstartup库）

```groovy
api 'me.lwb.context:androidstartup:<latest-version>'
```

#### 使用 appstartup 自动初始化（如果已经使用appstartup库）

```groovy
api 'me.lwb.context:appstartup:<latest-version>'
```

# 使用

##### 初始化（如果使用自动初始化可忽略）

```kotlin
ContextHolder.contextInternal = context
```

##### 获取context

```kotlin
val context = AppContext.context
```

# License

``` license
 Copyright 2021, luowenbin 
  
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at 
 
       http://www.apache.org/licenses/LICENSE-2.0 

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```