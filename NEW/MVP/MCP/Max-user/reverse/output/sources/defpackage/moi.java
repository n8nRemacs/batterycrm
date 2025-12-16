package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class moi {
    public static final Object a = new Object();
    public static boolean b;
    public static int c;

    public static final bx7 a(ew7 ew7Var, em6 em6Var) {
        jw7 jw7Var = new jw7();
        lw7 lw7Var = ew7Var.a;
        jw7Var.a = lw7Var.c;
        jw7Var.b = lw7Var.a;
        jw7Var.c = lw7Var.b;
        String str = lw7Var.d;
        jw7Var.d = str;
        jw7Var.e = lw7Var.e;
        jw7Var.f = lw7Var.g;
        jw7Var.g = lw7Var.f;
        jw7Var.h = ew7Var.b;
        em6Var.invoke(jw7Var);
        if (!fni.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        boolean z = jw7Var.b;
        boolean z2 = jw7Var.c;
        boolean z3 = jw7Var.a;
        lw7 lw7Var2 = new lw7(jw7Var.f, jw7Var.d, jw7Var.e, z, z2, z3, jw7Var.g);
        kc3 kc3Var = jw7Var.h;
        bx7 bx7Var = new bx7(lw7Var2, kc3Var);
        fni.a(kc3Var, bhi.a);
        return bx7Var;
    }

    public static int[] b(String str) {
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

    public static String c(int i, int i2, StringBuilder sb) {
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

    public static String d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrB = b(str2);
        if (iArrB[0] != -1) {
            sb.append(str2);
            c(iArrB[1], iArrB[2], sb);
            return sb.toString();
        }
        int[] iArrB2 = b(str);
        if (iArrB[3] == 0) {
            sb.append((CharSequence) str, 0, iArrB2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrB[2] == 0) {
            sb.append((CharSequence) str, 0, iArrB2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrB[1];
        if (i != 0) {
            int i2 = iArrB2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return c(iArrB[1] + i2, i2 + iArrB[2], sb);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrB2[1]);
            sb.append(str2);
            int i3 = iArrB2[1];
            return c(i3, iArrB[2] + i3, sb);
        }
        int i4 = iArrB2[0] + 2;
        int i5 = iArrB2[1];
        if (i4 >= i5 || i5 != iArrB2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrB2[2] - 1);
            int i6 = iLastIndexOf == -1 ? iArrB2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return c(iArrB2[1], i6 + iArrB[2], sb);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = iArrB2[1];
        return c(i7, iArrB[2] + i7 + 1, sb);
    }

    public static Uri e(String str, String str2) {
        return Uri.parse(d(str, str2));
    }
}
