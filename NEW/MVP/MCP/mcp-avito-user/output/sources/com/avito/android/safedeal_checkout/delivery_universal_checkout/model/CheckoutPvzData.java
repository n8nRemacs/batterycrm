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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/model/CheckoutPvzData;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/model/DeliveryUniversalCheckoutData;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutPvzData extends DeliveryUniversalCheckoutData {

    @k
    public static final Parcelable.Creator<CheckoutPvzData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f257082b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f257083c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f257084d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f257085e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f257086f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f257087g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f257088h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ParametrizedEvent f257089i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f257090j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Double f257091k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Double f257092l;

    /* compiled from: DeliveryUniversalCheckoutData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckoutPvzData> {
        @Override // android.os.Parcelable.Creator
        public final CheckoutPvzData createFromParcel(Parcel parcel) {
            return new CheckoutPvzData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ParametrizedEvent) parcel.readParcelable(CheckoutPvzData.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckoutPvzData[] newArray(int i12) {
            return new CheckoutPvzData[i12];
        }
    }

    public CheckoutPvzData(@k String str, @k String str2, @k String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l ParametrizedEvent parametrizedEvent, @l String str8, @l Double d12, @l Double d13) {
        super(null);
        this.f257082b = str;
        this.f257083c = str2;
        this.f257084d = str3;
        this.f257085e = str4;
        this.f257086f = str5;
        this.f257087g = str6;
        this.f257088h = str7;
        this.f257089i = parametrizedEvent;
        this.f257090j = str8;
        this.f257091k = d12;
        this.f257092l = d13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutPvzData)) {
            return false;
        }
        CheckoutPvzData checkoutPvzData = (CheckoutPvzData) obj;
        return L.f(this.f257082b, checkoutPvzData.f257082b) && L.f(this.f257083c, checkoutPvzData.f257083c) && L.f(this.f257084d, checkoutPvzData.f257084d) && L.f(this.f257085e, checkoutPvzData.f257085e) && L.f(this.f257086f, checkoutPvzData.f257086f) && L.f(this.f257087g, checkoutPvzData.f257087g) && L.f(this.f257088h, checkoutPvzData.f257088h) && L.f(this.f257089i, checkoutPvzData.f257089i) && L.f(this.f257090j, checkoutPvzData.f257090j) && L.f(this.f257091k, checkoutPvzData.f257091k) && L.f(this.f257092l, checkoutPvzData.f257092l);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f257082b.hashCode() * 31, 31, this.f257083c), 31, this.f257084d);
        String str = this.f257085e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f257086f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f257087g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f257088h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.f257089i;
        int iHashCode5 = (iHashCode4 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        String str5 = this.f257090j;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d12 = this.f257091k;
        int iHashCode7 = (iHashCode6 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f257092l;
        return iHashCode7 + (d13 != null ? d13.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckoutPvzData(deliveryType=");
        sb2.append(this.f257082b);
        sb2.append(", fiasGuid=");
        sb2.append(this.f257083c);
        sb2.append(", serviceId=");
        sb2.append(this.f257084d);
        sb2.append(", itemId=");
        sb2.append(this.f257085e);
        sb2.append(", promocode=");
        sb2.append(this.f257086f);
        sb2.append(", checkoutViewMode=");
        sb2.append(this.f257087g);
        sb2.append(", style=");
        sb2.append(this.f257088h);
        sb2.append(", contactEvent=");
        sb2.append(this.f257089i);
        sb2.append(", context=");
        sb2.append(this.f257090j);
        sb2.append(", deliveryLatitude=");
        sb2.append(this.f257091k);
        sb2.append(", deliveryLongitude=");
        return b.h(sb2, this.f257092l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f257082b);
        parcel.writeString(this.f257083c);
        parcel.writeString(this.f257084d);
        parcel.writeString(this.f257085e);
        parcel.writeString(this.f257086f);
        parcel.writeString(this.f257087g);
        parcel.writeString(this.f257088h);
        parcel.writeParcelable(this.f257089i, i12);
        parcel.writeString(this.f257090j);
        Double d12 = this.f257091k;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        Double d13 = this.f257092l;
        if (d13 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d13);
        }
    }
}
