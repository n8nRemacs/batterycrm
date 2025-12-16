package com.avito.android.hotel_available_rooms.domain.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HotelFilters.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/domain/models/HotelGuestFilter;", "Landroid/os/Parcelable;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelGuestFilter implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelGuestFilter> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f162796b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f162797c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f162798d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f162799e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f162800f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<Integer> f162801g;

    /* compiled from: HotelFilters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelGuestFilter> {
        @Override // android.os.Parcelable.Creator
        public final HotelGuestFilter createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iD2 = 0;
                while (iD2 != i12) {
                    iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList, iD2, 1);
                }
            }
            return new HotelGuestFilter(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final HotelGuestFilter[] newArray(int i12) {
            return new HotelGuestFilter[i12];
        }
    }

    public HotelGuestFilter() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelGuestFilter)) {
            return false;
        }
        HotelGuestFilter hotelGuestFilter = (HotelGuestFilter) obj;
        return L.f(this.f162796b, hotelGuestFilter.f162796b) && L.f(this.f162797c, hotelGuestFilter.f162797c) && L.f(this.f162798d, hotelGuestFilter.f162798d) && L.f(this.f162799e, hotelGuestFilter.f162799e) && L.f(this.f162800f, hotelGuestFilter.f162800f) && L.f(this.f162801g, hotelGuestFilter.f162801g);
    }

    public final int hashCode() {
        Integer num = this.f162796b;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f162797c;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f162798d;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f162799e;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f162800f;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<Integer> list = this.f162801g;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelGuestFilter(minCount=");
        sb2.append(this.f162796b);
        sb2.append(", maxCount=");
        sb2.append(this.f162797c);
        sb2.append(", maxAdultCount=");
        sb2.append(this.f162798d);
        sb2.append(", maxChildrenCount=");
        sb2.append(this.f162799e);
        sb2.append(", adultGuests=");
        sb2.append(this.f162800f);
        sb2.append(", childGuestAges=");
        return H.p(sb2, this.f162801g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.f162796b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f162797c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.f162798d;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Integer num4 = this.f162799e;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
        Integer num5 = this.f162800f;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num5);
        }
        List<Integer> list = this.f162801g;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeInt(((Number) itA.next()).intValue());
        }
    }

    public HotelGuestFilter(@l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Integer num5, @l List<Integer> list) {
        this.f162796b = num;
        this.f162797c = num2;
        this.f162798d = num3;
        this.f162799e = num4;
        this.f162800f = num5;
        this.f162801g = list;
    }

    public /* synthetic */ HotelGuestFilter(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2, (i12 & 4) != 0 ? null : num3, (i12 & 8) != 0 ? null : num4, (i12 & 16) != 0 ? null : num5, (i12 & 32) != 0 ? null : list);
    }
}
