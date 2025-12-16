package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.z7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class RunnableC39285z7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC39011nm f382307a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C39261y7 f382308b;

    public RunnableC39285z7(C39261y7 c39261y7, InterfaceC39011nm interfaceC39011nm) {
        this.f382308b = c39261y7;
        this.f382307a = interfaceC39011nm;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f382308b.a(this.f382307a);
    }
}
