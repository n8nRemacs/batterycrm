package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.geometry.Polygon;
import com.yandex.mapkit.map.PolygonMapObject;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;
import j.N;

/* loaded from: classes7.dex */
public class PolygonMapObjectBinding extends MapObjectBinding implements PolygonMapObject {
    public PolygonMapObjectBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.PolygonMapObject
    public native int getFillColor();

    @Override // com.yandex.mapkit.map.PolygonMapObject
    @N
    public native Polygon getGeometry();

    @Override // com.yandex.mapkit.map.PolygonMapObject
    public native int getStrokeColor();

    @Override // com.yandex.mapkit.map.PolygonMapObject
    public native float getStrokeWidth();

    @Override // com.yandex.mapkit.map.PolygonMapObject
    public native boolean isGeodesic();

    @Override // com.yandex.mapkit.map.PolygonMapObject
    public native void resetPattern();

    @Override // com.yandex.mapkit.map.PolygonMapObject
    public native void setFillColor(int i12);

    @Override // com.yandex.mapkit.map.PolygonMapObject
    public native void setGeodesic(boolean z12);

    @Override // com.yandex.mapkit.map.PolygonMapObject
    public native void setGeometry(@N Polygon polygon);

    @Override // com.yandex.mapkit.map.PolygonMapObject
    public native void setPattern(@N AnimatedImageProvider animatedImageProvider, float f12);

    @Override // com.yandex.mapkit.map.PolygonMapObject
    public native void setPattern(@N ImageProvider imageProvider, float f12);

    @Override // com.yandex.mapkit.map.PolygonMapObject
    public native void setStrokeColor(int i12);

    @Override // com.yandex.mapkit.map.PolygonMapObject
    public native void setStrokeWidth(float f12);
}
