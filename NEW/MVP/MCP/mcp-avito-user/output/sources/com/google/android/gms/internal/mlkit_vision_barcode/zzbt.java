package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzbt {
    public static int a(@a Object obj, @a Object obj2, int i12, Object obj3, int[] iArr, Object[] objArr, @a Object[] objArr2) {
        int i13;
        int i14;
        int iA2 = zzbu.a(obj);
        int i15 = iA2 & i12;
        int iB2 = b(i15, obj3);
        if (iB2 != 0) {
            int i16 = ~i12;
            int i17 = iA2 & i16;
            int i18 = -1;
            while (true) {
                i13 = iB2 - 1;
                i14 = iArr[i13];
                if ((i14 & i16) != i17 || !zzam.zza(obj, objArr[i13]) || (objArr2 != null && !zzam.zza(obj2, objArr2[i13]))) {
                    int i19 = i14 & i12;
                    if (i19 == 0) {
                        break;
                    }
                    i18 = i13;
                    iB2 = i19;
                } else {
                    break;
                }
            }
            int i22 = i14 & i12;
            if (i18 == -1) {
                d(i15, i22, obj3);
            } else {
                iArr[i18] = (i22 & i12) | (iArr[i18] & i16);
            }
            return i13;
        }
        return -1;
    }

    public static int b(int i12, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i12] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i12] : ((int[]) obj)[i12];
    }

    public static Object c(int i12) {
        if (i12 >= 2 && i12 <= 1073741824 && Integer.highestOneBit(i12) == i12) {
            return i12 <= 256 ? new byte[i12] : i12 <= 65536 ? new short[i12] : new int[i12];
        }
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("must be power of 2 between 2^1 and 2^30: ");
        sb2.append(i12);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void d(int i12, int i13, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i12] = (byte) i13;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i12] = (short) i13;
        } else {
            ((int[]) obj)[i12] = i13;
        }
    }
}
