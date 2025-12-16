package com.avito.android.iac_dialer_ui.pub.call_screen.active_fallback_modal;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: IacUIActiveFallbackModal.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "shouldBeVisible", "_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class t {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k C43108m c43108m, @Y61.k Y41.a aVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1173150350);
        bE2.C(933142710);
        Object objT = bE2.t();
        A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = C22126m3.g(Boolean.FALSE);
            bE2.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        bE2.X(false);
        C22187u0.d(new d(c43108m, interfaceC22204y1, null), bE2, c43108m);
        if (!((Boolean) interfaceC22204y1.getF42167b()).booleanValue()) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new e(c43108m, aVar, i12);
                return;
            }
            return;
        }
        bE2.C(933151493);
        boolean z12 = (((i12 & 112) ^ 48) > 32 && bE2.B(aVar)) || (i12 & 48) == 32;
        Object objT2 = bE2.t();
        if (z12 || objT2 == c1651a) {
            objT2 = new j(aVar, interfaceC22204y1);
            bE2.H(objT2);
        }
        Y41.a aVar2 = (Y41.a) objT2;
        Object objI = com.akita.compose.component.accordion.s.i(933156303, bE2, false);
        if (objI == c1651a) {
            objI = new f(interfaceC22204y1);
            bE2.H(objI);
        }
        bE2.X(false);
        com.akita.compose.component.modal.B.c((Y41.a) objI, null, null, false, false, null, null, androidx.compose.runtime.internal.r.c(-1004318899, new h(aVar2, interfaceC22204y1), bE2), bE2, 12585990, 118);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new i(c43108m, aVar, i12);
        }
    }

    public static final void b(Y41.a aVar, Y41.a aVar2, A a12, int i12) {
        int i13;
        int i14;
        B b12;
        Y41.a aVar3;
        B bE2 = a12.E(981221747);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.u(aVar) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar2) ? 32 : 16;
        }
        int i15 = i13;
        if ((i15 & 91) == 18 && bE2.c()) {
            bE2.f();
            i14 = i12;
            b12 = bE2;
            aVar3 = aVar2;
        } else {
            v.a aVar4 = v.f42878y1;
            v vVarA = C22501m2.a(aVar4, "IacUITestTags.ActiveFallbackModal.ROOT");
            float f12 = 24;
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            v vVarD = C20588k2.d(R1.l(vVarA, f12, 20, f12, 28), 1.0f);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i16 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar6 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar6);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, iA2);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            Y41.p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            K k12 = K.f28344a;
            v vVarA2 = C22501m2.a(C20588k2.d(aVar4, 1.0f), "IacUITestTags.WaitBottomSheet.ROOT");
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, bE2, 0);
            int i17 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            v vVarC2 = androidx.compose.ui.n.c(bE2, vVarA2);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar6);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, c20568f2A);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            String strC = u0.i.c(bE2, R.string.iac_dialer_ui_public___active_fallback___title);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(strC, iVar.f65234e, c20576h2.a(aVar4, 1.0f, true), false, 0L, null, 0, 0, false, null, bE2, 0, 1016);
            com.akita.compose.foundation.ui.g.b(8, null, bE2, 6, 2);
            com.akita.compose.component.close_button.b.a(aVar, com.akita.compose.theme.re23.b.e(bE2).getF66093g(), C22501m2.a(aVar4, "IacUITestTags.ActiveFallbackModal.CLOSE_BUTTON"), false, null, null, bE2, (i15 & 14) | 384, 56);
            bE2.X(true);
            com.akita.compose.foundation.ui.g.a(6, null, bE2, 6);
            com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, R.string.iac_dialer_ui_public___active_fallback___text), iVar.f65240k, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            com.akita.compose.foundation.ui.g.a(16, null, bE2, 6);
            i14 = i12;
            b12 = bE2;
            aVar3 = aVar2;
            com.akita.compose.component.button.m.c(u0.i.c(bE2, R.string.iac_dialer_ui_public___active_fallback___green_button_title), aVar2, com.akita.compose.component.button.t.c(com.akita.compose.theme.re23.b.c(bE2).m(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, null, null, null, iVar.f65245p, null, 33292287), C22501m2.a(C20588k2.d(aVar4, 1.0f), "IacUITestTags.ActiveFallbackModal.GSM_BUTTON"), u0.i.c(bE2, R.string.iac_dialer_ui_public___active_fallback___green_button_subtitle), null, null, false, false, null, b12, (i15 & 112) | 3584, 992);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new k(i14, aVar, aVar3);
        }
    }
}
