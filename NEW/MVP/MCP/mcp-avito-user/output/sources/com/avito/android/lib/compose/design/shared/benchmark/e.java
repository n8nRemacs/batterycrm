package com.avito.android.lib.compose.design.shared.benchmark;

import androidx.compose.foundation.a2;
import androidx.compose.foundation.d2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.v;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.compose.s;
import com.avito.android.analytics.screens.mvi.r;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BenchmarkComposeActivity.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<U2.b> f177638l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C42784z0 f177639m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, C42784z0 c42784z0) {
        super(2);
        this.f177638l = list;
        this.f177639m = c42784z0;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            r rVar = new r("AllComponentList", J.b.f90385a);
            a13.C(-976608008);
            a13.C(2063036140);
            boolean zBooleanValue = ((Boolean) a13.o(C22543x1.f41638a)).booleanValue();
            List<U2.b> list = this.f177638l;
            C42784z0 c42784z0 = this.f177639m;
            if (zBooleanValue) {
                a13.C(421109671);
                v.a aVar = v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.getClass();
                v vVarB = a2.b(fillElement, (d2) s.b(c.f177628l, a13), true, true);
                C20585k.f28659a.getClass();
                C20585k.l lVar = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                v vVarC = androidx.compose.ui.n.c(a13, vVarB);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar2);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                K k12 = K.f28344a;
                a13.C(1101585837);
                Iterator<U2.b> it = list.iterator();
                while (it.hasNext()) {
                    it.next().e(c42784z0, a13, 72);
                }
                a13.h();
                a13.z();
                a13.h();
            } else {
                a13.C(420357239);
                com.avito.android.analytics.screens.compose.a aVar3 = (com.avito.android.analytics.screens.compose.a) a13.o(com.avito.android.analytics.screens.compose.c.f90576a);
                aVar3.m("AllComponentList");
                aVar3.l();
                v vVarD = androidx.compose.ui.draw.o.d(v.f42878y1, new d(rVar, aVar3));
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q2 = a13.getF37888Q();
                O1 o1Y2 = a13.y();
                v vVarC2 = androidx.compose.ui.n.c(a13, vVarD);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar4);
                } else {
                    a13.d();
                }
                Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar2 = InterfaceC22413h.a.f40796g;
                R3.b(pVar2, a13, interfaceC22365i0D);
                Y41.p<InterfaceC22413h, U, G0> pVar3 = InterfaceC22413h.a.f40795f;
                R3.b(pVar3, a13, o1Y2);
                Y41.p<InterfaceC22413h, Integer, G0> pVar4 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                    androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar4);
                }
                Y41.p<InterfaceC22413h, v, G0> pVar5 = InterfaceC22413h.a.f40793d;
                R3.b(pVar5, a13, vVarC2);
                C20644z c20644z = C20644z.f28804a;
                v vVarB2 = a2.b(C20588k2.f28682c, (d2) s.b(c.f177628l, a13), true, true);
                C20585k.f28659a.getClass();
                I iA3 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, a13, 0);
                int f37888q3 = a13.getF37888Q();
                O1 o1Y3 = a13.y();
                v vVarC3 = androidx.compose.ui.n.c(a13, vVarB2);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar4);
                } else {
                    a13.d();
                }
                R3.b(pVar2, a13, iA3);
                R3.b(pVar3, a13, o1Y3);
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q3))) {
                    androidx.appcompat.app.r.B(f37888q3, a13, f37888q3, pVar4);
                }
                R3.b(pVar5, a13, vVarC3);
                K k13 = K.f28344a;
                a13.C(1101585837);
                Iterator<U2.b> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().e(c42784z0, a13, 72);
                }
                a13.h();
                a13.z();
                a13.z();
                a13.h();
            }
            a13.h();
            a13.h();
        }
        return G0.f406611a;
    }
}
