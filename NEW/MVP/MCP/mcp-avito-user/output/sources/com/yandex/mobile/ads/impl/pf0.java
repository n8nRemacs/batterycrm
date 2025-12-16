package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.nativeads.C39386b;

/* loaded from: classes8.dex */
final class pf0 implements mo0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final mo0 f388795a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final com.monetization.ads.mediation.nativeads.a f388796b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final of0 f388797c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f388798d = false;

    public pf0(@j.N mo0 mo0Var, @j.N com.monetization.ads.mediation.nativeads.a aVar, @j.N of0 of0Var) {
        this.f388795a = mo0Var;
        this.f388796b = aVar;
        this.f388797c = of0Var;
    }

    @Override // com.yandex.mobile.ads.impl.mo0
    public final void a(@j.N com.yandex.mobile.ads.nativeads.w wVar) {
        this.f388795a.a(wVar);
        com.yandex.mobile.ads.nativeads.c0 c0VarG = wVar.g();
        View viewE = wVar.e();
        if (viewE != null) {
            new lf0(viewE, c0VarG);
            this.f388796b.c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mo0
    public final void a(@j.N com.yandex.mobile.ads.nativeads.w wVar, @j.N C39386b c39386b) {
        this.f388795a.a(wVar, c39386b);
        com.yandex.mobile.ads.nativeads.c0 c0VarG = wVar.g();
        View viewE = wVar.e();
        if (viewE != null) {
            new lf0(viewE, c0VarG);
            this.f388796b.a();
        }
        if (wVar.e() == null || this.f388798d) {
            return;
        }
        this.f388798d = true;
        this.f388797c.a();
    }

    @Override // com.yandex.mobile.ads.impl.mo0
    public final void a() {
        this.f388795a.a();
    }
}
