package com.avito.android.advert_amenities.amenity;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AmenityItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_amenities/amenity/AmenityItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AmenityItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<AmenityItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f81130b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f81131c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AttributedText f81132d;

    /* compiled from: AmenityItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AmenityItem> {
        @Override // android.os.Parcelable.Creator
        public final AmenityItem createFromParcel(Parcel parcel) {
            return new AmenityItem(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(AmenityItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AmenityItem[] newArray(int i12) {
            return new AmenityItem[i12];
        }
    }

    public AmenityItem(@Y61.k String str, @Y61.l String str2, @Y61.k AttributedText attributedText) {
        this.f81130b = str;
        this.f81131c = str2;
        this.f81132d = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmenityItem)) {
            return false;
        }
        AmenityItem amenityItem = (AmenityItem) obj;
        return L.f(this.f81130b, amenityItem.f81130b) && L.f(this.f81131c, amenityItem.f81131c) && L.f(this.f81132d, amenityItem.f81132d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80342e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF80343f() {
        return this.f81130b;
    }

    public final int hashCode() {
        int iHashCode = this.f81130b.hashCode() * 31;
        String str = this.f81131c;
        return this.f81132d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AmenityItem(stringId=");
        sb2.append(this.f81130b);
        sb2.append(", iconAlias=");
        sb2.append(this.f81131c);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f81132d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f81130b);
        parcel.writeString(this.f81131c);
        parcel.writeParcelable(this.f81132d, i12);
    }
}
