package com.avito.android.advert.item.hotel.hotel_description;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertHotelDescriptionItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_description/AdvertHotelDescriptionItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertHotelDescriptionItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertHotelDescriptionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f75840b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f75841c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f75842d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f75843e;

    /* renamed from: f, reason: collision with root package name */
    public final int f75844f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f75845g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f75846h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public Parcelable f75847i;

    /* compiled from: AdvertHotelDescriptionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertHotelDescriptionItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertHotelDescriptionItem createFromParcel(Parcel parcel) {
            return new AdvertHotelDescriptionItem(parcel.readLong(), parcel.readString(), SerpViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readParcelable(AdvertHotelDescriptionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertHotelDescriptionItem[] newArray(int i12) {
            return new AdvertHotelDescriptionItem[i12];
        }
    }

    public AdvertHotelDescriptionItem(long j12, @Y61.k String str, @Y61.k SerpViewType serpViewType, @Y61.k SerpDisplayType serpDisplayType, int i12, @l String str2, @l String str3, @l Parcelable parcelable) {
        this.f75840b = j12;
        this.f75841c = str;
        this.f75842d = serpViewType;
        this.f75843e = serpDisplayType;
        this.f75844f = i12;
        this.f75845g = str2;
        this.f75846h = str3;
        this.f75847i = parcelable;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertHotelDescriptionItem(this.f75840b, this.f75841c, this.f75842d, this.f75843e, i12, this.f75845g, this.f75846h, this.f75847i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f75843e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertHotelDescriptionItem)) {
            return false;
        }
        AdvertHotelDescriptionItem advertHotelDescriptionItem = (AdvertHotelDescriptionItem) obj;
        return this.f75840b == advertHotelDescriptionItem.f75840b && L.f(this.f75841c, advertHotelDescriptionItem.f75841c) && this.f75842d == advertHotelDescriptionItem.f75842d && this.f75843e == advertHotelDescriptionItem.f75843e && this.f75844f == advertHotelDescriptionItem.f75844f && L.f(this.f75845g, advertHotelDescriptionItem.f75845g) && L.f(this.f75846h, advertHotelDescriptionItem.f75846h) && L.f(this.f75847i, advertHotelDescriptionItem.f75847i);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF269950b() {
        return this.f75840b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF269958j() {
        return this.f75844f;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF260340b() {
        return this.f75841c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF269957i() {
        return this.f75842d;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f75844f, com.avito.android.actions_sheet.a.h(this.f75843e, com.avito.android.actions_sheet.a.j(this.f75842d, H.d(Long.hashCode(this.f75840b) * 31, 31, this.f75841c), 31), 31), 31);
        String str = this.f75845g;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f75846h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Parcelable parcelable = this.f75847i;
        return iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertHotelDescriptionItem(id=");
        sb2.append(this.f75840b);
        sb2.append(", stringId=");
        sb2.append(this.f75841c);
        sb2.append(", viewType=");
        sb2.append(this.f75842d);
        sb2.append(", displayType=");
        sb2.append(this.f75843e);
        sb2.append(", spanCount=");
        sb2.append(this.f75844f);
        sb2.append(", title=");
        sb2.append(this.f75845g);
        sb2.append(", description=");
        sb2.append(this.f75846h);
        sb2.append(", expandPanelState=");
        return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f75847i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f75840b);
        parcel.writeString(this.f75841c);
        parcel.writeString(this.f75842d.name());
        parcel.writeString(this.f75843e.name());
        parcel.writeInt(this.f75844f);
        parcel.writeString(this.f75845g);
        parcel.writeString(this.f75846h);
        parcel.writeParcelable(this.f75847i, i12);
    }

    public /* synthetic */ AdvertHotelDescriptionItem(long j12, String str, SerpViewType serpViewType, SerpDisplayType serpDisplayType, int i12, String str2, String str3, Parcelable parcelable, int i13, C42822w c42822w) {
        this(j12, (i13 & 2) != 0 ? String.valueOf(j12) : str, (i13 & 4) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, i12, str2, str3, (i13 & 128) != 0 ? null : parcelable);
    }
}
