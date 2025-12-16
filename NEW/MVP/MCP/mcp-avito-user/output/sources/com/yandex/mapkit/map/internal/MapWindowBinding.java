package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.GestureFocusPointMode;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.PointOfView;
import com.yandex.mapkit.map.SizeChangedListener;
import com.yandex.mapkit.map.VisibleRegion;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class MapWindowBinding implements MapWindow {
    private final NativeObject nativeObject;
    protected Subscription<SizeChangedListener> sizeChangedListenerSubscription = new Subscription<SizeChangedListener>() { // from class: com.yandex.mapkit.map.internal.MapWindowBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(SizeChangedListener sizeChangedListener) {
            return MapWindowBinding.createSizeChangedListener(sizeChangedListener);
        }
    };

    public MapWindowBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createSizeChangedListener(SizeChangedListener sizeChangedListener);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void addSizeChangedListener(@N SizeChangedListener sizeChangedListener);

    @Override // com.yandex.mapkit.map.MapWindow
    @P
    public native ScreenPoint getFocusPoint();

    @Override // com.yandex.mapkit.map.MapWindow
    @P
    public native ScreenRect getFocusRect();

    @Override // com.yandex.mapkit.map.MapWindow
    @N
    public native VisibleRegion getFocusRegion();

    @Override // com.yandex.mapkit.map.MapWindow
    @P
    public native ScreenPoint getGestureFocusPoint();

    @Override // com.yandex.mapkit.map.MapWindow
    @N
    public native GestureFocusPointMode getGestureFocusPointMode();

    @Override // com.yandex.mapkit.map.MapWindow
    @N
    public native Map getMap();

    @Override // com.yandex.mapkit.map.MapWindow
    @N
    public native PointOfView getPointOfView();

    @Override // com.yandex.mapkit.map.MapWindow
    public native float getScaleFactor();

    @Override // com.yandex.mapkit.map.MapWindow
    public native int height();

    @Override // com.yandex.mapkit.map.MapWindow
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.MapWindow
    public native void removeSizeChangedListener(@N SizeChangedListener sizeChangedListener);

    @Override // com.yandex.mapkit.map.MapWindow
    @P
    public native Point screenToWorld(@N ScreenPoint screenPoint);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void setFocusPoint(@P ScreenPoint screenPoint);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void setFocusRect(@P ScreenRect screenRect);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void setGestureFocusPoint(@P ScreenPoint screenPoint);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void setGestureFocusPointMode(@N GestureFocusPointMode gestureFocusPointMode);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void setPointOfView(@N PointOfView pointOfView);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void setScaleFactor(float f12);

    @Override // com.yandex.mapkit.map.MapWindow
    public native int width();

    @Override // com.yandex.mapkit.map.MapWindow
    @P
    public native ScreenPoint worldToScreen(@N Point point);
}
