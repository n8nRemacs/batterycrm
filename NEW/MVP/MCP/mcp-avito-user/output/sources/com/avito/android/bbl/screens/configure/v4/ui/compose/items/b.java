package com.avito.android.bbl.screens.configure.v4.ui.compose.items;

import Bh.C13148c;
import Y41.p;
import Y41.r;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.draw.k;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.text.C22662l;
import androidx.compose.ui.text.X;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.style.j;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.adjust.sdk.network.ErrorCodes;
import com.akita.compose.theme.re23.i;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BblConfigureV4SelectorCard.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Landroidx/compose/foundation/layout/T1;", "paddingValues", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements r<InterfaceC20640y, T1, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C13148c.a f99553l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C13148c.a aVar) {
        super(4);
        this.f99553l = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Throwable] */
    @Override // Y41.r
    public final G0 invoke(InterfaceC20640y interfaceC20640y, T1 t12, A a12, Integer num) {
        Y41.a<InterfaceC22413h> aVar;
        p<InterfaceC22413h, Integer, G0> pVar;
        p<InterfaceC22413h, U, G0> pVar2;
        p<InterfaceC22413h, v, G0> pVar3;
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar4;
        Y41.a<InterfaceC22413h> aVar2;
        p<InterfaceC22413h, Integer, G0> pVar5;
        C20585k.C1589k c1589k;
        i iVar;
        C13148c.a aVar3;
        int i12;
        v vVar;
        int i13;
        v vVar2;
        i iVar2;
        T1 t13 = t12;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 112) == 0) {
            iIntValue |= a13.B(t13) ? 32 : 16;
        }
        if ((iIntValue & 721) == 144 && a13.c()) {
            a13.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            v.a aVar4 = v.f42878y1;
            v vVarH = R1.h(C20588k2.d(aVar4, 1.0f), R1.e(t13.c(LayoutDirection.f42838b), t13.getF28512b(), 0.0f, t13.getF28514d(), 4));
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k2 = C20585k.f28660b;
            C20568f2 c20568f2A = C20563e2.a(c1589k2, bVar, a13, 48);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = n.c(a13, vVarH);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar5);
            } else {
                a13.d();
            }
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar6 = InterfaceC22413h.a.f40796g;
            R3.b(pVar6, a13, c20568f2A);
            p<InterfaceC22413h, U, G0> pVar7 = InterfaceC22413h.a.f40795f;
            R3.b(pVar7, a13, o1Y);
            p<InterfaceC22413h, Integer, G0> pVar8 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar8);
            }
            p<InterfaceC22413h, v, G0> pVar9 = InterfaceC22413h.a.f40793d;
            R3.b(pVar9, a13, vVarC);
            v vVarA = C20576h2.f28641a.a(aVar4, 1.0f, true);
            I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, a13, 0);
            int f37888q2 = a13.getF37888Q();
            O1 o1Y2 = a13.y();
            v vVarC2 = n.c(a13, vVarA);
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar5);
            } else {
                a13.d();
            }
            R3.b(pVar6, a13, iA2);
            R3.b(pVar7, a13, o1Y2);
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar8);
            }
            R3.b(pVar9, a13, vVarC2);
            K k12 = K.f28344a;
            C13148c.a aVar6 = this.f99553l;
            String str = aVar6.f1609b;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar3 = com.akita.compose.theme.re23.b.f63988f;
            v.a aVar7 = aVar4;
            com.akita.compose.foundation.ui.p.b(str, iVar3.f65233d, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            float f12 = 4;
            h.a aVar8 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(f12, null, a13, 6);
            com.akita.compose.foundation.ui.p.b(aVar6.f1613f, iVar3.f65237h, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            a13.C(-322215125);
            C13148c.b bVar2 = aVar6.f1615h;
            if (bVar2 == null) {
                aVar3 = aVar6;
                pVar5 = pVar8;
                pVar4 = pVar6;
                pVar2 = pVar7;
                pVar3 = pVar9;
                aVar2 = aVar5;
                c1589k = c1589k2;
                iVar = iVar3;
                i12 = 6;
                vVar = null;
            } else {
                com.akita.compose.foundation.ui.g.a(8, null, a13, 6);
                float f13 = 16;
                v vVarB = androidx.compose.foundation.A.b(k.a(aVar7, o.a(f13)), com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13), Y0.f39346a);
                C20568f2 c20568f2A2 = C20563e2.a(c1589k2, bVar, a13, 48);
                int f37888q3 = a13.getF37888Q();
                O1 o1Y3 = a13.y();
                v vVarC3 = n.c(a13, vVarB);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    aVar = aVar5;
                    a13.b(aVar);
                } else {
                    aVar = aVar5;
                    a13.d();
                }
                R3.b(pVar6, a13, c20568f2A2);
                R3.b(pVar7, a13, o1Y3);
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q3))) {
                    pVar = pVar8;
                    androidx.appcompat.app.r.B(f37888q3, a13, f37888q3, pVar);
                } else {
                    pVar = pVar8;
                }
                R3.b(pVar9, a13, vVarC3);
                androidx.compose.ui.graphics.painter.e eVarC = com.avito.android.mnz_common.compose.i.c(a13);
                androidx.compose.ui.i iVar4 = InterfaceC22215f.a.f39080f;
                InterfaceC22374n.f40491a.getClass();
                pVar2 = pVar7;
                pVar3 = pVar9;
                pVar4 = pVar6;
                aVar2 = aVar;
                pVar5 = pVar;
                c1589k = c1589k2;
                com.avito.android.mnz_common.compose.i.b(bVar2.f1618a, f13, f13, "BblConfigureV4SelectorBadgeImageTestTag", R1.i(aVar7, 6), eVarC, iVar4, InterfaceC22374n.a.f40494c, a13, 113536440, 64);
                v vVarA2 = C22501m2.a(aVar7, "BblConfigureV4SelectorPromoteBadgeTextTestTag");
                iVar = iVar3;
                aVar3 = aVar6;
                aVar7 = aVar7;
                com.akita.compose.foundation.ui.p.b(bVar2.f1619b, iVar3.f65240k, vVarA2, false, 0L, null, 0, 0, false, null, a13, 384, 1016);
                i12 = 6;
                vVar = null;
                com.akita.compose.foundation.ui.g.b(10, null, a13, 6, 2);
                a13.z();
                G0 g02 = G0.f406611a;
            }
            a13.h();
            com.akita.compose.foundation.ui.g.a(22, vVar, a13, i12);
            C20568f2 c20568f2A3 = C20563e2.a(c1589k, InterfaceC22215f.a.f39087m, a13, 48);
            int f37888q4 = a13.getF37888Q();
            O1 o1Y4 = a13.y();
            v vVarC4 = n.c(a13, aVar7);
            if (a13.F() == null) {
                ?? r112 = vVar;
                C22190v.b();
                throw r112;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar2);
            } else {
                a13.d();
            }
            R3.b(pVar4, a13, c20568f2A3);
            R3.b(pVar2, a13, o1Y4);
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q4))) {
                androidx.appcompat.app.r.B(f37888q4, a13, f37888q4, pVar5);
            }
            R3.b(pVar3, a13, vVarC4);
            C13148c.a aVar9 = aVar3;
            com.akita.compose.theme.re23.i iVar5 = iVar;
            com.akita.compose.foundation.ui.p.b(aVar9.f1614g, iVar5.f65233d, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            a13.C(-1271593436);
            String str2 = aVar9.f1617j;
            if (str2 == null) {
                iVar2 = iVar5;
                i13 = 6;
                vVar2 = null;
            } else {
                i13 = 6;
                vVar2 = null;
                com.akita.compose.foundation.ui.g.b(6, null, a13, 6, 2);
                com.akita.compose.theme.re23.a aVar10 = com.akita.compose.theme.re23.b.f63984b;
                iVar2 = iVar5;
                com.akita.compose.component.strikethrough.b.a(C22662l.a(str2, new e0(aVar10.f63918e0.c(a13), 0L, (androidx.compose.ui.text.font.e0) null, (Z) null, (C22605a0) null, (E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (j) null, (f1) null, (X) null, (androidx.compose.ui.graphics.drawscope.j) null, 65534, (C42822w) null)), iVar2.f65241l, aVar10.f63880R0, null, 0, 0, a13, 0, 56);
                G0 g03 = G0.f406611a;
            }
            a13.h();
            a13.C(-1271574616);
            String str3 = aVar9.f1610c;
            if (str3 != null) {
                com.akita.compose.foundation.ui.g.b(f12, vVar2, a13, i13, 2);
                com.akita.compose.foundation.ui.p.b(str3, iVar2.f65241l, null, false, com.akita.compose.theme.re23.b.f63984b.f63880R0.c(a13), null, 0, 0, false, null, a13, 0, ErrorCodes.PROTOCOL_EXCEPTION);
                G0 g04 = G0.f406611a;
            }
            a13.h();
            a13.z();
            a13.z();
            float f14 = 120;
            androidx.compose.ui.graphics.painter.e eVarC2 = com.avito.android.mnz_common.compose.i.c(a13);
            androidx.compose.ui.i iVar6 = InterfaceC22215f.a.f39080f;
            InterfaceC22374n.f40491a.getClass();
            com.avito.android.mnz_common.compose.i.b(aVar9.f1616i, f14, f14, "BblConfigureV4SelectorRightImageTestTag", null, eVarC2, iVar6, InterfaceC22374n.a.f40494c, a13, 113511864, 80);
            a13.z();
        }
        return G0.f406611a;
    }
}
