package com.avito.android.select.new_metro.compose;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.select.new_metro.item.MetroStationItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MetroStation.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_select_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class z {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k MetroStationItem metroStationItem, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1810779561);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarK = R1.k(L.f265990a, 0.0f, 2, C21086w0.c(C20588k2.f(C20588k2.d(aVar, 1.0f), 44), false, null, null, new w(lVar, metroStationItem), 7));
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarK);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        i.b bVar = InterfaceC22215f.a.f39086l;
        androidx.compose.ui.v vVarM = R1.m(c20576h2.c(aVar, bVar), 0.0f, 0.0f, 10, 0.0f, 11);
        boolean z12 = metroStationItem.f266204g;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.toggle.j.b(z12, new x(lVar, metroStationItem), com.akita.compose.theme.re23.b.v(bE2).getF66823a(), vVarM, null, null, bE2, 0, 112);
        bE2.C(-622649106);
        if (metroStationItem.f266205h) {
            Q.b(metroStationItem.f266207j, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(bE2), c20576h2.c(aVar, bVar), bE2, 8, 0);
        }
        bE2.X(false);
        com.akita.compose.foundation.ui.p.b(metroStationItem.f266203f, com.akita.compose.theme.re23.b.f63988f.f65241l, R1.m(c20576h2.c(aVar, bVar), 3, 0.0f, 0.0f, 0.0f, 14), false, 0L, null, 0, 0, false, null, bE2, 0, 1016);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new y(metroStationItem, lVar, aVar, i12);
        }
    }
}
