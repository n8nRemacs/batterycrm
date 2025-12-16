package com.avito.android.screens.bbip_private.ui.items.budget_widget;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.chips.ChipsDisplayType;
import com.akita.compose.component.chips.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateCustomBudgetsWidgetDialog.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class q extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f260819l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar) {
        super(2);
        this.f260819l = rVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            r rVar = this.f260819l;
            InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(rVar.f260825I, a13);
            v vVarD = C20588k2.d(v.f42878y1, 1.0f);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = androidx.compose.ui.n.c(a13, vVarD);
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
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            C20644z c20644z = C20644z.f28804a;
            List<o> list = (List) interfaceC22204y1B.getF42167b();
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (o oVar : list) {
                String str = oVar.f260813b;
                if (str == null) {
                    str = "";
                }
                arrayList.add(new com.avito.android.bbip_common.ui.chips.b(str, oVar.f260814c, oVar.f260817f, false, 8, null));
            }
            com.akita.compose.theme.re23.b.f63983a.getClass();
            y yVarB = com.akita.compose.theme.re23.b.d(a13).getF66026e();
            ChipsDisplayType chipsDisplayType = ChipsDisplayType.f60861b;
            p pVar2 = new p(rVar);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            v vVarM = R1.m(v.f42878y1, 0.0f, 24, 0.0f, 0.0f, 13);
            s.f260827a.getClass();
            com.akita.compose.component.chips.d.a(arrayList, yVarB, pVar2, vVarM, s.f260828b, a13, 1597896, 32);
            a13.z();
        }
        return G0.f406611a;
    }
}
