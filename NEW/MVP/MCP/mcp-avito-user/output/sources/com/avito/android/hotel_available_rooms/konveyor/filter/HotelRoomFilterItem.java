package com.avito.android.hotel_available_rooms.konveyor.filter;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelRoomFilterItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/filter/HotelRoomFilterItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelRoomFilterItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<HotelRoomFilterItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f162909b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f162910c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f162911d;

    /* compiled from: HotelRoomFilterItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelRoomFilterItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelRoomFilterItem createFromParcel(Parcel parcel) {
            return new HotelRoomFilterItem(parcel.readString(), (PrintableText) parcel.readParcelable(HotelRoomFilterItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(HotelRoomFilterItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelRoomFilterItem[] newArray(int i12) {
            return new HotelRoomFilterItem[i12];
        }
    }

    public HotelRoomFilterItem(@k String str, @k PrintableText printableText, @k DeepLink deepLink) {
        this.f162909b = str;
        this.f162910c = printableText;
        this.f162911d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelRoomFilterItem)) {
            return false;
        }
        HotelRoomFilterItem hotelRoomFilterItem = (HotelRoomFilterItem) obj;
        return L.f(this.f162909b, hotelRoomFilterItem.f162909b) && L.f(this.f162910c, hotelRoomFilterItem.f162910c) && L.f(this.f162911d, hotelRoomFilterItem.f162911d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123950b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF137415b() {
        return this.f162909b;
    }

    public final int hashCode() {
        return this.f162911d.hashCode() + com.avito.android.actions_sheet.a.f(this.f162910c, this.f162909b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelRoomFilterItem(stringId=");
        sb2.append(this.f162909b);
        sb2.append(", text=");
        sb2.append(this.f162910c);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f162911d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f162909b);
        parcel.writeParcelable(this.f162910c, i12);
        parcel.writeParcelable(this.f162911d, i12);
    }
}
