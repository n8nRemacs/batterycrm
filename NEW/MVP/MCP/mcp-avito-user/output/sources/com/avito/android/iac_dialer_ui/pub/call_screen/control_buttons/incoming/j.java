package com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.incoming;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import com.akita.compose.component.button.m;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: IacUIControlButtonsReject.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, @k Y41.a aVar, @l A a12, @l v vVar) {
        int i13;
        v vVar2;
        B b12;
        B bE2 = a12.E(892960663);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i14 = i13 | 48;
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
            b12 = bE2;
        } else {
            v.a aVar2 = v.f42878y1;
            v vVarA = C22501m2.a(aVar2, "IacUITestTags.CallControlButtons.REJECT");
            InterfaceC22215f.f39074a.getClass();
            i.a aVar3 = InterfaceC22215f.a.f39089o;
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28662d, aVar3, bE2, 48);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            m.e(com.akita.compose.theme.re23.e.f64237O3, aVar, com.akita.compose.theme.re23.b.c(bE2).l0(), null, false, false, null, bE2, ((i14 << 3) & 112) | 512, 248);
            com.akita.compose.foundation.ui.g.a(6, null, bE2, 6);
            vVar2 = aVar2;
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, R.string.iac_dialer_ui_public___call_control_buttons___reject), com.akita.compose.theme.re23.b.f63988f.f65245p, null, false, 0L, null, 0, 0, false, null, b12, 0, 1020);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(i12, aVar, vVar2);
        }
    }
}
