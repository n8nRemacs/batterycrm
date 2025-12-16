package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class r31 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final o5 f389371a = new o5();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ny0 f389372b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final AdResponse f389373c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final n2 f389374d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final ky0.a f389375e;

    public r31(@j.N Context context, @j.N AdResponse adResponse, @j.N n2 n2Var, @j.P ky0.a aVar) {
        this.f389374d = n2Var;
        this.f389373c = adResponse;
        this.f389375e = aVar;
        this.f389372b = m9.a(context);
    }

    public final void a(@j.N List<r51> list) {
        ly0 ly0Var = new ly0(new HashMap());
        y6 y6VarM = this.f389373c.m();
        if (y6VarM != null) {
            ly0Var.b(y6VarM.a(), "ad_type");
        } else {
            ly0Var.a("ad_type");
        }
        ly0Var.b(this.f389373c.o(), "block_id");
        ly0Var.b(this.f389373c.o(), "ad_unit_id");
        ly0Var.b("Yandex", "adapter");
        ly0Var.b(this.f389373c.n(), "ad_type_format");
        ly0Var.b(this.f389373c.A(), "product_type");
        ly0Var.b(this.f389373c.l(), "ad_source");
        String[] strArr = new String[list.size()];
        for (int i12 = 0; i12 < list.size(); i12++) {
            strArr[i12] = list.get(i12).b();
        }
        ly0Var.b(strArr, "social_actions");
        ly0Var.a(this.f389371a.a(this.f389374d.a()));
        ky0.a aVar = this.f389375e;
        if (aVar != null) {
            ly0Var.a(aVar.a());
        }
        ky0.b bVar = ky0.b.f387284E;
        this.f389372b.a(new ky0(bVar.a(), ly0Var.a()));
    }
}
