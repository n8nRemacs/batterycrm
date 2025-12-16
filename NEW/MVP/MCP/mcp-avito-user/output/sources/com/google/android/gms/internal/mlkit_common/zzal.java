package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public class zzal {
    public static int a(int i12, int i13) {
        if (i13 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i14 = i12 + (i12 >> 1) + 1;
        if (i14 < i13) {
            int iHighestOneBit = Integer.highestOneBit(i13 - 1);
            i14 = iHighestOneBit + iHighestOneBit;
        }
        if (i14 < 0) {
            return Integer.MAX_VALUE;
        }
        return i14;
    }
}
