package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Collections;

/* loaded from: classes8.dex */
public final class us {

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private static us f390619c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private static final Object f390620d = new Object();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ts f390621a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private j20 f390622b;

    public us(@j.N Context context) {
        Collections.emptyList();
        Collections.emptyMap();
        this.f390621a = new ts();
        this.f390622b = na.a(context);
    }

    @j.N
    public static us a(@j.N Context context) {
        synchronized (f390620d) {
            try {
                if (f390619c == null) {
                    f390619c = new us(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f390619c;
    }

    @j.N
    public final j20 b() {
        return this.f390622b;
    }

    @j.N
    public final ts a() {
        return this.f390621a;
    }
}
