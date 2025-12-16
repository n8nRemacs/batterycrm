package com.avito.android.advert.item.popularity_info;

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
import com.avito.android.remote.popularity.PopularityInfo;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsPopularityInfoItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/popularity_info/AdvertDetailsPopularityInfoItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsPopularityInfoItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsPopularityInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78177b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f78178c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PopularityInfo f78179d;

    /* renamed from: e, reason: collision with root package name */
    public final int f78180e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f78181f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f78182g;

    /* compiled from: AdvertDetailsPopularityInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsPopularityInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsPopularityInfoItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsPopularityInfoItem(parcel.readLong(), parcel.readString(), (PopularityInfo) parcel.readParcelable(AdvertDetailsPopularityInfoItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsPopularityInfoItem[] newArray(int i12) {
            return new AdvertDetailsPopularityInfoItem[i12];
        }
    }

    public AdvertDetailsPopularityInfoItem(long j12, @k String str, @k PopularityInfo popularityInfo, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f78177b = j12;
        this.f78178c = str;
        this.f78179d = popularityInfo;
        this.f78180e = i12;
        this.f78181f = serpDisplayType;
        this.f78182g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsPopularityInfoItem(this.f78177b, this.f78178c, this.f78179d, i12, this.f78181f, this.f78182g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f78181f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsPopularityInfoItem)) {
            return false;
        }
        AdvertDetailsPopularityInfoItem advertDetailsPopularityInfoItem = (AdvertDetailsPopularityInfoItem) obj;
        return this.f78177b == advertDetailsPopularityInfoItem.f78177b && L.f(this.f78178c, advertDetailsPopularityInfoItem.f78178c) && L.f(this.f78179d, advertDetailsPopularityInfoItem.f78179d) && this.f78180e == advertDetailsPopularityInfoItem.f78180e && this.f78181f == advertDetailsPopularityInfoItem.f78181f && this.f78182g == advertDetailsPopularityInfoItem.f78182g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75824b() {
        return this.f78177b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79232d() {
        return this.f78180e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79230b() {
        return this.f78178c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79235g() {
        return this.f78182g;
    }

    public final int hashCode() {
        return this.f78182g.hashCode() + com.avito.android.actions_sheet.a.h(this.f78181f, r.e(this.f78180e, (this.f78179d.hashCode() + H.d(Long.hashCode(this.f78177b) * 31, 31, this.f78178c)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsPopularityInfoItem(id=");
        sb2.append(this.f78177b);
        sb2.append(", stringId=");
        sb2.append(this.f78178c);
        sb2.append(", popularityInfo=");
        sb2.append(this.f78179d);
        sb2.append(", spanCount=");
        sb2.append(this.f78180e);
        sb2.append(", displayType=");
        sb2.append(this.f78181f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f78182g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78177b);
        parcel.writeString(this.f78178c);
        parcel.writeParcelable(this.f78179d, i12);
        parcel.writeInt(this.f78180e);
        parcel.writeString(this.f78181f.name());
        parcel.writeString(this.f78182g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsPopularityInfoItem(long j12, String str, PopularityInfo popularityInfo, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 192;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, popularityInfo, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
