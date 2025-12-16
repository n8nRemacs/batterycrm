package com.avito.android.item_map.geo_zones;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GeoZonesPresenterState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/item_map/geo_zones/GeoZonesPoints;", "Landroid/os/Parcelable;", "Markers", "Polygons", "Lcom/avito/android/item_map/geo_zones/GeoZonesPoints$Markers;", "Lcom/avito/android/item_map/geo_zones/GeoZonesPoints$Polygons;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface GeoZonesPoints extends Parcelable {

    /* compiled from: GeoZonesPresenterState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/geo_zones/GeoZonesPoints$Markers;", "Lcom/avito/android/item_map/geo_zones/GeoZonesPoints;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Markers implements GeoZonesPoints {

        @Y61.k
        public static final Parcelable.Creator<Markers> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f173339b;

        /* compiled from: GeoZonesPresenterState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Markers> {
            @Override // android.os.Parcelable.Creator
            public final Markers createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Markers.class, parcel, arrayList, iL2, 1);
                }
                return new Markers(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Markers[] newArray(int i12) {
                return new Markers[i12];
            }
        }

        public Markers(@Y61.k ArrayList arrayList) {
            this.f173339b = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Markers) && this.f173339b.equals(((Markers) obj).f173339b);
        }

        public final int hashCode() {
            return this.f173339b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Markers(values="), this.f173339b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f173339b, parcel);
            while (itZ.hasNext()) {
                parcel.writeParcelable((Parcelable) itZ.next(), i12);
            }
        }
    }

    /* compiled from: GeoZonesPresenterState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/geo_zones/GeoZonesPoints$Polygons;", "Lcom/avito/android/item_map/geo_zones/GeoZonesPoints;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Polygons implements GeoZonesPoints {

        @Y61.k
        public static final Parcelable.Creator<Polygons> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f173340b;

        /* compiled from: GeoZonesPresenterState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Polygons> {
            @Override // android.os.Parcelable.Creator
            public final Polygons createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    int i14 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i14);
                    int iL2 = 0;
                    while (iL2 != i14) {
                        iL2 = com.avito.android.actions_sheet.a.l(Polygons.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList.add(arrayList2);
                }
                return new Polygons(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Polygons[] newArray(int i12) {
                return new Polygons[i12];
            }
        }

        public Polygons(@Y61.k ArrayList arrayList) {
            this.f173340b = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Polygons) && this.f173340b.equals(((Polygons) obj).f173340b);
        }

        public final int hashCode() {
            return this.f173340b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Polygons(values="), this.f173340b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f173340b, parcel);
            while (itZ.hasNext()) {
                Iterator itJ = C0.j((List) itZ.next(), parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), i12);
                }
            }
        }
    }
}
