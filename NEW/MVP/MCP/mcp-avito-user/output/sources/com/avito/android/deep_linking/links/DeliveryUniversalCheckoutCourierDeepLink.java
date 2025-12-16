package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ParametrizedEvent;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: DeliveryUniversalCheckoutCourierDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DeliveryUniversalCheckoutCourierDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class DeliveryUniversalCheckoutCourierDeepLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DeliveryUniversalCheckoutCourierDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133202b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133203c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f133204d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133205e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f133206f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f133207g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f133208h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final ParametrizedEvent f133209i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f133210j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f133211k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f133212l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Double f133213m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final Double f133214n;

    /* compiled from: DeliveryUniversalCheckoutCourierDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryUniversalCheckoutCourierDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryUniversalCheckoutCourierDeepLink createFromParcel(Parcel parcel) {
            return new DeliveryUniversalCheckoutCourierDeepLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ParametrizedEvent.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryUniversalCheckoutCourierDeepLink[] newArray(int i12) {
            return new DeliveryUniversalCheckoutCourierDeepLink[i12];
        }
    }

    public DeliveryUniversalCheckoutCourierDeepLink(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l ParametrizedEvent parametrizedEvent, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10, @Y61.l Double d12, @Y61.l Double d13) {
        this.f133202b = str;
        this.f133203c = str2;
        this.f133204d = str3;
        this.f133205e = str4;
        this.f133206f = str5;
        this.f133207g = str6;
        this.f133208h = str7;
        this.f133209i = parametrizedEvent;
        this.f133210j = str8;
        this.f133211k = str9;
        this.f133212l = str10;
        this.f133213m = d12;
        this.f133214n = d13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUniversalCheckoutCourierDeepLink)) {
            return false;
        }
        DeliveryUniversalCheckoutCourierDeepLink deliveryUniversalCheckoutCourierDeepLink = (DeliveryUniversalCheckoutCourierDeepLink) obj;
        return kotlin.jvm.internal.L.f(this.f133202b, deliveryUniversalCheckoutCourierDeepLink.f133202b) && kotlin.jvm.internal.L.f(this.f133203c, deliveryUniversalCheckoutCourierDeepLink.f133203c) && kotlin.jvm.internal.L.f(this.f133204d, deliveryUniversalCheckoutCourierDeepLink.f133204d) && kotlin.jvm.internal.L.f(this.f133205e, deliveryUniversalCheckoutCourierDeepLink.f133205e) && kotlin.jvm.internal.L.f(this.f133206f, deliveryUniversalCheckoutCourierDeepLink.f133206f) && kotlin.jvm.internal.L.f(this.f133207g, deliveryUniversalCheckoutCourierDeepLink.f133207g) && kotlin.jvm.internal.L.f(this.f133208h, deliveryUniversalCheckoutCourierDeepLink.f133208h) && kotlin.jvm.internal.L.f(this.f133209i, deliveryUniversalCheckoutCourierDeepLink.f133209i) && kotlin.jvm.internal.L.f(this.f133210j, deliveryUniversalCheckoutCourierDeepLink.f133210j) && kotlin.jvm.internal.L.f(this.f133211k, deliveryUniversalCheckoutCourierDeepLink.f133211k) && kotlin.jvm.internal.L.f(this.f133212l, deliveryUniversalCheckoutCourierDeepLink.f133212l) && kotlin.jvm.internal.L.f(this.f133213m, deliveryUniversalCheckoutCourierDeepLink.f133213m) && kotlin.jvm.internal.L.f(this.f133214n, deliveryUniversalCheckoutCourierDeepLink.f133214n);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f133202b.hashCode() * 31, 31, this.f133203c), 31, this.f133204d);
        String str = this.f133205e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133206f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133207g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133208h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.f133209i;
        int iHashCode5 = (iHashCode4 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        String str5 = this.f133210j;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133211k;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133212l;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d12 = this.f133213m;
        int iHashCode9 = (iHashCode8 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f133214n;
        return iHashCode9 + (d13 != null ? d13.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryUniversalCheckoutCourierDeepLink(deliveryType=");
        sb2.append(this.f133202b);
        sb2.append(", providerKey=");
        sb2.append(this.f133203c);
        sb2.append(", address=");
        sb2.append(this.f133204d);
        sb2.append(", itemId=");
        sb2.append(this.f133205e);
        sb2.append(", addressDetails=");
        sb2.append(this.f133206f);
        sb2.append(", checkoutViewMode=");
        sb2.append(this.f133207g);
        sb2.append(", style=");
        sb2.append(this.f133208h);
        sb2.append(", contactEvent=");
        sb2.append(this.f133209i);
        sb2.append(", context=");
        sb2.append(this.f133210j);
        sb2.append(", courierDeliveryStartDate=");
        sb2.append(this.f133211k);
        sb2.append(", courierDeliveryEndDate=");
        sb2.append(this.f133212l);
        sb2.append(", deliveryLatitude=");
        sb2.append(this.f133213m);
        sb2.append(", deliveryLongitude=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f133214n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133202b);
        parcel.writeString(this.f133203c);
        parcel.writeString(this.f133204d);
        parcel.writeString(this.f133205e);
        parcel.writeString(this.f133206f);
        parcel.writeString(this.f133207g);
        parcel.writeString(this.f133208h);
        ParametrizedEvent parametrizedEvent = this.f133209i;
        if (parametrizedEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parametrizedEvent.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f133210j);
        parcel.writeString(this.f133211k);
        parcel.writeString(this.f133212l);
        Double d12 = this.f133213m;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        Double d13 = this.f133214n;
        if (d13 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d13);
        }
    }
}
