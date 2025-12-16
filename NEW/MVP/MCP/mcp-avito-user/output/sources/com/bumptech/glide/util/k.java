package com.bumptech.glide.util;

import j.N;
import j.P;

/* compiled from: Preconditions.java */
/* loaded from: classes5.dex */
public final class k {
    public static void a(@N String str, boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException(str);
        }
    }

    @N
    public static void b(@P Object obj) {
        c(obj, "Argument must not be null");
    }

    @N
    public static void c(@P Object obj, @N String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
