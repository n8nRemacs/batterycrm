package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsSplitLocal.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/SplitMetricsItemHint;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SplitMetricsItemHint implements Parcelable {

    @k
    public static final Parcelable.Creator<SplitMetricsItemHint> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f338661b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f338662c;

    /* compiled from: StatsSplitLocal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SplitMetricsItemHint> {
        @Override // android.os.Parcelable.Creator
        public final SplitMetricsItemHint createFromParcel(Parcel parcel) {
            return new SplitMetricsItemHint(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SplitMetricsItemHint[] newArray(int i12) {
            return new SplitMetricsItemHint[i12];
        }
    }

    public SplitMetricsItemHint(@l String str, @l String str2) {
        this.f338661b = str;
        this.f338662c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitMetricsItemHint)) {
            return false;
        }
        SplitMetricsItemHint splitMetricsItemHint = (SplitMetricsItemHint) obj;
        return L.f(this.f338661b, splitMetricsItemHint.f338661b) && L.f(this.f338662c, splitMetricsItemHint.f338662c);
    }

    public final int hashCode() {
        String str = this.f338661b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f338662c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SplitMetricsItemHint(description=");
        sb2.append(this.f338661b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f338662c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f338661b);
        parcel.writeString(this.f338662c);
    }
}
