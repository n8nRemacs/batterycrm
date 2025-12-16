package com.avito.android.bbl.screens.configure.v4.ui.compose;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
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
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BblConfigureV4Skeleton.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_bbl_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l v vVar, @Y61.l A a12, int i12) {
        v vVar2;
        B bE2 = a12.E(902396403);
        if (((i12 | 6) & 11) == 2 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
        } else {
            vVar2 = v.f42878y1;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.skeleton.d f66675a = com.akita.compose.theme.re23.b.p(bE2).getF66675a();
            v vVarA = C22501m2.a(vVar2, "BblConfigureV4SkeletonTestTag");
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
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
            float f12 = 21;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            float f13 = 16;
            v vVarQ = C20588k2.q(R1.k(f13, 0.0f, 2, vVar2), 160, f12);
            s.f99611a.getClass();
            androidx.compose.foundation.shape.n nVar = s.f99612b;
            C20632w.a(com.akita.compose.component.skeleton.b.c(vVarQ, nVar, f66675a, false, bE2, 54, 4), bE2, 0);
            com.akita.compose.foundation.ui.g.a(15, null, bE2, 6);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.q(R1.k(f13, 0.0f, 2, vVar2), 280, f12), nVar, f66675a, false, bE2, 54, 4), bE2, 0);
            com.akita.compose.foundation.ui.g.a(30, null, bE2, 6);
            float f14 = 10;
            float f15 = 154;
            v vVarO = C20588k2.o(C20588k2.d(R1.k(f14, 0.0f, 2, vVar2), 1.0f), f15);
            androidx.compose.foundation.shape.n nVar2 = s.f99613c;
            C20632w.a(com.akita.compose.component.skeleton.b.c(vVarO, nVar2, f66675a, false, bE2, 54, 4), bE2, 0);
            float f16 = 8;
            com.akita.compose.foundation.ui.g.a(f16, null, bE2, 6);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.d(R1.k(f14, 0.0f, 2, vVar2), 1.0f), f15), nVar2, f66675a, false, bE2, 54, 4), bE2, 0);
            com.akita.compose.foundation.ui.g.a(f16, null, bE2, 6);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.o(C20588k2.d(R1.k(f14, 0.0f, 2, vVar2), 1.0f), f15), nVar2, f66675a, false, bE2, 54, 4), bE2, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new q(vVar2, i12);
        }
    }
}
