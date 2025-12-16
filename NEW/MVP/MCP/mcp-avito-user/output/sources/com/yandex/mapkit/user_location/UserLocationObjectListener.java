package com.yandex.mapkit.user_location;

import com.yandex.mapkit.layers.ObjectEvent;
import j.N;
import j.j0;

/* loaded from: classes7.dex */
public interface UserLocationObjectListener {
    @j0
    void onObjectAdded(@N UserLocationView userLocationView);

    @j0
    void onObjectRemoved(@N UserLocationView userLocationView);

    @j0
    void onObjectUpdated(@N UserLocationView userLocationView, @N ObjectEvent objectEvent);
}
