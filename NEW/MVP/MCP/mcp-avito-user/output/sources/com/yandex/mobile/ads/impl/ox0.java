package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes8.dex */
public final class ox0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final b f388659a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Handler f388660b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final e5 f388661c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f388662d;

    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final e5 f388663b;

        public a(e5 e5Var) {
            this.f388663b = e5Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ox0.this.f388662d) {
                return;
            }
            if (this.f388663b.a()) {
                ox0.this.f388662d = true;
                ((rx0) ox0.this.f388659a).a();
            } else {
                ox0 ox0Var = ox0.this;
                ox0Var.f388660b.postDelayed(ox0Var.new a(this.f388663b), 300L);
            }
        }
    }

    public interface b {
    }

    public ox0(@j.N e5 e5Var, @j.N b bVar) {
        this.f388659a = bVar;
        this.f388661c = e5Var;
    }

    public final void a() {
        this.f388660b.post(new a(this.f388661c));
    }

    public final void b() {
        this.f388660b.removeCallbacksAndMessages(null);
    }
}
