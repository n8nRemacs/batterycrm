package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class rz0 {
    @X41.n
    @Y61.k
    public static final Map<String, Object> a(@Y61.l AdResponse<?> adResponse) {
        y6 y6VarM;
        ly0 ly0Var = new ly0(new LinkedHashMap());
        ly0Var.b(adResponse != null ? adResponse.o() : null, "block_id");
        ly0Var.b(adResponse != null ? adResponse.o() : null, "ad_unit_id");
        ly0Var.b(adResponse != null ? adResponse.n() : null, "ad_type_format");
        ly0Var.b(adResponse != null ? adResponse.A() : null, "product_type");
        ly0Var.b(adResponse != null ? adResponse.l() : null, "ad_source");
        ly0Var.b((adResponse == null || (y6VarM = adResponse.m()) == null) ? null : y6VarM.a(), "ad_type");
        ly0Var.a(adResponse != null ? adResponse.v() : null, "design");
        return ly0Var.a();
    }
}
