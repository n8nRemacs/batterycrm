package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC22400a0;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;
import l0.g;
import s0.C47949a;

/* compiled from: LookaheadLayoutCoordinates.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/X;", "Landroidx/compose/ui/layout/A;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X implements A {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC22400a0 f40423b;

    public X(@Y61.k AbstractC22400a0 abstractC22400a0) {
        this.f40423b = abstractC22400a0;
    }

    @Override // androidx.compose.ui.layout.A
    public final long A(long j12) {
        return l0.g.j(this.f40423b.f40731n.A(j12), b());
    }

    @Override // androidx.compose.ui.layout.A
    public final void B(@Y61.k A a12, @Y61.k float[] fArr) {
        this.f40423b.f40731n.B(a12, fArr);
    }

    @Override // androidx.compose.ui.layout.A
    public final long M(long j12) {
        return l0.g.j(this.f40423b.f40731n.M(j12), b());
    }

    @Override // androidx.compose.ui.layout.A
    public final long O(long j12) {
        return this.f40423b.f40731n.O(l0.g.j(j12, b()));
    }

    @Override // androidx.compose.ui.layout.A
    @Y61.k
    public final l0.j P(@Y61.k A a12, boolean z12) {
        return this.f40423b.f40731n.P(a12, z12);
    }

    @Override // androidx.compose.ui.layout.A
    @Y61.l
    public final A T() {
        AbstractC22400a0 f40958u;
        if (!m()) {
            C47949a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        AbstractC22443w0 abstractC22443w0 = this.f40423b.f40731n.f40913r;
        if (abstractC22443w0 == null || (f40958u = abstractC22443w0.getF40958U()) == null) {
            return null;
        }
        return f40958u.f40734q;
    }

    @Override // androidx.compose.ui.layout.A
    public final long a() {
        AbstractC22400a0 abstractC22400a0 = this.f40423b;
        long j12 = (abstractC22400a0.f40345b << 32) | (abstractC22400a0.f40346c & 4294967295L);
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        return j12;
    }

    @Override // androidx.compose.ui.layout.A
    public final void a0(@Y61.k float[] fArr) {
        this.f40423b.f40731n.a0(fArr);
    }

    public final long b() {
        AbstractC22400a0 abstractC22400a0 = this.f40423b;
        AbstractC22400a0 abstractC22400a0A = Y.a(abstractC22400a0);
        g.a aVar = l0.g.f413384b;
        aVar.getClass();
        long jC2 = c(abstractC22400a0A.f40734q, 0L, true);
        AbstractC22443w0 abstractC22443w0 = abstractC22400a0.f40731n;
        aVar.getClass();
        return l0.g.i(jC2, abstractC22443w0.G1(abstractC22400a0A.f40731n, 0L, true));
    }

    public final long c(@Y61.k A a12, long j12, boolean z12) {
        boolean z13 = a12 instanceof X;
        AbstractC22400a0 abstractC22400a0 = this.f40423b;
        if (!z13) {
            AbstractC22400a0 abstractC22400a0A = Y.a(abstractC22400a0);
            long jC2 = c(abstractC22400a0A.f40734q, j12, z12);
            long j13 = abstractC22400a0A.f40732o;
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
            long jI2 = l0.g.i(jC2, (Float.floatToRawIntBits((int) (j13 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j13 >> 32)) << 32));
            A a13 = abstractC22400a0A.f40731n;
            A aT2 = a13.T();
            if (aT2 != null) {
                a13 = aT2;
            }
            l0.g.f413384b.getClass();
            return l0.g.j(jI2, ((AbstractC22443w0) a13).G1(a12, 0L, z12));
        }
        AbstractC22400a0 abstractC22400a02 = ((X) a12).f40423b;
        abstractC22400a02.f40731n.K1();
        AbstractC22400a0 f40958u = abstractC22400a0.f40731n.b1(abstractC22400a02.f40731n).getF40958U();
        if (f40958u != null) {
            boolean z14 = !z12;
            long jD2 = androidx.compose.ui.unit.q.d(androidx.compose.ui.unit.q.e(abstractC22400a02.T0(f40958u, z14), androidx.compose.ui.unit.r.c(j12)), abstractC22400a0.T0(f40958u, z14));
            long jFloatToRawIntBits = (Float.floatToRawIntBits((int) (jD2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (jD2 & 4294967295L)) & 4294967295L);
            g.a aVar2 = l0.g.f413384b;
            return jFloatToRawIntBits;
        }
        AbstractC22400a0 abstractC22400a0A2 = Y.a(abstractC22400a02);
        boolean z15 = !z12;
        long jE2 = androidx.compose.ui.unit.q.e(androidx.compose.ui.unit.q.e(abstractC22400a02.T0(abstractC22400a0A2, z15), abstractC22400a0A2.f40732o), androidx.compose.ui.unit.r.c(j12));
        AbstractC22400a0 abstractC22400a0A3 = Y.a(abstractC22400a0);
        long jD3 = androidx.compose.ui.unit.q.d(jE2, androidx.compose.ui.unit.q.e(abstractC22400a0.T0(abstractC22400a0A3, z15), abstractC22400a0A3.f40732o));
        long jFloatToRawIntBits2 = Float.floatToRawIntBits((int) (jD3 >> 32));
        long jFloatToRawIntBits3 = Float.floatToRawIntBits((int) (jD3 & 4294967295L)) & 4294967295L;
        g.a aVar3 = l0.g.f413384b;
        return abstractC22400a0A3.f40731n.f40913r.G1(abstractC22400a0A2.f40731n.f40913r, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32), z12);
    }

    @Override // androidx.compose.ui.layout.A
    public final boolean m() {
        return this.f40423b.f40731n.j1().f42893o;
    }

    @Override // androidx.compose.ui.layout.A
    @Y61.l
    public final A x() {
        AbstractC22400a0 f40958u;
        if (!m()) {
            C47949a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        AbstractC22443w0 abstractC22443w0 = this.f40423b.f40731n.f40909n.f40615I.f40876c.f40913r;
        if (abstractC22443w0 == null || (f40958u = abstractC22443w0.getF40958U()) == null) {
            return null;
        }
        return f40958u.f40734q;
    }

    @Override // androidx.compose.ui.layout.A
    public final long y(long j12) {
        return this.f40423b.f40731n.y(l0.g.j(j12, b()));
    }

    @Override // androidx.compose.ui.layout.A
    public final long z(@Y61.k A a12, long j12) {
        return c(a12, j12, true);
    }
}
