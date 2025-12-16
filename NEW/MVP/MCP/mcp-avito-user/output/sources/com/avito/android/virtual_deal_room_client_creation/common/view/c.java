package com.avito.android.virtual_deal_room_client_creation.common.view;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
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
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.button.m;
import com.akita.compose.foundation.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ActionBlock.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_virtual-deal-room-client-creation_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k String str, @k String str2, @k String str3, @k Y41.a aVar, @l v.a aVar2, @l A a12, int i12) {
        v.a aVar3;
        B bE2 = a12.E(859101653);
        int i13 = i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(str2) ? 32 : 16) | (bE2.B(str3) ? 256 : 128) | (bE2.u(aVar) ? 2048 : 1024) | 24576;
        if ((46811 & i13) == 9362 && bE2.c()) {
            bE2.f();
            aVar3 = aVar2;
        } else {
            v.a aVar4 = v.f42878y1;
            v vVarD = C20588k2.d(aVar4, 1.0f);
            InterfaceC22215f.f39074a.getClass();
            i.a aVar5 = InterfaceC22215f.a.f39089o;
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28662d, aVar5, bE2, 48);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarD);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar6 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar6);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            h.a aVar7 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(34, null, bE2, 6);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            r rVar = iVar.f65239j;
            v vVarD2 = C20588k2.d(aVar4, 1.0f);
            com.akita.compose.theme.re23.a aVar8 = com.akita.compose.theme.re23.b.f63984b;
            long jC2 = aVar8.f63938l.c(bE2);
            s.f42720b.getClass();
            int i15 = s.f42722d;
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i16 = androidx.compose.ui.text.style.i.f42678e;
            com.akita.compose.foundation.ui.p.b(str, rVar, vVarD2, false, jC2, androidx.compose.ui.text.style.i.a(i16), 0, i15, false, null, bE2, (i13 & 14) | 12583296, 840);
            com.akita.compose.foundation.ui.g.a(8, null, bE2, 6);
            com.akita.compose.foundation.ui.p.b(str2, iVar.f65241l, C20588k2.d(aVar4, 1.0f), false, aVar8.f63938l.c(bE2), androidx.compose.ui.text.style.i.a(i16), 0, i15, false, null, bE2, ((i13 >> 3) & 14) | 12583296, 840);
            com.akita.compose.foundation.ui.g.a(22, null, bE2, 6);
            m.b(aVar, com.akita.compose.theme.re23.b.c(bE2).X1(), k12.c(aVar4, aVar5), false, null, androidx.compose.runtime.internal.r.c(-1658117925, new a(str3), bE2), bE2, ((i13 >> 9) & 14) | 196672, 24);
            bE2.X(true);
            aVar3 = aVar4;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(str, str2, str3, aVar, aVar3, i12);
        }
    }
}
