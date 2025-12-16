package com.facebook.common.time;

import android.os.SystemClock;
import com.facebook.common.internal.g;
import com.facebook.infer.annotation.Nullsafe;
import yW0.InterfaceC50192c;
import yW0.InterfaceC50193d;

@g
@Nullsafe
/* loaded from: classes5.dex */
public class AwakeTimeSinceBootClock implements InterfaceC50192c, InterfaceC50193d {

    @g
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @g
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // yW0.InterfaceC50192c
    @g
    public long now() {
        return SystemClock.uptimeMillis();
    }

    @Override // yW0.InterfaceC50193d
    @g
    public long nowNanos() {
        return System.nanoTime();
    }
}
