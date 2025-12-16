package com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorite_sellers.SellerCarouselItem;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Y1;

/* compiled from: SellerCarouselItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/recommendation/adapter/seller_carousel/i;", "Lcom/avito/android/favorite_sellers/adapter/recommendation/adapter/seller_carousel/e;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y1<vC.b> f155608b;

    @Inject
    public i(@Y61.k Y1<vC.b> y12) {
        this.f155608b = y12;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        SellerCarouselItem sellerCarouselItem = (SellerCarouselItem) aVar;
        Image image = sellerCarouselItem.f155469g;
        com.avito.android.image_loader.a aVarB = image != null ? com.avito.android.image_loader.b.b(image) : null;
        if (sellerCarouselItem.f155470h) {
            kVar.G9(aVarB);
        } else {
            kVar.Dd(aVarB);
        }
        kVar.Wl(sellerCarouselItem.f155467e);
        kVar.T(sellerCarouselItem.f155468f);
        if (sellerCarouselItem.f155473k) {
            kVar.pY();
        } else {
            kVar.ri();
            kVar.Yz(sellerCarouselItem.f155474l);
        }
        List<SellerCarouselItem.Advert> list = sellerCarouselItem.f155471i;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (SellerCarouselItem.Advert advert : list) {
            Image image2 = advert.f155476b;
            arrayList.add(new a(image2 != null ? com.avito.android.image_loader.b.b(image2) : null, advert.f155477c, advert.f155478d));
        }
        kVar.wg(arrayList);
        DeepLink deepLink = sellerCarouselItem.f155472j;
        if (deepLink != null) {
            kVar.a(new f(this, deepLink));
        }
        kVar.yS(new g(this, sellerCarouselItem));
        kVar.Fp(new h(this, sellerCarouselItem));
    }
}
