package com.avito.android.avito_map;

import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AvitoFittingBoundsBuilder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u001e\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\bJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\bR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/avito/android/avito_map/AvitoFittingBoundsBuilder;", "", "points", "", "Lcom/avito/android/avito_map/AvitoMapPoint;", "(Ljava/util/List;)V", "centerPoint", "paddingBottom", "", "Ljava/lang/Double;", "paddingLeft", "paddingRight", "paddingTop", "build", "Lcom/avito/android/avito_map/AvitoMapBounds;", "calculateFittingBounds", "calculateFittingBoundsCentered", "setCenterPoint", "setPadding", "decimalDegreesPadding", "setPaddingBottom", "decimalDegreesPaddingBottom", "setPaddingLeft", "decimalDegreesPaddingLeft", "setPaddingRight", "decimalDegreesPaddingRight", "setPaddingTop", "decimalDegreesPaddingTop", "Companion", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoFittingBoundsBuilder {
    public static final double MIN_PADDING = 0.01d;
    public static final double PADDING_RATIO = 0.1d;

    @l
    private AvitoMapPoint centerPoint;

    @l
    private Double paddingBottom;

    @l
    private Double paddingLeft;

    @l
    private Double paddingRight;

    @l
    private Double paddingTop;

    @k
    private final List<AvitoMapPoint> points;

    public AvitoFittingBoundsBuilder(@k List<AvitoMapPoint> list) {
        this.points = list;
    }

    private final AvitoMapBounds calculateFittingBounds(List<AvitoMapPoint> points) {
        double latitude = Double.MIN_VALUE;
        double latitude2 = Double.MAX_VALUE;
        double longitude = Double.MAX_VALUE;
        double longitude2 = Double.MIN_VALUE;
        for (AvitoMapPoint avitoMapPoint : points) {
            if (avitoMapPoint.getLatitude() > latitude) {
                latitude = avitoMapPoint.getLatitude();
            }
            if (avitoMapPoint.getLongitude() < longitude) {
                longitude = avitoMapPoint.getLongitude();
            }
            if (avitoMapPoint.getLatitude() < latitude2) {
                latitude2 = avitoMapPoint.getLatitude();
            }
            if (avitoMapPoint.getLongitude() > longitude2) {
                longitude2 = avitoMapPoint.getLongitude();
            }
        }
        Double d12 = this.paddingTop;
        double dDoubleValue = latitude + (d12 != null ? d12.doubleValue() : calculateFittingBounds$resolveDefaultPadding(latitude, latitude2));
        Double d13 = this.paddingLeft;
        AvitoMapPoint avitoMapPoint2 = new AvitoMapPoint(dDoubleValue, longitude - (d13 != null ? d13.doubleValue() : calculateFittingBounds$resolveDefaultPadding(longitude2, longitude)), null, 4, null);
        Double d14 = this.paddingBottom;
        double dDoubleValue2 = latitude2 - (d14 != null ? d14.doubleValue() : calculateFittingBounds$resolveDefaultPadding(latitude, latitude2));
        Double d15 = this.paddingRight;
        return new AvitoMapBounds(avitoMapPoint2, new AvitoMapPoint(dDoubleValue2, longitude2 + (d15 != null ? d15.doubleValue() : calculateFittingBounds$resolveDefaultPadding(longitude2, longitude)), null, 4, null));
    }

    private static final double calculateFittingBounds$resolveDefaultPadding(double d12, double d13) {
        return Math.max((Math.abs(d13 - d12) * 0.1d) / 2, 0.01d);
    }

    private final AvitoMapBounds calculateFittingBoundsCentered(List<AvitoMapPoint> points, AvitoMapPoint centerPoint) {
        double d12 = 0.0d;
        double d13 = 0.0d;
        for (AvitoMapPoint avitoMapPoint : points) {
            double dAbs = Math.abs(centerPoint.getLongitude() - avitoMapPoint.getLongitude());
            double dAbs2 = Math.abs(centerPoint.getLatitude() - avitoMapPoint.getLatitude());
            if (dAbs > d13) {
                d13 = dAbs;
            }
            if (dAbs2 > d12) {
                d12 = dAbs2;
            }
        }
        double latitude = centerPoint.getLatitude() + d12;
        Double d14 = this.paddingTop;
        double dDoubleValue = latitude + (d14 != null ? d14.doubleValue() : calculateFittingBoundsCentered$resolveDefaultPadding$2(d12));
        double longitude = centerPoint.getLongitude() - d13;
        Double d15 = this.paddingLeft;
        AvitoMapPoint avitoMapPoint2 = new AvitoMapPoint(dDoubleValue, longitude - (d15 != null ? d15.doubleValue() : calculateFittingBoundsCentered$resolveDefaultPadding$2(d13)), null, 4, null);
        double latitude2 = centerPoint.getLatitude() - d12;
        Double d16 = this.paddingBottom;
        double dDoubleValue2 = latitude2 - (d16 != null ? d16.doubleValue() : calculateFittingBoundsCentered$resolveDefaultPadding$2(d12));
        double longitude2 = centerPoint.getLongitude() + d13;
        Double d17 = this.paddingRight;
        return new AvitoMapBounds(avitoMapPoint2, new AvitoMapPoint(dDoubleValue2, longitude2 + (d17 != null ? d17.doubleValue() : calculateFittingBoundsCentered$resolveDefaultPadding$2(d13)), null, 4, null));
    }

    private static final double calculateFittingBoundsCentered$resolveDefaultPadding$2(double d12) {
        return Math.max(d12 * 0.1d, 0.01d);
    }

    @k
    public final AvitoMapBounds build() {
        AvitoMapPoint avitoMapPoint = this.centerPoint;
        return (this.points.isEmpty() && avitoMapPoint == null) ? new AvitoMapBounds(new AvitoMapPoint(90.0d, -180.0d, null, 4, null), new AvitoMapPoint(-90.0d, 180.0d, null, 4, null)) : avitoMapPoint != null ? calculateFittingBoundsCentered(this.points, avitoMapPoint) : calculateFittingBounds(this.points);
    }

    @k
    public final AvitoFittingBoundsBuilder setCenterPoint(@l AvitoMapPoint centerPoint) {
        this.centerPoint = centerPoint;
        return this;
    }

    @k
    public final AvitoFittingBoundsBuilder setPadding(double decimalDegreesPadding) {
        this.paddingTop = Double.valueOf(decimalDegreesPadding);
        this.paddingBottom = Double.valueOf(decimalDegreesPadding);
        this.paddingLeft = Double.valueOf(decimalDegreesPadding);
        this.paddingRight = Double.valueOf(decimalDegreesPadding);
        return this;
    }

    @k
    public final AvitoFittingBoundsBuilder setPaddingBottom(double decimalDegreesPaddingBottom) {
        this.paddingBottom = Double.valueOf(decimalDegreesPaddingBottom);
        return this;
    }

    @k
    public final AvitoFittingBoundsBuilder setPaddingLeft(double decimalDegreesPaddingLeft) {
        this.paddingLeft = Double.valueOf(decimalDegreesPaddingLeft);
        return this;
    }

    @k
    public final AvitoFittingBoundsBuilder setPaddingRight(double decimalDegreesPaddingRight) {
        this.paddingRight = Double.valueOf(decimalDegreesPaddingRight);
        return this;
    }

    @k
    public final AvitoFittingBoundsBuilder setPaddingTop(double decimalDegreesPaddingTop) {
        this.paddingTop = Double.valueOf(decimalDegreesPaddingTop);
        return this;
    }
}
