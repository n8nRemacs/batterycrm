package androidx.compose.ui.node;

import androidx.compose.ui.graphics.C22273n;
import androidx.compose.ui.graphics.InterfaceC22276o0;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InnerNodeCoordinator.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/z;", "Landroidx/compose/ui/node/w0;", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22448z extends AbstractC22443w0 {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public static final C22273n f40956V;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final W0 f40957T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public AbstractC22400a0 f40958U;

    /* compiled from: InnerNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/z$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.z$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: InnerNodeCoordinator.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/z$b;", "Landroidx/compose/ui/node/a0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.z$b */
    public final class b extends AbstractC22400a0 {
        public b() {
            throw null;
        }

        @Override // androidx.compose.ui.node.AbstractC22400a0, androidx.compose.ui.layout.InterfaceC22391w
        public final int G(int i12) {
            D dJ2 = this.f40731n.f40909n.J();
            InterfaceC22365i0 interfaceC22365i0A = dJ2.a();
            LayoutNode layoutNode = dJ2.f40557a;
            return interfaceC22365i0A.e(layoutNode.f40615I.f40876c, layoutNode.A(), i12);
        }

        @Override // androidx.compose.ui.layout.InterfaceC22363h0
        @Y61.k
        public final androidx.compose.ui.layout.K0 I(long j12) {
            q0(j12);
            AbstractC22443w0 abstractC22443w0 = this.f40731n;
            androidx.compose.runtime.collection.e<LayoutNode> eVarO = abstractC22443w0.f40909n.O();
            LayoutNode[] layoutNodeArr = eVarO.f38260b;
            int i12 = eVarO.f38262d;
            for (int i13 = 0; i13 < i12; i13++) {
                layoutNodeArr[i13].f40616J.f40694q.f40749k = LayoutNode.UsageByParent.f40660d;
            }
            LayoutNode layoutNode = abstractC22443w0.f40909n;
            AbstractC22400a0.H0(this, layoutNode.f40650z.b(this, layoutNode.A(), j12));
            return this;
        }

        @Override // androidx.compose.ui.node.AbstractC22400a0, androidx.compose.ui.layout.InterfaceC22391w
        public final int R(int i12) {
            D dJ2 = this.f40731n.f40909n.J();
            InterfaceC22365i0 interfaceC22365i0A = dJ2.a();
            LayoutNode layoutNode = dJ2.f40557a;
            return interfaceC22365i0A.f(layoutNode.f40615I.f40876c, layoutNode.A(), i12);
        }

        @Override // androidx.compose.ui.node.AbstractC22400a0
        public final void R0() {
            this.f40731n.f40909n.f40616J.f40694q.w0();
        }

        @Override // androidx.compose.ui.node.AbstractC22400a0, androidx.compose.ui.layout.InterfaceC22391w
        public final int X(int i12) {
            D dJ2 = this.f40731n.f40909n.J();
            InterfaceC22365i0 interfaceC22365i0A = dJ2.a();
            LayoutNode layoutNode = dJ2.f40557a;
            return interfaceC22365i0A.c(layoutNode.f40615I.f40876c, layoutNode.A(), i12);
        }

        @Override // androidx.compose.ui.node.AbstractC22400a0, androidx.compose.ui.layout.InterfaceC22391w
        public final int b0(int i12) {
            D dJ2 = this.f40731n.f40909n.J();
            InterfaceC22365i0 interfaceC22365i0A = dJ2.a();
            LayoutNode layoutNode = dJ2.f40557a;
            return interfaceC22365i0A.h(layoutNode.f40615I.f40876c, layoutNode.A(), i12);
        }

        @Override // androidx.compose.ui.node.X
        public final int r0(@Y61.k AbstractC22348a abstractC22348a) {
            C22404c0 c22404c0 = this.f40731n.f40909n.f40616J.f40694q;
            boolean z12 = c22404c0.f40750l;
            W w12 = c22404c0.f40758t;
            if (!z12) {
                T t12 = c22404c0.f40745g;
                if (t12.f40681d == LayoutNode.LayoutState.f40652c) {
                    w12.f40726f = true;
                    if (w12.f40722b) {
                        t12.f40683f = true;
                        t12.f40684g = true;
                    }
                } else {
                    w12.f40727g = true;
                }
            }
            AbstractC22400a0 abstractC22400a0 = c22404c0.D().f40958U;
            if (abstractC22400a0 != null) {
                abstractC22400a0.f40705i = true;
            }
            c22404c0.C();
            AbstractC22400a0 abstractC22400a02 = c22404c0.D().f40958U;
            if (abstractC22400a02 != null) {
                abstractC22400a02.f40705i = false;
            }
            Integer num = (Integer) w12.f40729i.get(abstractC22348a);
            int iIntValue = num != null ? num.intValue() : BeduinInputModel.MIN_TEXT_VERSION;
            this.f40736s.h(iIntValue, abstractC22348a);
            return iIntValue;
        }
    }

    static {
        new a(null);
        C22273n c22273n = new C22273n();
        androidx.compose.ui.graphics.T.f39320b.getClass();
        c22273n.b(androidx.compose.ui.graphics.T.f39324f);
        c22273n.p(1.0f);
        androidx.compose.ui.graphics.H0.f39278b.getClass();
        c22273n.q(androidx.compose.ui.graphics.H0.f39279c);
        f40956V = c22273n;
    }

    public C22448z(@Y61.k LayoutNode layoutNode) {
        super(layoutNode);
        W0 w02 = new W0();
        this.f40957T = w02;
        w02.f42887i = this;
        this.f40958U = layoutNode.f40635k != null ? new b(this) : null;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int G(int i12) {
        D dJ2 = this.f40909n.J();
        InterfaceC22365i0 interfaceC22365i0A = dJ2.a();
        LayoutNode layoutNode = dJ2.f40557a;
        return interfaceC22365i0A.e(layoutNode.f40615I.f40876c, layoutNode.B(), i12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22363h0
    @Y61.k
    public final androidx.compose.ui.layout.K0 I(long j12) {
        if (this.f40911p) {
            j12 = this.f40958U.f40348e;
        }
        q0(j12);
        LayoutNode layoutNode = this.f40909n;
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = layoutNode.O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i12 = eVarO.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            layoutNodeArr[i13].f40616J.f40693p.f40840m = LayoutNode.UsageByParent.f40660d;
        }
        X1(layoutNode.f40650z.b(this, layoutNode.B(), j12));
        M1();
        return this;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int R(int i12) {
        D dJ2 = this.f40909n.J();
        InterfaceC22365i0 interfaceC22365i0A = dJ2.a();
        LayoutNode layoutNode = dJ2.f40557a;
        return interfaceC22365i0A.f(layoutNode.f40615I.f40876c, layoutNode.B(), i12);
    }

    @Override // androidx.compose.ui.node.AbstractC22443w0
    public final void R1(@Y61.k androidx.compose.ui.graphics.M m12, @Y61.l C22267c c22267c) {
        LayoutNode layoutNode = this.f40909n;
        J0 j0A = S.a(layoutNode);
        androidx.compose.runtime.collection.e<LayoutNode> eVarN = layoutNode.N();
        LayoutNode[] layoutNodeArr = eVarN.f38260b;
        int i12 = eVarN.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            LayoutNode layoutNode2 = layoutNodeArr[i13];
            if (layoutNode2.r()) {
                layoutNode2.y(m12, c22267c);
            }
        }
        if (j0A.getShowLayoutBounds()) {
            long j12 = this.f40347d;
            m12.q(0.5f, 0.5f, ((int) (j12 >> 32)) - 0.5f, ((int) (j12 & 4294967295L)) - 0.5f, f40956V);
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int X(int i12) {
        D dJ2 = this.f40909n.J();
        InterfaceC22365i0 interfaceC22365i0A = dJ2.a();
        LayoutNode layoutNode = dJ2.f40557a;
        return interfaceC22365i0A.c(layoutNode.f40615I.f40876c, layoutNode.B(), i12);
    }

    @Override // androidx.compose.ui.node.AbstractC22443w0
    public final void a1() {
        if (this.f40958U == null) {
            this.f40958U = new b(this);
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int b0(int i12) {
        D dJ2 = this.f40909n.J();
        InterfaceC22365i0 interfaceC22365i0A = dJ2.a();
        LayoutNode layoutNode = dJ2.f40557a;
        return interfaceC22365i0A.h(layoutNode.f40615I.f40876c, layoutNode.B(), i12);
    }

    @Override // androidx.compose.ui.node.AbstractC22443w0
    @Y61.l
    /* renamed from: g1, reason: from getter */
    public final AbstractC22400a0 getF40580V() {
        return this.f40958U;
    }

    @Override // androidx.compose.ui.node.AbstractC22443w0
    public final v.d j1() {
        return this.f40957T;
    }

    @Override // androidx.compose.ui.node.AbstractC22443w0, androidx.compose.ui.layout.K0
    public final void k0(long j12, float f12, @Y61.l Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar) {
        super.k0(j12, f12, lVar);
        if (this.f40704h) {
            return;
        }
        this.f40909n.f40616J.f40693p.z0();
    }

    @Override // androidx.compose.ui.node.AbstractC22443w0, androidx.compose.ui.layout.K0
    public final void m0(long j12, float f12, @Y61.k C22267c c22267c) {
        super.m0(j12, f12, c22267c);
        if (this.f40704h) {
            return;
        }
        this.f40909n.f40616J.f40693p.z0();
    }

    @Override // androidx.compose.ui.node.X
    public final int r0(@Y61.k AbstractC22348a abstractC22348a) {
        AbstractC22400a0 abstractC22400a0 = this.f40958U;
        if (abstractC22400a0 != null) {
            return abstractC22400a0.r0(abstractC22348a);
        }
        C22418j0 c22418j0 = this.f40909n.f40616J.f40693p;
        boolean z12 = c22418j0.f40841n;
        O o12 = c22418j0.f40853z;
        if (!z12) {
            if (c22418j0.f40834g.f40681d == LayoutNode.LayoutState.f40651b) {
                o12.f40726f = true;
                if (o12.f40722b) {
                    c22418j0.f40851x = true;
                    c22418j0.f40852y = true;
                }
            } else {
                o12.f40727g = true;
            }
        }
        c22418j0.D().f40705i = true;
        c22418j0.C();
        c22418j0.D().f40705i = false;
        Integer num = (Integer) o12.f40729i.get(abstractC22348a);
        return num != null ? num.intValue() : BeduinInputModel.MIN_TEXT_VERSION;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.ui.v$d] */
    @Override // androidx.compose.ui.node.AbstractC22443w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1(@Y61.k androidx.compose.ui.node.AbstractC22443w0.f r20, long r21, @Y61.k androidx.compose.ui.node.C22444x r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C22448z.x1(androidx.compose.ui.node.w0$f, long, androidx.compose.ui.node.x, int, boolean):void");
    }
}
