package com.avito.android.lib.deprecated_design.edit_text;

import kotlin.Metadata;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: SimpleMaskFormatter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/edit_text/E;", "Lcom/avito/android/lib/deprecated_design/edit_text/G;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class E implements G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w f177960a;

    public E(@Y61.k String str, char c12) {
        this.f177960a = new w(str, c12);
    }

    @Override // com.avito.android.lib.deprecated_design.edit_text.G
    @Y61.k
    public final C31491d a(int i12, int i13, int i14, @Y61.k CharSequence charSequence) {
        boolean z12 = false;
        w wVar = this.f177960a;
        if (i13 > 0 && i14 == 0) {
            int i15 = i12 + i13;
            boolean z13 = wVar.c(i15) == wVar.c(i12);
            boolean z14 = wVar.c(i12) < i12;
            if (z13 && z14) {
                int iC2 = wVar.c(i12);
                charSequence = C43066x.V(iC2, i12, charSequence);
                i13 = i15 - iC2;
                i12 = iC2;
            }
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i12);
        int i16 = i14 + i12;
        CharSequence charSequenceSubSequence2 = charSequence.subSequence(i16, charSequence.length());
        char[] cArr = new char[i13];
        for (int i17 = 0; i17 < i13; i17++) {
            cArr[i17] = ' ';
        }
        String str = new String(cArr);
        CharSequence charSequenceSubSequence3 = charSequence.subSequence(i12, i16);
        StringBuilder sb2 = new StringBuilder(charSequenceSubSequence);
        sb2.append(str);
        sb2.append(charSequenceSubSequence2);
        String string = w.e(wVar, charSequenceSubSequence).toString();
        String string2 = wVar.d(sb2, new kotlin.ranges.l(i12 + i13, sb2.length(), 1)).toString();
        StringBuilder sb3 = new StringBuilder(string);
        sb3.append(string2);
        CharSequence charSequenceA0 = C43066x.A0(charSequenceSubSequence3);
        if (C43066x.i0(charSequenceA0, "+7")) {
            charSequenceA0 = charSequenceA0.subSequence(2, charSequenceA0.length()).toString();
        }
        String strF = new C43059p("[^\\d]").f(charSequenceA0, "");
        if (strF.length() == 11 && C43066x.j0(strF, '8')) {
            strF = strF.subSequence(1, strF.length()).toString();
        }
        if (sb3.length() == wVar.f177996c.size() && strF.length() == 1) {
            z12 = true;
        }
        return new C31491d(wVar.a(z12 ? string.length() : string.length() + strF.length()), wVar.b(z12 ? androidx.appcompat.app.r.q(string, string2) : string + ((Object) strF) + string2));
    }
}
