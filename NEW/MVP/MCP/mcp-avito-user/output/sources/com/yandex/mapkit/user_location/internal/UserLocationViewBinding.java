package com.yandex.mapkit.user_location.internal;

import com.yandex.mapkit.map.CircleMapObject;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.user_location.UserLocationView;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class UserLocationViewBinding implements UserLocationView {
    private final NativeObject nativeObject;

    public UserLocationViewBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.user_location.UserLocationView
    @N
    public native CircleMapObject getAccuracyCircle();

    @Override // com.yandex.mapkit.user_location.UserLocationView
    @N
    public native PlacemarkMapObject getArrow();

    @Override // com.yandex.mapkit.user_location.UserLocationView
    @N
    public native PlacemarkMapObject getPin();

    @Override // com.yandex.mapkit.user_location.UserLocationView
    public native boolean isValid();
}
