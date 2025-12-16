package com.yandex.mapkit.map;

import android.graphics.PointF;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public interface PlacemarkMapObject extends MapObject {
    float getDirection();

    @N
    Point getGeometry();

    float getOpacity();

    void setDirection(float f12);

    void setGeometry(@N Point point);

    void setIcon(@N ImageProvider imageProvider);

    void setIcon(@N ImageProvider imageProvider, @N Callback callback);

    void setIcon(@N ImageProvider imageProvider, @N IconStyle iconStyle);

    void setIcon(@N ImageProvider imageProvider, @N IconStyle iconStyle, @N Callback callback);

    void setIconStyle(@N IconStyle iconStyle);

    void setOpacity(float f12);

    void setScaleFunction(@N List<PointF> list);

    void setText(@N String str);

    void setText(@N String str, @N TextStyle textStyle);

    void setTextStyle(@N TextStyle textStyle);

    void setView(@N ViewProvider viewProvider);

    void setView(@N ViewProvider viewProvider, @N Callback callback);

    void setView(@N ViewProvider viewProvider, @N IconStyle iconStyle);

    void setView(@N ViewProvider viewProvider, @N IconStyle iconStyle, @N Callback callback);

    @N
    PlacemarkAnimation useAnimation();

    @N
    CompositeIcon useCompositeIcon();

    @N
    Model useModel();
}
