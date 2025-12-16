package com.google.android.exoplayer2.util;

import org.checkerframework.dataflow.qual.Pure;
import v61.InterfaceC49173d;

/* compiled from: Assertions.java */
/* renamed from: com.google.android.exoplayer2.util.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36585a {
    @Pure
    public static void a(String str, boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    @Pure
    public static void b(boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    public static void c(int i12, int i13) {
        if (i12 < 0 || i12 >= i13) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Pure
    public static void d(boolean z12) {
        if (!z12) {
            throw new IllegalStateException();
        }
    }

    @InterfaceC49173d
    @Pure
    public static void e(@j.P Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }
}
