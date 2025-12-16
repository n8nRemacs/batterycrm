package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FavoriteAdvert.kt */
@d
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\b\u0007\u0018\u00002\u00020\u0001:\u0001]Bù\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'HÖ\u0001¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b3\u00102R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b4\u00102R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b5\u00102R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b6\u00102R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b7\u00102R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b;\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\bE\u00102R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\bF\u00102R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\bJ\u00102R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\bN\u00102R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\bO\u00102R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010S\u001a\u0004\bT\u0010UR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\bV\u00102R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u00100\u001a\u0004\bW\u00102R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00100\u001a\u0004\bX\u00102R\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010Y\u001a\u0004\bZ\u0010[R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\b\\\u00102¨\u0006^"}, d2 = {"Lcom/avito/android/remote/model/FavoriteAdvert;", "Landroid/os/Parcelable;", "", "id", "categoryId", SearchParamsConverterKt.LOCATION_ID, SearchParamsConverterKt.METRO_ID, SearchParamsConverterKt.DIRECTION_ID, SearchParamsConverterKt.DISTRICT_ID, "", CrashHianalyticsData.TIME, "title", "Lcom/avito/android/remote/model/AdvertSeller;", "seller", "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "Lcom/avito/android/remote/model/AdvertImage;", "image", "shopTitle", "userType", "", "services", AddressParameter.TYPE, "Lcom/avito/android/remote/model/AdvertPrice;", "price", "status", "note", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "expired", "currentPrice", "previousPrice", "location", "Lcom/avito/android/remote/model/FavoriteAdvert$Delivery;", NotificationsSettings.Section.SECTION_DELIVERY, "statusDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lcom/avito/android/remote/model/AdvertSeller;Lcom/avito/android/remote/model/Coordinates;Lcom/avito/android/remote/model/AdvertImage;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertPrice;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/FavoriteAdvert$Delivery;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getCategoryId", "getLocationId", "getMetroId", "getDirectionId", "getDistrictId", "J", "getTime", "()J", "getTitle", "Lcom/avito/android/remote/model/AdvertSeller;", "getSeller", "()Lcom/avito/android/remote/model/AdvertSeller;", "Lcom/avito/android/remote/model/Coordinates;", "getCoordinates", "()Lcom/avito/android/remote/model/Coordinates;", "Lcom/avito/android/remote/model/AdvertImage;", "getImage", "()Lcom/avito/android/remote/model/AdvertImage;", "getShopTitle", "getUserType", "Ljava/util/List;", "getServices", "()Ljava/util/List;", "getAddress", "Lcom/avito/android/remote/model/AdvertPrice;", "getPrice", "()Lcom/avito/android/remote/model/AdvertPrice;", "getStatus", "getNote", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Boolean;", "getExpired", "()Ljava/lang/Boolean;", "getCurrentPrice", "getPreviousPrice", "getLocation", "Lcom/avito/android/remote/model/FavoriteAdvert$Delivery;", "getDelivery", "()Lcom/avito/android/remote/model/FavoriteAdvert$Delivery;", "getStatusDescription", "Delivery", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FavoriteAdvert implements Parcelable {

    @k
    public static final Parcelable.Creator<FavoriteAdvert> CREATOR = new Creator();

    @c(AddressParameter.TYPE)
    @l
    private final String address;

    @c("categoryId")
    @k
    private final String categoryId;

    @c("coords")
    @l
    private final Coordinates coordinates;

    @c("currentPrice")
    @l
    private final String currentPrice;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink deepLink;

    @c(NotificationsSettings.Section.SECTION_DELIVERY)
    @l
    private final Delivery delivery;

    @c(SearchParamsConverterKt.DIRECTION_ID)
    @l
    private final String directionId;

    @c(SearchParamsConverterKt.DISTRICT_ID)
    @l
    private final String districtId;

    @c("expired")
    @l
    private final Boolean expired;

    @c("id")
    @k
    private final String id;

    @c("images")
    @l
    private final AdvertImage image;

    @c("location")
    @l
    private final String location;

    @c(SearchParamsConverterKt.LOCATION_ID)
    @k
    private final String locationId;

    @c(SearchParamsConverterKt.METRO_ID)
    @l
    private final String metroId;

    @c("note")
    @l
    private final String note;

    @c("previousPrice")
    @l
    private final String previousPrice;

    @c("price")
    @l
    private final AdvertPrice price;

    @c("seller")
    @l
    private final AdvertSeller seller;

    @c("services")
    @l
    private final List<String> services;

    @c("shopTitle")
    @l
    private final String shopTitle;

    @c("status")
    @k
    private final String status;

    @c("statusDescription")
    @l
    private final String statusDescription;

    @c(CrashHianalyticsData.TIME)
    private final long time;

    @c("title")
    @k
    private final String title;

    @c("userType")
    @k
    private final String userType;

    /* compiled from: FavoriteAdvert.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavoriteAdvert> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoriteAdvert createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            long j12 = parcel.readLong();
            String string7 = parcel.readString();
            AdvertSeller advertSeller = (AdvertSeller) parcel.readParcelable(FavoriteAdvert.class.getClassLoader());
            Coordinates coordinates = (Coordinates) parcel.readParcelable(FavoriteAdvert.class.getClassLoader());
            AdvertImage advertImage = (AdvertImage) parcel.readParcelable(FavoriteAdvert.class.getClassLoader());
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string10 = parcel.readString();
            AdvertPrice advertPrice = (AdvertPrice) parcel.readParcelable(FavoriteAdvert.class.getClassLoader());
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(FavoriteAdvert.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FavoriteAdvert(string, string2, string3, string4, string5, string6, j12, string7, advertSeller, coordinates, advertImage, string8, string9, arrayListCreateStringArrayList, string10, advertPrice, string11, string12, deepLink, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Delivery.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoriteAdvert[] newArray(int i12) {
            return new FavoriteAdvert[i12];
        }
    }

    /* compiled from: FavoriteAdvert.kt */
    @d
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/FavoriteAdvert$Delivery;", "Landroid/os/Parcelable;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Delivery implements Parcelable {

        @k
        public static final Parcelable.Creator<Delivery> CREATOR = new Creator();

        /* compiled from: FavoriteAdvert.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Delivery> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Delivery createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return new Delivery();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Delivery[] newArray(int i12) {
                return new Delivery[i12];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    public FavoriteAdvert(@k String str, @k String str2, @k String str3, @l String str4, @l String str5, @l String str6, long j12, @k String str7, @l AdvertSeller advertSeller, @l Coordinates coordinates, @l AdvertImage advertImage, @l String str8, @k String str9, @l List<String> list, @l String str10, @l AdvertPrice advertPrice, @k String str11, @l String str12, @l DeepLink deepLink, @l Boolean bool, @l String str13, @l String str14, @l String str15, @l Delivery delivery, @l String str16) {
        this.id = str;
        this.categoryId = str2;
        this.locationId = str3;
        this.metroId = str4;
        this.directionId = str5;
        this.districtId = str6;
        this.time = j12;
        this.title = str7;
        this.seller = advertSeller;
        this.coordinates = coordinates;
        this.image = advertImage;
        this.shopTitle = str8;
        this.userType = str9;
        this.services = list;
        this.address = str10;
        this.price = advertPrice;
        this.status = str11;
        this.note = str12;
        this.deepLink = deepLink;
        this.expired = bool;
        this.currentPrice = str13;
        this.previousPrice = str14;
        this.location = str15;
        this.delivery = delivery;
        this.statusDescription = str16;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getAddress() {
        return this.address;
    }

    @k
    public final String getCategoryId() {
        return this.categoryId;
    }

    @l
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @l
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final Delivery getDelivery() {
        return this.delivery;
    }

    @l
    public final String getDirectionId() {
        return this.directionId;
    }

    @l
    public final String getDistrictId() {
        return this.districtId;
    }

    @l
    public final Boolean getExpired() {
        return this.expired;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final AdvertImage getImage() {
        return this.image;
    }

    @l
    public final String getLocation() {
        return this.location;
    }

    @k
    public final String getLocationId() {
        return this.locationId;
    }

    @l
    public final String getMetroId() {
        return this.metroId;
    }

    @l
    public final String getNote() {
        return this.note;
    }

    @l
    public final String getPreviousPrice() {
        return this.previousPrice;
    }

    @l
    public final AdvertPrice getPrice() {
        return this.price;
    }

    @l
    public final AdvertSeller getSeller() {
        return this.seller;
    }

    @l
    public final List<String> getServices() {
        return this.services;
    }

    @l
    public final String getShopTitle() {
        return this.shopTitle;
    }

    @k
    public final String getStatus() {
        return this.status;
    }

    @l
    public final String getStatusDescription() {
        return this.statusDescription;
    }

    public final long getTime() {
        return this.time;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final String getUserType() {
        return this.userType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.categoryId);
        parcel.writeString(this.locationId);
        parcel.writeString(this.metroId);
        parcel.writeString(this.directionId);
        parcel.writeString(this.districtId);
        parcel.writeLong(this.time);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.seller, flags);
        parcel.writeParcelable(this.coordinates, flags);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.shopTitle);
        parcel.writeString(this.userType);
        parcel.writeStringList(this.services);
        parcel.writeString(this.address);
        parcel.writeParcelable(this.price, flags);
        parcel.writeString(this.status);
        parcel.writeString(this.note);
        parcel.writeParcelable(this.deepLink, flags);
        Boolean bool = this.expired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.currentPrice);
        parcel.writeString(this.previousPrice);
        parcel.writeString(this.location);
        Delivery delivery = this.delivery;
        if (delivery == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            delivery.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.statusDescription);
    }
}
