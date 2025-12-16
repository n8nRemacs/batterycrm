package kotlin.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.sequences.InterfaceC43030m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Strings.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes8.dex */
public class P extends J {
    public static final int b(CharSequence charSequence, CharSequence charSequence2, int i12, int i13, boolean z12, boolean z13) {
        kotlin.ranges.j jVarK;
        if (z13) {
            int iF2 = C43066x.F(charSequence);
            if (i12 > iF2) {
                i12 = iF2;
            }
            if (i13 < 0) {
                i13 = 0;
            }
            jVarK = kotlin.ranges.s.k(i12, i13);
        } else {
            if (i12 < 0) {
                i12 = 0;
            }
            int length = charSequence.length();
            if (i13 > length) {
                i13 = length;
            }
            jVarK = new kotlin.ranges.l(i12, i13, 1);
        }
        boolean z14 = charSequence instanceof String;
        int i14 = jVarK.f406907d;
        int i15 = jVarK.f406906c;
        int i16 = jVarK.f406905b;
        if (z14 && (charSequence2 instanceof String)) {
            if ((i14 <= 0 || i16 > i15) && (i14 >= 0 || i15 > i16)) {
                return -1;
            }
            while (!C43066x.S((String) charSequence2, 0, (String) charSequence, i16, ((String) charSequence2).length(), z12)) {
                if (i16 == i15) {
                    return -1;
                }
                i16 += i14;
            }
            return i16;
        }
        if ((i14 <= 0 || i16 > i15) && (i14 >= 0 || i15 > i16)) {
            return -1;
        }
        while (!f(charSequence2, 0, charSequence, i16, charSequence2.length(), z12)) {
            if (i16 == i15) {
                return -1;
            }
            i16 += i14;
        }
        return i16;
    }

    public static final int c(@Y61.k CharSequence charSequence, @Y61.k char[] cArr, int i12, boolean z12) {
        if (!z12 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i12);
        }
        if (i12 < 0) {
            i12 = 0;
        }
        int length2 = charSequence.length() - 1;
        if (i12 > length2) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i12);
            for (char c12 : cArr) {
                if (C43044a.c(c12, cCharAt, z12)) {
                    return i12;
                }
            }
            if (i12 == length2) {
                return -1;
            }
            i12++;
        }
    }

    public static final int d(@Y61.k CharSequence charSequence, @Y61.k char[] cArr, int i12) {
        if (cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).lastIndexOf(cArr[0], i12);
        }
        int length2 = charSequence.length() - 1;
        if (i12 > length2) {
            i12 = length2;
        }
        while (-1 < i12) {
            char cCharAt = charSequence.charAt(i12);
            for (char c12 : cArr) {
                if (C43044a.c(c12, cCharAt, false)) {
                    return i12;
                }
            }
            i12--;
        }
        return -1;
    }

    public static InterfaceC43030m e(CharSequence charSequence, String[] strArr, boolean z12, int i12) {
        g(i12);
        return new C43049f(charSequence, i12, new M(Arrays.asList(strArr), z12));
    }

    public static final boolean f(@Y61.k CharSequence charSequence, int i12, @Y61.k CharSequence charSequence2, int i13, int i14, boolean z12) {
        if (i13 < 0 || i12 < 0 || i12 > charSequence.length() - i14 || i13 > charSequence2.length() - i14) {
            return false;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            if (!C43044a.c(charSequence.charAt(i12 + i15), charSequence2.charAt(i13 + i15), z12)) {
                return false;
            }
        }
        return true;
    }

    public static final void g(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List h(CharSequence charSequence, String str, int i12, boolean z12) {
        g(i12);
        int length = 0;
        int iG2 = C43066x.G(charSequence, str, 0, z12);
        if (iG2 == -1 || i12 == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z13 = i12 > 0;
        int i13 = 10;
        if (z13 && i12 <= 10) {
            i13 = i12;
        }
        ArrayList arrayList = new ArrayList(i13);
        do {
            arrayList.add(charSequence.subSequence(length, iG2).toString());
            length = str.length() + iG2;
            if (z13 && arrayList.size() == i12 - 1) {
                break;
            }
            iG2 = C43066x.G(charSequence, str, length, z12);
        } while (iG2 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    @Y61.k
    public static final String i(@Y61.k CharSequence charSequence, @Y61.k kotlin.ranges.l lVar) {
        return charSequence.subSequence(lVar.f406905b, lVar.f406906c + 1).toString();
    }
}
