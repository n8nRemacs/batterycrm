package com.avito.android.delivery_tarifikator.presentation.region_screen;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RegionScreenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/RegionScreenParams;", "Landroid/os/Parcelable;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RegionScreenParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RegionScreenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f135742b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DeliveryTarifikatorParams f135743c;

    /* compiled from: RegionScreenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RegionScreenParams> {
        @Override // android.os.Parcelable.Creator
        public final RegionScreenParams createFromParcel(Parcel parcel) {
            return new RegionScreenParams(parcel.readString(), (DeliveryTarifikatorParams) parcel.readParcelable(RegionScreenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RegionScreenParams[] newArray(int i12) {
            return new RegionScreenParams[i12];
        }
    }

    public RegionScreenParams(@Y61.k String str, @Y61.k DeliveryTarifikatorParams deliveryTarifikatorParams) {
        this.f135742b = str;
        this.f135743c = deliveryTarifikatorParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionScreenParams)) {
            return false;
        }
        RegionScreenParams regionScreenParams = (RegionScreenParams) obj;
        return L.f(this.f135742b, regionScreenParams.f135742b) && L.f(this.f135743c, regionScreenParams.f135743c);
    }

    public final int hashCode() {
        return this.f135743c.hashCode() + (this.f135742b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "RegionScreenParams(regionName=" + this.f135742b + ", tarifikatorParams=" + this.f135743c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f135742b);
        parcel.writeParcelable(this.f135743c, i12);
    }
}
