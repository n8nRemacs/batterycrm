package com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.line_chart_view;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LineChartPoint.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_line_chart/line_chart_view/LineChartPoint;", "Landroid/os/Parcelable;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class LineChartPoint implements Parcelable {

    @k
    public static final Parcelable.Creator<LineChartPoint> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f170192b;

    /* renamed from: c, reason: collision with root package name */
    public final long f170193c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f170194d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f170195e;

    /* compiled from: LineChartPoint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LineChartPoint> {
        @Override // android.os.Parcelable.Creator
        public final LineChartPoint createFromParcel(Parcel parcel) {
            return new LineChartPoint(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LineChartPoint[] newArray(int i12) {
            return new LineChartPoint[i12];
        }
    }

    public LineChartPoint(long j12, @k String str, long j13, @k String str2) {
        this.f170192b = j12;
        this.f170193c = j13;
        this.f170194d = str;
        this.f170195e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineChartPoint)) {
            return false;
        }
        LineChartPoint lineChartPoint = (LineChartPoint) obj;
        return this.f170192b == lineChartPoint.f170192b && this.f170193c == lineChartPoint.f170193c && L.f(this.f170194d, lineChartPoint.f170194d) && L.f(this.f170195e, lineChartPoint.f170195e);
    }

    public final int hashCode() {
        return this.f170195e.hashCode() + H.d(r.g(Long.hashCode(this.f170192b) * 31, 31, this.f170193c), 31, this.f170194d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineChartPoint(x=");
        sb2.append(this.f170192b);
        sb2.append(", y=");
        sb2.append(this.f170193c);
        sb2.append(", xLabel=");
        sb2.append(this.f170194d);
        sb2.append(", yLabel=");
        return C22026a.c(sb2, this.f170195e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f170192b);
        parcel.writeLong(this.f170193c);
        parcel.writeString(this.f170194d);
        parcel.writeString(this.f170195e);
    }
}
