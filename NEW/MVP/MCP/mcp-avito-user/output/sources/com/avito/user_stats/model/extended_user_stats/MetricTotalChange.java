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

/* compiled from: StatsDynamicItems.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/MetricTotalChange;", "Landroid/os/Parcelable;", "", "value", "", "symbol", "color", "status", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "J", "getValue", "()J", "Ljava/lang/String;", "getSymbol", "()Ljava/lang/String;", "getColor", "getStatus", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MetricTotalChange implements Parcelable {

    @k
    public static final Parcelable.Creator<MetricTotalChange> CREATOR = new a();

    @c("color")
    @l
    private final String color;

    @c("status")
    @l
    private final String status;

    @c("symbol")
    @l
    private final String symbol;

    @c("value")
    private final long value;

    /* compiled from: StatsDynamicItems.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetricTotalChange> {
        @Override // android.os.Parcelable.Creator
        public final MetricTotalChange createFromParcel(Parcel parcel) {
            return new MetricTotalChange(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MetricTotalChange[] newArray(int i12) {
            return new MetricTotalChange[i12];
        }
    }

    public MetricTotalChange(long j12, @l String str, @l String str2, @l String str3) {
        this.value = j12;
        this.symbol = str;
        this.color = str2;
        this.status = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricTotalChange)) {
            return false;
        }
        MetricTotalChange metricTotalChange = (MetricTotalChange) obj;
        return this.value == metricTotalChange.value && L.f(this.symbol, metricTotalChange.symbol) && L.f(this.color, metricTotalChange.color) && L.f(this.status, metricTotalChange.status);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.value) * 31;
        String str = this.symbol;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.color;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricTotalChange(value=");
        sb2.append(this.value);
        sb2.append(", symbol=");
        sb2.append(this.symbol);
        sb2.append(", color=");
        sb2.append(this.color);
        sb2.append(", status=");
        return C22026a.c(sb2, this.status, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.value);
        parcel.writeString(this.symbol);
        parcel.writeString(this.color);
        parcel.writeString(this.status);
    }
}
