package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
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
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: PositionInSearchHeader.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_position-in-search_stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class D {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l String str, @Y61.l String str2, boolean z12, boolean z13, @Y61.l v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        v.a aVar2;
        boolean z14;
        v.a aVar3;
        androidx.compose.runtime.B bE2 = a12.E(-479441711);
        if (((i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(str2) ? 32 : 16) | (bE2.j(z12) ? 256 : 128) | (bE2.j(z13) ? 2048 : 1024) | 24576) & 46811) == 9362 && bE2.c()) {
            bE2.f();
            aVar3 = aVar;
        } else {
            v.a aVar4 = androidx.compose.ui.v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.c cVar = C20585k.f28664f;
            InterfaceC22215f.f39074a.getClass();
            i.a aVar5 = InterfaceC22215f.a.f39089o;
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(cVar, aVar5, bE2, 54);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar4);
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
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            if (z12) {
                bE2.C(208102402);
                h.a aVar7 = androidx.compose.ui.unit.h.f42849c;
                float f12 = 6;
                C20632w.a(C22501m2.a(com.akita.compose.component.skeleton.b.c(k12.c(C20588k2.q(aVar4, 155, 10), aVar5), androidx.compose.foundation.shape.o.a(f12), null, false, bE2, 0, 6), "header_title_skeleton"), bE2, 0);
                float f13 = 9;
                com.akita.compose.foundation.ui.g.a(f13, null, bE2, 6);
                C20632w.a(C22501m2.a(com.akita.compose.component.skeleton.b.c(k12.c(C20588k2.q(aVar4, WebSocketProtocol.PAYLOAD_SHORT, f13), aVar5), androidx.compose.foundation.shape.o.a(f12), null, false, bE2, 0, 6), "header_sub_title_skeleton"), bE2, 0);
                bE2.X(false);
                aVar2 = aVar4;
            } else {
                bE2.C(208797670);
                String str3 = str == null ? "" : str;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
                com.akita.compose.foundation.r rVar = iVar.f65239j;
                androidx.compose.ui.text.style.s.f42720b.getClass();
                int i14 = androidx.compose.ui.text.style.s.f42722d;
                com.akita.compose.foundation.ui.p.b(str3, rVar, C22501m2.a(aVar4, "header_title"), false, 0L, null, 1, i14, false, null, bE2, 14156160, 824);
                if (z13) {
                    bE2.C(209113715);
                    float f14 = WebSocketProtocol.PAYLOAD_SHORT;
                    h.a aVar8 = androidx.compose.ui.unit.h.f42849c;
                    C20632w.a(C22501m2.a(com.akita.compose.component.skeleton.b.c(R1.m(C20588k2.q(aVar4, f14, 18), 0.0f, 5, 0.0f, 4, 5), androidx.compose.foundation.shape.o.a(6), null, false, bE2, 6, 6), "header_sub_title_skeleton"), bE2, 0);
                    bE2.X(false);
                    z14 = false;
                    aVar2 = aVar4;
                } else {
                    bE2.C(209493124);
                    aVar2 = aVar4;
                    com.akita.compose.foundation.ui.p.b(str2 == null ? "" : str2, iVar.f65245p, C22501m2.a(aVar4, "header_sub_title"), false, 0L, null, 1, i14, false, null, bE2, 14156160, 824);
                    z14 = false;
                    bE2.X(false);
                }
                bE2.X(z14);
            }
            bE2.X(true);
            aVar3 = aVar2;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C(str, str2, z12, z13, aVar3, i12);
        }
    }
}
