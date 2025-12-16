package com.yandex.mobile.ads.impl;

import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class yw0 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private static final Object f392081b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile yw0 f392082c;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final WeakHashMap f392083a = new WeakHashMap();

    private yw0() {
    }

    public static yw0 a() {
        if (f392082c == null) {
            synchronized (f392081b) {
                try {
                    if (f392082c == null) {
                        f392082c = new yw0();
                    }
                } finally {
                }
            }
        }
        return f392082c;
    }

    @j.P
    public final String a(@j.N qy0<?> qy0Var) {
        String str;
        synchronized (f392081b) {
            str = (String) this.f392083a.get(qy0Var);
        }
        return str;
    }
}
