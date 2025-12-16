package com.avito.android.vas_autoprolong.screens.autoprolong.ui;

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
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutoprolongLoading.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_vas-autoprolong_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l v.a aVar, @Y61.l A a12, int i12) {
        v.a aVar2;
        B bE2 = a12.E(349570684);
        if (((i12 | 6) & 11) == 2 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
        } else {
            aVar2 = v.f42878y1;
            v vVarD = C20588k2.d(aVar2, 1.0f);
            float f12 = 16;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            v vVarK = R1.k(f12, 0.0f, 2, vVarD);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarK);
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
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            androidx.compose.foundation.shape.n nVarA = androidx.compose.foundation.shape.o.a(6);
            float f13 = 22;
            com.akita.compose.foundation.ui.g.a(f13, null, bE2, 6);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(aVar2, 224), f13), nVarA, null, false, bE2, 6, 6), bE2, 0);
            com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
            float f14 = 276;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(aVar2, f14), f13), nVarA, null, false, bE2, 6, 6), bE2, 0);
            com.akita.compose.foundation.ui.g.a(30, null, bE2, 6);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.d(aVar2, 1.0f), 76), androidx.compose.foundation.shape.o.a(24), null, false, bE2, 6, 6), bE2, 0);
            com.akita.compose.foundation.ui.g.a(26, null, bE2, 6);
            v vVarT = C20588k2.t(aVar2, f14);
            float f15 = 10;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(vVarT, f15), nVarA, null, false, bE2, 6, 6), bE2, 0);
            com.akita.compose.foundation.ui.g.a(f15, null, bE2, 6);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.d(aVar2, 1.0f), f15), nVarA, null, false, bE2, 6, 6), bE2, 0);
            com.akita.compose.foundation.ui.g.a(f13, null, bE2, 6);
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.f(C20588k2.t(aVar2, 160), f15), nVarA, null, false, bE2, 6, 6), bE2, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(aVar2, i12);
        }
    }
}
