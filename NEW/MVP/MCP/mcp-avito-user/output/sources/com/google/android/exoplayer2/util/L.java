package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: SystemClock.java */
/* loaded from: classes6.dex */
public class L implements InterfaceC36589e {
    @Override // com.google.android.exoplayer2.util.InterfaceC36589e
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC36589e
    public final InterfaceC36601q b(Looper looper, @j.P Handler.Callback callback) {
        return new M(new Handler(looper, callback));
    }
}
