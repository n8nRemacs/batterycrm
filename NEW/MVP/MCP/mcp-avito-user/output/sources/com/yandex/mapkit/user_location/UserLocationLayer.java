package com.yandex.mapkit.user_location;

import android.graphics.PointF;
import com.yandex.mapkit.location.LocationViewSource;
import com.yandex.mapkit.map.CameraPosition;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public interface UserLocationLayer {
    @P
    CameraPosition cameraPosition();

    boolean isAnchorEnabled();

    boolean isAutoZoomEnabled();

    boolean isHeadingEnabled();

    boolean isValid();

    boolean isVisible();

    void resetAnchor();

    void setAnchor(@N PointF pointF, @N PointF pointF2);

    void setAutoZoomEnabled(boolean z12);

    void setDefaultSource();

    void setHeadingEnabled(boolean z12);

    void setObjectListener(@P UserLocationObjectListener userLocationObjectListener);

    void setSource(@P LocationViewSource locationViewSource);

    void setTapListener(@P UserLocationTapListener userLocationTapListener);

    void setVisible(boolean z12);
}
