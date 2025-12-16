package com.avito.android.mortgage_invite.contact_info;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import b20.e;
import com.avito.android.R;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ApplicationContactInfoScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class z extends N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b20.d f205795l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205796m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ContactInfoFieldId, Boolean, G0> f205797n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ContactInfoFieldId, String, G0> f205798o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ContactInfoFieldId, Boolean, G0> f205799p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ContactInfoFieldId, String, G0> f205800q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(b20.d dVar, Y41.a<G0> aVar, Y41.p<? super ContactInfoFieldId, ? super Boolean, G0> pVar, Y41.p<? super ContactInfoFieldId, ? super String, G0> pVar2, Y41.p<? super ContactInfoFieldId, ? super Boolean, G0> pVar3, Y41.p<? super ContactInfoFieldId, ? super String, G0> pVar4) {
        super(3);
        this.f205795l = dVar;
        this.f205796m = aVar;
        this.f205797n = pVar;
        this.f205798o = pVar2;
        this.f205799p = pVar3;
        this.f205800q = pVar4;
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
            b20.d dVar = this.f205795l;
            com.avito.android.analytics.screens.mvi.r perfTrackerParams = dVar.getPerfTrackerParams();
            a13.C(-976608008);
            a13.C(2063036140);
            boolean zBooleanValue = ((Boolean) a13.o(C22543x1.f41638a)).booleanValue();
            b20.e eVar = dVar.f56848f;
            Y41.a<G0> aVar = this.f205796m;
            Y41.p<ContactInfoFieldId, Boolean, G0> pVar = this.f205797n;
            Y41.p<ContactInfoFieldId, String, G0> pVar2 = this.f205798o;
            Y41.p<ContactInfoFieldId, Boolean, G0> pVar3 = this.f205799p;
            Y41.p<ContactInfoFieldId, String, G0> pVar4 = this.f205800q;
            if (zBooleanValue) {
                a13.C(421109671);
                if (eVar instanceof e.d) {
                    a13.C(-867372037);
                    C.c(null, a13, 0);
                    a13.h();
                } else if (eVar instanceof e.c) {
                    a13.C(-867368454);
                    F.f205600a.getClass();
                    C22096n c22096n = F.f205601b;
                    String strC = u0.i.c(a13, R.string.contact_info_loading_failed_title);
                    String strC2 = u0.i.c(a13, R.string.contact_info_loading_failed_subtitle);
                    String strC3 = u0.i.c(a13, R.string.contact_info_loading_failed_action);
                    v.a aVar2 = androidx.compose.ui.v.f42878y1;
                    FillElement fillElement = C20588k2.f28682c;
                    aVar2.getClass();
                    com.akita.compose.component.content_placeholder.b.a(c22096n, strC, strC2, strC3, aVar, fillElement, null, null, false, false, a13, 196614, 960);
                    a13.h();
                } else if (eVar instanceof e.a) {
                    a13.C(-867350905);
                    androidx.compose.ui.v vVarH = R1.h(androidx.compose.ui.v.f42878y1, t13);
                    h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                    C.b((e.a) eVar, pVar, pVar2, pVar3, pVar4, R1.k(16, 0.0f, 2, vVarH), a13, 8);
                    a13.h();
                } else {
                    a13.C(-1117523066);
                    a13.h();
                }
                a13.h();
            } else {
                a13.C(420357239);
                com.avito.android.analytics.screens.compose.a aVar4 = (com.avito.android.analytics.screens.compose.a) a13.o(com.avito.android.analytics.screens.compose.c.f90576a);
                if (perfTrackerParams != null) {
                    aVar4.m(perfTrackerParams.f90666a);
                }
                aVar4.l();
                v.a aVar5 = androidx.compose.ui.v.f42878y1;
                androidx.compose.ui.v vVarD = androidx.compose.ui.draw.o.d(aVar5, new y(perfTrackerParams, aVar4));
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarD);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar6 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar6);
                } else {
                    a13.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar5 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar5);
                }
                R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                if (eVar instanceof e.d) {
                    a13.C(-867372037);
                    C.c(null, a13, 0);
                    a13.h();
                } else if (eVar instanceof e.c) {
                    a13.C(-867368454);
                    F.f205600a.getClass();
                    com.akita.compose.component.content_placeholder.b.a(F.f205601b, u0.i.c(a13, R.string.contact_info_loading_failed_title), u0.i.c(a13, R.string.contact_info_loading_failed_subtitle), u0.i.c(a13, R.string.contact_info_loading_failed_action), aVar, C20588k2.f28682c, null, null, false, false, a13, 196614, 960);
                    a13.h();
                } else if (eVar instanceof e.a) {
                    a13.C(-867350905);
                    androidx.compose.ui.v vVarH2 = R1.h(aVar5, t13);
                    h.a aVar7 = androidx.compose.ui.unit.h.f42849c;
                    C.b((e.a) eVar, pVar, pVar2, pVar3, pVar4, R1.k(16, 0.0f, 2, vVarH2), a13, 8);
                    a13.h();
                } else {
                    a13.C(-1117523066);
                    a13.h();
                }
                a13.z();
                a13.h();
            }
            a13.h();
            a13.h();
        }
        return G0.f406611a;
    }
}
