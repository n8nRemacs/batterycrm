package com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.Action;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import com.avito.user_stats.model.extended_user_stats.StatsCommonExpenses;
import com.avito.user_stats.model.extended_user_stats.UserMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExpensesTabState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ExpensesTabState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<ExpensesItem> f317826b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DataStatus f317827c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final StatsCommonExpenses f317828d;

    /* renamed from: e, reason: collision with root package name */
    public final double f317829e;

    /* renamed from: f, reason: collision with root package name */
    public final int f317830f;

    /* renamed from: g, reason: collision with root package name */
    public final double f317831g;

    /* renamed from: h, reason: collision with root package name */
    public final long f317832h;

    /* renamed from: i, reason: collision with root package name */
    public final double f317833i;

    /* renamed from: j, reason: collision with root package name */
    public final long f317834j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Integer f317835k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final StatsConfig f317836l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final List<Action> f317837m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final UserMessage f317838n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f317824o = new a(null);

    @k
    public static final Parcelable.Creator<ExpensesTabState> CREATOR = new b();

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final ExpensesTabState f317825p = new ExpensesTabState(new ArrayList(), DataStatus.f317809c, null, 0.0d, 0, 0.0d, 0, 0.0d, 0, null, null, null, null);

    /* compiled from: ExpensesTabState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabState$a;", "", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ExpensesTabState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ExpensesTabState> {
        @Override // android.os.Parcelable.Creator
        public final ExpensesTabState createFromParcel(Parcel parcel) {
            long j12;
            double d12;
            ArrayList arrayList;
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ExpensesTabState.class, parcel, arrayList2, iL2, 1);
            }
            DataStatus dataStatusValueOf = DataStatus.valueOf(parcel.readString());
            StatsCommonExpenses statsCommonExpenses = (StatsCommonExpenses) parcel.readParcelable(ExpensesTabState.class.getClassLoader());
            double d13 = parcel.readDouble();
            int i13 = parcel.readInt();
            double d14 = parcel.readDouble();
            long j13 = parcel.readLong();
            double d15 = parcel.readDouble();
            long j14 = parcel.readLong();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            StatsConfig statsConfigCreateFromParcel = parcel.readInt() == 0 ? null : StatsConfig.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                d12 = d15;
                j12 = j14;
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                j12 = j14;
                ArrayList arrayList3 = new ArrayList(i14);
                d12 = d15;
                int iL3 = 0;
                while (iL3 != i14) {
                    iL3 = com.avito.android.actions_sheet.a.l(ExpensesTabState.class, parcel, arrayList3, iL3, 1);
                }
                arrayList = arrayList3;
            }
            return new ExpensesTabState(arrayList2, dataStatusValueOf, statsCommonExpenses, d13, i13, d14, j13, d12, j12, numValueOf, statsConfigCreateFromParcel, arrayList, (UserMessage) parcel.readParcelable(ExpensesTabState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExpensesTabState[] newArray(int i12) {
            return new ExpensesTabState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpensesTabState(@k List<? extends ExpensesItem> list, @k DataStatus dataStatus, @l StatsCommonExpenses statsCommonExpenses, double d12, int i12, double d13, long j12, double d14, long j13, @l Integer num, @l StatsConfig statsConfig, @l List<Action> list2, @l UserMessage userMessage) {
        this.f317826b = list;
        this.f317827c = dataStatus;
        this.f317828d = statsCommonExpenses;
        this.f317829e = d12;
        this.f317830f = i12;
        this.f317831g = d13;
        this.f317832h = j12;
        this.f317833i = d14;
        this.f317834j = j13;
        this.f317835k = num;
        this.f317836l = statsConfig;
        this.f317837m = list2;
        this.f317838n = userMessage;
    }

    public static ExpensesTabState a(ExpensesTabState expensesTabState, ArrayList arrayList, DataStatus dataStatus, StatsCommonExpenses statsCommonExpenses, double d12, int i12, double d13, long j12, double d14, long j13, Integer num, StatsConfig statsConfig, List list, UserMessage userMessage, int i13) {
        List<ExpensesItem> list2 = (i13 & 1) != 0 ? expensesTabState.f317826b : arrayList;
        DataStatus dataStatus2 = (i13 & 2) != 0 ? expensesTabState.f317827c : dataStatus;
        StatsCommonExpenses statsCommonExpenses2 = (i13 & 4) != 0 ? expensesTabState.f317828d : statsCommonExpenses;
        double d15 = (i13 & 8) != 0 ? expensesTabState.f317829e : d12;
        int i14 = (i13 & 16) != 0 ? expensesTabState.f317830f : i12;
        double d16 = (i13 & 32) != 0 ? expensesTabState.f317831g : d13;
        long j14 = (i13 & 64) != 0 ? expensesTabState.f317832h : j12;
        double d17 = (i13 & 128) != 0 ? expensesTabState.f317833i : d14;
        long j15 = (i13 & 256) != 0 ? expensesTabState.f317834j : j13;
        Integer num2 = (i13 & 512) != 0 ? expensesTabState.f317835k : num;
        StatsConfig statsConfig2 = (i13 & 1024) != 0 ? expensesTabState.f317836l : statsConfig;
        List list3 = (i13 & 2048) != 0 ? expensesTabState.f317837m : list;
        UserMessage userMessage2 = (i13 & 4096) != 0 ? expensesTabState.f317838n : userMessage;
        expensesTabState.getClass();
        return new ExpensesTabState(list2, dataStatus2, statsCommonExpenses2, d15, i14, d16, j14, d17, j15, num2, statsConfig2, list3, userMessage2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpensesTabState)) {
            return false;
        }
        ExpensesTabState expensesTabState = (ExpensesTabState) obj;
        return L.f(this.f317826b, expensesTabState.f317826b) && this.f317827c == expensesTabState.f317827c && L.f(this.f317828d, expensesTabState.f317828d) && Double.compare(this.f317829e, expensesTabState.f317829e) == 0 && this.f317830f == expensesTabState.f317830f && Double.compare(this.f317831g, expensesTabState.f317831g) == 0 && this.f317832h == expensesTabState.f317832h && Double.compare(this.f317833i, expensesTabState.f317833i) == 0 && this.f317834j == expensesTabState.f317834j && L.f(this.f317835k, expensesTabState.f317835k) && L.f(this.f317836l, expensesTabState.f317836l) && L.f(this.f317837m, expensesTabState.f317837m) && L.f(this.f317838n, expensesTabState.f317838n);
    }

    public final int hashCode() {
        int iHashCode = (this.f317827c.hashCode() + (this.f317826b.hashCode() * 31)) * 31;
        StatsCommonExpenses statsCommonExpenses = this.f317828d;
        int iG2 = r.g(e.d(r.g(e.d(r.e(this.f317830f, e.d((iHashCode + (statsCommonExpenses == null ? 0 : statsCommonExpenses.hashCode())) * 31, 31, this.f317829e), 31), 31, this.f317831g), 31, this.f317832h), 31, this.f317833i), 31, this.f317834j);
        Integer num = this.f317835k;
        int iHashCode2 = (iG2 + (num == null ? 0 : num.hashCode())) * 31;
        StatsConfig statsConfig = this.f317836l;
        int iHashCode3 = (iHashCode2 + (statsConfig == null ? 0 : statsConfig.hashCode())) * 31;
        List<Action> list = this.f317837m;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        UserMessage userMessage = this.f317838n;
        return iHashCode4 + (userMessage != null ? userMessage.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ExpensesTabState(items=" + this.f317826b + ", statusData=" + this.f317827c + ", expenses=" + this.f317828d + ", maxColumnValue=" + this.f317829e + ", columnCount=" + this.f317830f + ", totalRealAmount=" + this.f317831g + ", totalBonuses=" + this.f317832h + ", selectedColumnRealAmount=" + this.f317833i + ", selectedColumnBonuses=" + this.f317834j + ", selectedColumnIndex=" + this.f317835k + ", lastConfig=" + this.f317836l + ", actions=" + this.f317837m + ", userMessage=" + this.f317838n + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f317826b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f317827c.name());
        parcel.writeParcelable(this.f317828d, i12);
        parcel.writeDouble(this.f317829e);
        parcel.writeInt(this.f317830f);
        parcel.writeDouble(this.f317831g);
        parcel.writeLong(this.f317832h);
        parcel.writeDouble(this.f317833i);
        parcel.writeLong(this.f317834j);
        Integer num = this.f317835k;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        StatsConfig statsConfig = this.f317836l;
        if (statsConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statsConfig.writeToParcel(parcel, i12);
        }
        List<Action> list = this.f317837m;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f317838n, i12);
    }
}
