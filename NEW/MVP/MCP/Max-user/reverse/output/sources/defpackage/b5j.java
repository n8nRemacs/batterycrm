package defpackage;

import android.telephony.PhoneNumberUtils;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class b5j {
    public static dj3 a(em6... em6VarArr) {
        if (em6VarArr.length > 0) {
            return new dj3(1, em6VarArr);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static int b(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final String c(aub aubVar, String str, String str2, String str3, int i) throws NumberFormatException {
        try {
            rub rubVarU = aubVar.u(str2, str3);
            if (aubVar.n(rubVarU)) {
                str2 = dnf.p(aubVar.d(rubVarU, 2), '-', ' ', false);
            }
        } catch (NumberParseException unused) {
        }
        if (vmf.Z(str.length(), str2).equals(str)) {
            str2 = str2.substring(str.length(), str2.length());
        }
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str2.charAt(i3);
            if (i2 == i) {
                break;
            }
            sb.append(cCharAt);
            if (PhoneNumberUtils.isNonSeparator(cCharAt)) {
                i2++;
            }
        }
        return vmf.c0(sb.toString()).toString();
    }

    public static final int d(aub aubVar, String str) {
        rub rubVarF = aubVar.f(str);
        if (!aubVar.n(rubVarF)) {
            return Integer.MAX_VALUE;
        }
        return vmf.c0(vmf.M(aubVar.d(rubVarF, 1), "+" + rubVarF.b)).toString().length();
    }

    public static final String e(aub aubVar, String str) {
        rub rubVarF = aubVar.f(str);
        if (!aubVar.n(rubVarF)) {
            return null;
        }
        String strReplaceAll = Pattern.compile("^\\+\\d{1,3}\\s?|[\\(\\)]").matcher(aubVar.d(rubVarF, 2)).replaceAll("");
        Pattern patternCompile = Pattern.compile("\\d");
        String strReplaceAll2 = patternCompile.matcher(strReplaceAll).replaceAll(String.valueOf('X'));
        StringBuilder sb = new StringBuilder();
        int length = strReplaceAll2.length();
        int i = 1;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = strReplaceAll2.charAt(i2);
            if (cCharAt == 'X') {
                sb.append(i);
                i = (i + 1) % 10;
            } else if (cCharAt == '-') {
                sb.append(' ');
            } else {
                sb.append(cCharAt);
            }
        }
        return vmf.c0(sb.toString()).toString();
    }
}
