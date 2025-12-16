package com.avito.android.mortgage_invite.lead;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ApplicationLeadScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class q extends N implements Y41.q<T1, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n20.c f205931l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205932m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205933n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n20.c cVar, Y41.a<G0> aVar, Y41.a<G0> aVar2) {
        super(3);
        this.f205931l = cVar;
        this.f205932m = aVar;
        this.f205933n = aVar2;
    }

    @Override // Y41.q
    public final G0 invoke(T1 t12, A a12, Integer num) {
        T1 t13 = t12;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(t13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            com.avito.android.analytics.screens.mvi.r perfTrackerParams = this.f205931l.getPerfTrackerParams();
            a13.C(-976608008);
            a13.C(2063036140);
            boolean zBooleanValue = ((Boolean) a13.o(C22543x1.f41638a)).booleanValue();
            n20.c cVar = this.f205931l;
            Y41.a<G0> aVar = this.f205932m;
            Y41.a<G0> aVar2 = this.f205933n;
            if (zBooleanValue) {
                a13.C(421109671);
                x.d(cVar, aVar, aVar2, R1.h(androidx.compose.ui.v.f42878y1, t13), a13, 0);
                a13.h();
            } else {
                a13.C(420357239);
                com.avito.android.analytics.screens.compose.a aVar3 = (com.avito.android.analytics.screens.compose.a) a13.o(com.avito.android.analytics.screens.compose.c.f90576a);
                if (perfTrackerParams != null) {
                    aVar3.m(perfTrackerParams.f90666a);
                }
                aVar3.l();
                v.a aVar4 = androidx.compose.ui.v.f42878y1;
                androidx.compose.ui.v vVarD = androidx.compose.ui.draw.o.d(aVar4, new p(perfTrackerParams, aVar3));
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarD);
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
                R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                x.d(cVar, aVar, aVar2, R1.h(aVar4, t13), a13, 0);
                a13.z();
                a13.h();
            }
            a13.h();
            a13.h();
        }
        return G0.f406611a;
    }
}
