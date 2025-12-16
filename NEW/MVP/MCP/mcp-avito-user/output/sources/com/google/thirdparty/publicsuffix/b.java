package com.google.thirdparty.publicsuffix;

import androidx.compose.ui.graphics.colorspace.e;
import com.google.common.base.C;
import com.google.common.collect.AbstractC37412t1;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: TrieParser.java */
@XY0.b
/* loaded from: classes7.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final C f363035a = new C("");

    public static int a(ArrayDeque arrayDeque, String str, int i12, AbstractC37412t1.b bVar) {
        int length = str.length();
        int i13 = i12;
        char cCharAt = 0;
        while (i13 < length && (cCharAt = str.charAt(i13)) != '&' && cCharAt != '?' && cCharAt != '!' && cCharAt != ':' && cCharAt != ',') {
            i13++;
        }
        arrayDeque.push(new StringBuilder(str.subSequence(i12, i13)).reverse());
        if (cCharAt == '!' || cCharAt == '?' || cCharAt == ':' || cCharAt == ',') {
            C c12 = f363035a;
            c12.getClass();
            Iterator it = arrayDeque.iterator();
            StringBuilder sb2 = new StringBuilder();
            c12.b(sb2, it);
            String string = sb2.toString();
            if (string.length() > 0) {
                for (PublicSuffixType publicSuffixType : PublicSuffixType.values()) {
                    if (publicSuffixType.f363033b == cCharAt || publicSuffixType.f363034c == cCharAt) {
                        bVar.c(string, publicSuffixType);
                    }
                }
                throw new IllegalArgumentException(e.l("No enum corresponding to given code: ", cCharAt));
            }
        }
        int iA2 = i13 + 1;
        if (cCharAt != '?' && cCharAt != ',') {
            while (iA2 < length) {
                iA2 += a(arrayDeque, str, iA2, bVar);
                if (str.charAt(iA2) == '?' || str.charAt(iA2) == ',') {
                    iA2++;
                    break;
                }
            }
        }
        arrayDeque.pop();
        return iA2 - i12;
    }

    public static void b(CharSequence... charSequenceArr) {
        C c12 = f363035a;
        c12.getClass();
        Iterator it = Arrays.asList(charSequenceArr).iterator();
        StringBuilder sb2 = new StringBuilder();
        c12.b(sb2, it);
        String string = sb2.toString();
        AbstractC37412t1.b bVar = new AbstractC37412t1.b();
        int length = string.length();
        for (int iA2 = 0; iA2 < length; iA2 += a(new ArrayDeque(), string, iA2, bVar)) {
        }
        bVar.a(true);
    }
}
