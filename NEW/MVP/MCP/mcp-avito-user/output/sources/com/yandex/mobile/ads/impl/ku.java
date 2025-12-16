package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.yandex.mobile.ads.impl.tj1;
import com.yandex.mobile.ads.impl.tj1.a;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class ku<T extends View & tj1.a> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final T f387259a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Handler f387260b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final iu f387261c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final ar0 f387262d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private Runnable f387263e;

    @j.k0
    public static class a<T extends View & tj1.a> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final WeakReference<ar0> f387264b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final WeakReference<T> f387265c;

        /* renamed from: d, reason: collision with root package name */
        @j.N
        private final Handler f387266d;

        /* renamed from: e, reason: collision with root package name */
        @j.N
        private final iu f387267e;

        public a(@j.N T t12, @j.N ar0 ar0Var, @j.N Handler handler, @j.N iu iuVar) {
            this.f387265c = new WeakReference<>(t12);
            this.f387264b = new WeakReference<>(ar0Var);
            this.f387266d = handler;
            this.f387267e = iuVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            T t12 = this.f387265c.get();
            ar0 ar0Var = this.f387264b.get();
            if (t12 == null || ar0Var == null) {
                return;
            }
            ar0Var.a(this.f387267e.a(t12));
            this.f387266d.postDelayed(this, 200L);
        }
    }

    public ku(@j.N T t12, @j.N iu iuVar, @j.N ar0 ar0Var) {
        this.f387259a = t12;
        this.f387261c = iuVar;
        this.f387262d = ar0Var;
    }

    public final void a() {
        if (this.f387263e == null) {
            a aVar = new a(this.f387259a, this.f387262d, this.f387260b, this.f387261c);
            this.f387263e = aVar;
            this.f387260b.post(aVar);
        }
    }

    public final void b() {
        this.f387260b.removeCallbacksAndMessages(null);
        this.f387263e = null;
    }
}
