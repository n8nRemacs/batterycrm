package com.avito.android.advert.item.multi_item;

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
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsMultiItemItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/multi_item/AdvertDetailsMultiItemItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsMultiItemItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsMultiItemItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f77715b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f77716c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<ParcelableItem> f77717d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77718e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f77719f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f77720g;

    /* compiled from: AdvertDetailsMultiItemItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsMultiItemItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsMultiItemItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsMultiItemItem.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertDetailsMultiItemItem(parcel.readInt(), j12, SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsMultiItemItem[] newArray(int i12) {
            return new AdvertDetailsMultiItemItem[i12];
        }
    }

    public AdvertDetailsMultiItemItem(int i12, long j12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k String str, @k List list) {
        this.f77715b = j12;
        this.f77716c = str;
        this.f77717d = list;
        this.f77718e = i12;
        this.f77719f = serpDisplayType;
        this.f77720g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f77719f;
        return new AdvertDetailsMultiItemItem(i12, this.f77715b, serpDisplayType, this.f77720g, this.f77716c, this.f77717d);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f77719f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsMultiItemItem)) {
            return false;
        }
        AdvertDetailsMultiItemItem advertDetailsMultiItemItem = (AdvertDetailsMultiItemItem) obj;
        return this.f77715b == advertDetailsMultiItemItem.f77715b && L.f(this.f77716c, advertDetailsMultiItemItem.f77716c) && L.f(this.f77717d, advertDetailsMultiItemItem.f77717d) && this.f77718e == advertDetailsMultiItemItem.f77718e && this.f77719f == advertDetailsMultiItemItem.f77719f && this.f77720g == advertDetailsMultiItemItem.f77720g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF83733q() {
        return this.f77715b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF285029c() {
        return this.f77718e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF285028b() {
        return this.f77716c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF285042p() {
        return this.f77720g;
    }

    public final int hashCode() {
        return this.f77720g.hashCode() + com.avito.android.actions_sheet.a.h(this.f77719f, r.e(this.f77718e, H.e(H.d(Long.hashCode(this.f77715b) * 31, 31, this.f77716c), 31, this.f77717d), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsMultiItemItem(id=");
        sb2.append(this.f77715b);
        sb2.append(", stringId=");
        sb2.append(this.f77716c);
        sb2.append(", multiItemParamItems=");
        sb2.append(this.f77717d);
        sb2.append(", spanCount=");
        sb2.append(this.f77718e);
        sb2.append(", displayType=");
        sb2.append(this.f77719f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f77720g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f77715b);
        parcel.writeString(this.f77716c);
        Iterator itJ = C0.j(this.f77717d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f77718e);
        parcel.writeString(this.f77719f.name());
        parcel.writeString(this.f77720g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsMultiItemItem(long j12, String str, List list, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 57;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 2) != 0 ? String.valueOf(j13) : str, list);
    }
}
