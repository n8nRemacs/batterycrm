package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class pl0 implements ky0.a {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final n2 f388880a;

    public pl0(@j.N n2 n2Var) {
        this.f388880a = n2Var;
    }

    @Override // com.yandex.mobile.ads.impl.ky0.a
    @j.N
    public final Map<String, Object> a() {
        HashMap map = new HashMap();
        String[] strArrK = this.f388880a.k();
        if (strArrK != null && strArrK.length > 0) {
            map.put("image_sizes", Arrays.asList(strArrK));
        }
        return map;
    }
}
