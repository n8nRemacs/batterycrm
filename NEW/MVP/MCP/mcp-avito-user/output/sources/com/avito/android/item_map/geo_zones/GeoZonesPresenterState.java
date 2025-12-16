package com.avito.android.item_map.geo_zones;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GeoZonesPresenterState.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/geo_zones/GeoZonesPresenterState;", "Landroid/os/Parcelable;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GeoZonesPresenterState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<GeoZonesPresenterState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedText f173341b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final GeoZonesPoints f173342c;

    /* compiled from: GeoZonesPresenterState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GeoZonesPresenterState> {
        @Override // android.os.Parcelable.Creator
        public final GeoZonesPresenterState createFromParcel(Parcel parcel) {
            return new GeoZonesPresenterState((AttributedText) parcel.readParcelable(GeoZonesPresenterState.class.getClassLoader()), (GeoZonesPoints) parcel.readParcelable(GeoZonesPresenterState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GeoZonesPresenterState[] newArray(int i12) {
            return new GeoZonesPresenterState[i12];
        }
    }

    public GeoZonesPresenterState(@Y61.k AttributedText attributedText, @Y61.k GeoZonesPoints geoZonesPoints) {
        this.f173341b = attributedText;
        this.f173342c = geoZonesPoints;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoZonesPresenterState)) {
            return false;
        }
        GeoZonesPresenterState geoZonesPresenterState = (GeoZonesPresenterState) obj;
        return L.f(this.f173341b, geoZonesPresenterState.f173341b) && L.f(this.f173342c, geoZonesPresenterState.f173342c);
    }

    public final int hashCode() {
        return this.f173342c.hashCode() + (this.f173341b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "GeoZonesPresenterState(departureTo=" + this.f173341b + ", points=" + this.f173342c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f173341b, i12);
        parcel.writeParcelable(this.f173342c, i12);
    }
}
