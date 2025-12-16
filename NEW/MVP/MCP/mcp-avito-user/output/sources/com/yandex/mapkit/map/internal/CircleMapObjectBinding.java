package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.map.CircleMapObject;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class CircleMapObjectBinding extends MapObjectBinding implements CircleMapObject {
    public CircleMapObjectBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native int getFillColor();

    @Override // com.yandex.mapkit.map.CircleMapObject
    @N
    public native Circle getGeometry();

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native int getStrokeColor();

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native float getStrokeWidth();

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native boolean isGeodesic();

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native void setFillColor(int i12);

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native void setGeodesic(boolean z12);

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native void setGeometry(@N Circle circle);

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native void setStrokeColor(int i12);

    @Override // com.yandex.mapkit.map.CircleMapObject
    public native void setStrokeWidth(float f12);
}
