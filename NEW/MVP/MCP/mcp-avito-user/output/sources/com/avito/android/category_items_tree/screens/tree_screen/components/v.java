package com.avito.android.category_items_tree.screens.tree_screen.components;

import androidx.compose.foundation.a2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.runtime.A;
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
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: Tree.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_category-items-tree_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class v {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k List list, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1435553409);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        C20650b.a(aVar, null, R1.c(16, 0.0f, 2), false, null, null, null, false, null, new q(lVar, list), bE2, ((i12 >> 6) & 14) | 384, 506);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new r(i12, lVar, aVar, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.l v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(755937964);
        if (((i12 | 6) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            aVar = androidx.compose.ui.v.f42878y1;
            bE2.C(1859077469);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                kotlin.collections.builders.b bVarT = C42745f0.t();
                List listU = C42745f0.U(new Q(0, androidx.compose.ui.unit.h.a(247)), new Q(1, androidx.compose.ui.unit.h.a(259)), new Q(2, androidx.compose.ui.unit.h.a(271)));
                for (int i13 = 0; i13 < 3; i13++) {
                    bVarT.addAll(listU);
                }
                objT = C42745f0.p(bVarT);
                bE2.H(objT);
            }
            List list = (List) objT;
            bE2.X(false);
            androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarB = a2.b(R1.k(16, 0.0f, 2, vVarD), a2.a(bE2), true, true);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
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
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            bE2.C(2120517339);
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                Q q12 = (Q) list.get(i15);
                j.b(((Number) q12.f406619b).intValue(), ((androidx.compose.ui.unit.h) q12.f406620c).f42852b, null, bE2, 0);
            }
            bE2.X(false);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new s(aVar, i12);
        }
    }
}
