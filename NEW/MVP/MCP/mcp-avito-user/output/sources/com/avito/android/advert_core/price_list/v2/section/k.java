package com.avito.android.advert_core.price_list.v2.section;

import com.avito.android.advert_core.price_list.AdvertPriceListSectionItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: AdvertPriceListSectionItemViewPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/price_list/v2/section/k;", "Lcom/avito/android/advert_core/price_list/v2/section/i;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k implements i {
    @Inject
    public k() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        AdvertPriceListSectionItem advertPriceListSectionItem = (AdvertPriceListSectionItem) aVar;
        cVar.setTitle(advertPriceListSectionItem.f84012e);
        cVar.B(advertPriceListSectionItem.f84013f ? advertPriceListSectionItem.f84015h : C42784z0.f406748b);
        if (!advertPriceListSectionItem.f84014g) {
            cVar.U20();
            cVar.ga(null);
        } else {
            cVar.bd();
            cVar.i9(advertPriceListSectionItem.f84013f);
            cVar.ga(new j(advertPriceListSectionItem, cVar));
        }
    }
}
