package com.avito.android.advert_stats.detail.tab.items.cost;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CostByPeriodItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/cost/CostByPeriodItem;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CostByPeriodItem implements StatsItem {

    @k
    public static final Parcelable.Creator<CostByPeriodItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f86390b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f86391c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f86392d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f86393e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f86394f;

    /* compiled from: CostByPeriodItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CostByPeriodItem> {
        @Override // android.os.Parcelable.Creator
        public final CostByPeriodItem createFromParcel(Parcel parcel) {
            return new CostByPeriodItem((UniversalImage) parcel.readParcelable(CostByPeriodItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CostByPeriodItem[] newArray(int i12) {
            return new CostByPeriodItem[i12];
        }
    }

    public CostByPeriodItem(@l UniversalImage universalImage, @k String str, @k String str2, @l String str3, @l String str4) {
        this.f86390b = str;
        this.f86391c = universalImage;
        this.f86392d = str2;
        this.f86393e = str3;
        this.f86394f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CostByPeriodItem)) {
            return false;
        }
        CostByPeriodItem costByPeriodItem = (CostByPeriodItem) obj;
        return L.f(this.f86390b, costByPeriodItem.f86390b) && L.f(this.f86391c, costByPeriodItem.f86391c) && L.f(this.f86392d, costByPeriodItem.f86392d) && L.f(this.f86393e, costByPeriodItem.f86393e) && L.f(this.f86394f, costByPeriodItem.f86394f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78357k() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF15730b() {
        return this.f86390b;
    }

    public final int hashCode() {
        int iHashCode = this.f86390b.hashCode() * 31;
        UniversalImage universalImage = this.f86391c;
        int iD2 = H.d((iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f86392d);
        String str = this.f86393e;
        int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f86394f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CostByPeriodItem(stringId=");
        sb2.append(this.f86390b);
        sb2.append(", image=");
        sb2.append(this.f86391c);
        sb2.append(", text=");
        sb2.append(this.f86392d);
        sb2.append(", date=");
        sb2.append(this.f86393e);
        sb2.append(", cost=");
        return C22026a.c(sb2, this.f86394f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f86390b);
        parcel.writeParcelable(this.f86391c, i12);
        parcel.writeString(this.f86392d);
        parcel.writeString(this.f86393e);
        parcel.writeString(this.f86394f);
    }

    public /* synthetic */ CostByPeriodItem(String str, UniversalImage universalImage, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this(universalImage, str, str2, str3, (i12 & 16) != 0 ? null : str4);
    }
}
