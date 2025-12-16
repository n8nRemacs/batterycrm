package com.avito.android.advert.item.short_term_rent.payment_toggles.toggle;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsTravelPaymentTogglePresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/payment_toggles/toggle/e;", "LTV0/d;", "Lcom/avito/android/advert/item/short_term_rent/payment_toggles/toggle/g;", "Lcom/avito/android/advert/item/short_term_rent/payment_toggles/toggle/AdvertDetailsTravelPaymentToggleItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements TV0.d<g, AdvertDetailsTravelPaymentToggleItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.short_term_rent.payment_toggles.c f80125b;

    @Inject
    public e(@k com.avito.android.advert.item.short_term_rent.payment_toggles.c cVar) {
        this.f80125b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AdvertDetailsTravelPaymentToggleItem advertDetailsTravelPaymentToggleItem = (AdvertDetailsTravelPaymentToggleItem) aVar;
        gVar.Lm(advertDetailsTravelPaymentToggleItem.f80112e, new c(advertDetailsTravelPaymentToggleItem, this));
        gVar.Xf(advertDetailsTravelPaymentToggleItem.f80113f, advertDetailsTravelPaymentToggleItem.f80114g);
        gVar.dd(advertDetailsTravelPaymentToggleItem.f80115h);
        gVar.setChecked(advertDetailsTravelPaymentToggleItem.f80110c);
        gVar.V4(new d(advertDetailsTravelPaymentToggleItem, this));
    }
}
