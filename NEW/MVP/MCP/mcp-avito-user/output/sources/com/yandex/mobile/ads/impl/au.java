package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class au {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private static final Object f383659b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile au f383660c;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final zt f383661a = new zt(zh1.a());

    private au() {
    }

    @j.N
    public static au a() {
        if (f383660c == null) {
            synchronized (f383659b) {
                try {
                    if (f383660c == null) {
                        f383660c = new au();
                    }
                } finally {
                }
            }
        }
        return f383660c;
    }

    @j.P
    public final du a(@j.N ff1 ff1Var) {
        return this.f383661a.get(ff1Var);
    }

    public final void a(@j.N ff1 ff1Var, @j.N du duVar) {
        this.f383661a.put(ff1Var, duVar);
    }
}
