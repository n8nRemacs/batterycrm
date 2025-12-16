package com.google.android.gms.internal.mlkit_vision_common;

import AK.c;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
public final class zzt {
    public static void a(int i12, Object[] objArr) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (objArr[i13] == null) {
                throw new NullPointerException(c.g(i13, "at index "));
            }
        }
    }
}
