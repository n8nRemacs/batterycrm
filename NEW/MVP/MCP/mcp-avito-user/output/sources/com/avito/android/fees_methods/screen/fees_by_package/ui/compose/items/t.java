package com.avito.android.fees_methods.screen.fees_by_package.ui.compose.items;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FeesByPackageSnippetItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_fees-methods_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class t {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k FeesByPackageState.e eVar, @Y61.l v vVar, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(1471976779);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(eVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if (((i13 | (bE2.B(vVar) ? 32 : 16)) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.banner.h f66891b = com.akita.compose.theme.re23.b.b(bE2).getF66891b();
            float f12 = 12;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.component.banner.g.c(f66891b, C20588k2.d(vVar, 1.0f), R1.d(f12, f12, f12, 16), null, null, 0.0f, null, androidx.compose.runtime.internal.r.c(-1404219893, new p(eVar), bE2), bE2, com.akita.compose.component.banner.h.f60462o | 12582912, 120);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new q(eVar, vVar, i12);
        }
    }
}
