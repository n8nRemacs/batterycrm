package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ne0 implements d6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse f388230a;

    public ne0(@j.N AdResponse adResponse) {
        this.f388230a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.d6
    @j.N
    public final Map<String, Object> a() {
        ly0 ly0Var = new ly0(new HashMap());
        ly0Var.b(this.f388230a.l(), "ad_source");
        ly0Var.b(this.f388230a.o(), "block_id");
        ly0Var.b(this.f388230a.o(), "ad_unit_id");
        ly0Var.a(this.f388230a.E(), "server_log_id");
        return ly0Var.a();
    }
}
