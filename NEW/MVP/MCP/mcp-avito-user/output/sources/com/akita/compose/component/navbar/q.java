package com.akita.compose.component.navbar;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: NavBar.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/navbar/internal/h;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/navbar/internal/h;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class q extends N implements Y41.q<com.akita.compose.component.navbar.internal.h, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f62275l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.q<i, A, Integer, G0> f62276m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f62277n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C22096n c22096n, Y41.q qVar, C22096n c22096n2) {
        super(3);
        this.f62275l = c22096n;
        this.f62276m = qVar;
        this.f62277n = c22096n2;
    }

    @Override // Y41.q
    public final G0 invoke(com.akita.compose.component.navbar.internal.h hVar, A a12, Integer num) {
        com.akita.compose.component.navbar.internal.h hVar2 = hVar;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(hVar2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            a13.C(524650800);
            C22096n c22096n = this.f62275l;
            if (c22096n != null) {
                androidx.compose.ui.v vVarC = hVar2.c(androidx.compose.ui.v.f42878y1);
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, vVarC);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC2);
                C20644z c20644z = C20644z.f28804a;
                c22096n.invoke(a13, 0);
                a13.z();
            }
            a13.h();
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarA = hVar2.a(aVar2);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int f37888q2 = a13.getF37888Q();
            O1 o1Y2 = a13.y();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(a13, vVarA);
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
            R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D2);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y2);
            Y41.p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar2);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC3);
            C20644z c20644z2 = C20644z.f28804a;
            this.f62277n.invoke(a13, 0);
            a13.z();
            com.akita.compose.component.navbar.internal.c.a(hVar2.b(aVar2), this.f62276m, a13, 0);
        }
        return G0.f406611a;
    }
}
