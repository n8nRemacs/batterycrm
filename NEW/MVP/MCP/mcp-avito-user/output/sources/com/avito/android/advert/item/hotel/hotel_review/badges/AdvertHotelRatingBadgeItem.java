package com.avito.android.advert.item.hotel.hotel_review.badges;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertHotelRatingBadgeItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_review/badges/AdvertHotelRatingBadgeItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertHotelRatingBadgeItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AdvertHotelRatingBadgeItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f76243b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UniversalColor f76244c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalColor f76245d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UniversalColor f76246e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f76247f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f76248g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f76249h;

    /* compiled from: AdvertHotelRatingBadgeItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertHotelRatingBadgeItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertHotelRatingBadgeItem createFromParcel(Parcel parcel) {
            return new AdvertHotelRatingBadgeItem(parcel.readString(), (UniversalColor) parcel.readParcelable(AdvertHotelRatingBadgeItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(AdvertHotelRatingBadgeItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(AdvertHotelRatingBadgeItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertHotelRatingBadgeItem[] newArray(int i12) {
            return new AdvertHotelRatingBadgeItem[i12];
        }
    }

    public AdvertHotelRatingBadgeItem(@k String str, @k UniversalColor universalColor, @k UniversalColor universalColor2, @k UniversalColor universalColor3, @l String str2, @l String str3, @l String str4) {
        this.f76243b = str;
        this.f76244c = universalColor;
        this.f76245d = universalColor2;
        this.f76246e = universalColor3;
        this.f76247f = str2;
        this.f76248g = str3;
        this.f76249h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertHotelRatingBadgeItem)) {
            return false;
        }
        AdvertHotelRatingBadgeItem advertHotelRatingBadgeItem = (AdvertHotelRatingBadgeItem) obj;
        return L.f(this.f76243b, advertHotelRatingBadgeItem.f76243b) && L.f(this.f76244c, advertHotelRatingBadgeItem.f76244c) && L.f(this.f76245d, advertHotelRatingBadgeItem.f76245d) && L.f(this.f76246e, advertHotelRatingBadgeItem.f76246e) && L.f(this.f76247f, advertHotelRatingBadgeItem.f76247f) && L.f(this.f76248g, advertHotelRatingBadgeItem.f76248g) && L.f(this.f76249h, advertHotelRatingBadgeItem.f76249h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123950b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF262689b() {
        return this.f76243b;
    }

    public final int hashCode() {
        int i12 = com.avito.android.actions_sheet.a.i(this.f76246e, com.avito.android.actions_sheet.a.i(this.f76245d, com.avito.android.actions_sheet.a.i(this.f76244c, this.f76243b.hashCode() * 31, 31), 31), 31);
        String str = this.f76247f;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f76248g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f76249h;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertHotelRatingBadgeItem(stringId=");
        sb2.append(this.f76243b);
        sb2.append(", backgroundColor=");
        sb2.append(this.f76244c);
        sb2.append(", titleColor=");
        sb2.append(this.f76245d);
        sb2.append(", subtitleColor=");
        sb2.append(this.f76246e);
        sb2.append(", title=");
        sb2.append(this.f76247f);
        sb2.append(", subtitle=");
        sb2.append(this.f76248g);
        sb2.append(", icon=");
        return C22026a.c(sb2, this.f76249h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f76243b);
        parcel.writeParcelable(this.f76244c, i12);
        parcel.writeParcelable(this.f76245d, i12);
        parcel.writeParcelable(this.f76246e, i12);
        parcel.writeString(this.f76247f);
        parcel.writeString(this.f76248g);
        parcel.writeString(this.f76249h);
    }
}
