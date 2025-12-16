package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsDynamicItems.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/MetricTotal;", "Landroid/os/Parcelable;", "", "value", "", "missingValueTooltip", "Lcom/avito/user_stats/model/extended_user_stats/MetricTotalChange;", "change", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lcom/avito/user_stats/model/extended_user_stats/MetricTotalChange;)V", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "Ljava/lang/String;", "getMissingValueTooltip", "()Ljava/lang/String;", "Lcom/avito/user_stats/model/extended_user_stats/MetricTotalChange;", "getChange", "()Lcom/avito/user_stats/model/extended_user_stats/MetricTotalChange;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MetricTotal implements Parcelable {

    @k
    public static final Parcelable.Creator<MetricTotal> CREATOR = new a();

    @c("change")
    @l
    private final MetricTotalChange change;

    @c("missingValueTooltip")
    @l
    private final String missingValueTooltip;

    @c("value")
    @l
    private final Long value;

    /* compiled from: StatsDynamicItems.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetricTotal> {
        @Override // android.os.Parcelable.Creator
        public final MetricTotal createFromParcel(Parcel parcel) {
            return new MetricTotal(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? MetricTotalChange.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MetricTotal[] newArray(int i12) {
            return new MetricTotal[i12];
        }
    }

    public MetricTotal(@l Long l12, @l String str, @l MetricTotalChange metricTotalChange) {
        this.value = l12;
        this.missingValueTooltip = str;
        this.change = metricTotalChange;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricTotal)) {
            return false;
        }
        MetricTotal metricTotal = (MetricTotal) obj;
        return L.f(this.value, metricTotal.value) && L.f(this.missingValueTooltip, metricTotal.missingValueTooltip) && L.f(this.change, metricTotal.change);
    }

    public final int hashCode() {
        Long l12 = this.value;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        String str = this.missingValueTooltip;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MetricTotalChange metricTotalChange = this.change;
        return iHashCode2 + (metricTotalChange != null ? metricTotalChange.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "MetricTotal(value=" + this.value + ", missingValueTooltip=" + this.missingValueTooltip + ", change=" + this.change + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.value;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.missingValueTooltip);
        MetricTotalChange metricTotalChange = this.change;
        if (metricTotalChange == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            metricTotalChange.writeToParcel(parcel, i12);
        }
    }
}
