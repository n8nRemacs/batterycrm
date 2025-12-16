package com.avito.android.photo_picker.camera;

import android.graphics.SurfaceTexture;
import kotlin.Metadata;

/* compiled from: CameraViewports.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera/w;", "Lcom/avito/android/photo_picker/camera/C;", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class w implements C {
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(@Y61.k SurfaceTexture surfaceTexture, int i12, int i13) {
        throw null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(@Y61.k SurfaceTexture surfaceTexture) {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(@Y61.k SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(@Y61.k SurfaceTexture surfaceTexture, int i12, int i13) {
    }
}
