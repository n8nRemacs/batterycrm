package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.rg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class RunnableC39102rg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC39198vg f381762a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Throwable f381763b;

    public RunnableC39102rg(C39079qg c39079qg, InterfaceC39198vg interfaceC39198vg, Throwable th2) {
        this.f381762a = interfaceC39198vg;
        this.f381763b = th2;
    }

    @Override // java.lang.Runnable
    @j.l0
    public void run() {
        this.f381762a.a(this.f381763b);
    }
}
