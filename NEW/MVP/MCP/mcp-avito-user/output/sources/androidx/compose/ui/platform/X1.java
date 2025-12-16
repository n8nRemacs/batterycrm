package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22250e0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.platform.Z1;
import kotlin.Metadata;

/* compiled from: RenderNodeApi29.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/X1;", "Landroidx/compose/ui/platform/W0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
public final class X1 implements W0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RenderNode f41328a = A.d();

    public X1() {
        C22250e0.f39504b.getClass();
    }

    @Override // androidx.compose.ui.platform.W0
    public final boolean A() {
        return this.f41328a.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.W0
    public final void B(@Y61.k Matrix matrix) {
        this.f41328a.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void C(int i12) {
        this.f41328a.offsetLeftAndRight(i12);
    }

    @Override // androidx.compose.ui.platform.W0
    /* renamed from: D */
    public final int getF41298e() {
        return this.f41328a.getBottom();
    }

    @Override // androidx.compose.ui.platform.W0
    /* renamed from: E */
    public final int getF41297d() {
        return this.f41328a.getRight();
    }

    @Override // androidx.compose.ui.platform.W0
    public final boolean F(int i12, int i13, int i14, int i15) {
        return this.f41328a.setPosition(i12, i13, i14, i15);
    }

    @Override // androidx.compose.ui.platform.W0
    public final float G() {
        return this.f41328a.getElevation();
    }

    @Override // androidx.compose.ui.platform.W0
    public final void H(int i12) {
        RenderNode renderNode = this.f41328a;
        C22250e0.f39504b.getClass();
        if (C22250e0.a(i12, C22250e0.f39505c)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (C22250e0.a(i12, C22250e0.f39506d)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.platform.W0
    public final boolean a() {
        return this.f41328a.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.W0
    public final void b(float f12) {
        this.f41328a.setRotationX(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void c(float f12) {
        this.f41328a.setRotationY(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void d(float f12) {
        this.f41328a.setRotationZ(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void e(@Y61.l androidx.compose.ui.graphics.Z0 z02) {
        if (Build.VERSION.SDK_INT >= 31) {
            Y1 y12 = Y1.f41336a;
            RenderNode renderNode = this.f41328a;
            y12.getClass();
            renderNode.setRenderEffect(z02 != null ? z02.a() : null);
        }
    }

    @Override // androidx.compose.ui.platform.W0
    public final void f() {
        this.f41328a.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.W0
    public final void g(float f12) {
        this.f41328a.setTranslationY(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final float getAlpha() {
        return this.f41328a.getAlpha();
    }

    @Override // androidx.compose.ui.platform.W0
    public final int getHeight() {
        return this.f41328a.getHeight();
    }

    @Override // androidx.compose.ui.platform.W0
    public final int getWidth() {
        return this.f41328a.getWidth();
    }

    @Override // androidx.compose.ui.platform.W0
    public final void h(float f12) {
        this.f41328a.setCameraDistance(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    /* renamed from: i */
    public final boolean getF41299f() {
        return this.f41328a.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.W0
    public final void j(float f12) {
        this.f41328a.setScaleX(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void k(float f12) {
        this.f41328a.setScaleY(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void l(float f12) {
        this.f41328a.setTranslationX(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    /* renamed from: m */
    public final int getF41296c() {
        return this.f41328a.getTop();
    }

    @Override // androidx.compose.ui.platform.W0
    public final void n(@Y61.k Canvas canvas) {
        canvas.drawRenderNode(this.f41328a);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void o(boolean z12) {
        this.f41328a.setClipToBounds(z12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void p(@Y61.k androidx.compose.ui.graphics.N n12, @Y61.l Path path, @Y61.k Y41.l<? super androidx.compose.ui.graphics.M, kotlin.G0> lVar) {
        RecordingCanvas recordingCanvasBeginRecording = this.f41328a.beginRecording();
        C22245c c22245c = n12.f39293a;
        Canvas canvas = c22245c.f39351a;
        c22245c.f39351a = recordingCanvasBeginRecording;
        if (path != null) {
            c22245c.k();
            androidx.compose.ui.graphics.M.n(c22245c, path);
        }
        ((Z1.d) lVar).invoke(c22245c);
        if (path != null) {
            c22245c.i();
        }
        n12.f39293a.f39351a = canvas;
        this.f41328a.endRecording();
    }

    @Override // androidx.compose.ui.platform.W0
    public final void q(float f12) {
        this.f41328a.setPivotX(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void r(float f12) {
        this.f41328a.setPivotY(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void s(@Y61.l Outline outline) {
        this.f41328a.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void setAlpha(float f12) {
        this.f41328a.setAlpha(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void t(boolean z12) {
        this.f41328a.setClipToOutline(z12);
    }

    @Override // androidx.compose.ui.platform.W0
    /* renamed from: u */
    public final int getF41295b() {
        return this.f41328a.getLeft();
    }

    @Override // androidx.compose.ui.platform.W0
    public final void v(int i12) {
        this.f41328a.setAmbientShadowColor(i12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void w(int i12) {
        this.f41328a.setSpotShadowColor(i12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void x(float f12) {
        this.f41328a.setElevation(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void y(int i12) {
        this.f41328a.offsetTopAndBottom(i12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final boolean z() {
        return this.f41328a.setHasOverlappingRendering(true);
    }
}
