package com.facebook.common.time;

import android.os.SystemClock;
import defpackage.d2a;
import defpackage.fz4;
import java.util.concurrent.TimeUnit;

@fz4
/* loaded from: classes.dex */
public class RealtimeSinceBootClock implements d2a {
    public static final RealtimeSinceBootClock a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @fz4
    public static RealtimeSinceBootClock get() {
        return a;
    }

    @Override // defpackage.d2a
    public final long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.d2a
    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
