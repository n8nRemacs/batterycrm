package com.avito.android.advert.item.amenities.screen.items.amenity_row;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AmenityRowItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/amenities/screen/items/amenity_row/AmenityRowItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AmenityRowItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AmenityRowItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f72769b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f72770c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f72771d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f72772e;

    /* compiled from: AmenityRowItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AmenityRowItem> {
        @Override // android.os.Parcelable.Creator
        public final AmenityRowItem createFromParcel(Parcel parcel) {
            return new AmenityRowItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AmenityRowItem[] newArray(int i12) {
            return new AmenityRowItem[i12];
        }
    }

    public AmenityRowItem(@k String str, @l String str2, @l String str3, @l String str4) {
        this.f72769b = str;
        this.f72770c = str2;
        this.f72771d = str3;
        this.f72772e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmenityRowItem)) {
            return false;
        }
        AmenityRowItem amenityRowItem = (AmenityRowItem) obj;
        return L.f(this.f72769b, amenityRowItem.f72769b) && L.f(this.f72770c, amenityRowItem.f72770c) && L.f(this.f72771d, amenityRowItem.f72771d) && L.f(this.f72772e, amenityRowItem.f72772e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF72638b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF72639c() {
        return this.f72769b;
    }

    public final int hashCode() {
        int iHashCode = this.f72769b.hashCode() * 31;
        String str = this.f72770c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f72771d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f72772e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AmenityRowItem(stringId=");
        sb2.append(this.f72769b);
        sb2.append(", icon=");
        sb2.append(this.f72770c);
        sb2.append(", title=");
        sb2.append(this.f72771d);
        sb2.append(", price=");
        return C22026a.c(sb2, this.f72772e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f72769b);
        parcel.writeString(this.f72770c);
        parcel.writeString(this.f72771d);
        parcel.writeString(this.f72772e);
    }
}
