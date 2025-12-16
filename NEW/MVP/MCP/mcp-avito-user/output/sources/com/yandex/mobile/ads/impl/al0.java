package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ky0;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class al0 extends te<bl0> {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final el0 f383591c = new el0();

    @Override // com.yandex.mobile.ads.impl.te
    @j.N
    public final HashMap a(@j.N n2 n2Var) {
        HashMap mapA = super.a(n2Var);
        mapA.put("image_loading_automatically", Boolean.valueOf(n2Var.q()));
        String[] strArrK = n2Var.k();
        if (strArrK != null && strArrK.length > 0) {
            mapA.put("image_sizes", n2Var.k());
        }
        return mapA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.te
    @j.N
    public final HashMap a(int i12, @j.N n2 n2Var, @j.P kz0 kz0Var) {
        ky0.c cVar;
        T t12;
        T t13;
        HashMap mapA = super.a(i12, n2Var, kz0Var);
        if (204 == i12) {
            cVar = ky0.c.f387329d;
        } else if (kz0Var != null && (t12 = kz0Var.f387334a) != 0 && i12 == 200) {
            AdResponse adResponse = (AdResponse) t12;
            this.f383591c.getClass();
            bl0 bl0Var = (bl0) adResponse.B();
            if (bl0Var != null) {
                cVar = (ky0.c) bl0Var.f().get("status");
            } else {
                cVar = adResponse.z() == null ? ky0.c.f387328c : null;
            }
        } else {
            cVar = ky0.c.f387328c;
        }
        if (cVar != null) {
            mapA.put("status", cVar.a());
        }
        if (kz0Var != null && (t13 = kz0Var.f387334a) != 0) {
            ArrayList arrayListA = this.f383591c.a((AdResponse) t13);
            if (!arrayListA.isEmpty()) {
                mapA.put("image_sizes", arrayListA.toArray(new String[arrayListA.size()]));
            }
            AdResponse adResponse2 = (AdResponse) kz0Var.f387334a;
            this.f383591c.getClass();
            ArrayList arrayListC = el0.c(adResponse2);
            if (!arrayListC.isEmpty()) {
                mapA.put("native_ad_types", arrayListC.toArray(new String[arrayListC.size()]));
            }
        }
        return mapA;
    }
}
