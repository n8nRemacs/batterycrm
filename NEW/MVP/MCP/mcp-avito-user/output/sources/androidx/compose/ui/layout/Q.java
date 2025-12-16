package androidx.compose.ui.layout;

import android.view.ViewGroup;
import androidx.collection.i1;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.E2;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22198x;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.layout.Y0;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.C22404c0;
import androidx.compose.ui.node.C22418j0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22437t0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.a3;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import s0.C47949a;

/* compiled from: SubcomposeLayout.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/Q;", "Landroidx/compose/runtime/x;", "a", "b", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q implements InterfaceC22198x {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LayoutNode f40364b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public androidx.compose.runtime.I f40365c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public a1 f40366d;

    /* renamed from: e, reason: collision with root package name */
    public int f40367e;

    /* renamed from: f, reason: collision with root package name */
    public int f40368f;

    /* renamed from: o, reason: collision with root package name */
    public int f40377o;

    /* renamed from: p, reason: collision with root package name */
    public int f40378p;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.R0<LayoutNode, b> f40369g = i1.b();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.R0<Object, LayoutNode> f40370h = i1.b();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final c f40371i = new c();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a f40372j = new a();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.R0<Object, LayoutNode> f40373k = i1.b();

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final a1.a f40374l = new a1.a(null, 1, null);

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.R0<Object, Y0.a> f40375m = i1.b();

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<Object> f40376n = new androidx.compose.runtime.collection.e<>(new Object[16], 0);

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final String f40379q = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/Q$a;", "Landroidx/compose/ui/layout/Z0;", "Landroidx/compose/ui/layout/k0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a implements Z0, InterfaceC22369k0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f40380b;

        public a() {
            this.f40380b = Q.this.f40371i;
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final float A0(long j12) {
            return this.f40380b.A0(j12);
        }

        @Override // androidx.compose.ui.layout.InterfaceC22369k0
        @Y61.k
        public final InterfaceC22367j0 A1(int i12, int i13, @Y61.k Map map, @Y61.k Y41.l lVar) {
            return this.f40380b.A1(i12, i13, map, lVar);
        }

        @Override // androidx.compose.ui.unit.n
        @F3
        public final float E(long j12) {
            return this.f40380b.E(j12);
        }

        @Override // androidx.compose.ui.layout.InterfaceC22393x
        public final boolean I1() {
            return this.f40380b.I1();
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final float J(int i12) {
            return this.f40380b.J(i12);
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final float K(float f12) {
            return this.f40380b.K(f12);
        }

        @Override // androidx.compose.ui.unit.n
        /* renamed from: K0 */
        public final float getF40390d() {
            return this.f40380b.f40390d;
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final long L(long j12) {
            return this.f40380b.L(j12);
        }

        @Override // androidx.compose.ui.layout.InterfaceC22369k0
        @Y61.k
        public final InterfaceC22367j0 L0(int i12, int i13, @Y61.k Map<AbstractC22348a, Integer> map, @Y61.k Y41.l<? super K0.a, kotlin.G0> lVar) {
            return this.f40380b.A1(i12, i13, map, lVar);
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final float M0(float f12) {
            return this.f40380b.getF40389c() * f12;
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final int O0(long j12) {
            return this.f40380b.O0(j12);
        }

        @Override // androidx.compose.ui.unit.d
        /* renamed from: getDensity */
        public final float getF40389c() {
            return this.f40380b.f40389c;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22393x
        @Y61.k
        /* renamed from: getLayoutDirection */
        public final LayoutDirection getF40524b() {
            return this.f40380b.f40388b;
        }

        @Override // androidx.compose.ui.layout.Z0
        @Y61.k
        public final List<InterfaceC22363h0> h0(@Y61.l Object obj, @Y61.k Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar) {
            Q q12 = Q.this;
            LayoutNode layoutNodeE = q12.f40370h.e(obj);
            LayoutNode layoutNode = q12.f40364b;
            if (layoutNodeE != null && layoutNode.D().indexOf(layoutNodeE) < q12.f40367e) {
                return layoutNodeE.B();
            }
            androidx.compose.runtime.collection.e<Object> eVar = q12.f40376n;
            if (eVar.f38262d < q12.f40368f) {
                C47949a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
            }
            int i12 = eVar.f38262d;
            int i13 = q12.f40368f;
            if (i12 == i13) {
                eVar.b(obj);
            } else {
                Object[] objArr = eVar.f38260b;
                Object obj2 = objArr[i13];
                objArr[i13] = obj;
            }
            q12.f40368f++;
            androidx.collection.R0<Object, LayoutNode> r02 = q12.f40373k;
            if (!r02.b(obj)) {
                q12.f40375m.m(obj, q12.e(obj, pVar));
                if (layoutNode.f40616J.f40681d == LayoutNode.LayoutState.f40653d) {
                    layoutNode.l0(true);
                } else {
                    LayoutNode.m0(layoutNode, true, 6);
                }
            }
            LayoutNode layoutNodeE2 = r02.e(obj);
            if (layoutNodeE2 == null) {
                return C42784z0.f406748b;
            }
            List<C22418j0> listR0 = layoutNodeE2.f40616J.f40693p.r0();
            int size = listR0.size();
            for (int i14 = 0; i14 < size; i14++) {
                listR0.get(i14).f40834g.f40679b = true;
            }
            return listR0;
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final long n(long j12) {
            return this.f40380b.n(j12);
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final long o(float f12) {
            return this.f40380b.o(f12);
        }

        @Override // androidx.compose.ui.unit.n
        @F3
        public final long s(float f12) {
            return this.f40380b.s(f12);
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final int y0(float f12) {
            return this.f40380b.y0(f12);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/Q$b;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public Object f40382a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> f40383b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public E2 f40384c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f40385d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f40386e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public InterfaceC22204y1<Boolean> f40387f;

        public b() {
            throw null;
        }

        public b(Object obj, Y41.p pVar, E2 e22, int i12, C42822w c42822w) {
            e22 = (i12 & 4) != 0 ? null : e22;
            this.f40382a = obj;
            this.f40383b = pVar;
            this.f40384c = e22;
            this.f40387f = C22126m3.g(Boolean.TRUE);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/Q$c;", "Landroidx/compose/ui/layout/Z0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c implements Z0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public LayoutDirection f40388b = LayoutDirection.f42839c;

        /* renamed from: c, reason: collision with root package name */
        public float f40389c;

        /* renamed from: d, reason: collision with root package name */
        public float f40390d;

        public c() {
        }

        @Override // androidx.compose.ui.layout.InterfaceC22369k0
        @Y61.k
        public final InterfaceC22367j0 A1(int i12, int i13, @Y61.k Map map, @Y61.k Y41.l lVar) {
            if ((i12 & (-16777216)) != 0 || ((-16777216) & i13) != 0) {
                C47949a.b("Size(" + i12 + " x " + i13 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new S(i12, i13, map, this, Q.this, lVar);
        }

        @Override // androidx.compose.ui.layout.InterfaceC22393x
        public final boolean I1() {
            LayoutNode.LayoutState layoutState = Q.this.f40364b.f40616J.f40681d;
            return layoutState == LayoutNode.LayoutState.f40654e || layoutState == LayoutNode.LayoutState.f40652c;
        }

        @Override // androidx.compose.ui.unit.n
        /* renamed from: K0, reason: from getter */
        public final float getF40390d() {
            return this.f40390d;
        }

        @Override // androidx.compose.ui.unit.d
        /* renamed from: getDensity, reason: from getter */
        public final float getF40389c() {
            return this.f40389c;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22393x
        @Y61.k
        /* renamed from: getLayoutDirection, reason: from getter */
        public final LayoutDirection getF40524b() {
            return this.f40388b;
        }

        @Override // androidx.compose.ui.layout.Z0
        @Y61.k
        public final List<InterfaceC22363h0> h0(@Y61.l Object obj, @Y61.k Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar) {
            Q q12 = Q.this;
            q12.b();
            LayoutNode layoutNode = q12.f40364b;
            LayoutNode.LayoutState layoutState = layoutNode.f40616J.f40681d;
            LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f40651b;
            if (layoutState != layoutState2 && layoutState != LayoutNode.LayoutState.f40653d && layoutState != LayoutNode.LayoutState.f40652c && layoutState != LayoutNode.LayoutState.f40654e) {
                C47949a.b("subcompose can only be used inside the measure or layout blocks");
            }
            androidx.collection.R0<Object, LayoutNode> r02 = q12.f40370h;
            LayoutNode layoutNodeE = r02.e(obj);
            if (layoutNodeE == null) {
                layoutNodeE = q12.f40373k.k(obj);
                if (layoutNodeE != null) {
                    if (q12.f40378p <= 0) {
                        C47949a.b("Check failed.");
                    }
                    q12.f40378p--;
                } else {
                    layoutNodeE = q12.h(obj);
                    if (layoutNodeE == null) {
                        int i12 = q12.f40367e;
                        LayoutNode layoutNode2 = new LayoutNode(true, 0, 2, null);
                        layoutNode.f40644t = true;
                        layoutNode.V(i12, layoutNode2);
                        layoutNode.f40644t = false;
                        layoutNodeE = layoutNode2;
                    }
                }
                r02.m(obj, layoutNodeE);
            }
            LayoutNode layoutNode3 = layoutNodeE;
            if (C42745f0.K(q12.f40367e, layoutNode.D()) != layoutNode3) {
                int iIndexOf = layoutNode.D().indexOf(layoutNode3);
                if (iIndexOf < q12.f40367e) {
                    C47949a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                }
                int i13 = q12.f40367e;
                if (i13 != iIndexOf) {
                    layoutNode.f40644t = true;
                    layoutNode.d0(iIndexOf, i13, 1);
                    layoutNode.f40644t = false;
                }
            }
            q12.f40367e++;
            q12.g(layoutNode3, obj, pVar);
            return (layoutState == layoutState2 || layoutState == LayoutNode.LayoutState.f40653d) ? layoutNode3.B() : layoutNode3.A();
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/layout/Q$e", "Landroidx/compose/ui/layout/Y0$a;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements Y0.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f40393b;

        public e(Object obj) {
            this.f40393b = obj;
        }

        @Override // androidx.compose.ui.layout.Y0.a
        public final void a(int i12, long j12) {
            Q q12 = Q.this;
            LayoutNode layoutNodeE = q12.f40373k.e(this.f40393b);
            if (layoutNodeE == null || !layoutNodeE.m()) {
                return;
            }
            int size = layoutNodeE.C().size();
            if (i12 < 0 || i12 >= size) {
                C47949a.d("Index (" + i12 + ") is out of bound of [0, " + size + ')');
            }
            if (layoutNodeE.r()) {
                C47949a.a("Pre-measure called on node that is not placed");
            }
            LayoutNode layoutNode = q12.f40364b;
            layoutNode.f40644t = true;
            ((AndroidComposeView) androidx.compose.ui.node.S.a(layoutNodeE)).x(layoutNodeE.C().get(i12), j12);
            layoutNode.f40644t = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.v$d] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v12 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.v$d] */
        /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.collection.e] */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.e] */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // androidx.compose.ui.layout.Y0.a
        public final void b(Y41.l lVar) {
            C22437t0 c22437t0;
            v.d dVar;
            LayoutNode layoutNodeE = Q.this.f40373k.e(this.f40393b);
            if (layoutNodeE == null || (c22437t0 = layoutNodeE.f40615I) == null || (dVar = c22437t0.f40878e) == null) {
                return;
            }
            if (!dVar.f42880b.f42893o) {
                C47949a.b("visitSubtreeIf called on an unattached node");
            }
            androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
            v.d dVar2 = dVar.f42880b;
            v.d dVar3 = dVar2.f42885g;
            if (dVar3 == null) {
                C22421l.a(eVar, dVar2);
            } else {
                eVar.b(dVar3);
            }
            while (true) {
                int i12 = eVar.f38262d;
                if (i12 == 0) {
                    return;
                }
                v.d dVar4 = (v.d) eVar.k(i12 - 1);
                if ((dVar4.f42883e & 262144) != 0) {
                    for (v.d dVar5 = dVar4; dVar5 != null; dVar5 = dVar5.f42885g) {
                        if ((dVar5.f42882d & 262144) != 0) {
                            AbstractC22425n abstractC22425nB = dVar5;
                            ?? eVar2 = 0;
                            while (abstractC22425nB != 0) {
                                if (abstractC22425nB instanceof TraversableNode) {
                                    TraversableNode traversableNode = (TraversableNode) abstractC22425nB;
                                    TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(traversableNode.getF39003r()) ? (TraversableNode.Companion.TraverseDescendantsAction) lVar.invoke(traversableNode) : TraversableNode.Companion.TraverseDescendantsAction.f40695b;
                                    if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.f40697d) {
                                        return;
                                    }
                                    if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.f40696c) {
                                        break;
                                    }
                                } else if ((abstractC22425nB.f42882d & 262144) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                    v.d dVar6 = abstractC22425nB.f40861q;
                                    int i13 = 0;
                                    abstractC22425nB = abstractC22425nB;
                                    eVar2 = eVar2;
                                    while (dVar6 != null) {
                                        if ((dVar6.f42882d & 262144) != 0) {
                                            i13++;
                                            eVar2 = eVar2;
                                            if (i13 == 1) {
                                                abstractC22425nB = dVar6;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                                }
                                                if (abstractC22425nB != 0) {
                                                    eVar2.b(abstractC22425nB);
                                                    abstractC22425nB = 0;
                                                }
                                                eVar2.b(dVar6);
                                            }
                                        }
                                        dVar6 = dVar6.f42885g;
                                        abstractC22425nB = abstractC22425nB;
                                        eVar2 = eVar2;
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                abstractC22425nB = C22421l.b(eVar2);
                            }
                        }
                    }
                }
                C22421l.a(eVar, dVar4);
            }
        }

        @Override // androidx.compose.ui.layout.Y0.a
        public final int d() {
            LayoutNode layoutNodeE = Q.this.f40373k.e(this.f40393b);
            if (layoutNodeE != null) {
                return layoutNodeE.C().size();
            }
            return 0;
        }

        @Override // androidx.compose.ui.layout.Y0.a
        public final void dispose() {
            Q q12 = Q.this;
            q12.b();
            LayoutNode layoutNodeK = q12.f40373k.k(this.f40393b);
            if (layoutNodeK != null) {
                if (q12.f40378p <= 0) {
                    C47949a.b("No pre-composed items to dispose");
                }
                LayoutNode layoutNode = q12.f40364b;
                int iIndexOf = layoutNode.D().indexOf(layoutNodeK);
                if (iIndexOf < layoutNode.D().size() - q12.f40378p) {
                    C47949a.b("Item is not in pre-composed item range");
                }
                q12.f40377o++;
                q12.f40378p--;
                int size = (layoutNode.D().size() - q12.f40378p) - q12.f40377o;
                layoutNode.f40644t = true;
                layoutNode.d0(iIndexOf, size, 1);
                layoutNode.f40644t = false;
                q12.a(size);
            }
        }
    }

    public Q(@Y61.k LayoutNode layoutNode, @Y61.k a1 a1Var) {
        this.f40364b = layoutNode;
        this.f40366d = a1Var;
    }

    public final void a(int i12) {
        boolean z12 = false;
        this.f40377o = 0;
        LayoutNode layoutNode = this.f40364b;
        List<LayoutNode> listD = layoutNode.D();
        int size = (listD.size() - this.f40378p) - 1;
        if (i12 <= size) {
            a1.a aVar = this.f40374l;
            aVar.clear();
            androidx.collection.R0<LayoutNode, b> r02 = this.f40369g;
            androidx.collection.P0<Object> p02 = aVar.f40438b;
            if (i12 <= size) {
                int i13 = i12;
                while (true) {
                    p02.b(r02.e(listD.get(i13)).f40382a);
                    if (i13 == size) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.f40366d.a(aVar);
            AbstractC22167l.f38720e.getClass();
            AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
            Y41.l<Object, kotlin.G0> f38696h = abstractC22167lA != null ? abstractC22167lA.getF38713f() : null;
            AbstractC22167l abstractC22167lB = AbstractC22167l.a.b(abstractC22167lA);
            boolean z13 = false;
            while (size >= i12) {
                try {
                    LayoutNode layoutNode2 = listD.get(size);
                    b bVarE = r02.e(layoutNode2);
                    Object obj = bVarE.f40382a;
                    if (p02.a(obj)) {
                        this.f40377o++;
                        if (((Boolean) ((C22082i3) bVarE.f40387f).getF42167b()).booleanValue()) {
                            androidx.compose.ui.node.T t12 = layoutNode2.f40616J;
                            C22418j0 c22418j0 = t12.f40693p;
                            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.f40660d;
                            c22418j0.f40840m = usageByParent;
                            C22404c0 c22404c0 = t12.f40694q;
                            if (c22404c0 != null) {
                                c22404c0.f40749k = usageByParent;
                            }
                            ((C22082i3) bVarE.f40387f).setValue(Boolean.FALSE);
                            z13 = true;
                        }
                    } else {
                        layoutNode.f40644t = true;
                        r02.k(layoutNode2);
                        E2 e22 = bVarE.f40384c;
                        if (e22 != null) {
                            e22.dispose();
                        }
                        layoutNode.j0(size, 1);
                        layoutNode.f40644t = false;
                    }
                    this.f40370h.k(obj);
                    size--;
                } catch (Throwable th2) {
                    AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, f38696h);
                    throw th2;
                }
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
            AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, f38696h);
            z12 = z13;
        }
        if (z12) {
            AbstractC22167l.f38720e.getClass();
            AbstractC22167l.a.f();
        }
        b();
    }

    public final void b() {
        int size = this.f40364b.D().size();
        androidx.collection.R0<LayoutNode, b> r02 = this.f40369g;
        if (r02.f25725e != size) {
            C47949a.a("Inconsistency between the count of nodes tracked by the state (" + r02.f25725e + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((size - this.f40377o) - this.f40378p < 0) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(size, "Incorrect state. Total children ", ". Reusable children ");
            sbJ.append(this.f40377o);
            sbJ.append(". Precomposed children ");
            sbJ.append(this.f40378p);
            C47949a.a(sbJ.toString());
        }
        androidx.collection.R0<Object, LayoutNode> r03 = this.f40373k;
        if (r03.f25725e == this.f40378p) {
            return;
        }
        C47949a.a("Incorrect state. Precomposed children " + this.f40378p + ". Map size " + r03.f25725e);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // androidx.compose.runtime.InterfaceC22198x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.ui.node.LayoutNode r1 = r0.f40364b
            r2 = 1
            r1.f40644t = r2
            androidx.collection.R0<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.layout.Q$b> r2 = r0.f40369g
            java.lang.Object[] r3 = r2.f25723c
            long[] r4 = r2.f25721a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            androidx.compose.ui.layout.Q$b r13 = (androidx.compose.ui.layout.Q.b) r13
            androidx.compose.runtime.E2 r13 = r13.f40384c
            if (r13 == 0) goto L47
            r13.dispose()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r1.i0()
            r1.f40644t = r6
            r2.g()
            androidx.collection.R0<java.lang.Object, androidx.compose.ui.node.LayoutNode> r1 = r0.f40370h
            r1.g()
            r0.f40378p = r6
            r0.f40377o = r6
            androidx.collection.R0<java.lang.Object, androidx.compose.ui.node.LayoutNode> r1 = r0.f40373k
            r1.g()
            r17.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.Q.c():void");
    }

    public final void d(boolean z12) {
        this.f40378p = 0;
        this.f40373k.g();
        List<LayoutNode> listD = this.f40364b.D();
        int size = listD.size();
        if (this.f40377o != size) {
            this.f40377o = size;
            AbstractC22167l.f38720e.getClass();
            AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
            Y41.l<Object, kotlin.G0> f38696h = abstractC22167lA != null ? abstractC22167lA.getF38713f() : null;
            AbstractC22167l abstractC22167lB = AbstractC22167l.a.b(abstractC22167lA);
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    LayoutNode layoutNode = listD.get(i12);
                    b bVarE = this.f40369g.e(layoutNode);
                    if (bVarE != null && ((Boolean) ((C22082i3) bVarE.f40387f).getF42167b()).booleanValue()) {
                        androidx.compose.ui.node.T t12 = layoutNode.f40616J;
                        C22418j0 c22418j0 = t12.f40693p;
                        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.f40660d;
                        c22418j0.f40840m = usageByParent;
                        C22404c0 c22404c0 = t12.f40694q;
                        if (c22404c0 != null) {
                            c22404c0.f40749k = usageByParent;
                        }
                        if (z12) {
                            E2 e22 = bVarE.f40384c;
                            if (e22 != null) {
                                e22.deactivate();
                            }
                            bVarE.f40387f = C22126m3.g(Boolean.FALSE);
                        } else {
                            ((C22082i3) bVarE.f40387f).setValue(Boolean.FALSE);
                        }
                        bVarE.f40382a = V0.f40416a;
                    }
                } catch (Throwable th2) {
                    AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, f38696h);
                    throw th2;
                }
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
            AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, f38696h);
            this.f40370h.g();
        }
        b();
    }

    @Y61.k
    public final Y0.a e(@Y61.l Object obj, @Y61.k Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar) {
        LayoutNode layoutNode = this.f40364b;
        if (!layoutNode.m()) {
            return new d();
        }
        b();
        if (!this.f40370h.c(obj)) {
            this.f40375m.k(obj);
            androidx.collection.R0<Object, LayoutNode> r02 = this.f40373k;
            LayoutNode layoutNodeE = r02.e(obj);
            if (layoutNodeE == null) {
                layoutNodeE = h(obj);
                if (layoutNodeE != null) {
                    int iIndexOf = layoutNode.D().indexOf(layoutNodeE);
                    int size = layoutNode.D().size();
                    layoutNode.f40644t = true;
                    layoutNode.d0(iIndexOf, size, 1);
                    layoutNode.f40644t = false;
                    this.f40378p++;
                } else {
                    int size2 = layoutNode.D().size();
                    LayoutNode layoutNode2 = new LayoutNode(true, 0, 2, null);
                    layoutNode.f40644t = true;
                    layoutNode.V(size2, layoutNode2);
                    layoutNode.f40644t = false;
                    this.f40378p++;
                    layoutNodeE = layoutNode2;
                }
                r02.m(obj, layoutNodeE);
            }
            g(layoutNodeE, obj, pVar);
        }
        return new e(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC22198x
    public final void f() {
        d(false);
    }

    public final void g(LayoutNode layoutNode, Object obj, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar) {
        boolean z12;
        androidx.collection.R0<LayoutNode, b> r02 = this.f40369g;
        b bVarE = r02.e(layoutNode);
        if (bVarE == null) {
            C22372m.f40488a.getClass();
            bVarE = new b(obj, C22372m.f40489b, null, 4, null);
            r02.m(layoutNode, bVarE);
        }
        b bVar = bVarE;
        E2 e22 = bVar.f40384c;
        boolean zA7 = e22 != null ? e22.A7() : true;
        if (bVar.f40383b != pVar || zA7 || bVar.f40385d) {
            bVar.f40383b = pVar;
            AbstractC22167l.f38720e.getClass();
            AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
            Y41.l<Object, kotlin.G0> f38696h = abstractC22167lA != null ? abstractC22167lA.getF38713f() : null;
            AbstractC22167l abstractC22167lB = AbstractC22167l.a.b(abstractC22167lA);
            try {
                LayoutNode layoutNode2 = this.f40364b;
                layoutNode2.f40644t = true;
                Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar2 = bVar.f40383b;
                E2 m12 = bVar.f40384c;
                androidx.compose.runtime.I i12 = this.f40365c;
                if (i12 == null) {
                    C47949a.c("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                boolean z13 = bVar.f40386e;
                C22096n c22096n = new C22096n(-1750409193, new V(bVar, pVar2), true);
                if (m12 == null || m12.getF38044v()) {
                    ViewGroup.LayoutParams layoutParams = a3.f41378a;
                    androidx.compose.ui.node.b1 b1Var = new androidx.compose.ui.node.b1(layoutNode);
                    Object obj2 = androidx.compose.runtime.N.f38052a;
                    z12 = z13;
                    m12 = new androidx.compose.runtime.M(i12, b1Var, null, 4, null);
                } else {
                    z12 = z13;
                }
                if (z12) {
                    m12.g(c22096n);
                } else {
                    m12.z7(c22096n);
                }
                bVar.f40384c = m12;
                bVar.f40386e = false;
                layoutNode2.f40644t = false;
                kotlin.G0 g02 = kotlin.G0.f406611a;
                AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, f38696h);
                bVar.f40385d = false;
            } catch (Throwable th2) {
                AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, f38696h);
                throw th2;
            }
        }
    }

    public final LayoutNode h(Object obj) {
        androidx.collection.R0<LayoutNode, b> r02;
        int i12;
        if (this.f40377o == 0) {
            return null;
        }
        LayoutNode layoutNode = this.f40364b;
        List<LayoutNode> listD = layoutNode.D();
        int size = listD.size() - this.f40378p;
        int i13 = size - this.f40377o;
        int i14 = size - 1;
        int i15 = i14;
        while (true) {
            r02 = this.f40369g;
            if (i15 < i13) {
                i12 = -1;
                break;
            }
            if (kotlin.jvm.internal.L.f(r02.e(listD.get(i15)).f40382a, obj)) {
                i12 = i15;
                break;
            }
            i15--;
        }
        if (i12 == -1) {
            while (i14 >= i13) {
                b bVarE = r02.e(listD.get(i14));
                Object obj2 = bVarE.f40382a;
                if (obj2 == V0.f40416a || this.f40366d.b(obj, obj2)) {
                    bVarE.f40382a = obj;
                    i15 = i14;
                    i12 = i15;
                    break;
                }
                i14--;
            }
            i15 = i14;
        }
        if (i12 == -1) {
            return null;
        }
        if (i15 != i13) {
            layoutNode.f40644t = true;
            layoutNode.d0(i15, i13, 1);
            layoutNode.f40644t = false;
        }
        this.f40377o--;
        LayoutNode layoutNode2 = listD.get(i13);
        b bVarE2 = r02.e(layoutNode2);
        bVarE2.f40387f = C22126m3.g(Boolean.TRUE);
        bVarE2.f40386e = true;
        bVarE2.f40385d = true;
        return layoutNode2;
    }

    @Override // androidx.compose.runtime.InterfaceC22198x
    public final void i() {
        d(true);
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/layout/Q$d", "Landroidx/compose/ui/layout/Y0$a;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements Y0.a {
        @Override // androidx.compose.ui.layout.Y0.a
        public final void dispose() {
        }
    }
}
