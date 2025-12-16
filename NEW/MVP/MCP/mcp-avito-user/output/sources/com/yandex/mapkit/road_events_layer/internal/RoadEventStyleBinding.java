package com.yandex.mapkit.road_events_layer.internal;

import android.graphics.PointF;
import com.yandex.mapkit.road_events_layer.RoadEventStyle;
import com.yandex.mapkit.road_events_layer.TextStyle;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.ImageProvider;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public class RoadEventStyleBinding implements RoadEventStyle {
    private final NativeObject nativeObject;

    public RoadEventStyleBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    @P
    public native TextStyle getCaptionStyle();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    @N
    public native PointF getIconAnchor();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    @N
    public native PointF getPulsationCenter();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native int getZoomMin();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    @N
    public native List<PointF> getZoomScaleFunction();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native boolean isValid();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native void setCaptionStyle(@P TextStyle textStyle);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native void setIconAnchor(@N PointF pointF);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native void setIconImage(@N ImageProvider imageProvider);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native void setPulsationCenter(@N PointF pointF);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native void setZoomMin(int i12);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native void setZoomScaleFunction(@N List<PointF> list);
}
