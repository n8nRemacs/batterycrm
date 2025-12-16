package com.avito.android.category_items_tree.screens.items_screen.components;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
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

/* compiled from: TextWithIcon.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_category-items-tree_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class E {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.k String str2, @Y61.l v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        v.a aVar2;
        int i13;
        androidx.compose.runtime.B b12;
        String str3;
        androidx.compose.runtime.B bE2 = a12.E(331488954);
        int i14 = i12 | (bE2.B(str) ? 4 : 2);
        if ((i12 & 112) == 0) {
            i14 |= bE2.B(str2) ? 32 : 16;
        }
        int i15 = i14 | 384;
        if ((i15 & 731) == 146 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
            i13 = i12;
            b12 = bE2;
            str3 = str2;
        } else {
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i16 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar3);
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
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.o.a(str, iVar.f65241l, null, null, bE2, i15 & 14, 12);
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.b(4, null, bE2, 6, 2);
            aVar2 = aVar3;
            i13 = i12;
            b12 = bE2;
            str3 = str2;
            com.akita.compose.foundation.ui.p.b(str2, iVar.f65241l, null, false, 0L, null, 0, 0, false, null, b12, (i15 >> 3) & 14, 1020);
            b12.X(true);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C(str, str3, aVar2, i13);
        }
    }
}
