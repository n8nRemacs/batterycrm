package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22250e0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.platform.Z1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RenderNodeApi23.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/W1;", "Landroidx/compose/ui/platform/W0;", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
public final class W1 implements W0 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f41293g;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RenderNode f41294a;

    /* renamed from: b, reason: collision with root package name */
    public int f41295b;

    /* renamed from: c, reason: collision with root package name */
    public int f41296c;

    /* renamed from: d, reason: collision with root package name */
    public int f41297d;

    /* renamed from: e, reason: collision with root package name */
    public int f41298e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41299f;

    /* compiled from: RenderNodeApi23.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/W1$a;", "", "<init>", "()V", "", "needToValidateAccess", "Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f41293g = true;
    }

    public W1(@Y61.k AndroidComposeView androidComposeView) {
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f41294a = renderNodeCreate;
        C22250e0.f39504b.getClass();
        C22250e0.a.a();
        if (f41293g) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                C22461c2.f41423a.getClass();
                C22461c2.c(renderNodeCreate, C22461c2.a(renderNodeCreate));
                C22461c2.d(renderNodeCreate, C22461c2.b(renderNodeCreate));
            }
            C22457b2.f41417a.getClass();
            C22457b2.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f41293g = false;
        }
    }

    @Override // androidx.compose.ui.platform.W0
    public final boolean A() {
        return this.f41294a.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.W0
    public final void B(@Y61.k Matrix matrix) {
        this.f41294a.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void C(int i12) {
        this.f41295b += i12;
        this.f41297d += i12;
        this.f41294a.offsetLeftAndRight(i12);
    }

    @Override // androidx.compose.ui.platform.W0
    /* renamed from: D, reason: from getter */
    public final int getF41298e() {
        return this.f41298e;
    }

    @Override // androidx.compose.ui.platform.W0
    /* renamed from: E, reason: from getter */
    public final int getF41297d() {
        return this.f41297d;
    }

    @Override // androidx.compose.ui.platform.W0
    public final boolean F(int i12, int i13, int i14, int i15) {
        this.f41295b = i12;
        this.f41296c = i13;
        this.f41297d = i14;
        this.f41298e = i15;
        return this.f41294a.setLeftTopRightBottom(i12, i13, i14, i15);
    }

    @Override // androidx.compose.ui.platform.W0
    public final float G() {
        return this.f41294a.getElevation();
    }

    @Override // androidx.compose.ui.platform.W0
    public final void H(int i12) {
        C22250e0.f39504b.getClass();
        if (C22250e0.a(i12, C22250e0.a.c())) {
            this.f41294a.setLayerType(2);
            this.f41294a.setHasOverlappingRendering(true);
        } else if (C22250e0.a(i12, C22250e0.a.b())) {
            this.f41294a.setLayerType(0);
            this.f41294a.setHasOverlappingRendering(false);
        } else {
            this.f41294a.setLayerType(0);
            this.f41294a.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.platform.W0
    public final boolean a() {
        return this.f41294a.isValid();
    }

    @Override // androidx.compose.ui.platform.W0
    public final void b(float f12) {
        this.f41294a.setRotationX(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void c(float f12) {
        this.f41294a.setRotationY(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void d(float f12) {
        this.f41294a.setRotation(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void f() {
        C22457b2 c22457b2 = C22457b2.f41417a;
        RenderNode renderNode = this.f41294a;
        c22457b2.getClass();
        C22457b2.a(renderNode);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void g(float f12) {
        this.f41294a.setTranslationY(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final float getAlpha() {
        return this.f41294a.getAlpha();
    }

    @Override // androidx.compose.ui.platform.W0
    public final int getHeight() {
        return this.f41298e - this.f41296c;
    }

    @Override // androidx.compose.ui.platform.W0
    public final int getWidth() {
        return this.f41297d - this.f41295b;
    }

    @Override // androidx.compose.ui.platform.W0
    public final void h(float f12) {
        this.f41294a.setCameraDistance(-f12);
    }

    @Override // androidx.compose.ui.platform.W0
    /* renamed from: i, reason: from getter */
    public final boolean getF41299f() {
        return this.f41299f;
    }

    @Override // androidx.compose.ui.platform.W0
    public final void j(float f12) {
        this.f41294a.setScaleX(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void k(float f12) {
        this.f41294a.setScaleY(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void l(float f12) {
        this.f41294a.setTranslationX(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    /* renamed from: m, reason: from getter */
    public final int getF41296c() {
        return this.f41296c;
    }

    @Override // androidx.compose.ui.platform.W0
    public final void n(@Y61.k Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f41294a);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void o(boolean z12) {
        this.f41299f = z12;
        this.f41294a.setClipToBounds(z12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void p(@Y61.k androidx.compose.ui.graphics.N n12, @Y61.l Path path, @Y61.k Y41.l<? super androidx.compose.ui.graphics.M, kotlin.G0> lVar) {
        DisplayListCanvas displayListCanvasStart = this.f41294a.start(getWidth(), getHeight());
        Canvas f39351a = n12.getF39293a().getF39351a();
        n12.getF39293a().z((Canvas) displayListCanvasStart);
        C22245c f39293a = n12.getF39293a();
        if (path != null) {
            f39293a.k();
            androidx.compose.ui.graphics.M.n(f39293a, path);
        }
        ((Z1.d) lVar).invoke(f39293a);
        if (path != null) {
            f39293a.i();
        }
        n12.getF39293a().z(f39351a);
        this.f41294a.end(displayListCanvasStart);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void q(float f12) {
        this.f41294a.setPivotX(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void r(float f12) {
        this.f41294a.setPivotY(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void s(@Y61.l Outline outline) {
        this.f41294a.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void setAlpha(float f12) {
        this.f41294a.setAlpha(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void t(boolean z12) {
        this.f41294a.setClipToOutline(z12);
    }

    @Override // androidx.compose.ui.platform.W0
    /* renamed from: u, reason: from getter */
    public final int getF41295b() {
        return this.f41295b;
    }

    @Override // androidx.compose.ui.platform.W0
    public final void v(int i12) {
        if (Build.VERSION.SDK_INT >= 28) {
            C22461c2 c22461c2 = C22461c2.f41423a;
            RenderNode renderNode = this.f41294a;
            c22461c2.getClass();
            C22461c2.c(renderNode, i12);
        }
    }

    @Override // androidx.compose.ui.platform.W0
    public final void w(int i12) {
        if (Build.VERSION.SDK_INT >= 28) {
            C22461c2 c22461c2 = C22461c2.f41423a;
            RenderNode renderNode = this.f41294a;
            c22461c2.getClass();
            C22461c2.d(renderNode, i12);
        }
    }

    @Override // androidx.compose.ui.platform.W0
    public final void x(float f12) {
        this.f41294a.setElevation(f12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void y(int i12) {
        this.f41296c += i12;
        this.f41298e += i12;
        this.f41294a.offsetTopAndBottom(i12);
    }

    @Override // androidx.compose.ui.platform.W0
    public final boolean z() {
        return this.f41294a.setHasOverlappingRendering(true);
    }

    @Override // androidx.compose.ui.platform.W0
    public final void e(@Y61.l androidx.compose.ui.graphics.Z0 z02) {
    }
}
