package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChartExpensesItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/chart/Legend;", "Landroid/os/Parcelable;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Legend implements Parcelable {

    @k
    public static final Parcelable.Creator<Legend> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f317690b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f317691c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f317692d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f317693e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f317694f;

    /* compiled from: ChartExpensesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Legend> {
        @Override // android.os.Parcelable.Creator
        public final Legend createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            return new Legend(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, string, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Legend[] newArray(int i12) {
            return new Legend[i12];
        }
    }

    public Legend(boolean z12, boolean z13, boolean z14, @k String str, @l String str2) {
        this.f317690b = str;
        this.f317691c = z12;
        this.f317692d = z13;
        this.f317693e = z14;
        this.f317694f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Legend)) {
            return false;
        }
        Legend legend = (Legend) obj;
        return L.f(this.f317690b, legend.f317690b) && this.f317691c == legend.f317691c && this.f317692d == legend.f317692d && this.f317693e == legend.f317693e && L.f(this.f317694f, legend.f317694f);
    }

    public final int hashCode() {
        int i12 = r.i(r.i(r.i(this.f317690b.hashCode() * 31, 31, this.f317691c), 31, this.f317692d), 31, this.f317693e);
        String str = this.f317694f;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Legend(date=");
        sb2.append(this.f317690b);
        sb2.append(", isDayOff=");
        sb2.append(this.f317691c);
        sb2.append(", isEmptyItem=");
        sb2.append(this.f317692d);
        sb2.append(", isMonth=");
        sb2.append(this.f317693e);
        sb2.append(", dateYear=");
        return C22026a.c(sb2, this.f317694f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f317690b);
        parcel.writeInt(this.f317691c ? 1 : 0);
        parcel.writeInt(this.f317692d ? 1 : 0);
        parcel.writeInt(this.f317693e ? 1 : 0);
        parcel.writeString(this.f317694f);
    }

    public /* synthetic */ Legend(String str, boolean z12, boolean z13, boolean z14, String str2, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, str, (i12 & 16) != 0 ? null : str2);
    }
}
