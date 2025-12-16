package kotlin.text;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.InterfaceC42733c0;
import kotlin.InterfaceC42830m;
import kotlin.InterfaceC42831n;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.i1;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import kotlin.sequences.o0;
import kotlin.text.C43049f;
import kotlin.text.C43049f.a;

@Metadata(d1 = {"kotlin/text/y", "kotlin/text/C", "kotlin/text/D", "kotlin/text/E", "kotlin/text/F", "kotlin/text/G", "kotlin/text/H", "kotlin/text/I", "kotlin/text/J", "kotlin/text/P", "kotlin/text/Q", "kotlin/text/a0"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 49)
/* renamed from: kotlin.text.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43066x extends a0 {
    public static boolean A(CharSequence charSequence, char c12) {
        return charSequence.length() > 0 && C43044a.c(charSequence.charAt(charSequence.length() - 1), c12, false);
    }

    @Y61.k
    public static CharSequence A0(@Y61.k CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i12 = 0;
        boolean z12 = false;
        while (i12 <= length) {
            boolean zD2 = C43044a.d(charSequence.charAt(!z12 ? i12 : length));
            if (z12) {
                if (!zD2) {
                    break;
                }
                length--;
            } else if (zD2) {
                i12++;
            } else {
                z12 = true;
            }
        }
        return charSequence.subSequence(i12, length + 1);
    }

    public static boolean B(CharSequence charSequence, CharSequence charSequence2) {
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? z((String) charSequence, (String) charSequence2, false) : P.f(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    @Y61.k
    public static String B0(@Y61.k String str, @Y61.k char... cArr) {
        int length = str.length() - 1;
        int i12 = 0;
        boolean z12 = false;
        while (i12 <= length) {
            boolean z13 = C42756l.J(cArr, str.charAt(!z12 ? i12 : length)) >= 0;
            if (z12) {
                if (!z13) {
                    break;
                }
                length--;
            } else if (z13) {
                i12++;
            } else {
                z12 = true;
            }
        }
        return str.subSequence(i12, length + 1).toString();
    }

    public static boolean C(@Y61.l String str, @Y61.l String str2, boolean z12) {
        return str == null ? str2 == null : !z12 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    @Y61.k
    public static CharSequence C0(@Y61.k CharSequence charSequence) {
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i12 = length - 1;
                if (!C43044a.d(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i12 < 0) {
                    break;
                }
                length = i12;
            }
        }
        return "";
    }

    public static char D(@Y61.k CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    @Y61.k
    public static String D0(@Y61.k String str, @Y61.k char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i12 = length - 1;
                if (C42756l.J(cArr, str.charAt(length)) < 0) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i12 < 0) {
                    break;
                }
                length = i12;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    @Y61.l
    public static Character E(@Y61.k CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    @kotlin.internal.g
    @Y61.k
    public static String E0(@Y61.k String str) {
        int length;
        List listD = C43033p.D(Q(str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (!K((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!C43044a.d(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) C42745f0.a0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listD.size();
        C43068z c43068z = C43068z.f410630l;
        int size = listD.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listD) {
            int i12 = length + 1;
            String strX = null;
            if (length < 0) {
                C42745f0.H0();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length != 0 && length != size) || !K(str3)) {
                strX = x(iIntValue, str3);
                c43068z.getClass();
            }
            if (strX != null) {
                arrayList3.add(strX);
            }
            length = i12;
        }
        StringBuilder sb2 = new StringBuilder(length3);
        C42745f0.N(arrayList3, sb2, "\n", null, null, null, 124);
        return sb2.toString();
    }

    public static int F(@Y61.k CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static String F0(String str) {
        if (K(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listD = C43033p.D(Q(str));
        int length = str.length();
        listD.size();
        C43068z c43068z = C43068z.f410630l;
        int size = listD.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : listD) {
            int i13 = i12 + 1;
            String strSubstring = null;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i12 != 0 && i12 != size) || !K(str2)) {
                int length2 = str2.length();
                int i14 = 0;
                while (true) {
                    if (i14 >= length2) {
                        i14 = -1;
                        break;
                    }
                    if (!C43044a.d(str2.charAt(i14))) {
                        break;
                    }
                    i14++;
                }
                if (i14 != -1 && g0(i14, str2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, false)) {
                    strSubstring = str2.substring(HiAnalyticsConstant.REPORT_VAL_SEPARATOR.length() + i14);
                }
                if (strSubstring != null) {
                    c43068z.getClass();
                } else {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i12 = i13;
        }
        StringBuilder sb2 = new StringBuilder(length);
        C42745f0.N(arrayList, sb2, "\n", null, null, null, 124);
        return sb2.toString();
    }

    public static int G(@Y61.k CharSequence charSequence, @Y61.k String str, int i12, boolean z12) {
        return (z12 || !(charSequence instanceof String)) ? P.b(charSequence, str, i12, charSequence.length(), z12, false) : ((String) charSequence).indexOf(str, i12);
    }

    @Y61.k
    public static CharSequence G0(@Y61.k CharSequence charSequence) {
        int length = charSequence.length();
        for (int i12 = 0; i12 < length; i12++) {
            if (!C43044a.d(charSequence.charAt(i12))) {
                return charSequence.subSequence(i12, charSequence.length());
            }
        }
        return "";
    }

    public static int H(char c12, int i12, int i13, CharSequence charSequence) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return !(charSequence instanceof String) ? P.c(charSequence, new char[]{c12}, i12, false) : ((String) charSequence).indexOf(c12, i12);
    }

    @Y61.k
    public static String H0(@Y61.k String str, @Y61.k char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length();
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (C42756l.J(cArr, str.charAt(i12)) < 0) {
                charSequenceSubSequence = str.subSequence(i12, str.length());
                break;
            }
            i12++;
        }
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ int I(CharSequence charSequence, String str, int i12, boolean z12, int i13) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            z12 = false;
        }
        return G(charSequence, str, i12, z12);
    }

    public static boolean K(@Y61.k CharSequence charSequence) {
        for (int i12 = 0; i12 < charSequence.length(); i12++) {
            if (!C43044a.d(charSequence.charAt(i12))) {
                return false;
            }
        }
        return true;
    }

    public static char L(@Y61.k CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int M(char c12, int i12, int i13, CharSequence charSequence) {
        if ((i13 & 2) != 0) {
            i12 = F(charSequence);
        }
        return !(charSequence instanceof String) ? P.d(charSequence, new char[]{c12}, i12) : ((String) charSequence).lastIndexOf(c12, i12);
    }

    public static int N(int i12, String str, String str2) {
        int iF2 = (i12 & 2) != 0 ? F(str) : 0;
        return str == null ? P.b(str, str2, iF2, 0, false, true) : str.lastIndexOf(str2, iF2);
    }

    public static int O(String str, char[] cArr) {
        return P.d(str, cArr, str.length() - 1);
    }

    @Y61.l
    public static Character P(@Y61.k String str) {
        if (str.length() == 0) {
            return null;
        }
        return Character.valueOf(str.charAt(str.length() - 1));
    }

    @Y61.k
    public static o0 Q(@Y61.k CharSequence charSequence) {
        return new o0(P.e(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new N(charSequence));
    }

    @Y61.k
    public static String R(int i12, @Y61.k String str) {
        CharSequence charSequenceSubSequence;
        if (i12 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Desired length ", " is less than zero."));
        }
        if (i12 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i12);
            int length = i12 - str.length();
            int i13 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                }
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean S(@Y61.k String str, int i12, @Y61.k String str2, int i13, int i14, boolean z12) {
        return !z12 ? str.regionMatches(i12, str2, i13, i14) : str.regionMatches(z12, i12, str2, i13, i14);
    }

    @Y61.k
    public static CharSequence T(@Y61.k CharSequence charSequence, @Y61.k String str) {
        return i0(charSequence, str) ? charSequence.subSequence(str.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @Y61.k
    public static String U(@Y61.k CharSequence charSequence, @Y61.k String str) {
        return i0(str, charSequence) ? str.substring(charSequence.length()) : str;
    }

    @Y61.k
    public static CharSequence V(int i12, int i13, @Y61.k CharSequence charSequence) {
        if (i13 < i12) {
            throw new IndexOutOfBoundsException(androidx.appcompat.app.r.l(i13, i12, "End index (", ") is less than start index (", ")."));
        }
        if (i13 == i12) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() - (i13 - i12));
        sb2.append(charSequence, 0, i12);
        sb2.append(charSequence, i13, charSequence.length());
        return sb2;
    }

    @Y61.k
    public static CharSequence W(@Y61.k CharSequence charSequence, @Y61.k String str) {
        return B(charSequence, str) ? charSequence.subSequence(0, charSequence.length() - str.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @Y61.k
    public static String X(@Y61.k CharSequence charSequence, @Y61.k String str) {
        return B(str, charSequence) ? str.substring(0, str.length() - charSequence.length()) : str;
    }

    @Y61.k
    public static String Y(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        return (str.length() >= str3.length() + str2.length() && i0(str, str2) && B(str, str3)) ? str.substring(str2.length(), str.length() - str3.length()) : str;
    }

    @Y61.k
    public static String Z(int i12, @Y61.k String str) {
        if (i12 < 0) {
            throw new IllegalArgumentException(androidx.appcompat.app.r.p("Count 'n' must be non-negative, but was ", i12, '.').toString());
        }
        if (i12 == 0) {
            return "";
        }
        int i13 = 1;
        if (i12 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb2 = new StringBuilder(str.length() * i12);
            if (1 <= i12) {
                while (true) {
                    sb2.append((CharSequence) str);
                    if (i13 == i12) {
                        break;
                    }
                    i13++;
                }
            }
            return sb2.toString();
        }
        char cCharAt = str.charAt(0);
        char[] cArr = new char[i12];
        for (int i14 = 0; i14 < i12; i14++) {
            cArr[i14] = cCharAt;
        }
        return new String(cArr);
    }

    @Y61.k
    public static String a0(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12) {
        int i12 = 0;
        int iG2 = G(str, str2, 0, z12);
        if (iG2 < 0) {
            return str;
        }
        int length = str2.length();
        int i13 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i12, iG2);
            sb2.append(str3);
            i12 = iG2 + length;
            if (iG2 >= str.length()) {
                break;
            }
            iG2 = G(str, str2, iG2 + i13, z12);
        } while (iG2 > 0);
        sb2.append((CharSequence) str, i12, str.length());
        return sb2.toString();
    }

    public static String c0(String str, String str2, String str3) {
        int iN2 = N(6, str, str2);
        return iN2 == -1 ? str : d0(str, str2.length() + iN2, str.length(), str3).toString();
    }

    @Y61.k
    public static StringBuilder d0(@Y61.k CharSequence charSequence, int i12, int i13, @Y61.k CharSequence charSequence2) {
        if (i13 < i12) {
            throw new IndexOutOfBoundsException(androidx.appcompat.app.r.l(i13, i12, "End index (", ") is less than start index (", ")."));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence, 0, i12);
        sb2.append(charSequence2);
        sb2.append(charSequence, i13, charSequence.length());
        return sb2;
    }

    public static List e0(CharSequence charSequence, char[] cArr) {
        if (cArr.length == 1) {
            return P.h(charSequence, String.valueOf(cArr[0]), 0, false);
        }
        P.g(0);
        C43049f c43049f = new C43049f(charSequence, 0, new L(cArr));
        ArrayList arrayList = new ArrayList(C42745f0.q(new kotlin.sequences.G(c43049f), 10));
        C43049f.a aVar = c43049f.new a();
        while (aVar.hasNext()) {
            arrayList.add(P.i(charSequence, (kotlin.ranges.l) aVar.next()));
        }
        return arrayList;
    }

    public static List f0(CharSequence charSequence, String[] strArr, int i12, int i13) {
        boolean z12 = (i13 & 2) == 0;
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return P.h(charSequence, str, i12, z12);
            }
        }
        InterfaceC43030m interfaceC43030mE = P.e(charSequence, strArr, z12, i12);
        ArrayList arrayList = new ArrayList(C42745f0.q(new kotlin.sequences.G(interfaceC43030mE), 10));
        C43049f.a aVar = ((C43049f) interfaceC43030mE).new a();
        while (aVar.hasNext()) {
            arrayList.add(P.i(charSequence, (kotlin.ranges.l) aVar.next()));
        }
        return arrayList;
    }

    public static boolean g0(int i12, @Y61.k String str, @Y61.k String str2, boolean z12) {
        return !z12 ? str.startsWith(str2, i12) : S(str, i12, str2, 0, str2.length(), z12);
    }

    public static boolean h0(@Y61.k String str, @Y61.k String str2, boolean z12) {
        return !z12 ? str.startsWith(str2) : S(str, 0, str2, 0, str2.length(), z12);
    }

    public static boolean i0(CharSequence charSequence, CharSequence charSequence2) {
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? h0((String) charSequence, (String) charSequence2, false) : P.f(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }

    @Y61.k
    public static void j(@Y61.k StringBuilder sb2, @Y61.k Object... objArr) {
        for (Object obj : objArr) {
            sb2.append(obj);
        }
    }

    public static boolean j0(String str, char c12) {
        return str.length() > 0 && C43044a.c(str.charAt(0), c12, false);
    }

    @Y61.k
    public static void k(@Y61.k StringBuilder sb2, @Y61.k String... strArr) {
        for (String str : strArr) {
            sb2.append(str);
        }
    }

    public static boolean k0(String str, CharSequence charSequence, int i12) {
        return (!(charSequence instanceof String) || str == null) ? P.f(charSequence, i12, str, 0, str.length(), false) : g0(i12, (String) charSequence, str, false);
    }

    public static void l(@Y61.k Appendable appendable, Object obj, @Y61.l Y41.l lVar) throws IOException {
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    @Y61.k
    public static String l0(char c12, @Y61.k String str, @Y61.k String str2) {
        int iH2 = H(c12, 0, 6, str);
        return iH2 == -1 ? str2 : str.substring(iH2 + 1, str.length());
    }

    @InterfaceC42831n
    @Y61.k
    @InterfaceC42830m
    public static String m(@Y61.k String str) {
        return n(str, Locale.getDefault());
    }

    @Y61.k
    public static String m0(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        int I12 = I(str, str2, 0, false, 6);
        return I12 == -1 ? str3 : str.substring(str2.length() + I12, str.length());
    }

    @kotlin.internal.h
    @InterfaceC42733c0
    @InterfaceC42830m
    @InterfaceC42831n
    @Y61.k
    public static String n(@Y61.k String str, @Y61.k Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb2.append(titleCase);
        } else {
            sb2.append(str.substring(0, 1).toUpperCase(locale));
        }
        sb2.append(str.substring(1));
        return sb2.toString();
    }

    @Y61.k
    public static String n0(char c12, @Y61.k String str, @Y61.k String str2) {
        int iM2 = M(c12, 0, 6, str);
        return iM2 == -1 ? str2 : str.substring(iM2 + 1, str.length());
    }

    @InterfaceC42733c0
    @Y61.k
    public static ArrayList o(int i12, @Y61.k String str) {
        W w12 = W.f410587l;
        i1.a(i12, i12);
        int length = str.length();
        int i13 = 0;
        ArrayList arrayList = new ArrayList((length / i12) + (length % i12 == 0 ? 0 : 1));
        while (i13 >= 0 && i13 < length) {
            int i14 = i13 + i12;
            CharSequence charSequenceSubSequence = str.subSequence(i13, (i14 < 0 || i14 > length) ? length : i14);
            w12.getClass();
            arrayList.add(charSequenceSubSequence.toString());
            i13 = i14;
        }
        return arrayList;
    }

    @Y61.k
    public static String o0(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        int iN2 = N(6, str, str2);
        return iN2 == -1 ? str3 : str.substring(str2.length() + iN2, str.length());
    }

    @InterfaceC42733c0
    @Y61.k
    public static String p(@Y61.k char[] cArr, int i12, int i13) {
        AbstractC42738c.a aVar = AbstractC42738c.f406712b;
        int length = cArr.length;
        aVar.getClass();
        if (i12 < 0 || i13 > length) {
            StringBuilder sbY = androidx.appcompat.app.r.y(i12, i13, "startIndex: ", ", endIndex: ", ", size: ");
            sbY.append(length);
            throw new IndexOutOfBoundsException(sbY.toString());
        }
        if (i12 <= i13) {
            return new String(cArr, i12, i13 - i12);
        }
        throw new IllegalArgumentException(androidx.compose.foundation.H.j(i12, i13, "startIndex: ", " > endIndex: "));
    }

    public static String p0(String str, char c12) {
        int iH2 = H(c12, 0, 6, str);
        return iH2 == -1 ? str : str.substring(0, iH2);
    }

    public static boolean q(@Y61.k CharSequence charSequence, @Y61.k CharSequence charSequence2, boolean z12) {
        if (charSequence2 instanceof String) {
            if (I(charSequence, (String) charSequence2, 0, z12, 2) < 0) {
                return false;
            }
        } else if (P.b(charSequence, charSequence2, 0, charSequence.length(), z12, false) < 0) {
            return false;
        }
        return true;
    }

    public static String q0(String str, String str2) {
        int I12 = I(str, str2, 0, false, 6);
        return I12 == -1 ? str : str.substring(0, I12);
    }

    public static boolean r(CharSequence charSequence, char c12) {
        return H(c12, 0, 2, charSequence) >= 0;
    }

    public static String r0(String str, char c12) {
        int iM2 = M(c12, 0, 6, str);
        return iM2 == -1 ? str : str.substring(0, iM2);
    }

    @Y61.k
    public static CharSequence s0(int i12, @Y61.k CharSequence charSequence) {
        if (i12 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Requested character count ", " is less than zero.").toString());
        }
        int length = charSequence.length();
        if (i12 > length) {
            i12 = length;
        }
        return charSequence.subSequence(0, i12);
    }

    @InterfaceC42733c0
    public static boolean t(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2) {
        boolean z12 = charSequence instanceof String;
        if (z12 && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z12 && (charSequence2 instanceof String)) {
            return kotlin.jvm.internal.L.f(charSequence, charSequence2);
        }
        if (charSequence != charSequence2) {
            if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
                int length = charSequence.length();
                for (int i12 = 0; i12 < length; i12++) {
                    if (charSequence.charAt(i12) == charSequence2.charAt(i12)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Y61.k
    public static String t0(int i12, @Y61.k String str) {
        if (i12 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i12 > length) {
            i12 = length;
        }
        return str.substring(0, i12);
    }

    @InterfaceC42733c0
    public static boolean u(@Y61.l String str, @Y61.l String str2) {
        if (str != null) {
            return C(str, str2, true);
        }
        if (str == str2) {
            return true;
        }
        if (str != null && str.length() == str2.length()) {
            int length = str.length();
            for (int i12 = 0; i12 < length; i12++) {
                if (C43044a.c(str.charAt(i12), str2.charAt(i12), true)) {
                }
            }
            return true;
        }
        return false;
    }

    @Y61.k
    public static String u0(int i12, @Y61.k String str) {
        if (i12 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i12 > length) {
            i12 = length;
        }
        return str.substring(length - i12);
    }

    @InterfaceC42733c0
    @Y61.k
    public static String v(@Y61.k byte[] bArr) {
        return new String(bArr, C43047d.f410589b);
    }

    @Y61.l
    @InterfaceC42733c0
    public static Boolean v0(@Y61.k String str) {
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    @Y61.k
    public static CharSequence w(@Y61.k String str) {
        int length = str.length();
        if (1 <= length) {
            length = 1;
        }
        return str.subSequence(length, str.length());
    }

    @Y61.l
    @InterfaceC42733c0
    public static Double w0(@Y61.k String str) {
        try {
            if (C43065w.f410629a.e(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Y61.k
    public static String x(int i12, @Y61.k String str) {
        if (i12 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i12 > length) {
            i12 = length;
        }
        return str.substring(i12);
    }

    @Y61.l
    @InterfaceC42733c0
    public static Float x0(@Y61.k String str) {
        try {
            if (C43065w.f410629a.e(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Y61.k
    public static String y(int i12, @Y61.k String str) {
        if (i12 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length() - i12;
        if (length < 0) {
            length = 0;
        }
        return t0(length, str);
    }

    @Y61.l
    @InterfaceC42733c0
    public static Integer y0(@Y61.k String str) {
        boolean z12;
        int i12;
        int i13;
        C43044a.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i14 = 0;
        char cCharAt = str.charAt(0);
        int i15 = -2147483647;
        if (kotlin.jvm.internal.L.g(cCharAt, 48) < 0) {
            i12 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z12 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i15 = BeduinInputModel.MIN_TEXT_VERSION;
                z12 = true;
            }
        } else {
            z12 = false;
            i12 = 0;
        }
        int i16 = -59652323;
        while (i12 < length) {
            int iDigit = Character.digit((int) str.charAt(i12), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i14 < i16 && (i16 != -59652323 || i14 < (i16 = i15 / 10))) || (i13 = i14 * 10) < i15 + iDigit) {
                return null;
            }
            i14 = i13 - iDigit;
            i12++;
        }
        return z12 ? Integer.valueOf(i14) : Integer.valueOf(-i14);
    }

    public static boolean z(@Y61.k String str, @Y61.k String str2, boolean z12) {
        return !z12 ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    @Y61.l
    @InterfaceC42733c0
    public static Long z0(@Y61.k String str) {
        boolean z12;
        C43044a.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        long j12 = -9223372036854775807L;
        if (kotlin.jvm.internal.L.g(cCharAt, 48) < 0) {
            z12 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z12 = false;
                i12 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j12 = Long.MIN_VALUE;
                i12 = 1;
            }
        } else {
            z12 = false;
        }
        long j13 = -256204778801521550L;
        long j14 = 0;
        long j15 = -256204778801521550L;
        while (i12 < length) {
            int iDigit = Character.digit((int) str.charAt(i12), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j14 < j15) {
                if (j15 != j13) {
                    return null;
                }
                j15 = j12 / 10;
                if (j14 < j15) {
                    return null;
                }
            }
            long j16 = j14 * 10;
            long j17 = iDigit;
            if (j16 < j12 + j17) {
                return null;
            }
            j14 = j16 - j17;
            i12++;
            j13 = -256204778801521550L;
        }
        return z12 ? Long.valueOf(j14) : Long.valueOf(-j14);
    }
}
