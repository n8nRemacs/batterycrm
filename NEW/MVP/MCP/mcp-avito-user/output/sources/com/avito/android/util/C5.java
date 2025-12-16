package com.avito.android.util;

import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: Strings.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_lang_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes5.dex */
public final class C5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C43059p f318567a = new C43059p("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C43059p f318568b = new C43059p("(?:8|\\+7)?[ \\xA0]?\\(?\\d{3}\\)?[ \\xA0]?\\d{3}?[-\\x{2011} \\xA0]?\\d{2}?[-\\x{2011} \\xA0]?\\d{2}");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C43059p f318569c = new C43059p("(^[^@]{3}|(?!^)\\G)[^@]");

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C43059p f318570d = new C43059p("[^\\d]");

    @Y61.l
    public static final Integer a(@Y61.l String str) {
        if (str == null) {
            return null;
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        int i12 = 0;
        while (characterInstance.next() != -1) {
            i12++;
        }
        return Integer.valueOf(i12);
    }

    @Y61.k
    public static final String b(double d12, boolean z12) {
        String strValueOf = String.valueOf(d12);
        int iH2 = C43066x.H('.', 0, 6, strValueOf);
        String strSubstring = strValueOf.substring(0, iH2);
        String strSubstring2 = strValueOf.substring(iH2 + 1, strValueOf.length());
        if (strSubstring2.length() == 1) {
            strSubstring2 = strSubstring2.concat("0");
        }
        if (strSubstring2.length() > 2) {
            strSubstring2 = strSubstring2.substring(0, 2);
        }
        String strConcat = strSubstring2.equals("00") ? ",00" : ",".concat(strSubstring2);
        String strE = e(strSubstring, ' ');
        return z12 ? androidx.appcompat.app.r.q(strE, strConcat) : (kotlin.jvm.internal.L.f(strE, "0") && kotlin.jvm.internal.L.f(strConcat, ",00")) ? strE : androidx.appcompat.app.r.q(strE, strConcat);
    }

    @Y61.k
    public static final String c(@Y61.k String str) {
        return C43066x.z(str, "/", false) ? str : str.concat("/");
    }

    @Y61.k
    public static final String d(float f12) {
        String strValueOf = String.valueOf(f12);
        int iH2 = C43066x.H('.', 0, 6, strValueOf);
        String strSubstring = strValueOf.substring(0, iH2);
        String strSubstring2 = strValueOf.substring(iH2 + 1, strValueOf.length());
        return e(strSubstring, ' ') + (strSubstring2.equals("0") ? "" : ",".concat(strSubstring2));
    }

    @Y61.l
    public static final String e(@Y61.l String str, char c12) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String str2 = "";
        for (String string = sb2.toString(); string.length() > 0; string = C43066x.y(3, string)) {
            str2 = C43066x.u0(3, string) + c12 + str2;
        }
        return C43066x.A0(str2).toString();
    }

    @Y61.k
    public static final String f(int i12, @Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        int i13 = i12 % 10;
        switch (i12 % 100) {
            case 11:
            case 12:
            case 13:
            case 14:
                if (str3 == null) {
                    break;
                }
                break;
            default:
                if (i13 != 1) {
                    if (i13 != 2 && i13 != 3 && i13 != 4) {
                        if (str3 != null) {
                            break;
                        }
                    } else if (str2 != null) {
                        break;
                    }
                } else if (str != null) {
                }
                break;
        }
        return "";
    }
}
