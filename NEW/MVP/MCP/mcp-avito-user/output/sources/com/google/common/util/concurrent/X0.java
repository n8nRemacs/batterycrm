package com.google.common.util.concurrent;

import java.util.Locale;

/* compiled from: RateLimiter.java */
@InterfaceC37531b0
@XY0.d
@XY0.c
@XY0.a
/* loaded from: classes6.dex */
public abstract class X0 {

    /* renamed from: a, reason: collision with root package name */
    @I41.a
    public volatile Object f360544a;

    /* compiled from: RateLimiter.java */
    public static abstract class a {
    }

    public abstract double a();

    public final String toString() {
        double dA2;
        Locale locale = Locale.ROOT;
        Object obj = this.f360544a;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f360544a;
                    if (obj == null) {
                        obj = new Object();
                        this.f360544a = obj;
                    }
                } finally {
                }
            }
        }
        synchronized (obj) {
            dA2 = a();
        }
        return String.format(locale, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(dA2));
    }
}
