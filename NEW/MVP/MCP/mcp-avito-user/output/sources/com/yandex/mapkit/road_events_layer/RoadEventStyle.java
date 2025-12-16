package com.yandex.mapkit.road_events_layer;

import android.graphics.PointF;
import com.yandex.runtime.image.ImageProvider;
import j.N;
import j.P;
import java.util.List;

/* loaded from: classes7.dex */
public interface RoadEventStyle {
    @P
    TextStyle getCaptionStyle();

    @N
    PointF getIconAnchor();

    @N
    PointF getPulsationCenter();

    int getZoomMin();

    @N
    List<PointF> getZoomScaleFunction();

    boolean isValid();

    void setCaptionStyle(@P TextStyle textStyle);

    void setIconAnchor(@N PointF pointF);

    void setIconImage(@N ImageProvider imageProvider);

    void setPulsationCenter(@N PointF pointF);

    void setZoomMin(int i12);

    void setZoomScaleFunction(@N List<PointF> list);
}
