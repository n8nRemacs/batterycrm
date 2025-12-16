package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsSplitLocal.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/DynamicItemsMetrics;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DynamicItemsMetrics implements Parcelable {

    @k
    public static final Parcelable.Creator<DynamicItemsMetrics> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f338639b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f338640c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Long f338641d;

    /* compiled from: StatsSplitLocal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DynamicItemsMetrics> {
        @Override // android.os.Parcelable.Creator
        public final DynamicItemsMetrics createFromParcel(Parcel parcel) {
            return new DynamicItemsMetrics(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicItemsMetrics[] newArray(int i12) {
            return new DynamicItemsMetrics[i12];
        }
    }

    public DynamicItemsMetrics(@l String str, @l String str2, @l Long l12) {
        this.f338639b = str;
        this.f338640c = str2;
        this.f338641d = l12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicItemsMetrics)) {
            return false;
        }
        DynamicItemsMetrics dynamicItemsMetrics = (DynamicItemsMetrics) obj;
        return L.f(this.f338639b, dynamicItemsMetrics.f338639b) && L.f(this.f338640c, dynamicItemsMetrics.f338640c) && L.f(this.f338641d, dynamicItemsMetrics.f338641d);
    }

    public final int hashCode() {
        String str = this.f338639b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f338640c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.f338641d;
        return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DynamicItemsMetrics(missingValueTooltip=");
        sb2.append(this.f338639b);
        sb2.append(", slug=");
        sb2.append(this.f338640c);
        sb2.append(", value=");
        return m.m(sb2, this.f338641d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f338639b);
        parcel.writeString(this.f338640c);
        Long l12 = this.f338641d;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }
}
