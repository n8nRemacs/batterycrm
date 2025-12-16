package com.google.common.collect;

/* compiled from: Hashing.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.i1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37348i1 {
    public static int a(double d12, int i12) {
        int iMax = Math.max(i12, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d12 * iHighestOneBit))) {
            return iHighestOneBit;
        }
        int i13 = iHighestOneBit << 1;
        if (i13 > 0) {
            return i13;
        }
        return 1073741824;
    }

    public static int b(int i12) {
        return (int) (Integer.rotateLeft((int) (i12 * (-862048943)), 15) * 461845907);
    }

    public static int c(@I41.a Object obj) {
        return b(obj == null ? 0 : obj.hashCode());
    }
}
