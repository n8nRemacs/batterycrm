package com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: IacUIControlButtonsHangup.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class t {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, @Y61.k Y41.a aVar, @Y61.l androidx.compose.runtime.A a12, @Y61.l androidx.compose.ui.v vVar) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-1898810957);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i14 = i13 | 48;
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            vVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarA = C22501m2.a(vVar, "IacUITestTags.CallControlButtons.HANGUP");
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(R.drawable.iac_dialer_ui_public_icon_hangup_24, 0, bE2);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.button.m.f(eVarA, aVar, com.akita.compose.theme.re23.b.c(bE2).C2(), vVarA, 0.0f, false, false, null, bE2, ((i14 << 3) & 112) | 520, 240);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new r(i12, aVar, vVar);
        }
    }
}
