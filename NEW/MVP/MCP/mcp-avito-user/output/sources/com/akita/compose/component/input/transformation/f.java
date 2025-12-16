package com.akita.compose.component.input.transformation;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: PhoneTransformation.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"input_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f {
    public static final String a(String str, String str2) {
        String strSubstring;
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (Character.isDigit(cCharAt) || C43066x.r(str2, cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        int length2 = string.length();
        while (true) {
            if (i12 >= length2) {
                strSubstring = "";
                break;
            }
            if (string.charAt(i12) != '7') {
                strSubstring = string.substring(i12);
                break;
            }
            i12++;
        }
        return C43066x.t0(10, strSubstring);
    }

    @Y61.k
    public static final String b(@Y61.k String str, @Y61.k String str2, boolean z12) {
        String strA = a(str, str2);
        StringBuilder sb2 = new StringBuilder();
        int length = strA.length();
        for (int i12 = 0; i12 < length; i12++) {
            sb2.append(strA.charAt(i12));
            if (z12 && ((i12 == 2 || i12 == 5 || i12 == 7) && i12 != strA.length() - 1)) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }
}
