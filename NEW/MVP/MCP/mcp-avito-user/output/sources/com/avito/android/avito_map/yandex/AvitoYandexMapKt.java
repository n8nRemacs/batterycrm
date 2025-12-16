package com.avito.android.avito_map.yandex;

import Y61.k;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.VisibleRegion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoYandexMap.kt */
@s0
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u000b\u001a\u00020\f*\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\n\u0010\u0014\u001a\u00020\u0015*\u00020\r\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\u0012\u001a\n\u0010\u0018\u001a\u00020\r*\u00020\u0015\u001a\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u001a*\b\u0012\u0004\u0012\u00020\u00150\u001a\u001a\n\u0010\u001b\u001a\u00020\u001c*\u00020\u001d\u001a\n\u0010\u001e\u001a\u00020\u0001*\u00020\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"ANIMATION_DEFAULT", "", "ANIMATION_FAST", "ANIMATION_LONG", "APPROXIMATE_LOCATION_WIDTH", "APPROXIMATE_RADIUS", "DASH_LENGTH", "GAP_LENGTH", "NO_ANIMATION", "YANDEX_MAP_API_KEY", "", "equalsWithPrecision", "", "Lcom/yandex/mapkit/geometry/Point;", "point", "precision", "", "toAvitoMapBounds", "Lcom/avito/android/avito_map/AvitoMapBounds;", "Lcom/yandex/mapkit/map/VisibleRegion;", "toAvitoMapPoint", "Lcom/avito/android/avito_map/AvitoMapPoint;", "toBoundingBox", "Lcom/yandex/mapkit/geometry/BoundingBox;", "toPoint", "toPoints", "", "toYandexCameraPosition", "Lcom/yandex/mapkit/map/CameraPosition;", "Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "toYandexMapAnimationLength", "Lcom/avito/android/avito_map/AvitoMap$AnimationLength;", "_avito_avito-map_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoYandexMapKt {
    private static final float ANIMATION_DEFAULT = 0.5f;
    private static final float ANIMATION_FAST = 0.15f;
    private static final float ANIMATION_LONG = 1.0f;
    private static final float APPROXIMATE_LOCATION_WIDTH = 1.0f;
    private static final float APPROXIMATE_RADIUS = 3000.0f;
    private static final float DASH_LENGTH = 12.0f;
    private static final float GAP_LENGTH = 4.0f;
    public static final float NO_ANIMATION = 0.0f;

    @k
    public static final String YANDEX_MAP_API_KEY = "ccfa5968-83db-4864-b661-2717d7e7225d";

    /* compiled from: AvitoYandexMap.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvitoMap.AnimationLength.values().length];
            try {
                iArr[AvitoMap.AnimationLength.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvitoMap.AnimationLength.FAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvitoMap.AnimationLength.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final boolean equalsWithPrecision(Point point, Point point2, double d12) {
        if (point2 == null) {
            return false;
        }
        if (point.getLatitude() == point2.getLatitude() && point.getLongitude() == point2.getLongitude()) {
            return true;
        }
        return Math.abs(point.getLatitude() - point2.getLatitude()) < d12 && Math.abs(point.getLongitude() - point2.getLongitude()) < d12;
    }

    public static /* synthetic */ boolean equalsWithPrecision$default(Point point, Point point2, double d12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            d12 = 1.0E-7d;
        }
        return equalsWithPrecision(point, point2, d12);
    }

    @k
    public static final AvitoMapBounds toAvitoMapBounds(@k VisibleRegion visibleRegion) {
        return new AvitoMapBounds(new AvitoMapPoint(visibleRegion.getTopLeft().getLatitude(), visibleRegion.getTopLeft().getLongitude(), null, 4, null), new AvitoMapPoint(visibleRegion.getBottomRight().getLatitude(), visibleRegion.getBottomRight().getLongitude(), null, 4, null));
    }

    @k
    public static final AvitoMapPoint toAvitoMapPoint(@k Point point) {
        return new AvitoMapPoint(point.getLatitude(), point.getLongitude(), null, 4, null);
    }

    @k
    public static final BoundingBox toBoundingBox(@k AvitoMapBounds avitoMapBounds) {
        return new BoundingBox(new Point(avitoMapBounds.getBottomRight().getLatitude(), avitoMapBounds.getTopLeft().getLongitude()), new Point(avitoMapBounds.getTopLeft().getLatitude(), avitoMapBounds.getBottomRight().getLongitude()));
    }

    @k
    public static final Point toPoint(@k AvitoMapPoint avitoMapPoint) {
        return new Point(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude());
    }

    @k
    public static final List<Point> toPoints(@k List<AvitoMapPoint> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toPoint((AvitoMapPoint) it.next()));
        }
        return arrayList;
    }

    @k
    public static final CameraPosition toYandexCameraPosition(@k AvitoMapCameraPosition avitoMapCameraPosition) {
        Point point = toPoint(avitoMapCameraPosition.getMapPoint());
        float zoomLevel = avitoMapCameraPosition.getZoomLevel();
        float tilt = avitoMapCameraPosition.getTilt();
        Float azimuth = avitoMapCameraPosition.getAzimuth();
        return new CameraPosition(point, zoomLevel, tilt, azimuth != null ? azimuth.floatValue() : 0.0f);
    }

    public static final float toYandexMapAnimationLength(@k AvitoMap.AnimationLength animationLength) {
        int i12 = WhenMappings.$EnumSwitchMapping$0[animationLength.ordinal()];
        if (i12 == 1) {
            return ANIMATION_DEFAULT;
        }
        if (i12 == 2) {
            return ANIMATION_FAST;
        }
        if (i12 == 3) {
            return 1.0f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
