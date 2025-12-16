package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class vmf extends dnf {
    public static final int A(int i, CharSequence charSequence, String str, boolean z) {
        return (z || !(charSequence instanceof String)) ? B(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int B(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        ro7 ro7Var;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iY = y(charSequence);
            if (i3 > iY) {
                i3 = iY;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            ro7Var = new ro7(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            ro7Var = new to7(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = ro7Var.c;
        int i6 = ro7Var.b;
        int i7 = ro7Var.a;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    String str2 = (String) charSequence;
                    int length2 = ((String) charSequence3).length();
                    if (!(!z ? str.regionMatches(0, str2, i8, length2) : str.regionMatches(z, 0, str2, i8, length2))) {
                        if (i8 == i6) {
                            break;
                        }
                        i8 += i5;
                    } else {
                        return i8;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!L(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    public static int C(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return !(charSequence instanceof String) ? E(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int D(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return A(i, charSequence, str, z);
    }

    public static final int E(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iY = y(charSequence);
        if (i > iY) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (ozi.b(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iY) {
                return -1;
            }
            i++;
        }
    }

    public static boolean F(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!ozi.c(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int G(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = y(charSequence);
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(cArr[0], i);
        }
        int iY = y(charSequence);
        if (i > iY) {
            i = iY;
        }
        while (-1 < i) {
            if (ozi.b(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int H(String str, CharSequence charSequence, int i) {
        int iY = (i & 2) != 0 ? y(charSequence) : 0;
        return !(charSequence instanceof String) ? B(charSequence, str, iY, 0, false, true) : ((String) charSequence).lastIndexOf(str, iY);
    }

    public static nhg I(CharSequence charSequence) {
        return T(charSequence, new String[]{"\r\n", "\n", "\r"}, 6);
    }

    public static String J(String str, int i, char c) {
        CharSequence charSequenceSubSequence;
        if (i < 0) {
            throw new IllegalArgumentException(wy1.e(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static qt4 K(CharSequence charSequence, String[] strArr, boolean z, int i) {
        P(i);
        return new qt4(charSequence, i, new fnf(Arrays.asList(strArr), z));
    }

    public static final boolean L(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!ozi.b(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String M(String str, String str2) {
        return U(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static String N(String str, String str2) {
        return w(str2, str) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static StringBuilder O(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 < i) {
            throw new IndexOutOfBoundsException(wy1.g("End index (", i2, ") is less than start index (", i, ")."));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static final void P(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(ho7.f(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List Q(int i, CharSequence charSequence, String str, boolean z) {
        P(i);
        int length = 0;
        int iA = A(0, charSequence, str, z);
        if (iA == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iA).toString());
            length = str.length() + iA;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iA = A(length, charSequence, str, z);
        } while (iA != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List R(CharSequence charSequence, char[] cArr) {
        if (cArr.length == 1) {
            return Q(0, charSequence, String.valueOf(cArr[0]), false);
        }
        P(0);
        qt4<to7> qt4Var = new qt4(charSequence, 0, new enf(cArr));
        ArrayList arrayList = new ArrayList(we3.q(new zs(3, qt4Var), 10));
        for (to7 to7Var : qt4Var) {
            arrayList.add(charSequence.subSequence(to7Var.a, to7Var.b + 1).toString());
        }
        return arrayList;
    }

    public static List S(CharSequence charSequence, String[] strArr, int i) {
        boolean z = (i & 2) == 0;
        int i2 = (i & 4) != 0 ? 0 : 2;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return Q(i2, charSequence, str, z);
            }
        }
        qt4<to7> qt4VarK = K(charSequence, strArr, z, i2);
        ArrayList arrayList = new ArrayList(we3.q(new zs(3, qt4VarK), 10));
        for (to7 to7Var : qt4VarK) {
            arrayList.add(charSequence.subSequence(to7Var.a, to7Var.b + 1).toString());
        }
        return arrayList;
    }

    public static nhg T(CharSequence charSequence, String[] strArr, int i) {
        return new nhg(K(charSequence, strArr, (i & 2) == 0, 0), new i0(11, charSequence));
    }

    public static boolean U(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? dnf.r((String) charSequence, (String) charSequence2, false) : L(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static boolean V(String str, char c) {
        return str.length() > 0 && ozi.b(str.charAt(0), c, false);
    }

    public static String W(String str, String str2) {
        int iD = D(str, str2, 0, false, 6);
        return iD == -1 ? str : str.substring(str2.length() + iD, str.length());
    }

    public static String X(String str, String str2) {
        int iD = D(str, str2, 0, false, 6);
        return iD == -1 ? str : str.substring(0, iD);
    }

    public static CharSequence Y(int i, CharSequence charSequence) {
        if (i < 0) {
            throw new IllegalArgumentException(wy1.e(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String Z(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(wy1.e(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static String a0(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(wy1.e(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(length - i);
    }

    public static Boolean b0(String str) {
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence c0(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zC = ozi.c(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static boolean s(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (D(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (B(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean t(CharSequence charSequence, char c) {
        return C(charSequence, c, 0, 2) >= 0;
    }

    public static String u(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(wy1.e(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static boolean v(String str, char c) {
        return str.length() > 0 && ozi.b(str.charAt(y(str)), c, false);
    }

    public static boolean w(String str, CharSequence charSequence) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(str) : L(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static Character x(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static int y(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static Character z(int i, CharSequence charSequence) {
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }
}
