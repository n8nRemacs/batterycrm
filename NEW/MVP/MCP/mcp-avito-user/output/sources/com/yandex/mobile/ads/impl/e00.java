package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ky0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class e00 implements ky0.a {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private AdResponse<String> f384720a;

    public final void a(@j.N AdResponse<String> adResponse) {
        this.f384720a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.ky0.a
    @j.N
    public final Map<String, Object> a() {
        ly0 ly0Var = new ly0(new HashMap());
        AdResponse<String> adResponse = this.f384720a;
        if (adResponse != null) {
            String strE = adResponse.e();
            ly0Var.a(strE != null ? Collections.singletonList(strE) : null, "ad_id");
            ly0Var.b(this.f384720a.l(), "ad_source");
            ly0Var.a(this.f384720a.E(), "server_log_id");
            ly0Var.a(this.f384720a.c());
            Map<String, Object> mapR = this.f384720a.r();
            if (mapR != null) {
                ly0Var.a(mapR);
            }
            ly0Var.a(this.f384720a.v(), "design");
            if (!this.f384720a.H()) {
                ly0Var.b(this.f384720a.n(), "ad_type_format");
                ly0Var.b(this.f384720a.A(), "product_type");
            }
            ly0Var.b(m41.b(this.f384720a.F().d()), "size_type");
            ly0Var.b(Integer.valueOf(this.f384720a.F().e()), "width");
            ly0Var.b(Integer.valueOf(this.f384720a.F().c()), "height");
        }
        return ly0Var.a();
    }
}
