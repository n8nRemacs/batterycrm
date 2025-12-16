package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class nm1 implements dz0<ne1, List<ne1>> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final cd1 f388334a;

    public nm1(@j.N cd1 cd1Var) {
        this.f388334a = cd1Var;
    }

    @Override // com.yandex.mobile.ads.impl.dz0
    public final ky0 a(ne1 ne1Var) {
        HashMap map = new HashMap();
        map.put("page_id", this.f388334a.b());
        map.put("imp_id", this.f388334a.a());
        return new ky0(ky0.b.f387313n.a(), map);
    }

    @Override // com.yandex.mobile.ads.impl.dz0
    public final ky0 a(@j.P kz0<List<ne1>> kz0Var, int i12, @j.N ne1 ne1Var) {
        ky0.c cVar;
        List<ne1> list;
        HashMap map = new HashMap();
        map.put("page_id", this.f388334a.b());
        map.put("imp_id", this.f388334a.a());
        if (204 == i12) {
            cVar = ky0.c.f387329d;
        } else if (kz0Var != null && (list = kz0Var.f387334a) != null && i12 == 200) {
            cVar = list.isEmpty() ? ky0.c.f387329d : ky0.c.f387327b;
        } else {
            cVar = ky0.c.f387328c;
        }
        map.put("status", cVar.a());
        return new ky0(ky0.b.f387314o.a(), map);
    }
}
