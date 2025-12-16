package com.avito.android.constructor_advert.ui.serp.constructor;

import android.os.Parcelable;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.FavoritesToast;
import com.avito.android.remote.model.GalleryConfigModel;
import com.avito.android.remote.model.SellerOnline;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SnippetSize;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.new_advert_badge.NewAdvertBadge;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.serp.adapter.InAppCallsAwareItem;
import com.avito.android.serp.adapter.S;
import com.avito.android.serp.adapter.Z;
import com.avito.android.serp.adapter.i1;
import com.avito.android.serp.adapter.m1;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ConstructorAdvertItem.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b¨\u0006\t"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/serp/adapter/S;", "Lcom/avito/android/serp/adapter/m1;", "LLa/b;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/u;", "Lcom/avito/android/serp/adapter/InAppCallsAwareItem;", "Lcom/avito/android/serp/adapter/i1;", "Lcom/avito/android/serp/adapter/Z;", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ConstructorAdvertItem extends Parcelable, S, m1, La.b, u, InAppCallsAwareItem, i1, Z {
    @Y61.l
    Map<String, String> getAdditionalAnalyticsParams();

    @Y61.l
    Map<String, String> getAnalyticParams();

    @Override // com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getAnalyticsContext */
    String getF107478n();

    @Y61.l
    SerpBadgeBar getBadgeBar();

    @Y61.l
    BadgeSticker getBadgeSticker();

    boolean getCanBeHidden();

    @Y61.l
    Integer getCategoryId();

    @Y61.l
    Boolean getCvViewed();

    @Y61.l
    DeepLink getDeepLink();

    @Y61.k
    SerpDisplayType getDisplayType();

    @Y61.l
    List<String> getExposureParams();

    @Override // com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getFavoritesToast */
    FavoritesToast getF107480p();

    @Y61.l
    List<BeduinModel> getFreeForm();

    @Y61.l
    List<AbstractC40112a<BeduinModel, InterfaceC40116e>> getFreeFormConverted();

    @Y61.l
    GalleryConfigModel getGalleryConfig();

    @Y61.l
    List<ConstructorAdvertGalleryItemModel> getGalleryItemsList();

    @Y61.l
    Long getGigShiftId();

    boolean getHasDiscount();

    boolean getHasRealtyLayout();

    boolean getHasVideo();

    @Override // TV0.a
    /* renamed from: getId */
    long getF395939g();

    @Y61.l
    List<DimmedImage> getImageList();

    @Y61.l
    String getNativeVideoABCategory();

    @Y61.l
    NewAdvertBadge getNewAdvertBadge();

    @Y61.l
    PriceModel getPrice();

    @Y61.l
    Boolean getReserved();

    @Y61.l
    SellerInfoModel getSellerInfo();

    @Y61.l
    SellerOnline getSellerOnline();

    @Y61.k
    SnippetSize getSize();

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount */
    int getF79433k();

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    String getF132117b();

    @Y61.l
    String getTitle();

    @Override // com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getVerticalAlias */
    AdvertisementVerticalAlias getF107479o();

    @Y61.l
    String getXHash();

    @Y61.l
    Boolean isCvHidden();

    boolean isDelivery();

    boolean isExtendedGallery();

    @Override // com.avito.android.serp.adapter.S
    /* renamed from: isFavorite */
    boolean getF107475k();

    boolean isHidden();

    boolean isRedesign();

    boolean isStrRedesign();

    boolean isUnavailable();

    @Override // com.avito.android.serp.adapter.m1
    /* renamed from: isViewed */
    boolean getF107481q();

    @Override // com.avito.android.serp.adapter.m1
    void setViewed(boolean z12);
}
