package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: NoOpPoolStatsTracker.java */
@Nullsafe
/* loaded from: classes13.dex */
public class B implements H {

    /* renamed from: a, reason: collision with root package name */
    @I41.h
    public static B f340412a;

    public static synchronized B a() {
        try {
            if (f340412a == null) {
                f340412a = new B();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f340412a;
    }
}
