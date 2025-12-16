package com.avito.android.service_transportation_info.advert_details.geo.view;

import Y41.p;
import Y41.q;
import androidx.appcompat.app.r;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.F;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.service_transportation_info.model.TransportationGeo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServicesTransportationGeoRoutes.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/F;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements q<F, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TransportationGeo.Routes.Route f279757l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TransportationGeo.Routes.Route route) {
        super(3);
        this.f279757l = route;
    }

    @Override // Y41.q
    public final G0 invoke(F f12, A a12, Integer num) {
        F f13 = f12;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(f13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            v.a aVar = v.f42878y1;
            float f14 = 4;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            v vVarK = R1.k(0.0f, f14, 1, aVar);
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, a13, 48);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = n.c(a13, vVarK);
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
            R3.b(InterfaceC22413h.a.f40796g, a13, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            TransportationGeo.Routes.Route route = this.f279757l;
            String from = route.getFrom();
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65241l;
            s.f42720b.getClass();
            int i12 = s.f42722d;
            com.akita.compose.foundation.ui.p.b(from, rVar, R1.m(C20588k2.v(0.0f, f13.h() * 0.4f, 1, aVar), 0.0f, 0.0f, f14, 0.0f, 11), false, 0L, null, 1, i12, false, null, a13, 14155776, 824);
            Boolean bothWays = route.getBothWays();
            h.c(bothWays != null ? bothWays.booleanValue() : false, a13, 0);
            com.akita.compose.foundation.ui.p.b(route.getTo(), iVar.f65241l, R1.m(C20588k2.v(f13.h() * 0.4f, 0.0f, 2, aVar), f14, 0.0f, 0.0f, 0.0f, 14), false, 0L, null, 1, i12, false, null, a13, 14155776, 824);
            a13.z();
        }
        return G0.f406611a;
    }
}
