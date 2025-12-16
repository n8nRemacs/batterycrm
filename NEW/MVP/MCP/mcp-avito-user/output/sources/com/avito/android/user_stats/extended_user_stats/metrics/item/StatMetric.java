package com.avito.android.user_stats.extended_user_stats.metrics.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MetricDialogData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/metrics/item/StatMetric;", "Landroid/os/Parcelable;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StatMetric implements Parcelable {

    @k
    public static final Parcelable.Creator<StatMetric> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Boolean f317296b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Boolean f317297c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f317298d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f317299e;

    /* compiled from: MetricDialogData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatMetric> {
        @Override // android.os.Parcelable.Creator
        public final StatMetric createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StatMetric(boolValueOf, boolValueOf2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StatMetric[] newArray(int i12) {
            return new StatMetric[i12];
        }
    }

    public StatMetric(@l Boolean bool, @l Boolean bool2, @k String str, @k String str2) {
        this.f317296b = bool;
        this.f317297c = bool2;
        this.f317298d = str;
        this.f317299e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatMetric)) {
            return false;
        }
        StatMetric statMetric = (StatMetric) obj;
        return L.f(this.f317296b, statMetric.f317296b) && L.f(this.f317297c, statMetric.f317297c) && L.f(this.f317298d, statMetric.f317298d) && L.f(this.f317299e, statMetric.f317299e);
    }

    public final int hashCode() {
        Boolean bool = this.f317296b;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f317297c;
        return this.f317299e.hashCode() + H.d((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31, 31, this.f317298d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatMetric(isEnabled=");
        sb2.append(this.f317296b);
        sb2.append(", isSelected=");
        sb2.append(this.f317297c);
        sb2.append(", name=");
        sb2.append(this.f317298d);
        sb2.append(", slug=");
        return C22026a.c(sb2, this.f317299e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Boolean bool = this.f317296b;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.f317297c;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeString(this.f317298d);
        parcel.writeString(this.f317299e);
    }
}
