package com.avito.android.advert.item.b2c;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsB2CBottomItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/b2c/AdvertDetailsB2CBottomItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsB2CBottomItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsB2CBottomItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f73184b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f73185c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f73186d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<SafeDeal.Component> f73187e;

    /* renamed from: f, reason: collision with root package name */
    public final int f73188f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public SerpDisplayType f73189g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f73190h;

    /* compiled from: AdvertDetailsB2CBottomItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsB2CBottomItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsB2CBottomItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsB2CBottomItem.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertDetailsB2CBottomItem(parcel.readInt(), j12, SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsB2CBottomItem[] newArray(int i12) {
            return new AdvertDetailsB2CBottomItem[i12];
        }
    }

    public AdvertDetailsB2CBottomItem(int i12, long j12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k String str, @l String str2, @k List list) {
        this.f73184b = j12;
        this.f73185c = str;
        this.f73186d = str2;
        this.f73187e = list;
        this.f73188f = i12;
        this.f73189g = serpDisplayType;
        this.f73190h = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f73189g;
        return new AdvertDetailsB2CBottomItem(i12, this.f73184b, serpDisplayType, this.f73190h, this.f73185c, this.f73186d, this.f73187e);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f73189g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsB2CBottomItem)) {
            return false;
        }
        AdvertDetailsB2CBottomItem advertDetailsB2CBottomItem = (AdvertDetailsB2CBottomItem) obj;
        return this.f73184b == advertDetailsB2CBottomItem.f73184b && L.f(this.f73185c, advertDetailsB2CBottomItem.f73185c) && L.f(this.f73186d, advertDetailsB2CBottomItem.f73186d) && L.f(this.f73187e, advertDetailsB2CBottomItem.f73187e) && this.f73188f == advertDetailsB2CBottomItem.f73188f && this.f73189g == advertDetailsB2CBottomItem.f73189g && this.f73190h == advertDetailsB2CBottomItem.f73190h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF282036b() {
        return this.f73184b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84111f() {
        return this.f73188f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145224b() {
        return this.f73185c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84110e() {
        return this.f73190h;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f73184b) * 31, 31, this.f73185c);
        String str = this.f73186d;
        return this.f73190h.hashCode() + com.avito.android.actions_sheet.a.h(this.f73189g, r.e(this.f73188f, H.e((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f73187e), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsB2CBottomItem(id=");
        sb2.append(this.f73184b);
        sb2.append(", stringId=");
        sb2.append(this.f73185c);
        sb2.append(", categoryId=");
        sb2.append(this.f73186d);
        sb2.append(", components=");
        sb2.append(this.f73187e);
        sb2.append(", spanCount=");
        sb2.append(this.f73188f);
        sb2.append(", displayType=");
        sb2.append(this.f73189g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f73190h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f73184b);
        parcel.writeString(this.f73185c);
        parcel.writeString(this.f73186d);
        Iterator itJ = C0.j(this.f73187e, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f73188f);
        parcel.writeString(this.f73189g.name());
        parcel.writeString(this.f73190h.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsB2CBottomItem(long j12, String str, String str2, List list, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 34;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? null : str2, list);
    }
}
