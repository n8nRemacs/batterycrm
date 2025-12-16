package com.yandex.mapkit.mapview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.internal.MapWindowBinding;
import com.yandex.runtime.view.PlatformGLSurfaceTextureView;

/* loaded from: classes7.dex */
public class MapTexture {
    private MapWindowBinding mapWindow;
    private PlatformGLSurfaceTextureView platformGLView;

    public MapTexture(Context context) {
        this(context, false);
    }

    public MapWindow getMapWindow() {
        return this.mapWindow;
    }

    public void onStart() {
        this.platformGLView.start();
        this.platformGLView.resume();
    }

    public void onStop() {
        this.platformGLView.pause();
        this.platformGLView.stop();
    }

    public void onTextureSizeChanged(int i12, int i13) {
        this.platformGLView.onSizeChanged(i12, i13);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.platformGLView.onTouchEvent(motionEvent);
    }

    public void removeTexture() throws InterruptedException {
        this.platformGLView.onTextureDestroyed();
    }

    public void setNoninteractive(boolean z12) {
        this.platformGLView.setNoninteractive(z12);
    }

    public void setTexture(SurfaceTexture surfaceTexture, int i12, int i13) {
        this.platformGLView.setTexture(surfaceTexture, i12, i13);
    }

    public MapTexture(Context context, int i12, int i13) {
        this(context, i12, i13, false);
    }

    public MapTexture(Context context, int i12, int i13, boolean z12) {
        MapKitFactory.initialize(context);
        this.platformGLView = new PlatformGLSurfaceTextureView(context, i12, i13, z12);
        this.mapWindow = (MapWindowBinding) MapKitFactory.getInstance().createMapWindow(this.platformGLView);
    }

    public MapTexture(Context context, boolean z12) {
        MapKitFactory.initialize(context);
        this.platformGLView = new PlatformGLSurfaceTextureView(context, z12);
        this.mapWindow = (MapWindowBinding) MapKitFactory.getInstance().createMapWindow(this.platformGLView);
    }
}
