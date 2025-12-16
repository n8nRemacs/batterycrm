package GZ0;

import java.util.TimeZone;

/* compiled from: ISO8601Utils.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f6571a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i12, char c12) {
        return i12 < str.length() && str.charAt(i12) == c12;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date b(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: GZ0.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(int i12, int i13, String str) {
        int i14;
        int i15;
        if (i12 < 0 || i13 > str.length() || i12 > i13) {
            throw new NumberFormatException(str);
        }
        if (i12 < i13) {
            i15 = i12 + 1;
            int iDigit = Character.digit(str.charAt(i12), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i12, i13));
            }
            i14 = -iDigit;
        } else {
            i14 = 0;
            i15 = i12;
        }
        while (i15 < i13) {
            int i16 = i15 + 1;
            int iDigit2 = Character.digit(str.charAt(i15), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i12, i13));
            }
            i14 = (i14 * 10) - iDigit2;
            i15 = i16;
        }
        return -i14;
    }
}
