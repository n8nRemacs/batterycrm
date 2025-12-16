package com.avito.android.advert_stats.detail.tab.items.chart;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: StatsPlotItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/chart/StatsPlotItem;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StatsPlotItem implements StatsItem {

    @Y61.k
    public static final Parcelable.Creator<StatsPlotItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f86293b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<StatsPeriodItem> f86294c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86295d;

    /* compiled from: StatsPlotItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatsPlotItem> {
        @Override // android.os.Parcelable.Creator
        public final StatsPlotItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(StatsPeriodItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new StatsPlotItem(string, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StatsPlotItem[] newArray(int i12) {
            return new StatsPlotItem[i12];
        }
    }

    public StatsPlotItem(@Y61.k String str, @Y61.k List<StatsPeriodItem> list, int i12) {
        this.f86293b = str;
        this.f86294c = list;
        this.f86295d = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF296503b() {
        return this.f86293b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f86293b);
        Iterator itJ = C0.j(this.f86294c, parcel);
        while (itJ.hasNext()) {
            ((StatsPeriodItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f86295d);
    }
}
