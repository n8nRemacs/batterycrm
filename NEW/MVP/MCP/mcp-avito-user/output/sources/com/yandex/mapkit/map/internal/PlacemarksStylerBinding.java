package com.yandex.mapkit.map.internal;

import android.graphics.PointF;
import com.yandex.mapkit.map.PlacemarksStyler;
import com.yandex.runtime.NativeObject;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class PlacemarksStylerBinding implements PlacemarksStyler {
    private final NativeObject nativeObject;

    public PlacemarksStylerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.PlacemarksStyler
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.PlacemarksStyler
    public native void setScaleFunction(@N List<PointF> list);
}
