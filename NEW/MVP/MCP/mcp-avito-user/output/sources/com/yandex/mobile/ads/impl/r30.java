package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class r30 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ny0 f389365a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final n2 f389366b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final o5 f389367c = new o5();

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private AdResponse f389368d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private ky0.a f389369e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private final v11 f389370f;

    public r30(@j.N Context context, @j.N n2 n2Var) {
        this.f389366b = n2Var;
        this.f389365a = m9.a(context);
        this.f389370f = q21.b().a(context);
    }

    public final void a(@j.N ky0.b bVar) {
        this.f389365a.a(new ky0(bVar.a(), a()));
    }

    public final void b(@j.N xc1 xc1Var) {
        Map<String, Object> mapA = a();
        mapA.put("reason", xc1Var.e().a());
        String strA = xc1Var.a();
        if (!TextUtils.isEmpty(strA)) {
            mapA.put("asset_name", strA);
        }
        this.f389365a.a(new ky0(xc1Var.c().a(), mapA));
    }

    public final void a(@j.N ky0.b bVar, @j.N HashMap map) {
        Map<String, Object> mapA = a();
        mapA.putAll(map);
        this.f389365a.a(new ky0(bVar.a(), mapA));
    }

    public final void a(@j.N xc1 xc1Var) {
        Map<String, Object> mapA = a();
        mapA.put("reason", xc1Var.e().a());
        String strA = xc1Var.a();
        if (!TextUtils.isEmpty(strA)) {
            mapA.put("asset_name", strA);
        }
        this.f389365a.a(new ky0(xc1Var.b().a(), mapA));
    }

    @j.N
    private Map<String, Object> a() {
        ly0 ly0Var = new ly0(new HashMap());
        ly0Var.b("Yandex", "adapter");
        AdResponse adResponse = this.f389368d;
        if (adResponse != null) {
            ly0Var.b(adResponse.o(), "block_id");
            ly0Var.b(this.f389368d.o(), "ad_unit_id");
            ly0Var.b(this.f389368d.n(), "ad_type_format");
            ly0Var.b(this.f389368d.A(), "product_type");
            ly0Var.b(this.f389368d.l(), "ad_source");
            ly0Var.a(this.f389368d.c());
            Map<String, Object> mapR = this.f389368d.r();
            if (mapR != null) {
                ly0Var.a(mapR);
            }
            SizeInfo sizeInfoN = this.f389366b.n();
            if (sizeInfoN != null) {
                ly0Var.b(m41.b(sizeInfoN.d()), "size_type");
                ly0Var.b(Integer.valueOf(sizeInfoN.e()), "width");
                ly0Var.b(Integer.valueOf(sizeInfoN.c()), "height");
            }
            y6 y6VarM = this.f389368d.m();
            if (y6VarM != null) {
                ly0Var.b(y6VarM.a(), "ad_type");
            } else {
                ly0Var.a("ad_type");
            }
        } else {
            ly0Var.a("block_id");
            ly0Var.a("ad_unit_id");
            ly0Var.a("ad_type_format");
            ly0Var.a("product_type");
            ly0Var.a("ad_source");
        }
        v11 v11Var = this.f389370f;
        if (v11Var != null) {
            ly0Var.b(v11Var.e(), "banner_size_calculation_type");
        }
        ly0Var.a(this.f389367c.a(this.f389366b.a()));
        ky0.a aVar = this.f389369e;
        if (aVar != null) {
            ly0Var.a(aVar.a());
        }
        return ly0Var.a();
    }

    public final void a(@j.N AdResponse adResponse) {
        this.f389368d = adResponse;
    }

    public final void a(@j.N ky0.a aVar) {
        this.f389369e = aVar;
    }
}
