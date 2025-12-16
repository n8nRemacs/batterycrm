package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertHotelRoom.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/hotel/model/AdvertHotelRoom;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/ButtonAction;", "actionButtons", "Lcom/avito/android/hotel/model/HotelRoomOffer;", "offer", "Lcom/avito/android/hotel/model/HotelOfferBookingInfo;", "bookingInfo", "<init>", "(Ljava/util/List;Lcom/avito/android/hotel/model/HotelRoomOffer;Lcom/avito/android/hotel/model/HotelOfferBookingInfo;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/hotel/model/HotelRoomOffer;", "e", "()Lcom/avito/android/hotel/model/HotelRoomOffer;", "Lcom/avito/android/hotel/model/HotelOfferBookingInfo;", "d", "()Lcom/avito/android/hotel/model/HotelOfferBookingInfo;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AdvertHotelRoom implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertHotelRoom> CREATOR = new a();

    @c("actionButtons")
    @l
    private final List<ButtonAction> actionButtons;

    @c(RequestReviewResultKt.INFO_TYPE)
    @l
    private final HotelOfferBookingInfo bookingInfo;

    @c("offer")
    @l
    private final HotelRoomOffer offer;

    /* compiled from: AdvertHotelRoom.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertHotelRoom> {
        @Override // android.os.Parcelable.Creator
        public final AdvertHotelRoom createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdvertHotelRoom.class, parcel, arrayList, iL2, 1);
                }
            }
            return new AdvertHotelRoom(arrayList, parcel.readInt() == 0 ? null : HotelRoomOffer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? HotelOfferBookingInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertHotelRoom[] newArray(int i12) {
            return new AdvertHotelRoom[i12];
        }
    }

    public AdvertHotelRoom(@l List<ButtonAction> list, @l HotelRoomOffer hotelRoomOffer, @l HotelOfferBookingInfo hotelOfferBookingInfo) {
        this.actionButtons = list;
        this.offer = hotelRoomOffer;
        this.bookingInfo = hotelOfferBookingInfo;
    }

    @l
    public final List<ButtonAction> c() {
        return this.actionButtons;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final HotelOfferBookingInfo getBookingInfo() {
        return this.bookingInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final HotelRoomOffer getOffer() {
        return this.offer;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertHotelRoom)) {
            return false;
        }
        AdvertHotelRoom advertHotelRoom = (AdvertHotelRoom) obj;
        return L.f(this.actionButtons, advertHotelRoom.actionButtons) && L.f(this.offer, advertHotelRoom.offer) && L.f(this.bookingInfo, advertHotelRoom.bookingInfo);
    }

    public final int hashCode() {
        List<ButtonAction> list = this.actionButtons;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        HotelRoomOffer hotelRoomOffer = this.offer;
        int iHashCode2 = (iHashCode + (hotelRoomOffer == null ? 0 : hotelRoomOffer.hashCode())) * 31;
        HotelOfferBookingInfo hotelOfferBookingInfo = this.bookingInfo;
        return iHashCode2 + (hotelOfferBookingInfo != null ? hotelOfferBookingInfo.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AdvertHotelRoom(actionButtons=" + this.actionButtons + ", offer=" + this.offer + ", bookingInfo=" + this.bookingInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<ButtonAction> list = this.actionButtons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        HotelRoomOffer hotelRoomOffer = this.offer;
        if (hotelRoomOffer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelRoomOffer.writeToParcel(parcel, i12);
        }
        HotelOfferBookingInfo hotelOfferBookingInfo = this.bookingInfo;
        if (hotelOfferBookingInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelOfferBookingInfo.writeToParcel(parcel, i12);
        }
    }
}
