package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.N;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.Z0;
import androidx.compose.ui.graphics.layer.C22266b;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import n0.C44161a;

/* compiled from: GraphicsViewLayer.android.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/layer/l;", "Landroidx/compose/ui/graphics/layer/g;", "b", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l implements g {

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public static final a f39659B;

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public Z0 f39660A;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C44161a f39661b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final N f39662c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final D f39663d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f39664e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Rect f39665f;

    /* renamed from: g, reason: collision with root package name */
    public int f39666g;

    /* renamed from: h, reason: collision with root package name */
    public int f39667h;

    /* renamed from: i, reason: collision with root package name */
    public long f39668i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f39669j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f39670k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f39671l;

    /* renamed from: m, reason: collision with root package name */
    public final int f39672m;

    /* renamed from: n, reason: collision with root package name */
    public int f39673n;

    /* renamed from: o, reason: collision with root package name */
    public float f39674o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f39675p;

    /* renamed from: q, reason: collision with root package name */
    public float f39676q;

    /* renamed from: r, reason: collision with root package name */
    public float f39677r;

    /* renamed from: s, reason: collision with root package name */
    public float f39678s;

    /* renamed from: t, reason: collision with root package name */
    public float f39679t;

    /* renamed from: u, reason: collision with root package name */
    public float f39680u;

    /* renamed from: v, reason: collision with root package name */
    public long f39681v;

    /* renamed from: w, reason: collision with root package name */
    public long f39682w;

    /* renamed from: x, reason: collision with root package name */
    public float f39683x;

    /* renamed from: y, reason: collision with root package name */
    public float f39684y;

    /* renamed from: z, reason: collision with root package name */
    public float f39685z;

    /* compiled from: GraphicsViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/layer/l$a", "Landroid/graphics/Canvas;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Canvas {
        @Override // android.graphics.Canvas
        public final boolean isHardwareAccelerated() {
            return true;
        }
    }

    /* compiled from: GraphicsViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/layer/l$b;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        B.f39552a.getClass();
        f39659B = new a();
    }

    public l(C44161a c44161a, long j12, N n12, androidx.compose.ui.graphics.drawscope.a aVar, int i12, C42822w c42822w) {
        n12 = (i12 & 4) != 0 ? new N() : n12;
        aVar = (i12 & 8) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar;
        this.f39661b = c44161a;
        this.f39662c = n12;
        D d12 = new D(c44161a, n12, aVar);
        this.f39663d = d12;
        this.f39664e = c44161a.getResources();
        this.f39665f = new Rect();
        c44161a.addView(d12);
        d12.setClipBounds(null);
        androidx.compose.ui.unit.u.f42871b.getClass();
        this.f39668i = 0L;
        View.generateViewId();
        androidx.compose.ui.graphics.E.f39229b.getClass();
        this.f39672m = androidx.compose.ui.graphics.E.f39232e;
        C22266b.f39571b.getClass();
        this.f39673n = 0;
        this.f39674o = 1.0f;
        l0.g.f413384b.getClass();
        this.f39676q = 1.0f;
        this.f39677r = 1.0f;
        T.f39320b.getClass();
        long j13 = T.f39321c;
        this.f39681v = j13;
        this.f39682w = j13;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: A, reason: from getter */
    public final float getF39677r() {
        return this.f39677r;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: B, reason: from getter */
    public final long getF39682w() {
        return this.f39682w;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: C */
    public final float getF39653t() {
        return this.f39663d.getCameraDistance() / this.f39664e.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    @Y61.k
    public final Matrix D() {
        return this.f39663d.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: E, reason: from getter */
    public final int getF39673n() {
        return this.f39673n;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void F(int i12, int i13, long j12) {
        boolean zC2 = androidx.compose.ui.unit.u.c(this.f39668i, j12);
        D d12 = this.f39663d;
        if (zC2) {
            int i14 = this.f39666g;
            if (i14 != i12) {
                d12.offsetLeftAndRight(i12 - i14);
            }
            int i15 = this.f39667h;
            if (i15 != i13) {
                d12.offsetTopAndBottom(i13 - i15);
            }
        } else {
            if (L()) {
                this.f39669j = true;
            }
            int i16 = (int) (j12 >> 32);
            int i17 = (int) (4294967295L & j12);
            d12.layout(i12, i13, i12 + i16, i13 + i17);
            this.f39668i = j12;
            if (this.f39675p) {
                d12.setPivotX(i16 / 2.0f);
                d12.setPivotY(i17 / 2.0f);
            }
        }
        this.f39666g = i12;
        this.f39667h = i13;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: G, reason: from getter */
    public final long getF39681v() {
        return this.f39681v;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: H, reason: from getter */
    public final int getF39672m() {
        return this.f39672m;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void I(int i12) {
        this.f39673n = i12;
        C22266b.f39571b.getClass();
        int i13 = C22266b.f39572c;
        if (!C22266b.a(i12, i13)) {
            androidx.compose.ui.graphics.E.f39229b.getClass();
            if (androidx.compose.ui.graphics.E.a(this.f39672m, androidx.compose.ui.graphics.E.f39232e)) {
                K(this.f39673n);
                return;
            }
        }
        K(i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.layer.g
    public final void J(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection, @Y61.k C22267c c22267c, @Y61.k Y41.l<? super androidx.compose.ui.graphics.drawscope.g, G0> lVar) {
        D d12 = this.f39663d;
        ViewParent parent = d12.getParent();
        C44161a c44161a = this.f39661b;
        if (parent == null) {
            c44161a.addView(d12);
        }
        d12.f39560h = dVar;
        d12.f39561i = layoutDirection;
        d12.f39562j = (kotlin.jvm.internal.N) lVar;
        d12.f39563k = c22267c;
        if (d12.isAttachedToWindow()) {
            d12.setVisibility(4);
            d12.setVisibility(0);
            try {
                N n12 = this.f39662c;
                a aVar = f39659B;
                C22245c c22245c = n12.f39293a;
                Canvas canvas = c22245c.f39351a;
                c22245c.f39351a = aVar;
                c44161a.a(c22245c, d12, d12.getDrawingTime());
                n12.f39293a.f39351a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    public final void K(int i12) {
        C22266b.a aVar = C22266b.f39571b;
        aVar.getClass();
        boolean zA2 = C22266b.a(i12, C22266b.f39572c);
        boolean z12 = true;
        D d12 = this.f39663d;
        if (zA2) {
            d12.setLayerType(2, null);
        } else {
            aVar.getClass();
            if (C22266b.a(i12, C22266b.f39573d)) {
                d12.setLayerType(0, null);
                z12 = false;
            } else {
                d12.setLayerType(0, null);
            }
        }
        d12.setCanUseCompositingLayer$ui_graphics_release(z12);
    }

    public final boolean L() {
        return this.f39671l || this.f39663d.getClipToOutline();
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void b(float f12) {
        this.f39683x = f12;
        this.f39663d.setRotationX(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void c(float f12) {
        this.f39684y = f12;
        this.f39663d.setRotationY(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void d(float f12) {
        this.f39685z = f12;
        this.f39663d.setRotation(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void e(@Y61.l Z0 z02) {
        this.f39660A = z02;
        if (Build.VERSION.SDK_INT >= 31) {
            F.f39565a.getClass();
            this.f39663d.setRenderEffect(z02 != null ? z02.a() : null);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void f() {
        this.f39661b.removeViewInLayout(this.f39663d);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void g(float f12) {
        this.f39679t = f12;
        this.f39663d.setTranslationY(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: getAlpha, reason: from getter */
    public final float getF39674o() {
        return this.f39674o;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void h(float f12) {
        this.f39663d.setCameraDistance(f12 * this.f39664e.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    @Y61.l
    /* renamed from: i, reason: from getter */
    public final Z0 getF39660A() {
        return this.f39660A;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void j(float f12) {
        this.f39676q = f12;
        this.f39663d.setScaleX(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void k(float f12) {
        this.f39677r = f12;
        this.f39663d.setScaleY(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void l(float f12) {
        this.f39678s = f12;
        this.f39663d.setTranslationX(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void m(@Y61.l Outline outline, long j12) {
        D d12 = this.f39663d;
        d12.f39558f = outline;
        v.f39694a.getClass();
        d12.invalidateOutline();
        if (L() && outline != null) {
            d12.setClipToOutline(true);
            if (this.f39671l) {
                this.f39671l = false;
                this.f39669j = true;
            }
        }
        this.f39670k = outline != null;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: n, reason: from getter */
    public final float getF39679t() {
        return this.f39679t;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: o, reason: from getter */
    public final float getF39678s() {
        return this.f39678s;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void p(boolean z12) {
        boolean z13 = false;
        this.f39671l = z12 && !this.f39670k;
        this.f39669j = true;
        if (z12 && this.f39670k) {
            z13 = true;
        }
        this.f39663d.setClipToOutline(z13);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void q(float f12) {
        this.f39680u = f12;
        this.f39663d.setElevation(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: r, reason: from getter */
    public final float getF39680u() {
        return this.f39680u;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void s(@Y61.k M m12) {
        Rect rect;
        boolean z12 = this.f39669j;
        D d12 = this.f39663d;
        if (z12) {
            if (!L() || this.f39670k) {
                rect = null;
            } else {
                rect = this.f39665f;
                rect.left = 0;
                rect.top = 0;
                rect.right = d12.getWidth();
                rect.bottom = d12.getHeight();
            }
            d12.setClipBounds(rect);
        }
        Canvas canvas = C22247d.f39473a;
        if (((C22245c) m12).f39351a.isHardwareAccelerated()) {
            this.f39661b.a(m12, d12, d12.getDrawingTime());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void setAlpha(float f12) {
        this.f39674o = f12;
        this.f39663d.setAlpha(f12);
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: t, reason: from getter */
    public final float getF39684y() {
        return this.f39684y;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: u, reason: from getter */
    public final float getF39685z() {
        return this.f39685z;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void v(long j12) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f39681v = j12;
            E e12 = E.f39564a;
            int iJ2 = V.j(j12);
            e12.getClass();
            this.f39663d.setOutlineAmbientShadowColor(iJ2);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void w(long j12) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f39682w = j12;
            E e12 = E.f39564a;
            int iJ2 = V.j(j12);
            e12.getClass();
            this.f39663d.setOutlineSpotShadowColor(iJ2);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: x, reason: from getter */
    public final float getF39676q() {
        return this.f39676q;
    }

    @Override // androidx.compose.ui.graphics.layer.g
    public final void y(long j12) {
        long j13 = 9223372034707292159L & j12;
        D d12 = this.f39663d;
        if (j13 != 9205357640488583168L) {
            this.f39675p = false;
            d12.setPivotX(Float.intBitsToFloat((int) (j12 >> 32)));
            d12.setPivotY(Float.intBitsToFloat((int) (j12 & 4294967295L)));
        } else if (Build.VERSION.SDK_INT >= 28) {
            E.f39564a.getClass();
            d12.resetPivot();
        } else {
            this.f39675p = true;
            d12.setPivotX(((int) (this.f39668i >> 32)) / 2.0f);
            d12.setPivotY(((int) (this.f39668i & 4294967295L)) / 2.0f);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.g
    /* renamed from: z, reason: from getter */
    public final float getF39683x() {
        return this.f39683x;
    }
}
