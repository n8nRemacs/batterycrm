package com.avito.android.serp.adapter.empty_placeholder;

import androidx.compose.runtime.internal.P;
import com.avito.android.constructor_advert.ui.serp.constructor.PriceModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConstructorAdvertFallbackConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/empty_placeholder/b;", "Lcom/avito/android/serp/adapter/empty_placeholder/a;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.serp.adapter.empty_placeholder.a
    @Y61.l
    public final AdvertItem a(@Y61.k SerpConstructorAdvertItem serpConstructorAdvertItem) {
        if (serpConstructorAdvertItem.getDeepLink() == null) {
            return null;
        }
        long f83558b = serpConstructorAdvertItem.getF83558b();
        String f161474e = serpConstructorAdvertItem.getF161474e();
        String title = serpConstructorAdvertItem.getTitle();
        if (title == null) {
            title = "";
        }
        String str = title;
        PriceModel price = serpConstructorAdvertItem.getPrice();
        UniversalColor universalColor = price != null ? price.f125783e : null;
        PriceModel price2 = serpConstructorAdvertItem.getPrice();
        String str2 = price2 != null ? price2.f125780b : null;
        PriceModel price3 = serpConstructorAdvertItem.getPrice();
        String str3 = price3 != null ? price3.f125782d : null;
        PriceModel price4 = serpConstructorAdvertItem.getPrice();
        String str4 = price4 != null ? price4.f125781c : null;
        DeepLink deepLink = serpConstructorAdvertItem.getDeepLink();
        List<DimmedImage> imageList = serpConstructorAdvertItem.getImageList();
        List<ConstructorAdvertGalleryItemModel> galleryItemsList = serpConstructorAdvertItem.getGalleryItemsList();
        boolean f107475k = serpConstructorAdvertItem.getF107475k();
        String f73318b = serpConstructorAdvertItem.getF73318b();
        AdvertisementVerticalAlias f73319c = serpConstructorAdvertItem.getF73319c();
        boolean zIsDelivery = serpConstructorAdvertItem.isDelivery();
        int f83560d = serpConstructorAdvertItem.getF83560d();
        SerpViewType f83562f = serpConstructorAdvertItem.getF83562f();
        SerpBadgeBar badgeBar = serpConstructorAdvertItem.getBadgeBar();
        SerpDisplayType serpDisplayType = SerpDisplayType.Grid;
        boolean zIsFeatured = serpConstructorAdvertItem.isFeatured();
        boolean zIsExtendedGallery = serpConstructorAdvertItem.isExtendedGallery();
        String featuredSectionType = serpConstructorAdvertItem.getFeaturedSectionType();
        String featuredSectionTitle = serpConstructorAdvertItem.getFeaturedSectionTitle();
        int featuredSectionPosition = serpConstructorAdvertItem.getFeaturedSectionPosition();
        Map<String, String> additionalAnalyticsParams = serpConstructorAdvertItem.getAdditionalAnalyticsParams();
        Integer categoryId = serpConstructorAdvertItem.getCategoryId();
        return new AdvertItem(f83558b, f161474e, str, null, null, false, universalColor, str2, str3, null, str4, null, null, null, null, zIsDelivery, null, null, null, null, null, null, null, null, 0L, null, null, f83560d, f83562f, false, serpDisplayType, f107475k, false, null, null, f73318b, false, null, false, deepLink, null, additionalAnalyticsParams, null, imageList, galleryItemsList, null, null, null, null, badgeBar, null, categoryId != null ? categoryId.toString() : null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, f73319c, null, null, null, false, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, false, zIsFeatured, featuredSectionTitle, featuredSectionPosition, featuredSectionType, null, false, false, null, false, zIsExtendedGallery, null, null, 117406232, -662153, -503316497, 27, null);
    }
}
