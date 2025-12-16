package com.google.common.util.concurrent;

import com.google.common.util.concurrent.X0;
import java.util.concurrent.TimeUnit;

/* compiled from: SmoothRateLimiter.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* loaded from: classes6.dex */
abstract class h1 extends X0 {

    /* compiled from: SmoothRateLimiter.java */
    public static final class b extends h1 {
    }

    /* compiled from: SmoothRateLimiter.java */
    public static final class c extends h1 {
    }

    public h1(X0.a aVar, a aVar2) {
        aVar.getClass();
    }

    @Override // com.google.common.util.concurrent.X0
    public final double a() {
        return TimeUnit.SECONDS.toMicros(1L) / 0.0d;
    }
}
