package com.avito.android.avito_map;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoMapCameraUpdate.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/avito/android/avito_map/PointsWithOffset;", "", "points", "", "Lcom/avito/android/avito_map/AvitoMapPoint;", "offset", "", "(Ljava/util/List;I)V", "getOffset", "()I", "getPoints", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PointsWithOffset {
    private final int offset;

    @k
    private final List<AvitoMapPoint> points;

    public PointsWithOffset(@k List<AvitoMapPoint> list, int i12) {
        this.points = list;
        this.offset = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PointsWithOffset copy$default(PointsWithOffset pointsWithOffset, List list, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = pointsWithOffset.points;
        }
        if ((i13 & 2) != 0) {
            i12 = pointsWithOffset.offset;
        }
        return pointsWithOffset.copy(list, i12);
    }

    @k
    public final List<AvitoMapPoint> component1() {
        return this.points;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    @k
    public final PointsWithOffset copy(@k List<AvitoMapPoint> points, int offset) {
        return new PointsWithOffset(points, offset);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointsWithOffset)) {
            return false;
        }
        PointsWithOffset pointsWithOffset = (PointsWithOffset) other;
        return L.f(this.points, pointsWithOffset.points) && this.offset == pointsWithOffset.offset;
    }

    public final int getOffset() {
        return this.offset;
    }

    @k
    public final List<AvitoMapPoint> getPoints() {
        return this.points;
    }

    public int hashCode() {
        return Integer.hashCode(this.offset) + (this.points.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PointsWithOffset(points=");
        sb2.append(this.points);
        sb2.append(", offset=");
        return r.t(sb2, this.offset, ')');
    }
}
