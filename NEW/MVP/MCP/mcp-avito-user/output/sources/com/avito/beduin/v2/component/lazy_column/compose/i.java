package com.avito.beduin.v2.component.lazy_column.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.J3;
import androidx.compose.runtime.S;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FlexContainersUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(boolean z12, @Y61.k C22096n c22096n, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1207197138);
        if ((((bE2.j(z12) ? 4 : 2) | i12) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else if (z12) {
            bE2.C(2121967449);
            J3 j32 = Q0.f41205n;
            LayoutDirection layoutDirection = (LayoutDirection) bE2.o(j32);
            LayoutDirection layoutDirection2 = LayoutDirection.f42838b;
            if (layoutDirection == layoutDirection2) {
                layoutDirection2 = LayoutDirection.f42839c;
            }
            S.a(j32.b(layoutDirection2), androidx.compose.runtime.internal.r.c(1599478793, new g(c22096n), bE2), bE2, 56);
            bE2.X(false);
        } else {
            bE2.C(2122299955);
            c22096n.invoke(bE2, 6);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(z12, c22096n, i12);
        }
    }
}
