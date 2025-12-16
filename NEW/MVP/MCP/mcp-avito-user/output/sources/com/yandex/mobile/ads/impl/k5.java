package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class k5 implements ky0.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final n2 f387046a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final o5 f387047b = new o5();

    public k5(@Y61.k n2 n2Var) {
        this.f387046a = n2Var;
    }

    @Override // com.yandex.mobile.ads.impl.ky0.a
    @Y61.k
    public final Map<String, Object> a() {
        LinkedHashMap linkedHashMapJ = kotlin.collections.P0.j(new kotlin.Q("ad_type", this.f387046a.b().a()));
        String strC = this.f387046a.c();
        if (strC != null) {
            linkedHashMapJ.put("block_id", strC);
            linkedHashMapJ.put("ad_unit_id", strC);
        }
        linkedHashMapJ.putAll(this.f387047b.a(this.f387046a.a()));
        return linkedHashMapJ;
    }
}
