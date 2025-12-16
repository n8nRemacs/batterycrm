package com.yandex.mapkit.map;

import com.yandex.runtime.image.AnimatedImageProvider;
import j.N;

/* loaded from: classes7.dex */
public interface PlacemarkAnimation {
    boolean isReversed();

    boolean isValid();

    void pause();

    void play();

    void play(@N Callback callback);

    void resume();

    void setIcon(@N AnimatedImageProvider animatedImageProvider, @N IconStyle iconStyle);

    void setIcon(@N AnimatedImageProvider animatedImageProvider, @N IconStyle iconStyle, @N Callback callback);

    void setIconStyle(@N IconStyle iconStyle);

    void setReversed(boolean z12);

    void stop();
}
