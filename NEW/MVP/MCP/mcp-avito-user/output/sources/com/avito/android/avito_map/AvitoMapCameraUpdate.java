package com.avito.android.avito_map;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvitoMapCameraUpdate.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapCameraUpdate;", "", "cameraPosition", "Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "bounds", "Lcom/avito/android/avito_map/AvitoMapBounds;", "boundsByPoints", "Lcom/avito/android/avito_map/PointsWithOffset;", "(Lcom/avito/android/avito_map/AvitoMapCameraPosition;Lcom/avito/android/avito_map/AvitoMapBounds;Lcom/avito/android/avito_map/PointsWithOffset;)V", "getBounds", "()Lcom/avito/android/avito_map/AvitoMapBounds;", "getBoundsByPoints", "()Lcom/avito/android/avito_map/PointsWithOffset;", "getCameraPosition", "()Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AvitoMapCameraUpdate {

    @l
    private final AvitoMapBounds bounds;

    @l
    private final PointsWithOffset boundsByPoints;

    @l
    private final AvitoMapCameraPosition cameraPosition;

    public AvitoMapCameraUpdate() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AvitoMapCameraUpdate copy$default(AvitoMapCameraUpdate avitoMapCameraUpdate, AvitoMapCameraPosition avitoMapCameraPosition, AvitoMapBounds avitoMapBounds, PointsWithOffset pointsWithOffset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            avitoMapCameraPosition = avitoMapCameraUpdate.cameraPosition;
        }
        if ((i12 & 2) != 0) {
            avitoMapBounds = avitoMapCameraUpdate.bounds;
        }
        if ((i12 & 4) != 0) {
            pointsWithOffset = avitoMapCameraUpdate.boundsByPoints;
        }
        return avitoMapCameraUpdate.copy(avitoMapCameraPosition, avitoMapBounds, pointsWithOffset);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AvitoMapCameraPosition getCameraPosition() {
        return this.cameraPosition;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AvitoMapBounds getBounds() {
        return this.bounds;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final PointsWithOffset getBoundsByPoints() {
        return this.boundsByPoints;
    }

    @k
    public final AvitoMapCameraUpdate copy(@l AvitoMapCameraPosition cameraPosition, @l AvitoMapBounds bounds, @l PointsWithOffset boundsByPoints) {
        return new AvitoMapCameraUpdate(cameraPosition, bounds, boundsByPoints);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvitoMapCameraUpdate)) {
            return false;
        }
        AvitoMapCameraUpdate avitoMapCameraUpdate = (AvitoMapCameraUpdate) other;
        return L.f(this.cameraPosition, avitoMapCameraUpdate.cameraPosition) && L.f(this.bounds, avitoMapCameraUpdate.bounds) && L.f(this.boundsByPoints, avitoMapCameraUpdate.boundsByPoints);
    }

    @l
    public final AvitoMapBounds getBounds() {
        return this.bounds;
    }

    @l
    public final PointsWithOffset getBoundsByPoints() {
        return this.boundsByPoints;
    }

    @l
    public final AvitoMapCameraPosition getCameraPosition() {
        return this.cameraPosition;
    }

    public int hashCode() {
        AvitoMapCameraPosition avitoMapCameraPosition = this.cameraPosition;
        int iHashCode = (avitoMapCameraPosition == null ? 0 : avitoMapCameraPosition.hashCode()) * 31;
        AvitoMapBounds avitoMapBounds = this.bounds;
        int iHashCode2 = (iHashCode + (avitoMapBounds == null ? 0 : avitoMapBounds.hashCode())) * 31;
        PointsWithOffset pointsWithOffset = this.boundsByPoints;
        return iHashCode2 + (pointsWithOffset != null ? pointsWithOffset.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AvitoMapCameraUpdate(cameraPosition=" + this.cameraPosition + ", bounds=" + this.bounds + ", boundsByPoints=" + this.boundsByPoints + ')';
    }

    public AvitoMapCameraUpdate(@l AvitoMapCameraPosition avitoMapCameraPosition, @l AvitoMapBounds avitoMapBounds, @l PointsWithOffset pointsWithOffset) {
        this.cameraPosition = avitoMapCameraPosition;
        this.bounds = avitoMapBounds;
        this.boundsByPoints = pointsWithOffset;
    }

    public /* synthetic */ AvitoMapCameraUpdate(AvitoMapCameraPosition avitoMapCameraPosition, AvitoMapBounds avitoMapBounds, PointsWithOffset pointsWithOffset, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : avitoMapCameraPosition, (i12 & 2) != 0 ? null : avitoMapBounds, (i12 & 4) != 0 ? null : pointsWithOffset);
    }
}
