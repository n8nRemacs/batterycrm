package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class pe implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g5 f388791b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ac1 f388792c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ re f388793d;

    public pe(re reVar, g5 g5Var, ac1 ac1Var) {
        this.f388793d = reVar;
        this.f388791b = g5Var;
        this.f388792c = ac1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        re reVar = this.f388793d;
        g5 g5Var = this.f388791b;
        synchronized (reVar) {
            reVar.f389498f.a(g5Var);
        }
        w2 w2VarS = this.f388793d.s();
        if (w2VarS != null) {
            this.f388793d.b(w2VarS);
            return;
        }
        re reVar2 = this.f388793d;
        reVar2.f389504l.a(new qe(reVar2, this.f388792c));
    }
}
