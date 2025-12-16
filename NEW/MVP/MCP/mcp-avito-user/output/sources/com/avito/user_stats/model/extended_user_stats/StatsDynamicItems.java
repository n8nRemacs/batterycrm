package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StatsDynamicItems.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/StatsDynamicItems;", "Landroid/os/Parcelable;", "", "Lcom/avito/user_stats/model/extended_user_stats/MetricItem;", "metrics", "Lcom/avito/user_stats/model/extended_user_stats/DynamicItem;", "items", "", "itemsCount", "<init>", "(Ljava/util/List;Ljava/util/List;J)V", "Ljava/util/List;", "d", "()Ljava/util/List;", "getItems", "J", "c", "()J", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StatsDynamicItems implements Parcelable {

    @k
    public static final Parcelable.Creator<StatsDynamicItems> CREATOR = new a();

    @c("items")
    @l
    private final List<DynamicItem> items;

    @c("itemsCount")
    private final long itemsCount;

    @c("metrics")
    @l
    private final List<MetricItem> metrics;

    /* compiled from: StatsDynamicItems.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatsDynamicItems> {
        @Override // android.os.Parcelable.Creator
        public final StatsDynamicItems createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int iC2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(MetricItem.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(DynamicItem.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new StatsDynamicItems(arrayList, arrayList2, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final StatsDynamicItems[] newArray(int i12) {
            return new StatsDynamicItems[i12];
        }
    }

    public StatsDynamicItems(@l List<MetricItem> list, @l List<DynamicItem> list2, long j12) {
        this.metrics = list;
        this.items = list2;
        this.itemsCount = j12;
    }

    /* renamed from: c, reason: from getter */
    public final long getItemsCount() {
        return this.itemsCount;
    }

    @l
    public final List<MetricItem> d() {
        return this.metrics;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsDynamicItems)) {
            return false;
        }
        StatsDynamicItems statsDynamicItems = (StatsDynamicItems) obj;
        return L.f(this.metrics, statsDynamicItems.metrics) && L.f(this.items, statsDynamicItems.items) && this.itemsCount == statsDynamicItems.itemsCount;
    }

    @l
    public final List<DynamicItem> getItems() {
        return this.items;
    }

    public final int hashCode() {
        List<MetricItem> list = this.metrics;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<DynamicItem> list2 = this.items;
        return Long.hashCode(this.itemsCount) + ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatsDynamicItems(metrics=");
        sb2.append(this.metrics);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", itemsCount=");
        return r.u(sb2, this.itemsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<MetricItem> list = this.metrics;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((MetricItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<DynamicItem> list2 = this.items;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((DynamicItem) itA2.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeLong(this.itemsCount);
    }

    public /* synthetic */ StatsDynamicItems(List list, List list2, long j12, int i12, C42822w c42822w) {
        this(list, list2, (i12 & 4) != 0 ? 0L : j12);
    }
}
