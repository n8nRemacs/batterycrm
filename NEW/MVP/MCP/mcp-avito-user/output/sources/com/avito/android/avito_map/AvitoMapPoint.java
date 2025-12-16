package com.avito.android.avito_map;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvitoMapPoint.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010¨\u0006*"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapPoint;", "Landroid/os/Parcelable;", "", "latitude", "longitude", "Lcom/avito/android/avito_map/AvitoMapPointData;", "data", "<init>", "(DDLcom/avito/android/avito_map/AvitoMapPointData;)V", "Lcom/google/android/gms/maps/model/LatLng;", "toLatLng", "()Lcom/google/android/gms/maps/model/LatLng;", "component1", "()D", "component2", "component3", "()Lcom/avito/android/avito_map/AvitoMapPointData;", "copy", "(DDLcom/avito/android/avito_map/AvitoMapPointData;)Lcom/avito/android/avito_map/AvitoMapPoint;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "D", "getLatitude", "getLongitude", "Lcom/avito/android/avito_map/AvitoMapPointData;", "getData", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AvitoMapPoint implements Parcelable {

    @k
    public static final Parcelable.Creator<AvitoMapPoint> CREATOR = new Creator();

    @l
    private final AvitoMapPointData data;
    private final double latitude;
    private final double longitude;

    /* compiled from: AvitoMapPoint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvitoMapPoint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoMapPoint createFromParcel(@k Parcel parcel) {
            return new AvitoMapPoint(parcel.readDouble(), parcel.readDouble(), (AvitoMapPointData) parcel.readParcelable(AvitoMapPoint.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoMapPoint[] newArray(int i12) {
            return new AvitoMapPoint[i12];
        }
    }

    public AvitoMapPoint(double d12, double d13, @l AvitoMapPointData avitoMapPointData) {
        this.latitude = d12;
        this.longitude = d13;
        this.data = avitoMapPointData;
    }

    public static /* synthetic */ AvitoMapPoint copy$default(AvitoMapPoint avitoMapPoint, double d12, double d13, AvitoMapPointData avitoMapPointData, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            d12 = avitoMapPoint.latitude;
        }
        double d14 = d12;
        if ((i12 & 2) != 0) {
            d13 = avitoMapPoint.longitude;
        }
        double d15 = d13;
        if ((i12 & 4) != 0) {
            avitoMapPointData = avitoMapPoint.data;
        }
        return avitoMapPoint.copy(d14, d15, avitoMapPointData);
    }

    /* renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AvitoMapPointData getData() {
        return this.data;
    }

    @k
    public final AvitoMapPoint copy(double latitude, double longitude, @l AvitoMapPointData data) {
        return new AvitoMapPoint(latitude, longitude, data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvitoMapPoint)) {
            return false;
        }
        AvitoMapPoint avitoMapPoint = (AvitoMapPoint) other;
        return Double.compare(this.latitude, avitoMapPoint.latitude) == 0 && Double.compare(this.longitude, avitoMapPoint.longitude) == 0 && L.f(this.data, avitoMapPoint.data);
    }

    @l
    public final AvitoMapPointData getData() {
        return this.data;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        int iD2 = e.d(Double.hashCode(this.latitude) * 31, 31, this.longitude);
        AvitoMapPointData avitoMapPointData = this.data;
        return iD2 + (avitoMapPointData == null ? 0 : avitoMapPointData.hashCode());
    }

    @k
    public final LatLng toLatLng() {
        return new LatLng(this.latitude, this.longitude);
    }

    @k
    public String toString() {
        return "AvitoMapPoint(latitude=" + this.latitude + ", longitude=" + this.longitude + ", data=" + this.data + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeParcelable(this.data, flags);
    }

    public /* synthetic */ AvitoMapPoint(double d12, double d13, AvitoMapPointData avitoMapPointData, int i12, C42822w c42822w) {
        this(d12, d13, (i12 & 4) != 0 ? null : avitoMapPointData);
    }
}
