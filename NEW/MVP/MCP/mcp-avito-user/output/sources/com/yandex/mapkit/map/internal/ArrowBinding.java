package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.map.Arrow;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class ArrowBinding implements Arrow {
    private final NativeObject nativeObject;

    public ArrowBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.Arrow
    public native int getFillColor();

    @Override // com.yandex.mapkit.map.Arrow
    public native float getLength();

    @Override // com.yandex.mapkit.map.Arrow
    public native int getOutlineColor();

    @Override // com.yandex.mapkit.map.Arrow
    public native float getOutlineWidth();

    @Override // com.yandex.mapkit.map.Arrow
    @N
    public native PolylinePosition getPosition();

    @Override // com.yandex.mapkit.map.Arrow
    public native float getTriangleHeight();

    @Override // com.yandex.mapkit.map.Arrow
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.Arrow
    public native boolean isVisible();

    @Override // com.yandex.mapkit.map.Arrow
    public native void setFillColor(int i12);

    @Override // com.yandex.mapkit.map.Arrow
    public native void setLength(float f12);

    @Override // com.yandex.mapkit.map.Arrow
    public native void setOutlineColor(int i12);

    @Override // com.yandex.mapkit.map.Arrow
    public native void setOutlineWidth(float f12);

    @Override // com.yandex.mapkit.map.Arrow
    public native void setTriangleHeight(float f12);

    @Override // com.yandex.mapkit.map.Arrow
    public native void setVisible(boolean z12);
}
