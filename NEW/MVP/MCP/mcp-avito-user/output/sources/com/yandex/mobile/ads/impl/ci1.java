package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes8.dex */
public final class ci1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Handler f384306a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.instream.e f384307b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private iv0 f384308c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f384309d;

    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long jC2 = ci1.this.f384307b.c();
            if (ci1.this.f384308c != null) {
                ((vt0) ci1.this.f384308c).a(jC2);
            }
            if (ci1.this.f384309d) {
                ci1.this.f384306a.postDelayed(this, 200L);
            }
        }

        public /* synthetic */ a(ci1 ci1Var, int i12) {
            this();
        }
    }

    public ci1(@j.N com.yandex.mobile.ads.instream.e eVar) {
        this.f384307b = eVar;
    }

    public final void a(@j.P iv0 iv0Var) {
        this.f384308c = iv0Var;
    }

    public final void b() {
        if (this.f384309d) {
            this.f384306a.removeCallbacksAndMessages(null);
            this.f384309d = false;
        }
    }

    public final void a() {
        if (this.f384309d) {
            return;
        }
        this.f384309d = true;
        this.f384306a.post(new a(this, 0));
    }
}
