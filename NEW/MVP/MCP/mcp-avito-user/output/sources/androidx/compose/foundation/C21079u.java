package androidx.compose.foundation;

import android.view.SurfaceView;
import kotlin.Metadata;

/* compiled from: AndroidExternalSurface.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/SurfaceView;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/SurfaceView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21079u extends kotlin.jvm.internal.N implements Y41.l<SurfaceView, kotlin.G0> {
    @Override // Y41.l
    public final kotlin.G0 invoke(SurfaceView surfaceView) {
        SurfaceView surfaceView2 = surfaceView;
        androidx.compose.ui.unit.u.f42871b.getClass();
        if (androidx.compose.ui.unit.u.c(0L, 0L)) {
            surfaceView2.getHolder().setSizeFromLayout();
        } else {
            surfaceView2.getHolder().setFixedSize((int) (0 >> 32), (int) (0 & 4294967295L));
        }
        surfaceView2.getHolder().setFormat(-3);
        C20798n.f29769b.getClass();
        surfaceView2.setZOrderOnTop(false);
        surfaceView2.setSecure(false);
        return kotlin.G0.f406611a;
    }
}
