package com.yandex.runtime.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.view.internal.MemoryPressureListener;
import com.yandex.runtime.view.internal.PlatformViewBinding;
import com.yandex.runtime.view.internal.VulkanSurfaceView;

/* loaded from: classes8.dex */
public class PlatformVulkanSurfaceView extends VulkanSurfaceView implements PlatformView {
    private int height;
    private MemoryPressureListener memoryPressureListener;
    protected PlatformViewBinding platformViewBinding;
    private int width;

    public PlatformVulkanSurfaceView(Context context, boolean z12) {
        super(context, z12);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i12 = displayMetrics.widthPixels;
        this.width = i12;
        int i13 = displayMetrics.heightPixels;
        this.height = i13;
        this.platformViewBinding = new PlatformViewBinding(this.renderer, i12, i13);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void addSurface(int i12, Surface surface) {
        throw new UnsupportedOperationException("Method PlatformVulkanSurfaceView.addSurface is not implemented");
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void destroyNativePlatformView() {
        this.platformViewBinding.destroyNative();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.platformViewBinding.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public NativeObject getNativePlatformView() {
        return this.platformViewBinding.getNative();
    }

    @Override // com.yandex.runtime.view.internal.VulkanSurfaceView, com.yandex.runtime.view.PlatformView
    public boolean isDebugModeEnabled() {
        return super.isDebugModeEnabled();
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void onMemoryWarning() {
        this.platformViewBinding.onMemoryWarning();
    }

    @Override // android.view.View
    public void onSizeChanged(int i12, int i13, int i14, int i15) {
        this.width = i12;
        this.height = i13;
        super.onSizeChanged(i12, i13, i14, i15);
        this.platformViewBinding.onSizeChanged(this.width, this.height);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void pause() {
        this.platformViewBinding.onPause();
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void removeSurface(int i12) {
        throw new UnsupportedOperationException("Method PlatformVulkanSurfaceView.addSurface is not implemented");
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void resume() {
        this.platformViewBinding.onResume();
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void setNoninteractive(boolean z12) {
        this.platformViewBinding.setNoninteractive(z12);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void start() {
        if (this.memoryPressureListener == null) {
            this.memoryPressureListener = new MemoryPressureListener(this);
            getContext().registerComponentCallbacks(this.memoryPressureListener);
        }
        this.platformViewBinding.onStart(this.width, this.height);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void stop() {
        if (this.memoryPressureListener != null) {
            getContext().unregisterComponentCallbacks(this.memoryPressureListener);
            this.memoryPressureListener = null;
        }
        this.platformViewBinding.onStop();
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void addSurface(int i12, Surface surface, PointF pointF) {
        throw new UnsupportedOperationException("Method PlatformVulkanSurfaceView.addSurface is not implemented");
    }

    @Override // com.yandex.runtime.view.PlatformView
    public View getView() {
        return this;
    }
}
