package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.chart;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChartExpensesItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/chart/Detail;", "Landroid/os/Parcelable;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Detail implements Parcelable {

    @k
    public static final Parcelable.Creator<Detail> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final float f317687b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TypeDetail f317688c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalColor f317689d;

    /* compiled from: ChartExpensesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Detail> {
        @Override // android.os.Parcelable.Creator
        public final Detail createFromParcel(Parcel parcel) {
            return new Detail(parcel.readFloat(), TypeDetail.valueOf(parcel.readString()), (UniversalColor) parcel.readParcelable(Detail.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Detail[] newArray(int i12) {
            return new Detail[i12];
        }
    }

    public Detail(float f12, @k TypeDetail typeDetail, @l UniversalColor universalColor) {
        this.f317687b = f12;
        this.f317688c = typeDetail;
        this.f317689d = universalColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Detail)) {
            return false;
        }
        Detail detail = (Detail) obj;
        return Float.compare(this.f317687b, detail.f317687b) == 0 && this.f317688c == detail.f317688c && L.f(this.f317689d, detail.f317689d);
    }

    public final int hashCode() {
        int iHashCode = (this.f317688c.hashCode() + (Float.hashCode(this.f317687b) * 31)) * 31;
        UniversalColor universalColor = this.f317689d;
        return iHashCode + (universalColor == null ? 0 : universalColor.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Detail(percent=");
        sb2.append(this.f317687b);
        sb2.append(", type=");
        sb2.append(this.f317688c);
        sb2.append(", universalColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f317689d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeFloat(this.f317687b);
        parcel.writeString(this.f317688c.name());
        parcel.writeParcelable(this.f317689d, i12);
    }

    public /* synthetic */ Detail(float f12, TypeDetail typeDetail, UniversalColor universalColor, int i12, C42822w c42822w) {
        this(f12, typeDetail, (i12 & 4) != 0 ? null : universalColor);
    }
}
