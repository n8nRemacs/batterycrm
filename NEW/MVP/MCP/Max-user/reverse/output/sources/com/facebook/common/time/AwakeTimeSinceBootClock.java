package com.facebook.common.time;

import defpackage.e2a;
import defpackage.fz4;

@fz4
/* loaded from: classes.dex */
public class AwakeTimeSinceBootClock implements e2a {

    @fz4
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @fz4
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // defpackage.e2a, defpackage.d2a
    @fz4
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // defpackage.e2a, defpackage.d2a
    @fz4
    public long nowNanos() {
        return System.nanoTime();
    }
}
