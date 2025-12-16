package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ky0;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class pj0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ny0 f388866a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final wb f388867b;

    public pj0(@Y61.k Context context, @Y61.k t3 t3Var, @Y61.k y6 y6Var, @Y61.l String str) {
        this.f388866a = m9.a(context);
        this.f388867b = new wb(t3Var, y6Var, str);
    }

    public final void a(@Y61.k ky0.a aVar) {
        this.f388867b.a(aVar);
    }

    public final void a(@Y61.k ArrayList arrayList, @Y61.k ky0.b bVar) {
        ly0 ly0Var = new ly0(new HashMap());
        ly0Var.b(arrayList, "assets");
        ly0Var.a(this.f388867b.a());
        this.f388866a.a(new ky0(bVar, ly0Var.a()));
    }
}
