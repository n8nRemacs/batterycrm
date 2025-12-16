package com.yandex.runtime.view.internal;

import android.content.Context;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* loaded from: classes8.dex */
public class VulkanSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    protected PlatformVulkanRenderer renderer;

    public VulkanSurfaceView(Context context, boolean z12) {
        super(context);
        getHolder().addCallback(this);
        this.renderer = new PlatformVulkanRenderer(z12);
    }

    public boolean isDebugModeEnabled() {
        return this.renderer.isDebugModeEnabled();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i12, int i13, int i14) {
        this.renderer.surfaceChanged(surfaceHolder.getSurface(), i13, i14);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.renderer.surfaceCreated(surfaceHolder.getSurface(), surfaceFrame.width(), surfaceFrame.height());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.renderer.surfaceDestroyed(surfaceHolder.getSurface());
    }
}
