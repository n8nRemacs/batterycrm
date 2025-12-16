package com.google.android.gms.internal.common;

import AK.c;
import aZ0.InterfaceC19845a;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@NullMarked
/* loaded from: classes6.dex */
public final class zzah {
    @InterfaceC19845a
    public static void a(int i12, Object[] objArr) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (objArr[i13] == null) {
                throw new NullPointerException(c.g(i13, "at index "));
            }
        }
    }
}
