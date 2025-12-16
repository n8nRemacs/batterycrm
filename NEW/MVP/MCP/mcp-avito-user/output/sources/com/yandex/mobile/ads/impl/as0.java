package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes8.dex */
public final class as0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Handler f383632a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private int f383633b = 1;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private bs0 f383634c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private l91 f383635d;

    /* renamed from: e, reason: collision with root package name */
    private long f383636e;

    /* renamed from: f, reason: collision with root package name */
    private long f383637f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f383638g;

    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            as0.a(as0.this);
            as0.this.c();
        }

        public /* synthetic */ a(as0 as0Var, int i12) {
            this();
        }
    }

    public as0(boolean z12) {
        this.f383638g = z12;
    }

    public static void a(as0 as0Var) {
        as0Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = jElapsedRealtime - as0Var.f383637f;
        as0Var.f383637f = jElapsedRealtime;
        long j13 = as0Var.f383636e - j12;
        as0Var.f383636e = j13;
        l91 l91Var = as0Var.f383635d;
        if (l91Var != null) {
            l91Var.a(Math.max(0L, j13));
        }
    }

    public final void d() {
        if (n6.a(3, this.f383633b)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f383633b = 2;
        this.f383637f = SystemClock.elapsedRealtime();
        long jMin = Math.min(200L, this.f383636e);
        if (jMin > 0) {
            this.f383632a.postDelayed(new a(this, 0), jMin);
            return;
        }
        bs0 bs0Var = this.f383634c;
        if (bs0Var != null) {
            bs0Var.mo126a();
        }
        a();
    }

    public final void b() {
        if (n6.a(2, this.f383633b)) {
            this.f383633b = 3;
            this.f383632a.removeCallbacksAndMessages(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = jElapsedRealtime - this.f383637f;
            this.f383637f = jElapsedRealtime;
            long j13 = this.f383636e - j12;
            this.f383636e = j13;
            l91 l91Var = this.f383635d;
            if (l91Var != null) {
                l91Var.a(Math.max(0L, j13));
            }
        }
    }

    public final void a(long j12, @j.P bs0 bs0Var) {
        a();
        this.f383634c = bs0Var;
        this.f383636e = j12;
        if (this.f383638g) {
            this.f383632a.post(new J(this, 2));
        } else {
            c();
        }
    }

    public final void a() {
        if (n6.a(1, this.f383633b)) {
            return;
        }
        this.f383633b = 1;
        this.f383634c = null;
        this.f383632a.removeCallbacksAndMessages(null);
    }

    public final void a(@j.P l91 l91Var) {
        this.f383635d = l91Var;
    }
}
