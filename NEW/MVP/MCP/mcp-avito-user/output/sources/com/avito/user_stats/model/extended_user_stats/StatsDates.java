package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StatsCommonExpenses.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/StatsDates;", "Landroid/os/Parcelable;", "", "type", "Ljava/util/Date;", "start", "end", "", "Lcom/avito/user_stats/model/extended_user_stats/StatsServices;", "values", "Lcom/avito/user_stats/model/extended_user_stats/DynamicsSummary;", "summary", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Ljava/util/Date;", "d", "()Ljava/util/Date;", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StatsDates implements Parcelable {

    @k
    public static final Parcelable.Creator<StatsDates> CREATOR = new a();

    @c("end")
    @k
    private final Date end;

    @c("start")
    @k
    private final Date start;

    @c("summary")
    @l
    private final List<DynamicsSummary> summary;

    @c("type")
    @l
    private final String type;

    @c("values")
    @l
    private final List<StatsServices> values;

    /* compiled from: StatsCommonExpenses.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatsDates> {
        @Override // android.os.Parcelable.Creator
        public final StatsDates createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            Date date = (Date) parcel.readSerializable();
            Date date2 = (Date) parcel.readSerializable();
            int iC2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(StatsServices.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(DynamicsSummary.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new StatsDates(string, date, date2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final StatsDates[] newArray(int i12) {
            return new StatsDates[i12];
        }
    }

    public StatsDates(@l String str, @k Date date, @k Date date2, @l List<StatsServices> list, @l List<DynamicsSummary> list2) {
        this.type = str;
        this.start = date;
        this.end = date2;
        this.values = list;
        this.summary = list2;
    }

    public static StatsDates a(StatsDates statsDates, String str, ArrayList arrayList) {
        Date date = statsDates.start;
        Date date2 = statsDates.end;
        List<DynamicsSummary> list = statsDates.summary;
        statsDates.getClass();
        return new StatsDates(str, date, date2, arrayList, list);
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Date getEnd() {
        return this.end;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Date getStart() {
        return this.start;
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
        if (!(obj instanceof StatsDates)) {
            return false;
        }
        StatsDates statsDates = (StatsDates) obj;
        return L.f(this.type, statsDates.type) && L.f(this.start, statsDates.start) && L.f(this.end, statsDates.end) && L.f(this.values, statsDates.values) && L.f(this.summary, statsDates.summary);
    }

    @l
    public final List<StatsServices> f() {
        return this.values;
    }

    @l
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.type;
        int iF2 = m.f(this.end, m.f(this.start, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        List<StatsServices> list = this.values;
        int iHashCode = (iF2 + (list == null ? 0 : list.hashCode())) * 31;
        List<DynamicsSummary> list2 = this.summary;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatsDates(type=");
        sb2.append(this.type);
        sb2.append(", start=");
        sb2.append(this.start);
        sb2.append(", end=");
        sb2.append(this.end);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", summary=");
        return H.p(sb2, this.summary, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.type);
        parcel.writeSerializable(this.start);
        parcel.writeSerializable(this.end);
        List<StatsServices> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((StatsServices) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<DynamicsSummary> list2 = this.summary;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((DynamicsSummary) itA2.next()).writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ StatsDates(String str, Date date, Date date2, List list, List list2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, date, date2, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : list2);
    }
}
