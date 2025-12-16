package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class lk0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final eb f387553a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final j2 f387554b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.w f387555c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final tw f387556d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final tx0 f387557e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private final h90 f387558f;

    public lk0(@j.N tw twVar, @j.N tx0 tx0Var, @j.N j2 j2Var, @j.N com.yandex.mobile.ads.nativeads.w wVar, @j.N eb ebVar, @j.P h90 h90Var) {
        this.f387553a = ebVar;
        this.f387554b = j2Var;
        this.f387555c = wVar;
        this.f387557e = tx0Var;
        this.f387558f = h90Var;
        this.f387556d = twVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jA2 = this.f387557e.a();
        h90 h90Var = this.f387558f;
        if (h90Var == null || jA2 < h90Var.b() || !this.f387553a.e()) {
            return;
        }
        this.f387556d.a();
        this.f387554b.a(view, this.f387553a, this.f387558f, this.f387555c);
    }
}
