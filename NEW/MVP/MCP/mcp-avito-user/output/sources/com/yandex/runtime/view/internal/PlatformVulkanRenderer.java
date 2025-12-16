package com.yandex.runtime.view.internal;

import android.view.Surface;
import com.yandex.runtime.NativeObject;

/* loaded from: classes8.dex */
public class PlatformVulkanRenderer {
    private NativeObject nativeObject;

    public PlatformVulkanRenderer(boolean z12) {
        this.nativeObject = null;
        this.nativeObject = createNative(z12);
    }

    private static native NativeObject createNative(boolean z12);

    public native boolean isDebugModeEnabled();

    public native void surfaceChanged(Surface surface, int i12, int i13);

    public native void surfaceCreated(Surface surface, int i12, int i13);

    public native void surfaceDestroyed(Surface surface);
}
