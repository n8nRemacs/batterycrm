package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import kotlin.Metadata;

/* compiled from: CpxPromoGeoTitle.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cpx-promo-geo_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class I {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l String str, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-556334810);
        int i13 = (bE2.B(str) ? 4 : 2) | i12;
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            if (str == null) {
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new G(i12, vVar, str);
                    return;
                }
                return;
            }
            com.akita.compose.theme.re23.b.f63983a.getClass();
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65231b, C22501m2.a(vVar, "CPX_PROMO_GEO_TITLE_TEST_TAG"), false, 0L, null, 0, 0, false, null, bE2, i13 & 14, 1016);
        }
        C22039c2 c22039c2Z2 = b12.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new H(i12, vVar, str);
        }
    }
}
