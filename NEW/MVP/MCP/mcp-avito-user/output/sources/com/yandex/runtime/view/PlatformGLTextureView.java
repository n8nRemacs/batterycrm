package com.yandex.runtime.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;

/* loaded from: classes8.dex */
public class PlatformGLTextureView extends PlatformGLSurfaceTextureView implements TextureView.SurfaceTextureListener {
    private TextureViewImpl textureView;

    public class TextureViewImpl extends TextureView {
        public TextureViewImpl(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            setSurfaceTextureListener(PlatformGLTextureView.this);
        }

        @Override // android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (PlatformGLTextureView.this.onTouchEvent(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.view.TextureView, android.view.View
        public void onSizeChanged(int i12, int i13, int i14, int i15) {
            super.onSizeChanged(i12, i13, i14, i15);
            PlatformGLTextureView.this.onSizeChanged(i12, i13);
        }
    }

    public PlatformGLTextureView(Context context) {
        this(context, null, 0, false);
    }

    public Bitmap getBitmap() {
        return this.textureView.getBitmap();
    }

    @Override // com.yandex.runtime.view.PlatformGLSurfaceTextureView, com.yandex.runtime.view.PlatformView
    public View getView() {
        return this.textureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i12, int i13) {
        setTexture(surfaceTexture, i12, i13);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) throws InterruptedException {
        onTextureDestroyed();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i12, int i13) {
        onSizeChanged(i12, i13);
    }

    public PlatformGLTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false);
    }

    public PlatformGLTextureView(Context context, boolean z12) {
        this(context, null, 0, z12);
    }

    public PlatformGLTextureView(Context context, AttributeSet attributeSet, int i12) {
        this(context, attributeSet, i12, false);
    }

    public PlatformGLTextureView(Context context, AttributeSet attributeSet, int i12, boolean z12) {
        super(context, z12);
        this.textureView = new TextureViewImpl(context, attributeSet);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
