package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzgh {
    public static int zza(int i12, int i13, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i13 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i14 = i12 / i13;
        int i15 = i12 - (i13 * i14);
        if (i15 == 0) {
            return i14;
        }
        int i16 = ((i12 ^ i13) >> 31) | 1;
        switch (zzgg.f350400a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i14;
            case 3:
                if (i16 >= 0) {
                    return i14;
                }
                break;
            case 4:
                break;
            case 5:
                if (i16 <= 0) {
                    return i14;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i15);
                int iAbs2 = iAbs - (Math.abs(i13) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i14 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i14;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i14;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i14 + i16;
    }

    public static int zzb(int i12, RoundingMode roundingMode) {
        if (i12 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (zzgg.f350400a[roundingMode.ordinal()]) {
            case 1:
                if (((i12 - 1) & i12) != 0) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i12 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i12);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i12) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i12);
    }
}
