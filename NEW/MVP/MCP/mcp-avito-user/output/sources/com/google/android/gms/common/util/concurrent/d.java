package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f349610b;

    public d(Runnable runnable) {
        this.f349610b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(0);
        this.f349610b.run();
    }
}
