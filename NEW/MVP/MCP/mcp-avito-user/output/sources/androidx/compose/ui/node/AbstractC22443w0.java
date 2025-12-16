package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.ui.graphics.C22250e0;
import androidx.compose.ui.graphics.C22278p0;
import androidx.compose.ui.graphics.InterfaceC22276o0;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.graphics.r1;
import androidx.compose.ui.input.pointer.InterfaceC22334l;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.node.X0;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import androidx.compose.ui.v;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import l0.g;
import l0.n;
import s0.C47949a;

/* compiled from: NodeCoordinator.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/w0;", "Landroidx/compose/ui/node/X;", "Landroidx/compose/ui/layout/h0;", "Landroidx/compose/ui/layout/A;", "Landroidx/compose/ui/node/K0;", "e", "f", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22443w0 extends X implements InterfaceC22363h0, androidx.compose.ui.layout.A, K0 {

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public static final e f40890L = new e(null);

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<AbstractC22443w0, kotlin.G0> f40891M = d.f40923l;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<AbstractC22443w0, kotlin.G0> f40892N = c.f40922l;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.ui.graphics.c1 f40893O = new androidx.compose.ui.graphics.c1();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public static final E f40894P = new E();

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public static final float[] f40895Q = androidx.compose.ui.graphics.A0.b();

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public static final a f40896R = new a();

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public static final b f40897S = new b();

    /* renamed from: A, reason: collision with root package name */
    public long f40898A;

    /* renamed from: B, reason: collision with root package name */
    public float f40899B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public l0.e f40900C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public E f40901D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public C22267c f40902E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.graphics.M f40903F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super androidx.compose.ui.graphics.M, ? super C22267c, kotlin.G0> f40904G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final Y41.a<kotlin.G0> f40905H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f40906I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public I0 f40907J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public C22267c f40908K;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final LayoutNode f40909n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f40910o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f40911p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public AbstractC22443w0 f40912q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public AbstractC22443w0 f40913r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f40914s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f40915t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super InterfaceC22276o0, kotlin.G0> f40916u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.unit.d f40917v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public LayoutDirection f40918w;

    /* renamed from: x, reason: collision with root package name */
    public float f40919x = 0.8f;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public InterfaceC22367j0 f40920y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public androidx.collection.M0<AbstractC22348a> f40921z;

    /* compiled from: NodeCoordinator.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/node/w0$a", "Landroidx/compose/ui/node/w0$f;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.w0$a */
    public static final class a implements f {
        @Override // androidx.compose.ui.node.AbstractC22443w0.f
        public final int a() {
            return 16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.runtime.collection.e] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.runtime.collection.e] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.v$d] */
        /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.v$d] */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [androidx.compose.ui.v$d] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // androidx.compose.ui.node.AbstractC22443w0.f
        public final boolean b(v.d dVar) {
            ?? eVar = 0;
            while (dVar != 0) {
                if (dVar instanceof P0) {
                    ((P0) dVar).V();
                } else if ((dVar.f42882d & 16) != 0 && (dVar instanceof AbstractC22425n)) {
                    v.d dVar2 = dVar.f40861q;
                    int i12 = 0;
                    eVar = eVar;
                    dVar = dVar;
                    while (dVar2 != null) {
                        if ((dVar2.f42882d & 16) != 0) {
                            i12++;
                            eVar = eVar;
                            if (i12 == 1) {
                                dVar = dVar2;
                            } else {
                                if (eVar == 0) {
                                    eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                }
                                if (dVar != 0) {
                                    eVar.b(dVar);
                                    dVar = 0;
                                }
                                eVar.b(dVar2);
                            }
                        }
                        dVar2 = dVar2.f42885g;
                        eVar = eVar;
                        dVar = dVar;
                    }
                    if (i12 == 1) {
                    }
                }
                dVar = C22421l.b(eVar);
            }
            return false;
        }

        @Override // androidx.compose.ui.node.AbstractC22443w0.f
        public final boolean c(LayoutNode layoutNode) {
            return true;
        }

        @Override // androidx.compose.ui.node.AbstractC22443w0.f
        public final void d(LayoutNode layoutNode, long j12, C22444x c22444x, int i12, boolean z12) {
            layoutNode.P(j12, c22444x, i12, z12);
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/node/w0$b", "Landroidx/compose/ui/node/w0$f;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.w0$b */
    public static final class b implements f {
        @Override // androidx.compose.ui.node.AbstractC22443w0.f
        public final int a() {
            return 8;
        }

        @Override // androidx.compose.ui.node.AbstractC22443w0.f
        public final boolean b(v.d dVar) {
            return false;
        }

        @Override // androidx.compose.ui.node.AbstractC22443w0.f
        public final boolean c(LayoutNode layoutNode) {
            androidx.compose.ui.semantics.l lVarQ = layoutNode.Q();
            boolean z12 = false;
            if (lVarQ != null && lVarQ.f41789e) {
                z12 = true;
            }
            return !z12;
        }

        @Override // androidx.compose.ui.node.AbstractC22443w0.f
        public final void d(LayoutNode layoutNode, long j12, C22444x c22444x, int i12, boolean z12) {
            layoutNode.U(j12, c22444x, z12);
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/w0;", "coordinator", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/w0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.w0$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<AbstractC22443w0, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f40922l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(AbstractC22443w0 abstractC22443w0) {
            I0 i02 = abstractC22443w0.f40907J;
            if (i02 != null) {
                i02.invalidate();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/w0;", "coordinator", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/w0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.w0$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<AbstractC22443w0, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f40923l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(AbstractC22443w0 abstractC22443w0) {
            AbstractC22443w0 abstractC22443w02 = abstractC22443w0;
            if (abstractC22443w02.n1() && abstractC22443w02.c2(true)) {
                LayoutNode layoutNode = abstractC22443w02.f40909n;
                T t12 = layoutNode.f40616J;
                if (t12.f40689l > 0) {
                    if (t12.f40688k || t12.f40687j) {
                        layoutNode.n0(false);
                    }
                    t12.f40693p.v0();
                }
                J0 j0A = S.a(layoutNode);
                j0A.getRectManager().e(layoutNode);
                ((AndroidComposeView) j0A).K(layoutNode);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/w0$e;", "", "<init>", "()V", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/c1;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/c1;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/w0;", "Lkotlin/G0;", "onCommitAffectingLayer", "LY41/l;", "onCommitAffectingLayerParams", "Landroidx/compose/ui/node/E;", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/E;", "Landroidx/compose/ui/graphics/A0;", "tmpMatrix", "[F", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.w0$e */
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/w0$f;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.w0$f */
    public interface f {
        int a();

        boolean b(@Y61.k v.d dVar);

        boolean c(@Y61.k LayoutNode layoutNode);

        void d(@Y61.k LayoutNode layoutNode, long j12, @Y61.k C22444x c22444x, int i12, boolean z12);
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/graphics/M;", "canvas", "Landroidx/compose/ui/graphics/layer/c;", "parentLayer", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/M;Landroidx/compose/ui/graphics/layer/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.w0$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.graphics.M, C22267c, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC22443w0 f40924l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f40925m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar, AbstractC22443w0 abstractC22443w0) {
            super(2);
            this.f40924l = abstractC22443w0;
            this.f40925m = aVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.ui.graphics.M m12, C22267c c22267c) {
            androidx.compose.ui.graphics.M m13 = m12;
            C22267c c22267c2 = c22267c;
            AbstractC22443w0 abstractC22443w0 = this.f40924l;
            if (abstractC22443w0.f40909n.r()) {
                abstractC22443w0.f40903F = m13;
                abstractC22443w0.f40902E = c22267c2;
                S.a(abstractC22443w0.f40909n).getSnapshotObserver().b(abstractC22443w0, AbstractC22443w0.f40892N, this.f40925m);
                abstractC22443w0.f40906I = false;
            } else {
                abstractC22443w0.f40906I = true;
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.w0$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            AbstractC22443w0 abstractC22443w0 = AbstractC22443w0.this;
            abstractC22443w0.U0(abstractC22443w0.f40903F, abstractC22443w0.f40902E);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.w0$i */
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            AbstractC22443w0 abstractC22443w0 = AbstractC22443w0.this.f40913r;
            if (abstractC22443w0 != null) {
                abstractC22443w0.C1();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.w0$j */
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v.d f40929m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ f f40930n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f40931o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C22444x f40932p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f40933q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f40934r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ float f40935s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f40936t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(v.d dVar, f fVar, long j12, C22444x c22444x, int i12, boolean z12, float f12, boolean z13) {
            super(0);
            this.f40929m = dVar;
            this.f40930n = fVar;
            this.f40931o = j12;
            this.f40932p = c22444x;
            this.f40933q = i12;
            this.f40934r = z12;
            this.f40935s = f12;
            this.f40936t = z13;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            v.d dVarA = C22447y0.a(this.f40929m, this.f40930n.a());
            e eVar = AbstractC22443w0.f40890L;
            AbstractC22443w0.this.Q1(dVarA, this.f40930n, this.f40931o, this.f40932p, this.f40933q, this.f40934r, this.f40935s, this.f40936t);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.w0$k */
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC22276o0, kotlin.G0> f40937l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar) {
            super(0);
            this.f40937l = lVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            androidx.compose.ui.graphics.c1 c1Var = AbstractC22443w0.f40893O;
            this.f40937l.invoke(c1Var);
            c1Var.f39376w = c1Var.f39369p.a(c1Var.f39372s, c1Var.f39374u, c1Var.f39373t);
            return kotlin.G0.f406611a;
        }
    }

    public AbstractC22443w0(@Y61.k LayoutNode layoutNode) {
        this.f40909n = layoutNode;
        this.f40917v = layoutNode.f40608B;
        this.f40918w = layoutNode.f40609C;
        androidx.compose.ui.unit.q.f42862b.getClass();
        this.f40898A = 0L;
        this.f40905H = new i();
    }

    public static AbstractC22443w0 Y1(androidx.compose.ui.layout.A a12) {
        AbstractC22443w0 abstractC22443w0;
        androidx.compose.ui.layout.X x12 = a12 instanceof androidx.compose.ui.layout.X ? (androidx.compose.ui.layout.X) a12 : null;
        return (x12 == null || (abstractC22443w0 = x12.f40423b.f40731n) == null) ? (AbstractC22443w0) a12 : abstractC22443w0;
    }

    @Override // androidx.compose.ui.layout.A
    public final long A(long j12) {
        if (!j1().f42893o) {
            C47949a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        androidx.compose.ui.layout.A aC2 = androidx.compose.ui.layout.B.c(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) S.a(this.f40909n);
        androidComposeView.F();
        return G1(aC2, l0.g.i(androidx.compose.ui.graphics.A0.c(j12, androidComposeView.f40993U), androidx.compose.ui.layout.B.e(aC2)), true);
    }

    @Override // androidx.compose.ui.layout.A
    public final void B(@Y61.k androidx.compose.ui.layout.A a12, @Y61.k float[] fArr) {
        AbstractC22443w0 abstractC22443w0Y1 = Y1(a12);
        abstractC22443w0Y1.K1();
        AbstractC22443w0 abstractC22443w0B1 = b1(abstractC22443w0Y1);
        androidx.compose.ui.graphics.A0.e(fArr);
        abstractC22443w0Y1.a2(abstractC22443w0B1, fArr);
        Z1(abstractC22443w0B1, fArr);
    }

    @Override // androidx.compose.ui.node.X
    @Y61.l
    public final X B0() {
        return this.f40913r;
    }

    public final void C1() {
        I0 i02 = this.f40907J;
        if (i02 != null) {
            i02.invalidate();
            return;
        }
        AbstractC22443w0 abstractC22443w0 = this.f40913r;
        if (abstractC22443w0 != null) {
            abstractC22443w0.C1();
        }
    }

    @Override // androidx.compose.ui.node.X
    /* renamed from: D0, reason: from getter */
    public final long getF40732o() {
        return this.f40898A;
    }

    public final boolean D1() {
        if (this.f40907J != null && this.f40919x <= 0.0f) {
            return true;
        }
        AbstractC22443w0 abstractC22443w0 = this.f40913r;
        if (abstractC22443w0 != null) {
            return abstractC22443w0.D1();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.X
    public final void F0() {
        C22267c c22267c = this.f40908K;
        if (c22267c != null) {
            m0(this.f40898A, this.f40899B, c22267c);
        } else {
            k0(this.f40898A, this.f40899B, this.f40916u);
        }
    }

    public final long G1(@Y61.k androidx.compose.ui.layout.A a12, long j12, boolean z12) {
        if (a12 instanceof androidx.compose.ui.layout.X) {
            ((androidx.compose.ui.layout.X) a12).f40423b.f40731n.K1();
            g.a aVar = l0.g.f413384b;
            return ((androidx.compose.ui.layout.X) a12).c(this, j12 ^ (-9223372034707292160L), z12) ^ (-9223372034707292160L);
        }
        AbstractC22443w0 abstractC22443w0Y1 = Y1(a12);
        abstractC22443w0Y1.K1();
        AbstractC22443w0 abstractC22443w0B1 = b1(abstractC22443w0Y1);
        while (abstractC22443w0Y1 != abstractC22443w0B1) {
            I0 i02 = abstractC22443w0Y1.f40907J;
            if (i02 != null) {
                j12 = i02.c(j12, false);
            }
            if (z12 || !abstractC22443w0Y1.f40703g) {
                j12 = androidx.compose.ui.unit.r.b(j12, abstractC22443w0Y1.f40898A);
            }
            abstractC22443w0Y1 = abstractC22443w0Y1.f40913r;
        }
        return Q0(abstractC22443w0B1, j12, z12);
    }

    public final void H0(AbstractC22443w0 abstractC22443w0, l0.e eVar, boolean z12) {
        if (abstractC22443w0 == this) {
            return;
        }
        AbstractC22443w0 abstractC22443w02 = this.f40913r;
        if (abstractC22443w02 != null) {
            abstractC22443w02.H0(abstractC22443w0, eVar, z12);
        }
        long j12 = this.f40898A;
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        float f12 = (int) (j12 >> 32);
        eVar.f413380a -= f12;
        eVar.f413382c -= f12;
        float f13 = (int) (j12 & 4294967295L);
        eVar.f413381b -= f13;
        eVar.f413383d -= f13;
        I0 i02 = this.f40907J;
        if (i02 != null) {
            i02.i(eVar, true);
            if (this.f40915t && z12) {
                long j13 = this.f40347d;
                eVar.a(0.0f, 0.0f, (int) (j13 >> 32), (int) (j13 & 4294967295L));
            }
        }
    }

    public final void H1() {
        if (this.f40907J != null || this.f40916u == null) {
            return;
        }
        I0 i0E = J0.e(S.a(this.f40909n), f1(), this.f40905H, this.f40908K, false, 8);
        i0E.j(this.f40347d);
        i0E.f(this.f40898A);
        i0E.invalidate();
        this.f40907J = i0E;
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: K0 */
    public final float getF40390d() {
        return this.f40909n.f40608B.getF40390d();
    }

    public final void K1() {
        this.f40909n.f40616J.b();
    }

    @Override // androidx.compose.ui.layout.A
    public final long M(long j12) {
        if (!j1().f42893o) {
            C47949a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return G1(androidx.compose.ui.layout.B.c(this), ((AndroidComposeView) S.a(this.f40909n)).M(j12), true);
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
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void M1() {
        v.d dVarJ1;
        v.d dVarM1 = m1(A0.g(128));
        if (dVarM1 == null || (dVarM1.f42880b.f42883e & 128) == 0) {
            return;
        }
        AbstractC22167l.f38720e.getClass();
        AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
        Y41.l<Object, kotlin.G0> lVarE = abstractC22167lA != null ? abstractC22167lA.getF38696h() : null;
        AbstractC22167l abstractC22167lB = AbstractC22167l.a.b(abstractC22167lA);
        try {
            boolean zG2 = A0.g(128);
            if (!zG2) {
                dVarJ1 = j1().f42884f;
                if (dVarJ1 == null) {
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
                AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, lVarE);
            }
            dVarJ1 = j1();
            for (v.d dVarM12 = m1(zG2); dVarM12 != null && (dVarM12.f42883e & 128) != 0; dVarM12 = dVarM12.f42885g) {
                if ((dVarM12.f42882d & 128) != 0) {
                    ?? eVar = 0;
                    AbstractC22425n abstractC22425nB = dVarM12;
                    while (abstractC22425nB != 0) {
                        if (abstractC22425nB instanceof F) {
                            ((F) abstractC22425nB).M(this.f40347d);
                        } else if ((abstractC22425nB.f42882d & 128) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                            v.d dVar = abstractC22425nB.f40861q;
                            int i12 = 0;
                            abstractC22425nB = abstractC22425nB;
                            eVar = eVar;
                            while (dVar != null) {
                                if ((dVar.f42882d & 128) != 0) {
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
            kotlin.G0 g022 = kotlin.G0.f406611a;
            AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, lVarE);
        } catch (Throwable th2) {
            AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, lVarE);
            throw th2;
        }
    }

    @Override // androidx.compose.ui.layout.A
    public final long O(long j12) {
        long jY2 = y(j12);
        AndroidComposeView androidComposeView = (AndroidComposeView) S.a(this.f40909n);
        androidComposeView.F();
        return androidx.compose.ui.graphics.A0.c(jY2, androidComposeView.f40992T);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void O1() {
        boolean zG2 = A0.g(128);
        v.d dVarJ1 = j1();
        if (!zG2 && (dVarJ1 = dVarJ1.f42884f) == null) {
            return;
        }
        for (v.d dVarM1 = m1(zG2); dVarM1 != null && (dVarM1.f42883e & 128) != 0; dVarM1 = dVarM1.f42885g) {
            if ((dVarM1.f42882d & 128) != 0) {
                AbstractC22425n abstractC22425nB = dVarM1;
                ?? eVar = 0;
                while (abstractC22425nB != 0) {
                    if (abstractC22425nB instanceof F) {
                        ((F) abstractC22425nB).D(this);
                    } else if ((abstractC22425nB.f42882d & 128) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                        v.d dVar = abstractC22425nB.f40861q;
                        int i12 = 0;
                        abstractC22425nB = abstractC22425nB;
                        eVar = eVar;
                        while (dVar != null) {
                            if ((dVar.f42882d & 128) != 0) {
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
            if (dVarM1 == dVarJ1) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.layout.A
    @Y61.k
    public final l0.j P(@Y61.k androidx.compose.ui.layout.A a12, boolean z12) {
        if (!j1().f42893o) {
            C47949a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!a12.m()) {
            C47949a.b("LayoutCoordinates " + a12 + " is not attached!");
        }
        AbstractC22443w0 abstractC22443w0Y1 = Y1(a12);
        abstractC22443w0Y1.K1();
        AbstractC22443w0 abstractC22443w0B1 = b1(abstractC22443w0Y1);
        l0.e eVar = this.f40900C;
        if (eVar == null) {
            eVar = new l0.e();
            this.f40900C = eVar;
        }
        eVar.f413380a = 0.0f;
        eVar.f413381b = 0.0f;
        eVar.f413382c = (int) (a12.a() >> 32);
        eVar.f413383d = (int) (a12.a() & 4294967295L);
        while (abstractC22443w0Y1 != abstractC22443w0B1) {
            abstractC22443w0Y1.W1(eVar, z12, false);
            if (eVar.b()) {
                l0.j.f413388e.getClass();
                return l0.j.f413389f;
            }
            abstractC22443w0Y1 = abstractC22443w0Y1.f40913r;
        }
        H0(abstractC22443w0B1, eVar, z12);
        return new l0.j(eVar.f413380a, eVar.f413381b, eVar.f413382c, eVar.f413383d);
    }

    public final long Q0(AbstractC22443w0 abstractC22443w0, long j12, boolean z12) {
        if (abstractC22443w0 == this) {
            return j12;
        }
        AbstractC22443w0 abstractC22443w02 = this.f40913r;
        return (abstractC22443w02 == null || kotlin.jvm.internal.L.f(abstractC22443w0, abstractC22443w02)) ? c1(j12, z12) : c1(abstractC22443w02.Q0(abstractC22443w0, j12, z12), z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    public final void Q1(v.d dVar, f fVar, long j12, C22444x c22444x, int i12, boolean z12, float f12, boolean z13) {
        int i13;
        if (dVar == null) {
            x1(fVar, j12, c22444x, i12, z12);
            return;
        }
        androidx.compose.ui.input.pointer.U.f40189b.getClass();
        if (androidx.compose.ui.input.pointer.U.a(i12, androidx.compose.ui.input.pointer.U.f40192e) || androidx.compose.ui.input.pointer.U.a(i12, androidx.compose.ui.input.pointer.U.f40193f)) {
            AbstractC22425n abstractC22425nB = dVar;
            ?? eVar = 0;
            while (true) {
                if (abstractC22425nB == 0) {
                    break;
                }
                if (abstractC22425nB instanceof P0) {
                    long jM1 = ((P0) abstractC22425nB).m1();
                    int i14 = (int) (j12 >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i14);
                    LayoutNode layoutNode = this.f40909n;
                    LayoutDirection layoutDirection = layoutNode.f40609C;
                    X0.a aVar = X0.f40712b;
                    long j13 = jM1 & Long.MIN_VALUE;
                    if (fIntBitsToFloat >= (-((j13 == 0 || layoutDirection == LayoutDirection.f42838b) ? X0.a.a(X0.f40712b, jM1, 0) : X0.a.a(X0.f40712b, jM1, 2)))) {
                        if (Float.intBitsToFloat(i14) < g0() + ((j13 == 0 || layoutNode.f40609C == LayoutDirection.f42838b) ? X0.a.a(X0.f40712b, jM1, 2) : X0.a.a(X0.f40712b, jM1, 0))) {
                            int i15 = (int) (j12 & 4294967295L);
                            float fIntBitsToFloat2 = Float.intBitsToFloat(i15);
                            X0.a aVar2 = X0.f40712b;
                            if (fIntBitsToFloat2 >= (-X0.a.a(aVar2, jM1, 1))) {
                                if (Float.intBitsToFloat(i15) < X0.a.a(aVar2, jM1, 3) + f0()) {
                                    j jVar = new j(dVar, fVar, j12, c22444x, i12, z12, f12, z13);
                                    int i16 = c22444x.f40940d;
                                    androidx.collection.N0<Object> n02 = c22444x.f40938b;
                                    int i17 = n02.f25660b;
                                    int i18 = i17 - 1;
                                    androidx.collection.F0 f02 = c22444x.f40939c;
                                    if (i16 == i18) {
                                        c22444x.d(i16 + 1, i17);
                                        c22444x.f40940d++;
                                        n02.f(dVar);
                                        f02.a(C22446y.a(0.0f, z12, true));
                                        jVar.invoke();
                                        c22444x.f40940d = i16;
                                        return;
                                    }
                                    long jB2 = c22444x.b();
                                    int i19 = c22444x.f40940d;
                                    if (!C22434s.c(jB2)) {
                                        if (C22434s.b(jB2) > 0.0f) {
                                            int i22 = c22444x.f40940d;
                                            c22444x.d(i22 + 1, n02.f25660b);
                                            c22444x.f40940d++;
                                            n02.f(dVar);
                                            f02.a(C22446y.a(0.0f, z12, true));
                                            jVar.invoke();
                                            c22444x.f40940d = i22;
                                            return;
                                        }
                                        return;
                                    }
                                    int i23 = c22444x.f40938b.f25660b;
                                    int i24 = i23 - 1;
                                    c22444x.f40940d = i24;
                                    c22444x.d(i23, n02.f25660b);
                                    c22444x.f40940d++;
                                    n02.f(dVar);
                                    f02.a(C22446y.a(0.0f, z12, true));
                                    jVar.invoke();
                                    c22444x.f40940d = i24;
                                    if (C22434s.b(c22444x.b()) < 0.0f) {
                                        c22444x.d(i19 + 1, c22444x.f40940d + 1);
                                    }
                                    c22444x.f40940d = i19;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((abstractC22425nB.f42882d & 16) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                        v.d dVar2 = abstractC22425nB.f40861q;
                        int i25 = 0;
                        abstractC22425nB = abstractC22425nB;
                        eVar = eVar;
                        while (dVar2 != null) {
                            if ((dVar2.f42882d & 16) != 0) {
                                i25++;
                                eVar = eVar;
                                if (i25 == 1) {
                                    abstractC22425nB = dVar2;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                    }
                                    if (abstractC22425nB != 0) {
                                        eVar.b(abstractC22425nB);
                                        abstractC22425nB = 0;
                                    }
                                    eVar.b(dVar2);
                                }
                            }
                            dVar2 = dVar2.f42885g;
                            abstractC22425nB = abstractC22425nB;
                            eVar = eVar;
                        }
                        if (i25 == 1) {
                        }
                    }
                    abstractC22425nB = C22421l.b(eVar);
                }
            }
        }
        if (z13) {
            r1(dVar, fVar, j12, c22444x, i12, z12, f12);
            return;
        }
        if (!fVar.b(dVar)) {
            Q1(C22447y0.a(dVar, fVar.a()), fVar, j12, c22444x, i12, z12, f12, false);
            return;
        }
        C22445x0 c22445x0 = new C22445x0(this, dVar, fVar, j12, c22444x, i12, z12, f12);
        int i26 = c22444x.f40940d;
        androidx.collection.N0<Object> n03 = c22444x.f40938b;
        int i27 = n03.f25660b;
        int i28 = i27 - 1;
        androidx.collection.F0 f03 = c22444x.f40939c;
        if (i26 != i28) {
            long jB3 = c22444x.b();
            int i29 = c22444x.f40940d;
            int i32 = c22444x.f40938b.f25660b;
            int i33 = i32 - 1;
            c22444x.f40940d = i33;
            c22444x.d(i32, n03.f25660b);
            c22444x.f40940d++;
            n03.f(dVar);
            f03.a(C22446y.a(f12, z12, false));
            c22445x0.invoke();
            c22444x.f40940d = i33;
            long jB4 = c22444x.b();
            if (c22444x.f40940d + 1 >= c22444x.f40938b.f25660b - 1 || C22434s.a(jB3, jB4) <= 0) {
                c22444x.d(c22444x.f40940d + 1, n03.f25660b);
            } else {
                c22444x.d(i29 + 1, C22434s.c(jB4) ? c22444x.f40940d + 2 : c22444x.f40940d + 1);
            }
            c22444x.f40940d = i29;
            return;
        }
        int i34 = i26 + 1;
        c22444x.d(i34, i27);
        c22444x.f40940d++;
        n03.f(dVar);
        f03.a(C22446y.a(f12, z12, false));
        c22445x0.invoke();
        c22444x.f40940d = i26;
        if (i34 == c22444x.f40938b.f25660b - 1 || C22434s.c(c22444x.b())) {
            int i35 = c22444x.f40940d;
            int i36 = i35 + 1;
            n03.k(i36);
            if (i36 < 0 || i36 >= (i13 = f03.f25610b)) {
                K.f.b("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = f03.f25609a;
            long j14 = jArr[i36];
            if (i36 != i13 - 1) {
                C42756l.n(jArr, jArr, i36, i35 + 2, i13);
            }
            f03.f25610b--;
        }
    }

    public final long R0(long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32)) - g0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L)) - f0();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(0.0f, fIntBitsToFloat2 / 2.0f);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fMax2) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
        n.a aVar = l0.n.f413402b;
        return jFloatToRawIntBits;
    }

    public void R1(@Y61.k androidx.compose.ui.graphics.M m12, @Y61.l C22267c c22267c) {
        AbstractC22443w0 abstractC22443w0 = this.f40912q;
        if (abstractC22443w0 != null) {
            abstractC22443w0.T0(m12, c22267c);
        }
    }

    public final float S0(long j12, long j13) {
        if (g0() >= Float.intBitsToFloat((int) (j13 >> 32)) && f0() >= Float.intBitsToFloat((int) (j13 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jR02 = R0(j13);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jR02 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jR02 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j12 >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - g0());
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j12 & 4294967295L)) < 0.0f ? -r9 : r9 - f0())) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
        g.a aVar = l0.g.f413384b;
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) <= fIntBitsToFloat2) {
            return l0.g.f(jFloatToRawIntBits);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void S1(long j12, float f12, Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar, C22267c c22267c) {
        LayoutNode layoutNode = this.f40909n;
        if (c22267c != null) {
            if (lVar != null) {
                C47949a.a("both ways to create layers shouldn't be used together");
            }
            if (this.f40908K != c22267c) {
                this.f40908K = null;
                b2(null, false);
                this.f40908K = c22267c;
            }
            if (this.f40907J == null) {
                J0 j0A = S.a(layoutNode);
                Y41.p<androidx.compose.ui.graphics.M, C22267c, kotlin.G0> pVarF1 = f1();
                Y41.a<kotlin.G0> aVar = this.f40905H;
                I0 i0E = J0.e(j0A, pVarF1, aVar, c22267c, false, 8);
                i0E.j(this.f40347d);
                i0E.f(j12);
                this.f40907J = i0E;
                layoutNode.f40619M = true;
                ((i) aVar).invoke();
            }
        } else {
            if (this.f40908K != null) {
                this.f40908K = null;
                b2(null, false);
            }
            b2(lVar, false);
        }
        if (!androidx.compose.ui.unit.q.c(this.f40898A, j12)) {
            this.f40898A = j12;
            layoutNode.f40616J.f40693p.v0();
            I0 i02 = this.f40907J;
            if (i02 != null) {
                i02.f(j12);
            } else {
                AbstractC22443w0 abstractC22443w0 = this.f40913r;
                if (abstractC22443w0 != null) {
                    abstractC22443w0.C1();
                }
            }
            X.E0(this);
            AndroidComposeView androidComposeView = layoutNode.f40641q;
            if (androidComposeView != null) {
                androidComposeView.B(layoutNode);
            }
        }
        this.f40899B = f12;
        if (this.f40705i) {
            return;
        }
        t0(new O0(z0(), this));
    }

    @Override // androidx.compose.ui.layout.A
    @Y61.l
    public final androidx.compose.ui.layout.A T() {
        if (!j1().f42893o) {
            C47949a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        K1();
        return this.f40913r;
    }

    public final void T0(@Y61.k androidx.compose.ui.graphics.M m12, @Y61.l C22267c c22267c) {
        I0 i02 = this.f40907J;
        if (i02 != null) {
            i02.h(m12, c22267c);
            return;
        }
        long j12 = this.f40898A;
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        float f12 = (int) (j12 >> 32);
        float f13 = (int) (j12 & 4294967295L);
        m12.m(f12, f13);
        U0(m12, c22267c);
        m12.m(-f12, -f13);
    }

    public final void U0(androidx.compose.ui.graphics.M m12, C22267c c22267c) {
        v.d dVarL1 = l1(4);
        if (dVarL1 == null) {
            R1(m12, c22267c);
            return;
        }
        LayoutNode layoutNode = this.f40909n;
        layoutNode.getClass();
        P sharedDrawScope = S.a(layoutNode).getSharedDrawScope();
        long jC2 = androidx.compose.ui.unit.v.c(this.f40347d);
        sharedDrawScope.getClass();
        androidx.compose.runtime.collection.e eVar = null;
        while (dVarL1 != null) {
            if (dVarL1 instanceof InterfaceC22438u) {
                sharedDrawScope.f(m12, jC2, this, (InterfaceC22438u) dVarL1, c22267c);
            } else if ((dVarL1.f42882d & 4) != 0 && (dVarL1 instanceof AbstractC22425n)) {
                int i12 = 0;
                for (v.d dVar = ((AbstractC22425n) dVarL1).f40861q; dVar != null; dVar = dVar.f42885g) {
                    if ((dVar.f42882d & 4) != 0) {
                        i12++;
                        if (i12 == 1) {
                            dVarL1 = dVar;
                        } else {
                            if (eVar == null) {
                                eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                            }
                            if (dVarL1 != null) {
                                eVar.b(dVarL1);
                                dVarL1 = null;
                            }
                            eVar.b(dVar);
                        }
                    }
                }
                if (i12 == 1) {
                }
            }
            dVarL1 = C22421l.b(eVar);
        }
    }

    public final void W1(@Y61.k l0.e eVar, boolean z12, boolean z13) {
        I0 i02 = this.f40907J;
        if (i02 != null) {
            if (this.f40915t) {
                if (z13) {
                    long jH1 = h1();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jH1 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH1 & 4294967295L)) / 2.0f;
                    long j12 = this.f40347d;
                    eVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j12 >> 32)) + fIntBitsToFloat, ((int) (j12 & 4294967295L)) + fIntBitsToFloat2);
                } else if (z12) {
                    long j13 = this.f40347d;
                    eVar.a(0.0f, 0.0f, (int) (j13 >> 32), (int) (j13 & 4294967295L));
                }
                if (eVar.b()) {
                    return;
                }
            }
            i02.i(eVar, false);
        }
        long j14 = this.f40898A;
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        float f12 = (int) (j14 >> 32);
        eVar.f413380a += f12;
        eVar.f413382c += f12;
        float f13 = (int) (j14 & 4294967295L);
        eVar.f413381b += f13;
        eVar.f413383d += f13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void X1(@Y61.k InterfaceC22367j0 interfaceC22367j0) {
        AbstractC22443w0 abstractC22443w0;
        int i12 = 1;
        InterfaceC22367j0 interfaceC22367j02 = this.f40920y;
        if (interfaceC22367j0 != interfaceC22367j02) {
            this.f40920y = interfaceC22367j0;
            LayoutNode layoutNode = this.f40909n;
            int i13 = 0;
            if (interfaceC22367j02 == null || interfaceC22367j0.getF40521a() != interfaceC22367j02.getF40521a() || interfaceC22367j0.getF40522b() != interfaceC22367j02.getF40522b()) {
                int width = interfaceC22367j0.getF40521a();
                int height = interfaceC22367j0.getF40522b();
                I0 i02 = this.f40907J;
                if (i02 != null) {
                    u.a aVar = androidx.compose.ui.unit.u.f42871b;
                    i02.j((width << 32) | (height & 4294967295L));
                } else if (layoutNode.r() && (abstractC22443w0 = this.f40913r) != null) {
                    abstractC22443w0.C1();
                }
                long j12 = (height & 4294967295L) | (width << 32);
                u.a aVar2 = androidx.compose.ui.unit.u.f42871b;
                o0(j12);
                if (this.f40916u != null) {
                    c2(false);
                }
                boolean zG2 = A0.g(4);
                v.d dVarJ1 = j1();
                if (zG2 || (dVarJ1 = dVarJ1.f42884f) != null) {
                    for (v.d dVarM1 = m1(zG2); dVarM1 != null && (dVarM1.f42883e & 4) != 0; dVarM1 = dVarM1.f42885g) {
                        if ((dVarM1.f42882d & 4) != 0) {
                            AbstractC22425n abstractC22425nB = dVarM1;
                            ?? eVar = 0;
                            while (abstractC22425nB != 0) {
                                if (abstractC22425nB instanceof InterfaceC22438u) {
                                    ((InterfaceC22438u) abstractC22425nB).r1();
                                } else if ((abstractC22425nB.f42882d & 4) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                    v.d dVar = abstractC22425nB.f40861q;
                                    int i14 = 0;
                                    abstractC22425nB = abstractC22425nB;
                                    eVar = eVar;
                                    while (dVar != null) {
                                        if ((dVar.f42882d & 4) != 0) {
                                            i14++;
                                            eVar = eVar;
                                            if (i14 == 1) {
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
                                    if (i14 == 1) {
                                    }
                                }
                                abstractC22425nB = C22421l.b(eVar);
                            }
                        }
                        if (dVarM1 == dVarJ1) {
                            break;
                        }
                    }
                }
                AndroidComposeView androidComposeView = layoutNode.f40641q;
                if (androidComposeView != null) {
                    androidComposeView.B(layoutNode);
                }
            }
            androidx.collection.M0<AbstractC22348a> m02 = this.f40921z;
            if ((m02 == null || m02.f25651e == 0) && interfaceC22367j0.t().isEmpty()) {
                return;
            }
            androidx.collection.M0<AbstractC22348a> m03 = this.f40921z;
            Map<AbstractC22348a, Integer> mapT = interfaceC22367j0.t();
            if (m03 != null && m03.f25651e == mapT.size()) {
                Object[] objArr = m03.f25648b;
                int[] iArr = m03.f25649c;
                long[] jArr = m03.f25647a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i15 = 0;
                loop0: while (true) {
                    long j13 = jArr[i15];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = i13; i17 < i16; i17++) {
                            if ((j13 & 255) < 128) {
                                int i18 = (i15 << 3) + i17;
                                Object obj = objArr[i18];
                                int i19 = iArr[i18];
                                Integer num = mapT.get((AbstractC22348a) obj);
                                if (num == null || num.intValue() != i19) {
                                    break loop0;
                                }
                            }
                            j13 >>= 8;
                            i12 = 1;
                        }
                        if (i16 != 8) {
                            return;
                        }
                    }
                    if (i15 == length) {
                        return;
                    }
                    i15 += i12;
                    i13 = 0;
                }
            }
            layoutNode.f40616J.f40693p.f40853z.g();
            androidx.collection.M0<AbstractC22348a> m0A = this.f40921z;
            if (m0A == null) {
                m0A = androidx.collection.Y0.a();
                this.f40921z = m0A;
            }
            m0A.c();
            for (Map.Entry<AbstractC22348a, Integer> entry : interfaceC22367j0.t().entrySet()) {
                m0A.h(entry.getValue().intValue(), entry.getKey());
            }
        }
    }

    public final void Z1(AbstractC22443w0 abstractC22443w0, float[] fArr) {
        if (kotlin.jvm.internal.L.f(abstractC22443w0, this)) {
            return;
        }
        this.f40913r.Z1(abstractC22443w0, fArr);
        long j12 = this.f40898A;
        androidx.compose.ui.unit.q.f42862b.getClass();
        if (!androidx.compose.ui.unit.q.c(j12, 0L)) {
            float[] fArr2 = f40895Q;
            androidx.compose.ui.graphics.A0.e(fArr2);
            long j13 = this.f40898A;
            androidx.compose.ui.graphics.A0.i(fArr2, -((int) (j13 >> 32)), -((int) (j13 & 4294967295L)));
            androidx.compose.ui.graphics.A0.h(fArr, fArr2);
        }
        I0 i02 = this.f40907J;
        if (i02 != null) {
            i02.e(fArr);
        }
    }

    @Override // androidx.compose.ui.layout.A
    public final long a() {
        return this.f40347d;
    }

    @Override // androidx.compose.ui.layout.A
    public final void a0(@Y61.k float[] fArr) {
        J0 j0A = S.a(this.f40909n);
        a2(Y1(androidx.compose.ui.layout.B.c(this)), fArr);
        ((InterfaceC22334l) j0A).a(fArr);
    }

    public abstract void a1();

    public final void a2(AbstractC22443w0 abstractC22443w0, float[] fArr) {
        for (AbstractC22443w0 abstractC22443w02 = this; !abstractC22443w02.equals(abstractC22443w0); abstractC22443w02 = abstractC22443w02.f40913r) {
            I0 i02 = abstractC22443w02.f40907J;
            if (i02 != null) {
                i02.b(fArr);
            }
            long j12 = abstractC22443w02.f40898A;
            androidx.compose.ui.unit.q.f42862b.getClass();
            if (!androidx.compose.ui.unit.q.c(j12, 0L)) {
                float[] fArr2 = f40895Q;
                androidx.compose.ui.graphics.A0.e(fArr2);
                androidx.compose.ui.graphics.A0.i(fArr2, (int) (j12 >> 32), (int) (j12 & 4294967295L));
                androidx.compose.ui.graphics.A0.h(fArr, fArr2);
            }
        }
    }

    @Y61.k
    public final AbstractC22443w0 b1(@Y61.k AbstractC22443w0 abstractC22443w0) {
        LayoutNode layoutNodeK = abstractC22443w0.f40909n;
        LayoutNode layoutNode = this.f40909n;
        if (layoutNodeK == layoutNode) {
            v.d dVarJ1 = abstractC22443w0.j1();
            v.d dVarJ12 = j1();
            if (!dVarJ12.f42880b.f42893o) {
                C47949a.b("visitLocalAncestors called on an unattached node");
            }
            for (v.d dVar = dVarJ12.f42880b.f42884f; dVar != null; dVar = dVar.f42884f) {
                if ((dVar.f42882d & 2) != 0 && dVar == dVarJ1) {
                    return abstractC22443w0;
                }
            }
            return this;
        }
        while (layoutNodeK.f40643s > layoutNode.f40643s) {
            layoutNodeK = layoutNodeK.K();
        }
        LayoutNode layoutNodeK2 = layoutNode;
        while (layoutNodeK2.f40643s > layoutNodeK.f40643s) {
            layoutNodeK2 = layoutNodeK2.K();
        }
        while (layoutNodeK != layoutNodeK2) {
            layoutNodeK = layoutNodeK.K();
            layoutNodeK2 = layoutNodeK2.K();
            if (layoutNodeK == null || layoutNodeK2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return layoutNodeK2 == layoutNode ? this : layoutNodeK == abstractC22443w0.f40909n ? abstractC22443w0 : layoutNodeK.f40615I.f40875b;
    }

    public final void b2(@Y61.l Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar, boolean z12) {
        AndroidComposeView androidComposeView;
        if (lVar != null && this.f40908K != null) {
            C47949a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = this.f40909n;
        boolean z13 = (!z12 && this.f40916u == lVar && kotlin.jvm.internal.L.f(this.f40917v, layoutNode.f40608B) && this.f40918w == layoutNode.f40609C) ? false : true;
        this.f40917v = layoutNode.f40608B;
        this.f40918w = layoutNode.f40609C;
        boolean zM2 = layoutNode.m();
        Y41.a<kotlin.G0> aVar = this.f40905H;
        if (!zM2 || lVar == null) {
            this.f40916u = null;
            I0 i02 = this.f40907J;
            if (i02 != null) {
                i02.destroy();
                layoutNode.f40619M = true;
                ((i) aVar).invoke();
                if (j1().f42893o && layoutNode.r() && (androidComposeView = layoutNode.f40641q) != null) {
                    androidComposeView.B(layoutNode);
                }
            }
            this.f40907J = null;
            this.f40906I = false;
            return;
        }
        this.f40916u = lVar;
        if (this.f40907J != null) {
            if (z13 && c2(true)) {
                S.a(layoutNode).getRectManager().e(layoutNode);
                return;
            }
            return;
        }
        I0 i0E = J0.e(S.a(layoutNode), f1(), aVar, null, layoutNode.f40632h, 4);
        i0E.j(this.f40347d);
        i0E.f(this.f40898A);
        this.f40907J = i0E;
        c2(true);
        layoutNode.f40619M = true;
        ((i) aVar).invoke();
    }

    public final long c1(long j12, boolean z12) {
        if (z12 || !this.f40703g) {
            long j13 = this.f40898A;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
            j12 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j12 & 4294967295L)) - ((int) (j13 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat - ((int) (j13 >> 32))) << 32);
            g.a aVar2 = l0.g.f413384b;
        }
        I0 i02 = this.f40907J;
        return i02 != null ? i02.c(j12, true) : j12;
    }

    public final boolean c2(boolean z12) {
        AndroidComposeView androidComposeView;
        boolean z13 = false;
        if (this.f40908K != null) {
            return false;
        }
        I0 i02 = this.f40907J;
        if (i02 == null) {
            if (this.f40916u != null) {
                C47949a.b("null layer with a non-null layerBlock");
            }
            return false;
        }
        Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar = this.f40916u;
        if (lVar == null) {
            throw androidx.compose.foundation.H.s("updateLayerParameters requires a non-null layerBlock");
        }
        androidx.compose.ui.graphics.c1 c1Var = f40893O;
        c1Var.j(1.0f);
        c1Var.k(1.0f);
        c1Var.setAlpha(1.0f);
        c1Var.l(0.0f);
        c1Var.g(0.0f);
        c1Var.q(0.0f);
        long j12 = C22278p0.f39720a;
        c1Var.v(j12);
        c1Var.w(j12);
        c1Var.b(0.0f);
        c1Var.c(0.0f);
        c1Var.d(0.0f);
        c1Var.h(8.0f);
        r1.f39755b.getClass();
        c1Var.i1(r1.f39756c);
        c1Var.u1(androidx.compose.ui.graphics.Y0.f39346a);
        c1Var.p(false);
        c1Var.e(null);
        C22250e0.f39504b.getClass();
        c1Var.H(0);
        l0.n.f413402b.getClass();
        c1Var.f39372s = l0.n.f413403c;
        c1Var.f39376w = null;
        c1Var.f39355b = 0;
        LayoutNode layoutNode = this.f40909n;
        c1Var.f39373t = layoutNode.f40608B;
        c1Var.f39374u = layoutNode.f40609C;
        c1Var.f39372s = androidx.compose.ui.unit.v.c(this.f40347d);
        S.a(layoutNode).getSnapshotObserver().b(this, f40891M, new k(lVar));
        E e12 = this.f40901D;
        if (e12 == null) {
            e12 = new E();
            this.f40901D = e12;
        }
        E e13 = f40894P;
        e13.getClass();
        e13.f40559a = e12.f40559a;
        e13.f40560b = e12.f40560b;
        e13.f40561c = e12.f40561c;
        e13.f40562d = e12.f40562d;
        e13.f40563e = e12.f40563e;
        e13.f40564f = e12.f40564f;
        e13.f40565g = e12.f40565g;
        e13.f40566h = e12.f40566h;
        e13.f40567i = e12.f40567i;
        e12.f40559a = c1Var.f39356c;
        e12.f40560b = c1Var.f39357d;
        e12.f40561c = c1Var.f39359f;
        e12.f40562d = c1Var.f39360g;
        e12.f40563e = c1Var.f39364k;
        e12.f40564f = c1Var.f39365l;
        e12.f40565g = c1Var.f39366m;
        e12.f40566h = c1Var.f39367n;
        e12.f40567i = c1Var.f39368o;
        i02.k(c1Var);
        boolean z14 = this.f40915t;
        this.f40915t = c1Var.f39370q;
        this.f40919x = c1Var.f39358e;
        if (e13.f40559a == e12.f40559a && e13.f40560b == e12.f40560b && e13.f40561c == e12.f40561c && e13.f40562d == e12.f40562d && e13.f40563e == e12.f40563e && e13.f40564f == e12.f40564f && e13.f40565g == e12.f40565g && e13.f40566h == e12.f40566h && r1.b(e13.f40567i, e12.f40567i)) {
            z13 = true;
        }
        boolean z15 = !z13;
        if (z12 && ((!z13 || z14 != this.f40915t) && (androidComposeView = layoutNode.f40641q) != null)) {
            androidComposeView.B(layoutNode);
        }
        return z15;
    }

    public final boolean d2(long j12) {
        if ((((9187343241974906880L ^ (j12 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        I0 i02 = this.f40907J;
        return i02 == null || !this.f40915t || i02.d(j12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // androidx.compose.ui.layout.InterfaceC22375n0, androidx.compose.ui.layout.InterfaceC22391w
    @Y61.l
    /* renamed from: f */
    public final Object getF40847t() {
        LayoutNode layoutNode = this.f40909n;
        if (!layoutNode.f40615I.d(64)) {
            return null;
        }
        j1();
        l0.h hVar = new l0.h();
        for (v.d dVar = layoutNode.f40615I.f40877d; dVar != null; dVar = dVar.f42884f) {
            if ((dVar.f42882d & 64) != 0) {
                ?? eVar = 0;
                AbstractC22425n abstractC22425nB = dVar;
                while (abstractC22425nB != 0) {
                    if (abstractC22425nB instanceof M0) {
                        hVar.f406842b = ((M0) abstractC22425nB).r(layoutNode.f40608B, hVar.f406842b);
                    } else if ((abstractC22425nB.f42882d & 64) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                        v.d dVar2 = abstractC22425nB.f40861q;
                        int i12 = 0;
                        abstractC22425nB = abstractC22425nB;
                        eVar = eVar;
                        while (dVar2 != null) {
                            if ((dVar2.f42882d & 64) != 0) {
                                i12++;
                                eVar = eVar;
                                if (i12 == 1) {
                                    abstractC22425nB = dVar2;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                    }
                                    if (abstractC22425nB != 0) {
                                        eVar.b(abstractC22425nB);
                                        abstractC22425nB = 0;
                                    }
                                    eVar.b(dVar2);
                                }
                            }
                            dVar2 = dVar2.f42885g;
                            abstractC22425nB = abstractC22425nB;
                            eVar = eVar;
                        }
                        if (i12 == 1) {
                        }
                    }
                    abstractC22425nB = C22421l.b(eVar);
                }
            }
        }
        return hVar.f406842b;
    }

    public final Y41.p<androidx.compose.ui.graphics.M, C22267c, kotlin.G0> f1() {
        Y41.p pVar = this.f40904G;
        if (pVar != null) {
            return pVar;
        }
        g gVar = new g(new h(), this);
        this.f40904G = gVar;
        return gVar;
    }

    @Y61.l
    /* renamed from: g1 */
    public abstract AbstractC22400a0 getF40958U();

    @Override // androidx.compose.ui.unit.d
    /* renamed from: getDensity */
    public final float getF40389c() {
        return this.f40909n.f40608B.getF40389c();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22393x
    @Y61.k
    /* renamed from: getLayoutDirection */
    public final LayoutDirection getF40524b() {
        return this.f40909n.f40609C;
    }

    public final long h1() {
        return this.f40917v.L(this.f40909n.f40610D.f());
    }

    @Y61.k
    public abstract v.d j1();

    @Override // androidx.compose.ui.layout.K0
    public void k0(long j12, float f12, @Y61.l Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar) {
        if (this.f40910o) {
            S1(getF40958U().f40732o, f12, lVar, null);
        } else {
            S1(j12, f12, lVar, null);
        }
    }

    @Y61.l
    public final v.d l1(int i12) {
        boolean zG2 = A0.g(i12);
        v.d dVarJ1 = j1();
        if (!zG2 && (dVarJ1 = dVarJ1.f42884f) == null) {
            return null;
        }
        for (v.d dVarM1 = m1(zG2); dVarM1 != null && (dVarM1.f42883e & i12) != 0; dVarM1 = dVarM1.f42885g) {
            if ((dVarM1.f42882d & i12) != 0) {
                return dVarM1;
            }
            if (dVarM1 == dVarJ1) {
                return null;
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.A
    public final boolean m() {
        return j1().f42893o;
    }

    @Override // androidx.compose.ui.layout.K0
    public void m0(long j12, float f12, @Y61.k C22267c c22267c) {
        if (this.f40910o) {
            S1(getF40958U().f40732o, f12, null, c22267c);
        } else {
            S1(j12, f12, null, c22267c);
        }
    }

    public final v.d m1(boolean z12) {
        v.d dVarJ1;
        C22437t0 c22437t0 = this.f40909n.f40615I;
        if (c22437t0.f40876c == this) {
            return c22437t0.f40878e;
        }
        if (z12) {
            AbstractC22443w0 abstractC22443w0 = this.f40913r;
            if (abstractC22443w0 != null && (dVarJ1 = abstractC22443w0.j1()) != null) {
                return dVarJ1.f42885g;
            }
        } else {
            AbstractC22443w0 abstractC22443w02 = this.f40913r;
            if (abstractC22443w02 != null) {
                return abstractC22443w02.j1();
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.node.K0
    public final boolean n1() {
        return (this.f40907J == null || this.f40914s || !this.f40909n.m()) ? false : true;
    }

    public final void p1(v.d dVar, f fVar, long j12, C22444x c22444x, int i12, boolean z12) {
        if (dVar == null) {
            x1(fVar, j12, c22444x, i12, z12);
            return;
        }
        int i13 = c22444x.f40940d;
        androidx.collection.N0<Object> n02 = c22444x.f40938b;
        c22444x.d(i13 + 1, n02.f25660b);
        c22444x.f40940d++;
        n02.f(dVar);
        c22444x.f40939c.a(C22446y.a(-1.0f, z12, false));
        p1(C22447y0.a(dVar, fVar.a()), fVar, j12, c22444x, i12, z12);
        c22444x.f40940d = i13;
    }

    public final void r1(v.d dVar, f fVar, long j12, C22444x c22444x, int i12, boolean z12, float f12) {
        if (dVar == null) {
            x1(fVar, j12, c22444x, i12, z12);
            return;
        }
        int i13 = c22444x.f40940d;
        androidx.collection.N0<Object> n02 = c22444x.f40938b;
        c22444x.d(i13 + 1, n02.f25660b);
        c22444x.f40940d++;
        n02.f(dVar);
        c22444x.f40939c.a(C22446y.a(f12, z12, false));
        Q1(C22447y0.a(dVar, fVar.a()), fVar, j12, c22444x, i12, z12, f12, true);
        c22444x.f40940d = i13;
    }

    public final void s1(@Y61.k f fVar, long j12, @Y61.k C22444x c22444x, int i12, boolean z12) {
        boolean z13;
        v.d dVarL1 = l1(fVar.a());
        if (!d2(j12)) {
            androidx.compose.ui.input.pointer.U.f40189b.getClass();
            if (androidx.compose.ui.input.pointer.U.a(i12, androidx.compose.ui.input.pointer.U.f40190c)) {
                float fS02 = S0(j12, h1());
                if ((Float.floatToRawIntBits(fS02) & Integer.MAX_VALUE) < 2139095040) {
                    if (c22444x.f40940d != c22444x.f40938b.f25660b - 1) {
                        if (C22434s.a(c22444x.b(), C22446y.a(fS02, false, false)) <= 0) {
                            return;
                        }
                    }
                    r1(dVarL1, fVar, j12, c22444x, i12, false, fS02);
                    return;
                }
                return;
            }
            return;
        }
        if (dVarL1 == null) {
            x1(fVar, j12, c22444x, i12, z12);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j12));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < g0() && fIntBitsToFloat2 < f0()) {
            p1(dVarL1, fVar, j12, c22444x, i12, z12);
            return;
        }
        androidx.compose.ui.input.pointer.U.f40189b.getClass();
        float fS03 = !androidx.compose.ui.input.pointer.U.a(i12, androidx.compose.ui.input.pointer.U.f40190c) ? Float.POSITIVE_INFINITY : S0(j12, h1());
        if ((Float.floatToRawIntBits(fS03) & Integer.MAX_VALUE) < 2139095040) {
            if (c22444x.f40940d != c22444x.f40938b.f25660b - 1) {
                if (C22434s.a(c22444x.b(), C22446y.a(fS03, z12, false)) > 0) {
                }
                Q1(dVarL1, fVar, j12, c22444x, i12, z12, fS03, z13);
            }
            z13 = true;
            Q1(dVarL1, fVar, j12, c22444x, i12, z12, fS03, z13);
        }
        z13 = false;
        Q1(dVarL1, fVar, j12, c22444x, i12, z12, fS03, z13);
    }

    @Override // androidx.compose.ui.node.X
    @Y61.l
    public final X u0() {
        return this.f40912q;
    }

    @Override // androidx.compose.ui.node.X
    public final boolean w0() {
        return this.f40920y != null;
    }

    @Override // androidx.compose.ui.node.X, androidx.compose.ui.node.InterfaceC22424m0
    @Y61.k
    /* renamed from: w1, reason: from getter */
    public final LayoutNode getF40909n() {
        return this.f40909n;
    }

    @Override // androidx.compose.ui.layout.A
    @Y61.l
    public final androidx.compose.ui.layout.A x() {
        if (!j1().f42893o) {
            C47949a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        K1();
        return this.f40909n.f40615I.f40876c.f40913r;
    }

    public void x1(@Y61.k f fVar, long j12, @Y61.k C22444x c22444x, int i12, boolean z12) {
        AbstractC22443w0 abstractC22443w0 = this.f40912q;
        if (abstractC22443w0 != null) {
            abstractC22443w0.s1(fVar, abstractC22443w0.c1(j12, true), c22444x, i12, z12);
        }
    }

    @Override // androidx.compose.ui.layout.A
    public final long y(long j12) {
        if (!j1().f42893o) {
            C47949a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        K1();
        for (AbstractC22443w0 abstractC22443w0 = this; abstractC22443w0 != null; abstractC22443w0 = abstractC22443w0.f40913r) {
            I0 i02 = abstractC22443w0.f40907J;
            if (i02 != null) {
                j12 = i02.c(j12, false);
            }
            j12 = androidx.compose.ui.unit.r.b(j12, abstractC22443w0.f40898A);
        }
        return j12;
    }

    @Override // androidx.compose.ui.layout.A
    public final long z(@Y61.k androidx.compose.ui.layout.A a12, long j12) {
        return G1(a12, j12, true);
    }

    @Override // androidx.compose.ui.node.X
    @Y61.k
    public final InterfaceC22367j0 z0() {
        InterfaceC22367j0 interfaceC22367j0 = this.f40920y;
        if (interfaceC22367j0 != null) {
            return interfaceC22367j0;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // androidx.compose.ui.node.X
    @Y61.k
    public final androidx.compose.ui.layout.A v0() {
        return this;
    }
}
