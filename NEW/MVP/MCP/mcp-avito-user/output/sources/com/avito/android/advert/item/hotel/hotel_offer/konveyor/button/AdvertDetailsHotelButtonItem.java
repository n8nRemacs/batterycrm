package com.avito.android.advert.item.hotel.hotel_offer.konveyor.button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsHotelButtonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/button/AdvertDetailsHotelButtonItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsHotelButtonItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AdvertDetailsHotelButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f76018b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f76019c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f76020d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f76021e;

    /* compiled from: AdvertDetailsHotelButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsHotelButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsHotelButtonItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsHotelButtonItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AdvertDetailsHotelButtonItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsHotelButtonItem[] newArray(int i12) {
            return new AdvertDetailsHotelButtonItem[i12];
        }
    }

    public AdvertDetailsHotelButtonItem(@k String str, @l String str2, @l String str3, @l DeepLink deepLink) {
        this.f76018b = str;
        this.f76019c = str2;
        this.f76020d = str3;
        this.f76021e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsHotelButtonItem)) {
            return false;
        }
        AdvertDetailsHotelButtonItem advertDetailsHotelButtonItem = (AdvertDetailsHotelButtonItem) obj;
        return L.f(this.f76018b, advertDetailsHotelButtonItem.f76018b) && L.f(this.f76019c, advertDetailsHotelButtonItem.f76019c) && L.f(this.f76020d, advertDetailsHotelButtonItem.f76020d) && L.f(this.f76021e, advertDetailsHotelButtonItem.f76021e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80070b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF302737b() {
        return this.f76018b;
    }

    public final int hashCode() {
        int iHashCode = this.f76018b.hashCode() * 31;
        String str = this.f76019c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f76020d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f76021e;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsHotelButtonItem(stringId=");
        sb2.append(this.f76018b);
        sb2.append(", title=");
        sb2.append(this.f76019c);
        sb2.append(", style=");
        sb2.append(this.f76020d);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f76021e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f76018b);
        parcel.writeString(this.f76019c);
        parcel.writeString(this.f76020d);
        parcel.writeParcelable(this.f76021e, i12);
    }
}
