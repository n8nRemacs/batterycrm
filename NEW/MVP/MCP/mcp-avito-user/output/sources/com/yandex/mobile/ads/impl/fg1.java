package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes8.dex */
public final class fg1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final qg1 f385319a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final a f385320b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final Handler f385321c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private boolean f385322d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f385323e;

    public interface a {
        void b();
    }

    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (fg1.this.f385322d || !fg1.this.f385319a.a(pg1.f388823c)) {
                fg1.this.f385321c.postDelayed(this, 200L);
                return;
            }
            fg1.this.f385320b.b();
            fg1.this.f385322d = true;
            fg1.this.b();
        }
    }

    public fg1(@Y61.k qg1 qg1Var, @Y61.k a aVar) {
        this.f385319a = qg1Var;
        this.f385320b = aVar;
    }

    public final void a() {
        if (this.f385323e || this.f385322d) {
            return;
        }
        this.f385323e = true;
        this.f385321c.post(new b());
    }

    public final void b() {
        this.f385321c.removeCallbacksAndMessages(null);
        this.f385323e = false;
    }
}
