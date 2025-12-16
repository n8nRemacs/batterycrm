package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.uc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class RunnableC39170uc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C39194vc f381931a;

    public RunnableC39170uc(C39194vc c39194vc) {
        this.f381931a = c39194vc;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f381931a.f382055e != null) {
            this.f381931a.f382055e.a();
        }
        C39194vc.b(this.f381931a);
    }
}
