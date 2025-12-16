package com.avito.android.advert.item.compatibility.v3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SparePartsFilters;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GarageCompatibilityV3Item.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/GarageCompatibilityV3Item;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GarageCompatibilityV3Item implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<GarageCompatibilityV3Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f74395b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f74396c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SparePartsFilters f74397d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f74398e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f74399f;

    /* renamed from: g, reason: collision with root package name */
    public final int f74400g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f74401h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f74402i;

    /* compiled from: GarageCompatibilityV3Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GarageCompatibilityV3Item> {
        @Override // android.os.Parcelable.Creator
        public final GarageCompatibilityV3Item createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            SparePartsFilters sparePartsFilters = (SparePartsFilters) parcel.readParcelable(GarageCompatibilityV3Item.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            return new GarageCompatibilityV3Item(j12, string, sparePartsFilters, linkedHashMap, parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final GarageCompatibilityV3Item[] newArray(int i12) {
            return new GarageCompatibilityV3Item[i12];
        }
    }

    public GarageCompatibilityV3Item(long j12, @Y61.k String str, @Y61.k SparePartsFilters sparePartsFilters, @Y61.l Map<String, String> map, @Y61.k String str2, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f74395b = j12;
        this.f74396c = str;
        this.f74397d = sparePartsFilters;
        this.f74398e = map;
        this.f74399f = str2;
        this.f74400g = i12;
        this.f74401h = serpDisplayType;
        this.f74402i = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new GarageCompatibilityV3Item(this.f74395b, this.f74396c, this.f74397d, this.f74398e, this.f74399f, i12, this.f74401h, this.f74402i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f74401h = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GarageCompatibilityV3Item)) {
            return false;
        }
        GarageCompatibilityV3Item garageCompatibilityV3Item = (GarageCompatibilityV3Item) obj;
        return this.f74395b == garageCompatibilityV3Item.f74395b && L.f(this.f74396c, garageCompatibilityV3Item.f74396c) && L.f(this.f74397d, garageCompatibilityV3Item.f74397d) && L.f(this.f74398e, garageCompatibilityV3Item.f74398e) && L.f(this.f74399f, garageCompatibilityV3Item.f74399f) && this.f74400g == garageCompatibilityV3Item.f74400g && this.f74401h == garageCompatibilityV3Item.f74401h && this.f74402i == garageCompatibilityV3Item.f74402i;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75315b() {
        return this.f74395b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF231634s() {
        return this.f74400g;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF231617b() {
        return this.f74396c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF231633r() {
        return this.f74402i;
    }

    public final int hashCode() {
        int iHashCode = (this.f74397d.hashCode() + H.d(Long.hashCode(this.f74395b) * 31, 31, this.f74396c)) * 31;
        Map<String, String> map = this.f74398e;
        return this.f74402i.hashCode() + com.avito.android.actions_sheet.a.h(this.f74401h, androidx.appcompat.app.r.e(this.f74400g, H.d((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.f74399f), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GarageCompatibilityV3Item(id=");
        sb2.append(this.f74395b);
        sb2.append(", stringId=");
        sb2.append(this.f74396c);
        sb2.append(", filters=");
        sb2.append(this.f74397d);
        sb2.append(", sparePartFiltersV4=");
        sb2.append(this.f74398e);
        sb2.append(", itemId=");
        sb2.append(this.f74399f);
        sb2.append(", spanCount=");
        sb2.append(this.f74400g);
        sb2.append(", displayType=");
        sb2.append(this.f74401h);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f74402i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f74395b);
        parcel.writeString(this.f74396c);
        parcel.writeParcelable(this.f74397d, i12);
        Map<String, String> map = this.f74398e;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.f74399f);
        parcel.writeInt(this.f74400g);
        parcel.writeString(this.f74401h.name());
        parcel.writeString(this.f74402i.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GarageCompatibilityV3Item(long j12, String str, SparePartsFilters sparePartsFilters, Map map, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 112;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, sparePartsFilters, map, str2, i12, (i13 & 64) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 128) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
