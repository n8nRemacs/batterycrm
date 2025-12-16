package androidx.compose.ui.node;

import androidx.compose.ui.graphics.InterfaceC22276o0;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.J0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.Metadata;
import s0.C47949a;

/* compiled from: MeasurePassDelegate.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/j0;", "Landroidx/compose/ui/layout/h0;", "Landroidx/compose/ui/layout/K0;", "Landroidx/compose/ui/node/b;", "Landroidx/compose/ui/node/q0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22418j0 extends androidx.compose.ui.layout.K0 implements InterfaceC22363h0, InterfaceC22401b, InterfaceC22432q0 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<C22418j0> f40820A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f40821B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f40822C;

    /* renamed from: D, reason: collision with root package name */
    public long f40823D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final Y41.a<kotlin.G0> f40824E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final Y41.a<kotlin.G0> f40825F;

    /* renamed from: G, reason: collision with root package name */
    public float f40826G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f40827H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super InterfaceC22276o0, kotlin.G0> f40828I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public C22267c f40829J;

    /* renamed from: K, reason: collision with root package name */
    public long f40830K;

    /* renamed from: L, reason: collision with root package name */
    public float f40831L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final Y41.a<kotlin.G0> f40832M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f40833N;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final T f40834g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40835h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f40838k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f40839l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f40841n;

    /* renamed from: o, reason: collision with root package name */
    public long f40842o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super InterfaceC22276o0, kotlin.G0> f40843p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public C22267c f40844q;

    /* renamed from: r, reason: collision with root package name */
    public float f40845r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f40846s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public Object f40847t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f40848u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f40849v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f40850w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f40851x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f40852y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final O f40853z;

    /* renamed from: i, reason: collision with root package name */
    public int f40836i = Integer.MAX_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f40837j = Integer.MAX_VALUE;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public LayoutNode.UsageByParent f40840m = LayoutNode.UsageByParent.f40660d;

    /* compiled from: MeasurePassDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.j0$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.f40651b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.f40658b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: MeasurePassDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.j0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C22418j0 c22418j0 = C22418j0.this;
            T t12 = c22418j0.f40834g;
            t12.f40686i = 0;
            androidx.compose.runtime.collection.e<LayoutNode> eVarO = t12.f40678a.O();
            LayoutNode[] layoutNodeArr = eVarO.f38260b;
            int i12 = eVarO.f38262d;
            for (int i13 = 0; i13 < i12; i13++) {
                C22418j0 c22418j02 = layoutNodeArr[i13].f40616J.f40693p;
                c22418j02.f40836i = c22418j02.f40837j;
                c22418j02.f40837j = Integer.MAX_VALUE;
                c22418j02.f40849v = false;
                if (c22418j02.f40840m == LayoutNode.UsageByParent.f40659c) {
                    c22418j02.f40840m = LayoutNode.UsageByParent.f40660d;
                }
            }
            c22418j0.N(C22420k0.f40858l);
            c22418j0.D().z0().u();
            LayoutNode layoutNode = c22418j0.f40834g.f40678a;
            androidx.compose.runtime.collection.e<LayoutNode> eVarO2 = layoutNode.O();
            LayoutNode[] layoutNodeArr2 = eVarO2.f38260b;
            int i14 = eVarO2.f38262d;
            for (int i15 = 0; i15 < i14; i15++) {
                LayoutNode layoutNode2 = layoutNodeArr2[i15];
                if (layoutNode2.f40616J.f40693p.f40836i != layoutNode2.L()) {
                    layoutNode.f0();
                    layoutNode.W();
                    if (layoutNode2.L() == Integer.MAX_VALUE) {
                        T t13 = layoutNode2.f40616J;
                        if (t13.f40680c) {
                            t13.f40694q.r0(false);
                        }
                        t13.f40693p.u0();
                    }
                }
            }
            c22418j0.N(C22422l0.f40859l);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: MeasurePassDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.j0$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C22418j0 c22418j0 = C22418j0.this;
            c22418j0.f40834g.a().I(c22418j0.f40823D);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: MeasurePassDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.j0$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            K0.a placementScope;
            C22418j0 c22418j0 = C22418j0.this;
            AbstractC22443w0 abstractC22443w0 = c22418j0.f40834g.a().f40913r;
            T t12 = c22418j0.f40834g;
            if (abstractC22443w0 == null || (placementScope = abstractC22443w0.f40706j) == null) {
                placementScope = S.a(t12.f40678a).getPlacementScope();
            }
            Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar = c22418j0.f40828I;
            C22267c c22267c = c22418j0.f40829J;
            if (c22267c != null) {
                AbstractC22443w0 abstractC22443w0A = t12.a();
                long j12 = c22418j0.f40830K;
                float f12 = c22418j0.f40831L;
                placementScope.getClass();
                K0.a.a(abstractC22443w0A, placementScope);
                abstractC22443w0A.m0(androidx.compose.ui.unit.q.e(j12, abstractC22443w0A.f40349f), f12, c22267c);
            } else if (lVar == null) {
                AbstractC22443w0 abstractC22443w0A2 = t12.a();
                long j13 = c22418j0.f40830K;
                float f13 = c22418j0.f40831L;
                placementScope.getClass();
                K0.a.a(abstractC22443w0A2, placementScope);
                abstractC22443w0A2.k0(androidx.compose.ui.unit.q.e(j13, abstractC22443w0A2.f40349f), f13, null);
            } else {
                AbstractC22443w0 abstractC22443w0A3 = t12.a();
                long j14 = c22418j0.f40830K;
                float f14 = c22418j0.f40831L;
                placementScope.getClass();
                K0.a.a(abstractC22443w0A3, placementScope);
                abstractC22443w0A3.k0(androidx.compose.ui.unit.q.e(j14, abstractC22443w0A3.f40349f), f14, lVar);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: MeasurePassDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.j0$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<InterfaceC22401b, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f40857l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(InterfaceC22401b interfaceC22401b) {
            interfaceC22401b.t().f40723c = false;
            return kotlin.G0.f406611a;
        }
    }

    public C22418j0(@Y61.k T t12) {
        this.f40834g = t12;
        androidx.compose.ui.unit.q.f42862b.getClass();
        this.f40842o = 0L;
        this.f40846s = true;
        this.f40853z = new O(this, null);
        this.f40820A = new androidx.compose.runtime.collection.e<>(new C22418j0[16], 0);
        this.f40821B = true;
        this.f40823D = C22713c.b(0, 0, 15);
        this.f40824E = new c();
        this.f40825F = new b();
        this.f40830K = 0L;
        this.f40832M = new d();
    }

    public final void B0(long j12, float f12, Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar, C22267c c22267c) {
        T t12 = this.f40834g;
        if (t12.f40678a.f40625S) {
            C47949a.a("place is called on a deactivated node");
        }
        t12.f40681d = LayoutNode.LayoutState.f40653d;
        boolean z12 = !this.f40839l;
        this.f40842o = j12;
        this.f40845r = f12;
        this.f40843p = lVar;
        this.f40844q = c22267c;
        this.f40839l = true;
        this.f40827H = false;
        LayoutNode layoutNode = t12.f40678a;
        J0 j0A = S.a(layoutNode);
        j0A.getRectManager().f(layoutNode, j12, z12);
        if (this.f40851x || !this.f40848u) {
            this.f40853z.f40727g = false;
            t12.e(false);
            this.f40828I = lVar;
            this.f40830K = j12;
            this.f40831L = f12;
            this.f40829J = c22267c;
            L0 snapshotObserver = j0A.getSnapshotObserver();
            snapshotObserver.b(layoutNode, snapshotObserver.f40591f, this.f40832M);
        } else {
            AbstractC22443w0 abstractC22443w0A = t12.a();
            abstractC22443w0A.S1(androidx.compose.ui.unit.q.e(j12, abstractC22443w0A.f40349f), f12, lVar, c22267c);
            z0();
        }
        t12.f40681d = LayoutNode.LayoutState.f40655f;
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    public final void C() {
        this.f40822C = true;
        O o12 = this.f40853z;
        o12.i();
        boolean z12 = this.f40851x;
        T t12 = this.f40834g;
        if (z12) {
            androidx.compose.runtime.collection.e<LayoutNode> eVarO = t12.f40678a.O();
            LayoutNode[] layoutNodeArr = eVarO.f38260b;
            int i12 = eVarO.f38262d;
            for (int i13 = 0; i13 < i12; i13++) {
                LayoutNode layoutNode = layoutNodeArr[i13];
                if (layoutNode.G() && layoutNode.H() == LayoutNode.UsageByParent.f40658b && LayoutNode.h0(layoutNode)) {
                    LayoutNode.o0(t12.f40678a, false, 7);
                }
            }
        }
        if (this.f40852y || (!this.f40841n && !D().f40705i && this.f40851x)) {
            this.f40851x = false;
            LayoutNode.LayoutState layoutState = t12.f40681d;
            t12.f40681d = LayoutNode.LayoutState.f40653d;
            t12.f(false);
            LayoutNode layoutNode2 = t12.f40678a;
            L0 snapshotObserver = S.a(layoutNode2).getSnapshotObserver();
            snapshotObserver.b(layoutNode2, snapshotObserver.f40590e, this.f40825F);
            t12.f40681d = layoutState;
            if (D().f40705i && t12.f40687j) {
                requestLayout();
            }
            this.f40852y = false;
        }
        if (o12.f40724d) {
            o12.f40725e = true;
        }
        if (o12.f40722b && o12.f()) {
            o12.h();
        }
        this.f40822C = false;
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    @Y61.k
    public final C22448z D() {
        return this.f40834g.f40678a.f40615I.f40875b;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0(long r9, float r11, Y41.l<? super androidx.compose.ui.graphics.InterfaceC22276o0, kotlin.G0> r12, androidx.compose.ui.graphics.layer.C22267c r13) {
        /*
            r8 = this;
            r0 = 1
            r8.f40849v = r0
            long r1 = r8.f40842o
            boolean r1 = androidx.compose.ui.unit.q.c(r9, r1)
            r2 = 0
            androidx.compose.ui.node.T r3 = r8.f40834g
            if (r1 == 0) goto L12
            boolean r1 = r8.f40833N
            if (r1 == 0) goto L25
        L12:
            boolean r1 = r3.f40688k
            if (r1 != 0) goto L1e
            boolean r1 = r3.f40687j
            if (r1 != 0) goto L1e
            boolean r1 = r8.f40833N
            if (r1 == 0) goto L22
        L1e:
            r8.f40851x = r0
            r8.f40833N = r2
        L22:
            r8.v0()
        L25:
            androidx.compose.ui.node.c0 r1 = r3.f40694q
            if (r1 == 0) goto L47
            androidx.compose.ui.node.T r4 = r1.f40745g
            androidx.compose.ui.node.LayoutNode r5 = r4.f40678a
            boolean r5 = androidx.compose.ui.node.U.a(r5)
            if (r5 == 0) goto L35
            r1 = r0
            goto L43
        L35:
            androidx.compose.ui.node.c0$a r1 = r1.f40757s
            androidx.compose.ui.node.c0$a r5 = androidx.compose.ui.node.C22404c0.a.f40767d
            if (r1 != r5) goto L41
            boolean r1 = r4.f40679b
            if (r1 != 0) goto L41
            r4.f40680c = r0
        L41:
            boolean r1 = r4.f40680c
        L43:
            if (r1 != r0) goto L47
            r1 = r0
            goto L48
        L47:
            r1 = r2
        L48:
            if (r1 == 0) goto L80
            androidx.compose.ui.node.w0 r1 = r3.a()
            androidx.compose.ui.node.w0 r1 = r1.f40913r
            androidx.compose.ui.node.LayoutNode r4 = r3.f40678a
            if (r1 == 0) goto L58
            androidx.compose.ui.layout.K0$a r1 = r1.f40706j
            if (r1 != 0) goto L60
        L58:
            androidx.compose.ui.node.J0 r1 = androidx.compose.ui.node.S.a(r4)
            androidx.compose.ui.layout.K0$a r1 = r1.getPlacementScope()
        L60:
            androidx.compose.ui.node.c0 r5 = r3.f40694q
            androidx.compose.ui.node.LayoutNode r4 = r4.K()
            if (r4 == 0) goto L6c
            androidx.compose.ui.node.T r4 = r4.f40616J
            r4.f40685h = r2
        L6c:
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5.f40748j = r4
            r4 = 32
            long r6 = r9 >> r4
            int r4 = (int) r6
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r9
            int r6 = (int) r6
            androidx.compose.ui.layout.K0.a.f(r1, r5, r4, r6)
        L80:
            androidx.compose.ui.node.c0 r1 = r3.f40694q
            if (r1 == 0) goto L89
            boolean r1 = r1.f40751m
            if (r1 != 0) goto L89
            goto L8a
        L89:
            r0 = r2
        L8a:
            if (r0 == 0) goto L91
            java.lang.String r0 = "Error: Placement happened before lookahead."
            s0.C47949a.b(r0)
        L91:
            r8.B0(r9, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C22418j0.D0(long, float, Y41.l, androidx.compose.ui.graphics.layer.c):void");
    }

    public final boolean E0(long j12) {
        T t12 = this.f40834g;
        if (t12.f40678a.f40625S) {
            C47949a.a("measure is called on a deactivated node");
        }
        LayoutNode layoutNode = t12.f40678a;
        J0 j0A = S.a(layoutNode);
        LayoutNode layoutNodeK = layoutNode.K();
        boolean z12 = true;
        layoutNode.f40614H = layoutNode.f40614H || (layoutNodeK != null && layoutNodeK.f40614H);
        if (!layoutNode.G() && C22712b.d(this.f40348e, j12)) {
            J0.a aVar = J0.f40575D1;
            ((AndroidComposeView) j0A).o(layoutNode, false);
            layoutNode.q0();
            return false;
        }
        this.f40853z.f40726f = false;
        N(e.f40857l);
        this.f40838k = true;
        long j13 = t12.a().f40347d;
        q0(j12);
        LayoutNode.LayoutState layoutState = t12.f40681d;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f40655f;
        if (layoutState != layoutState2) {
            C47949a.b("layout state is not idle before measure starts");
        }
        this.f40823D = j12;
        LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.f40651b;
        t12.f40681d = layoutState3;
        this.f40850w = false;
        L0 snapshotObserver = S.a(layoutNode).getSnapshotObserver();
        snapshotObserver.b(layoutNode, snapshotObserver.f40588c, this.f40824E);
        if (t12.f40681d == layoutState3) {
            this.f40851x = true;
            this.f40852y = true;
            t12.f40681d = layoutState2;
        }
        if (androidx.compose.ui.unit.u.c(t12.a().f40347d, j13) && t12.a().f40345b == this.f40345b && t12.a().f40346c == this.f40346c) {
            z12 = false;
        }
        o0((t12.a().f40346c & 4294967295L) | (t12.a().f40345b << 32));
        return z12;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int G(int i12) {
        T t12 = this.f40834g;
        if (U.a(t12.f40678a)) {
            return t12.f40694q.G(i12);
        }
        w0();
        return t12.a().G(i12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22363h0
    @Y61.k
    public final androidx.compose.ui.layout.K0 I(long j12) {
        LayoutNode.UsageByParent usageByParent;
        T t12 = this.f40834g;
        LayoutNode layoutNode = t12.f40678a;
        LayoutNode.UsageByParent usageByParent2 = layoutNode.f40612F;
        LayoutNode.UsageByParent usageByParent3 = LayoutNode.UsageByParent.f40660d;
        if (usageByParent2 == usageByParent3) {
            layoutNode.q();
        }
        if (U.a(t12.f40678a)) {
            C22404c0 c22404c0 = t12.f40694q;
            c22404c0.f40749k = usageByParent3;
            c22404c0.I(j12);
        }
        LayoutNode layoutNode2 = t12.f40678a;
        LayoutNode layoutNodeK = layoutNode2.K();
        if (layoutNodeK != null) {
            if (this.f40840m != usageByParent3 && !layoutNode2.f40614H) {
                C47949a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            T t13 = layoutNodeK.f40616J;
            int iOrdinal = t13.f40681d.ordinal();
            if (iOrdinal == 0) {
                usageByParent = LayoutNode.UsageByParent.f40658b;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + t13.f40681d);
                }
                usageByParent = LayoutNode.UsageByParent.f40659c;
            }
            this.f40840m = usageByParent;
        } else {
            this.f40840m = usageByParent3;
        }
        E0(j12);
        return this;
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    public final void N(@Y61.k Y41.l<? super InterfaceC22401b, kotlin.G0> lVar) {
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = this.f40834g.f40678a.O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i12 = eVarO.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            lVar.invoke(layoutNodeArr[i13].f40616J.f40693p);
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    public final void Q() {
        LayoutNode.o0(this.f40834g.f40678a, false, 7);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int R(int i12) {
        T t12 = this.f40834g;
        if (U.a(t12.f40678a)) {
            return t12.f40694q.R(i12);
        }
        w0();
        return t12.a().R(i12);
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    @Y61.l
    public final InterfaceC22401b V() {
        T t12;
        LayoutNode layoutNodeK = this.f40834g.f40678a.K();
        if (layoutNodeK == null || (t12 = layoutNodeK.f40616J) == null) {
            return null;
        }
        return t12.f40693p;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int X(int i12) {
        T t12 = this.f40834g;
        if (U.a(t12.f40678a)) {
            return t12.f40694q.X(i12);
        }
        w0();
        return t12.a().X(i12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int b0(int i12) {
        T t12 = this.f40834g;
        if (U.a(t12.f40678a)) {
            return t12.f40694q.b0(i12);
        }
        w0();
        return t12.a().b0(i12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22375n0
    public final int d0(@Y61.k AbstractC22348a abstractC22348a) {
        T t12 = this.f40834g;
        LayoutNode layoutNodeK = t12.f40678a.K();
        LayoutNode.LayoutState layoutState = layoutNodeK != null ? layoutNodeK.f40616J.f40681d : null;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f40651b;
        O o12 = this.f40853z;
        if (layoutState == layoutState2) {
            o12.f40723c = true;
        } else {
            LayoutNode layoutNodeK2 = t12.f40678a.K();
            if ((layoutNodeK2 != null ? layoutNodeK2.f40616J.f40681d : null) == LayoutNode.LayoutState.f40653d) {
                o12.f40724d = true;
            }
        }
        this.f40841n = true;
        int iD02 = t12.a().d0(abstractC22348a);
        this.f40841n = false;
        return iD02;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22375n0, androidx.compose.ui.layout.InterfaceC22391w
    @Y61.l
    /* renamed from: f, reason: from getter */
    public final Object getF40763y() {
        return this.f40847t;
    }

    @Override // androidx.compose.ui.layout.K0
    public final int f0() {
        return this.f40834g.a().f0();
    }

    @Override // androidx.compose.ui.layout.K0
    public final int g0() {
        return this.f40834g.a().g0();
    }

    @Override // androidx.compose.ui.layout.K0
    public final void k0(long j12, float f12, @Y61.l Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar) {
        D0(j12, f12, lVar, null);
    }

    @Override // androidx.compose.ui.layout.K0
    public final void m0(long j12, float f12, @Y61.k C22267c c22267c) {
        D0(j12, f12, null, c22267c);
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    /* renamed from: r, reason: from getter */
    public final boolean getF40848u() {
        return this.f40848u;
    }

    @Y61.k
    public final List<C22418j0> r0() {
        T t12 = this.f40834g;
        t12.f40678a.s0();
        boolean z12 = this.f40821B;
        androidx.compose.runtime.collection.e<C22418j0> eVar = this.f40820A;
        if (!z12) {
            return eVar.f();
        }
        LayoutNode layoutNode = t12.f40678a;
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = layoutNode.O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i12 = eVarO.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            LayoutNode layoutNode2 = layoutNodeArr[i13];
            if (eVar.f38262d <= i13) {
                eVar.b(layoutNode2.f40616J.f40693p);
            } else {
                C22418j0 c22418j0 = layoutNode2.f40616J.f40693p;
                C22418j0[] c22418j0Arr = eVar.f38260b;
                C22418j0 c22418j02 = c22418j0Arr[i13];
                c22418j0Arr[i13] = c22418j0;
            }
        }
        eVar.l(layoutNode.C().size(), eVar.f38262d);
        this.f40821B = false;
        return eVar.f();
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    public final void requestLayout() {
        LayoutNode layoutNode = this.f40834g.f40678a;
        LayoutNode.d dVar = LayoutNode.f40602T;
        layoutNode.n0(false);
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    @Y61.k
    public final AbstractC22399a t() {
        return this.f40853z;
    }

    public final void t0() {
        boolean z12 = this.f40848u;
        this.f40848u = true;
        LayoutNode layoutNode = this.f40834g.f40678a;
        if (!z12) {
            layoutNode.f40615I.f40875b.O1();
            if (layoutNode.G()) {
                LayoutNode.o0(layoutNode, true, 6);
            } else if (layoutNode.f40616J.f40682e) {
                LayoutNode.m0(layoutNode, true, 6);
            }
        }
        C22437t0 c22437t0 = layoutNode.f40615I;
        AbstractC22443w0 abstractC22443w0 = c22437t0.f40875b.f40912q;
        for (AbstractC22443w0 abstractC22443w02 = c22437t0.f40876c; !kotlin.jvm.internal.L.f(abstractC22443w02, abstractC22443w0) && abstractC22443w02 != null; abstractC22443w02 = abstractC22443w02.f40912q) {
            if (abstractC22443w02.f40906I) {
                abstractC22443w02.C1();
            }
        }
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = layoutNode.O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i12 = eVarO.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            LayoutNode layoutNode2 = layoutNodeArr[i13];
            if (layoutNode2.L() != Integer.MAX_VALUE) {
                layoutNode2.f40616J.f40693p.t0();
                LayoutNode.p0(layoutNode2);
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC22432q0
    public final void u(boolean z12) {
        T t12 = this.f40834g;
        if (z12 != t12.a().f40703g) {
            t12.a().f40703g = z12;
            this.f40833N = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void u0() {
        if (this.f40848u) {
            this.f40848u = false;
            T t12 = this.f40834g;
            C22437t0 c22437t0 = t12.f40678a.f40615I;
            AbstractC22443w0 abstractC22443w0 = c22437t0.f40875b.f40912q;
            for (AbstractC22443w0 abstractC22443w02 = c22437t0.f40876c; !kotlin.jvm.internal.L.f(abstractC22443w02, abstractC22443w0) && abstractC22443w02 != null; abstractC22443w02 = abstractC22443w02.f40912q) {
                v.d dVarM1 = abstractC22443w02.m1(A0.g(1048576));
                if (dVarM1 != null && (dVarM1.f42880b.f42883e & 1048576) != 0) {
                    boolean zG2 = A0.g(1048576);
                    v.d dVarJ1 = abstractC22443w02.j1();
                    if (zG2 || (dVarJ1 = dVarJ1.f42884f) != null) {
                        for (v.d dVarM12 = abstractC22443w02.m1(zG2); dVarM12 != null && (dVarM12.f42883e & 1048576) != 0; dVarM12 = dVarM12.f42885g) {
                            if ((dVarM12.f42882d & 1048576) != 0) {
                                AbstractC22425n abstractC22425nB = dVarM12;
                                ?? eVar = 0;
                                while (abstractC22425nB != 0) {
                                    if (abstractC22425nB instanceof H0) {
                                        ((H0) abstractC22425nB).S0();
                                    } else if ((abstractC22425nB.f42882d & 1048576) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                        v.d dVar = abstractC22425nB.f40861q;
                                        int i12 = 0;
                                        abstractC22425nB = abstractC22425nB;
                                        eVar = eVar;
                                        while (dVar != null) {
                                            if ((dVar.f42882d & 1048576) != 0) {
                                                i12++;
                                                eVar = eVar;
                                                if (i12 == 1) {
                                                    abstractC22425nB = dVar;
                                                } else {
                                                    if (eVar == 0) {
                                                        eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                                    }
                                                    if (abstractC22425nB != 0) {
                                                        eVar.b(abstractC22425nB);
                                                        abstractC22425nB = 0;
                                                    }
                                                    eVar.b(dVar);
                                                }
                                            }
                                            dVar = dVar.f42885g;
                                            abstractC22425nB = abstractC22425nB;
                                            eVar = eVar;
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    abstractC22425nB = C22421l.b(eVar);
                                }
                            }
                            if (dVarM12 == dVarJ1) {
                                break;
                            }
                        }
                    }
                }
                if (abstractC22443w02.f40907J != null) {
                    if (abstractC22443w02.f40908K != null) {
                        abstractC22443w02.f40908K = null;
                    }
                    abstractC22443w02.b2(null, false);
                    abstractC22443w02.f40909n.n0(false);
                }
            }
            androidx.compose.runtime.collection.e<LayoutNode> eVarO = t12.f40678a.O();
            LayoutNode[] layoutNodeArr = eVarO.f38260b;
            int i13 = eVarO.f38262d;
            for (int i14 = 0; i14 < i13; i14++) {
                layoutNodeArr[i14].f40616J.f40693p.u0();
            }
        }
    }

    public final void v0() {
        T t12 = this.f40834g;
        if (t12.f40689l > 0) {
            androidx.compose.runtime.collection.e<LayoutNode> eVarO = t12.f40678a.O();
            LayoutNode[] layoutNodeArr = eVarO.f38260b;
            int i12 = eVarO.f38262d;
            for (int i13 = 0; i13 < i12; i13++) {
                LayoutNode layoutNode = layoutNodeArr[i13];
                T t13 = layoutNode.f40616J;
                boolean z12 = t13.f40687j;
                C22418j0 c22418j0 = t13.f40693p;
                if ((z12 || t13.f40688k) && !c22418j0.f40851x) {
                    layoutNode.n0(false);
                }
                c22418j0.v0();
            }
        }
    }

    public final void w0() {
        T t12 = this.f40834g;
        LayoutNode.o0(t12.f40678a, false, 7);
        LayoutNode layoutNode = t12.f40678a;
        LayoutNode layoutNodeK = layoutNode.K();
        if (layoutNodeK == null || layoutNode.f40612F != LayoutNode.UsageByParent.f40660d) {
            return;
        }
        int iOrdinal = layoutNodeK.f40616J.f40681d.ordinal();
        layoutNode.f40612F = iOrdinal != 0 ? iOrdinal != 2 ? layoutNodeK.f40612F : LayoutNode.UsageByParent.f40659c : LayoutNode.UsageByParent.f40658b;
    }

    public final void z0() {
        this.f40827H = true;
        T t12 = this.f40834g;
        LayoutNode layoutNodeK = t12.f40678a.K();
        float f12 = D().f40899B;
        LayoutNode layoutNode = t12.f40678a;
        C22437t0 c22437t0 = layoutNode.f40615I;
        for (AbstractC22443w0 abstractC22443w0 = c22437t0.f40876c; abstractC22443w0 != c22437t0.f40875b; abstractC22443w0 = abstractC22443w0.f40912q) {
            f12 += ((L) abstractC22443w0).f40899B;
        }
        if (f12 != this.f40826G) {
            this.f40826G = f12;
            if (layoutNodeK != null) {
                layoutNodeK.f0();
            }
            if (layoutNodeK != null) {
                layoutNodeK.W();
            }
        }
        if (this.f40848u) {
            layoutNode.f40615I.f40875b.O1();
        } else {
            if (layoutNodeK != null) {
                layoutNodeK.W();
            }
            t0();
            if (this.f40835h && layoutNodeK != null) {
                layoutNodeK.n0(false);
            }
        }
        if (layoutNodeK == null) {
            this.f40837j = 0;
        } else if (!this.f40835h) {
            T t13 = layoutNodeK.f40616J;
            if (t13.f40681d == LayoutNode.LayoutState.f40653d) {
                if (this.f40837j != Integer.MAX_VALUE) {
                    C47949a.b("Place was called on a node which was placed already");
                }
                int i12 = t13.f40686i;
                this.f40837j = i12;
                t13.f40686i = i12 + 1;
            }
        }
        C();
    }
}
