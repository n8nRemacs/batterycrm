package defpackage;

import java.math.BigDecimal;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class dqa {
    public static final String a = String.valueOf(Long.MIN_VALUE).substring(1);
    public static final String b = String.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD);

    public static BigDecimal a(char[] cArr, int i, int i2) {
        try {
            return new BigDecimal(cArr, i, i2);
        } catch (NumberFormatException unused) {
            throw new NumberFormatException(ho7.i("Value \"", new String(cArr, i, i2), "\" can not be represented as BigDecimal"));
        }
    }

    public static int b(char[] cArr, int i, int i2) {
        int i3 = cArr[(i + i2) - 1] - '0';
        switch (i2) {
            case 9:
                i3 += (cArr[i] - '0') * 100000000;
                i++;
            case 8:
                i3 += (cArr[i] - '0') * 10000000;
                i++;
            case 7:
                i3 += (cArr[i] - '0') * 1000000;
                i++;
            case 6:
                i3 += (cArr[i] - '0') * BuildConfig.FILE_LENGTH_TO_UPLOAD;
                i++;
            case 5:
                i3 += (cArr[i] - '0') * 10000;
                i++;
            case 4:
                i3 += (cArr[i] - '0') * 1000;
                i++;
            case 3:
                i3 += (cArr[i] - '0') * 100;
                i++;
            case 2:
                return ((cArr[i] - '0') * 10) + i3;
            default:
                return i3;
        }
    }

    public static long c(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (b(cArr, i, i3) * 1000000000) + b(cArr, i + i3, 9);
    }
}
