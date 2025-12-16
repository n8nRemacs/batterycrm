package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class nk1 implements dz0<jk1, ek1> {
    @Override // com.yandex.mobile.ads.impl.dz0
    public final ky0 a(jk1 jk1Var) {
        jk1 jk1Var2 = jk1Var;
        HashMap map = new HashMap();
        map.put("page_id", jk1Var2.c());
        map.put("category_id", jk1Var2.b());
        return new ky0(ky0.b.f387318s.a(), map);
    }

    @Override // com.yandex.mobile.ads.impl.dz0
    public final ky0 a(@j.P kz0<ek1> kz0Var, int i12, @j.N jk1 jk1Var) {
        jk1 jk1Var2 = jk1Var;
        HashMap map = new HashMap();
        map.put("page_id", jk1Var2.c());
        map.put("category_id", jk1Var2.b());
        if (i12 != -1) {
            map.put("code", Integer.valueOf(i12));
        }
        return new ky0(ky0.b.f387319t.a(), map);
    }
}
