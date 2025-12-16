package com.avito.android.lib.design.input;

import android.annotation.SuppressLint;
import android.text.InputFilter;
import android.widget.EditText;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import com.avito.android.lib.design.input.FormatterType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CustomMaskFormatter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {
    @Y61.k
    public static final b a(@Y61.k EditText editText, @Y61.k FormatterType formatterType, int i12, int i13) {
        CharSequence charSequence;
        if (editText.getText().length() == 0) {
            MaskParameters maskParameters = formatterType.f179302d;
            if (maskParameters == null || (charSequence = maskParameters.f179371b) == null) {
                charSequence = "";
            }
            editText.setText(charSequence);
        }
        b bVar = new b(editText, formatterType, i12, i13);
        editText.addTextChangedListener(bVar);
        bVar.a(editText.getText(), editText.getText());
        return bVar;
    }

    public static final String b(char[] cArr, String str, boolean z12) {
        if (str.length() == 0) {
            return C42756l.O(cArr);
        }
        if (z12) {
            if (str.length() > cArr.length) {
                str = str.substring(str.length() - cArr.length, str.length());
            }
            int i12 = 0;
            int i13 = 0;
            while (i12 < str.length()) {
                char cCharAt = str.charAt(i12);
                int i14 = i13 + 1;
                if (i13 < cArr.length && cCharAt != '#') {
                    cArr[i13] = '#';
                }
                i12++;
                i13 = i14;
            }
        } else {
            int i15 = 0;
            int i16 = 0;
            while (i15 < str.length()) {
                char cCharAt2 = str.charAt(i15);
                int i17 = i16 + 1;
                if (i16 < cArr.length && cCharAt2 != '#') {
                    cArr[i16] = '#';
                }
                i15++;
                i16 = i17;
            }
        }
        return C43066x.a0(C42756l.O(cArr), "#", "", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v10, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Y61.k
    public static final String c(@Y61.k FormatterType formatterType, @Y61.k String str) {
        ?? arrayList;
        Iterable iterableSingletonList;
        MaskParameters maskParameters = formatterType.f179302d;
        if (maskParameters == null) {
            return str;
        }
        char[] charArray = C43066x.X(maskParameters.f179373d, C43066x.U(maskParameters.f179371b, str)).toCharArray();
        boolean zF2 = f(formatterType);
        boolean z12 = maskParameters.f179377h;
        String str2 = maskParameters.f179376g;
        if (zF2) {
            char c12 = maskParameters.f179379j;
            if (C42756l.J(charArray, c12) >= 0) {
                int iJ2 = C42756l.J(charArray, c12);
                if (iJ2 < 0) {
                    throw new IllegalArgumentException(G.e(iJ2, "Requested element count ", " is less than zero.").toString());
                }
                int i12 = 0;
                if (iJ2 == 0) {
                    arrayList = C42784z0.f406748b;
                } else if (iJ2 >= charArray.length) {
                    arrayList = C42756l.d0(charArray);
                } else if (iJ2 == 1) {
                    arrayList = Collections.singletonList(Character.valueOf(charArray[0]));
                } else {
                    arrayList = new ArrayList(iJ2);
                    int i13 = 0;
                    for (char c13 : charArray) {
                        arrayList.add(Character.valueOf(c13));
                        i13++;
                        if (i13 == iJ2) {
                            break;
                        }
                    }
                }
                Collection collection = (Collection) arrayList;
                char[] cArr = new char[collection.size()];
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    cArr[i12] = ((Character) it.next()).charValue();
                    i12++;
                }
                String strB = b(cArr, str2, z12);
                int length = charArray.length - iJ2;
                if (length < 0) {
                    throw new IllegalArgumentException(G.e(length, "Requested element count ", " is less than zero.").toString());
                }
                if (length == 0) {
                    iterableSingletonList = C42784z0.f406748b;
                } else {
                    int length2 = charArray.length;
                    if (length >= length2) {
                        iterableSingletonList = C42756l.d0(charArray);
                    } else if (length == 1) {
                        iterableSingletonList = Collections.singletonList(Character.valueOf(charArray[length2 - 1]));
                    } else {
                        ArrayList arrayList2 = new ArrayList(length);
                        for (int i14 = length2 - length; i14 < length2; i14++) {
                            arrayList2.add(Character.valueOf(charArray[i14]));
                        }
                        iterableSingletonList = arrayList2;
                    }
                }
                return strB.concat(C42745f0.O(iterableSingletonList, "", null, null, null, 62));
            }
        }
        return b(charArray, str2, z12);
    }

    @Y61.k
    public static final d d(@Y61.k FormatterType formatterType, @Y61.l CharSequence charSequence, @Y61.k CharSequence charSequence2, int i12, int i13, boolean z12) {
        String string;
        String strConcat;
        int iMin;
        int iMin2;
        Object objT;
        char c12;
        MaskParameters maskParameters = formatterType.f179302d;
        MaskParameters maskParameters2 = maskParameters == null ? new MaskParameters(null, false, null, null, false, null, false, null, (char) 0, 0, null, 2047, null) : maskParameters;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        String str = maskParameters2.f179371b;
        String str2 = maskParameters2.f179373d;
        if (!z12 && C43066x.X(str2, C43066x.U(str, string)).length() == 0) {
            return new d("", 0);
        }
        String str3 = maskParameters2.f179376g;
        if (str3.length() == 0 && str.length() == 0 && str2.length() == 0) {
            return new d(string, string.length());
        }
        if (string.length() == 0 && (str.length() > 0 || str2.length() > 0)) {
            return new d(androidx.appcompat.app.r.q(str, str2), str.length());
        }
        if (str2.length() > 0 && str.length() > 0 && C43066x.q(string, str, false) && !C43066x.z(C43066x.U(str, string), str2, false)) {
            return new d(charSequence2.toString(), Math.min(charSequence2.length(), str.length()));
        }
        if (str.length() > 0 && C43066x.i0(charSequence2, str) && !C43066x.h0(string, str, false)) {
            return new d(charSequence2.toString(), Math.min(charSequence2.length(), str.length()));
        }
        if (str2.length() > 0 && C43066x.B(charSequence2, str2) && !C43066x.z(string, str2, false)) {
            return new d(charSequence2.toString(), Math.min(charSequence2.length(), str.length()));
        }
        boolean zG2 = g(formatterType, string);
        boolean z13 = maskParameters2.f179377h;
        if (zG2) {
            String strJ = j(h("0".concat(string), str3), str3, z13, formatterType);
            return new d(strJ, Math.min(strJ.length(), Math.max(0, i12 + 1)));
        }
        boolean z14 = (charSequence2.length() < str.length() + str3.length() || charSequence2.length() + 1 == i12) ? z13 : false;
        String strH = h(C43066x.X(str2, C43066x.U(str, string)), str3);
        String str4 = maskParameters2.f179378i;
        if (str4.length() == 0) {
            strConcat = strH.toString();
        } else {
            boolean z15 = false;
            strConcat = strH.toString();
            while (C43066x.h0(strConcat, str4, false)) {
                z15 = true;
                strConcat = C43066x.U(str4, strConcat);
            }
            if (z15 && (strConcat.length() == 0 || g(formatterType, strConcat))) {
                strConcat = str4.concat(strConcat);
            }
        }
        Character chValueOf = maskParameters != null ? Character.valueOf(maskParameters.f179379j) : null;
        String strReplace = strConcat;
        strReplace = strConcat;
        if (f(formatterType) && chValueOf != null) {
            int i14 = 0;
            for (int i15 = 0; i15 < strConcat.length(); i15++) {
                if (strConcat.charAt(i15) == chValueOf.charValue()) {
                    i14++;
                }
            }
            strReplace = strConcat;
            if (i14 > 1) {
                int length = strConcat.length();
                int i16 = 0;
                while (true) {
                    if (i16 >= length) {
                        i16 = -1;
                        break;
                    }
                    if (strConcat.charAt(i16) == chValueOf.charValue()) {
                        break;
                    }
                    i16++;
                }
                strReplace = strConcat.substring(0, i16 + 1).concat(C43066x.a0(strConcat.substring(i16), chValueOf.toString(), "", false));
            }
        }
        if (maskParameters != null && f(formatterType) && (c12 = maskParameters.f179379j) != '.') {
            strReplace = strReplace.replace('.', c12);
        }
        String strH2 = h(C43066x.W(C43066x.T(charSequence2, str), str2), str3);
        String strSubstring = str3.length() > i13 ? z13 ? str3.substring((str3.length() - 1) - i13) : str3.substring(0, i13) : str3;
        int i17 = 0;
        for (int i18 = 0; i18 < strSubstring.length(); i18++) {
            if (strSubstring.charAt(i18) == '#') {
                i17++;
            }
        }
        int length2 = strReplace.length() - strH2.length();
        String strSubstring2 = strReplace;
        if (length2 > 1) {
            Iterator it = C42745f0.U(str, C43066x.X(maskParameters2.f179374e, str)).iterator();
            while (true) {
                if (it.hasNext()) {
                    String str5 = (String) it.next();
                    if (C43066x.i0(strReplace, str5)) {
                        objT = C43066x.T(strReplace, str5);
                        break;
                    }
                } else {
                    String str6 = maskParameters2.f179381l;
                    boolean zI02 = C43066x.i0(strReplace, str6);
                    objT = strReplace;
                    if (zI02) {
                        int length3 = strReplace.length();
                        objT = strReplace;
                        if (length3 >= str6.length() + i17) {
                            objT = C43066x.T(strReplace, str6);
                        }
                    }
                }
            }
            String string2 = objT.toString();
            int length4 = string2.length();
            strSubstring2 = string2;
            strSubstring2 = string2;
            if (length4 > i17 && i17 > 0) {
                strSubstring2 = string2.substring(0, i17);
            }
        }
        String strR = androidx.appcompat.app.r.r(str, str3.length() > 0 ? j(strSubstring2, str3, z14, formatterType) : strSubstring2, str2);
        int iMax = Math.max(str.length(), strR.length() - str2.length());
        if (Math.abs(strSubstring2.length() - strH2.length()) > 1) {
            return new d(strR, iMax);
        }
        String strSubstring3 = C43066x.X(str2, strR).substring(0, Math.min(C43066x.X(str2, strR).length(), i12));
        String strSubstring4 = C43066x.W(charSequence2, str2).toString().substring(0, Math.min(C43066x.C0(C43066x.W(charSequence2, str2)).length(), i12));
        int i19 = 0;
        for (int i22 = 0; i22 < strSubstring3.length(); i22++) {
            if (C43066x.r(str3, strSubstring3.charAt(i22))) {
                i19++;
            }
        }
        int i23 = 0;
        for (int i24 = 0; i24 < strSubstring4.length(); i24++) {
            if (C43066x.r(str3, strSubstring4.charAt(i24))) {
                i23++;
            }
        }
        int i25 = i19 - i23;
        if (!z13) {
            if (strSubstring2.length() < strH2.length()) {
                iMin = Math.min(strR.length(), Math.max(0, i12 - (i25 < 0 ? 1 : 0)));
            } else {
                int i26 = i12 - 1;
                iMin = Math.min(strR.length(), Math.max(0, i12 + ((strR.length() <= i26 || i26 <= 0 || !C43066x.r(str3, strR.charAt(i26))) ? 0 : 1)));
            }
            return new d(strR, iMin);
        }
        if (strSubstring2.length() < strH2.length()) {
            iMin2 = Math.min(strR.length(), Math.max(0, i12 - (i25 < 0 ? 1 : 0)));
        } else {
            int i27 = i25 > 0 ? 1 : 0;
            int i28 = i12 + 1;
            if (strR.length() > i28 && strR.length() > 1 && C43066x.r(str3, strR.charAt(1)) && C43066x.r(str3, strR.charAt(i28))) {
                i27++;
            }
            if (f(formatterType) && i25 < 0) {
                i27 += i25;
            }
            iMin2 = Math.min(strR.length(), Math.max(0, i27 + i12));
        }
        return new d(strR, iMin2);
    }

    @SuppressLint({"NewApi"})
    public static final int e(@Y61.k EditText editText) {
        InputFilter inputFilter;
        InputFilter[] filters = editText.getFilters();
        int length = filters.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                inputFilter = null;
                break;
            }
            inputFilter = filters[i12];
            if (inputFilter instanceof InputFilter.LengthFilter) {
                break;
            }
            i12++;
        }
        if (inputFilter != null) {
            return ((InputFilter.LengthFilter) inputFilter).getMax();
        }
        return Integer.MAX_VALUE;
    }

    public static final boolean f(FormatterType formatterType) {
        int i12 = formatterType.f179300b;
        FormatterType.f179288e.getClass();
        return i12 == FormatterType.a.d().f179300b;
    }

    public static final boolean g(FormatterType formatterType, String str) {
        MaskParameters maskParameters = formatterType.f179302d;
        Character chValueOf = maskParameters != null ? Character.valueOf(maskParameters.f179379j) : null;
        return f(formatterType) && chValueOf != null && (C43066x.j0(str, chValueOf.charValue()) || C43066x.j0(str, '.'));
    }

    @Y61.k
    public static final String h(@Y61.k CharSequence charSequence, @Y61.k String str) {
        Collection collectionSingleton;
        String string = charSequence.toString();
        int length = str.length();
        if (length == 0) {
            collectionSingleton = B0.f406639b;
        } else if (length != 1) {
            int length2 = str.length();
            if (length2 > 128) {
                length2 = 128;
            }
            collectionSingleton = new LinkedHashSet(P0.f(length2));
            for (int i12 = 0; i12 < str.length(); i12++) {
                collectionSingleton.add(Character.valueOf(str.charAt(i12)));
            }
        } else {
            collectionSingleton = Collections.singleton(Character.valueOf(str.charAt(0)));
        }
        Iterator it = collectionSingleton.iterator();
        while (it.hasNext()) {
            string = C43066x.a0(string, String.valueOf(((Character) it.next()).charValue()), "", false);
        }
        return string;
    }

    @Y61.k
    public static final String i(@Y61.k String str, @Y61.k String str2, boolean z12) {
        String string = "";
        int i12 = 0;
        if (z12) {
            if (z12) {
                str2 = new StringBuilder((CharSequence) str2).reverse().toString();
            }
            int length = str.length() - 1;
            while (i12 < str2.length()) {
                char cCharAt = str2.charAt(i12);
                if (length < 0) {
                    return string;
                }
                if (cCharAt == '#') {
                    string = str.charAt(length) + string;
                    length--;
                } else {
                    string = cCharAt + string;
                }
                i12++;
            }
        } else {
            int i13 = 0;
            while (i12 < str2.length()) {
                char cCharAt2 = str2.charAt(i12);
                if (str.length() > i13) {
                    if (cCharAt2 == '#') {
                        StringBuilder sbR = H.r(string);
                        sbR.append(str.charAt(i13));
                        string = sbR.toString();
                        i13++;
                    } else {
                        string = string + cCharAt2;
                    }
                }
                i12++;
            }
        }
        return string;
    }

    @Y61.k
    public static final String j(@Y61.k String str, @Y61.k String str2, boolean z12, @Y61.k FormatterType formatterType) {
        FormatterType.f179288e.getClass();
        if (formatterType.f179300b != FormatterType.a.d().f179300b) {
            return i(str, str2, z12);
        }
        MaskParameters maskParameters = formatterType.f179302d;
        Character chValueOf = maskParameters != null ? Character.valueOf(maskParameters.f179379j) : null;
        if (chValueOf == null || !C43066x.r(str, chValueOf.charValue())) {
            return i(str, str2, z12);
        }
        String strI = i(C43066x.p0(str, chValueOf.charValue()), str2, true);
        String strL0 = C43066x.l0(chValueOf.charValue(), str, str);
        int i12 = maskParameters != null ? maskParameters.f179380k : Integer.MAX_VALUE;
        if (i12 < strL0.length()) {
            strL0 = strL0.substring(0, i12);
        }
        return strI + chValueOf + strL0;
    }
}
