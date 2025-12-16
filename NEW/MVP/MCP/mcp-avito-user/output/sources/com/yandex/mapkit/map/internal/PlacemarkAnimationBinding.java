package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.PlacemarkAnimation;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.AnimatedImageProvider;
import j.N;

/* loaded from: classes7.dex */
public class PlacemarkAnimationBinding implements PlacemarkAnimation {
    private final NativeObject nativeObject;

    public PlacemarkAnimationBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native boolean isReversed();

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void pause();

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void play();

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void play(@N Callback callback);

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void resume();

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void setIcon(@N AnimatedImageProvider animatedImageProvider, @N IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void setIcon(@N AnimatedImageProvider animatedImageProvider, @N IconStyle iconStyle, @N Callback callback);

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void setIconStyle(@N IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void setReversed(boolean z12);

    @Override // com.yandex.mapkit.map.PlacemarkAnimation
    public native void stop();
}
