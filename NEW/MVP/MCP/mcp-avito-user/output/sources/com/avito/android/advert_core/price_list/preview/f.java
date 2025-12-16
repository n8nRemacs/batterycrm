package com.avito.android.advert_core.price_list.preview;

import Y61.k;
import com.avito.android.advert.item.W0;
import com.avito.android.remote.model.imv_services.ImvServices;
import com.avito.android.remote.model.price_list.PriceList;
import kotlin.Metadata;

/* compiled from: AdvertPriceListPreviewItemViewPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_core/price_list/preview/f;", "LTV0/d;", "Lcom/avito/android/advert_core/price_list/preview/c;", "Lcom/avito/android/advert_core/price_list/preview/AdvertPriceListPreviewItem;", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface f extends TV0.d<c, AdvertPriceListPreviewItem> {

    /* compiled from: AdvertPriceListPreviewItemViewPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/price_list/preview/f$a;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void d(@k PriceList priceList);

        void n(@k String str, @k ImvServices imvServices);
    }

    void c0();

    void z5(@k W0 w02);
}
