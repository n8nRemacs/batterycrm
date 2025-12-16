package com.google.android.gms.common;

import com.google.android.gms.common.internal.InterfaceC36733z;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@InterfaceC36733z
/* loaded from: classes6.dex */
public final class D {
    public static int a(int i12) {
        int[] iArr = {1, 2, 3};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr[i13];
            int i15 = i14 - 1;
            if (i14 == 0) {
                throw null;
            }
            if (i15 == i12) {
                return i14;
            }
        }
        return 1;
    }
}
