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

/* compiled from: DetailAdvertExpensesStatistics.kt */
@d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/advert_stats/remote/model/detail_stats/PeriodSpendingsExpenses;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/advert_stats/remote/model/detail_stats/SpendingExpensesItem;", "days", "weeks", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PeriodSpendingsExpenses implements Parcelable {

    @k
    public static final Parcelable.Creator<PeriodSpendingsExpenses> CREATOR = new a();

    @c("days")
    @k
    private final List<SpendingExpensesItem> days;

    @c("weeks")
    @k
    private final List<SpendingExpensesItem> weeks;

    /* compiled from: DetailAdvertExpensesStatistics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PeriodSpendingsExpenses> {
        @Override // android.os.Parcelable.Creator
        public final PeriodSpendingsExpenses createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = com.avito.android.actions_sheet.a.c(SpendingExpensesItem.CREATOR, parcel, arrayList, iC3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(SpendingExpensesItem.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new PeriodSpendingsExpenses(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final PeriodSpendingsExpenses[] newArray(int i12) {
            return new PeriodSpendingsExpenses[i12];
        }
    }

    public PeriodSpendingsExpenses(@k List<SpendingExpensesItem> list, @k List<SpendingExpensesItem> list2) {
        this.days = list;
        this.weeks = list2;
    }

    @k
    public final List<SpendingExpensesItem> c() {
        return this.days;
    }

    @k
    public final List<SpendingExpensesItem> d() {
        return this.weeks;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodSpendingsExpenses)) {
            return false;
        }
        PeriodSpendingsExpenses periodSpendingsExpenses = (PeriodSpendingsExpenses) obj;
        return L.f(this.days, periodSpendingsExpenses.days) && L.f(this.weeks, periodSpendingsExpenses.weeks);
    }

    public final int hashCode() {
        return this.weeks.hashCode() + (this.days.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PeriodSpendingsExpenses(days=");
        sb2.append(this.days);
        sb2.append(", weeks=");
        return H.p(sb2, this.weeks, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.days, parcel);
        while (itJ.hasNext()) {
            ((SpendingExpensesItem) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.weeks, parcel);
        while (itJ2.hasNext()) {
            ((SpendingExpensesItem) itJ2.next()).writeToParcel(parcel, i12);
        }
    }
}
