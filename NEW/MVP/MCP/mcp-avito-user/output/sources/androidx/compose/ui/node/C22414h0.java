package androidx.compose.ui.node;

import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.G0;
import androidx.compose.ui.node.J0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import s0.C47949a;

/* compiled from: MeasureAndLayoutDelegate.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/h0;", "", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22414h0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LayoutNode f40808a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22431q f40809b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40810c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40811d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final G0 f40812e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<J0.b> f40813f;

    /* renamed from: g, reason: collision with root package name */
    public final long f40814g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<a> f40815h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public C22712b f40816i;

    /* compiled from: MeasureAndLayoutDelegate.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/h0$a;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.h0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LayoutNode f40817a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f40818b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f40819c;

        public a(@Y61.k LayoutNode layoutNode, boolean z12, boolean z13) {
            this.f40817a = layoutNode;
            this.f40818b = z12;
            this.f40819c = z13;
        }
    }

    /* compiled from: MeasureAndLayoutDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.h0$b */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.f40651b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f40651b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.f40651b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LayoutNode.LayoutState layoutState4 = LayoutNode.LayoutState.f40651b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C22414h0(@Y61.k LayoutNode layoutNode) {
        this.f40808a = layoutNode;
        J0.f40575D1.getClass();
        this.f40809b = new C22431q();
        this.f40812e = new G0();
        this.f40813f = new androidx.compose.runtime.collection.e<>(new J0.b[16], 0);
        this.f40814g = 1L;
        this.f40815h = new androidx.compose.runtime.collection.e<>(new a[16], 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(androidx.compose.ui.node.LayoutNode r5, androidx.compose.ui.unit.C22712b r6) {
        /*
            androidx.compose.ui.node.LayoutNode r0 = r5.f40635k
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.compose.ui.node.T r2 = r5.f40616J
            if (r6 == 0) goto L17
            if (r0 == 0) goto L15
            androidx.compose.ui.node.c0 r0 = r2.f40694q
            long r2 = r6.f42843a
            boolean r6 = r0.B0(r2)
            goto L29
        L15:
            r6 = r1
            goto L29
        L17:
            androidx.compose.ui.node.c0 r6 = r2.f40694q
            if (r6 == 0) goto L1e
            androidx.compose.ui.unit.b r2 = r6.f40753o
            goto L1f
        L1e:
            r2 = 0
        L1f:
            if (r2 == 0) goto L15
            if (r0 == 0) goto L15
            long r2 = r2.f42843a
            boolean r6 = r6.B0(r2)
        L29:
            androidx.compose.ui.node.LayoutNode r0 = r5.K()
            if (r6 == 0) goto L51
            if (r0 == 0) goto L51
            androidx.compose.ui.node.LayoutNode r2 = r0.f40635k
            r3 = 3
            if (r2 != 0) goto L3a
            androidx.compose.ui.node.LayoutNode.o0(r0, r1, r3)
            goto L51
        L3a:
            androidx.compose.ui.node.LayoutNode$UsageByParent r2 = r5.I()
            androidx.compose.ui.node.LayoutNode$UsageByParent r4 = androidx.compose.ui.node.LayoutNode.UsageByParent.f40658b
            if (r2 != r4) goto L46
            androidx.compose.ui.node.LayoutNode.m0(r0, r1, r3)
            goto L51
        L46:
            androidx.compose.ui.node.LayoutNode$UsageByParent r5 = r5.I()
            androidx.compose.ui.node.LayoutNode$UsageByParent r2 = androidx.compose.ui.node.LayoutNode.UsageByParent.f40659c
            if (r5 != r2) goto L51
            r0.l0(r1)
        L51:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C22414h0.b(androidx.compose.ui.node.LayoutNode, androidx.compose.ui.unit.b):boolean");
    }

    public static boolean c(LayoutNode layoutNode, C22712b c22712b) {
        boolean zG02 = c22712b != null ? layoutNode.g0(c22712b) : LayoutNode.h0(layoutNode);
        LayoutNode layoutNodeK = layoutNode.K();
        if (zG02 && layoutNodeK != null) {
            if (layoutNode.H() == LayoutNode.UsageByParent.f40658b) {
                LayoutNode.o0(layoutNodeK, false, 3);
            } else if (layoutNode.H() == LayoutNode.UsageByParent.f40659c) {
                layoutNodeK.n0(false);
            }
        }
        return zG02;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h(androidx.compose.ui.node.LayoutNode r2) {
        /*
            boolean r0 = r2.G()
            if (r0 == 0) goto L2b
        L6:
            boolean r0 = i(r2)
            if (r0 != 0) goto L1c
            androidx.compose.ui.node.LayoutNode r0 = r2.K()
            if (r0 == 0) goto L17
            androidx.compose.ui.node.T r0 = r0.f40616J
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r0.f40681d
            goto L18
        L17:
            r0 = 0
        L18:
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.f40651b
            if (r0 != r1) goto L2b
        L1c:
            androidx.compose.ui.node.LayoutNode r2 = r2.K()
            if (r2 != 0) goto L23
            goto L2b
        L23:
            boolean r0 = r2.r()
            if (r0 == 0) goto L6
            r2 = 1
            goto L2c
        L2b:
            r2 = 0
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C22414h0.h(androidx.compose.ui.node.LayoutNode):boolean");
    }

    public static boolean i(LayoutNode layoutNode) {
        return layoutNode.H() == LayoutNode.UsageByParent.f40658b || layoutNode.f40616J.f40693p.f40853z.f();
    }

    public final void a(boolean z12) {
        G0 g02 = this.f40812e;
        if (z12) {
            androidx.compose.runtime.collection.e<LayoutNode> eVar = g02.f40572a;
            eVar.g();
            LayoutNode layoutNode = this.f40808a;
            eVar.b(layoutNode);
            layoutNode.f40624R = true;
        }
        g02.getClass();
        G0.a.C1668a c1668a = G0.a.C1668a.f40574b;
        androidx.compose.runtime.collection.e<LayoutNode> eVar2 = g02.f40572a;
        eVar2.n(c1668a);
        int i12 = eVar2.f38262d;
        LayoutNode[] layoutNodeArr = g02.f40573b;
        if (layoutNodeArr == null || layoutNodeArr.length < i12) {
            layoutNodeArr = new LayoutNode[Math.max(16, i12)];
        }
        g02.f40573b = null;
        for (int i13 = 0; i13 < i12; i13++) {
            layoutNodeArr[i13] = eVar2.f38260b[i13];
        }
        eVar2.g();
        for (int i14 = i12 - 1; -1 < i14; i14--) {
            LayoutNode layoutNode2 = layoutNodeArr[i14];
            if (layoutNode2.f40624R) {
                G0.a(layoutNode2);
            }
        }
        g02.f40573b = layoutNodeArr;
    }

    public final void d() {
        androidx.compose.runtime.collection.e<a> eVar = this.f40815h;
        int i12 = eVar.f38262d;
        if (i12 != 0) {
            a[] aVarArr = eVar.f38260b;
            for (int i13 = 0; i13 < i12; i13++) {
                a aVar = aVarArr[i13];
                if (aVar.f40817a.m()) {
                    boolean z12 = aVar.f40818b;
                    boolean z13 = aVar.f40819c;
                    LayoutNode layoutNode = aVar.f40817a;
                    if (z12) {
                        LayoutNode.m0(layoutNode, z13, 2);
                    } else {
                        LayoutNode.o0(layoutNode, z13, 2);
                    }
                }
            }
            eVar.g();
        }
    }

    public final void e(LayoutNode layoutNode) {
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = layoutNode.O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i12 = eVarO.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            LayoutNode layoutNode2 = layoutNodeArr[i13];
            if (kotlin.jvm.internal.L.f(layoutNode2.b0(), Boolean.TRUE) && !layoutNode2.f40625S) {
                if (this.f40809b.b(layoutNode2)) {
                    layoutNode2.c0();
                }
                e(layoutNode2);
            }
        }
    }

    public final void f(@Y61.k LayoutNode layoutNode, boolean z12) {
        if (!this.f40810c) {
            C47949a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z12 ? layoutNode.f40616J.f40682e : layoutNode.G()) {
            C47949a.a("node not yet measured");
        }
        g(layoutNode, z12);
    }

    public final void g(LayoutNode layoutNode, boolean z12) {
        C22404c0 c22404c0;
        W w12;
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = layoutNode.O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i12 = eVarO.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            LayoutNode layoutNode2 = layoutNodeArr[i13];
            if ((!z12 && i(layoutNode2)) || (z12 && (layoutNode2.I() == LayoutNode.UsageByParent.f40658b || ((c22404c0 = layoutNode2.f40616J.f40694q) != null && (w12 = c22404c0.f40758t) != null && w12.f())))) {
                boolean zA2 = U.a(layoutNode2);
                T t12 = layoutNode2.f40616J;
                if (zA2 && !z12) {
                    if (t12.f40682e && this.f40809b.b(layoutNode2)) {
                        m(layoutNode2, true, false);
                    } else {
                        f(layoutNode2, true);
                    }
                }
                if (z12 ? t12.f40682e : layoutNode2.G()) {
                    m(layoutNode2, z12, false);
                }
                if (!(z12 ? t12.f40682e : layoutNode2.G())) {
                    g(layoutNode2, z12);
                }
            }
        }
        if (z12 ? layoutNode.f40616J.f40682e : layoutNode.G()) {
            m(layoutNode, z12, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(@Y61.l Y41.a<kotlin.G0> aVar) {
        boolean z12;
        LayoutNode layoutNodeFirst;
        C22431q c22431q = this.f40809b;
        LayoutNode layoutNode = this.f40808a;
        if (!layoutNode.m()) {
            C47949a.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode.r()) {
            C47949a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f40810c) {
            C47949a.a("performMeasureAndLayout called during measure layout");
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (this.f40816i != null) {
            this.f40810c = true;
            this.f40811d = true;
            try {
                if (c22431q.c()) {
                    z12 = false;
                    while (true) {
                        boolean zC2 = c22431q.c();
                        C22427o c22427o = c22431q.f40864a;
                        if (!zC2) {
                            break;
                        }
                        boolean zIsEmpty = c22427o.f40862a.isEmpty();
                        boolean z13 = !zIsEmpty;
                        if (zIsEmpty) {
                            C22427o c22427o2 = c22431q.f40865b;
                            LayoutNode layoutNodeFirst2 = c22427o2.f40862a.first();
                            c22427o2.b(layoutNodeFirst2);
                            layoutNodeFirst = layoutNodeFirst2;
                        } else {
                            layoutNodeFirst = c22427o.f40862a.first();
                            c22427o.b(layoutNodeFirst);
                        }
                        boolean zM2 = m(layoutNodeFirst, z13, true);
                        if (layoutNodeFirst == layoutNode && zM2) {
                            z12 = true;
                        }
                    }
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else {
                    z12 = false;
                }
            } finally {
                this.f40810c = false;
                this.f40811d = false;
            }
        } else {
            z12 = false;
        }
        androidx.compose.runtime.collection.e<J0.b> eVar = this.f40813f;
        J0.b[] bVarArr = eVar.f38260b;
        int i12 = eVar.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            bVarArr[i13].g();
        }
        eVar.g();
        return z12;
    }

    public final void k(@Y61.k LayoutNode layoutNode, long j12) {
        if (layoutNode.f40625S) {
            return;
        }
        LayoutNode layoutNode2 = this.f40808a;
        if (layoutNode.equals(layoutNode2)) {
            C47949a.a("measureAndLayout called on root");
        }
        if (!layoutNode2.m()) {
            C47949a.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.r()) {
            C47949a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f40810c) {
            C47949a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f40816i != null) {
            this.f40810c = true;
            this.f40811d = false;
            try {
                C22431q c22431q = this.f40809b;
                c22431q.f40864a.b(layoutNode);
                c22431q.f40865b.b(layoutNode);
                if ((b(layoutNode, C22712b.a(j12)) || layoutNode.f40616J.f40683f) && kotlin.jvm.internal.L.f(layoutNode.b0(), Boolean.TRUE)) {
                    layoutNode.c0();
                }
                e(layoutNode);
                c(layoutNode, C22712b.a(j12));
                if (layoutNode.F() && layoutNode.r()) {
                    layoutNode.k0();
                    this.f40812e.f40572a.b(layoutNode);
                    layoutNode.f40624R = true;
                }
                d();
                this.f40810c = false;
                this.f40811d = false;
            } catch (Throwable th2) {
                this.f40810c = false;
                this.f40811d = false;
                throw th2;
            }
        }
        androidx.compose.runtime.collection.e<J0.b> eVar = this.f40813f;
        J0.b[] bVarArr = eVar.f38260b;
        int i12 = eVar.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            bVarArr[i13].g();
        }
        eVar.g();
    }

    public final void l() {
        C22431q c22431q = this.f40809b;
        if (c22431q.c()) {
            LayoutNode layoutNode = this.f40808a;
            if (!layoutNode.m()) {
                C47949a.a("performMeasureAndLayout called with unattached root");
            }
            if (!layoutNode.r()) {
                C47949a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f40810c) {
                C47949a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f40816i != null) {
                this.f40810c = true;
                this.f40811d = false;
                try {
                    if (!c22431q.f40864a.f40862a.isEmpty()) {
                        if (layoutNode.f40635k != null) {
                            o(layoutNode, true);
                        } else {
                            n(layoutNode);
                        }
                    }
                    o(layoutNode, false);
                    this.f40810c = false;
                    this.f40811d = false;
                } catch (Throwable th2) {
                    this.f40810c = false;
                    this.f40811d = false;
                    throw th2;
                }
            }
        }
    }

    public final boolean m(LayoutNode layoutNode, boolean z12, boolean z13) {
        K0.a placementScope;
        C22448z c22448z;
        LayoutNode layoutNodeK;
        C22404c0 c22404c0;
        W w12;
        C22404c0 c22404c02;
        W w13;
        if (layoutNode.f40625S) {
            return false;
        }
        boolean zR2 = layoutNode.r();
        T t12 = layoutNode.f40616J;
        if (zR2 || t12.f40693p.f40849v || h(layoutNode) || kotlin.jvm.internal.L.f(layoutNode.b0(), Boolean.TRUE) || ((t12.f40682e && (layoutNode.I() == LayoutNode.UsageByParent.f40658b || ((c22404c02 = t12.f40694q) != null && (w13 = c22404c02.f40758t) != null && w13.f()))) || t12.f40693p.f40853z.f() || ((c22404c0 = t12.f40694q) != null && (w12 = c22404c0.f40758t) != null && w12.f()))) {
            LayoutNode layoutNode2 = this.f40808a;
            C22712b c22712b = layoutNode == layoutNode2 ? this.f40816i : null;
            if (z12) {
                zB = t12.f40682e ? b(layoutNode, c22712b) : false;
                if (z13 && ((zB || t12.f40683f) && kotlin.jvm.internal.L.f(layoutNode.b0(), Boolean.TRUE))) {
                    layoutNode.c0();
                }
            } else {
                boolean zC2 = layoutNode.G() ? c(layoutNode, c22712b) : false;
                if (z13 && layoutNode.F() && (layoutNode == layoutNode2 || ((layoutNodeK = layoutNode.K()) != null && layoutNodeK.r() && t12.f40693p.f40849v))) {
                    if (layoutNode == layoutNode2) {
                        if (layoutNode.f40612F == LayoutNode.UsageByParent.f40660d) {
                            layoutNode.v();
                        }
                        LayoutNode layoutNodeK2 = layoutNode.K();
                        if (layoutNodeK2 == null || (c22448z = layoutNodeK2.f40615I.f40875b) == null || (placementScope = c22448z.f40706j) == null) {
                            placementScope = S.a(layoutNode).getPlacementScope();
                        }
                        placementScope.h(t12.f40693p, 0, 0, 0.0f);
                    } else {
                        layoutNode.k0();
                    }
                    this.f40812e.f40572a.b(layoutNode);
                    layoutNode.f40624R = true;
                    S.a(layoutNode).getRectManager().d(layoutNode);
                }
                zB = zC2;
            }
            d();
        }
        return zB;
    }

    public final void n(LayoutNode layoutNode) {
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = layoutNode.O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i12 = eVarO.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            LayoutNode layoutNode2 = layoutNodeArr[i13];
            if (i(layoutNode2)) {
                if (U.a(layoutNode2)) {
                    o(layoutNode2, true);
                } else {
                    n(layoutNode2);
                }
            }
        }
    }

    public final void o(LayoutNode layoutNode, boolean z12) {
        if (layoutNode.f40625S) {
            return;
        }
        C22712b c22712b = layoutNode == this.f40808a ? this.f40816i : null;
        if (z12) {
            b(layoutNode, c22712b);
        } else {
            c(layoutNode, c22712b);
        }
    }

    public final boolean p(@Y61.k LayoutNode layoutNode, boolean z12) {
        int iOrdinal = layoutNode.f40616J.f40681d.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            this.f40815h.b(new a(layoutNode, false, z12));
            return false;
        }
        if (iOrdinal != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (layoutNode.G() && !z12) {
            return false;
        }
        layoutNode.f40616J.f40693p.f40850w = true;
        if (layoutNode.f40625S) {
            return false;
        }
        if (!layoutNode.r() && !h(layoutNode)) {
            return false;
        }
        LayoutNode layoutNodeK = layoutNode.K();
        if (layoutNodeK == null || !layoutNodeK.G()) {
            this.f40809b.a(layoutNode, false);
        }
        return !this.f40811d;
    }

    public final void q(long j12) {
        C22712b c22712b = this.f40816i;
        if (c22712b == null ? false : C22712b.d(c22712b.f42843a, j12)) {
            return;
        }
        if (this.f40810c) {
            C47949a.a("updateRootConstraints called while measuring");
        }
        this.f40816i = C22712b.a(j12);
        LayoutNode layoutNode = this.f40808a;
        LayoutNode layoutNode2 = layoutNode.f40635k;
        T t12 = layoutNode.f40616J;
        if (layoutNode2 != null) {
            t12.f40682e = true;
        }
        t12.f40693p.f40850w = true;
        this.f40809b.a(layoutNode, layoutNode2 != null);
    }
}
