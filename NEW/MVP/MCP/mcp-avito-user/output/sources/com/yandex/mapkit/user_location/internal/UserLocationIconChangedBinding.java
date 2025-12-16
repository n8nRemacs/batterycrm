package com.yandex.mapkit.user_location.internal;

import com.yandex.mapkit.layers.internal.ObjectEventBinding;
import com.yandex.mapkit.user_location.UserLocationIconChanged;
import com.yandex.mapkit.user_location.UserLocationIconType;
import com.yandex.runtime.NativeObject;
import j.N;

/* loaded from: classes7.dex */
public class UserLocationIconChangedBinding extends ObjectEventBinding implements UserLocationIconChanged {
    public UserLocationIconChangedBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.user_location.UserLocationIconChanged
    @N
    public native UserLocationIconType getIconType();
}
