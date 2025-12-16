package com.avito.android.advert.item.hotel.hotel_offer.konveyor.shimmer;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsHotelShimmerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/shimmer/AdvertDetailsHotelShimmerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsHotelShimmerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AdvertDetailsHotelShimmerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f76179b;

    /* compiled from: AdvertDetailsHotelShimmerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsHotelShimmerItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsHotelShimmerItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsHotelShimmerItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsHotelShimmerItem[] newArray(int i12) {
            return new AdvertDetailsHotelShimmerItem[i12];
        }
    }

    public AdvertDetailsHotelShimmerItem(@k String str) {
        this.f76179b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdvertDetailsHotelShimmerItem) && L.f(this.f76179b, ((AdvertDetailsHotelShimmerItem) obj).f76179b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74643b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF74644c() {
        return this.f76179b;
    }

    public final int hashCode() {
        return this.f76179b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("AdvertDetailsHotelShimmerItem(stringId="), this.f76179b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f76179b);
    }
}
