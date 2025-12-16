package com.google.common.math;

import androidx.camera.camera2.internal.G;
import java.math.RoundingMode;

/* compiled from: IntMath.java */
@e
@XY0.b
/* loaded from: classes6.dex */
public final class f {

    /* compiled from: IntMath.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f360346a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f360346a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f360346a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f360346a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f360346a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f360346a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f360346a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f360346a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f360346a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int a(int i12, int i13, RoundingMode roundingMode) {
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
        switch (a.f360346a[roundingMode.ordinal()]) {
            case 1:
                if (i15 == 0) {
                    return i14;
                }
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
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i14 & 1) != 0))) {
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

    public static int b(int i12, RoundingMode roundingMode) {
        if (i12 <= 0) {
            throw new IllegalArgumentException(G.e(i12, "x (", ") must be > 0"));
        }
        switch (a.f360346a[roundingMode.ordinal()]) {
            case 1:
                if (!((i12 > 0) & (((i12 + (-1)) & i12) == 0))) {
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
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i12))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i12);
    }
}
