package com.avito.android.advert_details_items.imv_v4_cars;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.Range;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsV4Item.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/imv_v4_cars/ImvCarsV4Item;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ImvCarsV4Item implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<ImvCarsV4Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f84833b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f84834c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImvCarsData f84835d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<Range> f84836e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f84837f;

    /* renamed from: g, reason: collision with root package name */
    public final int f84838g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f84839h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f84840i;

    /* compiled from: ImvCarsV4Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsV4Item> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsV4Item createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            ImvCarsData imvCarsDataCreateFromParcel = ImvCarsData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(ImvCarsV4Item.class, parcel, arrayList, iL2, 1);
                }
            }
            return new ImvCarsV4Item(j12, string, imvCarsDataCreateFromParcel, arrayList, parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsV4Item[] newArray(int i12) {
            return new ImvCarsV4Item[i12];
        }
    }

    public ImvCarsV4Item(long j12, @Y61.k String str, @Y61.k ImvCarsData imvCarsData, @l List<Range> list, @l String str2, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f84833b = j12;
        this.f84834c = str;
        this.f84835d = imvCarsData;
        this.f84836e = list;
        this.f84837f = str2;
        this.f84838g = i12;
        this.f84839h = serpDisplayType;
        this.f84840i = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f84839h;
        return new ImvCarsV4Item(this.f84833b, this.f84834c, this.f84835d, this.f84836e, this.f84837f, i12, serpDisplayType, this.f84840i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f84839h = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvCarsV4Item)) {
            return false;
        }
        ImvCarsV4Item imvCarsV4Item = (ImvCarsV4Item) obj;
        return this.f84833b == imvCarsV4Item.f84833b && L.f(this.f84834c, imvCarsV4Item.f84834c) && L.f(this.f84835d, imvCarsV4Item.f84835d) && L.f(this.f84836e, imvCarsV4Item.f84836e) && L.f(this.f84837f, imvCarsV4Item.f84837f) && this.f84838g == imvCarsV4Item.f84838g && this.f84839h == imvCarsV4Item.f84839h && this.f84840i == imvCarsV4Item.f84840i;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF76579b() {
        return this.f84833b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF76583f() {
        return this.f84838g;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF76580c() {
        return this.f84834c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF76581d() {
        return this.f84840i;
    }

    public final int hashCode() {
        int iHashCode = (this.f84835d.hashCode() + H.d(Long.hashCode(this.f84833b) * 31, 31, this.f84834c)) * 31;
        List<Range> list = this.f84836e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f84837f;
        return this.f84840i.hashCode() + com.avito.android.actions_sheet.a.h(this.f84839h, r.e(this.f84838g, (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImvCarsV4Item(id=");
        sb2.append(this.f84833b);
        sb2.append(", stringId=");
        sb2.append(this.f84834c);
        sb2.append(", imv=");
        sb2.append(this.f84835d);
        sb2.append(", ranges=");
        sb2.append(this.f84836e);
        sb2.append(", advertId=");
        sb2.append(this.f84837f);
        sb2.append(", spanCount=");
        sb2.append(this.f84838g);
        sb2.append(", displayType=");
        sb2.append(this.f84839h);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f84840i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f84833b);
        parcel.writeString(this.f84834c);
        this.f84835d.writeToParcel(parcel, i12);
        List<Range> list = this.f84836e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this.f84837f);
        parcel.writeInt(this.f84838g);
        parcel.writeString(this.f84839h.name());
        parcel.writeString(this.f84840i.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImvCarsV4Item(long j12, String str, ImvCarsData imvCarsData, List list, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 119;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, imvCarsData, list, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? 1 : i12, (i13 & 64) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 128) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
