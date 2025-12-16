package com.avito.android.remote.model.geo_distance;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.colorspace.e;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsGeoDistance.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002*+B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance$MeasureOnClientData;", "measureOnClientData", "Lcom/avito/android/deep_linking/links/DeepLink;", "hintDeeplink", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance$MeasureOnClientData;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance$MeasureOnClientData;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance$MeasureOnClientData;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedText", "Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance$MeasureOnClientData;", "getMeasureOnClientData", "Lcom/avito/android/deep_linking/links/DeepLink;", "getHintDeeplink", "MeasureOnClientData", "UserCoords", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertDetailsGeoDistance implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDetailsGeoDistance> CREATOR = new Creator();

    @c("attributedText")
    @l
    private final AttributedText attributedText;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink hintDeeplink;

    @c("measureOnClientData")
    @l
    private final MeasureOnClientData measureOnClientData;

    /* compiled from: AdvertDetailsGeoDistance.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertDetailsGeoDistance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsGeoDistance createFromParcel(@k Parcel parcel) {
            return new AdvertDetailsGeoDistance((AttributedText) parcel.readParcelable(AdvertDetailsGeoDistance.class.getClassLoader()), parcel.readInt() == 0 ? null : MeasureOnClientData.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(AdvertDetailsGeoDistance.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsGeoDistance[] newArray(int i12) {
            return new AdvertDetailsGeoDistance[i12];
        }
    }

    /* compiled from: AdvertDetailsGeoDistance.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance$MeasureOnClientData;", "Landroid/os/Parcelable;", "", "titlePrefix", "Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance$UserCoords;", "userCoords", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance$UserCoords;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance$UserCoords;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance$UserCoords;)Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance$MeasureOnClientData;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitlePrefix", "Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance$UserCoords;", "getUserCoords", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MeasureOnClientData implements Parcelable {

        @k
        public static final Parcelable.Creator<MeasureOnClientData> CREATOR = new Creator();

        @c("titlePrefix")
        @k
        private final String titlePrefix;

        @c("userCoords")
        @k
        private final UserCoords userCoords;

        /* compiled from: AdvertDetailsGeoDistance.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MeasureOnClientData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MeasureOnClientData createFromParcel(@k Parcel parcel) {
                return new MeasureOnClientData(parcel.readString(), UserCoords.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MeasureOnClientData[] newArray(int i12) {
                return new MeasureOnClientData[i12];
            }
        }

        public MeasureOnClientData(@k String str, @k UserCoords userCoords) {
            this.titlePrefix = str;
            this.userCoords = userCoords;
        }

        public static /* synthetic */ MeasureOnClientData copy$default(MeasureOnClientData measureOnClientData, String str, UserCoords userCoords, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = measureOnClientData.titlePrefix;
            }
            if ((i12 & 2) != 0) {
                userCoords = measureOnClientData.userCoords;
            }
            return measureOnClientData.copy(str, userCoords);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitlePrefix() {
            return this.titlePrefix;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UserCoords getUserCoords() {
            return this.userCoords;
        }

        @k
        public final MeasureOnClientData copy(@k String titlePrefix, @k UserCoords userCoords) {
            return new MeasureOnClientData(titlePrefix, userCoords);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MeasureOnClientData)) {
                return false;
            }
            MeasureOnClientData measureOnClientData = (MeasureOnClientData) other;
            return L.f(this.titlePrefix, measureOnClientData.titlePrefix) && L.f(this.userCoords, measureOnClientData.userCoords);
        }

        @k
        public final String getTitlePrefix() {
            return this.titlePrefix;
        }

        @k
        public final UserCoords getUserCoords() {
            return this.userCoords;
        }

        public int hashCode() {
            return this.userCoords.hashCode() + (this.titlePrefix.hashCode() * 31);
        }

        @k
        public String toString() {
            return "MeasureOnClientData(titlePrefix=" + this.titlePrefix + ", userCoords=" + this.userCoords + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.titlePrefix);
            this.userCoords.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: AdvertDetailsGeoDistance.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance$UserCoords;", "Landroid/os/Parcelable;", "", "lat", AddressParameter.Value.LNG, "<init>", "(DD)V", "component1", "()D", "component2", "copy", "(DD)Lcom/avito/android/remote/model/geo_distance/AdvertDetailsGeoDistance$UserCoords;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "D", "getLat", "getLng", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UserCoords implements Parcelable {

        @k
        public static final Parcelable.Creator<UserCoords> CREATOR = new Creator();

        @c("lat")
        private final double lat;

        @c(AddressParameter.Value.LNG)
        private final double lng;

        /* compiled from: AdvertDetailsGeoDistance.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UserCoords> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final UserCoords createFromParcel(@k Parcel parcel) {
                return new UserCoords(parcel.readDouble(), parcel.readDouble());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final UserCoords[] newArray(int i12) {
                return new UserCoords[i12];
            }
        }

        public UserCoords(double d12, double d13) {
            this.lat = d12;
            this.lng = d13;
        }

        public static /* synthetic */ UserCoords copy$default(UserCoords userCoords, double d12, double d13, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                d12 = userCoords.lat;
            }
            if ((i12 & 2) != 0) {
                d13 = userCoords.lng;
            }
            return userCoords.copy(d12, d13);
        }

        /* renamed from: component1, reason: from getter */
        public final double getLat() {
            return this.lat;
        }

        /* renamed from: component2, reason: from getter */
        public final double getLng() {
            return this.lng;
        }

        @k
        public final UserCoords copy(double lat, double lng) {
            return new UserCoords(lat, lng);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserCoords)) {
                return false;
            }
            UserCoords userCoords = (UserCoords) other;
            return Double.compare(this.lat, userCoords.lat) == 0 && Double.compare(this.lng, userCoords.lng) == 0;
        }

        public final double getLat() {
            return this.lat;
        }

        public final double getLng() {
            return this.lng;
        }

        public int hashCode() {
            return Double.hashCode(this.lng) + (Double.hashCode(this.lat) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("UserCoords(lat=");
            sb2.append(this.lat);
            sb2.append(", lng=");
            return e.o(sb2, this.lng, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeDouble(this.lat);
            parcel.writeDouble(this.lng);
        }
    }

    public AdvertDetailsGeoDistance(@l AttributedText attributedText, @l MeasureOnClientData measureOnClientData, @l DeepLink deepLink) {
        this.attributedText = attributedText;
        this.measureOnClientData = measureOnClientData;
        this.hintDeeplink = deepLink;
    }

    public static /* synthetic */ AdvertDetailsGeoDistance copy$default(AdvertDetailsGeoDistance advertDetailsGeoDistance, AttributedText attributedText, MeasureOnClientData measureOnClientData, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = advertDetailsGeoDistance.attributedText;
        }
        if ((i12 & 2) != 0) {
            measureOnClientData = advertDetailsGeoDistance.measureOnClientData;
        }
        if ((i12 & 4) != 0) {
            deepLink = advertDetailsGeoDistance.hintDeeplink;
        }
        return advertDetailsGeoDistance.copy(attributedText, measureOnClientData, deepLink);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getAttributedText() {
        return this.attributedText;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final MeasureOnClientData getMeasureOnClientData() {
        return this.measureOnClientData;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getHintDeeplink() {
        return this.hintDeeplink;
    }

    @k
    public final AdvertDetailsGeoDistance copy(@l AttributedText attributedText, @l MeasureOnClientData measureOnClientData, @l DeepLink hintDeeplink) {
        return new AdvertDetailsGeoDistance(attributedText, measureOnClientData, hintDeeplink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertDetailsGeoDistance)) {
            return false;
        }
        AdvertDetailsGeoDistance advertDetailsGeoDistance = (AdvertDetailsGeoDistance) other;
        return L.f(this.attributedText, advertDetailsGeoDistance.attributedText) && L.f(this.measureOnClientData, advertDetailsGeoDistance.measureOnClientData) && L.f(this.hintDeeplink, advertDetailsGeoDistance.hintDeeplink);
    }

    @l
    public final AttributedText getAttributedText() {
        return this.attributedText;
    }

    @l
    public final DeepLink getHintDeeplink() {
        return this.hintDeeplink;
    }

    @l
    public final MeasureOnClientData getMeasureOnClientData() {
        return this.measureOnClientData;
    }

    public int hashCode() {
        AttributedText attributedText = this.attributedText;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        MeasureOnClientData measureOnClientData = this.measureOnClientData;
        int iHashCode2 = (iHashCode + (measureOnClientData == null ? 0 : measureOnClientData.hashCode())) * 31;
        DeepLink deepLink = this.hintDeeplink;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsGeoDistance(attributedText=");
        sb2.append(this.attributedText);
        sb2.append(", measureOnClientData=");
        sb2.append(this.measureOnClientData);
        sb2.append(", hintDeeplink=");
        return a.v(sb2, this.hintDeeplink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.attributedText, flags);
        MeasureOnClientData measureOnClientData = this.measureOnClientData;
        if (measureOnClientData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            measureOnClientData.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.hintDeeplink, flags);
    }
}
