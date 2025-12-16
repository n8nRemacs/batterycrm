package com.avito.android.iac_dialer_ui.pub.call_screen.toasts;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.v;
import com.akita.compose.component.toast_bar.H;
import com.akita.compose.component.toast_bar.J;
import com.avito.android.R;
import com.avito.android.iac_dialer_ui.pub.call_screen.toasts.IacUICallToastState;
import kotlin.Metadata;

/* compiled from: IacUICallToast.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k IacUICallToastState iacUICallToastState, @l v.a aVar, @k Y41.a aVar2, @l A a12, int i12) {
        int i13;
        J f66806c;
        int i14;
        int i15;
        B bE2 = a12.E(372935355);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(iacUICallToastState) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i16 = i13 | 48;
        if ((i12 & 896) == 0) {
            i16 |= bE2.u(aVar2) ? 256 : 128;
        }
        if ((i16 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            aVar = v.f42878y1;
            boolean z12 = iacUICallToastState instanceof IacUICallToastState.VpnToast;
            if (z12) {
                bE2.C(-7100370);
                if (((IacUICallToastState.VpnToast) iacUICallToastState).getInverseTheme()) {
                    bE2.C(-7098806);
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    f66806c = com.akita.compose.theme.re23.b.u(bE2).getF66804a();
                } else {
                    bE2.C(-7097487);
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    f66806c = com.akita.compose.theme.re23.b.u(bE2).getF66805b();
                }
                bE2.X(false);
                bE2.X(false);
            } else {
                if (!(iacUICallToastState instanceof IacUICallToastState.UnstableConnectionToast)) {
                    throw com.avito.android.bxcontent.mvi.entity.f.q(-7142237, bE2, false);
                }
                bE2.C(-7094264);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                f66806c = com.akita.compose.theme.re23.b.u(bE2).getF66806c();
                bE2.X(false);
            }
            if (z12) {
                i14 = -7089501;
                i15 = R.string.iac_dialer_ui_public___toast_text___vpn;
            } else {
                if (!(iacUICallToastState instanceof IacUICallToastState.UnstableConnectionToast)) {
                    throw com.avito.android.bxcontent.mvi.entity.f.q(-7142237, bE2, false);
                }
                i14 = -7085293;
                i15 = R.string.iac_dialer_ui_public___toast_text___unstable_connection;
            }
            H.a(new e(com.avito.android.bxcontent.mvi.entity.f.j(bE2, i14, i15, bE2, false), f66806c), aVar, r.c(2081998551, new f(iacUICallToastState, aVar2, f66806c), bE2), bE2, 3504, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(iacUICallToastState, aVar, aVar2, i12);
        }
    }
}
