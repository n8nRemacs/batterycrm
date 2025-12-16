package androidx.compose.foundation;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import kotlin.Metadata;

/* compiled from: AndroidExternalSurface.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/k;", "Landroidx/compose/foundation/E;", "Landroid/view/TextureView$SurfaceTextureListener;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class TextureViewSurfaceTextureListenerC20534k extends E implements TextureView.SurfaceTextureListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Surface f28182b;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(@Y61.k SurfaceTexture surfaceTexture, int i12, int i13) {
        androidx.compose.ui.unit.u.f42871b.getClass();
        if (!androidx.compose.ui.unit.u.c(0L, 0L)) {
            surfaceTexture.setDefaultBufferSize((int) (0 >> 32), (int) (0 & 4294967295L));
        }
        this.f28182b = new Surface(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(@Y61.k SurfaceTexture surfaceTexture) {
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(@Y61.k SurfaceTexture surfaceTexture, int i12, int i13) {
        androidx.compose.ui.unit.u.f42871b.getClass();
        if (androidx.compose.ui.unit.u.c(0L, 0L)) {
            return;
        }
        surfaceTexture.setDefaultBufferSize((int) (0 >> 32), (int) (0 & 4294967295L));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(@Y61.k SurfaceTexture surfaceTexture) {
    }
}
