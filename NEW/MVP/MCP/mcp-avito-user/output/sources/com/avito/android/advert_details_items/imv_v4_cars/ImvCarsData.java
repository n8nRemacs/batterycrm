package com.avito.android.advert_details_items.imv_v4_cars;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.PriceDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsV4Item.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/imv_v4_cars/ImvCarsData;", "Landroid/os/Parcelable;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ImvCarsData implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ImvCarsData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f84829b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f84830c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f84831d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final PriceDetails f84832e;

    /* compiled from: ImvCarsV4Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsData> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsData createFromParcel(Parcel parcel) {
            return new ImvCarsData(parcel.readString(), parcel.readString(), parcel.readString(), (PriceDetails) parcel.readParcelable(ImvCarsData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsData[] newArray(int i12) {
            return new ImvCarsData[i12];
        }
    }

    public ImvCarsData(@l String str, @l String str2, @l String str3, @l PriceDetails priceDetails) {
        this.f84829b = str;
        this.f84830c = str2;
        this.f84831d = str3;
        this.f84832e = priceDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvCarsData)) {
            return false;
        }
        ImvCarsData imvCarsData = (ImvCarsData) obj;
        return L.f(this.f84829b, imvCarsData.f84829b) && L.f(this.f84830c, imvCarsData.f84830c) && L.f(this.f84831d, imvCarsData.f84831d) && L.f(this.f84832e, imvCarsData.f84832e);
    }

    public final int hashCode() {
        String str = this.f84829b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f84830c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f84831d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PriceDetails priceDetails = this.f84832e;
        return iHashCode3 + (priceDetails != null ? priceDetails.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ImvCarsData(title=" + this.f84829b + ", disclaimer=" + this.f84830c + ", description=" + this.f84831d + ", detailsLink=" + this.f84832e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f84829b);
        parcel.writeString(this.f84830c);
        parcel.writeString(this.f84831d);
        parcel.writeParcelable(this.f84832e, i12);
    }
}
