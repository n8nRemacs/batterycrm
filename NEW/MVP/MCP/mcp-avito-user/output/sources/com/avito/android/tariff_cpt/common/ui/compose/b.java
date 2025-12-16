package com.avito.android.tariff_cpt.common.ui.compose;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
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
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.button.m;
import com.avito.android.R;
import com.avito.android.error.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ErrorScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_tariff-cpt_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k Throwable th2, @k Y41.a aVar, @l A a12, int i12) {
        B bE2 = a12.E(-289421691);
        v.a aVar2 = v.f42878y1;
        C20585k.f28659a.getClass();
        C20585k.c cVar = C20585k.f28664f;
        InterfaceC22215f.f39074a.getClass();
        i.a aVar3 = InterfaceC22215f.a.f39089o;
        FillElement fillElement = C20588k2.f28682c;
        aVar2.getClass();
        float f12 = 16;
        h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
        v vVarI = R1.i(fillElement, f12);
        I iA2 = H.a(cVar, aVar3, bE2, 54);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVarI);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar5);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        C20806p1.a(u0.e.a(R.drawable.placeholders_ic_unknown_error_cat, 0, bE2), null, C20588k2.o(C22501m2.a(aVar2, "TariffCptErrorScreenImage"), 160), null, null, 0.0f, null, bE2, 440, 120);
        float f13 = 6;
        com.akita.compose.foundation.ui.g.a(f13, null, bE2, 6);
        String strC = u0.i.c(bE2, R.string.tariff_cpt_network_problem_error_title);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
        com.akita.compose.foundation.ui.p.b(strC, iVar.f65232c, C22501m2.a(aVar2, "TariffCptErrorScreenTitle"), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        com.akita.compose.foundation.ui.g.a(f13, null, bE2, 6);
        String strL = z.l(th2);
        androidx.compose.ui.text.style.i.f42675b.getClass();
        com.akita.compose.foundation.ui.p.b(strL, iVar.f65240k, C22501m2.a(aVar2, "TariffCptErrorScreenMessage"), false, 0L, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, bE2, 384, 984);
        com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
        m.a(R.string.tariff_cpt_error_screen_button, aVar, com.akita.compose.theme.re23.b.c(bE2).f2(), C22501m2.a(aVar2, "TariffCptErrorScreenButton"), null, false, false, bE2, 3584, 1008);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(th2, aVar, aVar2, i12);
        }
    }
}
