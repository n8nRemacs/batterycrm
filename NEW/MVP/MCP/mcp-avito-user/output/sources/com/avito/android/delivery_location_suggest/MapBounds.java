package com.avito.android.delivery_location_suggest;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MapBounds.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_location_suggest/MapBounds;", "Landroid/os/Parcelable;", "_avito_delivery-location-suggest_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MapBounds implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<MapBounds> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Point f135040b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Point f135041c;

    /* compiled from: MapBounds.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MapBounds> {
        @Override // android.os.Parcelable.Creator
        public final MapBounds createFromParcel(Parcel parcel) {
            Parcelable.Creator<Point> creator = Point.CREATOR;
            return new MapBounds(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MapBounds[] newArray(int i12) {
            return new MapBounds[i12];
        }
    }

    public MapBounds(@Y61.k Point point, @Y61.k Point point2) {
        this.f135040b = point;
        this.f135041c = point2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapBounds)) {
            return false;
        }
        MapBounds mapBounds = (MapBounds) obj;
        return L.f(this.f135040b, mapBounds.f135040b) && L.f(this.f135041c, mapBounds.f135041c);
    }

    public final int hashCode() {
        return this.f135041c.hashCode() + (this.f135040b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "MapBounds(topLeft=" + this.f135040b + ", bottomRight=" + this.f135041c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f135040b.writeToParcel(parcel, i12);
        this.f135041c.writeToParcel(parcel, i12);
    }
}
