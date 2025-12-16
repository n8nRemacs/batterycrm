package com.avito.android.user_stats.extended_user_stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Action;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.date_select.SegmentType;
import com.avito.user_stats.model.extended_user_stats.MetricGrouping;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import shark.AndroidResourceIdNames;

/* compiled from: ExtendedUserStatsViewModel.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/StatsConfig;", "Landroid/os/Parcelable;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StatsConfig implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<StatsConfig> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Long f317152b;

    /* renamed from: c, reason: collision with root package name */
    public final long f317153c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<String> f317154d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<String> f317155e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<String> f317156f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<String> f317157g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final List<String> f317158h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final List<String> f317159i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final List<String> f317160j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f317161k;

    /* renamed from: l, reason: collision with root package name */
    public final int f317162l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Integer f317163m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final ConfigParams f317164n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final SegmentType f317165o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final List<MetricGrouping> f317166p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f317167q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final List<Action> f317168r;

    /* compiled from: ExtendedUserStatsViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatsConfig> {
        @Override // android.os.Parcelable.Creator
        public final StatsConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i12;
            String str;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            long j12 = parcel.readLong();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList5 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList6 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList7 = parcel.createStringArrayList();
            String string = parcel.readString();
            int i13 = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ConfigParams configParamsCreateFromParcel = parcel.readInt() == 0 ? null : ConfigParams.CREATOR.createFromParcel(parcel);
            SegmentType segmentTypeValueOf = parcel.readInt() == 0 ? null : SegmentType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                i12 = i13;
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                i12 = i13;
                int iL2 = 0;
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(StatsConfig.class, parcel, arrayList, iL2, 1);
                    i14 = i14;
                }
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string2;
                arrayList3 = arrayList;
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                str = string2;
                arrayList2 = new ArrayList(i15);
                arrayList3 = arrayList;
                int iL3 = 0;
                while (iL3 != i15) {
                    iL3 = com.avito.android.actions_sheet.a.l(StatsConfig.class, parcel, arrayList2, iL3, 1);
                    i15 = i15;
                }
            }
            return new StatsConfig(lValueOf, j12, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, arrayListCreateStringArrayList4, arrayListCreateStringArrayList5, arrayListCreateStringArrayList6, arrayListCreateStringArrayList7, string, i12, numValueOf, configParamsCreateFromParcel, segmentTypeValueOf, arrayList3, str, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final StatsConfig[] newArray(int i12) {
            return new StatsConfig[i12];
        }
    }

    public StatsConfig(@Y61.l Long l12, long j12, @Y61.k List<String> list, @Y61.k List<String> list2, @Y61.k List<String> list3, @Y61.k List<String> list4, @Y61.k List<String> list5, @Y61.k List<String> list6, @Y61.l List<String> list7, @Y61.l String str, int i12, @Y61.l Integer num, @Y61.l ConfigParams configParams, @Y61.l SegmentType segmentType, @Y61.l List<MetricGrouping> list8, @Y61.l String str2, @Y61.l List<Action> list9) {
        this.f317152b = l12;
        this.f317153c = j12;
        this.f317154d = list;
        this.f317155e = list2;
        this.f317156f = list3;
        this.f317157g = list4;
        this.f317158h = list5;
        this.f317159i = list6;
        this.f317160j = list7;
        this.f317161k = str;
        this.f317162l = i12;
        this.f317163m = num;
        this.f317164n = configParams;
        this.f317165o = segmentType;
        this.f317166p = list8;
        this.f317167q = str2;
        this.f317168r = list9;
    }

    public static StatsConfig a(StatsConfig statsConfig, Long l12, long j12, List list, String str, Integer num, SegmentType segmentType, String str2, int i12) {
        Long l13 = (i12 & 1) != 0 ? statsConfig.f317152b : l12;
        long j13 = (i12 & 2) != 0 ? statsConfig.f317153c : j12;
        List<String> list2 = statsConfig.f317154d;
        List<String> list3 = statsConfig.f317155e;
        List<String> list4 = statsConfig.f317156f;
        List<String> list5 = statsConfig.f317157g;
        List list6 = (i12 & 64) != 0 ? statsConfig.f317158h : list;
        List<String> list7 = statsConfig.f317159i;
        List<String> list8 = statsConfig.f317160j;
        String str3 = (i12 & 512) != 0 ? statsConfig.f317161k : str;
        int i13 = statsConfig.f317162l;
        Integer num2 = (i12 & 2048) != 0 ? statsConfig.f317163m : num;
        ConfigParams configParams = statsConfig.f317164n;
        SegmentType segmentType2 = (i12 & 8192) != 0 ? statsConfig.f317165o : segmentType;
        List<MetricGrouping> list9 = statsConfig.f317166p;
        String str4 = (i12 & 32768) != 0 ? statsConfig.f317167q : str2;
        List<Action> list10 = statsConfig.f317168r;
        statsConfig.getClass();
        return new StatsConfig(l13, j13, list2, list3, list4, list5, list6, list7, list8, str3, i13, num2, configParams, segmentType2, list9, str4, list10);
    }

    public final boolean c() {
        MetricParams metricParams;
        ArrayList arrayList;
        Object next;
        String str = (String) C42745f0.G(this.f317158h);
        ConfigParams configParams = this.f317164n;
        if (configParams == null || (arrayList = configParams.f317007c) == null) {
            metricParams = null;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((MetricParams) next).f317148b, str)) {
                    break;
                }
            }
            metricParams = (MetricParams) next;
        }
        return (metricParams != null ? metricParams.f317150d : null) != null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsConfig)) {
            return false;
        }
        StatsConfig statsConfig = (StatsConfig) obj;
        return L.f(this.f317152b, statsConfig.f317152b) && this.f317153c == statsConfig.f317153c && L.f(this.f317154d, statsConfig.f317154d) && L.f(this.f317155e, statsConfig.f317155e) && L.f(this.f317156f, statsConfig.f317156f) && L.f(this.f317157g, statsConfig.f317157g) && L.f(this.f317158h, statsConfig.f317158h) && L.f(this.f317159i, statsConfig.f317159i) && L.f(this.f317160j, statsConfig.f317160j) && L.f(this.f317161k, statsConfig.f317161k) && this.f317162l == statsConfig.f317162l && L.f(this.f317163m, statsConfig.f317163m) && L.f(this.f317164n, statsConfig.f317164n) && this.f317165o == statsConfig.f317165o && L.f(this.f317166p, statsConfig.f317166p) && L.f(this.f317167q, statsConfig.f317167q) && L.f(this.f317168r, statsConfig.f317168r);
    }

    public final int hashCode() {
        Long l12 = this.f317152b;
        int iE2 = androidx.compose.foundation.H.e(androidx.compose.foundation.H.e(androidx.compose.foundation.H.e(androidx.compose.foundation.H.e(androidx.compose.foundation.H.e(androidx.compose.foundation.H.e(androidx.appcompat.app.r.g((l12 == null ? 0 : l12.hashCode()) * 31, 31, this.f317153c), 31, this.f317154d), 31, this.f317155e), 31, this.f317156f), 31, this.f317157g), 31, this.f317158h), 31, this.f317159i);
        List<String> list = this.f317160j;
        int iHashCode = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f317161k;
        int iE3 = androidx.appcompat.app.r.e(this.f317162l, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Integer num = this.f317163m;
        int iHashCode2 = (iE3 + (num == null ? 0 : num.hashCode())) * 31;
        ConfigParams configParams = this.f317164n;
        int iHashCode3 = (iHashCode2 + (configParams == null ? 0 : configParams.hashCode())) * 31;
        SegmentType segmentType = this.f317165o;
        int iHashCode4 = (iHashCode3 + (segmentType == null ? 0 : segmentType.hashCode())) * 31;
        List<MetricGrouping> list2 = this.f317166p;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.f317167q;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Action> list3 = this.f317168r;
        return iHashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatsConfig(from=");
        sb2.append(this.f317152b);
        sb2.append(", to=");
        sb2.append(this.f317153c);
        sb2.append(", locations=");
        sb2.append(this.f317154d);
        sb2.append(", categories=");
        sb2.append(this.f317155e);
        sb2.append(", employees=");
        sb2.append(this.f317156f);
        sb2.append(", spendings=");
        sb2.append(this.f317157g);
        sb2.append(", metrics=");
        sb2.append(this.f317158h);
        sb2.append(", spaces=");
        sb2.append(this.f317159i);
        sb2.append(", itemIDs=");
        sb2.append(this.f317160j);
        sb2.append(", sortOrder=");
        sb2.append(this.f317161k);
        sb2.append(", limit=");
        sb2.append(this.f317162l);
        sb2.append(", offset=");
        sb2.append(this.f317163m);
        sb2.append(", configParams=");
        sb2.append(this.f317164n);
        sb2.append(", selectedSegmentType=");
        sb2.append(this.f317165o);
        sb2.append(", metricGroupings=");
        sb2.append(this.f317166p);
        sb2.append(", selectedSplit=");
        sb2.append(this.f317167q);
        sb2.append(", actions=");
        return androidx.compose.foundation.H.p(sb2, this.f317168r, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Long l12 = this.f317152b;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeLong(this.f317153c);
        parcel.writeStringList(this.f317154d);
        parcel.writeStringList(this.f317155e);
        parcel.writeStringList(this.f317156f);
        parcel.writeStringList(this.f317157g);
        parcel.writeStringList(this.f317158h);
        parcel.writeStringList(this.f317159i);
        parcel.writeStringList(this.f317160j);
        parcel.writeString(this.f317161k);
        parcel.writeInt(this.f317162l);
        Integer num = this.f317163m;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        ConfigParams configParams = this.f317164n;
        if (configParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            configParams.writeToParcel(parcel, i12);
        }
        SegmentType segmentType = this.f317165o;
        if (segmentType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(segmentType.name());
        }
        List<MetricGrouping> list = this.f317166p;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this.f317167q);
        List<Action> list2 = this.f317168r;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), i12);
        }
    }

    public /* synthetic */ StatsConfig(Long l12, long j12, List list, List list2, List list3, List list4, List list5, List list6, List list7, String str, int i12, Integer num, ConfigParams configParams, SegmentType segmentType, List list8, String str2, List list9, int i13, C42822w c42822w) {
        this(l12, j12, list, list2, list3, list4, list5, list6, list7, (i13 & 512) != 0 ? null : str, (i13 & 1024) != 0 ? 20 : i12, (i13 & 2048) != 0 ? null : num, (i13 & 4096) != 0 ? null : configParams, (i13 & 8192) != 0 ? null : segmentType, list8, (32768 & i13) != 0 ? null : str2, (i13 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : list9);
    }
}
