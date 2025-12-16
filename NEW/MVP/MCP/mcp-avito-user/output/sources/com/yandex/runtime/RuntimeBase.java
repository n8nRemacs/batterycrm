package com.yandex.runtime;

import j.N;
import java.util.Map;

/* loaded from: classes8.dex */
public class RuntimeBase {
    @N
    public static native String getVersion();

    public static native void setPreinitializationOptions(@N Map<String, String> map);
}
