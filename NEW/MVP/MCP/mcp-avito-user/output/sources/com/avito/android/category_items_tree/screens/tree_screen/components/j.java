package com.avito.android.category_items_tree.screens.tree_screen.components;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
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
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import shark.AndroidResourceIdNames;

/* compiled from: TreeItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_category-items-tree_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, int i12, boolean z12, boolean z13, @Y61.l v.a aVar, @Y61.l Y41.a aVar2, @Y61.l androidx.compose.runtime.A a12, int i13, int i14) {
        int i15;
        Y41.a aVar3;
        int i16;
        Y41.a aVar4;
        v.a aVar5;
        androidx.compose.runtime.B bE2 = a12.E(767056014);
        if ((i13 & 14) == 0) {
            i15 = (bE2.B(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 112) == 0) {
            i15 |= bE2.m(i12) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i15 |= bE2.j(z12) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            i15 |= bE2.j(z13) ? 2048 : 1024;
        }
        int i17 = i15 | 24576;
        int i18 = i14 & 32;
        if (i18 != 0) {
            i16 = i15 | 221184;
            aVar3 = aVar2;
        } else {
            aVar3 = aVar2;
            i16 = i17 | (bE2.u(aVar3) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        }
        if ((374491 & i16) == 74898 && bE2.c()) {
            bE2.f();
            aVar5 = aVar;
            aVar4 = aVar3;
        } else {
            v.a aVar6 = androidx.compose.ui.v.f42878y1;
            Y41.a aVar7 = i18 != 0 ? e.f117042l : aVar3;
            h.a aVar8 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarD = C20588k2.d(R1.m(C21086w0.c(aVar6, z12, null, null, aVar7, 6), 0.0f, 11, 6, 13, 1), 1.0f);
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i19 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar9 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar9);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i19))) {
                AK.c.y(i19, bE2, i19, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.ui.v vVarA = C20576h2.f28641a.a(R1.m(aVar6, i12 * 20, 0.0f, 17, 0.0f, 10), 1.0f, true);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(str, z13 ? com.akita.compose.theme.re23.b.f63988f.f65239j : com.akita.compose.theme.re23.b.f63988f.f65241l, vVarA, false, 0L, null, 0, 0, false, null, bE2, i16 & 14, 1016);
            bE2.C(-1687174090);
            if (z12) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63986d.getClass();
                com.akita.compose.foundation.ui.o.a(com.akita.compose.theme.re23.g.f65021V1, com.akita.compose.theme.re23.b.f63988f.f65241l, null, null, bE2, 0, 12);
            }
            bE2.X(false);
            bE2.X(true);
            aVar4 = aVar7;
            aVar5 = aVar6;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(str, i12, z12, z13, aVar5, aVar4, i13, i14);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(int i12, float f12, @Y61.l v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i13) {
        int i14;
        androidx.compose.runtime.B bE2 = a12.E(-666910023);
        if ((i13 & 14) == 0) {
            i14 = (bE2.m(i12) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= bE2.k(f12) ? 32 : 16;
        }
        if (((i14 | 384) & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            aVar = androidx.compose.ui.v.f42878y1;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            float f13 = 17;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.q(R1.m(aVar, i12 * 20, f13, 0.0f, f13, 4), f12, 10), androidx.compose.foundation.shape.o.a(6), null, false, bE2, 0, 6), bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(i12, f12, aVar, i13);
        }
    }
}
