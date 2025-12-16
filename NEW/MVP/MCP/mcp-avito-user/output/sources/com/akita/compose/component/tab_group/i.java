package com.akita.compose.component.tab_group;

import R2.b;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.M1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
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
import androidx.compose.ui.v;
import com.adjust.sdk.network.ErrorCodes;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import shark.AndroidResourceIdNames;

/* compiled from: TabGroupItem.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/akita/compose/foundation/p;", "titleColor", "tab-group_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k R2.b bVar, boolean z12, @Y61.k j jVar, @Y61.k Y41.a aVar, @Y61.l v.a aVar2, @Y61.l A a12, int i12) {
        B b12;
        v.a aVar3;
        B bE2 = a12.E(1990269489);
        int i13 = i12 | (bE2.B(bVar) ? 4 : 2) | (bE2.j(z12) ? 32 : 16) | (bE2.B(jVar) ? 256 : 128) | (bE2.u(aVar) ? 2048 : 1024) | 24576;
        if ((46811 & i13) == 9362 && bE2.c()) {
            bE2.f();
            aVar3 = aVar2;
            b12 = bE2;
        } else {
            v.a aVar4 = androidx.compose.ui.v.f42878y1;
            int i14 = i13 >> 3;
            bE2.C(89009928);
            boolean z13 = bVar.f14072c;
            com.akita.compose.foundation.c cVar = jVar.f63029j;
            InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(!z13 ? cVar.f63577c : z12 ? cVar.f63578d : cVar.f63575a, bE2);
            bE2.X(false);
            b12 = bE2;
            b(bVar, z12, (com.akita.compose.foundation.p) interfaceC22204y1M.getF42167b(), jVar.f63027h, jVar.f63020a, jVar.f63021b, jVar.f63022c, jVar.f63025f, jVar.f63026g, jVar.f63028i, jVar.f63023d, jVar.f63024e, aVar, aVar4, b12, i13 & WebSocketProtocol.PAYLOAD_SHORT, i14 & 8064);
            aVar3 = aVar4;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(bVar, z12, jVar, aVar, aVar3, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(R2.b bVar, boolean z12, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.r rVar, float f12, float f13, float f14, com.akita.compose.foundation.p pVar2, com.akita.compose.foundation.p pVar3, com.akita.compose.foundation.r rVar2, com.akita.compose.component.badge.i iVar, float f15, Y41.a aVar, androidx.compose.ui.v vVar, A a12, int i12, int i13) {
        int i14;
        int i15;
        B b12;
        B bE2 = a12.E(1559084203);
        if ((i12 & 14) == 0) {
            i14 = (bE2.B(bVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.j(z12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= bE2.B(pVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= bE2.B(rVar) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i14 |= bE2.k(f12) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i12 & 458752) == 0) {
            i14 |= bE2.k(f13) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((i12 & 3670016) == 0) {
            i14 |= bE2.k(f14) ? 1048576 : 524288;
        }
        if ((i12 & 29360128) == 0) {
            i14 |= bE2.B(pVar2) ? 8388608 : 4194304;
        }
        if ((i12 & 234881024) == 0) {
            i14 |= bE2.B(pVar3) ? 67108864 : 33554432;
        }
        if ((i12 & 1879048192) == 0) {
            i14 |= bE2.B(rVar2) ? 536870912 : 268435456;
        }
        if ((i13 & 14) == 0) {
            i15 = (bE2.B(iVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 112) == 0) {
            i15 |= bE2.k(f15) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i15 |= bE2.u(aVar) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            i15 |= bE2.B(vVar) ? 2048 : 1024;
        }
        if ((1533916891 & i14) == 306783378 && (i15 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            androidx.compose.ui.v vVarX = C20588k2.x(vVar, null, 3);
            boolean z13 = bVar.f14072c;
            bE2.C(-93920167);
            Object objT = bE2.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT);
            }
            bE2.X(false);
            androidx.compose.ui.semantics.i.f41744b.getClass();
            androidx.compose.ui.v vVarA = androidx.compose.foundation.selection.c.a(vVarX, z12, (androidx.compose.foundation.interaction.m) objT, null, z13, androidx.compose.ui.semantics.i.a(androidx.compose.ui.semantics.i.f41748f), aVar);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i16 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar4 = InterfaceC22413h.a.f40796g;
            R3.b(pVar4, bE2, iA2);
            Y41.p<InterfaceC22413h, U, G0> pVar5 = InterfaceC22413h.a.f40795f;
            R3.b(pVar5, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar6 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar6);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar7 = InterfaceC22413h.a.f40793d;
            R3.b(pVar7, bE2, vVarC);
            K k12 = K.f28344a;
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarX2 = C20588k2.x(aVar3, null, 3);
            int i17 = i15;
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, bE2, 0);
            int i18 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarX2);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(pVar4, bE2, c20568f2A);
            R3.b(pVar5, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
                AK.c.y(i18, bE2, i18, pVar6);
            }
            R3.b(pVar7, bE2, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            com.akita.compose.foundation.ui.p.b(bVar.f14070a.a(bE2), rVar, null, false, pVar.c(bE2), null, 0, 0, false, null, bE2, (i14 >> 6) & 112, ErrorCodes.PROTOCOL_EXCEPTION);
            b.C0936b c0936b = bVar.f14071b;
            if (c0936b == null || c0936b.f14079c) {
                b12 = bE2;
                b12.C(2051813155);
                C20608p2.a(b12, C20588k2.t(aVar3, f13));
                b12.X(false);
            } else {
                bE2.C(2051291580);
                C20608p2.a(bE2, C20588k2.t(aVar3, f12));
                int i19 = (i14 >> 9) & 112;
                int i22 = i14 >> 15;
                int i23 = i19 | (i22 & 896) | (i22 & 7168) | (i22 & 57344);
                int i24 = i17 << 15;
                b12 = bE2;
                c(bVar.f14071b, f12, pVar2, pVar3, rVar2, iVar, f15, null, b12, i23 | (i24 & 458752) | (i24 & 3670016));
                b12.X(false);
            }
            b12.X(true);
            C20608p2.a(b12, C20588k2.f(aVar3, f14));
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(bVar, z12, pVar, rVar, f12, f13, f14, pVar2, pVar3, rVar2, iVar, f15, aVar, vVar, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(b.C0936b c0936b, float f12, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, com.akita.compose.foundation.r rVar, com.akita.compose.component.badge.i iVar, float f13, androidx.compose.ui.v vVar, A a12, int i12) {
        int i13;
        com.akita.compose.foundation.p pVar3;
        com.akita.compose.foundation.p pVar4;
        v.a aVar;
        boolean z12;
        v.a aVar2;
        androidx.compose.ui.v vVar2;
        com.akita.compose.foundation.p pVar5;
        B bE2 = a12.E(-1789770025);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c0936b) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.k(f12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            pVar3 = pVar;
            i13 |= bE2.B(pVar3) ? 256 : 128;
        } else {
            pVar3 = pVar;
        }
        if ((i12 & 7168) == 0) {
            pVar4 = pVar2;
            i13 |= bE2.B(pVar4) ? 2048 : 1024;
        } else {
            pVar4 = pVar2;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.B(rVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.B(iVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((3670016 & i12) == 0) {
            i13 |= bE2.k(f13) ? 1048576 : 524288;
        }
        int i14 = i13 | 12582912;
        if ((23967451 & i14) == 4793490 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
        } else {
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarX = C20588k2.x(aVar3, null, 3);
            C20585k.f28659a.getClass();
            C20585k.j jVarG = C20585k.g(f12);
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(jVarG, InterfaceC22215f.a.f39085k, bE2, 0);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarX);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar6 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar6);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            bE2.C(388021023);
            b.a aVar5 = c0936b.f14077a;
            if (aVar5 != null) {
                b.a.InterfaceC0933a.c cVar = b.a.InterfaceC0933a.c.f14076a;
                b.a.InterfaceC0933a interfaceC0933a = aVar5.f14074b;
                boolean zF2 = L.f(interfaceC0933a, cVar);
                b.a aVar6 = c0936b.f14077a;
                if (zF2) {
                    pVar5 = pVar3;
                } else if (L.f(interfaceC0933a, b.a.InterfaceC0933a.C0934a.f14075a)) {
                    pVar5 = pVar4;
                } else {
                    if (!(interfaceC0933a instanceof b.a.InterfaceC0933a.C0935b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((b.a.InterfaceC0933a.C0935b) aVar6.f14074b).getClass();
                    pVar5 = null;
                }
                int i16 = aVar6.f14073a;
                aVar = aVar3;
                com.akita.compose.foundation.ui.p.b(i16 > 99 ? "99+" : String.valueOf(i16), rVar, null, false, pVar5.c(bE2), null, 0, 0, false, null, bE2, (i14 >> 9) & 112, ErrorCodes.PROTOCOL_EXCEPTION);
            } else {
                aVar = aVar3;
            }
            bE2.X(false);
            if (c0936b.f14078b) {
                v.a aVar7 = aVar;
                int i17 = (i14 >> 15) & 14;
                aVar2 = aVar7;
                z12 = true;
                com.akita.compose.component.badge.a.b(iVar, M1.c(0.0f, f13, 1, aVar7), false, false, null, bE2, i17, 28);
            } else {
                z12 = true;
                aVar2 = aVar;
            }
            bE2.X(z12);
            vVar2 = aVar2;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(c0936b, f12, pVar, pVar2, rVar, iVar, f13, vVar2, i12);
        }
    }
}
