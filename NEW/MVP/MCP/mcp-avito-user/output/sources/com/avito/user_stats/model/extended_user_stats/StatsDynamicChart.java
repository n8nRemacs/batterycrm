package com.avito.user_stats.model.extended_user_stats;

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

/* compiled from: StatsDynamicChart.kt */
@d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/StatsDynamicChart;", "Landroid/os/Parcelable;", "", "Lcom/avito/user_stats/model/extended_user_stats/MetricItem;", "metrics", "Lcom/avito/user_stats/model/extended_user_stats/StatsDates;", "dates", "Lcom/avito/user_stats/model/extended_user_stats/AlertContent;", "alertContent", "Lcom/avito/user_stats/model/extended_user_stats/DynamicsSummary;", "summary", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/avito/user_stats/model/extended_user_stats/AlertContent;Ljava/util/List;)V", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Lcom/avito/user_stats/model/extended_user_stats/AlertContent;", "getAlertContent", "()Lcom/avito/user_stats/model/extended_user_stats/AlertContent;", "e", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StatsDynamicChart implements Parcelable {

    @k
    public static final Parcelable.Creator<StatsDynamicChart> CREATOR = new a();

    @c("alertContent")
    @l
    private final AlertContent alertContent;

    @c("dates")
    @k
    private final List<StatsDates> dates;

    @c("metrics")
    @k
    private final List<MetricItem> metrics;

    @c("summary")
    @l
    private final List<DynamicsSummary> summary;

    /* compiled from: StatsDynamicChart.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatsDynamicChart> {
        @Override // android.os.Parcelable.Creator
        public final StatsDynamicChart createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = com.avito.android.actions_sheet.a.c(MetricItem.CREATOR, parcel, arrayList, iC3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int iC4 = 0;
            while (iC4 != i13) {
                iC4 = com.avito.android.actions_sheet.a.c(StatsDates.CREATOR, parcel, arrayList2, iC4, 1);
            }
            ArrayList arrayList3 = null;
            AlertContent alertContentCreateFromParcel = parcel.readInt() == 0 ? null : AlertContent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i14);
                while (iC2 != i14) {
                    iC2 = com.avito.android.actions_sheet.a.c(DynamicsSummary.CREATOR, parcel, arrayList4, iC2, 1);
                }
                arrayList3 = arrayList4;
            }
            return new StatsDynamicChart(arrayList, arrayList2, alertContentCreateFromParcel, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final StatsDynamicChart[] newArray(int i12) {
            return new StatsDynamicChart[i12];
        }
    }

    public StatsDynamicChart(@k List<MetricItem> list, @k List<StatsDates> list2, @l AlertContent alertContent, @l List<DynamicsSummary> list3) {
        this.metrics = list;
        this.dates = list2;
        this.alertContent = alertContent;
        this.summary = list3;
    }

    @k
    public final List<StatsDates> c() {
        return this.dates;
    }

    @k
    public final List<MetricItem> d() {
        return this.metrics;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<DynamicsSummary> e() {
        return this.summary;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsDynamicChart)) {
            return false;
        }
        StatsDynamicChart statsDynamicChart = (StatsDynamicChart) obj;
        return L.f(this.metrics, statsDynamicChart.metrics) && L.f(this.dates, statsDynamicChart.dates) && L.f(this.alertContent, statsDynamicChart.alertContent) && L.f(this.summary, statsDynamicChart.summary);
    }

    public final int hashCode() {
        int iE2 = H.e(this.metrics.hashCode() * 31, 31, this.dates);
        AlertContent alertContent = this.alertContent;
        int iHashCode = (iE2 + (alertContent == null ? 0 : alertContent.hashCode())) * 31;
        List<DynamicsSummary> list = this.summary;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatsDynamicChart(metrics=");
        sb2.append(this.metrics);
        sb2.append(", dates=");
        sb2.append(this.dates);
        sb2.append(", alertContent=");
        sb2.append(this.alertContent);
        sb2.append(", summary=");
        return H.p(sb2, this.summary, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.metrics, parcel);
        while (itJ.hasNext()) {
            ((MetricItem) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.dates, parcel);
        while (itJ2.hasNext()) {
            ((StatsDates) itJ2.next()).writeToParcel(parcel, i12);
        }
        AlertContent alertContent = this.alertContent;
        if (alertContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            alertContent.writeToParcel(parcel, i12);
        }
        List<DynamicsSummary> list = this.summary;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((DynamicsSummary) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
