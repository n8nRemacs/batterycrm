package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

/* compiled from: ImeEditCommand.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20892g0 {
    @j.k0
    public static final void a(@Y61.k androidx.compose.foundation.text.input.i iVar, int i12, int i13) {
        androidx.compose.ui.text.v0 v0Var = iVar.f30760g;
        int iMin = Math.min(i12, i13);
        int iMax = Math.max(i12, i13);
        iVar.d(iMin, iMax, "", 0, 0);
        if (v0Var != null) {
            long jA2 = androidx.compose.foundation.text.input.k.a(iMin, iMax, v0Var.f42736a, 0);
            if (androidx.compose.ui.text.v0.d(jA2)) {
                iVar.f(null);
            } else {
                iVar.e(null, androidx.compose.ui.text.v0.g(jA2), androidx.compose.ui.text.v0.f(jA2));
            }
        }
    }

    @j.k0
    public static final void b(@Y61.k androidx.compose.foundation.text.input.i iVar, int i12, int i13, @Y61.k CharSequence charSequence) {
        int iMin = Math.min(i12, i13);
        int iMax = Math.max(i12, i13);
        int i14 = 0;
        int i15 = iMin;
        while (i15 < iMax && i14 < charSequence.length() && charSequence.charAt(i14) == iVar.f30757d.charAt(i15)) {
            i14++;
            i15++;
        }
        int length = charSequence.length();
        while (iMax > i15 && length > i14 && charSequence.charAt(length - 1) == iVar.f30757d.charAt(iMax - 1)) {
            length--;
            iMax--;
        }
        if (i15 == iMax && i14 == length) {
            iVar.f(null);
            iVar.f30762i = null;
        } else {
            iVar.c(i15, iMax, charSequence.subSequence(i14, length));
        }
        int length2 = charSequence.length() + iMin;
        iVar.g(androidx.compose.ui.text.w0.a(length2, length2));
    }
}
