package com.avito.android.advert_core.divider;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsDividerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/divider/AdvertDetailsDividerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsDividerItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsDividerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f83426b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f83427c;

    /* renamed from: d, reason: collision with root package name */
    public final int f83428d;

    /* renamed from: e, reason: collision with root package name */
    public final int f83429e;

    /* renamed from: f, reason: collision with root package name */
    public final int f83430f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public SerpDisplayType f83431g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f83432h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f83433i;

    /* compiled from: AdvertDetailsDividerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsDividerItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDividerItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsDividerItem(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDividerItem[] newArray(int i12) {
            return new AdvertDetailsDividerItem[i12];
        }
    }

    public AdvertDetailsDividerItem(long j12, @k String str, int i12, int i13, int i14, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @l Integer num) {
        this.f83426b = j12;
        this.f83427c = str;
        this.f83428d = i12;
        this.f83429e = i13;
        this.f83430f = i14;
        this.f83431g = serpDisplayType;
        this.f83432h = serpViewType;
        this.f83433i = num;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsDividerItem(this.f83426b, this.f83427c, this.f83428d, this.f83429e, i12, this.f83431g, this.f83432h, this.f83433i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f83431g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsDividerItem)) {
            return false;
        }
        AdvertDetailsDividerItem advertDetailsDividerItem = (AdvertDetailsDividerItem) obj;
        return this.f83426b == advertDetailsDividerItem.f83426b && L.f(this.f83427c, advertDetailsDividerItem.f83427c) && this.f83428d == advertDetailsDividerItem.f83428d && this.f83429e == advertDetailsDividerItem.f83429e && this.f83430f == advertDetailsDividerItem.f83430f && this.f83431g == advertDetailsDividerItem.f83431g && this.f83432h == advertDetailsDividerItem.f83432h && L.f(this.f83433i, advertDetailsDividerItem.f83433i);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF79781b() {
        return this.f83426b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79785f() {
        return this.f83430f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF81774b() {
        return this.f83427c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79784e() {
        return this.f83432h;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f83432h, com.avito.android.actions_sheet.a.h(this.f83431g, r.e(this.f83430f, r.e(this.f83429e, r.e(this.f83428d, H.d(Long.hashCode(this.f83426b) * 31, 31, this.f83427c), 31), 31), 31), 31), 31);
        Integer num = this.f83433i;
        return iJ2 + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsDividerItem(id=");
        sb2.append(this.f83426b);
        sb2.append(", stringId=");
        sb2.append(this.f83427c);
        sb2.append(", marginTopDp=");
        sb2.append(this.f83428d);
        sb2.append(", marginBottomDp=");
        sb2.append(this.f83429e);
        sb2.append(", spanCount=");
        sb2.append(this.f83430f);
        sb2.append(", displayType=");
        sb2.append(this.f83431g);
        sb2.append(", viewType=");
        sb2.append(this.f83432h);
        sb2.append(", horizontalPaddingDp=");
        return s.j(sb2, this.f83433i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f83426b);
        parcel.writeString(this.f83427c);
        parcel.writeInt(this.f83428d);
        parcel.writeInt(this.f83429e);
        parcel.writeInt(this.f83430f);
        parcel.writeString(this.f83431g.name());
        parcel.writeString(this.f83432h.name());
        Integer num = this.f83433i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsDividerItem(long j12, String str, int i12, int i13, int i14, SerpDisplayType serpDisplayType, SerpViewType serpViewType, Integer num, int i15, C42822w c42822w) {
        long j13;
        if ((i15 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 55;
        } else {
            j13 = j12;
        }
        this(j13, (i15 & 2) != 0 ? String.valueOf(j13) : str, (i15 & 4) != 0 ? 24 : i12, (i15 & 8) != 0 ? 24 : i13, i14, (i15 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i15 & 64) != 0 ? SerpViewType.f268585e : serpViewType, (i15 & 128) != 0 ? null : num);
    }
}
