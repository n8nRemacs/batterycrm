package com.avito.android.advert.item.hotel.hotel_offer.konveyor.main;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.hotel.hotel_offer.HotelOfferState;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsHotelOfferItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/main/AdvertDetailsHotelOfferItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsHotelOfferItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsHotelOfferItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f76078b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f76079c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f76080d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f76081e;

    /* renamed from: f, reason: collision with root package name */
    public final int f76082f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public HotelOfferState f76083g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Parcelable f76084h;

    /* compiled from: AdvertDetailsHotelOfferItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsHotelOfferItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsHotelOfferItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsHotelOfferItem(parcel.readLong(), parcel.readString(), SerpViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt(), HotelOfferState.CREATOR.createFromParcel(parcel), parcel.readParcelable(AdvertDetailsHotelOfferItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsHotelOfferItem[] newArray(int i12) {
            return new AdvertDetailsHotelOfferItem[i12];
        }
    }

    public AdvertDetailsHotelOfferItem(long j12, @Y61.k String str, @Y61.k SerpViewType serpViewType, @Y61.k SerpDisplayType serpDisplayType, int i12, @Y61.k HotelOfferState hotelOfferState, @Y61.l Parcelable parcelable) {
        this.f76078b = j12;
        this.f76079c = str;
        this.f76080d = serpViewType;
        this.f76081e = serpDisplayType;
        this.f76082f = i12;
        this.f76083g = hotelOfferState;
        this.f76084h = parcelable;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsHotelOfferItem(this.f76078b, this.f76079c, this.f76080d, this.f76081e, i12, this.f76083g, this.f76084h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f76081e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsHotelOfferItem)) {
            return false;
        }
        AdvertDetailsHotelOfferItem advertDetailsHotelOfferItem = (AdvertDetailsHotelOfferItem) obj;
        return this.f76078b == advertDetailsHotelOfferItem.f76078b && L.f(this.f76079c, advertDetailsHotelOfferItem.f76079c) && this.f76080d == advertDetailsHotelOfferItem.f76080d && this.f76081e == advertDetailsHotelOfferItem.f76081e && this.f76082f == advertDetailsHotelOfferItem.f76082f && L.f(this.f76083g, advertDetailsHotelOfferItem.f76083g) && L.f(this.f76084h, advertDetailsHotelOfferItem.f76084h);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80137b() {
        return this.f76078b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF269137b() {
        return this.f76082f;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF323985b() {
        return this.f76079c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF269141f() {
        return this.f76080d;
    }

    public final int hashCode() {
        int iHashCode = (this.f76083g.hashCode() + androidx.appcompat.app.r.e(this.f76082f, com.avito.android.actions_sheet.a.h(this.f76081e, com.avito.android.actions_sheet.a.j(this.f76080d, H.d(Long.hashCode(this.f76078b) * 31, 31, this.f76079c), 31), 31), 31)) * 31;
        Parcelable parcelable = this.f76084h;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsHotelOfferItem(id=");
        sb2.append(this.f76078b);
        sb2.append(", stringId=");
        sb2.append(this.f76079c);
        sb2.append(", viewType=");
        sb2.append(this.f76080d);
        sb2.append(", displayType=");
        sb2.append(this.f76081e);
        sb2.append(", spanCount=");
        sb2.append(this.f76082f);
        sb2.append(", state=");
        sb2.append(this.f76083g);
        sb2.append(", scrollState=");
        return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f76084h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f76078b);
        parcel.writeString(this.f76079c);
        parcel.writeString(this.f76080d.name());
        parcel.writeString(this.f76081e.name());
        parcel.writeInt(this.f76082f);
        this.f76083g.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f76084h, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsHotelOfferItem(long j12, String str, SerpViewType serpViewType, SerpDisplayType serpDisplayType, int i12, HotelOfferState hotelOfferState, Parcelable parcelable, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 173;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, i12, hotelOfferState, (i13 & 64) != 0 ? null : parcelable);
    }
}
