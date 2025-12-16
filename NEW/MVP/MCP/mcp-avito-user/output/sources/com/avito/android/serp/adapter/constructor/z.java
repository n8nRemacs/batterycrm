package com.avito.android.serp.adapter.constructor;

import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.remote.model.SerpDisplayType;
import kotlin.Metadata;

/* compiled from: SerpConstructorAdvertItem.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class z {
    @Y61.k
    public static final SerpConstructorAdvertItem a(@Y61.k ConstructorAdvertItem constructorAdvertItem, @Y61.k SerpDisplayType serpDisplayType) {
        boolean z12 = false;
        boolean z13 = false;
        SerpConstructorAdvertItem serpConstructorAdvertItem = new SerpConstructorAdvertItem(constructorAdvertItem.getF78300d(), constructorAdvertItem.getF157692b(), constructorAdvertItem.getSize(), constructorAdvertItem.getTitle(), constructorAdvertItem.getPrice(), constructorAdvertItem.getDeepLink(), constructorAdvertItem.getImageList(), constructorAdvertItem.getGalleryItemsList(), constructorAdvertItem.getBadgeBar(), constructorAdvertItem.getBadgeSticker(), constructorAdvertItem.isDelivery(), constructorAdvertItem.getHasDiscount(), constructorAdvertItem.getNativeVideoABCategory(), constructorAdvertItem.getExposureParams(), constructorAdvertItem.getFreeForm(), constructorAdvertItem.getReserved(), constructorAdvertItem.getF107481q(), constructorAdvertItem.getF107475k(), constructorAdvertItem.getCanBeHidden(), constructorAdvertItem.isHidden(), constructorAdvertItem.getF73318b(), constructorAdvertItem.getF73319c(), constructorAdvertItem.getF107480p(), serpDisplayType, constructorAdvertItem.getAnalyticParams(), constructorAdvertItem.getAdditionalAnalyticsParams(), z13, constructorAdvertItem.getHasVideo(), constructorAdvertItem.getHasRealtyLayout(), constructorAdvertItem.isRedesign(), constructorAdvertItem.isStrRedesign(), constructorAdvertItem.isUnavailable(), constructorAdvertItem.isExtendedGallery(), constructorAdvertItem.getCvViewed(), constructorAdvertItem.isCvHidden(), constructorAdvertItem.getCategoryId(), constructorAdvertItem.getSellerInfo(), constructorAdvertItem.getSellerOnline(), constructorAdvertItem.getNewAdvertBadge(), z12, constructorAdvertItem.isFeatured(), constructorAdvertItem.getFeaturedSectionTitle(), constructorAdvertItem.getFeaturedSectionPosition(), constructorAdvertItem.getFeaturedSectionType(), constructorAdvertItem.getXHash(), constructorAdvertItem.getGalleryConfig(), constructorAdvertItem.getGigShiftId(), 0, 128, null);
        serpConstructorAdvertItem.setFreeFormConverted(constructorAdvertItem.getFreeFormConverted());
        return serpConstructorAdvertItem;
    }
}
