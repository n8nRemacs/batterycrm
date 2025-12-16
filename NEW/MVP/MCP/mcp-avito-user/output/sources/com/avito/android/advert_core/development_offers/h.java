package com.avito.android.advert_core.development_offers;

import Y61.l;
import com.avito.android.advert.item.Z0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DevelopmentOffersItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/development_offers/h;", "Lcom/avito/android/advert_core/development_offers/f;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p9.e f83333b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f83334c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Z0 f83335d;

    @Inject
    public h(@Y61.k p9.e eVar, @Y61.k com.avito.android.advert_core.analytics.a aVar) {
        this.f83333b = eVar;
        this.f83334c = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        DevelopmentOffersItem developmentOffersItem = (DevelopmentOffersItem) aVar;
        ((j) eVar).LQ(developmentOffersItem.f83280b, this.f83335d, new g(this, developmentOffersItem));
        this.f83334c.A6(null, "item_discounts", null);
        this.f83333b.x();
    }

    @Override // com.avito.android.advert_core.development_offers.f
    public final void P5(@l Z0 z02) {
        this.f83335d = z02;
    }

    @Override // com.avito.android.advert_core.development_offers.f
    public final void c0() {
        this.f83335d = null;
    }
}
