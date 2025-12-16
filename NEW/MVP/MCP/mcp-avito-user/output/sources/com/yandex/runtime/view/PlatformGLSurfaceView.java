package com.yandex.runtime.view;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.graphics.GLDebugBinding;
import com.yandex.runtime.view.internal.EGLConfigChooserImpl;
import com.yandex.runtime.view.internal.GLContextFactory;
import com.yandex.runtime.view.internal.MemoryPressureListener;
import com.yandex.runtime.view.internal.PlatformGLRenderer;
import com.yandex.runtime.view.internal.PlatformViewBinding;
import com.yandex.runtime.view.internal.RenderDelegate;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes8.dex */
public class PlatformGLSurfaceView extends GLSurfaceView implements RenderDelegate, PlatformView, PlatformGLRenderer.GLContextListener {
    private static final String LOG_TAG = "PlatformGLSurfaceView";
    private boolean glDebugEnabled;
    private int height;
    private MemoryPressureListener memoryPressureListener;
    protected PlatformViewBinding platformViewBinding;
    protected PlatformGLRenderer renderer;
    private int width;

    public PlatformGLSurfaceView(Context context) {
        this(context, null, 0, false);
    }

    private void handlePreserveEGLContextOnPause() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String strGlGetString = GLES20.glGetString(7936);
        if (strGlGetString == null || !strGlGetString.toUpperCase().contains("NVIDIA")) {
            try {
                GLSurfaceView.class.getMethod("setPreserveEGLContextOnPause", Boolean.TYPE).invoke(this, Boolean.TRUE);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            }
        }
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void addSurface(int i12, Surface surface) {
        throw new UnsupportedOperationException("Method PlatformGLSurfaceView.addSurface is not implemented");
    }

    public PlatformGLRenderer createRenderer() {
        return new PlatformGLRenderer(this, this);
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

    @Override // com.yandex.runtime.view.PlatformView
    public boolean isDebugModeEnabled() {
        return false;
    }

    @Override // com.yandex.runtime.view.internal.PlatformGLRenderer.GLContextListener
    public void onContextCreated() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        handlePreserveEGLContextOnPause();
        if (this.glDebugEnabled) {
            GLDebugBinding.enable();
        }
        this.platformViewBinding.onContextCreated();
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
        throw new UnsupportedOperationException("Method PlatformGLSurfaceView.removeSurface is not implemented");
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
        onResume();
        this.platformViewBinding.onStart(this.width, this.height);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void stop() {
        if (this.memoryPressureListener != null) {
            getContext().unregisterComponentCallbacks(this.memoryPressureListener);
            this.memoryPressureListener = null;
        }
        this.platformViewBinding.onStop();
        onPause();
    }

    public PlatformGLSurfaceView(Context context, boolean z12) {
        this(context, null, 0, z12);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public void addSurface(int i12, Surface surface, PointF pointF) {
        throw new UnsupportedOperationException("Method PlatformGLSurfaceView.addSurface is not implemented");
    }

    public PlatformGLSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false);
    }

    public PlatformGLSurfaceView(Context context, AttributeSet attributeSet, int i12) {
        this(context, attributeSet, i12, false);
    }

    public PlatformGLSurfaceView(Context context, AttributeSet attributeSet, int i12, boolean z12) {
        super(context, attributeSet);
        this.glDebugEnabled = z12;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.width = displayMetrics.widthPixels;
        this.height = displayMetrics.heightPixels;
        EGLConfigChooserImpl eGLConfigChooserImpl = new EGLConfigChooserImpl();
        setEGLConfigChooser(eGLConfigChooserImpl);
        setEGLContextFactory(new GLContextFactory(z12, eGLConfigChooserImpl));
        PlatformGLRenderer platformGLRendererCreateRenderer = createRenderer();
        this.renderer = platformGLRendererCreateRenderer;
        this.platformViewBinding = new PlatformViewBinding(platformGLRendererCreateRenderer, this.width, this.height);
        setRenderer(this.renderer);
        setRenderMode(0);
    }

    @Override // com.yandex.runtime.view.PlatformView
    public View getView() {
        return this;
    }
}
