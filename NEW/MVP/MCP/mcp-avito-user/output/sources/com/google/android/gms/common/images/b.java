package com.google.android.gms.common.images;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class b implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw null;
        }
        String.valueOf(Thread.currentThread());
        String.valueOf(Looper.getMainLooper().getThread());
        throw new IllegalStateException("LoadBitmapFromDiskRunnable can't be executed in the main thread");
    }
}
