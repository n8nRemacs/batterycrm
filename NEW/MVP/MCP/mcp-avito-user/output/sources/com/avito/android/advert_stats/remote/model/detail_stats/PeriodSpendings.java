package com.avito.android.advert_stats.remote.model.detail_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DetailAdvertStatistics.kt */
@d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/advert_stats/remote/model/detail_stats/PeriodSpendings;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/advert_stats/remote/model/detail_stats/PeriodStatsItem;", "periods", "items", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "getItems", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PeriodSpendings implements Parcelable {

    @k
    public static final Parcelable.Creator<PeriodSpendings> CREATOR = new a();

    @c("items")
    @k
    private final List<PeriodStatsItem> items;

    @c("periods")
    @k
    private final List<PeriodStatsItem> periods;

    /* compiled from: DetailAdvertStatistics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PeriodSpendings> {
        @Override // android.os.Parcelable.Creator
        public final PeriodSpendings createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = com.avito.android.actions_sheet.a.c(PeriodStatsItem.CREATOR, parcel, arrayList, iC3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(PeriodStatsItem.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new PeriodSpendings(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final PeriodSpendings[] newArray(int i12) {
            return new PeriodSpendings[i12];
        }
    }

    public PeriodSpendings(@k List<PeriodStatsItem> list, @k List<PeriodStatsItem> list2) {
        this.periods = list;
        this.items = list2;
    }

    @k
    public final List<PeriodStatsItem> c() {
        return this.periods;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodSpendings)) {
            return false;
        }
        PeriodSpendings periodSpendings = (PeriodSpendings) obj;
        return L.f(this.periods, periodSpendings.periods) && L.f(this.items, periodSpendings.items);
    }

    @k
    public final List<PeriodStatsItem> getItems() {
        return this.items;
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.periods.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PeriodSpendings(periods=");
        sb2.append(this.periods);
        sb2.append(", items=");
        return H.p(sb2, this.items, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.periods, parcel);
        while (itJ.hasNext()) {
            ((PeriodStatsItem) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.items, parcel);
        while (itJ2.hasNext()) {
            ((PeriodStatsItem) itJ2.next()).writeToParcel(parcel, i12);
        }
    }
}
