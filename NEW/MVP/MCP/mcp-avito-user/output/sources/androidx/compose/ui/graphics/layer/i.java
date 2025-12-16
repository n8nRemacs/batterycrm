package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.RenderNode;
import android.view.View;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.N;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.Z0;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.layer.C22266b;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.u;
import j.X;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: GraphicsLayerV23.android.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/layer/i;", "Landroidx/compose/ui/graphics/layer/g;", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public static final AtomicBoolean f39608B;

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public Z0 f39609A;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f39610b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.graphics.drawscope.a f39611c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RenderNode f39612d;

    /* renamed from: e, reason: collision with root package name */
    public long f39613e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Matrix f39614f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39615g;

    /* renamed from: h, reason: collision with root package name */
    public long f39616h;

    /* renamed from: i, reason: collision with root package name */
    public int f39617i;

    /* renamed from: j, reason: collision with root package name */
    public final int f39618j;

    /* renamed from: k, reason: collision with root package name */
    public float f39619k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f39620l;

    /* renamed from: m, reason: collision with root package name */
    public float f39621m;

    /* renamed from: n, reason: collision with root package name */
    public float f39622n;

    /* renamed from: o, reason: collision with root package name */
    public float f39623o;

    /* renamed from: p, reason: collision with root package name */
    public float f39624p;

    /* renamed from: q, reason: collision with root package name */
    public float f39625q;

    /* renamed from: r, reason: collision with root package name */
    public long f39626r;

    /* renamed from: s, reason: collision with root package name */
    public long f39627s;

    /* renamed from: t, reason: collision with root package name */
    public float f39628t;

    /* renamed from: u, reason: collision with root package name */
    public float f39629u;

    /* renamed from: v, reason: collision with root package name */
    public float f39630v;

    /* renamed from: w, reason: collision with root package name */
    public float f39631w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f39632x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f39633y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f39634z;

    /* compiled from: GraphicsLayerV23.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/layer/i$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "needToValidateAccess", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f39608B = new AtomicBoolean(true);
    }

    public i(@Y61.k View view, @Y61.k N n12, @Y61.k androidx.compose.ui.graphics.drawscope.a aVar) {
        this.f39610b = n12;
        this.f39611c = aVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.f39612d = renderNodeCreate;
        androidx.compose.ui.unit.u.f42871b.getClass();
        u.a.a();
        this.f39613e = 0L;
        u.a.a();
        this.f39616h = 0L;
        if (f39608B.getAndSet(false)) {
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
                z.f39697a.getClass();
                z.c(renderNodeCreate, z.a(renderNodeCreate));
                z.d(renderNodeCreate, z.b(renderNodeCreate));
            }
            y.f39696a.getClass();
            y.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        C22266b.f39571b.getClass();
        C22266b.a.a();
        L(0);
        C22266b.a.a();
        this.f39617i = 0;
        androidx.compose.ui.graphics.E.f39229b.getClass();
        this.f39618j = E.a.a();
        this.f39619k = 1.0f;
        l0.g.f413384b.getClass();
        g.a.a();
        this.f39621m = 1.0f;
        this.f39622n = 1.0f;
        T.f39320b.getClass();
        this.f39626r = T.a.a();
        this.f39627s = T.a.a();
        this.f39631w = 8.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: A, reason: from getter */
    public final float getF39677r() {
        return this.f39622n;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: B, reason: from getter */
    public final long getF39682w() {
        return this.f39627s;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: C, reason: from getter */
    public final float getF39653t() {
        return this.f39631w;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    @Y61.k
    public final Matrix D() {
        Matrix matrix = this.f39614f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f39614f = matrix;
        }
        this.f39612d.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: E, reason: from getter */
    public final int getF39673n() {
        return this.f39617i;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void F(int i12, int i13, long j12) {
        int i14 = (int) (j12 >> 32);
        int i15 = (int) (4294967295L & j12);
        this.f39612d.setLeftTopRightBottom(i12, i13, i12 + i14, i13 + i15);
        if (androidx.compose.ui.unit.u.c(this.f39613e, j12)) {
            return;
        }
        if (this.f39620l) {
            this.f39612d.setPivotX(i14 / 2.0f);
            this.f39612d.setPivotY(i15 / 2.0f);
        }
        this.f39613e = j12;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: G, reason: from getter */
    public final long getF39681v() {
        return this.f39626r;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: H, reason: from getter */
    public final int getF39672m() {
        return this.f39618j;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void I(int i12) {
        this.f39617i = i12;
        C22266b.f39571b.getClass();
        int i13 = C22266b.f39572c;
        if (!C22266b.a(i12, i13)) {
            androidx.compose.ui.graphics.E.f39229b.getClass();
            if (androidx.compose.ui.graphics.E.a(this.f39618j, androidx.compose.ui.graphics.E.f39232e)) {
                L(this.f39617i);
                return;
            }
        }
        L(i13);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void J(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection, @Y61.k C22267c c22267c, @Y61.k Y41.l<? super androidx.compose.ui.graphics.drawscope.g, G0> lVar) {
        Canvas canvasStart = this.f39612d.start(Math.max((int) (this.f39613e >> 32), (int) (this.f39616h >> 32)), Math.max((int) (this.f39613e & 4294967295L), (int) (this.f39616h & 4294967295L)));
        try {
            N n12 = this.f39610b;
            Canvas f39351a = n12.getF39293a().getF39351a();
            n12.getF39293a().z(canvasStart);
            C22245c f39293a = n12.getF39293a();
            androidx.compose.ui.graphics.drawscope.a aVar = this.f39611c;
            long jC2 = androidx.compose.ui.unit.v.c(this.f39613e);
            androidx.compose.ui.unit.d dVarB = aVar.getF39478c().b();
            LayoutDirection layoutDirectionD = aVar.getF39478c().d();
            M mA2 = aVar.getF39478c().a();
            long jE2 = aVar.getF39478c().e();
            C22267c f39486b = aVar.getF39478c().getF39486b();
            a.b f39478c = aVar.getF39478c();
            f39478c.g(dVar);
            f39478c.i(layoutDirection);
            f39478c.f(f39293a);
            f39478c.j(jC2);
            f39478c.h(c22267c);
            f39293a.k();
            try {
                ((C22268d) lVar).invoke(aVar);
                f39293a.i();
                a.b f39478c2 = aVar.getF39478c();
                f39478c2.g(dVarB);
                f39478c2.i(layoutDirectionD);
                f39478c2.f(mA2);
                f39478c2.j(jE2);
                f39478c2.h(f39486b);
                n12.getF39293a().z(f39351a);
            } catch (Throwable th2) {
                f39293a.i();
                a.b f39478c3 = aVar.getF39478c();
                f39478c3.g(dVarB);
                f39478c3.i(layoutDirectionD);
                f39478c3.f(mA2);
                f39478c3.j(jE2);
                f39478c3.h(f39486b);
                throw th2;
            }
        } finally {
            this.f39612d.end(canvasStart);
        }
    }

    public final void K() {
        boolean z12 = this.f39632x;
        boolean z13 = false;
        boolean z14 = z12 && !this.f39615g;
        if (z12 && this.f39615g) {
            z13 = true;
        }
        if (z14 != this.f39633y) {
            this.f39633y = z14;
            this.f39612d.setClipToBounds(z14);
        }
        if (z13 != this.f39634z) {
            this.f39634z = z13;
            this.f39612d.setClipToOutline(z13);
        }
    }

    public final void L(int i12) {
        RenderNode renderNode = this.f39612d;
        C22266b.f39571b.getClass();
        if (C22266b.a(i12, C22266b.a.c())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (C22266b.a(i12, C22266b.a.b())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final boolean a() {
        return this.f39612d.isValid();
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void b(float f12) {
        this.f39628t = f12;
        this.f39612d.setRotationX(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void c(float f12) {
        this.f39629u = f12;
        this.f39612d.setRotationY(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void d(float f12) {
        this.f39630v = f12;
        this.f39612d.setRotation(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void e(@Y61.l Z0 z02) {
        this.f39609A = z02;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void f() {
        y yVar = y.f39696a;
        RenderNode renderNode = this.f39612d;
        yVar.getClass();
        y.a(renderNode);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void g(float f12) {
        this.f39624p = f12;
        this.f39612d.setTranslationY(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: getAlpha, reason: from getter */
    public final float getF39674o() {
        return this.f39619k;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void h(float f12) {
        this.f39631w = f12;
        this.f39612d.setCameraDistance(-f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    @Y61.l
    /* renamed from: i, reason: from getter */
    public final Z0 getF39660A() {
        return this.f39609A;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void j(float f12) {
        this.f39621m = f12;
        this.f39612d.setScaleX(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void k(float f12) {
        this.f39622n = f12;
        this.f39612d.setScaleY(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void l(float f12) {
        this.f39623o = f12;
        this.f39612d.setTranslationX(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void m(@Y61.l Outline outline, long j12) {
        this.f39616h = j12;
        this.f39612d.setOutline(outline);
        this.f39615g = outline != null;
        K();
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: n, reason: from getter */
    public final float getF39679t() {
        return this.f39624p;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: o, reason: from getter */
    public final float getF39678s() {
        return this.f39623o;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void p(boolean z12) {
        this.f39632x = z12;
        K();
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void q(float f12) {
        this.f39625q = f12;
        this.f39612d.setElevation(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: r, reason: from getter */
    public final float getF39680u() {
        return this.f39625q;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void s(@Y61.k M m12) {
        C22247d.b(m12).drawRenderNode(this.f39612d);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void setAlpha(float f12) {
        this.f39619k = f12;
        this.f39612d.setAlpha(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: t, reason: from getter */
    public final float getF39684y() {
        return this.f39629u;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: u, reason: from getter */
    public final float getF39685z() {
        return this.f39630v;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void v(long j12) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f39626r = j12;
            z zVar = z.f39697a;
            RenderNode renderNode = this.f39612d;
            int iJ2 = V.j(j12);
            zVar.getClass();
            z.c(renderNode, iJ2);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void w(long j12) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f39627s = j12;
            z zVar = z.f39697a;
            RenderNode renderNode = this.f39612d;
            int iJ2 = V.j(j12);
            zVar.getClass();
            z.d(renderNode, iJ2);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: x, reason: from getter */
    public final float getF39676q() {
        return this.f39621m;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void y(long j12) {
        if ((9223372034707292159L & j12) == 9205357640488583168L) {
            this.f39620l = true;
            this.f39612d.setPivotX(((int) (this.f39613e >> 32)) / 2.0f);
            this.f39612d.setPivotY(((int) (4294967295L & this.f39613e)) / 2.0f);
        } else {
            this.f39620l = false;
            this.f39612d.setPivotX(Float.intBitsToFloat((int) (j12 >> 32)));
            this.f39612d.setPivotY(Float.intBitsToFloat((int) (j12 & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: z, reason: from getter */
    public final float getF39683x() {
        return this.f39628t;
    }

    public /* synthetic */ i(View view, long j12, N n12, androidx.compose.ui.graphics.drawscope.a aVar, int i12, C42822w c42822w) {
        this(view, (i12 & 4) != 0 ? new N() : n12, (i12 & 8) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar);
    }
}
