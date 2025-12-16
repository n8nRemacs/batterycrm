package com.avito.android.advert_stats.remote.model.detail_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DetailAdvertStatistics.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/advert_stats/remote/model/detail_stats/PeriodStatsItem;", "Landroid/os/Parcelable;", "", "spendingPeriodText", "spendingPerPeriod", "", "date", "", "Lcom/avito/android/advert_stats/remote/model/detail_stats/Services;", "services", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "e", "J", "c", "()J", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PeriodStatsItem implements Parcelable {

    @k
    public static final Parcelable.Creator<PeriodStatsItem> CREATOR = new a();

    @c("date")
    private final long date;

    @c("services")
    @l
    private final List<Services> services;

    @c("spendingsTotal")
    @k
    private final String spendingPerPeriod;

    @c("spendingsDescription")
    @k
    private final String spendingPeriodText;

    /* compiled from: DetailAdvertStatistics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PeriodStatsItem> {
        @Override // android.os.Parcelable.Creator
        public final PeriodStatsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j12 = parcel.readLong();
            ArrayList arrayList = null;
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readInt() == 0 ? null : Services.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new PeriodStatsItem(string, string2, j12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PeriodStatsItem[] newArray(int i12) {
            return new PeriodStatsItem[i12];
        }
    }

    public PeriodStatsItem(@k String str, @k String str2, long j12, @l List<Services> list) {
        this.spendingPeriodText = str;
        this.spendingPerPeriod = str2;
        this.date = j12;
        this.services = list;
    }

    /* renamed from: c, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @l
    public final List<Services> d() {
        return this.services;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getSpendingPerPeriod() {
        return this.spendingPerPeriod;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodStatsItem)) {
            return false;
        }
        PeriodStatsItem periodStatsItem = (PeriodStatsItem) obj;
        return L.f(this.spendingPeriodText, periodStatsItem.spendingPeriodText) && L.f(this.spendingPerPeriod, periodStatsItem.spendingPerPeriod) && this.date == periodStatsItem.date && L.f(this.services, periodStatsItem.services);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getSpendingPeriodText() {
        return this.spendingPeriodText;
    }

    public final int hashCode() {
        int iG2 = r.g(H.d(this.spendingPeriodText.hashCode() * 31, 31, this.spendingPerPeriod), 31, this.date);
        List<Services> list = this.services;
        return iG2 + (list == null ? 0 : list.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PeriodStatsItem(spendingPeriodText=");
        sb2.append(this.spendingPeriodText);
        sb2.append(", spendingPerPeriod=");
        sb2.append(this.spendingPerPeriod);
        sb2.append(", date=");
        sb2.append(this.date);
        sb2.append(", services=");
        return H.p(sb2, this.services, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.spendingPeriodText);
        parcel.writeString(this.spendingPerPeriod);
        parcel.writeLong(this.date);
        List<Services> list = this.services;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            Services services = (Services) itA.next();
            if (services == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                services.writeToParcel(parcel, i12);
            }
        }
    }
}
