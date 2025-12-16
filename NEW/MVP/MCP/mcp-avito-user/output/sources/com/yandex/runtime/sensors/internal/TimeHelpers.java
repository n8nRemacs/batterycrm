package com.yandex.runtime.sensors.internal;

import android.os.SystemClock;

/* loaded from: classes8.dex */
public class TimeHelpers {
    public static long eventNanosToMills(long j12) {
        return j12 / 1000000;
    }

    public static long eventNanosToTimestampMills(long j12) {
        return (j12 / 1000000) + (System.currentTimeMillis() - SystemClock.elapsedRealtime());
    }
}
