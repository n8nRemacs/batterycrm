package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import java.util.HashMap;

@SuppressLint({"UseSparseArrays"})
/* renamed from: com.yandex.mobile.ads.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39359r0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f389353b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile C39359r0 f389354c;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final HashMap f389355a = new HashMap();

    private C39359r0() {
    }

    @j.N
    public static C39359r0 a() {
        if (f389354c == null) {
            synchronized (f389353b) {
                try {
                    if (f389354c == null) {
                        f389354c = new C39359r0();
                    }
                } finally {
                }
            }
        }
        return f389354c;
    }

    public final void a(long j12, @j.N C39357q0 c39357q0) {
        synchronized (f389353b) {
            this.f389355a.put(Long.valueOf(j12), c39357q0);
        }
    }

    @j.P
    public final C39357q0 a(long j12) {
        C39357q0 c39357q0;
        synchronized (f389353b) {
            c39357q0 = (C39357q0) this.f389355a.remove(Long.valueOf(j12));
        }
        return c39357q0;
    }
}
