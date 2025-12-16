package com.avito.android.service_fee_conditions.ui.compose.items;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import com.akita.compose.component.navbar.t;
import com.akita.compose.component.navbar.u;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import qu0.c;

/* compiled from: ServiceFeeConditionsNavBar.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_service-fee-conditions_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@InterfaceC42165v int i12, @Y61.l c.f fVar, @Y61.k Y41.a aVar, @Y61.l v vVar, @Y61.l A a12, int i13) {
        v vVar2;
        B bE2 = a12.E(42878678);
        int i14 = i13 | (bE2.m(i12) ? 4 : 2) | (bE2.B(fVar) ? 32 : 16) | (bE2.u(aVar) ? 256 : 128) | 3072;
        if ((i14 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
        } else {
            v.a aVar2 = v.f42878y1;
            u uVarA = u.a((u) bE2.o(com.akita.compose.component.navbar.v.f62301a), null, i12, 1791);
            v vVarA = C22501m2.a(aVar2, "SERVICE_FEE_CONDITIONS_NAVBAR_TEST_TAG");
            a.f278508a.getClass();
            t.c(vVarA, uVarA, aVar, 0, a.f278509b, r.c(-1322712940, new m(fVar), bE2), bE2, 221184 | (i14 & 896), 8);
            vVar2 = aVar2;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new n(i12, fVar, aVar, vVar2, i13);
        }
    }
}
