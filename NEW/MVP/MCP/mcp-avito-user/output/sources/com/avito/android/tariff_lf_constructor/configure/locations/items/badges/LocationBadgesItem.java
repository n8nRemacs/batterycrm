package com.avito.android.tariff_lf_constructor.configure.locations.items.badges;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationBadgesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/locations/items/badges/LocationBadgesItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LocationBadgesItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<LocationBadgesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f299925b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f299926c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f299927d;

    /* compiled from: LocationBadgesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocationBadgesItem> {
        @Override // android.os.Parcelable.Creator
        public final LocationBadgesItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(LocationBadgeItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new LocationBadgesItem(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final LocationBadgesItem[] newArray(int i12) {
            return new LocationBadgesItem[i12];
        }
    }

    public LocationBadgesItem(@k String str, @k String str2, @k List<LocationBadgeItem> list) {
        this.f299925b = str;
        this.f299926c = str2;
        this.f299927d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationBadgesItem)) {
            return false;
        }
        LocationBadgesItem locationBadgesItem = (LocationBadgesItem) obj;
        return L.f(this.f299925b, locationBadgesItem.f299925b) && L.f(this.f299926c, locationBadgesItem.f299926c) && L.f(this.f299927d, locationBadgesItem.f299927d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF73058b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF174298h() {
        return this.f299925b;
    }

    public final int hashCode() {
        return this.f299927d.hashCode() + H.d(this.f299925b.hashCode() * 31, 31, this.f299926c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationBadgesItem(stringId=");
        sb2.append(this.f299925b);
        sb2.append(", collapseTitle=");
        sb2.append(this.f299926c);
        sb2.append(", locations=");
        return H.n(sb2, this.f299927d, ')');
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f299925b);
        parcel.writeString(this.f299926c);
        ?? r02 = this.f299927d;
        parcel.writeInt(r02.size());
        Iterator it = r02.iterator();
        while (it.hasNext()) {
            ((LocationBadgeItem) it.next()).writeToParcel(parcel, i12);
        }
    }
}
