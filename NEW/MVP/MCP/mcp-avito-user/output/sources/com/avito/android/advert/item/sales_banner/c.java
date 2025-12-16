package com.avito.android.advert.item.sales_banner;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.sales_banner.StickedSalesBanner;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsStickedSalesBannerPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f79308l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsStickedSalesBannerItem f79309m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, AdvertDetailsStickedSalesBannerItem advertDetailsStickedSalesBannerItem) {
        super(0);
        this.f79308l = dVar;
        this.f79309m = advertDetailsStickedSalesBannerItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f79308l;
        AdvertDetailsStickedSalesBannerItem advertDetailsStickedSalesBannerItem = this.f79309m;
        String strC = advertDetailsStickedSalesBannerItem.f79296g.getBannerType();
        StickedSalesBanner stickedSalesBanner = advertDetailsStickedSalesBannerItem.f79296g;
        List<Attribute> attributes = stickedSalesBanner.getTitle().getAttributes();
        com.avito.android.advert.item.sales_banner.analytics.a aVar = dVar.f79310b;
        aVar.getClass();
        if (strC == null) {
            strC = "";
        }
        aVar.f79300a.c(new com.avito.android.advert.item.sales_banner.analytics.c(aVar.f79301b, strC, com.avito.android.advert.item.sales_banner.analytics.a.a(attributes)));
        b.a.a(dVar.f79311c, stickedSalesBanner.getDeepLink(), null, null, 6);
        return G0.f406611a;
    }
}
