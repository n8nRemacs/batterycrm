package com.avito.android.advert.item.parking;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.RouteButtons;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsParkingAddressItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/parking/ParkingAddressShowOnMapParams;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ParkingAddressShowOnMapParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ParkingAddressShowOnMapParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f78144b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Coordinates f78145c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f78146d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final RouteButtons f78147e;

    /* compiled from: AdvertDetailsParkingAddressItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ParkingAddressShowOnMapParams> {
        @Override // android.os.Parcelable.Creator
        public final ParkingAddressShowOnMapParams createFromParcel(Parcel parcel) {
            return new ParkingAddressShowOnMapParams(parcel.readString(), (Coordinates) parcel.readParcelable(ParkingAddressShowOnMapParams.class.getClassLoader()), parcel.readString(), (RouteButtons) parcel.readParcelable(ParkingAddressShowOnMapParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ParkingAddressShowOnMapParams[] newArray(int i12) {
            return new ParkingAddressShowOnMapParams[i12];
        }
    }

    public ParkingAddressShowOnMapParams(@Y61.k String str, @Y61.k Coordinates coordinates, @Y61.k String str2, @l RouteButtons routeButtons) {
        this.f78144b = str;
        this.f78145c = coordinates;
        this.f78146d = str2;
        this.f78147e = routeButtons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParkingAddressShowOnMapParams)) {
            return false;
        }
        ParkingAddressShowOnMapParams parkingAddressShowOnMapParams = (ParkingAddressShowOnMapParams) obj;
        return L.f(this.f78144b, parkingAddressShowOnMapParams.f78144b) && L.f(this.f78145c, parkingAddressShowOnMapParams.f78145c) && L.f(this.f78146d, parkingAddressShowOnMapParams.f78146d) && L.f(this.f78147e, parkingAddressShowOnMapParams.f78147e);
    }

    public final int hashCode() {
        int iD2 = H.d((this.f78145c.hashCode() + (this.f78144b.hashCode() * 31)) * 31, 31, this.f78146d);
        RouteButtons routeButtons = this.f78147e;
        return iD2 + (routeButtons == null ? 0 : routeButtons.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ParkingAddressShowOnMapParams(title=" + this.f78144b + ", coords=" + this.f78145c + ", address=" + this.f78146d + ", routeButtons=" + this.f78147e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f78144b);
        parcel.writeParcelable(this.f78145c, i12);
        parcel.writeString(this.f78146d);
        parcel.writeParcelable(this.f78147e, i12);
    }

    public /* synthetic */ ParkingAddressShowOnMapParams(String str, Coordinates coordinates, String str2, RouteButtons routeButtons, int i12, C42822w c42822w) {
        this(str, coordinates, str2, (i12 & 8) != 0 ? null : routeButtons);
    }
}
