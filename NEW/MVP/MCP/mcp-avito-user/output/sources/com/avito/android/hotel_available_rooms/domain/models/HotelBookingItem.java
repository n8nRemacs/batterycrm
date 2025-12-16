package com.avito.android.hotel_available_rooms.domain.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelRoom.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/domain/models/HotelBookingItem;", "Landroid/os/Parcelable;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingItem implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelBookingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f162785b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f162786c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final HotelBookingInstallments f162787d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<String> f162788e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ButtonAction f162789f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final HotelBookingDiscount f162790g;

    /* compiled from: HotelRoom.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingItem createFromParcel(Parcel parcel) {
            return new HotelBookingItem((AttributedText) parcel.readParcelable(HotelBookingItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(HotelBookingItem.class.getClassLoader()), parcel.readInt() == 0 ? null : HotelBookingInstallments.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), (ButtonAction) parcel.readParcelable(HotelBookingItem.class.getClassLoader()), parcel.readInt() != 0 ? HotelBookingDiscount.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingItem[] newArray(int i12) {
            return new HotelBookingItem[i12];
        }
    }

    public HotelBookingItem(@l AttributedText attributedText, @l AttributedText attributedText2, @l HotelBookingInstallments hotelBookingInstallments, @l List<String> list, @l ButtonAction buttonAction, @l HotelBookingDiscount hotelBookingDiscount) {
        this.f162785b = attributedText;
        this.f162786c = attributedText2;
        this.f162787d = hotelBookingInstallments;
        this.f162788e = list;
        this.f162789f = buttonAction;
        this.f162790g = hotelBookingDiscount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelBookingItem)) {
            return false;
        }
        HotelBookingItem hotelBookingItem = (HotelBookingItem) obj;
        return L.f(this.f162785b, hotelBookingItem.f162785b) && L.f(this.f162786c, hotelBookingItem.f162786c) && L.f(this.f162787d, hotelBookingItem.f162787d) && L.f(this.f162788e, hotelBookingItem.f162788e) && L.f(this.f162789f, hotelBookingItem.f162789f) && L.f(this.f162790g, hotelBookingItem.f162790g);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f162785b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.f162786c;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        HotelBookingInstallments hotelBookingInstallments = this.f162787d;
        int iHashCode3 = (iHashCode2 + (hotelBookingInstallments == null ? 0 : hotelBookingInstallments.hashCode())) * 31;
        List<String> list = this.f162788e;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ButtonAction buttonAction = this.f162789f;
        int iHashCode5 = (iHashCode4 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        HotelBookingDiscount hotelBookingDiscount = this.f162790g;
        return iHashCode5 + (hotelBookingDiscount != null ? hotelBookingDiscount.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "HotelBookingItem(price=" + this.f162785b + ", details=" + this.f162786c + ", installments=" + this.f162787d + ", rentConditions=" + this.f162788e + ", button=" + this.f162789f + ", discount=" + this.f162790g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f162785b, i12);
        parcel.writeParcelable(this.f162786c, i12);
        HotelBookingInstallments hotelBookingInstallments = this.f162787d;
        if (hotelBookingInstallments == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelBookingInstallments.writeToParcel(parcel, i12);
        }
        parcel.writeStringList(this.f162788e);
        parcel.writeParcelable(this.f162789f, i12);
        HotelBookingDiscount hotelBookingDiscount = this.f162790g;
        if (hotelBookingDiscount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelBookingDiscount.writeToParcel(parcel, i12);
        }
    }
}
