package com.google.android.gms.internal.fido;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzfm implements Closeable {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f350375c = new zzfl();

    /* renamed from: b, reason: collision with root package name */
    public int f350376b = 0;

    public static int zza() {
        return ((zzfm) f350375c.get()).f350376b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i12 = this.f350376b;
        if (i12 <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.f350376b = i12 - 1;
    }
}
