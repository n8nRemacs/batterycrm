package androidx.compose.ui.graphics;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;

/* compiled from: GraphicsLayerScope.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/c1;", "Landroidx/compose/ui/graphics/o0;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c1 implements InterfaceC22276o0 {

    /* renamed from: b, reason: collision with root package name */
    public int f39355b;

    /* renamed from: c, reason: collision with root package name */
    public float f39356c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f39357d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f39358e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f39359f;

    /* renamed from: g, reason: collision with root package name */
    public float f39360g;

    /* renamed from: h, reason: collision with root package name */
    public float f39361h;

    /* renamed from: i, reason: collision with root package name */
    public long f39362i;

    /* renamed from: j, reason: collision with root package name */
    public long f39363j;

    /* renamed from: k, reason: collision with root package name */
    public float f39364k;

    /* renamed from: l, reason: collision with root package name */
    public float f39365l;

    /* renamed from: m, reason: collision with root package name */
    public float f39366m;

    /* renamed from: n, reason: collision with root package name */
    public float f39367n;

    /* renamed from: o, reason: collision with root package name */
    public long f39368o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public h1 f39369p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f39370q;

    /* renamed from: r, reason: collision with root package name */
    public int f39371r;

    /* renamed from: s, reason: collision with root package name */
    public long f39372s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.unit.d f39373t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public LayoutDirection f39374u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public Z0 f39375v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public D0 f39376w;

    public c1() {
        long j12 = C22278p0.f39720a;
        this.f39362i = j12;
        this.f39363j = j12;
        this.f39367n = 8.0f;
        r1.f39755b.getClass();
        this.f39368o = r1.f39756c;
        this.f39369p = Y0.f39346a;
        C22250e0.f39504b.getClass();
        this.f39371r = 0;
        l0.n.f413402b.getClass();
        this.f39372s = l0.n.f413403c;
        this.f39373t = androidx.compose.ui.unit.f.b();
        this.f39374u = LayoutDirection.f42838b;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void H(int i12) {
        if (C22250e0.a(this.f39371r, i12)) {
            return;
        }
        this.f39355b |= 32768;
        this.f39371r = i12;
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: K0 */
    public final float getF40390d() {
        return this.f39373t.getF40390d();
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void b(float f12) {
        if (this.f39364k == f12) {
            return;
        }
        this.f39355b |= 256;
        this.f39364k = f12;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void c(float f12) {
        if (this.f39365l == f12) {
            return;
        }
        this.f39355b |= 512;
        this.f39365l = f12;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void d(float f12) {
        if (this.f39366m == f12) {
            return;
        }
        this.f39355b |= 1024;
        this.f39366m = f12;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void e(@Y61.l Z0 z02) {
        if (kotlin.jvm.internal.L.f(this.f39375v, z02)) {
            return;
        }
        this.f39355b |= 131072;
        this.f39375v = z02;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void g(float f12) {
        if (this.f39360g == f12) {
            return;
        }
        this.f39355b |= 16;
        this.f39360g = f12;
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: getDensity */
    public final float getF40389c() {
        return this.f39373t.getF40389c();
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void h(float f12) {
        if (this.f39367n == f12) {
            return;
        }
        this.f39355b |= 2048;
        this.f39367n = f12;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    /* renamed from: i, reason: from getter */
    public final long getF39372s() {
        return this.f39372s;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void i1(long j12) {
        if (r1.b(this.f39368o, j12)) {
            return;
        }
        this.f39355b |= 4096;
        this.f39368o = j12;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void j(float f12) {
        if (this.f39356c == f12) {
            return;
        }
        this.f39355b |= 1;
        this.f39356c = f12;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void k(float f12) {
        if (this.f39357d == f12) {
            return;
        }
        this.f39355b |= 2;
        this.f39357d = f12;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void l(float f12) {
        if (this.f39359f == f12) {
            return;
        }
        this.f39355b |= 8;
        this.f39359f = f12;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void p(boolean z12) {
        if (this.f39370q != z12) {
            this.f39355b |= Http2.INITIAL_MAX_FRAME_SIZE;
            this.f39370q = z12;
        }
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void q(float f12) {
        if (this.f39361h == f12) {
            return;
        }
        this.f39355b |= 32;
        this.f39361h = f12;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void setAlpha(float f12) {
        if (this.f39358e == f12) {
            return;
        }
        this.f39355b |= 4;
        this.f39358e = f12;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void u1(@Y61.k h1 h1Var) {
        if (kotlin.jvm.internal.L.f(this.f39369p, h1Var)) {
            return;
        }
        this.f39355b |= 8192;
        this.f39369p = h1Var;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void v(long j12) {
        if (T.d(this.f39362i, j12)) {
            return;
        }
        this.f39355b |= 64;
        this.f39362i = j12;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22276o0
    public final void w(long j12) {
        if (T.d(this.f39363j, j12)) {
            return;
        }
        this.f39355b |= 128;
        this.f39363j = j12;
    }
}
