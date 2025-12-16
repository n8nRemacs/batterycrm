package com.avito.android.advert_details_items.optimal_price;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsOptimalPricePresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/optimal_price/d;", "LTV0/d;", "Lcom/avito/android/advert_details_items/optimal_price/f;", "Lcom/avito/android/advert_details_items/optimal_price/AdvertDetailsOptimalPriceItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<f, AdvertDetailsOptimalPriceItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f84988b;

    @Inject
    public d(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f84988b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AdvertDetailsOptimalPriceItem advertDetailsOptimalPriceItem = (AdvertDetailsOptimalPriceItem) aVar;
        fVar.e(advertDetailsOptimalPriceItem.f84969f);
        fVar.g(advertDetailsOptimalPriceItem.f84970g);
        fVar.GQ(advertDetailsOptimalPriceItem.f84971h);
        fVar.qo(advertDetailsOptimalPriceItem.f84972i);
        fVar.Xm(new c(advertDetailsOptimalPriceItem, this));
    }
}
