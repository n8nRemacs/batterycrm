package com.avito.android.avito_map;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: AvitoMapBoundsBuilder.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0003J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapBoundsBuilder;", "", "width", "", "height", "(II)V", "getHeight", "()I", "maxLat", "", "maxLng", "minLat", "minLng", "offset", "Lcom/avito/android/avito_map/ZoomOffset;", "getWidth", "addOffset", "addPoint", "point", "Lcom/avito/android/avito_map/AvitoMapPoint;", "build", "Lcom/avito/android/avito_map/AvitoMapBounds;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoMapBoundsBuilder {
    private final int height;
    private double maxLat = -90.0d;
    private double maxLng = -180.0d;
    private double minLat = 90.0d;
    private double minLng = 180.0d;

    @k
    private ZoomOffset offset = new ZoomOffset();
    private final int width;

    public AvitoMapBoundsBuilder(int i12, int i13) {
        this.width = i12;
        this.height = i13;
    }

    @k
    public final AvitoMapBoundsBuilder addOffset(int offset) {
        this.offset = new ZoomOffset(offset, offset, offset, offset);
        return this;
    }

    @k
    public final AvitoMapBoundsBuilder addPoint(@k AvitoMapPoint point) {
        if (this.minLat > point.getLatitude()) {
            this.minLat = point.getLatitude();
        }
        if (this.minLng > point.getLongitude()) {
            this.minLng = point.getLongitude();
        }
        if (this.maxLat < point.getLatitude()) {
            this.maxLat = point.getLatitude();
        }
        if (this.maxLng < point.getLongitude()) {
            this.maxLng = point.getLongitude();
        }
        return this;
    }

    @l
    public final AvitoMapBounds build() {
        double d12 = this.maxLat;
        double d13 = this.minLat;
        double d14 = d12 - d13;
        double d15 = this.maxLng - this.minLng;
        if (this.width == 0 || this.height == 0) {
            return null;
        }
        this.minLat = d13 - ((this.offset.getBottom() / this.height) * d14);
        this.maxLat = (d14 * (this.offset.getTop() / this.height)) + this.maxLat;
        this.minLng -= (this.offset.getLeft() / this.width) * d15;
        this.maxLng = (d15 * (this.offset.getRight() / this.width)) + this.maxLng;
        return new AvitoMapBounds(new AvitoMapPoint(this.maxLat, this.minLng, null, 4, null), new AvitoMapPoint(this.minLat, this.maxLng, null, 4, null));
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    @k
    public final AvitoMapBoundsBuilder addOffset(@k ZoomOffset offset) {
        this.offset = offset;
        return this;
    }
}
