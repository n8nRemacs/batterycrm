package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChartExpensesItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/chart/Column;", "Landroid/os/Parcelable;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Column implements Parcelable {

    @k
    public static final Parcelable.Creator<Column> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f317683b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f317684c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f317685d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Detail> f317686e;

    /* compiled from: ChartExpensesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Column> {
        @Override // android.os.Parcelable.Creator
        public final Column createFromParcel(Parcel parcel) {
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Detail.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new Column(string, arrayList, z12, z13);
        }

        @Override // android.os.Parcelable.Creator
        public final Column[] newArray(int i12) {
            return new Column[i12];
        }
    }

    public Column(@l String str, @k List list, boolean z12, boolean z13) {
        this.f317683b = z12;
        this.f317684c = z13;
        this.f317685d = str;
        this.f317686e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Column)) {
            return false;
        }
        Column column = (Column) obj;
        return this.f317683b == column.f317683b && this.f317684c == column.f317684c && L.f(this.f317685d, column.f317685d) && L.f(this.f317686e, column.f317686e);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f317683b) * 31, 31, this.f317684c);
        String str = this.f317685d;
        return this.f317686e.hashCode() + ((i12 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Column(isUnselected=");
        sb2.append(this.f317683b);
        sb2.append(", canClickable=");
        sb2.append(this.f317684c);
        sb2.append(", periodForFilter=");
        sb2.append(this.f317685d);
        sb2.append(", columnDetails=");
        return H.p(sb2, this.f317686e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f317683b ? 1 : 0);
        parcel.writeInt(this.f317684c ? 1 : 0);
        parcel.writeString(this.f317685d);
        Iterator itJ = C0.j(this.f317686e, parcel);
        while (itJ.hasNext()) {
            ((Detail) itJ.next()).writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ Column(boolean z12, boolean z13, String str, List list, int i12, C42822w c42822w) {
        this((i12 & 4) != 0 ? null : str, list, (i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? true : z13);
    }
}
