package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.unit.h;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import ts.C48709c;

/* compiled from: CpxPromoGeoDaysCountItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class l extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f128039l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i12) {
        super(2);
        this.f128039l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128039l | 1);
        androidx.compose.runtime.B bE2 = a12.E(1093612330);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            List listU = C42745f0.U(new C48709c.g("1", "На 1 день", true, false, 8, null), new C48709c.g("7", "На 7 дней", false, false, 8, null), new C48709c.g("30", "На 30 дней", false, false, 8, null));
            k kVar = k.f128038l;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            m.a(438, kVar, bE2, R1.i(androidx.compose.ui.v.f42878y1, 32), listU);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new l(iA2);
        }
        return G0.f406611a;
    }
}
