package com.yandex.mobile.ads.impl;

import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class o3 {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private static final Object f388424c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private static volatile o3 f388425d;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ArrayList f388426a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ArrayList f388427b = new ArrayList();

    private o3() {
    }

    public static o3 b() {
        if (f388425d == null) {
            synchronized (f388424c) {
                try {
                    if (f388425d == null) {
                        f388425d = new o3();
                    }
                } finally {
                }
            }
        }
        return f388425d;
    }

    public final void a(@j.N String str) {
        synchronized (f388424c) {
            this.f388427b.remove(str);
            this.f388427b.add(str);
        }
    }

    @j.N
    public final ArrayList c() {
        ArrayList arrayList;
        synchronized (f388424c) {
            arrayList = new ArrayList(this.f388426a);
        }
        return arrayList;
    }

    @j.N
    public final ArrayList a() {
        ArrayList arrayList;
        synchronized (f388424c) {
            arrayList = new ArrayList(this.f388427b);
        }
        return arrayList;
    }

    public final void b(@j.N String str) {
        synchronized (f388424c) {
            this.f388426a.remove(str);
            this.f388426a.add(str);
        }
    }
}
