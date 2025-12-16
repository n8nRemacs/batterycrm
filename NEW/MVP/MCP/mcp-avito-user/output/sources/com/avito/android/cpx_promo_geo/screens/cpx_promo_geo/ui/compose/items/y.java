package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items;

import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ts.C48709c;

/* compiled from: CpxPromoGeoSeparateRegionsToggleItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class y extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48709c.w f128205l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Boolean, G0> f128206m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f128207n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f128208o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f128209p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C48709c.w wVar, Y41.l lVar, Y41.l lVar2, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f128205l = wVar;
        this.f128206m = lVar;
        this.f128207n = lVar2;
        this.f128208o = vVar;
        this.f128209p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        F.a(this.f128205l, this.f128206m, this.f128207n, this.f128208o, a12, C22066f2.a(this.f128209p | 1));
        return G0.f406611a;
    }
}
