package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
class S2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ R2 f379349a;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C39031oh.a(S2.this.f379349a.f379275a);
        }
    }

    public S2(R2 r22) {
        this.f379349a = r22;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f379349a.f379279e.a().execute(new a());
    }
}
