package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.N;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.Z0;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.unit.LayoutDirection;
import j.X;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GraphicsLayerV29.android.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/layer/k;", "Landroidx/compose/ui/graphics/layer/g;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class k implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f39635b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.graphics.drawscope.a f39636c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RenderNode f39637d;

    /* renamed from: e, reason: collision with root package name */
    public long f39638e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Matrix f39639f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39640g;

    /* renamed from: h, reason: collision with root package name */
    public float f39641h;

    /* renamed from: i, reason: collision with root package name */
    public final int f39642i;

    /* renamed from: j, reason: collision with root package name */
    public float f39643j;

    /* renamed from: k, reason: collision with root package name */
    public float f39644k;

    /* renamed from: l, reason: collision with root package name */
    public float f39645l;

    /* renamed from: m, reason: collision with root package name */
    public float f39646m;

    /* renamed from: n, reason: collision with root package name */
    public float f39647n;

    /* renamed from: o, reason: collision with root package name */
    public long f39648o;

    /* renamed from: p, reason: collision with root package name */
    public long f39649p;

    /* renamed from: q, reason: collision with root package name */
    public float f39650q;

    /* renamed from: r, reason: collision with root package name */
    public float f39651r;

    /* renamed from: s, reason: collision with root package name */
    public float f39652s;

    /* renamed from: t, reason: collision with root package name */
    public float f39653t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f39654u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39655v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39656w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public Z0 f39657x;

    /* renamed from: y, reason: collision with root package name */
    public int f39658y;

    public k(long j12, N n12, androidx.compose.ui.graphics.drawscope.a aVar, int i12, C42822w c42822w) {
        n12 = (i12 & 2) != 0 ? new N() : n12;
        aVar = (i12 & 4) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar;
        this.f39635b = n12;
        this.f39636c = aVar;
        RenderNode renderNodeC = j.c();
        this.f39637d = renderNodeC;
        l0.n.f413402b.getClass();
        this.f39638e = 0L;
        renderNodeC.setClipToBounds(false);
        C22266b.f39571b.getClass();
        L(renderNodeC, 0);
        this.f39641h = 1.0f;
        androidx.compose.ui.graphics.E.f39229b.getClass();
        this.f39642i = androidx.compose.ui.graphics.E.f39232e;
        l0.g.f413384b.getClass();
        this.f39643j = 1.0f;
        this.f39644k = 1.0f;
        T.f39320b.getClass();
        long j13 = T.f39321c;
        this.f39648o = j13;
        this.f39649p = j13;
        this.f39653t = 8.0f;
        this.f39658y = 0;
    }

    public static void L(RenderNode renderNode, int i12) {
        C22266b.f39571b.getClass();
        if (C22266b.a(i12, C22266b.f39572c)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (C22266b.a(i12, C22266b.f39573d)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: A, reason: from getter */
    public final float getF39677r() {
        return this.f39644k;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: B, reason: from getter */
    public final long getF39682w() {
        return this.f39649p;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: C, reason: from getter */
    public final float getF39653t() {
        return this.f39653t;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    @Y61.k
    public final Matrix D() {
        Matrix matrix = this.f39639f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f39639f = matrix;
        }
        this.f39637d.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: E, reason: from getter */
    public final int getF39673n() {
        return this.f39658y;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void F(int i12, int i13, long j12) {
        this.f39637d.setPosition(i12, i13, ((int) (j12 >> 32)) + i12, ((int) (4294967295L & j12)) + i13);
        this.f39638e = androidx.compose.ui.unit.v.c(j12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: G, reason: from getter */
    public final long getF39681v() {
        return this.f39648o;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: H, reason: from getter */
    public final int getF39672m() {
        return this.f39642i;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void I(int i12) {
        this.f39658y = i12;
        C22266b.f39571b.getClass();
        int i13 = C22266b.f39572c;
        if (!C22266b.a(i12, i13)) {
            androidx.compose.ui.graphics.E.f39229b.getClass();
            if (androidx.compose.ui.graphics.E.a(this.f39642i, androidx.compose.ui.graphics.E.f39232e) && this.f39657x == null) {
                L(this.f39637d, this.f39658y);
                return;
            }
        }
        L(this.f39637d, i13);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void J(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection, @Y61.k C22267c c22267c, @Y61.k Y41.l<? super androidx.compose.ui.graphics.drawscope.g, G0> lVar) {
        androidx.compose.ui.graphics.drawscope.a aVar = this.f39636c;
        RecordingCanvas recordingCanvasBeginRecording = this.f39637d.beginRecording();
        try {
            N n12 = this.f39635b;
            C22245c c22245c = n12.f39293a;
            Canvas canvas = c22245c.f39351a;
            c22245c.f39351a = recordingCanvasBeginRecording;
            a.b bVar = aVar.f39478c;
            bVar.g(dVar);
            bVar.i(layoutDirection);
            bVar.f39486b = c22267c;
            bVar.j(this.f39638e);
            bVar.f(c22245c);
            ((C22268d) lVar).invoke(aVar);
            n12.f39293a.f39351a = canvas;
        } finally {
            this.f39637d.endRecording();
        }
    }

    public final void K() {
        boolean z12 = this.f39654u;
        boolean z13 = false;
        boolean z14 = z12 && !this.f39640g;
        if (z12 && this.f39640g) {
            z13 = true;
        }
        if (z14 != this.f39655v) {
            this.f39655v = z14;
            this.f39637d.setClipToBounds(z14);
        }
        if (z13 != this.f39656w) {
            this.f39656w = z13;
            this.f39637d.setClipToOutline(z13);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final boolean a() {
        return this.f39637d.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void b(float f12) {
        this.f39650q = f12;
        this.f39637d.setRotationX(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void c(float f12) {
        this.f39651r = f12;
        this.f39637d.setRotationY(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void d(float f12) {
        this.f39652s = f12;
        this.f39637d.setRotationZ(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void e(@Y61.l Z0 z02) {
        this.f39657x = z02;
        if (Build.VERSION.SDK_INT >= 31) {
            A a12 = A.f39551a;
            RenderNode renderNode = this.f39637d;
            a12.getClass();
            renderNode.setRenderEffect(z02 != null ? z02.a() : null);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void f() {
        this.f39637d.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void g(float f12) {
        this.f39646m = f12;
        this.f39637d.setTranslationY(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: getAlpha, reason: from getter */
    public final float getF39674o() {
        return this.f39641h;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void h(float f12) {
        this.f39653t = f12;
        this.f39637d.setCameraDistance(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    @Y61.l
    /* renamed from: i, reason: from getter */
    public final Z0 getF39660A() {
        return this.f39657x;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void j(float f12) {
        this.f39643j = f12;
        this.f39637d.setScaleX(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void k(float f12) {
        this.f39644k = f12;
        this.f39637d.setScaleY(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void l(float f12) {
        this.f39645l = f12;
        this.f39637d.setTranslationX(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void m(@Y61.l Outline outline, long j12) {
        this.f39637d.setOutline(outline);
        this.f39640g = outline != null;
        K();
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: n, reason: from getter */
    public final float getF39679t() {
        return this.f39646m;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: o, reason: from getter */
    public final float getF39678s() {
        return this.f39645l;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void p(boolean z12) {
        this.f39654u = z12;
        K();
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void q(float f12) {
        this.f39647n = f12;
        this.f39637d.setElevation(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: r, reason: from getter */
    public final float getF39680u() {
        return this.f39647n;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void s(@Y61.k M m12) {
        Canvas canvas = C22247d.f39473a;
        ((C22245c) m12).f39351a.drawRenderNode(this.f39637d);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void setAlpha(float f12) {
        this.f39641h = f12;
        this.f39637d.setAlpha(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: t, reason: from getter */
    public final float getF39684y() {
        return this.f39651r;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: u, reason: from getter */
    public final float getF39685z() {
        return this.f39652s;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void v(long j12) {
        this.f39648o = j12;
        this.f39637d.setAmbientShadowColor(V.j(j12));
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void w(long j12) {
        this.f39649p = j12;
        this.f39637d.setSpotShadowColor(V.j(j12));
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: x, reason: from getter */
    public final float getF39676q() {
        return this.f39643j;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void y(long j12) {
        if ((9223372034707292159L & j12) == 9205357640488583168L) {
            this.f39637d.resetPivot();
        } else {
            this.f39637d.setPivotX(Float.intBitsToFloat((int) (j12 >> 32)));
            this.f39637d.setPivotY(Float.intBitsToFloat((int) (j12 & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: z, reason: from getter */
    public final float getF39683x() {
        return this.f39650q;
    }
}
