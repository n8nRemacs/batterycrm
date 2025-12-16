package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.Action;
import com.avito.android.user_stats.extended_user_stats.ConfigParams;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select.SegmentType;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.DataStatus;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.PaginationState;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.split.SplitListDialogItem;
import com.avito.user_stats.model.extended_user_stats.StatsDates;
import com.avito.user_stats.model.extended_user_stats.StatsDynamicChart;
import com.avito.user_stats.model.extended_user_stats.StatsDynamicItems;
import com.avito.user_stats.model.extended_user_stats.StatsSplitLocal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: ConstructorTabState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ConstructorTabState extends q implements Parcelable {

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final ConstructorTabState f318209s;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<ExpensesItem> f318210b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DataStatus f318211c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DataStatus f318212d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final StatsDynamicItems f318213e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final StatsSplitLocal f318214f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final StatsSplitLocal f318215g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final StatsConfig f318216h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final PaginationState f318217i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final ConfigParams f318218j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f318219k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Integer f318220l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final StatsDates f318221m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final SegmentType f318222n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final StatsDynamicChart f318223o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final List<SplitListDialogItem> f318224p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final List<Action> f318225q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f318208r = new a(null);

    @k
    public static final Parcelable.Creator<ConstructorTabState> CREATOR = new b();

    /* compiled from: ConstructorTabState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/mvi/entity/ConstructorTabState$a;", "", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConstructorTabState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ConstructorTabState> {
        @Override // android.os.Parcelable.Creator
        public final ConstructorTabState createFromParcel(Parcel parcel) {
            StatsDates statsDates;
            Integer num;
            ArrayList arrayList;
            ArrayList arrayList2;
            int i12 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ConstructorTabState.class, parcel, arrayList3, iL2, 1);
            }
            DataStatus dataStatusValueOf = DataStatus.valueOf(parcel.readString());
            DataStatus dataStatusValueOf2 = DataStatus.valueOf(parcel.readString());
            StatsDynamicItems statsDynamicItems = (StatsDynamicItems) parcel.readParcelable(ConstructorTabState.class.getClassLoader());
            StatsSplitLocal statsSplitLocal = (StatsSplitLocal) parcel.readParcelable(ConstructorTabState.class.getClassLoader());
            StatsSplitLocal statsSplitLocal2 = (StatsSplitLocal) parcel.readParcelable(ConstructorTabState.class.getClassLoader());
            StatsConfig statsConfigCreateFromParcel = parcel.readInt() == 0 ? null : StatsConfig.CREATOR.createFromParcel(parcel);
            PaginationState paginationState = (PaginationState) parcel.readParcelable(ConstructorTabState.class.getClassLoader());
            ConfigParams configParamsCreateFromParcel = parcel.readInt() == 0 ? null : ConfigParams.CREATOR.createFromParcel(parcel);
            boolean z12 = parcel.readInt() != 0;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            StatsDates statsDates2 = (StatsDates) parcel.readParcelable(ConstructorTabState.class.getClassLoader());
            SegmentType segmentTypeValueOf = parcel.readInt() == 0 ? null : SegmentType.valueOf(parcel.readString());
            StatsDynamicChart statsDynamicChart = (StatsDynamicChart) parcel.readParcelable(ConstructorTabState.class.getClassLoader());
            if (parcel.readInt() == 0) {
                num = numValueOf;
                statsDates = statsDates2;
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                statsDates = statsDates2;
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(SplitListDialogItem.CREATOR, parcel, arrayList4, iC2, 1);
                    i13 = i13;
                    numValueOf = numValueOf;
                }
                num = numValueOf;
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i14);
                int iL3 = 0;
                while (iL3 != i14) {
                    iL3 = com.avito.android.actions_sheet.a.l(ConstructorTabState.class, parcel, arrayList5, iL3, 1);
                }
                arrayList2 = arrayList5;
            }
            return new ConstructorTabState(arrayList3, dataStatusValueOf, dataStatusValueOf2, statsDynamicItems, statsSplitLocal, statsSplitLocal2, statsConfigCreateFromParcel, paginationState, configParamsCreateFromParcel, z12, num, statsDates, segmentTypeValueOf, statsDynamicChart, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final ConstructorTabState[] newArray(int i12) {
            return new ConstructorTabState[i12];
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        DataStatus dataStatus = DataStatus.f317809c;
        f318209s = new ConstructorTabState(arrayList, dataStatus, dataStatus, null, null, null, null, new PaginationState.Loaded(false), null, false, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConstructorTabState(@k List<? extends ExpensesItem> list, @k DataStatus dataStatus, @k DataStatus dataStatus2, @l StatsDynamicItems statsDynamicItems, @l StatsSplitLocal statsSplitLocal, @l StatsSplitLocal statsSplitLocal2, @l StatsConfig statsConfig, @k PaginationState paginationState, @l ConfigParams configParams, boolean z12, @l Integer num, @l StatsDates statsDates, @l SegmentType segmentType, @l StatsDynamicChart statsDynamicChart, @l List<SplitListDialogItem> list2, @l List<Action> list3) {
        this.f318210b = list;
        this.f318211c = dataStatus;
        this.f318212d = dataStatus2;
        this.f318213e = statsDynamicItems;
        this.f318214f = statsSplitLocal;
        this.f318215g = statsSplitLocal2;
        this.f318216h = statsConfig;
        this.f318217i = paginationState;
        this.f318218j = configParams;
        this.f318219k = z12;
        this.f318220l = num;
        this.f318221m = statsDates;
        this.f318222n = segmentType;
        this.f318223o = statsDynamicChart;
        this.f318224p = list2;
        this.f318225q = list3;
    }

    public static ConstructorTabState a(ConstructorTabState constructorTabState, ArrayList arrayList, DataStatus dataStatus, DataStatus dataStatus2, StatsDynamicItems statsDynamicItems, StatsSplitLocal statsSplitLocal, StatsConfig statsConfig, PaginationState paginationState, ConfigParams configParams, boolean z12, Integer num, StatsDates statsDates, SegmentType segmentType, StatsDynamicChart statsDynamicChart, ArrayList arrayList2, List list, int i12) {
        List<ExpensesItem> list2 = (i12 & 1) != 0 ? constructorTabState.f318210b : arrayList;
        DataStatus dataStatus3 = (i12 & 2) != 0 ? constructorTabState.f318211c : dataStatus;
        DataStatus dataStatus4 = (i12 & 4) != 0 ? constructorTabState.f318212d : dataStatus2;
        StatsDynamicItems statsDynamicItems2 = (i12 & 8) != 0 ? constructorTabState.f318213e : statsDynamicItems;
        StatsSplitLocal statsSplitLocal2 = constructorTabState.f318214f;
        StatsSplitLocal statsSplitLocal3 = (i12 & 32) != 0 ? constructorTabState.f318215g : statsSplitLocal;
        StatsConfig statsConfig2 = (i12 & 64) != 0 ? constructorTabState.f318216h : statsConfig;
        PaginationState paginationState2 = (i12 & 128) != 0 ? constructorTabState.f318217i : paginationState;
        ConfigParams configParams2 = (i12 & 256) != 0 ? constructorTabState.f318218j : configParams;
        boolean z13 = (i12 & 512) != 0 ? constructorTabState.f318219k : z12;
        Integer num2 = (i12 & 1024) != 0 ? constructorTabState.f318220l : num;
        StatsDates statsDates2 = (i12 & 2048) != 0 ? constructorTabState.f318221m : statsDates;
        SegmentType segmentType2 = (i12 & 4096) != 0 ? constructorTabState.f318222n : segmentType;
        StatsDynamicChart statsDynamicChart2 = (i12 & 8192) != 0 ? constructorTabState.f318223o : statsDynamicChart;
        List<SplitListDialogItem> list3 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? constructorTabState.f318224p : arrayList2;
        List list4 = (i12 & 32768) != 0 ? constructorTabState.f318225q : list;
        constructorTabState.getClass();
        return new ConstructorTabState(list2, dataStatus3, dataStatus4, statsDynamicItems2, statsSplitLocal2, statsSplitLocal3, statsConfig2, paginationState2, configParams2, z13, num2, statsDates2, segmentType2, statsDynamicChart2, list3, list4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConstructorTabState)) {
            return false;
        }
        ConstructorTabState constructorTabState = (ConstructorTabState) obj;
        return L.f(this.f318210b, constructorTabState.f318210b) && this.f318211c == constructorTabState.f318211c && this.f318212d == constructorTabState.f318212d && L.f(this.f318213e, constructorTabState.f318213e) && L.f(this.f318214f, constructorTabState.f318214f) && L.f(this.f318215g, constructorTabState.f318215g) && L.f(this.f318216h, constructorTabState.f318216h) && L.f(this.f318217i, constructorTabState.f318217i) && L.f(this.f318218j, constructorTabState.f318218j) && this.f318219k == constructorTabState.f318219k && L.f(this.f318220l, constructorTabState.f318220l) && L.f(this.f318221m, constructorTabState.f318221m) && this.f318222n == constructorTabState.f318222n && L.f(this.f318223o, constructorTabState.f318223o) && L.f(this.f318224p, constructorTabState.f318224p) && L.f(this.f318225q, constructorTabState.f318225q);
    }

    public final int hashCode() {
        int iHashCode = (this.f318212d.hashCode() + ((this.f318211c.hashCode() + (this.f318210b.hashCode() * 31)) * 31)) * 31;
        StatsDynamicItems statsDynamicItems = this.f318213e;
        int iHashCode2 = (iHashCode + (statsDynamicItems == null ? 0 : statsDynamicItems.hashCode())) * 31;
        StatsSplitLocal statsSplitLocal = this.f318214f;
        int iHashCode3 = (iHashCode2 + (statsSplitLocal == null ? 0 : statsSplitLocal.hashCode())) * 31;
        StatsSplitLocal statsSplitLocal2 = this.f318215g;
        int iHashCode4 = (iHashCode3 + (statsSplitLocal2 == null ? 0 : statsSplitLocal2.hashCode())) * 31;
        StatsConfig statsConfig = this.f318216h;
        int iHashCode5 = (this.f318217i.hashCode() + ((iHashCode4 + (statsConfig == null ? 0 : statsConfig.hashCode())) * 31)) * 31;
        ConfigParams configParams = this.f318218j;
        int i12 = r.i((iHashCode5 + (configParams == null ? 0 : configParams.hashCode())) * 31, 31, this.f318219k);
        Integer num = this.f318220l;
        int iHashCode6 = (i12 + (num == null ? 0 : num.hashCode())) * 31;
        StatsDates statsDates = this.f318221m;
        int iHashCode7 = (iHashCode6 + (statsDates == null ? 0 : statsDates.hashCode())) * 31;
        SegmentType segmentType = this.f318222n;
        int iHashCode8 = (iHashCode7 + (segmentType == null ? 0 : segmentType.hashCode())) * 31;
        StatsDynamicChart statsDynamicChart = this.f318223o;
        int iHashCode9 = (iHashCode8 + (statsDynamicChart == null ? 0 : statsDynamicChart.hashCode())) * 31;
        List<SplitListDialogItem> list = this.f318224p;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<Action> list2 = this.f318225q;
        return iHashCode10 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConstructorTabState(items=");
        sb2.append(this.f318210b);
        sb2.append(", statusItems=");
        sb2.append(this.f318211c);
        sb2.append(", statusChart=");
        sb2.append(this.f318212d);
        sb2.append(", lastConstructor=");
        sb2.append(this.f318213e);
        sb2.append(", lastRegions=");
        sb2.append(this.f318214f);
        sb2.append(", lastSplitLocations=");
        sb2.append(this.f318215g);
        sb2.append(", lastConfig=");
        sb2.append(this.f318216h);
        sb2.append(", paginationState=");
        sb2.append(this.f318217i);
        sb2.append(", configParams=");
        sb2.append(this.f318218j);
        sb2.append(", needScrollToTop=");
        sb2.append(this.f318219k);
        sb2.append(", selectedColumnIndex=");
        sb2.append(this.f318220l);
        sb2.append(", selectedChartPeriod=");
        sb2.append(this.f318221m);
        sb2.append(", selectedSegmentType=");
        sb2.append(this.f318222n);
        sb2.append(", statsDynamicChart=");
        sb2.append(this.f318223o);
        sb2.append(", splitMetrics=");
        sb2.append(this.f318224p);
        sb2.append(", actions=");
        return H.p(sb2, this.f318225q, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f318210b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f318211c.name());
        parcel.writeString(this.f318212d.name());
        parcel.writeParcelable(this.f318213e, i12);
        parcel.writeParcelable(this.f318214f, i12);
        parcel.writeParcelable(this.f318215g, i12);
        StatsConfig statsConfig = this.f318216h;
        if (statsConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statsConfig.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f318217i, i12);
        ConfigParams configParams = this.f318218j;
        if (configParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            configParams.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f318219k ? 1 : 0);
        Integer num = this.f318220l;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f318221m, i12);
        SegmentType segmentType = this.f318222n;
        if (segmentType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(segmentType.name());
        }
        parcel.writeParcelable(this.f318223o, i12);
        List<SplitListDialogItem> list = this.f318224p;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((SplitListDialogItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<Action> list2 = this.f318225q;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), i12);
        }
    }
}
