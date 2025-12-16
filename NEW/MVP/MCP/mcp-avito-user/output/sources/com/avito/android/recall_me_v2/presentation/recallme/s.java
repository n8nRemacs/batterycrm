package com.avito.android.recall_me_v2.presentation.recallme;

import Di0.AbstractC13405c;
import Di0.InterfaceC13403a;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.T1;
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
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RecallMeScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class s extends N implements Y41.q<T1, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC13405c f252216l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC13403a, G0> f252217m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.screens.mvi.r f252218n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(AbstractC13405c abstractC13405c, Y41.l<? super InterfaceC13403a, G0> lVar, com.avito.android.analytics.screens.mvi.r rVar) {
        super(3);
        this.f252216l = abstractC13405c;
        this.f252217m = lVar;
        this.f252218n = rVar;
    }

    @Override // Y41.q
    public final G0 invoke(T1 t12, A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.getClass();
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.i iVar = InterfaceC22215f.a.f39076b;
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, fillElement);
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, a13, interfaceC22365i0D);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, a13, vVarC);
            C20644z c20644z = C20644z.f28804a;
            AbstractC13405c abstractC13405c = this.f252216l;
            if (abstractC13405c instanceof AbstractC13405c.b) {
                a13.C(1299748944);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.spinner.j.a(com.akita.compose.theme.re23.b.r(a13).getF66694c(), fillElement, a13, 48);
                a13.h();
            } else {
                boolean z12 = abstractC13405c instanceof AbstractC13405c.C0188c;
                Y41.l<InterfaceC13403a, G0> lVar = this.f252217m;
                if (z12) {
                    a13.C(1300027107);
                    k.a(lVar, a13, 0);
                    a13.h();
                } else if (abstractC13405c instanceof AbstractC13405c.a) {
                    a13.C(1300170265);
                    a13.C(-976608008);
                    a13.C(2063036140);
                    if (((Boolean) a13.o(C22543x1.f41638a)).booleanValue()) {
                        a13.C(421109671);
                        k.b((AbstractC13405c.a) abstractC13405c, lVar, a13, 8);
                        a13.h();
                    } else {
                        a13.C(420357239);
                        com.avito.android.analytics.screens.compose.a aVar3 = (com.avito.android.analytics.screens.compose.a) a13.o(com.avito.android.analytics.screens.compose.c.f90576a);
                        com.avito.android.analytics.screens.mvi.r rVar = this.f252218n;
                        if (rVar != null) {
                            aVar3.m(rVar.f90666a);
                        }
                        aVar3.l();
                        androidx.compose.ui.v vVarD = androidx.compose.ui.draw.o.d(aVar, new r(rVar, aVar3));
                        InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(iVar, false);
                        int f37888q2 = a13.getF37888Q();
                        O1 o1Y2 = a13.y();
                        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, vVarD);
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
                        R3.b(pVar, a13, interfaceC22365i0D2);
                        R3.b(pVar2, a13, o1Y2);
                        if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                            androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar3);
                        }
                        R3.b(pVar4, a13, vVarC2);
                        k.b((AbstractC13405c.a) abstractC13405c, lVar, a13, 8);
                        a13.z();
                        a13.h();
                    }
                    a13.h();
                    a13.h();
                    if (((AbstractC13405c.a) abstractC13405c).f3401c) {
                        com.akita.compose.theme.re23.b.f63983a.getClass();
                        com.akita.compose.component.spinner.j.a(com.akita.compose.theme.re23.b.r(a13).getF66694c(), fillElement, a13, 48);
                    }
                    a13.h();
                } else {
                    a13.C(1300641713);
                    a13.h();
                }
            }
            a13.z();
        }
        return G0.f406611a;
    }
}
