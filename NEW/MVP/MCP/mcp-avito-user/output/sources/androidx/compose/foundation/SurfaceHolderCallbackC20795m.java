package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.SurfaceHolder;
import kotlin.Metadata;

/* compiled from: AndroidExternalSurface.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/m;", "Landroidx/compose/foundation/E;", "Landroid/view/SurfaceHolder$Callback;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class SurfaceHolderCallbackC20795m extends E implements SurfaceHolder.Callback {

    /* renamed from: b, reason: collision with root package name */
    public int f29760b;

    /* renamed from: c, reason: collision with root package name */
    public int f29761c;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(@Y61.k SurfaceHolder surfaceHolder, int i12, int i13, int i14) {
        if (this.f29760b == i13 && this.f29761c == i14) {
            return;
        }
        this.f29760b = i13;
        this.f29761c = i14;
        surfaceHolder.getSurface();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(@Y61.k SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.f29760b = surfaceFrame.width();
        this.f29761c = surfaceFrame.height();
        surfaceHolder.getSurface();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(@Y61.k SurfaceHolder surfaceHolder) {
        surfaceHolder.getSurface();
    }
}
