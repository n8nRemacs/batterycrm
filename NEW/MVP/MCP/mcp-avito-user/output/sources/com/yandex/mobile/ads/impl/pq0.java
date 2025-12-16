package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class pq0 {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f388928g = new a(0);

    /* renamed from: h, reason: collision with root package name */
    private static final long f388929h = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    private static volatile pq0 f388930i;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Object f388931a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final Handler f388932b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final oq0 f388933c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final lq0 f388934d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f388935e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f388936f;

    public static final class a {
        public /* synthetic */ a(int i12) {
            this();
        }

        @Y61.k
        public final pq0 a(@Y61.k Context context) {
            pq0 pq0Var = pq0.f388930i;
            if (pq0Var == null) {
                synchronized (this) {
                    pq0Var = pq0.f388930i;
                    if (pq0Var == null) {
                        pq0Var = new pq0(context, 0);
                        pq0.f388930i = pq0Var;
                    }
                }
            }
            return pq0Var;
        }

        private a() {
        }
    }

    public /* synthetic */ pq0(Context context, int i12) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(pq0 pq0Var) {
        pq0Var.f388933c.a();
        synchronized (pq0Var.f388931a) {
            pq0Var.f388936f = true;
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        synchronized (pq0Var.f388931a) {
            pq0Var.f388932b.removeCallbacksAndMessages(null);
            pq0Var.f388935e = false;
        }
        pq0Var.f388934d.b();
    }

    private pq0(Context context) {
        this.f388931a = new Object();
        this.f388932b = new Handler(Looper.getMainLooper());
        this.f388933c = new oq0(context);
        this.f388934d = new lq0();
    }

    public final void a(@Y61.k kq0 kq0Var) {
        synchronized (this.f388931a) {
            try {
                this.f388934d.b(kq0Var);
                if (!this.f388934d.a()) {
                    this.f388933c.a();
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(@Y61.k kq0 kq0Var) {
        boolean z12;
        boolean z13;
        synchronized (this.f388931a) {
            try {
                z12 = this.f388936f;
                if (!z12) {
                    this.f388934d.a(kq0Var);
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z12) {
            kq0Var.a();
            return;
        }
        synchronized (this.f388931a) {
            if (this.f388935e) {
                z13 = false;
            } else {
                z13 = true;
                this.f388935e = true;
            }
        }
        if (z13) {
            b();
            this.f388933c.a(new qq0(this));
        }
    }

    public static final void a(pq0 pq0Var) {
        synchronized (pq0Var.f388931a) {
            pq0Var.f388936f = true;
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        synchronized (pq0Var.f388931a) {
            pq0Var.f388932b.removeCallbacksAndMessages(null);
            pq0Var.f388935e = false;
        }
        pq0Var.f388934d.b();
    }

    private final void b() {
        this.f388932b.postDelayed(new J(this, 8), f388929h);
    }
}
