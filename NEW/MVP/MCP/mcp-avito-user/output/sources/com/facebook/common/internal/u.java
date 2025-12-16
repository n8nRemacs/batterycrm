package com.facebook.common.internal;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: Throwables.java */
@Nullsafe
/* loaded from: classes5.dex */
public final class u {
    public static void a(Throwable th2) throws Throwable {
        if (Error.class.isInstance(th2)) {
            throw ((Throwable) Error.class.cast(th2));
        }
        if (!RuntimeException.class.isInstance(th2)) {
            throw new RuntimeException(th2);
        }
        throw ((Throwable) RuntimeException.class.cast(th2));
    }
}
