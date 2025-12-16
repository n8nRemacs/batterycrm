package com.yandex.runtime.view.internal;

import android.opengl.GLSurfaceView;
import android.view.Surface;
import j.N;

/* loaded from: classes8.dex */
public class GLSurface {
    private EGLConfigChooserImpl configChooser;
    private GLContextFactory glContextFactory;
    private boolean initialized = false;
    private GLRenderThread renderThread;
    private GLSurfaceView.Renderer renderer;

    public GLSurface(boolean z12) {
        EGLConfigChooserImpl eGLConfigChooserImpl = new EGLConfigChooserImpl();
        this.configChooser = eGLConfigChooserImpl;
        this.glContextFactory = new GLContextFactory(z12, eGLConfigChooserImpl);
    }

    public void onPause() {
        if (this.initialized) {
            this.renderThread.onPause();
        }
    }

    public void onResume() {
        if (this.initialized) {
            this.renderThread.onResume();
        }
    }

    public void onSurfaceAvailable(@N Surface surface, int i12, int i13) {
        GLRenderThread gLRenderThread = new GLRenderThread(surface, this.configChooser, this.glContextFactory, this.renderer);
        this.renderThread = gLRenderThread;
        gLRenderThread.onSizeChanged(i12, i13);
        this.renderThread.start();
        this.initialized = true;
    }

    public boolean onSurfaceDestroyed(Surface surface) throws InterruptedException {
        if (!this.initialized) {
            return true;
        }
        stopRenderThread();
        return true;
    }

    public void onSurfaceSizeChanged(Surface surface, int i12, int i13) {
        if (this.initialized) {
            this.renderThread.onSizeChanged(i12, i13);
        }
    }

    public void requestRender() {
        if (this.initialized) {
            this.renderThread.requestRender();
        }
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        this.renderer = renderer;
    }

    public void stopRenderThread() throws InterruptedException {
        this.renderThread.finish();
        try {
            this.renderThread.join();
        } catch (InterruptedException unused) {
        }
        this.initialized = false;
    }

    public void onSurfaceUpdated(Surface surface) {
    }
}
