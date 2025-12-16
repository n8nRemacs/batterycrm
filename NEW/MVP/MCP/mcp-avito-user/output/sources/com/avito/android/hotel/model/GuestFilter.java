package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertHotel.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/hotel/model/GuestFilter;", "Landroid/os/Parcelable;", "", "minCount", "maxCount", "maxAdultCount", "maxChildrenCount", "adultGuests", "", "childGuestAges", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "g", "e", "f", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GuestFilter implements Parcelable {

    @k
    public static final Parcelable.Creator<GuestFilter> CREATOR = new a();

    @c("adultGuests")
    @l
    private final Integer adultGuests;

    @c("childGuestAges")
    @l
    private final List<Integer> childGuestAges;

    @c("maxAdultsCount")
    @l
    private final Integer maxAdultCount;

    @c("maxChildrenCount")
    @l
    private final Integer maxChildrenCount;

    @c("maxCount")
    @l
    private final Integer maxCount;

    @c("minCount")
    @l
    private final Integer minCount;

    /* compiled from: AdvertHotel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GuestFilter> {
        @Override // android.os.Parcelable.Creator
        public final GuestFilter createFromParcel(Parcel parcel) {
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
            return new GuestFilter(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GuestFilter[] newArray(int i12) {
            return new GuestFilter[i12];
        }
    }

    public GuestFilter(@l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Integer num5, @l List<Integer> list) {
        this.minCount = num;
        this.maxCount = num2;
        this.maxAdultCount = num3;
        this.maxChildrenCount = num4;
        this.adultGuests = num5;
        this.childGuestAges = list;
    }

    public static GuestFilter a(GuestFilter guestFilter, Integer num, List list) {
        Integer num2 = guestFilter.minCount;
        Integer num3 = guestFilter.maxCount;
        Integer num4 = guestFilter.maxAdultCount;
        Integer num5 = guestFilter.maxChildrenCount;
        guestFilter.getClass();
        return new GuestFilter(num2, num3, num4, num5, num, list);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getAdultGuests() {
        return this.adultGuests;
    }

    @l
    public final List<Integer> d() {
        return this.childGuestAges;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Integer getMaxAdultCount() {
        return this.maxAdultCount;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestFilter)) {
            return false;
        }
        GuestFilter guestFilter = (GuestFilter) obj;
        return L.f(this.minCount, guestFilter.minCount) && L.f(this.maxCount, guestFilter.maxCount) && L.f(this.maxAdultCount, guestFilter.maxAdultCount) && L.f(this.maxChildrenCount, guestFilter.maxChildrenCount) && L.f(this.adultGuests, guestFilter.adultGuests) && L.f(this.childGuestAges, guestFilter.childGuestAges);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Integer getMaxChildrenCount() {
        return this.maxChildrenCount;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Integer getMaxCount() {
        return this.maxCount;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final Integer getMinCount() {
        return this.minCount;
    }

    public final int hashCode() {
        Integer num = this.minCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxCount;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxAdultCount;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.maxChildrenCount;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.adultGuests;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<Integer> list = this.childGuestAges;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GuestFilter(minCount=");
        sb2.append(this.minCount);
        sb2.append(", maxCount=");
        sb2.append(this.maxCount);
        sb2.append(", maxAdultCount=");
        sb2.append(this.maxAdultCount);
        sb2.append(", maxChildrenCount=");
        sb2.append(this.maxChildrenCount);
        sb2.append(", adultGuests=");
        sb2.append(this.adultGuests);
        sb2.append(", childGuestAges=");
        return H.p(sb2, this.childGuestAges, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.minCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.maxCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.maxAdultCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Integer num4 = this.maxChildrenCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
        Integer num5 = this.adultGuests;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num5);
        }
        List<Integer> list = this.childGuestAges;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeInt(((Number) itA.next()).intValue());
        }
    }
}
