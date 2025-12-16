package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class n7 implements ms0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ky0.c f388176a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final String f388177b;

    public n7(@j.N ky0.c cVar, @j.P String str) {
        this.f388176a = cVar;
        this.f388177b = str;
    }

    @Override // com.yandex.mobile.ads.impl.ms0
    @j.N
    public final Map<String, Object> a(long j12) {
        ly0 ly0Var = new ly0(new HashMap());
        ly0Var.b(this.f388177b, "adapter");
        ly0Var.b(this.f388176a.a(), "status");
        ly0Var.b(Long.valueOf(j12), "duration");
        return ly0Var.a();
    }
}
