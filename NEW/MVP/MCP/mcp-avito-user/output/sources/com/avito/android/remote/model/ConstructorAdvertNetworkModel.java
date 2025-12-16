package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.new_advert_badge.NewAdvertBadge;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.remote.model.section.SectionElement;
import com.avito.android.remote.model.section.complementary_v3.SectionElementV3;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;

/* compiled from: ConstructorAdvertNetworkModel.kt */
@d
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bD\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0093\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\r\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010 \u0012\b\u0010\"\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\t\u0012\b\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020(HÖ\u0001¢\u0006\u0004\b9\u0010:J \u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020(HÖ\u0001¢\u0006\u0004\b?\u0010@R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bD\u0010CR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\b\n\u0010IR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bK\u0010LR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010M\u001a\u0004\bN\u0010OR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u0010RR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010M\u001a\u0004\bS\u0010OR\u001a\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\b\u0014\u0010IR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010T\u001a\u0004\bU\u0010VR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bW\u0010CR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010M\u001a\u0004\bX\u0010OR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010Y\u001a\u0004\bZ\u0010[R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\\\u001a\u0004\b]\u0010^R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010M\u001a\u0004\b_\u0010OR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010`\u001a\u0004\ba\u0010bR(\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010c\u001a\u0004\bd\u0010eR\u001c\u0010\"\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010T\u001a\u0004\bf\u0010VR\u001c\u0010#\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010T\u001a\u0004\bg\u0010VR\u001c\u0010$\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010T\u001a\u0004\b$\u0010VR\u001c\u0010%\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010T\u001a\u0004\b%\u0010VR\u001c\u0010&\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010T\u001a\u0004\b&\u0010VR\u001c\u0010'\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010T\u001a\u0004\b'\u0010VR\u001c\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010h\u001a\u0004\bi\u0010jR\u001c\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010k\u001a\u0004\bl\u0010mR\u001c\u0010-\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010n\u001a\u0004\bo\u0010pR\u001c\u0010.\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010T\u001a\u0004\bq\u0010VR\u001c\u0010/\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010T\u001a\u0004\b/\u0010VR\u001c\u00101\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010r\u001a\u0004\bs\u0010tR\u001c\u00103\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010u\u001a\u0004\bv\u0010wR\u001c\u00104\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010A\u001a\u0004\bx\u0010CR\u001c\u00106\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010y\u001a\u0004\bz\u0010{R$\u0010|\u001a\u0002058\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0082\u0001"}, d2 = {"Lcom/avito/android/remote/model/ConstructorAdvertNetworkModel;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/section/SectionElement;", "Lcom/avito/android/remote/model/section/complementary_v3/SectionElementV3;", "", "id", "title", "Lcom/avito/android/remote/model/PriceNetworkModel;", "price", "", "isFavorite", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "Lcom/avito/android/remote/model/DimmedImage;", "imageList", "Lcom/avito/android/remote/model/GalleryConfigModel;", "galleryConfig", "Lcom/avito/android/remote/model/ConstructorAdvertGalleryItemModel;", "galleryItems", "isDelivery", "reserved", "nativeVideoABCategory", "exposureParams", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "Lcom/avito/android/remote/model/sales/utils/BadgeSticker;", "badgeSticker", "Lcom/avito/android/beduin_models/BeduinModel;", "freeForm", "Lcom/avito/android/remote/model/SnippetSize;", "size", "", "analyticParams", "hasVideo", "hasRealtyLayout", "isRedesign", "isStrRedesign", "isUnavailable", "isExtendedGallery", "", "categoryId", "Lcom/avito/android/remote/model/SellerInfoNetworkModel;", "sellerInfo", "Lcom/avito/android/remote/model/SellerOnline;", "sellerOnline", "cvViewed", "isCvHidden", "Lcom/avito/android/remote/model/new_advert_badge/NewAdvertBadge;", "newAdvertBadge", "Lcom/avito/android/remote/model/FavoritesToast;", "favoritesToast", "xHash", "", "gigShiftId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/PriceNetworkModel;ZLcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Lcom/avito/android/remote/model/GalleryConfigModel;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Lcom/avito/android/remote/model/sales/utils/BadgeSticker;Ljava/util/List;Lcom/avito/android/remote/model/SnippetSize;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/avito/android/remote/model/SellerInfoNetworkModel;Lcom/avito/android/remote/model/SellerOnline;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/new_advert_badge/NewAdvertBadge;Lcom/avito/android/remote/model/FavoritesToast;Ljava/lang/String;Ljava/lang/Long;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/PriceNetworkModel;", "getPrice", "()Lcom/avito/android/remote/model/PriceNetworkModel;", "Z", "()Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "getImageList", "()Ljava/util/List;", "Lcom/avito/android/remote/model/GalleryConfigModel;", "getGalleryConfig", "()Lcom/avito/android/remote/model/GalleryConfigModel;", "getGalleryItems", "Ljava/lang/Boolean;", "getReserved", "()Ljava/lang/Boolean;", "getNativeVideoABCategory", "getExposureParams", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "getBadgeBar", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "Lcom/avito/android/remote/model/sales/utils/BadgeSticker;", "getBadgeSticker", "()Lcom/avito/android/remote/model/sales/utils/BadgeSticker;", "getFreeForm", "Lcom/avito/android/remote/model/SnippetSize;", "getSize", "()Lcom/avito/android/remote/model/SnippetSize;", "Ljava/util/Map;", "getAnalyticParams", "()Ljava/util/Map;", "getHasVideo", "getHasRealtyLayout", "Ljava/lang/Integer;", "getCategoryId", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/SellerInfoNetworkModel;", "getSellerInfo", "()Lcom/avito/android/remote/model/SellerInfoNetworkModel;", "Lcom/avito/android/remote/model/SellerOnline;", "getSellerOnline", "()Lcom/avito/android/remote/model/SellerOnline;", "getCvViewed", "Lcom/avito/android/remote/model/new_advert_badge/NewAdvertBadge;", "getNewAdvertBadge", "()Lcom/avito/android/remote/model/new_advert_badge/NewAdvertBadge;", "Lcom/avito/android/remote/model/FavoritesToast;", "getFavoritesToast", "()Lcom/avito/android/remote/model/FavoritesToast;", "getXHash", "Ljava/lang/Long;", "getGigShiftId", "()Ljava/lang/Long;", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConstructorAdvertNetworkModel implements SerpElement, SectionElement, SectionElementV3 {

    @k
    public static final Parcelable.Creator<ConstructorAdvertNetworkModel> CREATOR = new Creator();

    @c("analyticParams")
    @l
    private final Map<String, String> analyticParams;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR)
    @l
    private final SerpBadgeBar badgeBar;

    @c("badgeSticker")
    @l
    private final BadgeSticker badgeSticker;

    @c("categoryId")
    @l
    private final Integer categoryId;

    @c("cvViewed")
    @l
    private final Boolean cvViewed;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink deepLink;

    @c("abExposureParams")
    @l
    private final List<String> exposureParams;

    @c("favoritesToast")
    @l
    private final FavoritesToast favoritesToast;

    @c("freeForm")
    @l
    private final List<BeduinModel> freeForm;

    @c("galleryConfig")
    @l
    private final GalleryConfigModel galleryConfig;

    @c("galleryItems")
    @l
    private final List<ConstructorAdvertGalleryItemModel> galleryItems;

    @c("gigShiftId")
    @l
    private final Long gigShiftId;

    @c("hasRealtyLayout")
    @l
    private final Boolean hasRealtyLayout;

    @c("hasVideo")
    @l
    private final Boolean hasVideo;

    @c("id")
    @l
    private final String id;

    @c("images")
    @l
    private final List<DimmedImage> imageList;

    @c("isCvHidden")
    @l
    private final Boolean isCvHidden;

    @c("isDeliveryAvailable")
    private final boolean isDelivery;

    @c("isExtendedGallery")
    @l
    private final Boolean isExtendedGallery;

    @c("isFavorite")
    private final boolean isFavorite;

    @c("isRedesign")
    @l
    private final Boolean isRedesign;

    @c("isStrRedesign")
    @l
    private final Boolean isStrRedesign;

    @c("isUnavailable")
    @l
    private final Boolean isUnavailable;

    @c("nativeVideoAbCategory")
    @l
    private final String nativeVideoABCategory;

    @c("newAdvertBadge")
    @l
    private final NewAdvertBadge newAdvertBadge;

    @c("price")
    @l
    private final PriceNetworkModel price;

    @c("isReserved")
    @l
    private final Boolean reserved;

    @c("sellerInfo")
    @l
    private final SellerInfoNetworkModel sellerInfo;

    @c("sellerOnline")
    @l
    private final SellerOnline sellerOnline;

    @c("size")
    @l
    private final SnippetSize size;

    @c("title")
    @l
    private final String title;
    private long uniqueId;

    @c("xHash")
    @l
    private final String xHash;

    /* compiled from: ConstructorAdvertNetworkModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConstructorAdvertNetworkModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ConstructorAdvertNetworkModel createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf;
            ArrayList arrayList3;
            LinkedHashMap linkedHashMap;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean boolValueOf7;
            Boolean boolValueOf8;
            Boolean boolValueOf9;
            String string = parcel.readString();
            String string2 = parcel.readString();
            PriceNetworkModel priceNetworkModelCreateFromParcel = parcel.readInt() == 0 ? null : PriceNetworkModel.CREATOR.createFromParcel(parcel);
            boolean z12 = parcel.readInt() != 0;
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ConstructorAdvertNetworkModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(ConstructorAdvertNetworkModel.class, parcel, arrayList, iL2, 1);
                }
            }
            GalleryConfigModel galleryConfigModelCreateFromParcel = parcel.readInt() == 0 ? null : GalleryConfigModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = a.l(ConstructorAdvertNetworkModel.class, parcel, arrayList2, iL3, 1);
                }
            }
            boolean z13 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            SerpBadgeBar serpBadgeBarCreateFromParcel = parcel.readInt() == 0 ? null : SerpBadgeBar.CREATOR.createFromParcel(parcel);
            BadgeSticker badgeStickerCreateFromParcel = parcel.readInt() == 0 ? null : BadgeSticker.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i14);
                int iL4 = 0;
                while (iL4 != i14) {
                    iL4 = a.l(ConstructorAdvertNetworkModel.class, parcel, arrayList4, iL4, 1);
                    i14 = i14;
                }
                arrayList3 = arrayList4;
            }
            SnippetSize snippetSizeValueOf = parcel.readInt() == 0 ? null : SnippetSize.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i15 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i15);
                int iA2 = 0;
                while (iA2 != i15) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    i15 = i15;
                }
                linkedHashMap = linkedHashMap2;
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf7 = null;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            SellerInfoNetworkModel sellerInfoNetworkModelCreateFromParcel = parcel.readInt() == 0 ? null : SellerInfoNetworkModel.CREATOR.createFromParcel(parcel);
            SellerOnline sellerOnlineCreateFromParcel = parcel.readInt() == 0 ? null : SellerOnline.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf8 = null;
            } else {
                boolValueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf9 = null;
            } else {
                boolValueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ConstructorAdvertNetworkModel(string, string2, priceNetworkModelCreateFromParcel, z12, deepLink, arrayList, galleryConfigModelCreateFromParcel, arrayList2, z13, boolValueOf, string3, arrayListCreateStringArrayList, serpBadgeBarCreateFromParcel, badgeStickerCreateFromParcel, arrayList3, snippetSizeValueOf, linkedHashMap, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, numValueOf, sellerInfoNetworkModelCreateFromParcel, sellerOnlineCreateFromParcel, boolValueOf8, boolValueOf9, parcel.readInt() == 0 ? null : NewAdvertBadge.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FavoritesToast.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ConstructorAdvertNetworkModel[] newArray(int i12) {
            return new ConstructorAdvertNetworkModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConstructorAdvertNetworkModel(@l String str, @l String str2, @l PriceNetworkModel priceNetworkModel, boolean z12, @l DeepLink deepLink, @l List<DimmedImage> list, @l GalleryConfigModel galleryConfigModel, @l List<? extends ConstructorAdvertGalleryItemModel> list2, boolean z13, @l Boolean bool, @l String str3, @l List<String> list3, @l SerpBadgeBar serpBadgeBar, @l BadgeSticker badgeSticker, @l List<? extends BeduinModel> list4, @l SnippetSize snippetSize, @l Map<String, String> map, @l Boolean bool2, @l Boolean bool3, @l Boolean bool4, @l Boolean bool5, @l Boolean bool6, @l Boolean bool7, @l Integer num, @l SellerInfoNetworkModel sellerInfoNetworkModel, @l SellerOnline sellerOnline, @l Boolean bool8, @l Boolean bool9, @l NewAdvertBadge newAdvertBadge, @l FavoritesToast favoritesToast, @l String str4, @l Long l12) {
        this.id = str;
        this.title = str2;
        this.price = priceNetworkModel;
        this.isFavorite = z12;
        this.deepLink = deepLink;
        this.imageList = list;
        this.galleryConfig = galleryConfigModel;
        this.galleryItems = list2;
        this.isDelivery = z13;
        this.reserved = bool;
        this.nativeVideoABCategory = str3;
        this.exposureParams = list3;
        this.badgeBar = serpBadgeBar;
        this.badgeSticker = badgeSticker;
        this.freeForm = list4;
        this.size = snippetSize;
        this.analyticParams = map;
        this.hasVideo = bool2;
        this.hasRealtyLayout = bool3;
        this.isRedesign = bool4;
        this.isStrRedesign = bool5;
        this.isUnavailable = bool6;
        this.isExtendedGallery = bool7;
        this.categoryId = num;
        this.sellerInfo = sellerInfoNetworkModel;
        this.sellerOnline = sellerOnline;
        this.cvViewed = bool8;
        this.isCvHidden = bool9;
        this.newAdvertBadge = newAdvertBadge;
        this.favoritesToast = favoritesToast;
        this.xHash = str4;
        this.gigShiftId = l12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Map<String, String> getAnalyticParams() {
        return this.analyticParams;
    }

    @l
    public final SerpBadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @l
    public final BadgeSticker getBadgeSticker() {
        return this.badgeSticker;
    }

    @l
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    @l
    public final Boolean getCvViewed() {
        return this.cvViewed;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final List<String> getExposureParams() {
        return this.exposureParams;
    }

    @l
    public final FavoritesToast getFavoritesToast() {
        return this.favoritesToast;
    }

    @l
    public final List<BeduinModel> getFreeForm() {
        return this.freeForm;
    }

    @l
    public final GalleryConfigModel getGalleryConfig() {
        return this.galleryConfig;
    }

    @l
    public final List<ConstructorAdvertGalleryItemModel> getGalleryItems() {
        return this.galleryItems;
    }

    @l
    public final Long getGigShiftId() {
        return this.gigShiftId;
    }

    @l
    public final Boolean getHasRealtyLayout() {
        return this.hasRealtyLayout;
    }

    @l
    public final Boolean getHasVideo() {
        return this.hasVideo;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final List<DimmedImage> getImageList() {
        return this.imageList;
    }

    @l
    public final String getNativeVideoABCategory() {
        return this.nativeVideoABCategory;
    }

    @l
    public final NewAdvertBadge getNewAdvertBadge() {
        return this.newAdvertBadge;
    }

    @l
    public final PriceNetworkModel getPrice() {
        return this.price;
    }

    @l
    public final Boolean getReserved() {
        return this.reserved;
    }

    @l
    public final SellerInfoNetworkModel getSellerInfo() {
        return this.sellerInfo;
    }

    @l
    public final SellerOnline getSellerOnline() {
        return this.sellerOnline;
    }

    @l
    public final SnippetSize getSize() {
        return this.size;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    @l
    public final String getXHash() {
        return this.xHash;
    }

    @l
    /* renamed from: isCvHidden, reason: from getter */
    public final Boolean getIsCvHidden() {
        return this.isCvHidden;
    }

    /* renamed from: isDelivery, reason: from getter */
    public final boolean getIsDelivery() {
        return this.isDelivery;
    }

    @l
    /* renamed from: isExtendedGallery, reason: from getter */
    public final Boolean getIsExtendedGallery() {
        return this.isExtendedGallery;
    }

    /* renamed from: isFavorite, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @l
    /* renamed from: isRedesign, reason: from getter */
    public final Boolean getIsRedesign() {
        return this.isRedesign;
    }

    @l
    /* renamed from: isStrRedesign, reason: from getter */
    public final Boolean getIsStrRedesign() {
        return this.isStrRedesign;
    }

    @l
    /* renamed from: isUnavailable, reason: from getter */
    public final Boolean getIsUnavailable() {
        return this.isUnavailable;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        PriceNetworkModel priceNetworkModel = this.price;
        if (priceNetworkModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceNetworkModel.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isFavorite ? 1 : 0);
        parcel.writeParcelable(this.deepLink, flags);
        List<DimmedImage> list = this.imageList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        GalleryConfigModel galleryConfigModel = this.galleryConfig;
        if (galleryConfigModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            galleryConfigModel.writeToParcel(parcel, flags);
        }
        List<ConstructorAdvertGalleryItemModel> list2 = this.galleryItems;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        parcel.writeInt(this.isDelivery ? 1 : 0);
        Boolean bool = this.reserved;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.nativeVideoABCategory);
        parcel.writeStringList(this.exposureParams);
        SerpBadgeBar serpBadgeBar = this.badgeBar;
        if (serpBadgeBar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serpBadgeBar.writeToParcel(parcel, flags);
        }
        BadgeSticker badgeSticker = this.badgeSticker;
        if (badgeSticker == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgeSticker.writeToParcel(parcel, flags);
        }
        List<BeduinModel> list3 = this.freeForm;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        SnippetSize snippetSize = this.size;
        if (snippetSize == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(snippetSize.name());
        }
        Map<String, String> map = this.analyticParams;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        Boolean bool2 = this.hasVideo;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.hasRealtyLayout;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        Boolean bool4 = this.isRedesign;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        Boolean bool5 = this.isStrRedesign;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool5);
        }
        Boolean bool6 = this.isUnavailable;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool6);
        }
        Boolean bool7 = this.isExtendedGallery;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool7);
        }
        Integer num = this.categoryId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        SellerInfoNetworkModel sellerInfoNetworkModel = this.sellerInfo;
        if (sellerInfoNetworkModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerInfoNetworkModel.writeToParcel(parcel, flags);
        }
        SellerOnline sellerOnline = this.sellerOnline;
        if (sellerOnline == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerOnline.writeToParcel(parcel, flags);
        }
        Boolean bool8 = this.cvViewed;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool8);
        }
        Boolean bool9 = this.isCvHidden;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool9);
        }
        NewAdvertBadge newAdvertBadge = this.newAdvertBadge;
        if (newAdvertBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newAdvertBadge.writeToParcel(parcel, flags);
        }
        FavoritesToast favoritesToast = this.favoritesToast;
        if (favoritesToast == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            favoritesToast.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.xHash);
        Long l12 = this.gigShiftId;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }

    public /* synthetic */ ConstructorAdvertNetworkModel(String str, String str2, PriceNetworkModel priceNetworkModel, boolean z12, DeepLink deepLink, List list, GalleryConfigModel galleryConfigModel, List list2, boolean z13, Boolean bool, String str3, List list3, SerpBadgeBar serpBadgeBar, BadgeSticker badgeSticker, List list4, SnippetSize snippetSize, Map map, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, SellerInfoNetworkModel sellerInfoNetworkModel, SellerOnline sellerOnline, Boolean bool8, Boolean bool9, NewAdvertBadge newAdvertBadge, FavoritesToast favoritesToast, String str4, Long l12, int i12, C42822w c42822w) {
        this(str, str2, priceNetworkModel, (i12 & 8) != 0 ? false : z12, deepLink, list, (i12 & 64) != 0 ? null : galleryConfigModel, list2, (i12 & 256) != 0 ? false : z13, (i12 & 512) != 0 ? null : bool, (i12 & 1024) != 0 ? null : str3, (i12 & 2048) != 0 ? null : list3, serpBadgeBar, (i12 & 8192) != 0 ? null : badgeSticker, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list4, (32768 & i12) != 0 ? null : snippetSize, (65536 & i12) != 0 ? null : map, bool2, bool3, bool4, (1048576 & i12) != 0 ? Boolean.FALSE : bool5, (2097152 & i12) != 0 ? Boolean.FALSE : bool6, (4194304 & i12) != 0 ? null : bool7, (8388608 & i12) != 0 ? null : num, (16777216 & i12) != 0 ? null : sellerInfoNetworkModel, (33554432 & i12) != 0 ? null : sellerOnline, (67108864 & i12) != 0 ? null : bool8, (134217728 & i12) != 0 ? null : bool9, (268435456 & i12) != 0 ? null : newAdvertBadge, (536870912 & i12) != 0 ? null : favoritesToast, (1073741824 & i12) != 0 ? null : str4, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : l12);
    }
}
