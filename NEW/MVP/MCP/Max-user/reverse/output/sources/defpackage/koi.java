package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* loaded from: classes.dex */
public abstract class koi {
    public static final qt5 a;
    public static final qt5[] b;

    static {
        qt5 qt5Var = new qt5("moduleinstall", 7L);
        a = qt5Var;
        b = new qt5[]{qt5Var};
    }

    public static final JsonEncodingException a(Number number, String str) {
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) f(-1, str)));
    }

    public static final JsonDecodingException b(String str, CharSequence charSequence, int i) {
        StringBuilder sbO = ho7.o(str, "\nJSON input: ");
        sbO.append((Object) f(i, charSequence));
        String string = sbO.toString();
        if (i >= 0) {
            string = "Unexpected JSON token at offset " + i + ": " + string;
        }
        return new JsonDecodingException(string);
    }

    public static int[] c(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static final void d(ggg gggVar, String str) {
        gggVar.F(gggVar.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static /* synthetic */ void e(ggg gggVar) {
        d(gggVar, "object");
        throw null;
    }

    public static final CharSequence f(int i, CharSequence charSequence) {
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbM = az1.m(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbM.append(charSequence.subSequence(i2, i3).toString());
                sbM.append(str2);
                return sbM.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static String g(int i, int i2, StringBuilder sb) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i5 - 2) + 1;
                    int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i7, i3);
                    i2 -= i3 - i7;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    public static String h(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrC = c(str2);
        if (iArrC[0] != -1) {
            sb.append(str2);
            g(iArrC[1], iArrC[2], sb);
            return sb.toString();
        }
        int[] iArrC2 = c(str);
        if (iArrC[3] == 0) {
            sb.append((CharSequence) str, 0, iArrC2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrC[2] == 0) {
            sb.append((CharSequence) str, 0, iArrC2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrC[1];
        if (i != 0) {
            int i2 = iArrC2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return g(iArrC[1] + i2, i2 + iArrC[2], sb);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrC2[1]);
            sb.append(str2);
            int i3 = iArrC2[1];
            return g(i3, iArrC[2] + i3, sb);
        }
        int i4 = iArrC2[0] + 2;
        int i5 = iArrC2[1];
        if (i4 >= i5 || i5 != iArrC2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrC2[2] - 1);
            int i6 = iLastIndexOf == -1 ? iArrC2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return g(iArrC2[1], i6 + iArrC[2], sb);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = iArrC2[1];
        return g(i7, iArrC[2] + i7 + 1, sb);
    }

    public static Uri i(String str, String str2) {
        return Uri.parse(h(str, str2));
    }
}
