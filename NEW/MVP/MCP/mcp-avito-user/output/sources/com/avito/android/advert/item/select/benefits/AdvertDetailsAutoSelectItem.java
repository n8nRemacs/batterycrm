package com.avito.android.advert.item.select.benefits;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.AdvertAutoSelect;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsAutoSelectItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/select/benefits/AdvertDetailsAutoSelectItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsAutoSelectItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsAutoSelectItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f79337b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f79338c;

    /* renamed from: d, reason: collision with root package name */
    public final int f79339d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f79340e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f79341f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AdvertAutoSelect f79342g;

    /* compiled from: AdvertDetailsAutoSelectItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsAutoSelectItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutoSelectItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsAutoSelectItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), (AdvertAutoSelect) parcel.readParcelable(AdvertDetailsAutoSelectItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutoSelectItem[] newArray(int i12) {
            return new AdvertDetailsAutoSelectItem[i12];
        }
    }

    public AdvertDetailsAutoSelectItem(long j12, @Y61.k String str, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, @Y61.k AdvertAutoSelect advertAutoSelect) {
        this.f79337b = j12;
        this.f79338c = str;
        this.f79339d = i12;
        this.f79340e = serpDisplayType;
        this.f79341f = serpViewType;
        this.f79342g = advertAutoSelect;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsAutoSelectItem(this.f79337b, this.f79338c, i12, this.f79340e, this.f79341f, this.f79342g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f79340e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsAutoSelectItem)) {
            return false;
        }
        AdvertDetailsAutoSelectItem advertDetailsAutoSelectItem = (AdvertDetailsAutoSelectItem) obj;
        return this.f79337b == advertDetailsAutoSelectItem.f79337b && L.f(this.f79338c, advertDetailsAutoSelectItem.f79338c) && this.f79339d == advertDetailsAutoSelectItem.f79339d && this.f79340e == advertDetailsAutoSelectItem.f79340e && this.f79341f == advertDetailsAutoSelectItem.f79341f && L.f(this.f79342g, advertDetailsAutoSelectItem.f79342g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77564b() {
        return this.f79337b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF77567e() {
        return this.f79339d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF236767b() {
        return this.f79338c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF77569g() {
        return this.f79341f;
    }

    public final int hashCode() {
        return this.f79342g.hashCode() + com.avito.android.actions_sheet.a.j(this.f79341f, com.avito.android.actions_sheet.a.h(this.f79340e, r.e(this.f79339d, H.d(Long.hashCode(this.f79337b) * 31, 31, this.f79338c), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        return "AdvertDetailsAutoSelectItem(id=" + this.f79337b + ", stringId=" + this.f79338c + ", spanCount=" + this.f79339d + ", displayType=" + this.f79340e + ", viewType=" + this.f79341f + ", select=" + this.f79342g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f79337b);
        parcel.writeString(this.f79338c);
        parcel.writeInt(this.f79339d);
        parcel.writeString(this.f79340e.name());
        parcel.writeString(this.f79341f.name());
        parcel.writeParcelable(this.f79342g, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsAutoSelectItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, AdvertAutoSelect advertAutoSelect, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 127;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, advertAutoSelect);
    }
}
