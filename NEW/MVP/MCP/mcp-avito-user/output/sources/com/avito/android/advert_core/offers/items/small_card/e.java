package com.avito.android.advert_core.offers.items.small_card;

import Y61.k;
import Y61.l;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SmallCardOfferItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/offers/items/small_card/e;", "Lcom/avito/android/advert_core/offers/items/small_card/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f83839b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.l<? super Integer, G0> f83840c;

    @Inject
    public e(@k com.avito.android.advert_core.analytics.a aVar) {
        this.f83839b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        SmallCardOfferItem smallCardOfferItem = (SmallCardOfferItem) aVar;
        String str = smallCardOfferItem.f83828c;
        gVar.setTitle(str);
        gVar.qW(smallCardOfferItem.f83831f);
        gVar.a(new d(this, i12));
        this.f83839b.K6(smallCardOfferItem.getF83382b().hashCode(), str);
    }

    @Override // I9.a
    public final void k(@l Y41.l<? super Integer, G0> lVar) {
        this.f83840c = lVar;
    }
}
