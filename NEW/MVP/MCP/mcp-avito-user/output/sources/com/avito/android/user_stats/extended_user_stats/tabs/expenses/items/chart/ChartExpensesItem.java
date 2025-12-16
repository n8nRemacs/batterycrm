package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChartExpensesItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/chart/ChartExpensesItem;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ChartExpensesItem implements ExpensesItem {

    @k
    public static final Parcelable.Creator<ChartExpensesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f317677b;

    /* renamed from: c, reason: collision with root package name */
    public final int f317678c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Column> f317679d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Legend> f317680e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f317681f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f317682g;

    /* compiled from: ChartExpensesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChartExpensesItem> {
        @Override // android.os.Parcelable.Creator
        public final ChartExpensesItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(Column.CREATOR, parcel, arrayList, iC2, 1);
            }
            int i14 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i14);
            int iC3 = 0;
            while (iC3 != i14) {
                iC3 = com.avito.android.actions_sheet.a.c(Legend.CREATOR, parcel, arrayList2, iC3, 1);
            }
            return new ChartExpensesItem(string, i12, arrayList, arrayList2, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ChartExpensesItem[] newArray(int i12) {
            return new ChartExpensesItem[i12];
        }
    }

    public ChartExpensesItem(@k String str, int i12, @k List<Column> list, @k List<Legend> list2, @k String str2, boolean z12) {
        this.f317677b = str;
        this.f317678c = i12;
        this.f317679d = list;
        this.f317680e = list2;
        this.f317681f = str2;
        this.f317682g = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChartExpensesItem)) {
            return false;
        }
        ChartExpensesItem chartExpensesItem = (ChartExpensesItem) obj;
        return L.f(this.f317677b, chartExpensesItem.f317677b) && this.f317678c == chartExpensesItem.f317678c && L.f(this.f317679d, chartExpensesItem.f317679d) && L.f(this.f317680e, chartExpensesItem.f317680e) && L.f(this.f317681f, chartExpensesItem.f317681f) && this.f317682g == chartExpensesItem.f317682g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269950b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289505b() {
        return this.f317677b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f317682g) + H.d(H.e(H.e(r.e(this.f317678c, this.f317677b.hashCode() * 31, 31), 31, this.f317679d), 31, this.f317680e), 31, this.f317681f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChartExpensesItem(stringId=");
        sb2.append(this.f317677b);
        sb2.append(", radius=");
        sb2.append(this.f317678c);
        sb2.append(", columns=");
        sb2.append(this.f317679d);
        sb2.append(", legend=");
        sb2.append(this.f317680e);
        sb2.append(", maxChartItem=");
        sb2.append(this.f317681f);
        sb2.append(", hasSelectedItem=");
        return r.x(sb2, this.f317682g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f317677b);
        parcel.writeInt(this.f317678c);
        Iterator itJ = C0.j(this.f317679d, parcel);
        while (itJ.hasNext()) {
            ((Column) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.f317680e, parcel);
        while (itJ2.hasNext()) {
            ((Legend) itJ2.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f317681f);
        parcel.writeInt(this.f317682g ? 1 : 0);
    }

    public /* synthetic */ ChartExpensesItem(String str, int i12, List list, List list2, String str2, boolean z12, int i13, C42822w c42822w) {
        this(str, i12, list, list2, str2, (i13 & 32) != 0 ? false : z12);
    }
}
