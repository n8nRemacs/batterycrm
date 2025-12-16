package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelAvailableRooms.kt */
@d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/hotel/model/HotelAvailableRooms;", "Landroid/os/Parcelable;", "", "", "analyticsParams", "Lcom/avito/android/hotel/model/HotelFilters;", "filters", "", "Lcom/avito/android/hotel/model/HotelRoom;", "items", "<init>", "(Ljava/util/Map;Lcom/avito/android/hotel/model/HotelFilters;Ljava/util/List;)V", "Ljava/util/Map;", "getAnalyticsParams", "()Ljava/util/Map;", "Lcom/avito/android/hotel/model/HotelFilters;", "getFilters", "()Lcom/avito/android/hotel/model/HotelFilters;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelAvailableRooms implements Parcelable {

    @k
    public static final Parcelable.Creator<HotelAvailableRooms> CREATOR = new a();

    @c("analyticsParams")
    @l
    private final Map<String, String> analyticsParams;

    @c("filters")
    @l
    private final HotelFilters filters;

    @c("items")
    @l
    private final List<HotelRoom> items;

    /* compiled from: HotelAvailableRooms.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelAvailableRooms> {
        @Override // android.os.Parcelable.Creator
        public final HotelAvailableRooms createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            int iC2 = 0;
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
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(HotelRoom.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new HotelAvailableRooms(linkedHashMap, hotelFiltersCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final HotelAvailableRooms[] newArray(int i12) {
            return new HotelAvailableRooms[i12];
        }
    }

    public HotelAvailableRooms(@l Map<String, String> map, @l HotelFilters hotelFilters, @l List<HotelRoom> list) {
        this.analyticsParams = map;
        this.filters = hotelFilters;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelAvailableRooms)) {
            return false;
        }
        HotelAvailableRooms hotelAvailableRooms = (HotelAvailableRooms) obj;
        return L.f(this.analyticsParams, hotelAvailableRooms.analyticsParams) && L.f(this.filters, hotelAvailableRooms.filters) && L.f(this.items, hotelAvailableRooms.items);
    }

    public final int hashCode() {
        Map<String, String> map = this.analyticsParams;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        HotelFilters hotelFilters = this.filters;
        int iHashCode2 = (iHashCode + (hotelFilters == null ? 0 : hotelFilters.hashCode())) * 31;
        List<HotelRoom> list = this.items;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelAvailableRooms(analyticsParams=");
        sb2.append(this.analyticsParams);
        sb2.append(", filters=");
        sb2.append(this.filters);
        sb2.append(", items=");
        return H.p(sb2, this.items, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Map<String, String> map = this.analyticsParams;
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
        HotelFilters hotelFilters = this.filters;
        if (hotelFilters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotelFilters.writeToParcel(parcel, i12);
        }
        List<HotelRoom> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((HotelRoom) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
