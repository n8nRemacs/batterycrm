package com.avito.android.safedeal_checkout.delivery_universal_checkout.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.remote.model.ParametrizedEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryUniversalCheckoutData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/model/CheckoutCourierData;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/model/DeliveryUniversalCheckoutData;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutCourierData extends DeliveryUniversalCheckoutData {

    @k
    public static final Parcelable.Creator<CheckoutCourierData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f257068b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f257069c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f257070d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f257071e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f257072f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f257073g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f257074h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ParametrizedEvent f257075i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f257076j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f257077k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final String f257078l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Double f257079m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Double f257080n;

    /* compiled from: DeliveryUniversalCheckoutData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckoutCourierData> {
        @Override // android.os.Parcelable.Creator
        public final CheckoutCourierData createFromParcel(Parcel parcel) {
            return new CheckoutCourierData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ParametrizedEvent) parcel.readParcelable(CheckoutCourierData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckoutCourierData[] newArray(int i12) {
            return new CheckoutCourierData[i12];
        }
    }

    public CheckoutCourierData(@k String str, @k String str2, @k String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l ParametrizedEvent parametrizedEvent, @l String str8, @l String str9, @l String str10, @l Double d12, @l Double d13) {
        super(null);
        this.f257068b = str;
        this.f257069c = str2;
        this.f257070d = str3;
        this.f257071e = str4;
        this.f257072f = str5;
        this.f257073g = str6;
        this.f257074h = str7;
        this.f257075i = parametrizedEvent;
        this.f257076j = str8;
        this.f257077k = str9;
        this.f257078l = str10;
        this.f257079m = d12;
        this.f257080n = d13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutCourierData)) {
            return false;
        }
        CheckoutCourierData checkoutCourierData = (CheckoutCourierData) obj;
        return L.f(this.f257068b, checkoutCourierData.f257068b) && L.f(this.f257069c, checkoutCourierData.f257069c) && L.f(this.f257070d, checkoutCourierData.f257070d) && L.f(this.f257071e, checkoutCourierData.f257071e) && L.f(this.f257072f, checkoutCourierData.f257072f) && L.f(this.f257073g, checkoutCourierData.f257073g) && L.f(this.f257074h, checkoutCourierData.f257074h) && L.f(this.f257075i, checkoutCourierData.f257075i) && L.f(this.f257076j, checkoutCourierData.f257076j) && L.f(this.f257077k, checkoutCourierData.f257077k) && L.f(this.f257078l, checkoutCourierData.f257078l) && L.f(this.f257079m, checkoutCourierData.f257079m) && L.f(this.f257080n, checkoutCourierData.f257080n);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f257068b.hashCode() * 31, 31, this.f257069c), 31, this.f257070d);
        String str = this.f257071e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f257072f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f257073g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f257074h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.f257075i;
        int iHashCode5 = (iHashCode4 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        String str5 = this.f257076j;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f257077k;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f257078l;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d12 = this.f257079m;
        int iHashCode9 = (iHashCode8 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f257080n;
        return iHashCode9 + (d13 != null ? d13.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckoutCourierData(deliveryType=");
        sb2.append(this.f257068b);
        sb2.append(", providerKey=");
        sb2.append(this.f257069c);
        sb2.append(", address=");
        sb2.append(this.f257070d);
        sb2.append(", itemId=");
        sb2.append(this.f257071e);
        sb2.append(", addressDetails=");
        sb2.append(this.f257072f);
        sb2.append(", checkoutViewMode=");
        sb2.append(this.f257073g);
        sb2.append(", style=");
        sb2.append(this.f257074h);
        sb2.append(", contactEvent=");
        sb2.append(this.f257075i);
        sb2.append(", context=");
        sb2.append(this.f257076j);
        sb2.append(", courierDeliveryStartDate=");
        sb2.append(this.f257077k);
        sb2.append(", courierDeliveryEndDate=");
        sb2.append(this.f257078l);
        sb2.append(", deliveryLatitude=");
        sb2.append(this.f257079m);
        sb2.append(", deliveryLongitude=");
        return b.h(sb2, this.f257080n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f257068b);
        parcel.writeString(this.f257069c);
        parcel.writeString(this.f257070d);
        parcel.writeString(this.f257071e);
        parcel.writeString(this.f257072f);
        parcel.writeString(this.f257073g);
        parcel.writeString(this.f257074h);
        parcel.writeParcelable(this.f257075i, i12);
        parcel.writeString(this.f257076j);
        parcel.writeString(this.f257077k);
        parcel.writeString(this.f257078l);
        Double d12 = this.f257079m;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        Double d13 = this.f257080n;
        if (d13 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d13);
        }
    }
}
