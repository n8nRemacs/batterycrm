package com.avito.android.advert.item.marketplace_sales_advert_promo_banner;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.marketplace_sales_advert_promo_banner.MarketplaceSalesAdvertPromoBannerItem;
import com.avito.android.remote.model.sales.utils.Timer;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MarketplaceSalesAdvertPromoBannerPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_advert_promo_banner/d;", "Lcom/avito/android/advert/item/marketplace_sales_advert_promo_banner/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f77522b;

    @Inject
    public d(@k com.avito.android.advert_core.analytics.a aVar) {
        this.f77522b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBanner advertPromoBanner = ((MarketplaceSalesAdvertPromoBannerItem) aVar).f77495d;
        fVar.v1(advertPromoBanner.f77501c);
        fVar.N4(advertPromoBanner.f77504f, advertPromoBanner.f77505g);
        MarketplaceSalesAdvertPromoBannerItem.AdvertPromoBannerPriceBlock advertPromoBannerPriceBlock = advertPromoBanner.f77500b;
        fVar.bo(advertPromoBannerPriceBlock);
        fVar.f4(advertPromoBanner.f77502d.f77517b);
        Timer timer = advertPromoBanner.f77503e;
        fVar.I3(timer != null ? Long.valueOf(TimeUnit.SECONDS.toMillis(timer.getEnds())) : null, timer != null ? timer.getStyle() : null);
        this.f77522b.u6(advertPromoBanner.f77506h, advertPromoBanner.f77507i, advertPromoBanner.f77508j, advertPromoBannerPriceBlock != null);
    }
}
