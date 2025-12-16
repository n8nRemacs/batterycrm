package com.avito.android.delivery_location_suggest;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: Coordinates.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_location_suggest/Coordinates;", "Landroid/os/Parcelable;", "_avito_delivery-location-suggest_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Coordinates implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<Coordinates> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final double f135016b;

    /* renamed from: c, reason: collision with root package name */
    public final double f135017c;

    /* compiled from: Coordinates.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Coordinates> {
        @Override // android.os.Parcelable.Creator
        public final Coordinates createFromParcel(Parcel parcel) {
            return new Coordinates(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Coordinates[] newArray(int i12) {
            return new Coordinates[i12];
        }
    }

    public Coordinates(double d12, double d13) {
        this.f135016b = d12;
        this.f135017c = d13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coordinates)) {
            return false;
        }
        Coordinates coordinates = (Coordinates) obj;
        return Double.compare(this.f135016b, coordinates.f135016b) == 0 && Double.compare(this.f135017c, coordinates.f135017c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f135017c) + (Double.hashCode(this.f135016b) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Coordinates(latitude=");
        sb2.append(this.f135016b);
        sb2.append(", longitude=");
        return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.f135017c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeDouble(this.f135016b);
        parcel.writeDouble(this.f135017c);
    }
}
