package com.avito.android.advert.item.sales_banner;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.sales_banner.StickedSalesBanner;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsStickedSalesBannerPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/sales_banner/d;", "LTV0/d;", "Lcom/avito/android/advert/item/sales_banner/f;", "Lcom/avito/android/advert/item/sales_banner/AdvertDetailsStickedSalesBannerItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<f, AdvertDetailsStickedSalesBannerItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.sales_banner.analytics.a f79310b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f79311c;

    @Inject
    public d(@k com.avito.android.advert.item.sales_banner.analytics.a aVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f79310b = aVar;
        this.f79311c = aVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Long lValueOf;
        f fVar = (f) eVar;
        AdvertDetailsStickedSalesBannerItem advertDetailsStickedSalesBannerItem = (AdvertDetailsStickedSalesBannerItem) aVar;
        StickedSalesBanner stickedSalesBanner = advertDetailsStickedSalesBannerItem.f79296g;
        fVar.e(stickedSalesBanner.getTitle());
        fVar.r(stickedSalesBanner.getText());
        fVar.v1(stickedSalesBanner.getBackgroundImage());
        Long lD2 = stickedSalesBanner.getEndTime();
        if (lD2 != null) {
            lValueOf = Long.valueOf(TimeUnit.SECONDS.toMillis(lD2.longValue()));
        } else {
            lValueOf = null;
        }
        fVar.z40(stickedSalesBanner.getTitle(), lValueOf);
        fVar.lZ(stickedSalesBanner.getMarginBottom());
        fVar.c(new c(this, advertDetailsStickedSalesBannerItem));
    }
}
