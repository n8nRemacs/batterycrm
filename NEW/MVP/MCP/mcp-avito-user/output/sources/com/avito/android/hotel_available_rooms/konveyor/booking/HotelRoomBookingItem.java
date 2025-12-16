package com.avito.android.hotel_available_rooms.konveyor.booking;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.hotel_available_rooms.domain.models.HotelBookingDiscount;
import com.avito.android.hotel_available_rooms.domain.models.HotelBookingInstallments;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelRoomBookingItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/booking/HotelRoomBookingItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelRoomBookingItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<HotelRoomBookingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f162850b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<String> f162851c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f162852d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f162853e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final HotelBookingInstallments f162854f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ButtonAction f162855g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final HotelBookingDiscount f162856h;

    /* compiled from: HotelRoomBookingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelRoomBookingItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelRoomBookingItem createFromParcel(Parcel parcel) {
            return new HotelRoomBookingItem(parcel.readString(), parcel.createStringArrayList(), (AttributedText) parcel.readParcelable(HotelRoomBookingItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(HotelRoomBookingItem.class.getClassLoader()), parcel.readInt() == 0 ? null : HotelBookingInstallments.CREATOR.createFromParcel(parcel), (ButtonAction) parcel.readParcelable(HotelRoomBookingItem.class.getClassLoader()), parcel.readInt() != 0 ? HotelBookingDiscount.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final HotelRoomBookingItem[] newArray(int i12) {
            return new HotelRoomBookingItem[i12];
        }
    }

    public HotelRoomBookingItem(@k String str, @l List<String> list, @l AttributedText attributedText, @l AttributedText attributedText2, @l HotelBookingInstallments hotelBookingInstallments, @k ButtonAction buttonAction, @l HotelBookingDiscount hotelBookingDiscount) {
        this.f162850b = str;
        this.f162851c = list;
        this.f162852d = attributedText;
        this.f162853e = attributedText2;
        this.f162854f = hotelBookingInstallments;
        this.f162855g = buttonAction;
        this.f162856h = hotelBookingDiscount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelRoomBookingItem)) {
            return false;
        }
        HotelRoomBookingItem hotelRoomBookingItem = (HotelRoomBookingItem) obj;
        return L.f(this.f162850b, hotelRoomBookingItem.f162850b) && L.f(this.f162851c, hotelRoomBookingItem.f162851c) && L.f(this.f162852d, hotelRoomBookingItem.f162852d) && L.f(this.f162853e, hotelRoomBookingItem.f162853e) && L.f(this.f162854f, hotelRoomBookingItem.f162854f) && L.f(this.f162855g, hotelRoomBookingItem.f162855g) && L.f(this.f162856h, hotelRoomBookingItem.f162856h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80137b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96790b() {
        return this.f162850b;
    }

    public final int hashCode() {
        int iHashCode = this.f162850b.hashCode() * 31;
        List<String> list = this.f162851c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        AttributedText attributedText = this.f162852d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f162853e;
        int iHashCode4 = (iHashCode3 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        HotelBookingInstallments hotelBookingInstallments = this.f162854f;
        int iHashCode5 = (this.f162855g.hashCode() + ((iHashCode4 + (hotelBookingInstallments == null ? 0 : hotelBookingInstallments.hashCode())) * 31)) * 31;
        HotelBookingDiscount hotelBookingDiscount = this.f162856h;
        return iHashCode5 + (hotelBookingDiscount != null ? hotelBookingDiscount.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "HotelRoomBookingItem(stringId=" + this.f162850b + ", rentConditions=" + this.f162851c + ", price=" + this.f162852d + ", details=" + this.f162853e + ", installments=" + this.f162854f + ", button=" + this.f162855g + ", discount=" + this.f162856h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f162850b);
        parcel.writeStringList(this.f162851c);
        parcel.writeParcelable(this.f162852d, i12);
        parcel.writeParcelable(this.f162853e, i12);
        HotelBookingInstallments hotelBookingInstallments = this.f162854f;
        if (hotelBookingInstallments == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelBookingInstallments.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f162855g, i12);
        HotelBookingDiscount hotelBookingDiscount = this.f162856h;
        if (hotelBookingDiscount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelBookingDiscount.writeToParcel(parcel, i12);
        }
    }
}
