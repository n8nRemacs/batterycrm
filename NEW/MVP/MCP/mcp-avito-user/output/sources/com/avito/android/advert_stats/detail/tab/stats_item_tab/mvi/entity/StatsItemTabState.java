package com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem;
import com.avito.android.advert_stats.remote.model.detail_stats.Period;
import com.avito.android.analytics.screens.mvi.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StatsItemTabState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class StatsItemTabState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<StatsItem> f86564b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Period f86565c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86566d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AdvertDetailStatsTabItem f86567e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f86562f = new a(null);

    @k
    public static final Parcelable.Creator<StatsItemTabState> CREATOR = new b();

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final StatsItemTabState f86563g = new StatsItemTabState(C42784z0.f406748b, null, 0, null);

    /* compiled from: StatsItemTabState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItemTabState$a;", "", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StatsItemTabState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<StatsItemTabState> {
        @Override // android.os.Parcelable.Creator
        public final StatsItemTabState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(StatsItemTabState.class, parcel, arrayList, iL2, 1);
            }
            return new StatsItemTabState(arrayList, (Period) parcel.readParcelable(StatsItemTabState.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : AdvertDetailStatsTabItem.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StatsItemTabState[] newArray(int i12) {
            return new StatsItemTabState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StatsItemTabState(@k List<? extends StatsItem> list, @l Period period, int i12, @l AdvertDetailStatsTabItem advertDetailStatsTabItem) {
        this.f86564b = list;
        this.f86565c = period;
        this.f86566d = i12;
        this.f86567e = advertDetailStatsTabItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static StatsItemTabState a(StatsItemTabState statsItemTabState, ArrayList arrayList, Period period, int i12, AdvertDetailStatsTabItem advertDetailStatsTabItem, int i13) {
        List list = arrayList;
        if ((i13 & 1) != 0) {
            list = statsItemTabState.f86564b;
        }
        if ((i13 & 2) != 0) {
            period = statsItemTabState.f86565c;
        }
        if ((i13 & 4) != 0) {
            i12 = statsItemTabState.f86566d;
        }
        if ((i13 & 8) != 0) {
            advertDetailStatsTabItem = statsItemTabState.f86567e;
        }
        statsItemTabState.getClass();
        return new StatsItemTabState(list, period, i12, advertDetailStatsTabItem);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsItemTabState)) {
            return false;
        }
        StatsItemTabState statsItemTabState = (StatsItemTabState) obj;
        return L.f(this.f86564b, statsItemTabState.f86564b) && L.f(this.f86565c, statsItemTabState.f86565c) && this.f86566d == statsItemTabState.f86566d && L.f(this.f86567e, statsItemTabState.f86567e);
    }

    public final int hashCode() {
        int iHashCode = this.f86564b.hashCode() * 31;
        Period period = this.f86565c;
        int iE2 = r.e(this.f86566d, (iHashCode + (period == null ? 0 : period.hashCode())) * 31, 31);
        AdvertDetailStatsTabItem advertDetailStatsTabItem = this.f86567e;
        return iE2 + (advertDetailStatsTabItem != null ? advertDetailStatsTabItem.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "StatsItemTabState(data=" + this.f86564b + ", selectedPeriod=" + this.f86565c + ", periodIndex=" + this.f86566d + ", tabModel=" + this.f86567e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f86564b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f86565c, i12);
        parcel.writeInt(this.f86566d);
        AdvertDetailStatsTabItem advertDetailStatsTabItem = this.f86567e;
        if (advertDetailStatsTabItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertDetailStatsTabItem.writeToParcel(parcel, i12);
        }
    }
}
