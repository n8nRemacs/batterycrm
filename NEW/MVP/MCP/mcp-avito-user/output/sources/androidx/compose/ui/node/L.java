package androidx.compose.ui.node;

import androidx.compose.ui.graphics.C22273n;
import androidx.compose.ui.graphics.InterfaceC22276o0;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.C22366j;
import androidx.compose.ui.layout.InterfaceC22358f;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LayoutModifierNodeCoordinator.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/L;", "Landroidx/compose/ui/node/w0;", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L extends AbstractC22443w0 {

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public static final C22273n f40577X;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public K f40578T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public C22712b f40579U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public AbstractC22400a0 f40580V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public C22366j f40581W;

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/L$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/L$b;", "Landroidx/compose/ui/node/a0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends AbstractC22400a0 {
        public b() {
            super(L.this);
        }

        @Override // androidx.compose.ui.node.AbstractC22400a0, androidx.compose.ui.layout.InterfaceC22391w
        public final int G(int i12) {
            L l12 = L.this;
            return l12.f40578T.m(this, l12.f40912q.getF40580V(), i12);
        }

        @Override // androidx.compose.ui.layout.InterfaceC22363h0
        @Y61.k
        public final androidx.compose.ui.layout.K0 I(long j12) {
            q0(j12);
            C22712b c22712bA = C22712b.a(j12);
            L l12 = L.this;
            l12.f40579U = c22712bA;
            AbstractC22400a0.H0(this, l12.f40578T.f(this, l12.f40912q.getF40580V(), j12));
            return this;
        }

        @Override // androidx.compose.ui.node.AbstractC22400a0, androidx.compose.ui.layout.InterfaceC22391w
        public final int R(int i12) {
            L l12 = L.this;
            return l12.f40578T.A(this, l12.f40912q.getF40580V(), i12);
        }

        @Override // androidx.compose.ui.node.AbstractC22400a0, androidx.compose.ui.layout.InterfaceC22391w
        public final int X(int i12) {
            L l12 = L.this;
            return l12.f40578T.x(this, l12.f40912q.getF40580V(), i12);
        }

        @Override // androidx.compose.ui.node.AbstractC22400a0, androidx.compose.ui.layout.InterfaceC22391w
        public final int b0(int i12) {
            L l12 = L.this;
            return l12.f40578T.z(this, l12.f40912q.getF40580V(), i12);
        }

        @Override // androidx.compose.ui.node.X
        public final int r0(@Y61.k AbstractC22348a abstractC22348a) {
            int iA2 = M.a(this, abstractC22348a);
            this.f40736s.h(iA2, abstractC22348a);
            return iA2;
        }
    }

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/node/L$c", "Landroidx/compose/ui/layout/j0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC22367j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22367j0 f40583a;

        /* renamed from: b, reason: collision with root package name */
        public final int f40584b;

        /* renamed from: c, reason: collision with root package name */
        public final int f40585c;

        public c(InterfaceC22367j0 interfaceC22367j0, L l12) {
            this.f40583a = interfaceC22367j0;
            AbstractC22400a0 abstractC22400a0 = l12.f40580V;
            this.f40584b = abstractC22400a0.f40345b;
            this.f40585c = abstractC22400a0.f40346c;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        /* renamed from: getHeight, reason: from getter */
        public final int getF40465b() {
            return this.f40585c;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        /* renamed from: getWidth, reason: from getter */
        public final int getF40464a() {
            return this.f40584b;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        public final Map<AbstractC22348a, Integer> t() {
            return this.f40583a.t();
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        public final void u() {
            this.f40583a.u();
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        public final Y41.l<androidx.compose.ui.layout.R0, kotlin.G0> v() {
            return this.f40583a.v();
        }
    }

    static {
        new a(null);
        C22273n c22273n = new C22273n();
        androidx.compose.ui.graphics.T.f39320b.getClass();
        c22273n.b(androidx.compose.ui.graphics.T.f39326h);
        c22273n.p(1.0f);
        androidx.compose.ui.graphics.H0.f39278b.getClass();
        c22273n.q(androidx.compose.ui.graphics.H0.f39279c);
        f40577X = c22273n;
    }

    public L(@Y61.k LayoutNode layoutNode, @Y61.k K k12) {
        super(layoutNode);
        this.f40578T = k12;
        this.f40580V = layoutNode.f40635k != null ? new b() : null;
        this.f40581W = (k12.getF42880b().f42882d & 512) != 0 ? new C22366j(this, (InterfaceC22358f) k12) : null;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int G(int i12) {
        C22366j c22366j = this.f40581W;
        return c22366j != null ? c22366j.f40470c.z0(c22366j, this.f40912q, i12) : this.f40578T.m(this, this.f40912q, i12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22363h0
    @Y61.k
    public final androidx.compose.ui.layout.K0 I(long j12) {
        InterfaceC22367j0 interfaceC22367j0F;
        C22712b c22712b;
        if (this.f40911p) {
            C22712b c22712b2 = this.f40579U;
            if (c22712b2 == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            j12 = c22712b2.f42843a;
        }
        q0(j12);
        C22366j c22366j = this.f40581W;
        if (c22366j != null) {
            InterfaceC22358f interfaceC22358f = c22366j.f40470c;
            boolean z12 = interfaceC22358f.M1(c22366j.Z()) || (c22712b = this.f40579U) == null || j12 != c22712b.f42843a;
            c22366j.f40471d = z12;
            if (!z12) {
                this.f40912q.f40911p = true;
            }
            interfaceC22367j0F = interfaceC22358f.l1(c22366j, this.f40912q, j12);
            this.f40912q.f40911p = false;
            boolean z13 = interfaceC22367j0F.getF40464a() == this.f40580V.f40345b && interfaceC22367j0F.getF40465b() == this.f40580V.f40346c;
            if (!c22366j.f40471d) {
                AbstractC22443w0 abstractC22443w0 = this.f40912q;
                long j13 = abstractC22443w0.f40347d;
                AbstractC22400a0 f40580v = abstractC22443w0.getF40580V();
                if (androidx.compose.ui.unit.u.b(j13, f40580v != null ? androidx.compose.ui.unit.u.a(f40580v.Q0()) : null) && !z13) {
                    interfaceC22367j0F = new c(interfaceC22367j0F, this);
                }
            }
        } else {
            interfaceC22367j0F = this.f40578T.f(this, this.f40912q, j12);
        }
        X1(interfaceC22367j0F);
        M1();
        return this;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int R(int i12) {
        C22366j c22366j = this.f40581W;
        return c22366j != null ? c22366j.f40470c.g0(c22366j, this.f40912q, i12) : this.f40578T.A(this, this.f40912q, i12);
    }

    @Override // androidx.compose.ui.node.AbstractC22443w0
    public final void R1(@Y61.k androidx.compose.ui.graphics.M m12, @Y61.l C22267c c22267c) {
        this.f40912q.T0(m12, c22267c);
        if (S.a(this.f40909n).getShowLayoutBounds()) {
            long j12 = this.f40347d;
            m12.q(0.5f, 0.5f, ((int) (j12 >> 32)) - 0.5f, ((int) (j12 & 4294967295L)) - 0.5f, f40577X);
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int X(int i12) {
        C22366j c22366j = this.f40581W;
        return c22366j != null ? c22366j.f40470c.s1(c22366j, this.f40912q, i12) : this.f40578T.x(this, this.f40912q, i12);
    }

    @Override // androidx.compose.ui.node.AbstractC22443w0
    public final void a1() {
        if (this.f40580V == null) {
            this.f40580V = new b();
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int b0(int i12) {
        C22366j c22366j = this.f40581W;
        return c22366j != null ? c22366j.f40470c.f0(c22366j, this.f40912q, i12) : this.f40578T.z(this, this.f40912q, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e2() {
        /*
            r7 = this;
            boolean r0 = r7.f40704h
            if (r0 == 0) goto L5
            return
        L5:
            r7.O1()
            androidx.compose.ui.layout.j r0 = r7.f40581W
            r1 = 0
            if (r0 == 0) goto L55
            androidx.compose.ui.layout.f r2 = r0.f40470c
            androidx.compose.ui.layout.K0$a r3 = r7.f40706j
            androidx.compose.ui.node.a0 r4 = r7.f40580V
            androidx.compose.ui.layout.X r4 = r4.f40734q
            boolean r2 = r2.R0(r3, r4)
            if (r2 != 0) goto L50
            boolean r0 = r0.f40471d
            if (r0 != 0) goto L50
            long r2 = r7.f40347d
            androidx.compose.ui.node.a0 r0 = r7.f40580V
            r4 = 0
            if (r0 == 0) goto L2f
            long r5 = r0.Q0()
            androidx.compose.ui.unit.u r0 = androidx.compose.ui.unit.u.a(r5)
            goto L30
        L2f:
            r0 = r4
        L30:
            boolean r0 = androidx.compose.ui.unit.u.b(r2, r0)
            if (r0 == 0) goto L50
            androidx.compose.ui.node.w0 r0 = r7.f40912q
            long r2 = r0.f40347d
            androidx.compose.ui.node.a0 r0 = r0.getF40580V()
            if (r0 == 0) goto L48
            long r4 = r0.Q0()
            androidx.compose.ui.unit.u r4 = androidx.compose.ui.unit.u.a(r4)
        L48:
            boolean r0 = androidx.compose.ui.unit.u.b(r2, r4)
            if (r0 == 0) goto L50
            r0 = 1
            goto L51
        L50:
            r0 = r1
        L51:
            androidx.compose.ui.node.w0 r2 = r7.f40912q
            r2.f40910o = r0
        L55:
            androidx.compose.ui.layout.j0 r0 = r7.z0()
            r0.u()
            androidx.compose.ui.node.w0 r0 = r7.f40912q
            r0.f40910o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.L.e2():void");
    }

    public final void f2(@Y61.k K k12) {
        if (!k12.equals(this.f40578T)) {
            if ((k12.getF42880b().f42882d & 512) != 0) {
                InterfaceC22358f interfaceC22358f = (InterfaceC22358f) k12;
                C22366j c22366j = this.f40581W;
                if (c22366j != null) {
                    c22366j.f40470c = interfaceC22358f;
                } else {
                    c22366j = new C22366j(this, interfaceC22358f);
                }
                this.f40581W = c22366j;
            } else {
                this.f40581W = null;
            }
        }
        this.f40578T = k12;
    }

    @Override // androidx.compose.ui.node.AbstractC22443w0
    @Y61.l
    /* renamed from: g1, reason: from getter */
    public final AbstractC22400a0 getF40580V() {
        return this.f40580V;
    }

    @Override // androidx.compose.ui.node.AbstractC22443w0
    @Y61.k
    public final v.d j1() {
        return this.f40578T.getF42880b();
    }

    @Override // androidx.compose.ui.node.AbstractC22443w0, androidx.compose.ui.layout.K0
    public final void k0(long j12, float f12, @Y61.l Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar) {
        super.k0(j12, f12, lVar);
        e2();
    }

    @Override // androidx.compose.ui.node.AbstractC22443w0, androidx.compose.ui.layout.K0
    public final void m0(long j12, float f12, @Y61.k C22267c c22267c) {
        super.m0(j12, f12, c22267c);
        e2();
    }

    @Override // androidx.compose.ui.node.X
    public final int r0(@Y61.k AbstractC22348a abstractC22348a) {
        AbstractC22400a0 abstractC22400a0 = this.f40580V;
        if (abstractC22400a0 == null) {
            return M.a(this, abstractC22348a);
        }
        androidx.collection.M0<AbstractC22348a> m02 = abstractC22400a0.f40736s;
        int iA2 = m02.a(abstractC22348a);
        return iA2 >= 0 ? m02.f25649c[iA2] : BeduinInputModel.MIN_TEXT_VERSION;
    }
}
