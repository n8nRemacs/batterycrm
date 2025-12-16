package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class m00 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f387788a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile m00 f387789b;

    private m00() {
    }

    @j.N
    public static m00 a() {
        if (f387789b == null) {
            synchronized (f387788a) {
                try {
                    if (f387789b == null) {
                        f387789b = new m00();
                    }
                } finally {
                }
            }
        }
        return f387789b;
    }

    @j.N
    public static l00 a(boolean z12) {
        if (z12) {
            return new zh0();
        }
        return new ze();
    }
}
