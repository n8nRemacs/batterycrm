package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.rc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class RunnableC39098rc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C39194vc f381736a;

    public RunnableC39098rc(C39194vc c39194vc) {
        this.f381736a = c39194vc;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f381736a.f382055e != null) {
                this.f381736a.f382055e.c();
            }
        } catch (Throwable unused) {
        }
    }
}
