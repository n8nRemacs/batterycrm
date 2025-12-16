package com.avito.android.gig_motivations_list.ui.compose;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
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
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MotivationsListLoadingContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_gig_motivations-list_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class x {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1536699914);
        if (((i12 | 6) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            vVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            vVar.getClass();
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            float f12 = 16;
            androidx.compose.ui.v vVarA = C22501m2.a(R1.k(f12, 0.0f, 2, R1.m(fillElement, 0.0f, 15, 0.0f, 0.0f, 13)), "LoadingContentSkeletonTag");
            InterfaceC22215f.f39074a.getClass();
            i.a aVar2 = InterfaceC22215f.a.f39088n;
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28662d, aVar2, bE2, 48);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.d(vVar, 0.4f), 21), androidx.compose.foundation.shape.o.a(f12), null, false, bE2, 6, 6), bE2, 0);
            float f13 = 10;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(R1.m(C20588k2.d(vVar, 1.0f), 0.0f, f13, 0.0f, 0.0f, 13), 114), androidx.compose.foundation.shape.o.a(f12), null, false, bE2, 6, 6), bE2, 0);
            float f14 = 12;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(R1.m(C20588k2.d(vVar, 0.64f), 0.0f, 48, 0.0f, 0.0f, 13), f14), androidx.compose.foundation.shape.o.a(f12), null, false, bE2, 6, 6), bE2, 0);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(R1.m(C20588k2.d(vVar, 0.44f), 0.0f, f13, 0.0f, 0.0f, 13), f14), androidx.compose.foundation.shape.o.a(f12), null, false, bE2, 6, 6), bE2, 0);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(R1.m(C20588k2.d(vVar, 0.3f), 0.0f, f13, 0.0f, 0.0f, 13), f14), androidx.compose.foundation.shape.o.a(f12), null, false, bE2, 6, 6), bE2, 0);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(R1.m(C20588k2.d(vVar, 0.55f), 0.0f, f13, 0.0f, 0.0f, 13), f14), androidx.compose.foundation.shape.o.a(f12), null, false, bE2, 6, 6), bE2, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new v(vVar, i12);
        }
    }
}
