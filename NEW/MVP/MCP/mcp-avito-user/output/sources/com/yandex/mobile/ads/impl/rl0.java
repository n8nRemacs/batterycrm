package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class rl0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f389565a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile rl0 f389566b;

    private rl0() {
    }

    public static rl0 a() {
        if (f389566b == null) {
            synchronized (f389565a) {
                try {
                    if (f389566b == null) {
                        f389566b = new rl0();
                    }
                } finally {
                }
            }
        }
        return f389566b;
    }
}
