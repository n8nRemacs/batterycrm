package com.avito.android.comfortable_deal.common.view;

import androidx.compose.animation.InterfaceC20343e0;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ExpandedStepsList.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/animation/e0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/e0;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class m extends N implements Y41.q<InterfaceC20343e0, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<y> f120743l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List<y> list) {
        super(3);
        this.f120743l = list;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20343e0 interfaceC20343e0, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        v.a aVar = androidx.compose.ui.v.f42878y1;
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
        int f37888q = a13.getF37888Q();
        O1 o1Y = a13.y();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, aVar);
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
        a13.C(962774670);
        List<y> list = this.f120743l;
        int size = list.size() - 1;
        int i12 = 1;
        while (i12 < size) {
            int i13 = i12 + 1;
            u.c(false, false, i13, list.get(i12).f120773a, list.get(i12).f120774b, 0L, a13, 54);
            i12 = i13;
        }
        a13.h();
        a13.z();
        return G0.f406611a;
    }
}
