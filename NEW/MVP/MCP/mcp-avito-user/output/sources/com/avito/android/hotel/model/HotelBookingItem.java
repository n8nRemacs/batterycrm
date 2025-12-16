package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ButtonAction;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelAvailableRooms.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingItem;", "Landroid/os/Parcelable;", "", "price", "", "rentConditions", "Lcom/avito/android/remote/model/ButtonAction;", "button", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/ButtonAction;)V", "Ljava/lang/String;", "getPrice", "()Ljava/lang/String;", "Ljava/util/List;", "getRentConditions", "()Ljava/util/List;", "Lcom/avito/android/remote/model/ButtonAction;", "getButton", "()Lcom/avito/android/remote/model/ButtonAction;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingItem implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelBookingItem> CREATOR = new a();

    @c("button")
    @l
    private final ButtonAction button;

    @c("price")
    @l
    private final String price;

    @c("rentConditions")
    @l
    private final List<String> rentConditions;

    /* compiled from: HotelAvailableRooms.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingItem createFromParcel(Parcel parcel) {
            return new HotelBookingItem(parcel.readString(), parcel.createStringArrayList(), (ButtonAction) parcel.readParcelable(HotelBookingItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingItem[] newArray(int i12) {
            return new HotelBookingItem[i12];
        }
    }

    public HotelBookingItem(@l String str, @l List<String> list, @l ButtonAction buttonAction) {
        this.price = str;
        this.rentConditions = list;
        this.button = buttonAction;
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
        return L.f(this.price, hotelBookingItem.price) && L.f(this.rentConditions, hotelBookingItem.rentConditions) && L.f(this.button, hotelBookingItem.button);
    }

    public final int hashCode() {
        String str = this.price;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.rentConditions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ButtonAction buttonAction = this.button;
        return iHashCode2 + (buttonAction != null ? buttonAction.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelBookingItem(price=");
        sb2.append(this.price);
        sb2.append(", rentConditions=");
        sb2.append(this.rentConditions);
        sb2.append(", button=");
        return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.button, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.price);
        parcel.writeStringList(this.rentConditions);
        parcel.writeParcelable(this.button, i12);
    }
}
