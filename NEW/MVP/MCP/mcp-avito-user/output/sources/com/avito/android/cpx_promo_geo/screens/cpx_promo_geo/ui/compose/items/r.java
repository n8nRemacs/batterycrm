package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items;

import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ts.C48709c;

/* compiled from: CpxPromoGeoRegionChooserItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class r extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48709c.n f128191l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f128192m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f128193n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f128194o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C48709c.n nVar, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f128191l = nVar;
        this.f128192m = lVar;
        this.f128193n = vVar;
        this.f128194o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128194o | 1);
        androidx.compose.ui.v vVar = this.f128193n;
        x.a(this.f128191l, this.f128192m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
