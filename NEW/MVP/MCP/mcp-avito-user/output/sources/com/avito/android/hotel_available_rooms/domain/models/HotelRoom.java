package com.avito.android.hotel_available_rooms.domain.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelRoom.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/domain/models/HotelRoom;", "Lcom/avito/android/hotel_available_rooms/domain/models/HotelItem;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelRoom implements HotelItem {

    @k
    public static final Parcelable.Creator<HotelRoom> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f162802b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<Image> f162803c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f162804d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ArrayList f162805e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f162806f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f162807g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final DeepLink f162808h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ArrayList f162809i;

    /* compiled from: HotelRoom.kt */
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
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(HotelRoom.class, parcel, arrayList2, iL3, 1);
                }
            }
            AttributedText attributedText = (AttributedText) parcel.readParcelable(HotelRoom.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(HotelRoom.class.getClassLoader());
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
            return new HotelRoom(string, arrayList, string2, arrayList2, attributedText, numValueOf, deepLink, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final HotelRoom[] newArray(int i12) {
            return new HotelRoom[i12];
        }
    }

    public HotelRoom(@k String str, @l List list, @l String str2, @l ArrayList arrayList, @l AttributedText attributedText, @l Integer num, @l DeepLink deepLink, @l ArrayList arrayList2) {
        this.f162802b = str;
        this.f162803c = list;
        this.f162804d = str2;
        this.f162805e = arrayList;
        this.f162806f = attributedText;
        this.f162807g = num;
        this.f162808h = deepLink;
        this.f162809i = arrayList2;
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
        return L.f(this.f162802b, hotelRoom.f162802b) && L.f(this.f162803c, hotelRoom.f162803c) && L.f(this.f162804d, hotelRoom.f162804d) && L.f(this.f162805e, hotelRoom.f162805e) && L.f(this.f162806f, hotelRoom.f162806f) && L.f(this.f162807g, hotelRoom.f162807g) && L.f(this.f162808h, hotelRoom.f162808h) && L.f(this.f162809i, hotelRoom.f162809i);
    }

    public final int hashCode() {
        int iHashCode = this.f162802b.hashCode() * 31;
        List<Image> list = this.f162803c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f162804d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ArrayList arrayList = this.f162805e;
        int iHashCode4 = (iHashCode3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        AttributedText attributedText = this.f162806f;
        int iHashCode5 = (iHashCode4 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Integer num = this.f162807g;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        DeepLink deepLink = this.f162808h;
        int iHashCode7 = (iHashCode6 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        ArrayList arrayList2 = this.f162809i;
        return iHashCode7 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelRoom(id=");
        sb2.append(this.f162802b);
        sb2.append(", images=");
        sb2.append(this.f162803c);
        sb2.append(", title=");
        sb2.append(this.f162804d);
        sb2.append(", amenities=");
        sb2.append(this.f162805e);
        sb2.append(", moreButton=");
        sb2.append(this.f162806f);
        sb2.append(", limit=");
        sb2.append(this.f162807g);
        sb2.append(", infoDeepLink=");
        sb2.append(this.f162808h);
        sb2.append(", bookingAvailableItems=");
        return e.p(sb2, this.f162809i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f162802b);
        List<Image> list = this.f162803c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this.f162804d);
        ArrayList arrayList = this.f162805e;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                parcel.writeParcelable((Parcelable) itY.next(), i12);
            }
        }
        parcel.writeParcelable(this.f162806f, i12);
        Integer num = this.f162807g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f162808h, i12);
        ArrayList arrayList2 = this.f162809i;
        if (arrayList2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itY2 = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList2);
        while (itY2.hasNext()) {
            ((HotelBookingItem) itY2.next()).writeToParcel(parcel, i12);
        }
    }
}
