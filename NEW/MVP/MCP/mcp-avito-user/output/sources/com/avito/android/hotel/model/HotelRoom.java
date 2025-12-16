package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.hotel.model.Amenities;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelAvailableRooms.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b \u0010\u0017¨\u0006!"}, d2 = {"Lcom/avito/android/hotel/model/HotelRoom;", "Landroid/os/Parcelable;", "", "id", "", "Lcom/avito/android/remote/model/Image;", "images", "title", "Lcom/avito/android/hotel/model/Amenities$Amenity;", "amenities", "Lcom/avito/android/remote/model/text/AttributedText;", "moreButton", "", "limit", "Lcom/avito/android/hotel/model/HotelBookingItem;", "bookingAvailableItems", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Integer;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "getTitle", "getAmenities", "Lcom/avito/android/remote/model/text/AttributedText;", "getMoreButton", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Integer;", "getLimit", "()Ljava/lang/Integer;", "getBookingAvailableItems", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelRoom implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelRoom> CREATOR = new a();

    @c("amenities")
    @l
    private final List<Amenities.Amenity> amenities;

    @c("bookingAvailableItems")
    @l
    private final List<HotelBookingItem> bookingAvailableItems;

    @c("id")
    @k
    private final String id;

    @c("images")
    @l
    private final List<Image> images;

    @c("limit")
    @l
    private final Integer limit;

    @c("moreButton")
    @l
    private final AttributedText moreButton;

    @c("title")
    @l
    private final String title;

    /* compiled from: HotelAvailableRooms.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelRoom> {
        @Override // android.os.Parcelable.Creator
        public final HotelRoom createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String string = parcel.readString();
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(HotelRoom.class, parcel, arrayList, iL2, 1);
                }
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = com.avito.android.actions_sheet.a.c(Amenities.Amenity.CREATOR, parcel, arrayList2, iC3, 1);
                }
            }
            AttributedText attributedText = (AttributedText) parcel.readParcelable(HotelRoom.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i14);
                while (iC2 != i14) {
                    iC2 = com.avito.android.actions_sheet.a.c(HotelBookingItem.CREATOR, parcel, arrayList4, iC2, 1);
                }
                arrayList3 = arrayList4;
            }
            return new HotelRoom(string, arrayList, string2, arrayList2, attributedText, numValueOf, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final HotelRoom[] newArray(int i12) {
            return new HotelRoom[i12];
        }
    }

    public HotelRoom(@k String str, @l List<Image> list, @l String str2, @l List<Amenities.Amenity> list2, @l AttributedText attributedText, @l Integer num, @l List<HotelBookingItem> list3) {
        this.id = str;
        this.images = list;
        this.title = str2;
        this.amenities = list2;
        this.moreButton = attributedText;
        this.limit = num;
        this.bookingAvailableItems = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelRoom)) {
            return false;
        }
        HotelRoom hotelRoom = (HotelRoom) obj;
        return L.f(this.id, hotelRoom.id) && L.f(this.images, hotelRoom.images) && L.f(this.title, hotelRoom.title) && L.f(this.amenities, hotelRoom.amenities) && L.f(this.moreButton, hotelRoom.moreButton) && L.f(this.limit, hotelRoom.limit) && L.f(this.bookingAvailableItems, hotelRoom.bookingAvailableItems);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        List<Image> list = this.images;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.title;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Amenities.Amenity> list2 = this.amenities;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AttributedText attributedText = this.moreButton;
        int iHashCode5 = (iHashCode4 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Integer num = this.limit;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<HotelBookingItem> list3 = this.bookingAvailableItems;
        return iHashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelRoom(id=");
        sb2.append(this.id);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", amenities=");
        sb2.append(this.amenities);
        sb2.append(", moreButton=");
        sb2.append(this.moreButton);
        sb2.append(", limit=");
        sb2.append(this.limit);
        sb2.append(", bookingAvailableItems=");
        return H.p(sb2, this.bookingAvailableItems, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        List<Image> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this.title);
        List<Amenities.Amenity> list2 = this.amenities;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((Amenities.Amenity) itA2.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.moreButton, i12);
        Integer num = this.limit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        List<HotelBookingItem> list3 = this.bookingAvailableItems;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
        while (itA3.hasNext()) {
            ((HotelBookingItem) itA3.next()).writeToParcel(parcel, i12);
        }
    }
}
