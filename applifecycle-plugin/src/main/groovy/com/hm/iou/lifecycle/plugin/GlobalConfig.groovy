package com.hm.iou.lifecycle.plugin;

 class GlobalConfig {

    static final PROXY_CLASS_PREFIX = "AppLife\$\$"
    static final PROXY_CLASS_SUFFIX = "\$\$Proxy.class"

    static final PROXY_CLASS_PACKAGE_NAME = "com/hm/iou/lifecycle/apt/proxy"

    static final REGISTER_CLASS_FILE_NAME = "com/hm/lifecycle/api/ApplicationLifecycleManager.class"

    static final INJECT_CLASS_NAME = "com/hm/lifecycle/api/ApplicationLifecycleManager"
    static final INJECT_METHOD_NAME = "registerApplicationLifecycleCallbacks"
    static final INJECT_PARAMS_DESC = "(Ljava/lang/String;)V"

}
