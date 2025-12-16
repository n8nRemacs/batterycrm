package com.avito.android.advert_details_items.price_description_button;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPriceDescriptionButtonPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/price_description_button/e;", "Lcom/avito/android/advert_details_items/price_description_button/d;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f85301b;

    @Inject
    public e(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f85301b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        g gVar = (g) eVar;
        AdvertDetailsPriceDescriptionButtonItem advertDetailsPriceDescriptionButtonItem = (AdvertDetailsPriceDescriptionButtonItem) aVar;
        Integer num = advertDetailsPriceDescriptionButtonItem.f85290f;
        if (num != null) {
            gVar.uP(num.intValue());
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            gVar.lO();
        }
        gVar.rP(advertDetailsPriceDescriptionButtonItem.f85289e);
        gVar.lV(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(23, this, advertDetailsPriceDescriptionButtonItem));
    }
}
