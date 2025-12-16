package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.unit.h;
import com.avito.android.deep_linking.links.NoMatchLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ts.C48709c;

/* compiled from: CpxPromoGeoRegionChooserItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class w extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f128204l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i12) {
        super(2);
        this.f128204l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128204l | 1);
        androidx.compose.runtime.B bE2 = a12.E(-1741527476);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            NoMatchLink noMatchLink = new NoMatchLink();
            com.akita.compose.theme.re23.g.f65049a.getClass();
            C48709c.n nVar = new C48709c.n("Где показывать объявление", noMatchLink, "Москва", new C48709c.z(com.akita.compose.theme.re23.g.a("questionFilled"), new NoMatchLink()));
            v vVar = v.f128203l;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            x.a(nVar, vVar, R1.i(androidx.compose.ui.v.f42878y1, 16), bE2, 432);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new w(iA2);
        }
        return G0.f406611a;
    }
}
