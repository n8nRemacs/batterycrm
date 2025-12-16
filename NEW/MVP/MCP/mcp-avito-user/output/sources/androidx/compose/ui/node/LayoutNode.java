package androidx.compose.ui.node;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22198x;
import androidx.compose.runtime.U;
import androidx.compose.ui.C22214e;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22393x;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22404c0;
import androidx.compose.ui.node.J0;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.B1;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import s0.C47949a;

/* compiled from: LayoutNode.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0004\r\u000e\u000f\u0010J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/x;", "Landroidx/compose/ui/layout/N0;", "Landroidx/compose/ui/node/K0;", "Landroidx/compose/ui/layout/F;", "Landroidx/compose/ui/semantics/n;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/C;", "Landroidx/compose/ui/node/J0$b;", "instance", "", "z", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/String;", "d", "LayoutState", "e", "UsageByParent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutNode implements InterfaceC22198x, androidx.compose.ui.layout.N0, K0, androidx.compose.ui.layout.F, androidx.compose.ui.semantics.n, InterfaceC22413h, C, J0.b {

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public static final d f40602T = new d(null);

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public static final c f40603U = new c();

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public static final Y41.a<LayoutNode> f40604V = a.f40663l;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public static final b f40605W = new b();

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public static final androidx.camera.core.impl.r0 f40606X = new androidx.camera.core.impl.r0(2);

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public D f40607A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.unit.d f40608B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public LayoutDirection f40609C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public InterfaceC22544x2 f40610D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public androidx.compose.runtime.U f40611E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public UsageByParent f40612F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public UsageByParent f40613G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f40614H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final C22437t0 f40615I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final T f40616J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.layout.Q f40617K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public AbstractC22443w0 f40618L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f40619M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.v f40620N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.v f40621O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super J0, kotlin.G0> f40622P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super J0, kotlin.G0> f40623Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f40624R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f40625S;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f40626b;

    /* renamed from: c, reason: collision with root package name */
    public int f40627c;

    /* renamed from: d, reason: collision with root package name */
    public long f40628d;

    /* renamed from: e, reason: collision with root package name */
    public long f40629e;

    /* renamed from: f, reason: collision with root package name */
    public long f40630f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40631g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40632h;

    /* renamed from: i, reason: collision with root package name */
    public int f40633i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f40634j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public LayoutNode f40635k;

    /* renamed from: l, reason: collision with root package name */
    public int f40636l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C22433r0<LayoutNode> f40637m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public androidx.compose.runtime.collection.e<LayoutNode> f40638n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f40639o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public LayoutNode f40640p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public AndroidComposeView f40641q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.viewinterop.a f40642r;

    /* renamed from: s, reason: collision with root package name */
    public int f40643s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f40644t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f40645u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.semantics.l f40646v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f40647w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<LayoutNode> f40648x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f40649y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public InterfaceC22365i0 f40650z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LayoutState {

        /* renamed from: b, reason: collision with root package name */
        public static final LayoutState f40651b;

        /* renamed from: c, reason: collision with root package name */
        public static final LayoutState f40652c;

        /* renamed from: d, reason: collision with root package name */
        public static final LayoutState f40653d;

        /* renamed from: e, reason: collision with root package name */
        public static final LayoutState f40654e;

        /* renamed from: f, reason: collision with root package name */
        public static final LayoutState f40655f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ LayoutState[] f40656g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f40657h;

        static {
            LayoutState layoutState = new LayoutState("Measuring", 0);
            f40651b = layoutState;
            LayoutState layoutState2 = new LayoutState("LookaheadMeasuring", 1);
            f40652c = layoutState2;
            LayoutState layoutState3 = new LayoutState("LayingOut", 2);
            f40653d = layoutState3;
            LayoutState layoutState4 = new LayoutState("LookaheadLayingOut", 3);
            f40654e = layoutState4;
            LayoutState layoutState5 = new LayoutState("Idle", 4);
            f40655f = layoutState5;
            LayoutState[] layoutStateArr = {layoutState, layoutState2, layoutState3, layoutState4, layoutState5};
            f40656g = layoutStateArr;
            f40657h = kotlin.enums.c.a(layoutStateArr);
        }

        public LayoutState() {
            throw null;
        }

        public static LayoutState valueOf(String str) {
            return (LayoutState) Enum.valueOf(LayoutState.class, str);
        }

        public static LayoutState[] values() {
            return (LayoutState[]) f40656g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UsageByParent {

        /* renamed from: b, reason: collision with root package name */
        public static final UsageByParent f40658b;

        /* renamed from: c, reason: collision with root package name */
        public static final UsageByParent f40659c;

        /* renamed from: d, reason: collision with root package name */
        public static final UsageByParent f40660d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ UsageByParent[] f40661e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f40662f;

        static {
            UsageByParent usageByParent = new UsageByParent("InMeasureBlock", 0);
            f40658b = usageByParent;
            UsageByParent usageByParent2 = new UsageByParent("InLayoutBlock", 1);
            f40659c = usageByParent2;
            UsageByParent usageByParent3 = new UsageByParent("NotUsed", 2);
            f40660d = usageByParent3;
            UsageByParent[] usageByParentArr = {usageByParent, usageByParent2, usageByParent3};
            f40661e = usageByParentArr;
            f40662f = kotlin.enums.c.a(usageByParentArr);
        }

        public UsageByParent() {
            throw null;
        }

        public static UsageByParent valueOf(String str) {
            return (UsageByParent) Enum.valueOf(UsageByParent.class, str);
        }

        public static UsageByParent[] values() {
            return (UsageByParent[]) f40661e.clone();
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/node/LayoutNode;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<LayoutNode> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f40663l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0, 3, null);
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/node/LayoutNode$b", "Landroidx/compose/ui/platform/x2;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC22544x2 {
        @Override // androidx.compose.ui.platform.InterfaceC22544x2
        public final long b() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.InterfaceC22544x2
        public final long c() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.InterfaceC22544x2
        public final float e() {
            return 16.0f;
        }

        @Override // androidx.compose.ui.platform.InterfaceC22544x2
        public final long f() {
            androidx.compose.ui.unit.l.f42859b.getClass();
            return 0L;
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/node/LayoutNode$c", "Landroidx/compose/ui/node/LayoutNode$e;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends e {
        public c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // androidx.compose.ui.layout.InterfaceC22365i0
        public final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, List list, long j12) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$d;", "", "<init>", "()V", "Landroidx/compose/ui/node/LayoutNode$e;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$e;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: LayoutNode.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$e;", "Landroidx/compose/ui/layout/i0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class e implements InterfaceC22365i0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f40664a;

        public e(@Y61.k String str) {
            this.f40664a = str;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22365i0
        public final int c(InterfaceC22393x interfaceC22393x, List list, int i12) {
            throw new IllegalStateException(this.f40664a.toString());
        }

        @Override // androidx.compose.ui.layout.InterfaceC22365i0
        public final int e(InterfaceC22393x interfaceC22393x, List list, int i12) {
            throw new IllegalStateException(this.f40664a.toString());
        }

        @Override // androidx.compose.ui.layout.InterfaceC22365i0
        public final int f(InterfaceC22393x interfaceC22393x, List list, int i12) {
            throw new IllegalStateException(this.f40664a.toString());
        }

        @Override // androidx.compose.ui.layout.InterfaceC22365i0
        public final int h(InterfaceC22393x interfaceC22393x, List list, int i12) {
            throw new IllegalStateException(this.f40664a.toString());
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40665a;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                LayoutState layoutState = LayoutState.f40651b;
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f40665a = iArr;
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            T t12 = LayoutNode.this.f40616J;
            t12.f40693p.f40821B = true;
            C22404c0 c22404c0 = t12.f40694q;
            if (c22404c0 != null) {
                c22404c0.f40760v = true;
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LayoutNode.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.h<androidx.compose.ui.semantics.l> f40668m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(l0.h<androidx.compose.ui.semantics.l> hVar) {
            super(0);
            this.f40668m = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.v$d] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.v$d] */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.e] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.e] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r4v7, types: [T, androidx.compose.ui.semantics.l] */
        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C22437t0 c22437t0 = LayoutNode.this.f40615I;
            if ((c22437t0.f40878e.f42883e & 8) != 0) {
                for (v.d dVar = c22437t0.f40877d; dVar != null; dVar = dVar.f42884f) {
                    if ((dVar.f42882d & 8) != 0) {
                        AbstractC22425n abstractC22425nB = dVar;
                        ?? eVar = 0;
                        while (abstractC22425nB != 0) {
                            if (abstractC22425nB instanceof T0) {
                                T0 t02 = (T0) abstractC22425nB;
                                boolean zT02 = t02.getF41732q();
                                l0.h<androidx.compose.ui.semantics.l> hVar = this.f40668m;
                                if (zT02) {
                                    ?? lVar = new androidx.compose.ui.semantics.l();
                                    hVar.f406842b = lVar;
                                    lVar.f41789e = true;
                                }
                                if (t02.getF41731p()) {
                                    hVar.f406842b.f41788d = true;
                                }
                                t02.O(hVar.f406842b);
                            } else if ((abstractC22425nB.f42882d & 8) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                v.d dVar2 = abstractC22425nB.f40861q;
                                int i12 = 0;
                                abstractC22425nB = abstractC22425nB;
                                eVar = eVar;
                                while (dVar2 != null) {
                                    if ((dVar2.f42882d & 8) != 0) {
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
            }
            return kotlin.G0.f406611a;
        }
    }

    public LayoutNode() {
        this(false, 0, 3, null);
    }

    public static boolean h0(LayoutNode layoutNode) {
        C22418j0 c22418j0 = layoutNode.f40616J.f40693p;
        return layoutNode.g0(c22418j0.f40838k ? C22712b.a(c22418j0.f40348e) : null);
    }

    public static void m0(LayoutNode layoutNode, boolean z12, int i12) {
        LayoutNode layoutNodeK;
        if ((i12 & 1) != 0) {
            z12 = false;
        }
        boolean z13 = (i12 & 2) != 0;
        boolean z14 = (i12 & 4) != 0;
        if (layoutNode.f40635k == null) {
            C47949a.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        AndroidComposeView androidComposeView = layoutNode.f40641q;
        if (androidComposeView == null || layoutNode.f40644t || layoutNode.f40626b) {
            return;
        }
        androidComposeView.C(layoutNode, true, z12, z13);
        if (z14) {
            T t12 = layoutNode.f40616J.f40694q.f40745g;
            LayoutNode layoutNodeK2 = t12.f40678a.K();
            UsageByParent usageByParent = t12.f40678a.f40612F;
            if (layoutNodeK2 == null || usageByParent == UsageByParent.f40660d) {
                return;
            }
            while (layoutNodeK2.f40612F == usageByParent && (layoutNodeK = layoutNodeK2.K()) != null) {
                layoutNodeK2 = layoutNodeK;
            }
            int iOrdinal = usageByParent.ordinal();
            if (iOrdinal == 0) {
                if (layoutNodeK2.f40635k != null) {
                    m0(layoutNodeK2, z12, 6);
                    return;
                } else {
                    o0(layoutNodeK2, z12, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (layoutNodeK2.f40635k != null) {
                layoutNodeK2.l0(z12);
            } else {
                layoutNodeK2.n0(z12);
            }
        }
    }

    public static void o0(LayoutNode layoutNode, boolean z12, int i12) {
        AndroidComposeView androidComposeView;
        LayoutNode layoutNodeK;
        if ((i12 & 1) != 0) {
            z12 = false;
        }
        boolean z13 = (i12 & 2) != 0;
        boolean z14 = (i12 & 4) != 0;
        if (layoutNode.f40644t || layoutNode.f40626b || (androidComposeView = layoutNode.f40641q) == null) {
            return;
        }
        J0.a aVar = J0.f40575D1;
        androidComposeView.C(layoutNode, false, z12, z13);
        if (z14) {
            T t12 = layoutNode.f40616J.f40693p.f40834g;
            LayoutNode layoutNodeK2 = t12.f40678a.K();
            UsageByParent usageByParent = t12.f40678a.f40612F;
            if (layoutNodeK2 == null || usageByParent == UsageByParent.f40660d) {
                return;
            }
            while (layoutNodeK2.f40612F == usageByParent && (layoutNodeK = layoutNodeK2.K()) != null) {
                layoutNodeK2 = layoutNodeK;
            }
            int iOrdinal = usageByParent.ordinal();
            if (iOrdinal == 0) {
                o0(layoutNodeK2, z12, 6);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                layoutNodeK2.n0(z12);
            }
        }
    }

    public static void p0(@Y61.k LayoutNode layoutNode) {
        int i12 = f.f40665a[layoutNode.f40616J.f40681d.ordinal()];
        T t12 = layoutNode.f40616J;
        if (i12 != 1) {
            throw new IllegalStateException("Unexpected state " + t12.f40681d);
        }
        if (t12.f40682e) {
            m0(layoutNode, true, 6);
            return;
        }
        if (t12.f40683f) {
            layoutNode.l0(true);
        }
        if (layoutNode.G()) {
            o0(layoutNode, true, 6);
        } else if (layoutNode.F()) {
            layoutNode.n0(true);
        }
    }

    private final String z(LayoutNode instance) {
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(instance);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(w(0));
        sb2.append(" Other tree: ");
        LayoutNode layoutNode = instance.f40640p;
        sb2.append(layoutNode != null ? layoutNode.w(0) : null);
        return sb2.toString();
    }

    @Y61.k
    public final List<InterfaceC22363h0> A() {
        C22404c0 c22404c0 = this.f40616J.f40694q;
        T t12 = c22404c0.f40745g;
        t12.f40678a.C();
        boolean z12 = c22404c0.f40760v;
        androidx.compose.runtime.collection.e<C22404c0> eVar = c22404c0.f40759u;
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
                eVar.b(layoutNode2.f40616J.f40694q);
            } else {
                C22404c0 c22404c02 = layoutNode2.f40616J.f40694q;
                C22404c0[] c22404c0Arr = eVar.f38260b;
                C22404c0 c22404c03 = c22404c0Arr[i13];
                c22404c0Arr[i13] = c22404c02;
            }
        }
        eVar.l(layoutNode.C().size(), eVar.f38262d);
        c22404c0.f40760v = false;
        return eVar.f();
    }

    @Y61.k
    public final List<InterfaceC22363h0> B() {
        return this.f40616J.f40693p.r0();
    }

    @Y61.k
    public final List<LayoutNode> C() {
        return O().f();
    }

    @Y61.k
    public final List<LayoutNode> D() {
        return this.f40637m.f40866a.f();
    }

    public final int E() {
        return this.f40616J.f40693p.f40346c;
    }

    public final boolean F() {
        return this.f40616J.f40693p.f40851x;
    }

    public final boolean G() {
        return this.f40616J.f40693p.f40850w;
    }

    @Y61.k
    public final UsageByParent H() {
        return this.f40616J.f40693p.f40840m;
    }

    @Y61.k
    public final UsageByParent I() {
        UsageByParent usageByParent;
        C22404c0 c22404c0 = this.f40616J.f40694q;
        return (c22404c0 == null || (usageByParent = c22404c0.f40749k) == null) ? UsageByParent.f40660d : usageByParent;
    }

    public final D J() {
        D d12 = this.f40607A;
        if (d12 != null) {
            return d12;
        }
        D d13 = new D(this, this.f40650z);
        this.f40607A = d13;
        return d13;
    }

    @Y61.l
    public final LayoutNode K() {
        LayoutNode layoutNode = this.f40640p;
        while (layoutNode != null && layoutNode.f40626b) {
            layoutNode = layoutNode.f40640p;
        }
        return layoutNode;
    }

    public final int L() {
        return this.f40616J.f40693p.f40837j;
    }

    public final int M() {
        return this.f40616J.f40693p.f40345b;
    }

    @Y61.k
    public final androidx.compose.runtime.collection.e<LayoutNode> N() {
        boolean z12 = this.f40649y;
        androidx.compose.runtime.collection.e<LayoutNode> eVar = this.f40648x;
        if (z12) {
            eVar.g();
            eVar.c(eVar.f38262d, O());
            eVar.n(f40606X);
            this.f40649y = false;
        }
        return eVar;
    }

    @Y61.k
    public final androidx.compose.runtime.collection.e<LayoutNode> O() {
        s0();
        return this.f40636l == 0 ? this.f40637m.f40866a : this.f40638n;
    }

    public final void P(long j12, @Y61.k C22444x c22444x, int i12, boolean z12) {
        C22437t0 c22437t0 = this.f40615I;
        AbstractC22443w0 abstractC22443w0 = c22437t0.f40876c;
        AbstractC22443w0.e eVar = AbstractC22443w0.f40890L;
        long jC1 = abstractC22443w0.c1(j12, true);
        AbstractC22443w0 abstractC22443w02 = c22437t0.f40876c;
        AbstractC22443w0.f40890L.getClass();
        abstractC22443w02.s1(AbstractC22443w0.f40896R, jC1, c22444x, i12, z12);
    }

    @Override // androidx.compose.ui.semantics.n
    @Y61.l
    public final androidx.compose.ui.semantics.l Q() {
        if (!m() || this.f40625S || !this.f40615I.d(8)) {
            return null;
        }
        if (!androidx.compose.ui.l.f40322c && this.f40646v == null) {
            this.f40646v = p();
        }
        return this.f40646v;
    }

    @Override // androidx.compose.ui.semantics.n
    @Y61.l
    public final LayoutNode R() {
        return K();
    }

    @Override // androidx.compose.ui.semantics.n
    @Y61.k
    public final List<androidx.compose.ui.semantics.n> S() {
        return C();
    }

    @Override // androidx.compose.ui.semantics.n
    public final boolean T() {
        return this.f40615I.f40876c.D1();
    }

    public final void U(long j12, @Y61.k C22444x c22444x, boolean z12) {
        C22437t0 c22437t0 = this.f40615I;
        AbstractC22443w0 abstractC22443w0 = c22437t0.f40876c;
        AbstractC22443w0.e eVar = AbstractC22443w0.f40890L;
        long jC1 = abstractC22443w0.c1(j12, true);
        AbstractC22443w0 abstractC22443w02 = c22437t0.f40876c;
        AbstractC22443w0.f40890L.getClass();
        AbstractC22443w0.b bVar = AbstractC22443w0.f40897S;
        androidx.compose.ui.input.pointer.U.f40189b.getClass();
        abstractC22443w02.s1(bVar, jC1, c22444x, androidx.compose.ui.input.pointer.U.f40190c, z12);
    }

    public final void V(int i12, @Y61.k LayoutNode layoutNode) {
        if (layoutNode.f40640p != null && layoutNode.f40641q != null) {
            C47949a.b(z(layoutNode));
        }
        layoutNode.f40640p = this;
        C22433r0<LayoutNode> c22433r0 = this.f40637m;
        c22433r0.f40866a.a(i12, layoutNode);
        ((g) c22433r0.f40867b).invoke();
        f0();
        if (layoutNode.f40626b) {
            this.f40636l++;
        }
        a0();
        AndroidComposeView androidComposeView = this.f40641q;
        if (androidComposeView != null) {
            layoutNode.o(androidComposeView);
        }
        if (layoutNode.f40616J.f40689l > 0) {
            T t12 = this.f40616J;
            t12.c(t12.f40689l + 1);
        }
    }

    public final void W() {
        if (this.f40619M) {
            C22437t0 c22437t0 = this.f40615I;
            AbstractC22443w0 abstractC22443w0 = c22437t0.f40875b;
            AbstractC22443w0 abstractC22443w02 = c22437t0.f40876c.f40913r;
            this.f40618L = null;
            while (true) {
                if (kotlin.jvm.internal.L.f(abstractC22443w0, abstractC22443w02)) {
                    break;
                }
                if ((abstractC22443w0 != null ? abstractC22443w0.f40907J : null) != null) {
                    this.f40618L = abstractC22443w0;
                    break;
                }
                abstractC22443w0 = abstractC22443w0 != null ? abstractC22443w0.f40913r : null;
            }
        }
        AbstractC22443w0 abstractC22443w03 = this.f40618L;
        if (abstractC22443w03 != null && abstractC22443w03.f40907J == null) {
            throw androidx.compose.foundation.H.s("layer was not set");
        }
        if (abstractC22443w03 != null) {
            abstractC22443w03.C1();
            return;
        }
        LayoutNode layoutNodeK = K();
        if (layoutNodeK != null) {
            layoutNodeK.W();
        }
    }

    public final void X() {
        C22437t0 c22437t0 = this.f40615I;
        C22448z c22448z = c22437t0.f40875b;
        for (AbstractC22443w0 abstractC22443w0 = c22437t0.f40876c; abstractC22443w0 != c22448z; abstractC22443w0 = abstractC22443w0.f40912q) {
            I0 i02 = ((L) abstractC22443w0).f40907J;
            if (i02 != null) {
                i02.invalidate();
            }
        }
        I0 i03 = c22437t0.f40875b.f40907J;
        if (i03 != null) {
            i03.invalidate();
        }
    }

    public final void Y() {
        this.f40631g = true;
        if (this.f40635k != null) {
            m0(this, false, 7);
        } else {
            o0(this, false, 7);
        }
    }

    public final void Z() {
        if (this.f40647w) {
            return;
        }
        if (!androidx.compose.ui.l.f40322c) {
            this.f40646v = null;
            ((AndroidComposeView) S.a(this)).E();
            return;
        }
        this.f40615I.getClass();
        if (C22439u0.f40888a.f42885g != null || this.f40621O != null) {
            this.f40645u = true;
            return;
        }
        androidx.compose.ui.semantics.l lVar = this.f40646v;
        this.f40646v = p();
        this.f40645u = false;
        J0 j0A = S.a(this);
        androidx.collection.N0<androidx.compose.ui.semantics.p> n02 = j0A.getSemanticsOwner().f41805d;
        Object[] objArr = n02.f25659a;
        int i12 = n02.f25660b;
        for (int i13 = 0; i13 < i12; i13++) {
            ((androidx.compose.ui.semantics.p) objArr[i13]).b(this, lVar);
        }
        ((AndroidComposeView) j0A).E();
    }

    @Override // androidx.compose.ui.node.InterfaceC22413h
    public final void a(@Y61.k LayoutDirection layoutDirection) {
        if (this.f40609C != layoutDirection) {
            this.f40609C = layoutDirection;
            Y();
            LayoutNode layoutNodeK = K();
            if (layoutNodeK != null) {
                layoutNodeK.W();
            }
            X();
            for (v.d dVar = this.f40615I.f40878e; dVar != null; dVar = dVar.f42885g) {
                dVar.H1();
            }
        }
    }

    public final void a0() {
        LayoutNode layoutNode;
        if (this.f40636l > 0) {
            this.f40639o = true;
        }
        if (!this.f40626b || (layoutNode = this.f40640p) == null) {
            return;
        }
        layoutNode.a0();
    }

    @Override // androidx.compose.ui.node.InterfaceC22413h
    public final void b(@Y61.k InterfaceC22365i0 interfaceC22365i0) {
        if (kotlin.jvm.internal.L.f(this.f40650z, interfaceC22365i0)) {
            return;
        }
        this.f40650z = interfaceC22365i0;
        D d12 = this.f40607A;
        if (d12 != null) {
            ((C22082i3) d12.f40558b).setValue(interfaceC22365i0);
        }
        Y();
    }

    @Y61.l
    public final Boolean b0() {
        C22404c0 c22404c0 = this.f40616J.f40694q;
        if (c22404c0 != null) {
            return Boolean.valueOf(c22404c0.getF40848u());
        }
        return null;
    }

    @Override // androidx.compose.runtime.InterfaceC22198x
    public final void c() {
        boolean z12 = androidx.compose.ui.l.f40320a;
        androidx.compose.ui.viewinterop.a aVar = this.f40642r;
        if (aVar != null) {
            aVar.c();
        }
        androidx.compose.ui.layout.Q q12 = this.f40617K;
        if (q12 != null) {
            q12.c();
        }
        C22437t0 c22437t0 = this.f40615I;
        AbstractC22443w0 abstractC22443w0 = c22437t0.f40875b.f40912q;
        for (AbstractC22443w0 abstractC22443w02 = c22437t0.f40876c; !kotlin.jvm.internal.L.f(abstractC22443w02, abstractC22443w0) && abstractC22443w02 != null; abstractC22443w02 = abstractC22443w02.f40912q) {
            abstractC22443w02.f40914s = true;
            ((AbstractC22443w0.i) abstractC22443w02.f40905H).invoke();
            if (abstractC22443w02.f40907J != null) {
                if (abstractC22443w02.f40908K != null) {
                    abstractC22443w02.f40908K = null;
                }
                abstractC22443w02.b2(null, false);
                abstractC22443w02.f40909n.n0(false);
            }
        }
        boolean z13 = androidx.compose.ui.l.f40320a;
    }

    public final void c0() {
        LayoutNode layoutNodeK;
        if (this.f40612F == UsageByParent.f40660d) {
            v();
        }
        C22404c0 c22404c0 = this.f40616J.f40694q;
        try {
            c22404c0.f40746h = true;
            if (!c22404c0.f40751m) {
                C47949a.b("replace() called on item that was not placed");
            }
            c22404c0.f40764z = false;
            boolean f40848u = c22404c0.getF40848u();
            c22404c0.z0(c22404c0.f40754p, c22404c0.f40755q, c22404c0.f40756r);
            if (f40848u && !c22404c0.f40764z && (layoutNodeK = c22404c0.f40745g.f40678a.K()) != null) {
                layoutNodeK.l0(false);
            }
            c22404c0.f40746h = false;
        } catch (Throwable th2) {
            c22404c0.f40746h = false;
            throw th2;
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC22413h
    public final void d(@Y61.k androidx.compose.ui.v vVar) {
        if (this.f40626b && this.f40620N != androidx.compose.ui.v.f42878y1) {
            C47949a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f40625S) {
            C47949a.a("modifier is updated when deactivated");
        }
        if (!m()) {
            this.f40621O = vVar;
            return;
        }
        n(vVar);
        if (this.f40645u) {
            Z();
        }
    }

    public final void d0(int i12, int i13, int i14) {
        if (i12 == i13) {
            return;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i12 > i13 ? i12 + i15 : i12;
            int i17 = i12 > i13 ? i13 + i15 : (i13 + i14) - 2;
            C22433r0<LayoutNode> c22433r0 = this.f40637m;
            LayoutNode layoutNodeK = c22433r0.f40866a.k(i16);
            Y41.a<kotlin.G0> aVar = c22433r0.f40867b;
            ((g) aVar).invoke();
            c22433r0.f40866a.a(i17, layoutNodeK);
            ((g) aVar).invoke();
        }
        f0();
        a0();
        Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.node.InterfaceC22413h
    public final void e(@Y61.k androidx.compose.runtime.U u12) {
        this.f40611E = u12;
        k((androidx.compose.ui.unit.d) u12.a(androidx.compose.ui.platform.Q0.f41199h));
        a((LayoutDirection) u12.a(androidx.compose.ui.platform.Q0.f41205n));
        l((InterfaceC22544x2) u12.a(androidx.compose.ui.platform.Q0.f41210s));
        v.d dVar = this.f40615I.f40878e;
        if ((dVar.f42883e & 32768) != 0) {
            while (dVar != null) {
                if ((dVar.f42882d & 32768) != 0) {
                    AbstractC22425n abstractC22425nB = dVar;
                    ?? eVar = 0;
                    while (abstractC22425nB != 0) {
                        if (abstractC22425nB instanceof InterfaceC22415i) {
                            v.d f42880b = ((InterfaceC22415i) abstractC22425nB).getF42880b();
                            if (f42880b.f42893o) {
                                A0.c(f42880b);
                            } else {
                                f42880b.f42889k = true;
                            }
                        } else if ((abstractC22425nB.f42882d & 32768) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                            v.d dVar2 = abstractC22425nB.f40861q;
                            int i12 = 0;
                            abstractC22425nB = abstractC22425nB;
                            eVar = eVar;
                            while (dVar2 != null) {
                                if ((dVar2.f42882d & 32768) != 0) {
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
                if ((dVar.f42883e & 32768) == 0) {
                    return;
                } else {
                    dVar = dVar.f42885g;
                }
            }
        }
    }

    public final void e0(LayoutNode layoutNode) {
        if (layoutNode.f40616J.f40689l > 0) {
            this.f40616J.c(r0.f40689l - 1);
        }
        if (this.f40641q != null) {
            layoutNode.x();
        }
        layoutNode.f40640p = null;
        layoutNode.f40615I.f40876c.f40913r = null;
        if (layoutNode.f40626b) {
            this.f40636l--;
            androidx.compose.runtime.collection.e<LayoutNode> eVar = layoutNode.f40637m.f40866a;
            LayoutNode[] layoutNodeArr = eVar.f38260b;
            int i12 = eVar.f38262d;
            for (int i13 = 0; i13 < i12; i13++) {
                layoutNodeArr[i13].f40615I.f40876c.f40913r = null;
            }
        }
        a0();
        f0();
    }

    @Override // androidx.compose.runtime.InterfaceC22198x
    public final void f() {
        androidx.compose.ui.autofill.e eVar;
        if (!m()) {
            C47949a.a("onReuse is only expected on attached node");
        }
        boolean z12 = androidx.compose.ui.l.f40320a;
        androidx.compose.ui.viewinterop.a aVar = this.f40642r;
        if (aVar != null) {
            aVar.f();
        }
        androidx.compose.ui.layout.Q q12 = this.f40617K;
        if (q12 != null) {
            q12.d(false);
        }
        this.f40647w = false;
        boolean z13 = this.f40625S;
        C22437t0 c22437t0 = this.f40615I;
        if (z13) {
            this.f40625S = false;
            if (!androidx.compose.ui.l.f40322c) {
                Z();
            }
        } else {
            for (v.d dVar = c22437t0.f40877d; dVar != null; dVar = dVar.f42884f) {
                if (dVar.f42893o) {
                    dVar.f2();
                }
            }
            c22437t0.f();
            for (v.d dVar2 = c22437t0.f40877d; dVar2 != null; dVar2 = dVar2.f42884f) {
                if (dVar2.f42893o) {
                    dVar2.b2();
                }
            }
        }
        int i12 = this.f40627c;
        this.f40627c = androidx.compose.ui.semantics.r.f41791a.addAndGet(1);
        AndroidComposeView androidComposeView = this.f40641q;
        if (androidComposeView != null) {
            androidComposeView.m4getLayoutNodes().g(i12);
            androidComposeView.m4getLayoutNodes().h(this.f40627c, this);
        }
        for (v.d dVar3 = c22437t0.f40878e; dVar3 != null; dVar3 = dVar3.f42885g) {
            dVar3.a2();
        }
        c22437t0.e();
        if (androidx.compose.ui.l.f40322c && c22437t0.d(8)) {
            Z();
        }
        p0(this);
        AndroidComposeView androidComposeView2 = this.f40641q;
        if (androidComposeView2 != null) {
            if (androidx.compose.ui.l.f40322c && (eVar = androidComposeView2._autofillManager) != null) {
                androidx.collection.B0 b02 = eVar.f38883h;
                boolean zE2 = b02.e(i12);
                androidx.compose.ui.autofill.y yVar = eVar.f38876a;
                AndroidComposeView androidComposeView3 = eVar.f38878c;
                if (zE2) {
                    yVar.c(androidComposeView3, i12, false);
                }
                androidx.compose.ui.semantics.l lVarQ = Q();
                if (lVarQ != null && androidx.compose.ui.autofill.f.b(lVarQ)) {
                    b02.b(this.f40627c);
                    yVar.c(androidComposeView3, this.f40627c, true);
                }
            }
            androidComposeView2.getRectManager().f(this, this.f40616J.f40693p.f40842o, true);
        }
    }

    public final void f0() {
        if (!this.f40626b) {
            this.f40649y = true;
            return;
        }
        LayoutNode layoutNodeK = K();
        if (layoutNodeK != null) {
            layoutNodeK.f0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // androidx.compose.ui.node.J0.b
    public final void g() {
        v.d dVar;
        C22437t0 c22437t0 = this.f40615I;
        C22448z c22448z = c22437t0.f40875b;
        boolean zG2 = A0.g(128);
        if (zG2) {
            dVar = c22448z.f40957T;
        } else {
            dVar = c22448z.f40957T.f42884f;
            if (dVar == null) {
                return;
            }
        }
        AbstractC22443w0.e eVar = AbstractC22443w0.f40890L;
        for (v.d dVarM1 = c22448z.m1(zG2); dVarM1 != null && (dVarM1.f42883e & 128) != 0; dVarM1 = dVarM1.f42885g) {
            if ((dVarM1.f42882d & 128) != 0) {
                AbstractC22425n abstractC22425nB = dVarM1;
                ?? eVar2 = 0;
                while (abstractC22425nB != 0) {
                    if (abstractC22425nB instanceof F) {
                        ((F) abstractC22425nB).D(c22437t0.f40875b);
                    } else if ((abstractC22425nB.f42882d & 128) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                        v.d dVar2 = abstractC22425nB.f40861q;
                        int i12 = 0;
                        abstractC22425nB = abstractC22425nB;
                        eVar2 = eVar2;
                        while (dVar2 != null) {
                            if ((dVar2.f42882d & 128) != 0) {
                                i12++;
                                eVar2 = eVar2;
                                if (i12 == 1) {
                                    abstractC22425nB = dVar2;
                                } else {
                                    if (eVar2 == 0) {
                                        eVar2 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                    }
                                    if (abstractC22425nB != 0) {
                                        eVar2.b(abstractC22425nB);
                                        abstractC22425nB = 0;
                                    }
                                    eVar2.b(dVar2);
                                }
                            }
                            dVar2 = dVar2.f42885g;
                            abstractC22425nB = abstractC22425nB;
                            eVar2 = eVar2;
                        }
                        if (i12 == 1) {
                        }
                    }
                    abstractC22425nB = C22421l.b(eVar2);
                }
            }
            if (dVarM1 == dVar) {
                return;
            }
        }
    }

    public final boolean g0(@Y61.l C22712b c22712b) {
        if (c22712b == null) {
            return false;
        }
        if (this.f40612F == UsageByParent.f40660d) {
            q();
        }
        return this.f40616J.f40693p.E0(c22712b.f42843a);
    }

    @Override // androidx.compose.ui.node.InterfaceC22413h
    public final void h(int i12) {
        this.f40633i = i12;
    }

    @Override // androidx.compose.runtime.InterfaceC22198x
    public final void i() {
        androidx.compose.ui.autofill.e eVar;
        boolean z12 = androidx.compose.ui.l.f40320a;
        androidx.compose.ui.viewinterop.a aVar = this.f40642r;
        if (aVar != null) {
            aVar.i();
        }
        androidx.compose.ui.layout.Q q12 = this.f40617K;
        if (q12 != null) {
            q12.d(true);
        }
        this.f40625S = true;
        C22437t0 c22437t0 = this.f40615I;
        for (v.d dVar = c22437t0.f40877d; dVar != null; dVar = dVar.f42884f) {
            if (dVar.f42893o) {
                dVar.f2();
            }
        }
        c22437t0.f();
        for (v.d dVar2 = c22437t0.f40877d; dVar2 != null; dVar2 = dVar2.f42884f) {
            if (dVar2.f42893o) {
                dVar2.b2();
            }
        }
        if (m()) {
            if (androidx.compose.ui.l.f40322c) {
                this.f40646v = null;
                this.f40645u = false;
            } else {
                Z();
            }
        }
        AndroidComposeView androidComposeView = this.f40641q;
        if (androidComposeView != null) {
            if (androidx.compose.ui.l.f40320a) {
                androidComposeView.getRectManager().h(this);
            }
            if (!androidx.compose.ui.l.f40322c || (eVar = androidComposeView._autofillManager) == null) {
                return;
            }
            if (eVar.f38883h.e(this.f40627c)) {
                eVar.f38876a.c(eVar.f38878c, this.f40627c, false);
            }
        }
    }

    public final void i0() {
        C22433r0<LayoutNode> c22433r0 = this.f40637m;
        int i12 = c22433r0.f40866a.f38262d;
        while (true) {
            i12--;
            if (-1 >= i12) {
                c22433r0.f40866a.g();
                c22433r0.f40867b.invoke();
                return;
            }
            e0(c22433r0.f40866a.f38260b[i12]);
        }
    }

    @Override // androidx.compose.ui.layout.N0
    public final void j() {
        if (this.f40635k != null) {
            m0(this, false, 5);
        } else {
            o0(this, false, 5);
        }
        C22418j0 c22418j0 = this.f40616J.f40693p;
        C22712b c22712bA = c22418j0.f40838k ? C22712b.a(c22418j0.f40348e) : null;
        if (c22712bA != null) {
            AndroidComposeView androidComposeView = this.f40641q;
            if (androidComposeView != null) {
                androidComposeView.x(this, c22712bA.f42843a);
                return;
            }
            return;
        }
        AndroidComposeView androidComposeView2 = this.f40641q;
        if (androidComposeView2 != null) {
            J0.a aVar = J0.f40575D1;
            androidComposeView2.w(true);
        }
    }

    public final void j0(int i12, int i13) {
        if (i13 < 0) {
            C47949a.a("count (" + i13 + ") must be greater than 0");
        }
        int i14 = (i13 + i12) - 1;
        if (i12 > i14) {
            return;
        }
        while (true) {
            C22433r0<LayoutNode> c22433r0 = this.f40637m;
            e0(c22433r0.f40866a.f38260b[i14]);
            c22433r0.f40866a.k(i14);
            ((g) c22433r0.f40867b).invoke();
            if (i14 == i12) {
                return;
            } else {
                i14--;
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC22413h
    public final void k(@Y61.k androidx.compose.ui.unit.d dVar) {
        if (kotlin.jvm.internal.L.f(this.f40608B, dVar)) {
            return;
        }
        this.f40608B = dVar;
        Y();
        LayoutNode layoutNodeK = K();
        if (layoutNodeK != null) {
            layoutNodeK.W();
        }
        X();
        for (v.d dVar2 = this.f40615I.f40878e; dVar2 != null; dVar2 = dVar2.f42885g) {
            dVar2.B();
        }
    }

    public final void k0() {
        LayoutNode layoutNodeK;
        if (this.f40612F == UsageByParent.f40660d) {
            v();
        }
        C22418j0 c22418j0 = this.f40616J.f40693p;
        c22418j0.getClass();
        try {
            c22418j0.f40835h = true;
            if (!c22418j0.f40839l) {
                C47949a.b("replace called on unplaced item");
            }
            boolean z12 = c22418j0.f40848u;
            c22418j0.B0(c22418j0.f40842o, c22418j0.f40845r, c22418j0.f40843p, c22418j0.f40844q);
            if (z12 && !c22418j0.f40827H && (layoutNodeK = c22418j0.f40834g.f40678a.K()) != null) {
                layoutNodeK.n0(false);
            }
            c22418j0.f40835h = false;
        } catch (Throwable th2) {
            c22418j0.f40835h = false;
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.node.InterfaceC22413h
    public final void l(@Y61.k InterfaceC22544x2 interfaceC22544x2) {
        if (kotlin.jvm.internal.L.f(this.f40610D, interfaceC22544x2)) {
            return;
        }
        this.f40610D = interfaceC22544x2;
        v.d dVar = this.f40615I.f40878e;
        if ((dVar.f42883e & 16) != 0) {
            while (dVar != null) {
                if ((dVar.f42882d & 16) != 0) {
                    AbstractC22425n abstractC22425nB = dVar;
                    ?? eVar = 0;
                    while (abstractC22425nB != 0) {
                        if (abstractC22425nB instanceof P0) {
                            ((P0) abstractC22425nB).Q0();
                        } else if ((abstractC22425nB.f42882d & 16) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                            v.d dVar2 = abstractC22425nB.f40861q;
                            int i12 = 0;
                            abstractC22425nB = abstractC22425nB;
                            eVar = eVar;
                            while (dVar2 != null) {
                                if ((dVar2.f42882d & 16) != 0) {
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
                if ((dVar.f42883e & 16) == 0) {
                    return;
                } else {
                    dVar = dVar.f42885g;
                }
            }
        }
    }

    public final void l0(boolean z12) {
        AndroidComposeView androidComposeView;
        if (this.f40626b || (androidComposeView = this.f40641q) == null) {
            return;
        }
        androidComposeView.D(this, true, z12);
    }

    @Override // androidx.compose.ui.layout.F
    public final boolean m() {
        return this.f40641q != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(androidx.compose.ui.v vVar) {
        this.f40620N = vVar;
        C22437t0 c22437t0 = this.f40615I;
        v.d dVar = c22437t0.f40878e;
        v.d dVar2 = C22439u0.f40888a;
        if (dVar == dVar2) {
            C47949a.b("padChain called on already padded chain");
        }
        v.d dVar3 = c22437t0.f40878e;
        dVar3.f42884f = dVar2;
        dVar2.f42885g = dVar3;
        androidx.compose.runtime.collection.e<v.c> eVar = c22437t0.f40879f;
        int i12 = eVar != null ? eVar.f38262d : 0;
        androidx.compose.runtime.collection.e<v.c> eVar2 = c22437t0.f40880g;
        if (eVar2 == null) {
            eVar2 = new androidx.compose.runtime.collection.e<>(new v.c[16], 0);
        }
        androidx.compose.runtime.collection.e<v.c> eVar3 = eVar2;
        int i13 = eVar3.f38262d;
        if (i13 < 16) {
            i13 = 16;
        }
        androidx.compose.runtime.collection.e eVar4 = new androidx.compose.runtime.collection.e(new androidx.compose.ui.v[i13], 0);
        eVar4.b(vVar);
        C22441v0 c22441v0 = null;
        while (true) {
            int i14 = eVar4.f38262d;
            if (i14 == 0) {
                break;
            }
            androidx.compose.ui.v vVar2 = (androidx.compose.ui.v) eVar4.k(i14 - 1);
            if (vVar2 instanceof androidx.compose.ui.k) {
                androidx.compose.ui.k kVar = (androidx.compose.ui.k) vVar2;
                eVar4.b(kVar.f40318c);
                eVar4.b(kVar.f40317b);
            } else if (vVar2 instanceof v.c) {
                eVar3.b(vVar2);
            } else {
                if (c22441v0 == null) {
                    c22441v0 = new C22441v0(eVar3);
                }
                vVar2.I(c22441v0);
                c22441v0 = c22441v0;
            }
        }
        int i15 = eVar3.f38262d;
        v.d dVar4 = c22437t0.f40877d;
        LayoutNode layoutNode = c22437t0.f40874a;
        if (i15 == i12) {
            v.d dVar5 = dVar2.f42885g;
            int i16 = 0;
            while (true) {
                if (dVar5 == null || i16 >= i12) {
                    break;
                }
                if (eVar == null) {
                    throw androidx.compose.foundation.H.s("expected prior modifier list to be non-empty");
                }
                v.c cVar = eVar.f38260b[i16];
                v.c cVar2 = eVar3.f38260b[i16];
                boolean z12 = kotlin.jvm.internal.L.f(cVar, cVar2) ? 2 : C22214e.a(cVar, cVar2);
                if (!z12) {
                    dVar5 = dVar5.f42884f;
                    break;
                }
                if (z12) {
                    C22437t0.i(cVar, cVar2, dVar5);
                }
                dVar5 = dVar5.f42885g;
                i16++;
            }
            v.d dVar6 = dVar5;
            if (i16 < i12) {
                if (eVar == null) {
                    throw androidx.compose.foundation.H.s("expected prior modifier list to be non-empty");
                }
                if (dVar6 == null) {
                    throw androidx.compose.foundation.H.s("structuralUpdate requires a non-null tail");
                }
                c22437t0.g(i16, eVar, eVar3, dVar6, (layoutNode.f40621O != null ? 1 : 0) ^ 1);
                i = 1;
            }
        } else {
            androidx.compose.ui.v vVar3 = layoutNode.f40621O;
            if (vVar3 != null && i12 == 0) {
                v.d dVarB = dVar2;
                for (int i17 = 0; i17 < eVar3.f38262d; i17++) {
                    dVarB = C22437t0.b(eVar3.f38260b[i17], dVarB);
                }
                for (v.d dVar7 = dVar4.f42884f; dVar7 != null && dVar7 != C22439u0.f40888a; dVar7 = dVar7.f42884f) {
                    i |= dVar7.f42882d;
                    dVar7.f42883e = i;
                }
            } else if (i15 != 0) {
                if (eVar == null) {
                    eVar = new androidx.compose.runtime.collection.e<>(new v.c[16], 0);
                }
                c22437t0.g(0, eVar, eVar3, dVar2, (vVar3 != null ? 1 : 0) ^ 1);
            } else {
                if (eVar == null) {
                    throw androidx.compose.foundation.H.s("expected prior modifier list to be non-empty");
                }
                v.d dVar8 = dVar2.f42885g;
                for (int i18 = 0; dVar8 != null && i18 < eVar.f38262d; i18++) {
                    dVar8 = C22437t0.c(dVar8).f42885g;
                }
                LayoutNode layoutNodeK = layoutNode.K();
                C22448z c22448z = layoutNodeK != null ? layoutNodeK.f40615I.f40875b : null;
                C22448z c22448z2 = c22437t0.f40875b;
                c22448z2.f40913r = c22448z;
                c22437t0.f40876c = c22448z2;
            }
            i = 1;
        }
        c22437t0.f40879f = eVar3;
        if (eVar != null) {
            eVar.g();
        } else {
            eVar = null;
        }
        c22437t0.f40880g = eVar;
        v.d dVar9 = C22439u0.f40888a;
        if (dVar2 != dVar9) {
            C47949a.b("trimChain called on already trimmed chain");
        }
        v.d dVar10 = dVar9.f42885g;
        if (dVar10 != null) {
            dVar4 = dVar10;
        }
        dVar4.f42884f = null;
        dVar9.f42885g = null;
        dVar9.f42883e = -1;
        dVar9.f42887i = null;
        if (dVar4 == dVar9) {
            C47949a.b("trimChain did not update the head");
        }
        c22437t0.f40878e = dVar4;
        if (i != 0) {
            c22437t0.h();
        }
        this.f40616J.i();
        if (this.f40635k == null && c22437t0.d(512)) {
            r0(this);
        }
    }

    public final void n0(boolean z12) {
        AndroidComposeView androidComposeView;
        this.f40631g = true;
        if (this.f40626b || (androidComposeView = this.f40641q) == null) {
            return;
        }
        J0.a aVar = J0.f40575D1;
        androidComposeView.D(this, false, z12);
    }

    @Override // androidx.compose.ui.node.K0
    public final boolean n1() {
        return m();
    }

    public final void o(@Y61.k AndroidComposeView androidComposeView) {
        LayoutNode layoutNode;
        androidx.compose.ui.autofill.e eVar;
        androidx.compose.ui.semantics.l lVarQ;
        if (!(this.f40641q == null)) {
            C47949a.b("Cannot attach " + this + " as it already is attached.  Tree: " + w(0));
        }
        LayoutNode layoutNode2 = this.f40640p;
        if (layoutNode2 != null && !kotlin.jvm.internal.L.f(layoutNode2.f40641q, androidComposeView)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(androidComposeView);
            sb2.append(") than the parent's owner(");
            LayoutNode layoutNodeK = K();
            sb2.append(layoutNodeK != null ? layoutNodeK.f40641q : null);
            sb2.append("). This tree: ");
            sb2.append(w(0));
            sb2.append(" Parent tree: ");
            LayoutNode layoutNode3 = this.f40640p;
            sb2.append(layoutNode3 != null ? layoutNode3.w(0) : null);
            C47949a.b(sb2.toString());
        }
        LayoutNode layoutNodeK2 = K();
        T t12 = this.f40616J;
        if (layoutNodeK2 == null) {
            t12.f40693p.f40848u = true;
            C22404c0 c22404c0 = t12.f40694q;
            if (c22404c0 != null) {
                c22404c0.f40757s = C22404c0.a.f40765b;
            }
        }
        C22437t0 c22437t0 = this.f40615I;
        c22437t0.f40876c.f40913r = layoutNodeK2 != null ? layoutNodeK2.f40615I.f40875b : null;
        this.f40641q = androidComposeView;
        this.f40643s = (layoutNodeK2 != null ? layoutNodeK2.f40643s : -1) + 1;
        androidx.compose.ui.v vVar = this.f40621O;
        if (vVar != null) {
            n(vVar);
        }
        this.f40621O = null;
        if (!androidx.compose.ui.l.f40322c && c22437t0.d(8)) {
            Z();
        }
        androidComposeView.m4getLayoutNodes().h(this.f40627c, this);
        if (this.f40634j) {
            r0(this);
        } else {
            LayoutNode layoutNode4 = this.f40640p;
            if (layoutNode4 == null || (layoutNode = layoutNode4.f40635k) == null) {
                layoutNode = this.f40635k;
            }
            r0(layoutNode);
            if (this.f40635k == null && c22437t0.d(512)) {
                r0(this);
            }
        }
        if (!this.f40625S) {
            for (v.d dVar = c22437t0.f40878e; dVar != null; dVar = dVar.f42885g) {
                dVar.a2();
            }
        }
        androidx.compose.runtime.collection.e<LayoutNode> eVar2 = this.f40637m.f40866a;
        LayoutNode[] layoutNodeArr = eVar2.f38260b;
        int i12 = eVar2.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            layoutNodeArr[i13].o(androidComposeView);
        }
        if (!this.f40625S) {
            c22437t0.e();
        }
        Y();
        if (layoutNodeK2 != null) {
            layoutNodeK2.Y();
        }
        AbstractC22443w0 abstractC22443w0 = c22437t0.f40875b.f40912q;
        for (AbstractC22443w0 abstractC22443w02 = c22437t0.f40876c; !kotlin.jvm.internal.L.f(abstractC22443w02, abstractC22443w0) && abstractC22443w02 != null; abstractC22443w02 = abstractC22443w02.f40912q) {
            abstractC22443w02.b2(abstractC22443w02.f40916u, true);
            I0 i02 = abstractC22443w02.f40907J;
            if (i02 != null) {
                i02.invalidate();
            }
        }
        Y41.l<? super J0, kotlin.G0> lVar = this.f40622P;
        if (lVar != null) {
            lVar.invoke(androidComposeView);
        }
        t12.i();
        if (androidx.compose.ui.l.f40322c && !this.f40625S && c22437t0.d(8)) {
            Z();
        }
        if (!androidx.compose.ui.l.f40322c || (eVar = androidComposeView._autofillManager) == null || (lVarQ = Q()) == null || !androidx.compose.ui.autofill.f.b(lVarQ)) {
            return;
        }
        eVar.f38883h.b(this.f40627c);
        eVar.f38876a.c(eVar.f38878c, this.f40627c, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.ui.semantics.l] */
    public final androidx.compose.ui.semantics.l p() {
        this.f40647w = true;
        l0.h hVar = new l0.h();
        hVar.f406842b = new androidx.compose.ui.semantics.l();
        L0 snapshotObserver = S.a(this).getSnapshotObserver();
        snapshotObserver.b(this, snapshotObserver.f40589d, new h(hVar));
        this.f40647w = false;
        return (androidx.compose.ui.semantics.l) hVar.f406842b;
    }

    public final void q() {
        this.f40613G = this.f40612F;
        this.f40612F = UsageByParent.f40660d;
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i12 = eVarO.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            LayoutNode layoutNode = layoutNodeArr[i13];
            if (layoutNode.f40612F != UsageByParent.f40660d) {
                layoutNode.q();
            }
        }
    }

    public final void q0() {
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i12 = eVarO.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            LayoutNode layoutNode = layoutNodeArr[i13];
            UsageByParent usageByParent = layoutNode.f40613G;
            layoutNode.f40612F = usageByParent;
            if (usageByParent != UsageByParent.f40660d) {
                layoutNode.q0();
            }
        }
    }

    @Override // androidx.compose.ui.layout.F
    public final boolean r() {
        return this.f40616J.f40693p.f40848u;
    }

    public final void r0(LayoutNode layoutNode) {
        if (kotlin.jvm.internal.L.f(layoutNode, this.f40635k)) {
            return;
        }
        this.f40635k = layoutNode;
        T t12 = this.f40616J;
        if (layoutNode != null) {
            if (t12.f40694q == null) {
                t12.f40694q = new C22404c0(t12);
            }
            C22437t0 c22437t0 = this.f40615I;
            AbstractC22443w0 abstractC22443w0 = c22437t0.f40875b.f40912q;
            for (AbstractC22443w0 abstractC22443w02 = c22437t0.f40876c; !kotlin.jvm.internal.L.f(abstractC22443w02, abstractC22443w0) && abstractC22443w02 != null; abstractC22443w02 = abstractC22443w02.f40912q) {
                abstractC22443w02.a1();
            }
        } else {
            t12.f40694q = null;
        }
        Y();
    }

    @Override // androidx.compose.ui.layout.F
    /* renamed from: s, reason: from getter */
    public final int getF40627c() {
        return this.f40627c;
    }

    public final void s0() {
        if (this.f40636l <= 0 || !this.f40639o) {
            return;
        }
        this.f40639o = false;
        androidx.compose.runtime.collection.e<LayoutNode> eVar = this.f40638n;
        if (eVar == null) {
            eVar = new androidx.compose.runtime.collection.e<>(new LayoutNode[16], 0);
            this.f40638n = eVar;
        }
        eVar.g();
        androidx.compose.runtime.collection.e<LayoutNode> eVar2 = this.f40637m.f40866a;
        LayoutNode[] layoutNodeArr = eVar2.f38260b;
        int i12 = eVar2.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            LayoutNode layoutNode = layoutNodeArr[i13];
            if (layoutNode.f40626b) {
                eVar.c(eVar.f38262d, layoutNode.O());
            } else {
                eVar.b(layoutNode);
            }
        }
        T t12 = this.f40616J;
        t12.f40693p.f40821B = true;
        C22404c0 c22404c0 = t12.f40694q;
        if (c22404c0 != null) {
            c22404c0.f40760v = true;
        }
    }

    @Override // androidx.compose.ui.layout.F
    public final LayoutNode t() {
        return K();
    }

    @Y61.k
    public final String toString() {
        return B1.a(this) + " children: " + C().size() + " measurePolicy: " + this.f40650z;
    }

    @Override // androidx.compose.ui.layout.F
    /* renamed from: u, reason: from getter */
    public final boolean getF40625S() {
        return this.f40625S;
    }

    public final void v() {
        this.f40613G = this.f40612F;
        this.f40612F = UsageByParent.f40660d;
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i12 = eVarO.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            LayoutNode layoutNode = layoutNodeArr[i13];
            if (layoutNode.f40612F == UsageByParent.f40659c) {
                layoutNode.v();
            }
        }
    }

    public final String w(int i12) {
        StringBuilder sb2 = new StringBuilder();
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i14 = eVarO.f38262d;
        for (int i15 = 0; i15 < i14; i15++) {
            sb2.append(layoutNodeArr[i15].w(i12 + 1));
        }
        String string = sb2.toString();
        return i12 == 0 ? androidx.compose.ui.graphics.colorspace.e.h(1, 0, string) : string;
    }

    public final void x() {
        androidx.compose.ui.autofill.e eVar;
        W w12;
        AndroidComposeView androidComposeView = this.f40641q;
        if (androidComposeView == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode layoutNodeK = K();
            sb2.append(layoutNodeK != null ? layoutNodeK.w(0) : null);
            C47949a.c(sb2.toString());
            throw new KotlinNothingValueException();
        }
        LayoutNode layoutNodeK2 = K();
        T t12 = this.f40616J;
        if (layoutNodeK2 != null) {
            layoutNodeK2.W();
            layoutNodeK2.Y();
            C22418j0 c22418j0 = t12.f40693p;
            UsageByParent usageByParent = UsageByParent.f40660d;
            c22418j0.f40840m = usageByParent;
            C22404c0 c22404c0 = t12.f40694q;
            if (c22404c0 != null) {
                c22404c0.f40749k = usageByParent;
            }
        }
        O o12 = t12.f40693p.f40853z;
        o12.f40722b = true;
        o12.f40723c = false;
        o12.f40725e = false;
        o12.f40724d = false;
        o12.f40726f = false;
        o12.f40727g = false;
        o12.f40728h = null;
        C22404c0 c22404c02 = t12.f40694q;
        if (c22404c02 != null && (w12 = c22404c02.f40758t) != null) {
            w12.f40722b = true;
            w12.f40723c = false;
            w12.f40725e = false;
            w12.f40724d = false;
            w12.f40726f = false;
            w12.f40727g = false;
            w12.f40728h = null;
        }
        Y41.l<? super J0, kotlin.G0> lVar = this.f40623Q;
        if (lVar != null) {
            lVar.invoke(androidComposeView);
        }
        boolean z12 = androidx.compose.ui.l.f40322c;
        C22437t0 c22437t0 = this.f40615I;
        if (!z12 && c22437t0.d(8)) {
            Z();
        }
        c22437t0.f();
        this.f40644t = true;
        androidx.compose.runtime.collection.e<LayoutNode> eVar2 = this.f40637m.f40866a;
        LayoutNode[] layoutNodeArr = eVar2.f38260b;
        int i12 = eVar2.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            layoutNodeArr[i13].x();
        }
        this.f40644t = false;
        for (v.d dVar = c22437t0.f40877d; dVar != null; dVar = dVar.f42884f) {
            if (dVar.f42893o) {
                dVar.b2();
            }
        }
        androidComposeView.m4getLayoutNodes().g(this.f40627c);
        C22414h0 c22414h0 = androidComposeView.f40988P;
        C22431q c22431q = c22414h0.f40809b;
        c22431q.f40864a.b(this);
        c22431q.f40865b.b(this);
        c22414h0.f40812e.f40572a.j(this);
        androidComposeView.f40978G = true;
        if (androidx.compose.ui.l.f40320a) {
            androidComposeView.getRectManager().h(this);
        }
        if (androidx.compose.ui.l.f40322c && (eVar = androidComposeView._autofillManager) != null) {
            if (eVar.f38883h.e(this.f40627c)) {
                eVar.f38876a.c(eVar.f38878c, this.f40627c, false);
            }
        }
        this.f40641q = null;
        r0(null);
        this.f40643s = 0;
        C22418j0 c22418j02 = t12.f40693p;
        c22418j02.f40837j = Integer.MAX_VALUE;
        c22418j02.f40836i = Integer.MAX_VALUE;
        c22418j02.f40848u = false;
        C22404c0 c22404c03 = t12.f40694q;
        if (c22404c03 != null) {
            c22404c03.f40748j = Integer.MAX_VALUE;
            c22404c03.f40747i = Integer.MAX_VALUE;
            c22404c03.f40757s = C22404c0.a.f40767d;
        }
        if (androidx.compose.ui.l.f40322c && c22437t0.d(8)) {
            androidx.compose.ui.semantics.l lVar2 = this.f40646v;
            this.f40646v = null;
            this.f40645u = false;
            androidx.collection.N0<androidx.compose.ui.semantics.p> n02 = androidComposeView.getSemanticsOwner().f41805d;
            Object[] objArr = n02.f25659a;
            int i14 = n02.f25660b;
            for (int i15 = 0; i15 < i14; i15++) {
                ((androidx.compose.ui.semantics.p) objArr[i15]).b(this, lVar2);
            }
            androidComposeView.E();
        }
    }

    public final void y(@Y61.k androidx.compose.ui.graphics.M m12, @Y61.l C22267c c22267c) {
        this.f40615I.f40876c.T0(m12, c22267c);
    }

    public LayoutNode(boolean z12, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? false : z12, (i13 & 2) != 0 ? androidx.compose.ui.semantics.r.f41791a.addAndGet(1) : i12);
    }

    public LayoutNode(boolean z12, int i12) {
        this.f40626b = z12;
        this.f40627c = i12;
        androidx.compose.ui.unit.q.f42862b.getClass();
        long j12 = androidx.compose.ui.unit.q.f42863c;
        this.f40628d = j12;
        androidx.compose.ui.unit.u.f42871b.getClass();
        this.f40629e = 0L;
        this.f40630f = j12;
        this.f40631g = true;
        this.f40637m = new C22433r0<>(new androidx.compose.runtime.collection.e(new LayoutNode[16], 0), new g());
        this.f40648x = new androidx.compose.runtime.collection.e<>(new LayoutNode[16], 0);
        this.f40649y = true;
        this.f40650z = f40603U;
        this.f40608B = S.f40677a;
        this.f40609C = LayoutDirection.f42838b;
        this.f40610D = f40605W;
        androidx.compose.runtime.U.f38152v1.getClass();
        this.f40611E = U.a.f38154b;
        UsageByParent usageByParent = UsageByParent.f40660d;
        this.f40612F = usageByParent;
        this.f40613G = usageByParent;
        this.f40615I = new C22437t0(this);
        this.f40616J = new T(this);
        this.f40619M = true;
        this.f40620N = androidx.compose.ui.v.f42878y1;
    }
}
