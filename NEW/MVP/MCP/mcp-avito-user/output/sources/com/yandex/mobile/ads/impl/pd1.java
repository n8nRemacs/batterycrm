package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes8.dex */
public final class pd1 implements yy0<ed1> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final yy0<List<ne1>> f388789a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final rd1 f388790b;

    public pd1(@Y61.k Context context, @Y61.k jd1 jd1Var) {
        this.f388789a = jd1Var;
        this.f388790b = new rd1(context);
    }

    @Override // com.yandex.mobile.ads.impl.yy0
    public final void a(ed1 ed1Var) {
        List<ne1> listB = ed1Var.b().b();
        this.f388790b.a(listB, new od1(this, listB));
    }

    @Override // com.yandex.mobile.ads.impl.yy0
    public final void a(@Y61.k ye1 ye1Var) {
        this.f388789a.a(ye1Var);
    }
}
