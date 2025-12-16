package com.google.android.datatransport.runtime.time;

import android.os.SystemClock;

/* compiled from: UptimeClock.java */
/* loaded from: classes10.dex */
public class g implements a {
    @Override // com.google.android.datatransport.runtime.time.a
    public final long O() {
        return SystemClock.elapsedRealtime();
    }
}
