package com.avito.android.imv_chart;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsChartItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_chart/ImvCarsChartRange;", "Landroid/os/Parcelable;", "_avito_imv-chart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImvCarsChartRange implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ImvCarsChartRange> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f170254b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f170255c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f170256d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f170257e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f170258f;

    /* compiled from: ImvCarsChartItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsChartRange> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsChartRange createFromParcel(Parcel parcel) {
            return new ImvCarsChartRange(parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(ImvCarsChartRange.class.getClassLoader()), (UniversalColor) parcel.readParcelable(ImvCarsChartRange.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsChartRange[] newArray(int i12) {
            return new ImvCarsChartRange[i12];
        }
    }

    public ImvCarsChartRange(@Y61.k String str, @Y61.l String str2, @Y61.k UniversalColor universalColor, @Y61.k UniversalColor universalColor2, boolean z12) {
        this.f170254b = str;
        this.f170255c = str2;
        this.f170256d = universalColor;
        this.f170257e = universalColor2;
        this.f170258f = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvCarsChartRange)) {
            return false;
        }
        ImvCarsChartRange imvCarsChartRange = (ImvCarsChartRange) obj;
        return L.f(this.f170254b, imvCarsChartRange.f170254b) && L.f(this.f170255c, imvCarsChartRange.f170255c) && L.f(this.f170256d, imvCarsChartRange.f170256d) && L.f(this.f170257e, imvCarsChartRange.f170257e) && this.f170258f == imvCarsChartRange.f170258f;
    }

    public final int hashCode() {
        int iHashCode = this.f170254b.hashCode() * 31;
        String str = this.f170255c;
        return Boolean.hashCode(this.f170258f) + com.avito.android.actions_sheet.a.i(this.f170257e, com.avito.android.actions_sheet.a.i(this.f170256d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImvCarsChartRange(title=");
        sb2.append(this.f170254b);
        sb2.append(", subtitle=");
        sb2.append(this.f170255c);
        sb2.append(", titleColor=");
        sb2.append(this.f170256d);
        sb2.append(", rangeColor=");
        sb2.append(this.f170257e);
        sb2.append(", isAccented=");
        return r.x(sb2, this.f170258f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f170254b);
        parcel.writeString(this.f170255c);
        parcel.writeParcelable(this.f170256d, i12);
        parcel.writeParcelable(this.f170257e, i12);
        parcel.writeInt(this.f170258f ? 1 : 0);
    }
}
