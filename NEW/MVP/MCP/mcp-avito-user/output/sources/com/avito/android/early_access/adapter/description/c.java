package com.avito.android.early_access.adapter.description;

import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.v;
import com.akita.compose.foundation.ui.p;
import kotlin.Metadata;

/* compiled from: EarlyAccessDescription.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_early-access_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@l C22602e c22602e, @l v vVar, @l A a12, int i12) {
        B b12;
        B bE2 = a12.E(-958364668);
        int i13 = (bE2.B(c22602e) ? 4 : 2) | i12;
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            if (c22602e == null) {
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new a(c22602e, vVar, i12);
                    return;
                }
                return;
            }
            com.akita.compose.theme.re23.b.f63983a.getClass();
            b12 = bE2;
            p.a(c22602e, com.akita.compose.theme.re23.b.f63988f.f65241l, vVar, false, 0L, null, 0, 0, false, null, bE2, (i13 & 14) | ((i13 << 3) & 896), 1016);
        }
        C22039c2 c22039c2Z2 = b12.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new b(c22602e, vVar, i12);
        }
    }
}
