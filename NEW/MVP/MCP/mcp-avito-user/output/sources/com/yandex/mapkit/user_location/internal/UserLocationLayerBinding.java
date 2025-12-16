package com.yandex.mapkit.user_location.internal;

import android.graphics.PointF;
import com.yandex.mapkit.location.LocationViewSource;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.user_location.UserLocationLayer;
import com.yandex.mapkit.user_location.UserLocationObjectListener;
import com.yandex.mapkit.user_location.UserLocationTapListener;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class UserLocationLayerBinding implements UserLocationLayer {
    private final NativeObject nativeObject;
    protected Subscription<UserLocationObjectListener> userLocationObjectListenerSubscription = new Subscription<UserLocationObjectListener>() { // from class: com.yandex.mapkit.user_location.internal.UserLocationLayerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(UserLocationObjectListener userLocationObjectListener) {
            return UserLocationLayerBinding.createUserLocationObjectListener(userLocationObjectListener);
        }
    };
    protected Subscription<UserLocationTapListener> userLocationTapListenerSubscription = new Subscription<UserLocationTapListener>() { // from class: com.yandex.mapkit.user_location.internal.UserLocationLayerBinding.2
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(UserLocationTapListener userLocationTapListener) {
            return UserLocationLayerBinding.createUserLocationTapListener(userLocationTapListener);
        }
    };

    public UserLocationLayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createUserLocationObjectListener(UserLocationObjectListener userLocationObjectListener);

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createUserLocationTapListener(UserLocationTapListener userLocationTapListener);

    @Override // com.yandex.mapkit.user_location.UserLocationLayer
    @P
    public native CameraPosition cameraPosition();

    @Override // com.yandex.mapkit.user_location.UserLocationLayer
    public native boolean isAnchorEnabled();

    @Override // com.yandex.mapkit.user_location.UserLocationLayer
    public native boolean isAutoZoomEnabled();

    @Override // com.yandex.mapkit.user_location.UserLocationLayer
    public native boolean isHeadingEnabled();

    @Override // com.yandex.mapkit.user_location.UserLocationLayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.user_location.UserLocationLayer
    public native boolean isVisible();

    @Override // com.yandex.mapkit.user_location.UserLocationLayer
    public native void resetAnchor();

    @Override // com.yandex.mapkit.user_location.UserLocationLayer
    public native void setAnchor(@N PointF pointF, @N PointF pointF2);

    @Override // com.yandex.mapkit.user_location.UserLocationLayer
    public native void setAutoZoomEnabled(boolean z12);

    @Override // com.yandex.mapkit.user_location.UserLocationLayer
    public native void setDefaultSource();

    @Override // com.yandex.mapkit.user_location.UserLocationLayer
    public native void setHeadingEnabled(boolean z12);

    @Override // com.yandex.mapkit.user_location.UserLocationLayer
    public native void setObjectListener(@P UserLocationObjectListener userLocationObjectListener);

    @Override // com.yandex.mapkit.user_location.UserLocationLayer
    public native void setSource(@P LocationViewSource locationViewSource);

    @Override // com.yandex.mapkit.user_location.UserLocationLayer
    public native void setTapListener(@P UserLocationTapListener userLocationTapListener);

    @Override // com.yandex.mapkit.user_location.UserLocationLayer
    public native void setVisible(boolean z12);
}
