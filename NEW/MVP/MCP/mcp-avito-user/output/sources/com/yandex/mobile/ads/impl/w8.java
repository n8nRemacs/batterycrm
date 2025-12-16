package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
final class w8 implements y8 {

    /* renamed from: e, reason: collision with root package name */
    private static final long f391329e = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: f, reason: collision with root package name */
    private static final Object f391330f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static volatile w8 f391331g;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final a9 f391333b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f391335d;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Handler f391332a = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final z8 f391334c = new z8();

    private w8(@j.N Context context) {
        this.f391333b = new a9(context);
    }

    @j.N
    public static w8 a(@j.N Context context) {
        if (f391331g == null) {
            synchronized (f391330f) {
                try {
                    if (f391331g == null) {
                        f391331g = new w8(context);
                    }
                } finally {
                }
            }
        }
        return f391331g;
    }

    public final void b(@j.N b9 b9Var) {
        boolean z12;
        this.f391334c.a(b9Var);
        synchronized (f391330f) {
            try {
                if (this.f391335d) {
                    z12 = false;
                } else {
                    z12 = true;
                    this.f391335d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z12) {
            this.f391332a.postDelayed(new v8(this), f391329e);
            this.f391333b.a(this);
        }
    }

    public final void a(@j.N b9 b9Var) {
        this.f391334c.b(b9Var);
    }

    public final void a(@j.N u8 u8Var) {
        synchronized (f391330f) {
            this.f391332a.removeCallbacksAndMessages(null);
            this.f391335d = false;
        }
        this.f391334c.a(u8Var);
    }

    public final void a() {
        synchronized (f391330f) {
            this.f391332a.removeCallbacksAndMessages(null);
            this.f391335d = false;
        }
        this.f391334c.a();
    }
}
