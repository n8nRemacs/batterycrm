package com.avito.user_stats.model.extended_user_stats;

import K51.d;
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

/* compiled from: StatsSplitLocal.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/StatsSplitLocal;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StatsSplitLocal implements Parcelable {

    @k
    public static final Parcelable.Creator<StatsSplitLocal> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<SplitMetricsItem> f338663b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<DynamicSplitItems> f338664c;

    /* renamed from: d, reason: collision with root package name */
    public final long f338665d;

    /* compiled from: StatsSplitLocal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatsSplitLocal> {
        @Override // android.os.Parcelable.Creator
        public final StatsSplitLocal createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = com.avito.android.actions_sheet.a.c(SplitMetricsItem.CREATOR, parcel, arrayList, iC3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(DynamicSplitItems.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new StatsSplitLocal(arrayList, arrayList2, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final StatsSplitLocal[] newArray(int i12) {
            return new StatsSplitLocal[i12];
        }
    }

    public StatsSplitLocal(@k List<SplitMetricsItem> list, @k List<DynamicSplitItems> list2, long j12) {
        this.f338663b = list;
        this.f338664c = list2;
        this.f338665d = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsSplitLocal)) {
            return false;
        }
        StatsSplitLocal statsSplitLocal = (StatsSplitLocal) obj;
        return L.f(this.f338663b, statsSplitLocal.f338663b) && L.f(this.f338664c, statsSplitLocal.f338664c) && this.f338665d == statsSplitLocal.f338665d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f338665d) + H.e(this.f338663b.hashCode() * 31, 31, this.f338664c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatsSplitLocal(metrics=");
        sb2.append(this.f338663b);
        sb2.append(", items=");
        sb2.append(this.f338664c);
        sb2.append(", itemsCount=");
        return r.u(sb2, this.f338665d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f338663b, parcel);
        while (itJ.hasNext()) {
            ((SplitMetricsItem) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.f338664c, parcel);
        while (itJ2.hasNext()) {
            ((DynamicSplitItems) itJ2.next()).writeToParcel(parcel, i12);
        }
        parcel.writeLong(this.f338665d);
    }

    public /* synthetic */ StatsSplitLocal(List list, List list2, long j12, int i12, C42822w c42822w) {
        this(list, list2, (i12 & 4) != 0 ? 0L : j12);
    }
}
