package com.avito.android.services_portfolio.project.seller.ui;

import androidx.compose.foundation.a2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.grid.C20672g;
import androidx.compose.foundation.lazy.grid.InterfaceC20662b;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.services_portfolio.project.seller.mvi.entity.ActionType;
import com.avito.android.services_portfolio.project.seller.mvi.entity.ModerationType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kv0.C43502a;
import kv0.d;

/* compiled from: PortfolioProjectSellerScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class p extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d.b f280334l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f280335m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f280336n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(d.b bVar, com.avito.android.deeplink_handler.handler.composite.a aVar, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f280334l = bVar;
        this.f280335m = aVar;
        this.f280336n = interfaceC22204y1;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        InterfaceC22204y1 interfaceC22204y1;
        kv0.e eVar;
        int i12;
        kv0.e eVar2;
        InterfaceC22204y1 interfaceC22204y12;
        kv0.f fVar;
        int i13;
        kv0.f fVar2;
        Object next;
        Object next2;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarB = a2.b(aVar, a2.a(a13), true, true);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            i.a aVar2 = InterfaceC22215f.a.f39088n;
            I iA2 = H.a(lVar, aVar2, a13, 0);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarB);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar3);
            } else {
                a13.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, a13, iA2);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, a13, vVarC);
            K k12 = K.f28344a;
            a13.C(856321355);
            kv0.e eVar3 = this.f280334l.f413278d;
            C43502a c43502a = eVar3.f413287g;
            ModerationType moderationType = ModerationType.f280256d;
            InterfaceC22204y1 interfaceC22204y13 = this.f280336n;
            if (c43502a.f413262a != moderationType) {
                androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
                h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarK = R1.k(10, 0.0f, 2, vVarD);
                float f12 = 28;
                androidx.compose.ui.v vVarM = R1.m(vVarK, 0.0f, 0.0f, 0.0f, f12, 7);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                float f13 = 20;
                androidx.compose.ui.v vVarB2 = androidx.compose.foundation.A.b(vVarM, com.akita.compose.theme.re23.b.f63984b.f63829A0.c(a13), androidx.compose.foundation.shape.o.a(f13));
                I iA3 = H.a(lVar, aVar2, a13, 0);
                int f37888q2 = a13.getF37888Q();
                O1 o1Y2 = a13.y();
                androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, vVarB2);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                R3.b(pVar, a13, iA3);
                R3.b(pVar2, a13, o1Y2);
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                    androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar3);
                }
                R3.b(pVar4, a13, vVarC2);
                androidx.compose.ui.v vVarM2 = R1.m(R1.k(24, 0.0f, 2, aVar), 0.0f, f13, 0.0f, f12, 5);
                I iA4 = H.a(lVar, aVar2, a13, 0);
                int f37888q3 = a13.getF37888Q();
                O1 o1Y3 = a13.y();
                androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(a13, vVarM2);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                R3.b(pVar, a13, iA4);
                R3.b(pVar2, a13, o1Y3);
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q3))) {
                    androidx.appcompat.app.r.B(f37888q3, a13, f37888q3, pVar3);
                }
                R3.b(pVar4, a13, vVarC3);
                C43502a c43502a2 = eVar3.f413287g;
                a13.C(1655835315);
                String str = c43502a2.f413264c;
                if (str == null) {
                    interfaceC22204y12 = interfaceC22204y13;
                    eVar = eVar3;
                } else {
                    eVar = eVar3;
                    interfaceC22204y12 = interfaceC22204y13;
                    com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65232c, R1.m(aVar, 0.0f, 0.0f, 0.0f, 12, 7), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
                    G0 g02 = G0.f406611a;
                }
                a13.h();
                a13.C(1655847377);
                List<AttributedText> list = c43502a2.f413263b;
                com.avito.android.deeplink_handler.handler.composite.a aVar5 = this.f280335m;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        com.avito.android.lib.compose.design.component.attributedtext.a.a(androidx.compose.ui.v.f42878y1, C34942f.f280317l, new g((AttributedText) it.next(), aVar5), 0, a13, 54, 8);
                    }
                    G0 g03 = G0.f406611a;
                }
                a13.h();
                ArrayList arrayList = c43502a2.f413265d;
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        kv0.f fVar3 = (kv0.f) next2;
                        if ((fVar3 != null ? fVar3.f413288a : null) == ActionType.f280251c) {
                            break;
                        }
                    }
                    fVar = (kv0.f) next2;
                } else {
                    fVar = null;
                }
                a13.C(1655871892);
                if (fVar == null) {
                    i13 = 2;
                } else {
                    a13.C(1655873784);
                    String str2 = fVar.f413289b;
                    if (str2 == null) {
                        i13 = 2;
                    } else {
                        i13 = 2;
                        com.avito.android.services_portfolio.project.components.i.a(384, a13, R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 2, 0.0f, 0.0f, 13), str2, String.valueOf(fVar.f413290c));
                        G0 g04 = G0.f406611a;
                    }
                    a13.h();
                }
                a13.h();
                if (arrayList != null) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        kv0.f fVar4 = (kv0.f) next;
                        if ((fVar4 != null ? fVar4.f413288a : null) == ActionType.f280250b) {
                            break;
                        }
                    }
                    fVar2 = (kv0.f) next;
                } else {
                    fVar2 = null;
                }
                a13.C(1655892847);
                if (fVar2 == null) {
                    i12 = i13;
                    interfaceC22204y1 = interfaceC22204y12;
                } else {
                    String strValueOf = String.valueOf(fVar2.f413289b);
                    InterfaceC22204y1 interfaceC22204y14 = interfaceC22204y12;
                    h hVar = new h(fVar2, aVar5, interfaceC22204y14);
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    interfaceC22204y1 = interfaceC22204y14;
                    i12 = i13;
                    com.akita.compose.component.button.m.c(strValueOf, hVar, com.akita.compose.theme.re23.b.c(a13).i(), R1.m(androidx.compose.ui.v.f42878y1, 0.0f, 12, 0.0f, 0.0f, 13), null, null, null, false, false, null, a13, 3584, 1008);
                    G0 g05 = G0.f406611a;
                }
                a13.h();
                a13.z();
                a13.z();
            } else {
                interfaceC22204y1 = interfaceC22204y13;
                eVar = eVar3;
                i12 = 2;
            }
            a13.h();
            v.a aVar6 = androidx.compose.ui.v.f42878y1;
            h.a aVar7 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM3 = R1.m(R1.k(16, 0.0f, i12, aVar6), 0.0f, 0.0f, 0.0f, 20, 7);
            C20585k.f28659a.getClass();
            C20585k.l lVar2 = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA5 = H.a(lVar2, InterfaceC22215f.a.f39088n, a13, 0);
            int f37888q4 = a13.getF37888Q();
            O1 o1Y4 = a13.y();
            androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(a13, vVarM3);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar8 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar8);
            } else {
                a13.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, a13, iA5);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y4);
            Y41.p<InterfaceC22413h, Integer, G0> pVar5 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q4))) {
                androidx.appcompat.app.r.B(f37888q4, a13, f37888q4, pVar5);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC4);
            K k13 = K.f28344a;
            kv0.e eVar4 = eVar;
            String str3 = eVar4.f413282b;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(str3, iVar.f65232c, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            a13.C(1629427616);
            String str4 = eVar4.f413283c;
            if (str4 == null) {
                eVar2 = eVar4;
            } else {
                eVar2 = eVar4;
                com.akita.compose.foundation.ui.p.b(str4, iVar.f65238i, R1.m(aVar6, 0.0f, 6, 0.0f, 0.0f, 13), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
                G0 g06 = G0.f406611a;
            }
            a13.h();
            com.avito.android.services_portfolio.project.components.e.a(432, 8, null, a13, R1.m(aVar6, 0.0f, 12, 0.0f, 0.0f, 13), eVar2.f413284d);
            a13.z();
            a13.C(856453171);
            float f14 = 6;
            C20672g.c(new InterfaceC20662b.C1591b(2), C20588k2.f(R1.k(10, 0.0f, 2, R1.m(aVar6, 0.0f, f14, 0.0f, 60, 5)), ((r0.size() + 1) / 2) * 200), null, R1.a(0), false, C20585k.g(f14), C20585k.g(f14), null, false, null, new o(eVar2.f413285e, interfaceC22204y1), a13, 1772544, 0, 916);
            G0 g07 = G0.f406611a;
            a13.h();
            a13.z();
        }
        return G0.f406611a;
    }
}
