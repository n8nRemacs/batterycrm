package com.fasterxml.jackson.core.io;

import java.math.BigDecimal;
import java.util.Arrays;

/* compiled from: BigDecimalParser.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final char[] f341143a;

    public a(char[] cArr) {
        this.f341143a = cArr;
    }

    public static BigDecimal a(char[] cArr) {
        String strI;
        int length = cArr.length;
        try {
            return length < 500 ? new BigDecimal(cArr) : new a(cArr).b(length / 10);
        } catch (NumberFormatException e12) {
            String message = e12.getMessage();
            if (message == null) {
                message = "Not a valid number representation";
            }
            if (cArr.length <= 1000) {
                strI = new String(cArr);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(new String(Arrays.copyOfRange(cArr, 0, 1000)));
                sb2.append("(truncated, full length is ");
                strI = AK.c.i(cArr.length, " chars)", sb2);
            }
            throw new NumberFormatException(androidx.compose.ui.graphics.colorspace.e.n("Value \"", strI, "\" can not be represented as `java.math.BigDecimal`, reason: ", message));
        }
    }

    public final BigDecimal b(int i12) throws NumberFormatException {
        int i13;
        BigDecimal bigDecimalC;
        char[] cArr = this.f341143a;
        int length = cArr.length;
        int i14 = -1;
        int i15 = 0;
        int i16 = -1;
        boolean z12 = false;
        boolean z13 = false;
        int i17 = 0;
        boolean z14 = false;
        for (int i18 = 0; i18 < length; i18++) {
            char c12 = cArr[i18];
            if (c12 != '+') {
                if (c12 == 'E' || c12 == 'e') {
                    if (i14 >= 0) {
                        throw new NumberFormatException("Multiple exponent markers");
                    }
                    i14 = i18;
                } else if (c12 != '-') {
                    if (c12 == '.') {
                        if (i16 >= 0) {
                            throw new NumberFormatException("Multiple decimal points");
                        }
                        i16 = i18;
                    } else if (i16 >= 0 && i14 == -1) {
                        i15++;
                    }
                } else if (i14 >= 0) {
                    if (z13) {
                        throw new NumberFormatException("Multiple signs in exponent");
                    }
                    z13 = true;
                } else {
                    if (z12) {
                        throw new NumberFormatException("Multiple signs in number");
                    }
                    i17 = i18 + 1;
                    z12 = true;
                    z14 = true;
                }
            } else if (i14 >= 0) {
                if (z13) {
                    throw new NumberFormatException("Multiple signs in exponent");
                }
                z13 = true;
            } else {
                if (z12) {
                    throw new NumberFormatException("Multiple signs in number");
                }
                i17 = i18 + 1;
                z12 = true;
            }
        }
        if (i14 >= 0) {
            i13 = Integer.parseInt(new String(cArr, i14 + 1, (length - i14) - 1));
            long j12 = i13;
            long j13 = i15 - j12;
            if (j13 > 2147483647L || j13 < -2147483648L) {
                throw new NumberFormatException("Scale out of range: " + j13 + " while adjusting scale " + i15 + " to exponent " + j12);
            }
            i15 = (int) j13;
            length = i14;
        } else {
            i13 = 0;
        }
        if (i16 >= 0) {
            int i19 = (length - i16) - 1;
            bigDecimalC = c(i17, i16 - i17, i13, i12).add(c(i16 + 1, i19, i13 - i19, i12));
        } else {
            bigDecimalC = c(i17, length - i17, i13, i12);
        }
        if (i15 != 0) {
            bigDecimalC = bigDecimalC.setScale(i15);
        }
        return z14 ? bigDecimalC.negate() : bigDecimalC;
    }

    public final BigDecimal c(int i12, int i13, int i14, int i15) {
        if (i13 <= i15) {
            return i13 == 0 ? BigDecimal.ZERO : new BigDecimal(this.f341143a, i12, i13).movePointRight(i14);
        }
        int i16 = i13 / 2;
        return c(i12, i16, (i14 + i13) - i16, i15).add(c(i12 + i16, i13 - i16, i14, i15));
    }
}
