package com.google.android.gms.internal.mlkit_common;

import AK.c;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zzav {
    public static void a(int i12, Object[] objArr) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (objArr[i13] == null) {
                throw new NullPointerException(c.g(i13, "at index "));
            }
        }
    }
}
