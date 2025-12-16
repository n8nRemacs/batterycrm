package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import org.checkerframework.dataflow.qual.Pure;
import v61.InterfaceC49173d;

/* loaded from: classes8.dex */
public final class db {
    @Pure
    public static void a(boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    public static void b(boolean z12) {
        if (!z12) {
            throw new IllegalStateException();
        }
    }

    @Pure
    public static void a(String str, boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    @Pure
    public static void b(String str, boolean z12) {
        if (!z12) {
            throw new IllegalStateException(str);
        }
    }

    @Pure
    public static void a(int i12, int i13) {
        if (i12 < 0 || i12 >= i13) {
            throw new IndexOutOfBoundsException();
        }
    }

    @InterfaceC49173d
    @Pure
    public static <T> T b(@j.P T t12) {
        if (t12 != null) {
            return t12;
        }
        throw new IllegalStateException();
    }

    @InterfaceC49173d
    @Pure
    public static <T> T a(@j.P T t12) {
        t12.getClass();
        return t12;
    }

    @InterfaceC49173d
    @Pure
    public static String a(@j.P String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }
}
