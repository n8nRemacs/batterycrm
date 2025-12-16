package com.avito.android.tariff.cpx.info.limits.ui.items;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import com.akita.compose.component.navbar.t;
import com.akita.compose.component.navbar.u;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCpxInfoLimitsNavBarItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_tariff_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@InterfaceC42165v int i12, int i13, @k Y41.a aVar, @l A a12, @l v vVar) {
        B bE2 = a12.E(1502814774);
        int i14 = (bE2.m(i12) ? 4 : 2) | i13 | (bE2.u(aVar) ? 32 : 16);
        if ((i14 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            t.b(C22501m2.a(vVar, "TARIFF_CPX_INFO_LIMITS_NAVBAR_TEST_TAG"), u.a((u) bE2.o(com.akita.compose.component.navbar.v.f62301a), null, i12, 1791), 0, aVar, null, bE2, (i14 << 6) & 7168, 20);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(i12, i13, aVar, vVar);
        }
    }
}
