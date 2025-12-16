package com.yandex.runtime.view;

import android.graphics.PointF;
import android.view.Surface;
import android.view.View;
import com.yandex.runtime.NativeObject;

/* loaded from: classes8.dex */
public interface PlatformView {
    void addSurface(int i12, Surface surface);

    void addSurface(int i12, Surface surface, PointF pointF);

    void destroyNativePlatformView();

    NativeObject getNativePlatformView();

    View getView();

    boolean isDebugModeEnabled();

    void onMemoryWarning();

    void pause();

    void removeSurface(int i12);

    void resume();

    void setNoninteractive(boolean z12);

    void start();

    void stop();
}
