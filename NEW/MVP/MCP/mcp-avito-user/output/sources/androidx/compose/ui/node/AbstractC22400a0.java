package androidx.compose.ui.node;

import androidx.compose.ui.graphics.InterfaceC22276o0;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.u;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: LookaheadDelegate.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/a0;", "Landroidx/compose/ui/layout/h0;", "Landroidx/compose/ui/node/X;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22400a0 extends X implements InterfaceC22363h0 {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final AbstractC22443w0 f40731n;

    /* renamed from: o, reason: collision with root package name */
    public long f40732o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public LinkedHashMap f40733p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.layout.X f40734q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public InterfaceC22367j0 f40735r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.M0<AbstractC22348a> f40736s;

    public AbstractC22400a0(@Y61.k AbstractC22443w0 abstractC22443w0) {
        this.f40731n = abstractC22443w0;
        androidx.compose.ui.unit.q.f42862b.getClass();
        this.f40732o = 0L;
        this.f40734q = new androidx.compose.ui.layout.X(this);
        this.f40736s = androidx.collection.Y0.a();
    }

    public static final void H0(AbstractC22400a0 abstractC22400a0, InterfaceC22367j0 interfaceC22367j0) {
        kotlin.G0 g02;
        LinkedHashMap linkedHashMap;
        if (interfaceC22367j0 != null) {
            u.a aVar = androidx.compose.ui.unit.u.f42871b;
            abstractC22400a0.o0((interfaceC22367j0.getF40585c() & 4294967295L) | (interfaceC22367j0.getF40584b() << 32));
            g02 = kotlin.G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            androidx.compose.ui.unit.u.f42871b.getClass();
            abstractC22400a0.o0(0L);
        }
        if (!kotlin.jvm.internal.L.f(abstractC22400a0.f40735r, interfaceC22367j0) && interfaceC22367j0 != null && ((((linkedHashMap = abstractC22400a0.f40733p) != null && !linkedHashMap.isEmpty()) || !interfaceC22367j0.t().isEmpty()) && !kotlin.jvm.internal.L.f(interfaceC22367j0.t(), abstractC22400a0.f40733p))) {
            abstractC22400a0.f40731n.f40909n.f40616J.f40694q.f40758t.g();
            LinkedHashMap linkedHashMap2 = abstractC22400a0.f40733p;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                abstractC22400a0.f40733p = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC22367j0.t());
        }
        abstractC22400a0.f40735r = interfaceC22367j0;
    }

    @Override // androidx.compose.ui.node.X
    @Y61.l
    public final X B0() {
        AbstractC22443w0 abstractC22443w0 = this.f40731n.f40913r;
        if (abstractC22443w0 != null) {
            return abstractC22443w0.getF40958U();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.X
    /* renamed from: D0, reason: from getter */
    public final long getF40898A() {
        return this.f40732o;
    }

    @Override // androidx.compose.ui.node.X
    public final void F0() {
        k0(this.f40732o, 0.0f, null);
    }

    public int G(int i12) {
        return this.f40731n.f40912q.getF40958U().G(i12);
    }

    @Override // androidx.compose.ui.node.X, androidx.compose.ui.layout.InterfaceC22393x
    public final boolean I1() {
        return true;
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: K0 */
    public final float getF40390d() {
        return this.f40731n.getF40390d();
    }

    public final long Q0() {
        long j12 = (this.f40346c & 4294967295L) | (this.f40345b << 32);
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        return j12;
    }

    public int R(int i12) {
        return this.f40731n.f40912q.getF40958U().R(i12);
    }

    public void R0() {
        z0().u();
    }

    public final void S0(long j12) {
        if (!androidx.compose.ui.unit.q.c(this.f40732o, j12)) {
            this.f40732o = j12;
            AbstractC22443w0 abstractC22443w0 = this.f40731n;
            C22404c0 c22404c0 = abstractC22443w0.f40909n.f40616J.f40694q;
            if (c22404c0 != null) {
                c22404c0.u0();
            }
            X.E0(abstractC22443w0);
        }
        if (this.f40705i) {
            return;
        }
        t0(new O0(z0(), this));
    }

    public final long T0(@Y61.k AbstractC22400a0 abstractC22400a0, boolean z12) {
        androidx.compose.ui.unit.q.f42862b.getClass();
        long jE2 = 0;
        for (AbstractC22400a0 f40958u = this; !f40958u.equals(abstractC22400a0); f40958u = f40958u.f40731n.f40913r.getF40958U()) {
            if (!f40958u.f40703g || !z12) {
                jE2 = androidx.compose.ui.unit.q.e(jE2, f40958u.f40732o);
            }
        }
        return jE2;
    }

    public int X(int i12) {
        return this.f40731n.f40912q.getF40958U().X(i12);
    }

    public int b0(int i12) {
        return this.f40731n.f40912q.getF40958U().b0(i12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22375n0, androidx.compose.ui.layout.InterfaceC22391w
    @Y61.l
    /* renamed from: f */
    public final Object getF40763y() {
        return this.f40731n.getF40763y();
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: getDensity */
    public final float getF40389c() {
        return this.f40731n.getF40389c();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22393x
    @Y61.k
    /* renamed from: getLayoutDirection */
    public final LayoutDirection getF40449b() {
        return this.f40731n.f40909n.f40609C;
    }

    @Override // androidx.compose.ui.layout.K0
    public final void k0(long j12, float f12, @Y61.l Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar) {
        S0(j12);
        if (this.f40704h) {
            return;
        }
        R0();
    }

    @Override // androidx.compose.ui.node.X
    @Y61.l
    public final X u0() {
        AbstractC22443w0 abstractC22443w0 = this.f40731n.f40912q;
        if (abstractC22443w0 != null) {
            return abstractC22443w0.getF40958U();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.X
    @Y61.k
    public final androidx.compose.ui.layout.A v0() {
        return this.f40734q;
    }

    @Override // androidx.compose.ui.node.X
    public final boolean w0() {
        return this.f40735r != null;
    }

    @Override // androidx.compose.ui.node.X, androidx.compose.ui.node.InterfaceC22424m0
    @Y61.k
    /* renamed from: w1 */
    public final LayoutNode getF40909n() {
        return this.f40731n.f40909n;
    }

    @Override // androidx.compose.ui.node.X
    @Y61.k
    public final InterfaceC22367j0 z0() {
        InterfaceC22367j0 interfaceC22367j0 = this.f40735r;
        if (interfaceC22367j0 != null) {
            return interfaceC22367j0;
        }
        throw androidx.compose.foundation.H.s("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }
}
