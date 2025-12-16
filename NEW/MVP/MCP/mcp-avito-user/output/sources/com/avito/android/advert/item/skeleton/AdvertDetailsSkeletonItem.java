package com.avito.android.advert.item.skeleton;

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

/* compiled from: AdvertDetailsSkeletonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/skeleton/AdvertDetailsSkeletonItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsSkeletonItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsSkeletonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f80358b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f80359c;

    /* renamed from: d, reason: collision with root package name */
    public final int f80360d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f80361e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f80362f;

    /* compiled from: AdvertDetailsSkeletonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsSkeletonItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSkeletonItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsSkeletonItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsSkeletonItem[] newArray(int i12) {
            return new AdvertDetailsSkeletonItem[i12];
        }
    }

    public AdvertDetailsSkeletonItem(long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f80358b = j12;
        this.f80359c = str;
        this.f80360d = i12;
        this.f80361e = serpDisplayType;
        this.f80362f = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsSkeletonItem(this.f80358b, this.f80359c, i12, this.f80361e, this.f80362f);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f80361e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsSkeletonItem)) {
            return false;
        }
        AdvertDetailsSkeletonItem advertDetailsSkeletonItem = (AdvertDetailsSkeletonItem) obj;
        return this.f80358b == advertDetailsSkeletonItem.f80358b && L.f(this.f80359c, advertDetailsSkeletonItem.f80359c) && this.f80360d == advertDetailsSkeletonItem.f80360d && this.f80361e == advertDetailsSkeletonItem.f80361e && this.f80362f == advertDetailsSkeletonItem.f80362f;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75840b() {
        return this.f80358b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75844f() {
        return this.f80360d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283243b() {
        return this.f80359c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75842d() {
        return this.f80362f;
    }

    public final int hashCode() {
        return this.f80362f.hashCode() + com.avito.android.actions_sheet.a.h(this.f80361e, r.e(this.f80360d, H.d(Long.hashCode(this.f80358b) * 31, 31, this.f80359c), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsSkeletonItem(id=");
        sb2.append(this.f80358b);
        sb2.append(", stringId=");
        sb2.append(this.f80359c);
        sb2.append(", spanCount=");
        sb2.append(this.f80360d);
        sb2.append(", displayType=");
        sb2.append(this.f80361e);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f80362f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f80358b);
        parcel.writeString(this.f80359c);
        parcel.writeInt(this.f80360d);
        parcel.writeString(this.f80361e.name());
        parcel.writeString(this.f80362f.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsSkeletonItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 1;
        }
        long j13 = j12;
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
