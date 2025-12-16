package com.yandex.runtime.view.internal;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.yandex.runtime.view.PlatformView;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class MemoryPressureListener implements ComponentCallbacks2 {
    private WeakReference<PlatformView> weakPlatformView;

    public MemoryPressureListener(PlatformView platformView) {
        this.weakPlatformView = new WeakReference<>(platformView);
    }

    private void onMemoryWarning() {
        PlatformView platformView = this.weakPlatformView.get();
        if (platformView != null) {
            platformView.onMemoryWarning();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onMemoryWarning();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i12) {
        if (i12 == 80 || i12 == 20 || i12 == 10 || i12 == 15) {
            onMemoryWarning();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
