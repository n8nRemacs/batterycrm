package com.avito.android.user_stats.extended_user_stats;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedUserStatsViewModel.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/MetricParams;", "Landroid/os/Parcelable;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MetricParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<MetricParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f317148b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f317149c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final List<String> f317150d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f317151e;

    /* compiled from: ExtendedUserStatsViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetricParams> {
        @Override // android.os.Parcelable.Creator
        public final MetricParams createFromParcel(Parcel parcel) {
            return new MetricParams(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MetricParams[] newArray(int i12) {
            return new MetricParams[i12];
        }
    }

    public MetricParams(@Y61.k String str, @Y61.l String str2, @Y61.l List<String> list, @Y61.l String str3) {
        this.f317148b = str;
        this.f317149c = str2;
        this.f317150d = list;
        this.f317151e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricParams)) {
            return false;
        }
        MetricParams metricParams = (MetricParams) obj;
        return L.f(this.f317148b, metricParams.f317148b) && L.f(this.f317149c, metricParams.f317149c) && L.f(this.f317150d, metricParams.f317150d) && L.f(this.f317151e, metricParams.f317151e);
    }

    public final int hashCode() {
        int iHashCode = this.f317148b.hashCode() * 31;
        String str = this.f317149c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.f317150d;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f317151e;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricParams(slug=");
        sb2.append(this.f317148b);
        sb2.append(", shortName=");
        sb2.append(this.f317149c);
        sb2.append(", groupingSlugs=");
        sb2.append(this.f317150d);
        sb2.append(", fullName=");
        return C22026a.c(sb2, this.f317151e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f317148b);
        parcel.writeString(this.f317149c);
        parcel.writeStringList(this.f317150d);
        parcel.writeString(this.f317151e);
    }
}
