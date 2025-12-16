package com.avito.android.advert.item.amenities.screen.items.header;

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

/* compiled from: AmenityHeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/amenities/screen/items/header/AmenityHeaderItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AmenityHeaderItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AmenityHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f72786b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f72787c;

    /* compiled from: AmenityHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AmenityHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final AmenityHeaderItem createFromParcel(Parcel parcel) {
            return new AmenityHeaderItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AmenityHeaderItem[] newArray(int i12) {
            return new AmenityHeaderItem[i12];
        }
    }

    public AmenityHeaderItem(@k String str, @k String str2) {
        this.f72786b = str;
        this.f72787c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmenityHeaderItem)) {
            return false;
        }
        AmenityHeaderItem amenityHeaderItem = (AmenityHeaderItem) obj;
        return L.f(this.f72786b, amenityHeaderItem.f72786b) && L.f(this.f72787c, amenityHeaderItem.f72787c);
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
        return this.f72786b;
    }

    public final int hashCode() {
        return this.f72787c.hashCode() + (this.f72786b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AmenityHeaderItem(stringId=");
        sb2.append(this.f72786b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f72787c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f72786b);
        parcel.writeString(this.f72787c);
    }
}
