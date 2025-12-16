package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.C22258i0;
import androidx.compose.ui.graphics.C22273n;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.F;
import androidx.compose.ui.graphics.F0;
import androidx.compose.ui.graphics.H0;
import androidx.compose.ui.graphics.I0;
import androidx.compose.ui.graphics.InterfaceC22280q0;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.graphics.drawscope.g;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.graphics.n1;
import androidx.compose.ui.unit.LayoutDirection;
import j.InterfaceC42167x;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.X;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l0.n;

/* compiled from: CanvasDrawScope.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/a;", "Landroidx/compose/ui/graphics/drawscope/g;", "<init>", "()V", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C1659a f39477b = new C1659a(null, null, null, 0, 15, null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final b f39478c = new b();

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public C22273n f39479d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public C22273n f39480e;

    /* compiled from: CanvasDrawScope.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/drawscope/a$b", "Landroidx/compose/ui/graphics/drawscope/e;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.compose.ui.graphics.drawscope.b f39485a = new androidx.compose.ui.graphics.drawscope.b(this);

        /* renamed from: b, reason: collision with root package name */
        public C22267c f39486b;

        public b() {
        }

        public final M a() {
            return a.this.f39477b.f39483c;
        }

        public final androidx.compose.ui.unit.d b() {
            return a.this.f39477b.f39481a;
        }

        /* renamed from: c, reason: from getter */
        public final C22267c getF39486b() {
            return this.f39486b;
        }

        public final LayoutDirection d() {
            return a.this.f39477b.f39482b;
        }

        public final long e() {
            return a.this.f39477b.f39484d;
        }

        public final void f(M m12) {
            a.this.f39477b.f39483c = m12;
        }

        public final void g(androidx.compose.ui.unit.d dVar) {
            a.this.f39477b.f39481a = dVar;
        }

        public final void h(C22267c c22267c) {
            this.f39486b = c22267c;
        }

        public final void i(LayoutDirection layoutDirection) {
            a.this.f39477b.f39482b = layoutDirection;
        }

        public final void j(long j12) {
            a.this.f39477b.f39484d = j12;
        }
    }

    public static F0 f(a aVar, long j12, j jVar, float f12, U u12, int i12) {
        g.f39490B1.getClass();
        int i13 = g.a.f39493c;
        F0 f0X = aVar.x(jVar);
        if (f12 != 1.0f) {
            j12 = T.c(j12, T.e(j12) * f12);
        }
        C22273n c22273n = (C22273n) f0X;
        if (!T.d(c22273n.a(), j12)) {
            c22273n.b(j12);
        }
        if (c22273n.f39704c != null) {
            c22273n.e(null);
        }
        if (!L.f(c22273n.f39705d, u12)) {
            c22273n.j(u12);
        }
        if (!E.a(c22273n.f39703b, i12)) {
            c22273n.i(i12);
        }
        if (!C22258i0.a(c22273n.f(), i13)) {
            c22273n.k(i13);
        }
        return f0X;
    }

    public static F0 r(a aVar, J j12, j jVar, float f12, U u12, int i12) {
        g.f39490B1.getClass();
        return aVar.m(j12, jVar, f12, u12, i12, g.a.f39493c);
    }

    public static F0 t(a aVar, long j12, float f12, int i12, I0 i02, int i13) {
        g.f39490B1.getClass();
        int i14 = g.a.f39493c;
        F0 f0U = aVar.u();
        C22273n c22273n = (C22273n) f0U;
        if (!T.d(c22273n.a(), j12)) {
            c22273n.b(j12);
        }
        if (c22273n.f39704c != null) {
            c22273n.e(null);
        }
        if (!L.f(c22273n.f39705d, null)) {
            c22273n.j(null);
        }
        if (!E.a(c22273n.f39703b, i13)) {
            c22273n.i(i13);
        }
        if (c22273n.f39702a.getStrokeWidth() != f12) {
            c22273n.p(f12);
        }
        if (c22273n.f39702a.getStrokeMiter() != 4.0f) {
            c22273n.o(4.0f);
        }
        if (!m1.b(c22273n.g(), i12)) {
            c22273n.m(i12);
        }
        if (!n1.b(c22273n.h(), 0)) {
            c22273n.n(0);
        }
        if (!L.f(c22273n.f39706e, i02)) {
            c22273n.l(i02);
        }
        if (!C22258i0.a(c22273n.f(), i14)) {
            c22273n.k(i14);
        }
        return f0U;
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void B1(@Y61.k ArrayList arrayList, long j12, float f12, int i12, int i13) {
        M m12 = this.f39477b.f39483c;
        n1.f39707b.getClass();
        m12.t(arrayList, t(this, j12, f12, i12, null, i13));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void E1(long j12, long j13, long j14, float f12, int i12, @Y61.l I0 i02, int i13) {
        M m12 = this.f39477b.f39483c;
        n1.f39707b.getClass();
        m12.j(j13, j14, t(this, j12, f12, i12, i02, i13));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void I0(@Y61.k Path path, long j12, @InterfaceC42167x float f12, @Y61.k j jVar, int i12) {
        this.f39477b.f39483c.v(path, f(this, j12, jVar, f12, null, i12));
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: K0 */
    public final float getF40390d() {
        return this.f39477b.f39481a.getF40390d();
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void L1(long j12, float f12, long j13, @InterfaceC42167x float f13, @Y61.k j jVar, int i12) {
        this.f39477b.f39483c.p(f12, j13, f(this, j12, jVar, f13, null, i12));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void P0(@Y61.k InterfaceC22280q0 interfaceC22280q0, long j12, long j13, long j14, long j15, @InterfaceC42167x float f12, @Y61.k j jVar, @Y61.l U u12, int i12, int i13) {
        this.f39477b.f39483c.a(interfaceC22280q0, j12, j13, j14, j15, m(null, jVar, f12, u12, i12, i13));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void P1(long j12, long j13, long j14, @InterfaceC42167x float f12, @Y61.k j jVar, @Y61.l U u12, int i12) {
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        this.f39477b.f39483c.q(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j14 & 4294967295L)) + Float.intBitsToFloat(i14), f(this, j12, jVar, f12, u12, i12));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void T1(@Y61.k J j12, long j13, long j14, float f12, @InterfaceC42167x float f13, int i12) {
        M m12 = this.f39477b.f39483c;
        n1.f39707b.getClass();
        g.f39490B1.getClass();
        int i13 = g.a.f39493c;
        F0 f0U = u();
        if (j12 != null) {
            j12.a(f13, i(), f0U);
        } else {
            C22273n c22273n = (C22273n) f0U;
            if (c22273n.getAlpha() != f13) {
                c22273n.setAlpha(f13);
            }
        }
        C22273n c22273n2 = (C22273n) f0U;
        if (!L.f(c22273n2.f39705d, null)) {
            c22273n2.j(null);
        }
        if (!E.a(c22273n2.f39703b, i12)) {
            c22273n2.i(i12);
        }
        if (c22273n2.f39702a.getStrokeWidth() != f12) {
            c22273n2.p(f12);
        }
        if (c22273n2.f39702a.getStrokeMiter() != 4.0f) {
            c22273n2.o(4.0f);
        }
        if (!m1.b(c22273n2.g(), 0)) {
            c22273n2.m(0);
        }
        if (!n1.b(c22273n2.h(), 0)) {
            c22273n2.n(0);
        }
        if (!L.f(c22273n2.f39706e, null)) {
            c22273n2.l(null);
        }
        if (!C22258i0.a(c22273n2.f(), i13)) {
            c22273n2.k(i13);
        }
        m12.j(j13, j14, f0U);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void V0(@Y61.k InterfaceC22280q0 interfaceC22280q0, @Y61.k j jVar, @Y61.l F f12, int i12) {
        this.f39477b.f39483c.d(interfaceC22280q0, r(this, null, jVar, 1.0f, f12, i12));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void V1(long j12, float f12, float f13, long j13, long j14, @InterfaceC42167x float f14, @Y61.k j jVar, int i12) {
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        this.f39477b.f39483c.b(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j14 & 4294967295L)) + Float.intBitsToFloat(i14), f12, f13, f(this, j12, jVar, f14, null, i12));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void Y(@Y61.k J j12, long j13, long j14, long j15, @InterfaceC42167x float f12, @Y61.k j jVar, int i12) {
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        this.f39477b.f39483c.w(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14), Float.intBitsToFloat(i13) + Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat(i14) + Float.intBitsToFloat((int) (j14 & 4294967295L)), Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j15 & 4294967295L)), r(this, j12, jVar, f12, null, i12));
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: getDensity */
    public final float getF40389c() {
        return this.f39477b.f39481a.getF40389c();
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    @Y61.k
    public final LayoutDirection getLayoutDirection() {
        return this.f39477b.f39482b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    @Y61.k
    /* renamed from: j0, reason: from getter */
    public final b getF39478c() {
        return this.f39478c;
    }

    public final F0 m(J j12, j jVar, @InterfaceC42167x float f12, U u12, int i12, int i13) {
        F0 f0X = x(jVar);
        if (j12 != null) {
            j12.a(f12, i(), f0X);
        } else {
            C22273n c22273n = (C22273n) f0X;
            if (c22273n.f39704c != null) {
                c22273n.e(null);
            }
            long jA2 = c22273n.a();
            T.f39320b.getClass();
            long j13 = T.f39321c;
            if (!T.d(jA2, j13)) {
                c22273n.b(j13);
            }
            if (c22273n.getAlpha() != f12) {
                c22273n.setAlpha(f12);
            }
        }
        C22273n c22273n2 = (C22273n) f0X;
        if (!L.f(c22273n2.f39705d, u12)) {
            c22273n2.j(u12);
        }
        if (!E.a(c22273n2.f39703b, i12)) {
            c22273n2.i(i12);
        }
        if (!C22258i0.a(c22273n2.f(), i13)) {
            c22273n2.k(i13);
        }
        return f0X;
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void o1(@Y61.k J j12, long j13, long j14, @InterfaceC42167x float f12, @Y61.k j jVar, @Y61.l U u12, int i12) {
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        this.f39477b.f39483c.q(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j14 & 4294967295L)) + Float.intBitsToFloat(i14), r(this, j12, jVar, f12, u12, i12));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void s0(long j12, long j13, long j14, long j15, @Y61.k j jVar, @InterfaceC42167x float f12, int i12) {
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        this.f39477b.f39483c.w(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (j14 >> 32)) + Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j14 & 4294967295L)) + Float.intBitsToFloat(i14), Float.intBitsToFloat((int) (j15 >> 32)), Float.intBitsToFloat((int) (j15 & 4294967295L)), f(this, j12, jVar, f12, null, i12));
    }

    public final F0 u() {
        C22273n c22273n = this.f39480e;
        if (c22273n != null) {
            return c22273n;
        }
        C22273n c22273n2 = new C22273n();
        H0.f39278b.getClass();
        c22273n2.q(H0.f39279c);
        this.f39480e = c22273n2;
        return c22273n2;
    }

    public final F0 x(j jVar) {
        if (L.f(jVar, n.f39497a)) {
            C22273n c22273n = this.f39479d;
            if (c22273n != null) {
                return c22273n;
            }
            C22273n c22273n2 = new C22273n();
            H0.f39278b.getClass();
            c22273n2.q(0);
            this.f39479d = c22273n2;
            return c22273n2;
        }
        if (!(jVar instanceof o)) {
            throw new NoWhenBranchMatchedException();
        }
        F0 f0U = u();
        C22273n c22273n3 = (C22273n) f0U;
        float strokeWidth = c22273n3.f39702a.getStrokeWidth();
        o oVar = (o) jVar;
        float f12 = oVar.f39499a;
        if (strokeWidth != f12) {
            c22273n3.p(f12);
        }
        int iG2 = c22273n3.g();
        int i12 = oVar.f39501c;
        if (!m1.b(iG2, i12)) {
            c22273n3.m(i12);
        }
        float strokeMiter = c22273n3.f39702a.getStrokeMiter();
        float f13 = oVar.f39500b;
        if (strokeMiter != f13) {
            c22273n3.o(f13);
        }
        int iH2 = c22273n3.h();
        int i13 = oVar.f39502d;
        if (!n1.b(iH2, i13)) {
            c22273n3.n(i13);
        }
        I0 i02 = c22273n3.f39706e;
        I0 i03 = oVar.f39503e;
        if (!L.f(i02, i03)) {
            c22273n3.l(i03);
        }
        return f0U;
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void x0(@Y61.k Path path, @Y61.k J j12, @InterfaceC42167x float f12, @Y61.k j jVar, int i12) {
        this.f39477b.f39483c.v(path, r(this, j12, jVar, f12, null, i12));
    }

    /* compiled from: CanvasDrawScope.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/a$a;", "", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/M;", "canvas", "Ll0/n;", "size", "<init>", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/M;JLkotlin/jvm/internal/w;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @X
    /* renamed from: androidx.compose.ui.graphics.drawscope.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1659a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public androidx.compose.ui.unit.d f39481a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public LayoutDirection f39482b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public M f39483c;

        /* renamed from: d, reason: collision with root package name */
        public long f39484d;

        /* JADX WARN: Illegal instructions before constructor call */
        public C1659a(androidx.compose.ui.unit.d dVar, LayoutDirection layoutDirection, M m12, long j12, int i12, C42822w c42822w) {
            androidx.compose.ui.unit.d dVar2 = (i12 & 1) != 0 ? f.f39489a : dVar;
            LayoutDirection layoutDirection2 = (i12 & 2) != 0 ? LayoutDirection.f42838b : layoutDirection;
            M m13 = (i12 & 4) != 0 ? m.f39496a : m12;
            if ((i12 & 8) != 0) {
                l0.n.f413402b.getClass();
                j12 = 0;
            }
            this(dVar2, layoutDirection2, m13, j12, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1659a)) {
                return false;
            }
            C1659a c1659a = (C1659a) obj;
            return L.f(this.f39481a, c1659a.f39481a) && this.f39482b == c1659a.f39482b && L.f(this.f39483c, c1659a.f39483c) && l0.n.b(this.f39484d, c1659a.f39484d);
        }

        public final int hashCode() {
            int iHashCode = (this.f39483c.hashCode() + ((this.f39482b.hashCode() + (this.f39481a.hashCode() * 31)) * 31)) * 31;
            long j12 = this.f39484d;
            n.a aVar = l0.n.f413402b;
            return Long.hashCode(j12) + iHashCode;
        }

        @Y61.k
        public final String toString() {
            return "DrawParams(density=" + this.f39481a + ", layoutDirection=" + this.f39482b + ", canvas=" + this.f39483c + ", size=" + ((Object) l0.n.g(this.f39484d)) + ')';
        }

        public C1659a(androidx.compose.ui.unit.d dVar, LayoutDirection layoutDirection, M m12, long j12, C42822w c42822w) {
            this.f39481a = dVar;
            this.f39482b = layoutDirection;
            this.f39483c = m12;
            this.f39484d = j12;
        }
    }
}
