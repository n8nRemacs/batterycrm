package com.avito.android.avito_map;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.actions_sheet.a;
import com.avito.android.avito_map.google.AvitoGoogleMapKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvitoMap.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00012B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0014¨\u00063"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "Landroid/os/Parcelable;", "Lcom/avito/android/avito_map/AvitoMapPoint;", "mapPoint", "", "zoomLevel", "tilt", "azimuth", "Lcom/avito/android/avito_map/AvitoMapBounds;", "viewportBounds", "<init>", "(Lcom/avito/android/avito_map/AvitoMapPoint;FFLjava/lang/Float;Lcom/avito/android/avito_map/AvitoMapBounds;)V", "component1", "()Lcom/avito/android/avito_map/AvitoMapPoint;", "component2", "()F", "component3", "component4", "()Ljava/lang/Float;", "component5", "()Lcom/avito/android/avito_map/AvitoMapBounds;", "copy", "(Lcom/avito/android/avito_map/AvitoMapPoint;FFLjava/lang/Float;Lcom/avito/android/avito_map/AvitoMapBounds;)Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/avito_map/AvitoMapPoint;", "getMapPoint", "F", "getZoomLevel", "getTilt", "Ljava/lang/Float;", "getAzimuth", "Lcom/avito/android/avito_map/AvitoMapBounds;", "getViewportBounds", "Companion", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AvitoMapCameraPosition implements Parcelable {

    @l
    private final Float azimuth;

    @k
    private final AvitoMapPoint mapPoint;
    private final float tilt;

    @l
    private final AvitoMapBounds viewportBounds;
    private final float zoomLevel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<AvitoMapCameraPosition> CREATOR = new Creator();

    /* compiled from: AvitoMap.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapCameraPosition$Companion;", "", "()V", "fromLatLngZoom", "Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "zoomLevel", "", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final AvitoMapCameraPosition fromLatLngZoom(@k LatLng latLng, float zoomLevel) {
            return new AvitoMapCameraPosition(AvitoGoogleMapKt.toAvitoMapPoint(latLng), zoomLevel, 0.0f, null, null, 24, null);
        }

        private Companion() {
        }
    }

    /* compiled from: AvitoMap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvitoMapCameraPosition> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoMapCameraPosition createFromParcel(@k Parcel parcel) {
            return new AvitoMapCameraPosition(AvitoMapPoint.CREATOR.createFromParcel(parcel), parcel.readFloat(), parcel.readFloat(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? AvitoMapBounds.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AvitoMapCameraPosition[] newArray(int i12) {
            return new AvitoMapCameraPosition[i12];
        }
    }

    public AvitoMapCameraPosition(@k AvitoMapPoint avitoMapPoint, float f12, float f13, @l Float f14, @l AvitoMapBounds avitoMapBounds) {
        this.mapPoint = avitoMapPoint;
        this.zoomLevel = f12;
        this.tilt = f13;
        this.azimuth = f14;
        this.viewportBounds = avitoMapBounds;
    }

    public static /* synthetic */ AvitoMapCameraPosition copy$default(AvitoMapCameraPosition avitoMapCameraPosition, AvitoMapPoint avitoMapPoint, float f12, float f13, Float f14, AvitoMapBounds avitoMapBounds, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            avitoMapPoint = avitoMapCameraPosition.mapPoint;
        }
        if ((i12 & 2) != 0) {
            f12 = avitoMapCameraPosition.zoomLevel;
        }
        float f15 = f12;
        if ((i12 & 4) != 0) {
            f13 = avitoMapCameraPosition.tilt;
        }
        float f16 = f13;
        if ((i12 & 8) != 0) {
            f14 = avitoMapCameraPosition.azimuth;
        }
        Float f17 = f14;
        if ((i12 & 16) != 0) {
            avitoMapBounds = avitoMapCameraPosition.viewportBounds;
        }
        return avitoMapCameraPosition.copy(avitoMapPoint, f15, f16, f17, avitoMapBounds);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AvitoMapPoint getMapPoint() {
        return this.mapPoint;
    }

    /* renamed from: component2, reason: from getter */
    public final float getZoomLevel() {
        return this.zoomLevel;
    }

    /* renamed from: component3, reason: from getter */
    public final float getTilt() {
        return this.tilt;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Float getAzimuth() {
        return this.azimuth;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AvitoMapBounds getViewportBounds() {
        return this.viewportBounds;
    }

    @k
    public final AvitoMapCameraPosition copy(@k AvitoMapPoint mapPoint, float zoomLevel, float tilt, @l Float azimuth, @l AvitoMapBounds viewportBounds) {
        return new AvitoMapCameraPosition(mapPoint, zoomLevel, tilt, azimuth, viewportBounds);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvitoMapCameraPosition)) {
            return false;
        }
        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) other;
        return L.f(this.mapPoint, avitoMapCameraPosition.mapPoint) && Float.compare(this.zoomLevel, avitoMapCameraPosition.zoomLevel) == 0 && Float.compare(this.tilt, avitoMapCameraPosition.tilt) == 0 && L.f(this.azimuth, avitoMapCameraPosition.azimuth) && L.f(this.viewportBounds, avitoMapCameraPosition.viewportBounds);
    }

    @l
    public final Float getAzimuth() {
        return this.azimuth;
    }

    @k
    public final AvitoMapPoint getMapPoint() {
        return this.mapPoint;
    }

    public final float getTilt() {
        return this.tilt;
    }

    @l
    public final AvitoMapBounds getViewportBounds() {
        return this.viewportBounds;
    }

    public final float getZoomLevel() {
        return this.zoomLevel;
    }

    public int hashCode() {
        int iD2 = r.d(this.tilt, r.d(this.zoomLevel, this.mapPoint.hashCode() * 31, 31), 31);
        Float f12 = this.azimuth;
        int iHashCode = (iD2 + (f12 == null ? 0 : f12.hashCode())) * 31;
        AvitoMapBounds avitoMapBounds = this.viewportBounds;
        return iHashCode + (avitoMapBounds != null ? avitoMapBounds.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AvitoMapCameraPosition(mapPoint=" + this.mapPoint + ", zoomLevel=" + this.zoomLevel + ", tilt=" + this.tilt + ", azimuth=" + this.azimuth + ", viewportBounds=" + this.viewportBounds + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.mapPoint.writeToParcel(parcel, flags);
        parcel.writeFloat(this.zoomLevel);
        parcel.writeFloat(this.tilt);
        Float f12 = this.azimuth;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        AvitoMapBounds avitoMapBounds = this.viewportBounds;
        if (avitoMapBounds == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avitoMapBounds.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ AvitoMapCameraPosition(AvitoMapPoint avitoMapPoint, float f12, float f13, Float f14, AvitoMapBounds avitoMapBounds, int i12, C42822w c42822w) {
        this(avitoMapPoint, f12, (i12 & 4) != 0 ? 0.0f : f13, (i12 & 8) != 0 ? null : f14, (i12 & 16) != 0 ? null : avitoMapBounds);
    }
}
