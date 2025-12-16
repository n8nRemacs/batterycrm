package com.avito.android.str_calendar.seller.warning_dialog.composable;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.v;
import com.akita.compose.component.button.m;
import com.akita.compose.component.button.t;
import com.avito.android.str_booking.network.models.common.Button;
import kotlin.Metadata;

/* compiled from: FooterButton.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_str-calendar_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k Button button, @k Y41.a aVar, @l v vVar, @l A a12, int i12) {
        t tVarM;
        B bE2 = a12.E(-1659176725);
        String title = button.getTitle();
        String preset = button.getPreset();
        if (title != null && preset != null) {
            bE2.C(-521413135);
            if (preset.equals("primary")) {
                bE2.C(1936999412);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                tVarM = com.akita.compose.theme.re23.b.c(bE2).f2();
                bE2.X(false);
            } else if (preset.equals("secondary")) {
                bE2.C(1937001398);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                tVarM = com.akita.compose.theme.re23.b.c(bE2).M();
                bE2.X(false);
            } else {
                bE2.C(1937003222);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                tVarM = com.akita.compose.theme.re23.b.c(bE2).M();
                bE2.X(false);
            }
            t tVar = tVarM;
            bE2.X(false);
            m.c(title, aVar, tVar, vVar, null, null, null, false, false, null, bE2, (i12 & 112) | 512 | ((i12 << 3) & 7168), 1008);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(button, aVar, vVar, i12);
        }
    }
}
