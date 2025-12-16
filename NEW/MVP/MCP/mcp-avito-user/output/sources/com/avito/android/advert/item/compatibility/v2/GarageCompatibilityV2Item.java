package com.avito.android.advert.item.compatibility.v2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SparePartsParameters;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GarageCompatibilityV2Item.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v2/GarageCompatibilityV2Item;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GarageCompatibilityV2Item implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<GarageCompatibilityV2Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f74344b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f74345c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SparePartsParameters f74346d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f74347e;

    /* renamed from: f, reason: collision with root package name */
    public final int f74348f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f74349g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f74350h;

    /* compiled from: GarageCompatibilityV2Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GarageCompatibilityV2Item> {
        @Override // android.os.Parcelable.Creator
        public final GarageCompatibilityV2Item createFromParcel(Parcel parcel) {
            return new GarageCompatibilityV2Item(parcel.readLong(), parcel.readString(), (SparePartsParameters) parcel.readParcelable(GarageCompatibilityV2Item.class.getClassLoader()), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final GarageCompatibilityV2Item[] newArray(int i12) {
            return new GarageCompatibilityV2Item[i12];
        }
    }

    public GarageCompatibilityV2Item(long j12, @Y61.k String str, @Y61.k SparePartsParameters sparePartsParameters, @Y61.k String str2, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f74344b = j12;
        this.f74345c = str;
        this.f74346d = sparePartsParameters;
        this.f74347e = str2;
        this.f74348f = i12;
        this.f74349g = serpDisplayType;
        this.f74350h = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new GarageCompatibilityV2Item(this.f74344b, this.f74345c, this.f74346d, this.f74347e, i12, this.f74349g, this.f74350h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f74349g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GarageCompatibilityV2Item)) {
            return false;
        }
        GarageCompatibilityV2Item garageCompatibilityV2Item = (GarageCompatibilityV2Item) obj;
        return this.f74344b == garageCompatibilityV2Item.f74344b && L.f(this.f74345c, garageCompatibilityV2Item.f74345c) && L.f(this.f74346d, garageCompatibilityV2Item.f74346d) && L.f(this.f74347e, garageCompatibilityV2Item.f74347e) && this.f74348f == garageCompatibilityV2Item.f74348f && this.f74349g == garageCompatibilityV2Item.f74349g && this.f74350h == garageCompatibilityV2Item.f74350h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF78464b() {
        return this.f74344b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78465c() {
        return this.f74348f;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78466d() {
        return this.f74345c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78467e() {
        return this.f74350h;
    }

    public final int hashCode() {
        return this.f74350h.hashCode() + com.avito.android.actions_sheet.a.h(this.f74349g, r.e(this.f74348f, H.d((this.f74346d.hashCode() + H.d(Long.hashCode(this.f74344b) * 31, 31, this.f74345c)) * 31, 31, this.f74347e), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GarageCompatibilityV2Item(id=");
        sb2.append(this.f74344b);
        sb2.append(", stringId=");
        sb2.append(this.f74345c);
        sb2.append(", params=");
        sb2.append(this.f74346d);
        sb2.append(", itemId=");
        sb2.append(this.f74347e);
        sb2.append(", spanCount=");
        sb2.append(this.f74348f);
        sb2.append(", displayType=");
        sb2.append(this.f74349g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f74350h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f74344b);
        parcel.writeString(this.f74345c);
        parcel.writeParcelable(this.f74346d, i12);
        parcel.writeString(this.f74347e);
        parcel.writeInt(this.f74348f);
        parcel.writeString(this.f74349g.name());
        parcel.writeString(this.f74350h.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GarageCompatibilityV2Item(long j12, String str, SparePartsParameters sparePartsParameters, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 111;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, sparePartsParameters, str2, i12, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
