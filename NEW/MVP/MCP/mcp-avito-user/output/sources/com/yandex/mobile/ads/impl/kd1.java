package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class kd1 implements ms0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f387116a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final ye1 f387117b;

    public kd1(@Y61.k String str, @Y61.l ye1 ye1Var) {
        this.f387116a = str;
        this.f387117b = ye1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ms0
    @Y61.k
    public final Map<String, Object> a(long j12) {
        LinkedHashMap linkedHashMapJ = kotlin.collections.P0.j(new kotlin.Q("duration", Long.valueOf(j12)), new kotlin.Q("status", this.f387116a));
        ye1 ye1Var = this.f387117b;
        if (ye1Var != null) {
            linkedHashMapJ.put("failure_reason", ye1Var.c());
        }
        return linkedHashMapJ;
    }
}
