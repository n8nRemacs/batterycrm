package com.avito.android.advert_details_items.status_badge;

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

/* compiled from: AdvertDetailsClosingReasonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/status_badge/AdvertDetailsClosingReasonItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsClosingReasonItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsClosingReasonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f85701b;

    /* renamed from: c, reason: collision with root package name */
    public final long f85702c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f85703d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85704e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f85705f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f85706g;

    /* compiled from: AdvertDetailsClosingReasonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsClosingReasonItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsClosingReasonItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            return new AdvertDetailsClosingReasonItem(parcel.readInt(), parcel.readLong(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), string, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsClosingReasonItem[] newArray(int i12) {
            return new AdvertDetailsClosingReasonItem[i12];
        }
    }

    public AdvertDetailsClosingReasonItem(int i12, long j12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k String str, @k String str2) {
        this.f85701b = str;
        this.f85702c = j12;
        this.f85703d = str2;
        this.f85704e = i12;
        this.f85705f = serpDisplayType;
        this.f85706g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f85705f;
        String str = this.f85701b;
        return new AdvertDetailsClosingReasonItem(i12, this.f85702c, serpDisplayType, this.f85706g, str, this.f85703d);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f85705f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsClosingReasonItem)) {
            return false;
        }
        AdvertDetailsClosingReasonItem advertDetailsClosingReasonItem = (AdvertDetailsClosingReasonItem) obj;
        return L.f(this.f85701b, advertDetailsClosingReasonItem.f85701b) && this.f85702c == advertDetailsClosingReasonItem.f85702c && L.f(this.f85703d, advertDetailsClosingReasonItem.f85703d) && this.f85704e == advertDetailsClosingReasonItem.f85704e && this.f85705f == advertDetailsClosingReasonItem.f85705f && this.f85706g == advertDetailsClosingReasonItem.f85706g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75840b() {
        return this.f85702c;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75844f() {
        return this.f85704e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283243b() {
        return this.f85703d;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75842d() {
        return this.f85706g;
    }

    public final int hashCode() {
        return this.f85706g.hashCode() + com.avito.android.actions_sheet.a.h(this.f85705f, r.e(this.f85704e, H.d(r.g(this.f85701b.hashCode() * 31, 31, this.f85702c), 31, this.f85703d), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsClosingReasonItem(reason=");
        sb2.append(this.f85701b);
        sb2.append(", id=");
        sb2.append(this.f85702c);
        sb2.append(", stringId=");
        sb2.append(this.f85703d);
        sb2.append(", spanCount=");
        sb2.append(this.f85704e);
        sb2.append(", displayType=");
        sb2.append(this.f85705f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f85706g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f85701b);
        parcel.writeLong(this.f85702c);
        parcel.writeString(this.f85703d);
        parcel.writeInt(this.f85704e);
        parcel.writeString(this.f85705f.name());
        parcel.writeString(this.f85706g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsClosingReasonItem(String str, long j12, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 2) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 64;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType, str, (i13 & 4) != 0 ? String.valueOf(j13) : str2);
    }
}
