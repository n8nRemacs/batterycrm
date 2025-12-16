package com.avito.android.cyclic_gallery_widget.image_carousel.seller_info;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertSellerInfo;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: CarouselSellerItem.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cyclic-gallery-widget_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {
    @k
    public static final b a(@k AdvertSellerInfo advertSellerInfo) {
        Float f12;
        String string = UUID.randomUUID().toString();
        String name = advertSellerInfo.getName();
        if (name == null) {
            name = "";
        }
        String str = name;
        SellerRating rating = advertSellerInfo.getRating();
        if (rating == null || (fValueOf = rating.getScoreFloat()) == null) {
            SellerRating rating2 = advertSellerInfo.getRating();
            if (rating2 != null) {
                Float fValueOf = Float.valueOf(rating2.getScore());
                f12 = fValueOf;
            } else {
                f12 = null;
            }
        } else {
            f12 = fValueOf;
        }
        SellerRating rating3 = advertSellerInfo.getRating();
        String text = rating3 != null ? rating3.getText() : null;
        String sellerTypeName = advertSellerInfo.getSellerTypeName();
        Image image = advertSellerInfo.getImage();
        Boolean boolIsShop = advertSellerInfo.isShop();
        boolean zBooleanValue = boolIsShop != null ? boolIsShop.booleanValue() : false;
        Boolean boolIsBrandSpace = advertSellerInfo.isBrandSpace();
        boolean zBooleanValue2 = boolIsBrandSpace != null ? boolIsBrandSpace.booleanValue() : false;
        DeepLink link = advertSellerInfo.getLink();
        SerpBadgeBar badgeBar = advertSellerInfo.getBadgeBar();
        return new b(string, str, f12, text, sellerTypeName, image, zBooleanValue, zBooleanValue2, link, badgeBar != null ? badgeBar.getBadges() : null, null, null, 3072, null);
    }
}
