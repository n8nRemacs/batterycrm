package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ParametrizedEvent;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: DeliveryUniversalCheckoutPvzDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DeliveryUniversalCheckoutPvzDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class DeliveryUniversalCheckoutPvzDeepLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DeliveryUniversalCheckoutPvzDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133216b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133217c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f133218d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133219e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f133220f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f133221g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f133222h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final ParametrizedEvent f133223i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f133224j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Double f133225k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Double f133226l;

    /* compiled from: DeliveryUniversalCheckoutPvzDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryUniversalCheckoutPvzDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryUniversalCheckoutPvzDeepLink createFromParcel(Parcel parcel) {
            return new DeliveryUniversalCheckoutPvzDeepLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ParametrizedEvent.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryUniversalCheckoutPvzDeepLink[] newArray(int i12) {
            return new DeliveryUniversalCheckoutPvzDeepLink[i12];
        }
    }

    public DeliveryUniversalCheckoutPvzDeepLink(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l ParametrizedEvent parametrizedEvent, @Y61.l String str8, @Y61.l Double d12, @Y61.l Double d13) {
        this.f133216b = str;
        this.f133217c = str2;
        this.f133218d = str3;
        this.f133219e = str4;
        this.f133220f = str5;
        this.f133221g = str6;
        this.f133222h = str7;
        this.f133223i = parametrizedEvent;
        this.f133224j = str8;
        this.f133225k = d12;
        this.f133226l = d13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUniversalCheckoutPvzDeepLink)) {
            return false;
        }
        DeliveryUniversalCheckoutPvzDeepLink deliveryUniversalCheckoutPvzDeepLink = (DeliveryUniversalCheckoutPvzDeepLink) obj;
        return kotlin.jvm.internal.L.f(this.f133216b, deliveryUniversalCheckoutPvzDeepLink.f133216b) && kotlin.jvm.internal.L.f(this.f133217c, deliveryUniversalCheckoutPvzDeepLink.f133217c) && kotlin.jvm.internal.L.f(this.f133218d, deliveryUniversalCheckoutPvzDeepLink.f133218d) && kotlin.jvm.internal.L.f(this.f133219e, deliveryUniversalCheckoutPvzDeepLink.f133219e) && kotlin.jvm.internal.L.f(this.f133220f, deliveryUniversalCheckoutPvzDeepLink.f133220f) && kotlin.jvm.internal.L.f(this.f133221g, deliveryUniversalCheckoutPvzDeepLink.f133221g) && kotlin.jvm.internal.L.f(this.f133222h, deliveryUniversalCheckoutPvzDeepLink.f133222h) && kotlin.jvm.internal.L.f(this.f133223i, deliveryUniversalCheckoutPvzDeepLink.f133223i) && kotlin.jvm.internal.L.f(this.f133224j, deliveryUniversalCheckoutPvzDeepLink.f133224j) && kotlin.jvm.internal.L.f(this.f133225k, deliveryUniversalCheckoutPvzDeepLink.f133225k) && kotlin.jvm.internal.L.f(this.f133226l, deliveryUniversalCheckoutPvzDeepLink.f133226l);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f133216b.hashCode() * 31, 31, this.f133217c), 31, this.f133218d);
        String str = this.f133219e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133220f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133221g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133222h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.f133223i;
        int iHashCode5 = (iHashCode4 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        String str5 = this.f133224j;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d12 = this.f133225k;
        int iHashCode7 = (iHashCode6 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f133226l;
        return iHashCode7 + (d13 != null ? d13.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryUniversalCheckoutPvzDeepLink(deliveryType=");
        sb2.append(this.f133216b);
        sb2.append(", fiasGuid=");
        sb2.append(this.f133217c);
        sb2.append(", serviceId=");
        sb2.append(this.f133218d);
        sb2.append(", itemId=");
        sb2.append(this.f133219e);
        sb2.append(", promocode=");
        sb2.append(this.f133220f);
        sb2.append(", checkoutViewMode=");
        sb2.append(this.f133221g);
        sb2.append(", style=");
        sb2.append(this.f133222h);
        sb2.append(", contactEvent=");
        sb2.append(this.f133223i);
        sb2.append(", context=");
        sb2.append(this.f133224j);
        sb2.append(", deliveryLatitude=");
        sb2.append(this.f133225k);
        sb2.append(", deliveryLongitude=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f133226l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133216b);
        parcel.writeString(this.f133217c);
        parcel.writeString(this.f133218d);
        parcel.writeString(this.f133219e);
        parcel.writeString(this.f133220f);
        parcel.writeString(this.f133221g);
        parcel.writeString(this.f133222h);
        ParametrizedEvent parametrizedEvent = this.f133223i;
        if (parametrizedEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parametrizedEvent.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f133224j);
        Double d12 = this.f133225k;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        Double d13 = this.f133226l;
        if (d13 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d13);
        }
    }
}
