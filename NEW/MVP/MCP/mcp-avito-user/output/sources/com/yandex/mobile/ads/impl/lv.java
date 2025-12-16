package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class lv implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final x7 f387714a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final f8 f387715b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final ri1 f387716c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final jh1 f387717d;

    public lv(@Y61.k x7 x7Var, @Y61.k f8 f8Var, @Y61.k ri1 ri1Var, @Y61.k jh1 jh1Var) {
        this.f387714a = x7Var;
        this.f387715b = f8Var;
        this.f387716c = ri1Var;
        this.f387717d = jh1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Y61.k View view) {
        this.f387716c.a("feedback");
        this.f387717d.a((List<String>) this.f387714a.c(), (Map<String, String>) null);
        this.f387715b.a(view, this.f387714a);
    }
}
