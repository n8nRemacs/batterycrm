package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items.location;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.unit.h;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import ts.C48709c;

/* compiled from: CpxPromoGeoMergedLocation.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class x extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f128172l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i12) {
        super(2);
        this.f128172l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128172l | 1);
        androidx.compose.runtime.B bE2 = a12.E(1429893886);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            DetailsSheetLink detailsSheetLink = new DetailsSheetLink(new DetailsSheetLinkBody("Переход по иконке", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 524286, null), null, 2, null);
            com.akita.compose.theme.re23.g.f65049a.getClass();
            C48709c.r rVar = new C48709c.r(new C48709c.C12686c("Москва", "Бюджет", new C48709c.z(com.akita.compose.theme.re23.g.a("questionFilled"), detailsSheetLink), new C48709c.x(0.6f, 0.0f, 1.0f, 5, 2, null), Collections.singletonMap("1", new C48709c.f(new C48709c.s("", null, "0", "200", "2000"), C42784z0.f406748b, new C48709c.l("Больше, чем у 45% конкурентов", false, null))), null, 32, null));
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            B.a(rVar, "1", t.f128168l, u.f128169l, v.f128170l, w.f128171l, R1.i(androidx.compose.ui.v.f42878y1, 16), bE2, 1797552);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new x(iA2);
        }
        return G0.f406611a;
    }
}
