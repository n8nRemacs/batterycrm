package com.avito.android.gig_motivation_payment.ui.compose;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import vH.c;

/* compiled from: MotivationPaymentScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "paddings", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class w extends N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ vH.c f160185l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f160186m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(InterfaceC22204y1 interfaceC22204y1, vH.c cVar) {
        super(3);
        this.f160185l = cVar;
        this.f160186m = interfaceC22204y1;
    }

    @Override // Y41.q
    public final G0 invoke(T1 t12, androidx.compose.runtime.A a12, Integer num) {
        T1 t13 = t12;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(t13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.d0(fillElement);
            androidx.compose.ui.v vVarH = R1.h(fillElement, t13);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarH);
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
            R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            C20644z c20644z = C20644z.f28804a;
            vH.c cVar = this.f160185l;
            boolean z12 = cVar instanceof c.b;
            InterfaceC22204y1 interfaceC22204y1 = this.f160186m;
            if (z12) {
                a13.C(1664802128);
                F.a((c.b) cVar, (Y41.l) interfaceC22204y1.getF42167b(), a13, 8);
                a13.h();
            } else if (cVar instanceof c.C12760c) {
                a13.C(1664805830);
                C30733d.b(0, (Y41.l) interfaceC22204y1.getF42167b(), a13, null);
                a13.h();
            } else if (cVar instanceof c.d) {
                a13.C(1664809265);
                i.a(null, a13, 0);
                a13.h();
            } else {
                a13.C(69525266);
                a13.h();
            }
            a13.z();
        }
        return G0.f406611a;
    }
}
