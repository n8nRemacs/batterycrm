package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class o5 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final p7 f388438a = new p7();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final zt0 f388439b = new zt0();

    @j.N
    public final Map<String, Object> a(@j.P g5 g5Var) {
        ly0 ly0Var = new ly0(new HashMap());
        if (g5Var != null) {
            Map<String, String> mapG = g5Var.g();
            this.f388438a.getClass();
            ly0 ly0Var2 = new ly0(new HashMap());
            if (mapG != null) {
                String str = mapG.get("adapter_network_name");
                String str2 = mapG.get("adapter_version");
                String str3 = mapG.get("adapter_network_sdk_version");
                ly0Var2.a(str, "adapter_network_name");
                ly0Var2.a(str2, "adapter_version");
                ly0Var2.a(str3, "adapter_network_sdk_version");
            }
            Map<String, Object> mapA = ly0Var2.a();
            this.f388439b.getClass();
            ly0 ly0Var3 = new ly0(new HashMap());
            if (mapG != null) {
                String str4 = mapG.get("plugin_type");
                String str5 = mapG.get("plugin_version");
                ly0Var3.a(str4, "plugin_type");
                ly0Var3.a(str5, "plugin_version");
            }
            Map<String, Object> mapA2 = ly0Var3.a();
            ly0Var.a(mapA);
            ly0Var.a(mapA2);
        }
        return ly0Var.a();
    }
}
