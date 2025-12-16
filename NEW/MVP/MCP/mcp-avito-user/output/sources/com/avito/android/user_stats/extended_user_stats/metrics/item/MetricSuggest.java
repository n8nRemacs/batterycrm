package com.avito.android.user_stats.extended_user_stats.metrics.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MetricDialogData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/metrics/item/MetricSuggest;", "Landroid/os/Parcelable;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MetricSuggest implements Parcelable {

    @k
    public static final Parcelable.Creator<MetricSuggest> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f317294b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f317295c;

    /* compiled from: MetricDialogData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetricSuggest> {
        @Override // android.os.Parcelable.Creator
        public final MetricSuggest createFromParcel(Parcel parcel) {
            return new MetricSuggest(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MetricSuggest[] newArray(int i12) {
            return new MetricSuggest[i12];
        }
    }

    public MetricSuggest(@k String str, @k String str2) {
        this.f317294b = str;
        this.f317295c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricSuggest)) {
            return false;
        }
        MetricSuggest metricSuggest = (MetricSuggest) obj;
        return L.f(this.f317294b, metricSuggest.f317294b) && L.f(this.f317295c, metricSuggest.f317295c);
    }

    public final int hashCode() {
        return this.f317295c.hashCode() + (this.f317294b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricSuggest(name=");
        sb2.append(this.f317294b);
        sb2.append(", slug=");
        return C22026a.c(sb2, this.f317295c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f317294b);
        parcel.writeString(this.f317295c);
    }
}
