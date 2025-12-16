package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: StatsCommonExpenses.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/DynamicsTotal;", "Landroid/os/Parcelable;", "", "value", "<init>", "(J)V", "J", "c", "()J", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DynamicsTotal implements Parcelable {

    @k
    public static final Parcelable.Creator<DynamicsTotal> CREATOR = new a();

    @c("value")
    private final long value;

    /* compiled from: StatsCommonExpenses.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DynamicsTotal> {
        @Override // android.os.Parcelable.Creator
        public final DynamicsTotal createFromParcel(Parcel parcel) {
            return new DynamicsTotal(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicsTotal[] newArray(int i12) {
            return new DynamicsTotal[i12];
        }
    }

    public DynamicsTotal(long j12) {
        this.value = j12;
    }

    /* renamed from: c, reason: from getter */
    public final long getValue() {
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
        return (obj instanceof DynamicsTotal) && this.value == ((DynamicsTotal) obj).value;
    }

    public final int hashCode() {
        return Long.hashCode(this.value);
    }

    @k
    public final String toString() {
        return r.u(new StringBuilder("DynamicsTotal(value="), this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.value);
    }
}
