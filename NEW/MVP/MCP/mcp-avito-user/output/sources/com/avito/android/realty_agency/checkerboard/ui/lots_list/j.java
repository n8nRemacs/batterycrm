package com.avito.android.realty_agency.checkerboard.ui.lots_list;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LotsListEmpty.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_realty-agency_checkerboard_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j {

    /* compiled from: LotsListEmpty.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            j.a(a12, C22066f2.a(1));
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        B bE2 = a12.E(-1824309722);
        if (i12 == 0 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.getClass();
            C20585k.f28659a.getClass();
            C20585k.c cVar = C20585k.f28664f;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(cVar, InterfaceC22215f.a.f39089o, bE2, 54);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, fillElement);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            String strC = u0.i.c(bE2, R.string.realty_agency_checkerboard_lots_list_empty_title);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(strC, iVar.f65232c, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(6, null, bE2, 6);
            String strC2 = u0.i.c(bE2, R.string.realty_agency_checkerboard_lots_list_empty_description);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            com.akita.compose.foundation.ui.p.b(strC2, iVar.f65240k, R1.k(16, 0.0f, 2, aVar), false, 0L, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, bE2, 384, 984);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(2);
        }
    }
}
