package com.yandex.runtime.view.internal;

import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public class GLTextureView {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private EGLConfigChooserImpl eglConfigChooser;
    private Set<Integer> externalSurfaceIds;
    private GLContextFactory glContextFactory;
    private GLRenderThread renderThread;

    public GLTextureView(boolean z12) {
        EGLConfigChooserImpl eGLConfigChooserImpl = new EGLConfigChooserImpl();
        this.eglConfigChooser = eGLConfigChooserImpl;
        this.glContextFactory = new GLContextFactory(z12, eGLConfigChooserImpl);
        this.externalSurfaceIds = new HashSet();
    }

    private boolean isInitialized() {
        return this.renderThread != null;
    }

    public void addSurfaceId(int i12) {
        if (isInitialized()) {
            if (this.externalSurfaceIds.isEmpty()) {
                this.renderThread.onExternalSurfaceAttached();
            }
            this.externalSurfaceIds.add(Integer.valueOf(i12));
            this.renderThread.requestRender();
        }
    }

    public void onPause() {
        if (isInitialized()) {
            this.renderThread.onPause();
        }
    }

    public void onResume() {
        if (isInitialized()) {
            this.renderThread.onResume();
        }
    }

    public void onSizeChanged(int i12, int i13) {
        if (isInitialized()) {
            this.renderThread.onSizeChanged(i12, i13);
        }
    }

    public void onTextureDestroyed() throws InterruptedException {
        if (isInitialized()) {
            this.renderThread.finish();
            try {
                this.renderThread.join();
            } catch (InterruptedException unused) {
            }
            this.renderThread = null;
        }
    }

    public void removeSurfaceId(int i12) {
        if (isInitialized()) {
            this.externalSurfaceIds.remove(Integer.valueOf(i12));
            if (this.externalSurfaceIds.isEmpty()) {
                this.renderThread.onExternalSurfaceDetached();
            }
        }
    }

    public void requestRender() {
        if (isInitialized()) {
            this.renderThread.requestRender();
        }
    }

    public void setRenderer(SurfaceTexture surfaceTexture, int i12, int i13, GLSurfaceView.Renderer renderer) {
        surfaceTexture.setDefaultBufferSize(i12, i13);
        GLRenderThread gLRenderThread = new GLRenderThread(surfaceTexture, this.eglConfigChooser, this.glContextFactory, renderer);
        this.renderThread = gLRenderThread;
        gLRenderThread.onSizeChanged(i12, i13);
        this.renderThread.start();
    }
}
