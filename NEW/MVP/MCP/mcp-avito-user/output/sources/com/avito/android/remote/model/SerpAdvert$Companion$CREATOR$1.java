package com.avito.android.remote.model;

import Y41.l;
import Y61.k;
import android.os.Parcel;
import androidx.collection.C20199a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonuses;
import com.avito.android.remote.model.hotel.HotelRating;
import com.avito.android.remote.model.price_list.PriceList;
import com.avito.android.remote.model.realtor_bonus.RealtorBonus;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.remote.model.serp.SerpAdvertSpecification;
import com.avito.android.remote.model.serp.SerpSellerVerification;
import com.avito.android.remote.model.short_term_rent.StrRatingAndReviews;
import com.avito.android.remote.model.snippet_type.SnippetType;
import com.avito.android.util.J3;
import com.google.gson.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SerpAdvert.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/SerpAdvert;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SerpAdvert$Companion$CREATOR$1 extends N implements l<Parcel, SerpAdvert> {
    public static final SerpAdvert$Companion$CREATOR$1 INSTANCE = new SerpAdvert$Companion$CREATOR$1();

    public SerpAdvert$Companion$CREATOR$1() {
        super(1);
    }

    @Override // Y41.l
    @k
    public final SerpAdvert invoke(@k Parcel parcel) {
        Long l12;
        String str;
        String str2;
        C20199a c20199a;
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        Object value = parcel.readValue(String.class.getClassLoader());
        if (!(value instanceof String)) {
            value = null;
        }
        String str3 = (String) value;
        m mVar = str3 != null ? new m(str3) : null;
        DeliveryTerms deliveryTerms = (DeliveryTerms) parcel.readParcelable(DeliveryTerms.class.getClassLoader());
        Coordinates coordinates = (Coordinates) parcel.readParcelable(Coordinates.class.getClassLoader());
        Object value2 = parcel.readValue(Long.class.getClassLoader());
        if (!(value2 instanceof Long)) {
            value2 = null;
        }
        Long l13 = (Long) value2;
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        String string9 = parcel.readString();
        AdvertImage advertImage = (AdvertImage) parcel.readParcelable(AdvertImage.class.getClassLoader());
        NameIdEntity nameIdEntity = (NameIdEntity) parcel.readParcelable(NameIdEntity.class.getClassLoader());
        NameIdEntity nameIdEntity2 = (NameIdEntity) parcel.readParcelable(NameIdEntity.class.getClassLoader());
        SerpSellerVerification serpSellerVerification = (SerpSellerVerification) parcel.readParcelable(SerpSellerVerification.class.getClassLoader());
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        UniversalColor universalColor = (UniversalColor) parcel.readParcelable(UniversalColor.class.getClassLoader());
        String string10 = parcel.readString();
        String string11 = parcel.readString();
        String string12 = parcel.readString();
        String string13 = parcel.readString();
        String string14 = parcel.readString();
        String string15 = parcel.readString();
        DiscountIcon discountIcon = (DiscountIcon) parcel.readParcelable(DiscountIcon.class.getClassLoader());
        PriceList priceList = (PriceList) parcel.readParcelable(PriceList.class.getClassLoader());
        String string16 = parcel.readString();
        Video video = (Video) parcel.readParcelable(Video.class.getClassLoader());
        String string17 = parcel.readString();
        boolean zC2 = J3.c(parcel);
        Object value3 = parcel.readValue(Boolean.class.getClassLoader());
        if (!(value3 instanceof Boolean)) {
            value3 = null;
        }
        Boolean bool = (Boolean) value3;
        Object value4 = parcel.readValue(Boolean.class.getClassLoader());
        if (!(value4 instanceof Boolean)) {
            value4 = null;
        }
        Boolean bool2 = (Boolean) value4;
        DeepLink deepLink = (DeepLink) parcel.readParcelable(DeepLink.class.getClassLoader());
        int i12 = parcel.readInt();
        if (i12 < 0) {
            l12 = l13;
            str = string6;
            str2 = string7;
            c20199a = null;
        } else {
            C20199a c20199a2 = new C20199a(i12);
            while (i12 > 0) {
                String str4 = string7;
                Object value5 = parcel.readValue(String.class.getClassLoader());
                String str5 = string6;
                if (value5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                String str6 = (String) value5;
                Long l14 = l13;
                Object value6 = parcel.readValue(String.class.getClassLoader());
                if (value6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                c20199a2.put(str6, (String) value6);
                i12--;
                string7 = str4;
                string6 = str5;
                l13 = l14;
            }
            l12 = l13;
            str = string6;
            str2 = string7;
            c20199a = c20199a2;
        }
        SerpAdvertStr serpAdvertStr = (SerpAdvertStr) parcel.readParcelable(SerpAdvertStr.class.getClassLoader());
        List listA = J3.a(parcel, DimmedImage.class.getClassLoader());
        List listA2 = J3.a(parcel, ConstructorAdvertGalleryItemModel.class.getClassLoader());
        Action action = (Action) parcel.readParcelable(Action.class.getClassLoader());
        String string18 = parcel.readString();
        LegacySerpAdvertBadge legacySerpAdvertBadge = (LegacySerpAdvertBadge) parcel.readParcelable(LegacySerpAdvertBadge.class.getClassLoader());
        SerpBadgeBar serpBadgeBar = (SerpBadgeBar) parcel.readParcelable(SerpBadgeBar.class.getClassLoader());
        AdvertItemActions advertItemActions = (AdvertItemActions) parcel.readParcelable(AdvertItemActions.class.getClassLoader());
        AdvertActions advertActions = (AdvertActions) parcel.readParcelable(AdvertActions.class.getClassLoader());
        List listA3 = J3.a(parcel, GeoReference.class.getClassLoader());
        QuorumFilterInfo quorumFilterInfo = (QuorumFilterInfo) parcel.readParcelable(QuorumFilterInfo.class.getClassLoader());
        RadiusInfo radiusInfo = (RadiusInfo) parcel.readParcelable(RadiusInfo.class.getClassLoader());
        AdvertSellerInfo advertSellerInfo = (AdvertSellerInfo) parcel.readParcelable(AdvertSellerInfo.class.getClassLoader());
        GigShiftInfo gigShiftInfo = (GigShiftInfo) parcel.readParcelable(GigShiftInfo.class.getClassLoader());
        Object value7 = parcel.readValue(Boolean.class.getClassLoader());
        if (!(value7 instanceof Boolean)) {
            value7 = null;
        }
        Boolean bool3 = (Boolean) value7;
        Object value8 = parcel.readValue(Boolean.class.getClassLoader());
        if (!(value8 instanceof Boolean)) {
            value8 = null;
        }
        Boolean bool4 = (Boolean) value8;
        String string19 = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
        String string20 = parcel.readString();
        String string21 = parcel.readString();
        Object value9 = parcel.readValue(Integer.class.getClassLoader());
        if (!(value9 instanceof Integer)) {
            value9 = null;
        }
        Integer num = (Integer) value9;
        boolean zC3 = J3.c(parcel);
        String string22 = parcel.readString();
        SerpAdvertSpecification serpAdvertSpecification = (SerpAdvertSpecification) parcel.readParcelable(SerpAdvertSpecification.class.getClassLoader());
        Object value10 = parcel.readValue(Boolean.class.getClassLoader());
        if (!(value10 instanceof Boolean)) {
            value10 = null;
        }
        Boolean bool5 = (Boolean) value10;
        Object value11 = parcel.readValue(Boolean.class.getClassLoader());
        if (!(value11 instanceof Boolean)) {
            value11 = null;
        }
        Boolean bool6 = (Boolean) value11;
        RealtorBonus realtorBonus = (RealtorBonus) parcel.readParcelable(RealtorBonus.class.getClassLoader());
        BadgeSticker badgeSticker = (BadgeSticker) parcel.readParcelable(BadgeSticker.class.getClassLoader());
        SnippetType snippetType = (SnippetType) parcel.readParcelable(SnippetType.class.getClassLoader());
        BuyWithDeliveryButton buyWithDeliveryButton = (BuyWithDeliveryButton) parcel.readParcelable(BuyWithDeliveryButton.class.getClassLoader());
        KeyAttributes keyAttributes = (KeyAttributes) parcel.readParcelable(KeyAttributes.class.getClassLoader());
        BuyerBonuses buyerBonuses = (BuyerBonuses) parcel.readParcelable(BuyerBonuses.class.getClassLoader());
        HotelRating hotelRating = (HotelRating) parcel.readParcelable(HotelRating.class.getClassLoader());
        GeoDistance geoDistance = (GeoDistance) parcel.readParcelable(GeoDistance.class.getClassLoader());
        StrRatingAndReviews strRatingAndReviews = (StrRatingAndReviews) parcel.readParcelable(StrRatingAndReviews.class.getClassLoader());
        Object value12 = parcel.readValue(Boolean.class.getClassLoader());
        if (!(value12 instanceof Boolean)) {
            value12 = null;
        }
        Boolean bool7 = (Boolean) value12;
        Object value13 = parcel.readValue(Boolean.class.getClassLoader());
        SerpAdvert serpAdvert = new SerpAdvert(string, string2, string3, string4, mVar, deliveryTerms, string5, coordinates, l12, str, str2, string8, string9, advertImage, nameIdEntity, nameIdEntity2, serpSellerVerification, arrayListCreateStringArrayList, universalColor, string10, string11, string12, string13, string14, string15, discountIcon, priceList, string16, video, string17, zC2, bool, bool2, deepLink, c20199a, serpAdvertStr, listA, listA2, action, string18, legacySerpAdvertBadge, serpBadgeBar, advertItemActions, advertActions, listA3, quorumFilterInfo, radiusInfo, advertSellerInfo, gigShiftInfo, bool3, bool4, string19, arrayListCreateStringArrayList2, string20, string21, num, zC3, string22, serpAdvertSpecification, null, null, bool6, bool5, realtorBonus, badgeSticker, snippetType, buyWithDeliveryButton, keyAttributes, buyerBonuses, null, hotelRating, geoDistance, strRatingAndReviews, bool7, (Boolean) (!(value13 instanceof Boolean) ? null : value13), null, (TravelInstallments) parcel.readParcelable(TravelInstallments.class.getClassLoader()), (AdvertTravelPriceVersion) parcel.readParcelable(AdvertTravelPriceVersion.class.getClassLoader()), 0, 402653184, 2080, null);
        serpAdvert.setUniqueId(parcel.readLong());
        return serpAdvert;
    }
}
