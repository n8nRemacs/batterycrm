package io.reactivex.rxjava3.internal.util;

/* compiled from: Pow2.java */
/* loaded from: classes8.dex */
public final class n {
    public n() {
        throw new IllegalStateException("No instances!");
    }

    public static int a(int i12) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i12 - 1));
    }
}
