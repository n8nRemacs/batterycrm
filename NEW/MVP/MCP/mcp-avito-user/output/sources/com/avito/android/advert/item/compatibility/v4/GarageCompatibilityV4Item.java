package com.avito.android.advert.item.compatibility.v4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GarageCompatibilityV4Item.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v4/GarageCompatibilityV4Item;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GarageCompatibilityV4Item implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<GarageCompatibilityV4Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f74523b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f74524c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f74525d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f74526e;

    /* renamed from: f, reason: collision with root package name */
    public final int f74527f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f74528g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f74529h;

    /* compiled from: GarageCompatibilityV4Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GarageCompatibilityV4Item> {
        @Override // android.os.Parcelable.Creator
        public final GarageCompatibilityV4Item createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new GarageCompatibilityV4Item(j12, string, linkedHashMap, parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final GarageCompatibilityV4Item[] newArray(int i12) {
            return new GarageCompatibilityV4Item[i12];
        }
    }

    public GarageCompatibilityV4Item(long j12, @Y61.k String str, @Y61.k Map<String, String> map, @Y61.k String str2, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f74523b = j12;
        this.f74524c = str;
        this.f74525d = map;
        this.f74526e = str2;
        this.f74527f = i12;
        this.f74528g = serpDisplayType;
        this.f74529h = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new GarageCompatibilityV4Item(this.f74523b, this.f74524c, this.f74525d, this.f74526e, i12, this.f74528g, this.f74529h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f74528g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GarageCompatibilityV4Item)) {
            return false;
        }
        GarageCompatibilityV4Item garageCompatibilityV4Item = (GarageCompatibilityV4Item) obj;
        return this.f74523b == garageCompatibilityV4Item.f74523b && L.f(this.f74524c, garageCompatibilityV4Item.f74524c) && L.f(this.f74525d, garageCompatibilityV4Item.f74525d) && L.f(this.f74526e, garageCompatibilityV4Item.f74526e) && this.f74527f == garageCompatibilityV4Item.f74527f && this.f74528g == garageCompatibilityV4Item.f74528g && this.f74529h == garageCompatibilityV4Item.f74529h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF282036b() {
        return this.f74523b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84111f() {
        return this.f74527f;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281526b() {
        return this.f74524c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84110e() {
        return this.f74529h;
    }

    public final int hashCode() {
        return this.f74529h.hashCode() + com.avito.android.actions_sheet.a.h(this.f74528g, r.e(this.f74527f, H.d(AK.c.c(H.d(Long.hashCode(this.f74523b) * 31, 31, this.f74524c), 31, this.f74525d), 31, this.f74526e), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GarageCompatibilityV4Item(id=");
        sb2.append(this.f74523b);
        sb2.append(", stringId=");
        sb2.append(this.f74524c);
        sb2.append(", sparePartFiltersV4=");
        sb2.append(this.f74525d);
        sb2.append(", itemId=");
        sb2.append(this.f74526e);
        sb2.append(", spanCount=");
        sb2.append(this.f74527f);
        sb2.append(", displayType=");
        sb2.append(this.f74528g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f74529h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f74523b);
        parcel.writeString(this.f74524c);
        Iterator itI = C0.i(parcel, this.f74525d);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.f74526e);
        parcel.writeInt(this.f74527f);
        parcel.writeString(this.f74528g.name());
        parcel.writeString(this.f74529h.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GarageCompatibilityV4Item(long j12, String str, Map map, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 113;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, map, str2, i12, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
