package com.avito.android.advert_stats.detail.tab.items.chart;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsPeriodItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/chart/StatsPeriodItem;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class StatsPeriodItem implements StatsItem {

    @Y61.k
    public static final Parcelable.Creator<StatsPeriodItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f86290b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<StatsBarItem> f86291c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f86292d;

    /* compiled from: StatsPeriodItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatsPeriodItem> {
        @Override // android.os.Parcelable.Creator
        public final StatsPeriodItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(StatsBarItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new StatsPeriodItem(string, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StatsPeriodItem[] newArray(int i12) {
            return new StatsPeriodItem[i12];
        }
    }

    public StatsPeriodItem(@Y61.k String str, @Y61.k List<StatsBarItem> list, @Y61.k String str2) {
        this.f86290b = str;
        this.f86291c = list;
        this.f86292d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsPeriodItem)) {
            return false;
        }
        StatsPeriodItem statsPeriodItem = (StatsPeriodItem) obj;
        return L.f(this.f86290b, statsPeriodItem.f86290b) && L.f(this.f86291c, statsPeriodItem.f86291c) && L.f(this.f86292d, statsPeriodItem.f86292d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83798f() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF83797e() {
        return this.f86290b;
    }

    public final int hashCode() {
        return this.f86292d.hashCode() + H.e(this.f86290b.hashCode() * 31, 31, this.f86291c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatsPeriodItem(stringId=");
        sb2.append(this.f86290b);
        sb2.append(", barItems=");
        sb2.append(this.f86291c);
        sb2.append(", period=");
        return C22026a.c(sb2, this.f86292d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f86290b);
        Iterator itJ = C0.j(this.f86291c, parcel);
        while (itJ.hasNext()) {
            ((StatsBarItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f86292d);
    }
}
