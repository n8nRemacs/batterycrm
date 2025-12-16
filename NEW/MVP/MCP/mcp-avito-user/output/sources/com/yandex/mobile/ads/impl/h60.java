package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class h60 {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f385914d = new Object();

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private static volatile h60 f385915e;

    /* renamed from: a, reason: collision with root package name */
    private boolean f385916a = true;

    /* renamed from: b, reason: collision with root package name */
    private boolean f385917b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f385918c = true;

    private h60() {
    }

    public static h60 a() {
        if (f385915e == null) {
            synchronized (f385914d) {
                try {
                    if (f385915e == null) {
                        f385915e = new h60();
                    }
                } finally {
                }
            }
        }
        return f385915e;
    }

    public final void b(boolean z12) {
        this.f385916a = z12;
    }

    public final boolean c() {
        return this.f385916a;
    }

    public final boolean d() {
        return this.f385917b;
    }

    public final boolean b() {
        return this.f385918c;
    }

    public final void c(boolean z12) {
        this.f385917b = z12;
    }

    public final void a(boolean z12) {
        this.f385918c = z12;
    }
}
