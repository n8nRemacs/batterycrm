package com.avito.android.user_stats.extended_user_stats.metrics.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MetricDialogData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/metrics/item/DataMetrics;", "Landroid/os/Parcelable;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DataMetrics implements Parcelable {

    @k
    public static final Parcelable.Creator<DataMetrics> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f317287b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ArrayList f317288c;

    /* compiled from: MetricDialogData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DataMetrics> {
        @Override // android.os.Parcelable.Creator
        public final DataMetrics createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = com.avito.android.actions_sheet.a.c(MetricSuggest.CREATOR, parcel, arrayList2, iC3, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(MetricDialogData.CREATOR, parcel, arrayList3, iC2, 1);
                }
                arrayList = arrayList3;
            }
            return new DataMetrics(arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DataMetrics[] newArray(int i12) {
            return new DataMetrics[i12];
        }
    }

    public DataMetrics(@k ArrayList arrayList, @l ArrayList arrayList2) {
        this.f317287b = arrayList;
        this.f317288c = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataMetrics)) {
            return false;
        }
        DataMetrics dataMetrics = (DataMetrics) obj;
        return this.f317287b.equals(dataMetrics.f317287b) && L.f(this.f317288c, dataMetrics.f317288c);
    }

    public final int hashCode() {
        int iHashCode = this.f317287b.hashCode() * 31;
        ArrayList arrayList = this.f317288c;
        return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataMetrics(suggests=");
        sb2.append(this.f317287b);
        sb2.append(", metricGroups=");
        return e.p(sb2, this.f317288c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f317287b, parcel);
        while (itZ.hasNext()) {
            ((MetricSuggest) itZ.next()).writeToParcel(parcel, i12);
        }
        ArrayList arrayList = this.f317288c;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
        while (itY.hasNext()) {
            ((MetricDialogData) itY.next()).writeToParcel(parcel, i12);
        }
    }
}
