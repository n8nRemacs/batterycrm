package com.google.common.collect;

/* compiled from: CompactHashing.java */
@XY0.c
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class M {
    public static Object a(int i12) {
        if (i12 < 2 || i12 > 1073741824 || Integer.highestOneBit(i12) != i12) {
            throw new IllegalArgumentException(AK.c.g(i12, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i12 <= 256 ? new byte[i12] : i12 <= 65536 ? new short[i12] : new int[i12];
    }

    public static int b(int i12, int i13, int i14) {
        return (i12 & (~i14)) | (i13 & i14);
    }

    public static int c(int i12) {
        return (i12 + 1) * (i12 < 32 ? 4 : 2);
    }

    public static int d(@I41.a Object obj, @I41.a Object obj2, int i12, Object obj3, int[] iArr, Object[] objArr, @I41.a Object[] objArr2) {
        int i13;
        int i14;
        int iC2 = C37348i1.c(obj);
        int i15 = iC2 & i12;
        int iE2 = e(i15, obj3);
        if (iE2 == 0) {
            return -1;
        }
        int i16 = ~i12;
        int i17 = iC2 & i16;
        int i18 = -1;
        while (true) {
            i13 = iE2 - 1;
            i14 = iArr[i13];
            if ((i14 & i16) == i17 && com.google.common.base.F.a(obj, objArr[i13]) && (objArr2 == null || com.google.common.base.F.a(obj2, objArr2[i13]))) {
                break;
            }
            int i19 = i14 & i12;
            if (i19 == 0) {
                return -1;
            }
            i18 = i13;
            iE2 = i19;
        }
        int i22 = i14 & i12;
        if (i18 == -1) {
            f(i15, i22, obj3);
        } else {
            iArr[i18] = b(iArr[i18], i22, i12);
        }
        return i13;
    }

    public static int e(int i12, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i12] & 255 : obj instanceof short[] ? ((short[]) obj)[i12] & 65535 : ((int[]) obj)[i12];
    }

    public static void f(int i12, int i13, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i12] = (byte) i13;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i12] = (short) i13;
        } else {
            ((int[]) obj)[i12] = i13;
        }
    }
}
