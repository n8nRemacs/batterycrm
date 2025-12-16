package com.avito.android.favorite_sellers;

import com.avito.android.favorite_sellers.SellerCarouselItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.recommended_sellers.AdvertImageWithOverlay;
import com.avito.android.remote.model.recommended_sellers.RecommendedSeller;
import com.avito.android.remote.model.recommended_sellers.RecommendedSellerElement;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SellerCarouselItemConverter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/T;", "Lcom/avito/android/favorite_sellers/S;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class T implements S {
    @Inject
    public T() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.favorite_sellers.S
    @Y61.k
    public final ArrayList a(@Y61.k String str, @Y61.k List list) {
        C42784z0 c42784z0;
        ArrayList arrayList = new ArrayList();
        List<RecommendedSellerElement> list2 = list;
        int i12 = 10;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
        for (RecommendedSellerElement recommendedSellerElement : list2) {
            if (recommendedSellerElement instanceof RecommendedSeller) {
                StringBuilder sb2 = new StringBuilder("seller_carousel_item:");
                RecommendedSeller recommendedSeller = (RecommendedSeller) recommendedSellerElement;
                sb2.append(recommendedSeller.getUserKey());
                String string = sb2.toString();
                String userKey = recommendedSeller.getUserKey();
                String name = recommendedSeller.getName();
                String description = recommendedSeller.getDescription();
                Image avatar = recommendedSeller.getAvatar();
                Boolean isShop = recommendedSeller.getIsShop();
                boolean zBooleanValue = isShop != null ? isShop.booleanValue() : false;
                List<AdvertImageWithOverlay> images = recommendedSeller.getImages();
                if (images != null) {
                    List<AdvertImageWithOverlay> list3 = images;
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, i12));
                    for (AdvertImageWithOverlay advertImageWithOverlay : list3) {
                        Image image = advertImageWithOverlay.getImage();
                        AdvertImageWithOverlay.Overlay overlay = advertImageWithOverlay.getOverlay();
                        String subtitle = null;
                        String title = overlay != null ? overlay.getTitle() : null;
                        AdvertImageWithOverlay.Overlay overlay2 = advertImageWithOverlay.getOverlay();
                        if (overlay2 != null) {
                            subtitle = overlay2.getSubtitle();
                        }
                        arrayList3.add(new SellerCarouselItem.Advert(image, title, subtitle));
                    }
                    c42784z0 = arrayList3;
                } else {
                    c42784z0 = C42784z0.f406748b;
                }
                arrayList.add(new SellerCarouselItem(string, str, userKey, name, description, avatar, zBooleanValue, c42784z0, recommendedSeller.getDeepLink(), recommendedSeller.getIsSubscribed(), false, recommendedSeller.getIsNotificationsActivated(), 1024, null));
            }
            arrayList2.add(G0.f406611a);
            i12 = 10;
        }
        return arrayList;
    }
}
