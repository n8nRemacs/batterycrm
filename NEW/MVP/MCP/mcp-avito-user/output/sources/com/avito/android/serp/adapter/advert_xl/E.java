package com.avito.android.serp.adapter.advert_xl;

import androidx.compose.runtime.internal.P;
import com.avito.android.C36135w2;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertImage;
import com.avito.android.remote.model.AdvertSellerInfo;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.AdvertisementVerticalAliasKt;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.DeliveryTerms;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.LegacySerpAdvertBadge;
import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.RadiusInfo;
import com.avito.android.remote.model.SerpAdvertXl;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.ServiceTypeKt;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.price_list.PriceList;
import com.avito.android.remote.model.serp.SerpAdvertSpecification;
import com.avito.android.remote.model.serp.SerpSellerVerification;
import com.avito.android.serp.adapter.N;
import com.avito.android.serp.adapter.N0;
import com.avito.android.serp.adapter.badge.PriceTypeBadge;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SerpAdvertXlConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/advert_xl/E;", "Lcom/avito/android/serp/adapter/advert_xl/D;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class E implements D {

    /* renamed from: a, reason: collision with root package name */
    public final int f268821a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f268822b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final N f268823c;

    public E(int i12, @Y61.k C36135w2 c36135w2, @Y61.k N n12) {
        this.f268821a = i12;
        this.f268822b = c36135w2;
        this.f268823c = n12;
    }

    @Override // com.avito.android.serp.adapter.advert_xl.D
    public final AdvertXlItem a(SerpAdvertXl serpAdvertXl, SerpDisplayType serpDisplayType) {
        Image previewImage;
        DimmedImage image;
        Image image2;
        LegacySerpAdvertBadge badge = serpAdvertXl.getBadge();
        PriceTypeBadge priceTypeBadge = badge != null ? new PriceTypeBadge(badge.getTitle(), badge.getF268990c(), badge.getF268991d()) : null;
        long jA2 = N0.a(serpAdvertXl.getUniqueId(), serpAdvertXl.getId());
        String id2 = serpAdvertXl.getId();
        List<DimmedImage> imageList = serpAdvertXl.getImageList();
        List<ConstructorAdvertGalleryItemModel> galleryItems = serpAdvertXl.getGalleryItems();
        boolean isFavorite = serpAdvertXl.getIsFavorite();
        DeepLink deepLink = serpAdvertXl.getDeepLink();
        AdvertDetailsLink advertDetailsLink = deepLink instanceof AdvertDetailsLink ? (AdvertDetailsLink) deepLink : null;
        String str = advertDetailsLink != null ? advertDetailsLink.f132948c : null;
        String title = serpAdvertXl.getTitle();
        String description = serpAdvertXl.getDescription();
        String strA0 = description != null ? C43066x.a0(description, "\n", " ", false) : null;
        boolean z12 = serpAdvertXl.getDelivery() != null;
        DeliveryTerms deliveryTerms = serpAdvertXl.getDeliveryTerms();
        ru.avito.component.serp.DeliveryTerms deliveryTermsA = deliveryTerms != null ? this.f268823c.a(deliveryTerms) : null;
        NameIdEntity shop = serpAdvertXl.getShop();
        String f119974b = shop != null ? shop.getF119974b() : null;
        SerpSellerVerification verification = serpAdvertXl.getVerification();
        String title2 = verification != null ? verification.getTitle() : null;
        String location = serpAdvertXl.getLocation();
        String distance = serpAdvertXl.getDistance();
        String address = serpAdvertXl.getAddress();
        Long time = serpAdvertXl.getTime();
        long jLongValue = time != null ? time.longValue() : 0L;
        String price = serpAdvertXl.getPrice();
        String normalizedPrice = serpAdvertXl.getNormalizedPrice();
        String priceWithoutDiscount = serpAdvertXl.getPriceWithoutDiscount();
        String previousPrice = serpAdvertXl.getPreviousPrice();
        String previousPriceHint = serpAdvertXl.getPreviousPriceHint();
        DiscountIcon discountIcon = serpAdvertXl.getDiscountIcon();
        PriceList priceList = serpAdvertXl.getPriceList();
        DeepLink deepLink2 = serpAdvertXl.getDeepLink();
        if (deepLink2 == null) {
            deepLink2 = new NoMatchLink();
        }
        DeepLink deepLink3 = deepLink2;
        Map<String, String> analyticParams = serpAdvertXl.getAnalyticParams();
        Action callAction = serpAdvertXl.getCallAction();
        Action bookingAction = serpAdvertXl.getBookingAction();
        AdvertActions contacts = serpAdvertXl.getContacts();
        List<String> services = serpAdvertXl.getServices();
        boolean zContains = services != null ? services.contains(ServiceTypeKt.SERVICE_HIGHLIGHT) : false;
        UniversalColor highlightColor = serpAdvertXl.getHighlightColor();
        String schedule = serpAdvertXl.getSchedule();
        boolean zF2 = L.f(serpAdvertXl.getIsVerifiedSeller(), Boolean.TRUE);
        String additionalName = serpAdvertXl.getAdditionalName();
        Action additionalAction = serpAdvertXl.getAdditionalAction();
        String status = serpAdvertXl.getStatus();
        if (status == null) {
            status = "active";
        }
        boolean zEqualsIgnoreCase = "active".equalsIgnoreCase(status);
        SerpBadgeBar badgeBar = serpAdvertXl.getBadgeBar();
        RadiusInfo radiusInfo = serpAdvertXl.getRadiusInfo();
        AdvertSellerInfo sellerInfo = serpAdvertXl.getSellerInfo();
        List<GeoReference> geoReferences = serpAdvertXl.getGeoReferences();
        QuorumFilterInfo quorumFilterInfo = serpAdvertXl.getQuorumFilterInfo();
        Boolean hasRealtyLayout = serpAdvertXl.getHasRealtyLayout();
        C36135w2 c36135w2 = this.f268822b;
        c36135w2.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[2];
        if (!((Boolean) c36135w2.f327483d.a().invoke()).booleanValue()) {
            hasRealtyLayout = null;
        }
        boolean zBooleanValue = hasRealtyLayout != null ? hasRealtyLayout.booleanValue() : false;
        Boolean hasVideo = serpAdvertXl.getHasVideo();
        boolean zBooleanValue2 = hasVideo != null ? hasVideo.booleanValue() : false;
        String nativeVideoABCategory = serpAdvertXl.getNativeVideoABCategory();
        List<String> exposureParams = serpAdvertXl.getExposureParams();
        AdvertisementVerticalAlias verticalAlias = AdvertisementVerticalAliasKt.toVerticalAlias(serpAdvertXl.getCategory());
        String xHash = serpAdvertXl.getXHash();
        NameIdEntity category = serpAdvertXl.getCategory();
        String id3 = category != null ? category.getId() : null;
        AdvertImage image3 = serpAdvertXl.getImage();
        if (image3 == null || (image = image3.getImage()) == null || (image2 = image.getImage()) == null) {
            Video video = serpAdvertXl.getVideo();
            previewImage = video != null ? video.getPreviewImage() : null;
        } else {
            previewImage = image2;
        }
        SerpAdvertSpecification specification = serpAdvertXl.getSpecification();
        Boolean trackVacanciesSurvey = serpAdvertXl.getTrackVacanciesSurvey();
        boolean zBooleanValue3 = trackVacanciesSurvey != null ? trackVacanciesSurvey.booleanValue() : false;
        Boolean hasDiscount = serpAdvertXl.getHasDiscount();
        return new AdvertXlItem(jA2, id2, imageList, galleryItems, isFavorite, str, this.f268821a, serpDisplayType, null, title, strA0, z12, deliveryTermsA, f119974b, title2, location, address, jLongValue, price, normalizedPrice, priceWithoutDiscount, previousPrice, previousPriceHint, discountIcon, priceList, deepLink3, analyticParams, callAction, bookingAction, contacts, zContains, highlightColor, schedule, zEqualsIgnoreCase, zF2, additionalName, additionalAction, false, priceTypeBadge, badgeBar, radiusInfo, sellerInfo, geoReferences, quorumFilterInfo, distance, zBooleanValue, zBooleanValue2, nativeVideoABCategory, exposureParams, verticalAlias, null, xHash, id3, previewImage, specification, zBooleanValue3, hasDiscount != null ? hasDiscount.booleanValue() : false, serpAdvertXl.getRealtorBonus(), serpAdvertXl.getBadgeSticker(), serpAdvertXl.getSnippetType(), serpAdvertXl.getKeyAttributes(), null, null, serpAdvertXl.getGeoDistance(), 256, 1610874912, null);
    }
}
