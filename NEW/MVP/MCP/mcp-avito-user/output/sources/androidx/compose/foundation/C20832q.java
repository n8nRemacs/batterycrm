package androidx.compose.foundation;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import kotlin.Metadata;

/* compiled from: AndroidExternalSurface.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/TextureView;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/TextureView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20832q extends kotlin.jvm.internal.N implements Y41.l<TextureView, kotlin.G0> {
    public C20832q() {
        throw null;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        TextureView textureView2 = textureView;
        androidx.compose.ui.unit.u.f42871b.getClass();
        if (!androidx.compose.ui.unit.u.c(0L, 0L) && (surfaceTexture = textureView2.getSurfaceTexture()) != null) {
            surfaceTexture.setDefaultBufferSize((int) 0, (int) 0);
        }
        throw null;
    }
}
