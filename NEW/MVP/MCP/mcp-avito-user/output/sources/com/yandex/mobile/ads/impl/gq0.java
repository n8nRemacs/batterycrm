package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gz;
import com.yandex.mobile.ads.impl.ry0;
import com.yandex.mobile.ads.impl.uy0;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class gq0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final cc1 f385812a;

    public gq0(@Y61.l cc1 cc1Var) {
        this.f385812a = cc1Var;
    }

    @Y61.k
    public final ry0 a(@Y61.k qy0<?> qy0Var, @Y61.k Map<String, String> map) {
        URL urlA = ip0.a(qy0Var, this.f385812a);
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.P0.k(map, qy0Var.f()));
        if (!linkedHashMap.containsKey("Content-Type")) {
            linkedHashMap.put("Content-Type", qy0.c());
        }
        gz gzVarA = gz.b.a(linkedHashMap);
        int iA2 = kg0.a(qy0Var);
        byte[] bArrB = qy0Var.b();
        return new ry0.a().a(urlA).a(gzVarA).a(lg0.a(iA2), bArrB != null ? uy0.a.b(bArrB) : null).a();
    }
}
