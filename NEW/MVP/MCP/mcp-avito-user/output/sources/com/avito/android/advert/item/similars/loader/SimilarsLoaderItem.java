package com.avito.android.advert.item.similars.loader;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SimilarsLoaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/similars/loader/SimilarsLoaderItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SimilarsLoaderItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<SimilarsLoaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f80294b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f80295c;

    /* renamed from: d, reason: collision with root package name */
    public final int f80296d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f80297e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f80298f;

    /* compiled from: SimilarsLoaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SimilarsLoaderItem> {
        @Override // android.os.Parcelable.Creator
        public final SimilarsLoaderItem createFromParcel(Parcel parcel) {
            return new SimilarsLoaderItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SimilarsLoaderItem[] newArray(int i12) {
            return new SimilarsLoaderItem[i12];
        }
    }

    public SimilarsLoaderItem(long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f80294b = j12;
        this.f80295c = str;
        this.f80296d = i12;
        this.f80297e = serpDisplayType;
        this.f80298f = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new SimilarsLoaderItem(this.f80294b, this.f80295c, i12, this.f80297e, this.f80298f);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f80297e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimilarsLoaderItem)) {
            return false;
        }
        SimilarsLoaderItem similarsLoaderItem = (SimilarsLoaderItem) obj;
        return this.f80294b == similarsLoaderItem.f80294b && L.f(this.f80295c, similarsLoaderItem.f80295c) && this.f80296d == similarsLoaderItem.f80296d && this.f80297e == similarsLoaderItem.f80297e && this.f80298f == similarsLoaderItem.f80298f;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF84766b() {
        return this.f80294b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84768d() {
        return this.f80296d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF84767c() {
        return this.f80295c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84770f() {
        return this.f80298f;
    }

    public final int hashCode() {
        return this.f80298f.hashCode() + com.avito.android.actions_sheet.a.h(this.f80297e, r.e(this.f80296d, H.d(Long.hashCode(this.f80294b) * 31, 31, this.f80295c), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimilarsLoaderItem(id=");
        sb2.append(this.f80294b);
        sb2.append(", stringId=");
        sb2.append(this.f80295c);
        sb2.append(", spanCount=");
        sb2.append(this.f80296d);
        sb2.append(", displayType=");
        sb2.append(this.f80297e);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f80298f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f80294b);
        parcel.writeString(this.f80295c);
        parcel.writeInt(this.f80296d);
        parcel.writeString(this.f80297e.name());
        parcel.writeString(this.f80298f.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SimilarsLoaderItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 50;
        }
        long j13 = j12;
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
