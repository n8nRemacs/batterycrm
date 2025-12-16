package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConfigStatsV2.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/MetricBadge;", "Landroid/os/Parcelable;", "", "visible", "<init>", "(Z)V", "Z", "getVisible", "()Z", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MetricBadge implements Parcelable {

    @k
    public static final Parcelable.Creator<MetricBadge> CREATOR = new a();

    @c("visible")
    private final boolean visible;

    /* compiled from: ConfigStatsV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetricBadge> {
        @Override // android.os.Parcelable.Creator
        public final MetricBadge createFromParcel(Parcel parcel) {
            return new MetricBadge(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MetricBadge[] newArray(int i12) {
            return new MetricBadge[i12];
        }
    }

    public MetricBadge() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MetricBadge) && this.visible == ((MetricBadge) obj).visible;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.visible);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("MetricBadge(visible="), this.visible, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.visible ? 1 : 0);
    }

    public MetricBadge(boolean z12) {
        this.visible = z12;
    }

    public /* synthetic */ MetricBadge(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12);
    }
}
