package com.yandex.mapkit.map.internal;

import android.graphics.PointF;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.CompositeIcon;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.Model;
import com.yandex.mapkit.map.PlacemarkAnimation;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.TextStyle;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public class PlacemarkMapObjectBinding extends MapObjectBinding implements PlacemarkMapObject {
    public PlacemarkMapObjectBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native float getDirection();

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    @N
    public native Point getGeometry();

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native float getOpacity();

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setDirection(float f12);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setGeometry(@N Point point);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setIcon(@N ImageProvider imageProvider);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setIcon(@N ImageProvider imageProvider, @N Callback callback);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setIcon(@N ImageProvider imageProvider, @N IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setIcon(@N ImageProvider imageProvider, @N IconStyle iconStyle, @N Callback callback);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setIconStyle(@N IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setOpacity(float f12);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setScaleFunction(@N List<PointF> list);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setText(@N String str);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setText(@N String str, @N TextStyle textStyle);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setTextStyle(@N TextStyle textStyle);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setView(@N ViewProvider viewProvider);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setView(@N ViewProvider viewProvider, @N Callback callback);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setView(@N ViewProvider viewProvider, @N IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setView(@N ViewProvider viewProvider, @N IconStyle iconStyle, @N Callback callback);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    @N
    public native PlacemarkAnimation useAnimation();

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    @N
    public native CompositeIcon useCompositeIcon();

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    @N
    public native Model useModel();
}
