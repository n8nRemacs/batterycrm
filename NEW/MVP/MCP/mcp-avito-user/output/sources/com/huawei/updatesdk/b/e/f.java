package com.huawei.updatesdk.b.e;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, a> f363848a = new ConcurrentHashMap();

    public static a a(boolean z12) {
        String str = z12 ? "apptouch" : "default";
        if (TextUtils.isEmpty(str)) {
            return new c();
        }
        Map<String, a> map = f363848a;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        map.put(str, "apptouch".equals(str) ? new b() : new c());
        return map.get(str);
    }
}
