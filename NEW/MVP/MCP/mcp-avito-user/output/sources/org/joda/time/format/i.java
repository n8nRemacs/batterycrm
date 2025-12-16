package org.joda.time.format;

import java.io.IOException;

/* compiled from: FormatUtils.java */
/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final double f420789a = Math.log(10.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f420790b = 0;

    public static void a(Appendable appendable, int i12, int i13) throws IOException {
        if (i12 < 0) {
            appendable.append('-');
            if (i12 == Integer.MIN_VALUE) {
                while (i13 > 10) {
                    appendable.append('0');
                    i13--;
                }
                appendable.append("2147483648");
                return;
            }
            i12 = -i12;
        }
        if (i12 < 10) {
            while (i13 > 1) {
                appendable.append('0');
                i13--;
            }
            appendable.append((char) (i12 + 48));
            return;
        }
        if (i12 >= 100) {
            int iLog = i12 < 1000 ? 3 : i12 < 10000 ? 4 : ((int) (Math.log(i12) / f420789a)) + 1;
            while (i13 > iLog) {
                appendable.append('0');
                i13--;
            }
            appendable.append(Integer.toString(i12));
            return;
        }
        while (i13 > 2) {
            appendable.append('0');
            i13--;
        }
        int i14 = ((i12 + 1) * 13421772) >> 27;
        appendable.append((char) (i14 + 48));
        appendable.append((char) (((i12 - (i14 << 3)) - (i14 << 1)) + 48));
    }

    public static void b(StringBuffer stringBuffer, int i12, int i13) {
        try {
            a(stringBuffer, i12, i13);
        } catch (IOException unused) {
        }
    }

    public static void c(Appendable appendable, int i12) throws IOException {
        if (i12 < 0) {
            appendable.append('-');
            if (i12 == Integer.MIN_VALUE) {
                appendable.append("2147483648");
                return;
            }
            i12 = -i12;
        }
        if (i12 < 10) {
            appendable.append((char) (i12 + 48));
        } else {
            if (i12 >= 100) {
                appendable.append(Integer.toString(i12));
                return;
            }
            int i13 = ((i12 + 1) * 13421772) >> 27;
            appendable.append((char) (i13 + 48));
            appendable.append((char) (((i12 - (i13 << 3)) - (i13 << 1)) + 48));
        }
    }

    public static int d(long j12) {
        if (j12 < 0) {
            if (j12 != Long.MIN_VALUE) {
                return d(-j12) + 1;
            }
            return 20;
        }
        if (j12 < 10) {
            return 1;
        }
        if (j12 < 100) {
            return 2;
        }
        if (j12 < 1000) {
            return 3;
        }
        if (j12 < 10000) {
            return 4;
        }
        return 1 + ((int) (Math.log(j12) / f420789a));
    }

    public static int e(int i12, String str) {
        int iCharAt = str.charAt(i12) - '0';
        return (str.charAt(i12 + 1) + ((iCharAt << 3) + (iCharAt << 1))) - 48;
    }
}
