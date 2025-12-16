package com.avito.android.mortgage.widgets;

import Y41.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SmsCodeInput.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "code", "_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k java.lang.String r59, int r60, @Y61.k Y41.l r61, @Y61.l androidx.compose.ui.v.a r62, boolean r63, @Y61.l com.akita.compose.component.input.InputState r64, @Y61.l androidx.compose.foundation.text.C20973n1 r65, @Y61.l androidx.compose.foundation.layout.C20585k.j r66, @Y61.l androidx.compose.runtime.A r67, int r68, int r69) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.widgets.i.a(java.lang.String, int, Y41.l, androidx.compose.ui.v$a, boolean, com.akita.compose.component.input.InputState, androidx.compose.foundation.text.n1, androidx.compose.foundation.layout.k$j, androidx.compose.runtime.A, int, int):void");
    }

    public static final void b(int i12, String str, String str2, int i13, l lVar) {
        String string = C43066x.A0(str).toString();
        StringBuilder sb2 = new StringBuilder(str2);
        while (true) {
            if (i12 <= sb2.length() - 1) {
                break;
            } else {
                sb2.append(' ');
            }
        }
        if (string.length() <= 1) {
            Character chE = C43066x.E(string);
            sb2.setCharAt(i12, chE != null ? chE.charValue() : ' ');
            lVar.invoke(sb2.toString());
            return;
        }
        int i14 = 0;
        if (string.length() >= sb2.length()) {
            sb2.setLength(0);
            while (sb2.length() < i13) {
                sb2.append(' ');
            }
            int i15 = 0;
            while (i14 < string.length()) {
                char cCharAt = string.charAt(i14);
                int i16 = i15 + 1;
                if (i15 < sb2.length()) {
                    sb2.setCharAt(i15, cCharAt);
                }
                i14++;
                i15 = i16;
            }
            lVar.invoke(sb2.toString());
            return;
        }
        char cCharAt2 = sb2.charAt(i12);
        StringBuilder sb3 = new StringBuilder();
        int length = string.length();
        for (int i17 = 0; i17 < length; i17++) {
            char cCharAt3 = string.charAt(i17);
            if (cCharAt3 != cCharAt2) {
                sb3.append(cCharAt3);
            }
        }
        String string2 = sb3.toString();
        int i18 = 0;
        while (i14 < string2.length()) {
            char cCharAt4 = string2.charAt(i14);
            int i19 = i18 + 1;
            int i22 = i18 + i12;
            if (i22 < sb2.length()) {
                sb2.setCharAt(i22, cCharAt4);
            }
            i14++;
            i18 = i19;
        }
        lVar.invoke(sb2.toString());
    }
}
