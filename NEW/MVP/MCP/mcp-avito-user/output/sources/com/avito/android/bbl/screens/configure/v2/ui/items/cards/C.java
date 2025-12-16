package com.avito.android.bbl.screens.configure.v2.ui.items.cards;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.V1;
import androidx.compose.foundation.lazy.grid.C20672g;
import androidx.compose.foundation.lazy.grid.I0;
import androidx.compose.foundation.lazy.grid.M0;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.Q0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorCardGrid.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"", "ItemIndex", "_avito_bbl_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class C {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.k List list, @Y61.l androidx.compose.ui.v vVar, @Y61.l C20585k.j jVar, @Y61.l C20585k.j jVar2, @Y61.l V1 v12, @Y61.l Y41.p pVar, @Y61.l Y41.p pVar2, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        androidx.compose.runtime.B bE2 = a12.E(-317371190);
        androidx.compose.ui.v vVar2 = (i13 & 2) != 0 ? androidx.compose.ui.v.f42878y1 : vVar;
        Y41.p pVar3 = (i13 & 64) != 0 ? null : pVar;
        Y41.p pVar4 = (i13 & 128) != 0 ? null : pVar2;
        I0 i0A = M0.a(0, 3, bE2);
        C20672g.c(new r(), vVar2, i0A, v12, false, jVar, jVar2, null, false, null, new A(pVar3, list, pVar4, i0A, (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h), c22096n), bE2, (i12 & 112) | 1772544, 0, 896);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new B(list, vVar2, jVar, jVar2, v12, pVar3, pVar4, c22096n, i12, i13);
        }
    }
}
