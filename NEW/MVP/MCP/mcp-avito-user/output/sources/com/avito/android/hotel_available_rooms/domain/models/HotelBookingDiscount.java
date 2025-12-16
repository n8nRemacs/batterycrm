package com.avito.android.hotel_available_rooms.domain.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelRoom.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/domain/models/HotelBookingDiscount;", "Landroid/os/Parcelable;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingDiscount implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelBookingDiscount> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f162773b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f162774c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalColor f162775d;

    /* compiled from: HotelRoom.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingDiscount> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingDiscount createFromParcel(Parcel parcel) {
            return new HotelBookingDiscount((AttributedText) parcel.readParcelable(HotelBookingDiscount.class.getClassLoader()), (AttributedText) parcel.readParcelable(HotelBookingDiscount.class.getClassLoader()), (UniversalColor) parcel.readParcelable(HotelBookingDiscount.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingDiscount[] newArray(int i12) {
            return new HotelBookingDiscount[i12];
        }
    }

    public HotelBookingDiscount(@k AttributedText attributedText, @l AttributedText attributedText2, @l UniversalColor universalColor) {
        this.f162773b = attributedText;
        this.f162774c = attributedText2;
        this.f162775d = universalColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelBookingDiscount)) {
            return false;
        }
        HotelBookingDiscount hotelBookingDiscount = (HotelBookingDiscount) obj;
        return L.f(this.f162773b, hotelBookingDiscount.f162773b) && L.f(this.f162774c, hotelBookingDiscount.f162774c) && L.f(this.f162775d, hotelBookingDiscount.f162775d);
    }

    public final int hashCode() {
        int iHashCode = this.f162773b.hashCode() * 31;
        AttributedText attributedText = this.f162774c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalColor universalColor = this.f162775d;
        return iHashCode2 + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelBookingDiscount(originalPrice=");
        sb2.append(this.f162773b);
        sb2.append(", percent=");
        sb2.append(this.f162774c);
        sb2.append(", percentBackgroundColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f162775d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f162773b, i12);
        parcel.writeParcelable(this.f162774c, i12);
        parcel.writeParcelable(this.f162775d, i12);
    }
}
