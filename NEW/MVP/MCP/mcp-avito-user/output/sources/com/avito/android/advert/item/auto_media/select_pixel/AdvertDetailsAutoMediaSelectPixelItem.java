package com.avito.android.advert.item.auto_media.select_pixel;

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

/* compiled from: AdvertDetailsAutoMediaSelectPixelItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/auto_media/select_pixel/AdvertDetailsAutoMediaSelectPixelItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsAutoMediaSelectPixelItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsAutoMediaSelectPixelItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f72959b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f72960c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72961d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f72962e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f72963f;

    /* compiled from: AdvertDetailsAutoMediaSelectPixelItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsAutoMediaSelectPixelItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutoMediaSelectPixelItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsAutoMediaSelectPixelItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutoMediaSelectPixelItem[] newArray(int i12) {
            return new AdvertDetailsAutoMediaSelectPixelItem[i12];
        }
    }

    public AdvertDetailsAutoMediaSelectPixelItem(long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f72959b = j12;
        this.f72960c = str;
        this.f72961d = i12;
        this.f72962e = serpDisplayType;
        this.f72963f = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsAutoMediaSelectPixelItem(this.f72959b, this.f72960c, i12, this.f72962e, this.f72963f);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f72962e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsAutoMediaSelectPixelItem)) {
            return false;
        }
        AdvertDetailsAutoMediaSelectPixelItem advertDetailsAutoMediaSelectPixelItem = (AdvertDetailsAutoMediaSelectPixelItem) obj;
        return this.f72959b == advertDetailsAutoMediaSelectPixelItem.f72959b && L.f(this.f72960c, advertDetailsAutoMediaSelectPixelItem.f72960c) && this.f72961d == advertDetailsAutoMediaSelectPixelItem.f72961d && this.f72962e == advertDetailsAutoMediaSelectPixelItem.f72962e && this.f72963f == advertDetailsAutoMediaSelectPixelItem.f72963f;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75840b() {
        return this.f72959b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75844f() {
        return this.f72961d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283243b() {
        return this.f72960c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75842d() {
        return this.f72963f;
    }

    public final int hashCode() {
        return this.f72963f.hashCode() + com.avito.android.actions_sheet.a.h(this.f72962e, r.e(this.f72961d, H.d(Long.hashCode(this.f72959b) * 31, 31, this.f72960c), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAutoMediaSelectPixelItem(id=");
        sb2.append(this.f72959b);
        sb2.append(", stringId=");
        sb2.append(this.f72960c);
        sb2.append(", spanCount=");
        sb2.append(this.f72961d);
        sb2.append(", displayType=");
        sb2.append(this.f72962e);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f72963f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f72959b);
        parcel.writeString(this.f72960c);
        parcel.writeInt(this.f72961d);
        parcel.writeString(this.f72962e.name());
        parcel.writeString(this.f72963f.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsAutoMediaSelectPixelItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 161;
        }
        long j13 = j12;
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
