package com.avito.android.advert.item.marketplace_sales_advert_promo_banner;

import Y61.k;
import Y61.l;
import com.avito.android.advert.item.marketplace_sales_advert_promo_banner.MarketplaceSalesAdvertPromoBannerItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.sales.utils.Timer;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: MarketplaceSalesAdvertPromoBannerView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_advert_promo_banner/f;", "LTV0/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface f extends TV0.e {

    /* compiled from: MarketplaceSalesAdvertPromoBannerView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void I3(@l Long l12, @l Timer.TimerStyle timerStyle);

    void N4(@l AttributedText attributedText, @l AttributedText attributedText2);

    void bo(@l MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBannerPriceBlock advertPromoBannerPriceBlock);

    void f4(@k UniversalImage universalImage);

    void v1(@k UniversalImage universalImage);
}
