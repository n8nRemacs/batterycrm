package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ky0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class gl0 implements ky0.a {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final el0 f385772a = new el0();

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private AdResponse<bl0> f385773b;

    public final void a(@j.N AdResponse<bl0> adResponse) {
        this.f385773b = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.ky0.a
    @j.N
    public final Map<String, Object> a() {
        ly0 ly0Var = new ly0(new HashMap());
        AdResponse<bl0> adResponse = this.f385773b;
        if (adResponse != null) {
            ArrayList arrayListA = this.f385772a.a(adResponse);
            if (!arrayListA.isEmpty()) {
                ly0Var.a(arrayListA, "image_sizes");
            }
            el0 el0Var = this.f385772a;
            AdResponse<bl0> adResponse2 = this.f385773b;
            el0Var.getClass();
            ArrayList arrayListC = el0.c(adResponse2);
            if (!arrayListC.isEmpty()) {
                ly0Var.a(arrayListC, "native_ad_types");
            }
            el0 el0Var2 = this.f385772a;
            AdResponse<bl0> adResponse3 = this.f385773b;
            el0Var2.getClass();
            ArrayList arrayListB = el0.b(adResponse3);
            if (!arrayListB.isEmpty()) {
                ly0Var.a(arrayListB, "ad_id");
            }
            ly0Var.a(this.f385773b.E(), "server_log_id");
            ly0Var.b(this.f385773b.l(), "ad_source");
            ly0Var.a(this.f385773b.c());
            Map<String, Object> mapR = this.f385773b.r();
            if (mapR != null) {
                ly0Var.a(mapR);
            }
            if (!this.f385773b.H()) {
                ly0Var.b(this.f385773b.n(), "ad_type_format");
                ly0Var.b(this.f385773b.A(), "product_type");
            }
            ly0Var.a(this.f385773b.v(), "design");
        }
        return ly0Var.a();
    }
}
