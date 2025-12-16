package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class yt {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private static final Object f392061c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static volatile yt f392062d;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final xt f392063a = new xt();

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private w31 f392064b;

    private yt() {
    }

    @j.N
    public static yt a() {
        if (f392062d == null) {
            synchronized (f392061c) {
                try {
                    if (f392062d == null) {
                        f392062d = new yt();
                    }
                } finally {
                }
            }
        }
        return f392062d;
    }

    @j.N
    public final yg a(@j.N Context context) {
        w31 w31Var;
        synchronized (f392061c) {
            try {
                if (this.f392064b == null) {
                    this.f392064b = this.f392063a.a(context);
                }
                w31Var = this.f392064b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w31Var;
    }
}
