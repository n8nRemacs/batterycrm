package com.avito.android.rating_ui.statistic;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingStatisticRow.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/statistic/RatingStatisticRow;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingStatisticRow implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingStatisticRow> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f250467b;

    /* renamed from: c, reason: collision with root package name */
    public final float f250468c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f250469d;

    /* compiled from: RatingStatisticRow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingStatisticRow> {
        @Override // android.os.Parcelable.Creator
        public final RatingStatisticRow createFromParcel(Parcel parcel) {
            return new RatingStatisticRow(parcel.readFloat(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingStatisticRow[] newArray(int i12) {
            return new RatingStatisticRow[i12];
        }
    }

    public RatingStatisticRow(float f12, @k String str, int i12) {
        this.f250467b = i12;
        this.f250468c = f12;
        this.f250469d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingStatisticRow)) {
            return false;
        }
        RatingStatisticRow ratingStatisticRow = (RatingStatisticRow) obj;
        return this.f250467b == ratingStatisticRow.f250467b && Float.compare(this.f250468c, ratingStatisticRow.f250468c) == 0 && L.f(this.f250469d, ratingStatisticRow.f250469d);
    }

    public final int hashCode() {
        return this.f250469d.hashCode() + r.d(this.f250468c, Integer.hashCode(this.f250467b) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingStatisticRow(rating=");
        sb2.append(this.f250467b);
        sb2.append(", progress=");
        sb2.append(this.f250468c);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f250469d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f250467b);
        parcel.writeFloat(this.f250468c);
        parcel.writeString(this.f250469d);
    }
}
