package com.google.android.gms.common.internal;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.internal.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36697d {
    public C36697d() {
        throw new AssertionError("Uninstantiable");
    }

    @RX0.a
    public static void a(@j.N String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String.valueOf(Thread.currentThread());
        String.valueOf(Looper.getMainLooper().getThread());
        throw new IllegalStateException(str);
    }
}
