package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.map.Arrow;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.runtime.NativeObject;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class PolylineMapObjectBinding extends MapObjectBinding implements PolylineMapObject {
    public PolylineMapObjectBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @N
    public native Arrow addArrow(@N PolylinePosition polylinePosition, float f12, int i12);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @N
    public native List<Arrow> arrows();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getArcApproximationStep();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getDashLength();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getDashOffset();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getGapLength();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @N
    public native Polyline getGeometry();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getGradientLength();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native int getOutlineColor();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getOutlineWidth();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native int getPaletteColor(int i12);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native int getStrokeColor(int i12);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getStrokeWidth();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native float getTurnRadius();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void hide(@N Subpolyline subpolyline);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void hide(@N List<Subpolyline> list);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native boolean isInnerOutlineEnabled();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void select(int i12, @N Subpolyline subpolyline);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setArcApproximationStep(float f12);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setDashLength(float f12);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setDashOffset(float f12);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setGapLength(float f12);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setGeometry(@N Polyline polyline);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setGradientLength(float f12);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setInnerOutlineEnabled(boolean z12);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setOutlineColor(int i12);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setOutlineWidth(float f12);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setPaletteColor(int i12, int i13);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setStrokeColor(int i12);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setStrokeColors(@N List<Integer> list);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setStrokeColors(@N List<Integer> list, @N List<Double> list2);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setStrokeWidth(float f12);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setTurnRadius(float f12);
}
