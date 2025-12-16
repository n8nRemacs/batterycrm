package com.avito.android.delivery_location_suggest.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: DeliveryAddressSelectDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_location_suggest/deeplink/DeliveryAddressSelectDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class DeliveryAddressSelectDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<DeliveryAddressSelectDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f135047b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f135048c;

    /* compiled from: DeliveryAddressSelectDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryAddressSelectDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryAddressSelectDeeplink createFromParcel(Parcel parcel) {
            return new DeliveryAddressSelectDeeplink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryAddressSelectDeeplink[] newArray(int i12) {
            return new DeliveryAddressSelectDeeplink[i12];
        }
    }

    public DeliveryAddressSelectDeeplink(@l String str, @l String str2) {
        this.f135047b = str;
        this.f135048c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f135047b);
        parcel.writeString(this.f135048c);
    }
}
