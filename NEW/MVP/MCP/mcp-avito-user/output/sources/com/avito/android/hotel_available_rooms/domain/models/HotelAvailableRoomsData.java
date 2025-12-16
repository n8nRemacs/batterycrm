package com.avito.android.hotel_available_rooms.domain.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelAvailableRoomsData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/domain/models/HotelAvailableRoomsData;", "Landroid/os/Parcelable;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelAvailableRoomsData implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelAvailableRoomsData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Map<String, String> f162770b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final HotelFilters f162771c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ArrayList f162772d;

    /* compiled from: HotelAvailableRoomsData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelAvailableRoomsData> {
        @Override // android.os.Parcelable.Creator
        public final HotelAvailableRoomsData createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            int iL2 = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            HotelFilters hotelFiltersCreateFromParcel = parcel.readInt() == 0 ? null : HotelFilters.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(HotelAvailableRoomsData.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new HotelAvailableRoomsData(linkedHashMap, hotelFiltersCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final HotelAvailableRoomsData[] newArray(int i12) {
            return new HotelAvailableRoomsData[i12];
        }
    }

    public HotelAvailableRoomsData(@l Map map, @l HotelFilters hotelFilters, @l ArrayList arrayList) {
        this.f162770b = map;
        this.f162771c = hotelFilters;
        this.f162772d = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelAvailableRoomsData)) {
            return false;
        }
        HotelAvailableRoomsData hotelAvailableRoomsData = (HotelAvailableRoomsData) obj;
        return L.f(this.f162770b, hotelAvailableRoomsData.f162770b) && L.f(this.f162771c, hotelAvailableRoomsData.f162771c) && L.f(this.f162772d, hotelAvailableRoomsData.f162772d);
    }

    public final int hashCode() {
        Map<String, String> map = this.f162770b;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        HotelFilters hotelFilters = this.f162771c;
        int iHashCode2 = (iHashCode + (hotelFilters == null ? 0 : hotelFilters.hashCode())) * 31;
        ArrayList arrayList = this.f162772d;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelAvailableRoomsData(analyticsParams=");
        sb2.append(this.f162770b);
        sb2.append(", filters=");
        sb2.append(this.f162771c);
        sb2.append(", items=");
        return e.p(sb2, this.f162772d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Map<String, String> map = this.f162770b;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        HotelFilters hotelFilters = this.f162771c;
        if (hotelFilters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelFilters.writeToParcel(parcel, i12);
        }
        ArrayList arrayList = this.f162772d;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
        while (itY.hasNext()) {
            parcel.writeParcelable((Parcelable) itY.next(), i12);
        }
    }
}
