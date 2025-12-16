package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfigStatsV2.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/GroupingSort;", "Landroid/os/Parcelable;", "", "metric", "order", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getMetric", "()Ljava/lang/String;", "getOrder", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GroupingSort implements Parcelable {

    @k
    public static final Parcelable.Creator<GroupingSort> CREATOR = new a();

    @c("metric")
    @l
    private final String metric;

    @c("order")
    @l
    private final String order;

    /* compiled from: ConfigStatsV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GroupingSort> {
        @Override // android.os.Parcelable.Creator
        public final GroupingSort createFromParcel(Parcel parcel) {
            return new GroupingSort(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupingSort[] newArray(int i12) {
            return new GroupingSort[i12];
        }
    }

    public GroupingSort(@l String str, @l String str2) {
        this.metric = str;
        this.order = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupingSort)) {
            return false;
        }
        GroupingSort groupingSort = (GroupingSort) obj;
        return L.f(this.metric, groupingSort.metric) && L.f(this.order, groupingSort.order);
    }

    public final int hashCode() {
        String str = this.metric;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.order;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupingSort(metric=");
        sb2.append(this.metric);
        sb2.append(", order=");
        return C22026a.c(sb2, this.order, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.metric);
        parcel.writeString(this.order);
    }
}
