package androidx.media3.common.util;

import j.P;
import org.checkerframework.dataflow.qual.Pure;
import v61.InterfaceC49173d;

/* compiled from: Assertions.java */
@J
/* renamed from: androidx.media3.common.util.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23110a {
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

    @InterfaceC49173d
    @Pure
    public static void d(@P Object obj) {
        obj.getClass();
    }

    @InterfaceC49173d
    @Pure
    public static void e(@P Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    @Pure
    public static void f(String str, boolean z12) {
        if (!z12) {
            throw new IllegalStateException(str);
        }
    }

    @Pure
    public static void g(boolean z12) {
        if (!z12) {
            throw new IllegalStateException();
        }
    }

    @InterfaceC49173d
    @Pure
    public static void h(@P Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }
}
