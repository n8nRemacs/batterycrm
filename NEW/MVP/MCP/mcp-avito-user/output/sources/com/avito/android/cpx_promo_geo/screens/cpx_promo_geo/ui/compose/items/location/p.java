package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items.location;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.unit.h;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import ts.C48709c;

/* compiled from: CpxPromoGeoManualLocation.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class p extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f128155l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i12) {
        super(2);
        this.f128155l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128155l | 1);
        androidx.compose.runtime.B bE2 = a12.E(1160210980);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            DetailsSheetLink detailsSheetLink = new DetailsSheetLink(new DetailsSheetLinkBody("Переход по иконке", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 524286, null), null, 2, null);
            com.akita.compose.theme.re23.g.f65049a.getClass();
            C48709c.p pVar = new C48709c.p(1L, new C48709c.q("Москва", "Бюджет", new C48709c.z(com.akita.compose.theme.re23.g.a("questionFilled"), detailsSheetLink), new C48709c.s("", null, "0", "200", "2000"), C42745f0.U(new C48709c.y(0.2f, "20", "Это больше", null), new C48709c.y(0.6f, "40", "Это больше", null)), new C48709c.x(0.6f, 0.0f, 1.0f, 9, 2, null), new C48709c.l("Больше, чем у 45% конкурентов", false, null), null, 128, null), new C48709c.h("Сколько тратить в день", new C48709c.i("", "Сумма, ₽", "", "200", "2000"), new C48709c.l("Больше, чем у 45% конкурентов", false, null)));
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            s.a(pVar, i.f128148l, j.f128149l, k.f128150l, l.f128151l, m.f128152l, n.f128153l, o.f128154l, R1.i(androidx.compose.ui.v.f42878y1, 16), bE2, 115043760);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new p(iA2);
        }
        return G0.f406611a;
    }
}
