package com.google.firebase.crashlytics.internal.common;

import android.os.Process;

/* compiled from: BackgroundPriorityRunnable.java */
/* renamed from: com.google.firebase.crashlytics.internal.common.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractRunnableC37581c implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        a();
    }
}
