package com.google.firebase;

import android.os.SystemClock;
import j.N;

/* compiled from: StartupTime.java */
@VY0.c
/* loaded from: classes10.dex */
public abstract class o {
    @N
    public static o d() {
        return new a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long a();

    public abstract long b();

    public abstract long c();
}
