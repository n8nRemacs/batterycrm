package com.avito.android.gig_motivations_list.ui.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.v;
import com.akita.compose.component.toast_bar.J;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import zH.C50465d;

/* compiled from: MotivationsListScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "LzH/a;", "Lkotlin/G0;", "latestAction", "_avito_gig_motivations-list_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class D {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k C50465d c50465d, @Y61.k Y41.l lVar, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k Y41.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1676665535);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        bE2.C(99626490);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = new com.akita.compose.component.toast_bar.u();
            bE2.H(objT);
        }
        com.akita.compose.component.toast_bar.u uVar = (com.akita.compose.component.toast_bar.u) objT;
        bE2.X(false);
        J jP2 = com.avito.android.actions_sheet.a.p(com.akita.compose.theme.re23.b.f63983a, bE2);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        C22187u0.d(new y(interfaceC43160i, aVar, uVar, jP2, null), bE2, interfaceC43160i);
        com.akita.compose.component.scaffold.g.a(aVar2, androidx.compose.runtime.internal.r.c(-503882235, new A(interfaceC22204y1M), bE2), null, uVar, null, null, null, androidx.compose.runtime.internal.r.c(2101896142, new B(c50465d, lVar, interfaceC22204y1M), bE2), bE2, 12586032, 116);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C(c50465d, lVar, interfaceC43160i, aVar, aVar2, i12);
        }
    }
}
