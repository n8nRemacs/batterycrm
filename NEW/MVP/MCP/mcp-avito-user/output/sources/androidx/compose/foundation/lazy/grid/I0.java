package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.W0;
import androidx.compose.foundation.gestures.G1;
import androidx.compose.foundation.gestures.U1;
import androidx.compose.foundation.gestures.W1;
import androidx.compose.foundation.lazy.layout.C20712c0;
import androidx.compose.foundation.lazy.layout.C20713d;
import androidx.compose.foundation.lazy.layout.C20714d0;
import androidx.compose.foundation.lazy.layout.C20718f0;
import androidx.compose.foundation.lazy.layout.C20725j;
import androidx.compose.foundation.lazy.layout.C20730l0;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.ui.node.LayoutNode;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyGridState.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/I0;", "Landroidx/compose/foundation/gestures/U1;", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I0 implements U1 {

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public static final c f29017w = new c(null);

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.runtime.saveable.w f29018x = androidx.compose.runtime.saveable.b.a(b.f29042l, a.f29041l);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final v0 f29019a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29020b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public C20689o0 f29021c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A0 f29022d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<C20689o0> f29023e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.interaction.m f29024f;

    /* renamed from: g, reason: collision with root package name */
    public float f29025g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final U1 f29026h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f29027i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public LayoutNode f29028j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final g f29029k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C20713d f29030l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final LazyLayoutItemAnimator<C20691p0> f29031m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C20725j f29032n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C20714d0 f29033o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final e f29034p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final C20712c0 f29035q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<kotlin.G0> f29036r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<kotlin.G0> f29037s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29038t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29039u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final C20718f0 f29040v;

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/foundation/lazy/grid/I0;", "it", "", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/foundation/lazy/grid/I0;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, I0, List<? extends Integer>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f29041l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final List<? extends Integer> invoke(androidx.compose.runtime.saveable.x xVar, I0 i02) {
            I0 i03 = i02;
            return C42745f0.U(Integer.valueOf(i03.h()), Integer.valueOf(i03.i()));
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Landroidx/compose/foundation/lazy/grid/I0;", "invoke", "(Ljava/util/List;)Landroidx/compose/foundation/lazy/grid/I0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<List<? extends Integer>, I0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f29042l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final I0 invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            return new I0(list2.get(0).intValue(), list2.get(1).intValue());
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/grid/I0$c;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/G1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/G1;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridState$animateScrollToItem$2", f = "LazyGridState.kt", i = {}, l = {492}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<G1, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f29043q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f29044r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f29046t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f29047u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i12, int i13, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f29046t = i12;
            this.f29047u = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            d dVar = I0.this.new d(this.f29046t, this.f29047u, continuation);
            dVar.f29044r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(G1 g12, Continuation<? super kotlin.G0> continuation) {
            return ((d) create(g12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f29043q;
            if (i12 == 0) {
                C42729a0.b(obj);
                G1 g12 = (G1) this.f29044r;
                I0 i02 = I0.this;
                C0 c02 = new C0(g12, i02);
                c cVar = I0.f29017w;
                int i13 = ((C20689o0) ((C22082i3) i02.f29023e).getF42167b()).f29188j * 100;
                androidx.compose.ui.unit.d dVar = ((C20689o0) ((C22082i3) i02.f29023e).getF42167b()).f29187i;
                this.f29043q = 1;
                if (C20730l0.b(c02, this.f29046t, this.f29047u, i13, dVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LazyGridState.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/lazy/grid/I0$e", "Landroidx/compose/foundation/lazy/grid/u0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements u0 {
        public e() {
        }
    }

    /* compiled from: LazyGridState.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/E0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/layout/E0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.foundation.lazy.layout.E0, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f29050m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i12) {
            super(1);
            this.f29050m = i12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.foundation.lazy.layout.E0 e02) {
            androidx.compose.foundation.lazy.layout.E0 e03 = e02;
            v0 v0Var = I0.this.f29019a;
            AbstractC22167l.f38720e.getClass();
            AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
            AbstractC22167l.a.e(abstractC22167lA, AbstractC22167l.a.b(abstractC22167lA), abstractC22167lA != null ? abstractC22167lA.getF38696h() : null);
            v0Var.a(e03, this.f29050m);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/lazy/grid/I0$g", "Landroidx/compose/ui/layout/O0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements androidx.compose.ui.layout.O0 {
        public g() {
        }

        @Override // androidx.compose.ui.layout.O0
        public final void X(LayoutNode layoutNode) {
            I0.this.f29028j = layoutNode;
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", i = {0, 0, 0}, l = {377, 378}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
    public static final class h extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public I0 f29052q;

        /* renamed from: r, reason: collision with root package name */
        public MutatePriority f29053r;

        /* renamed from: s, reason: collision with root package name */
        public Y41.p f29054s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f29055t;

        /* renamed from: v, reason: collision with root package name */
        public int f29057v;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f29055t = obj;
            this.f29057v |= BeduinInputModel.MIN_TEXT_VERSION;
            return I0.this.e(null, null, this);
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/G1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/G1;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Y41.p<G1, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f29059r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f29060s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i12, int i13, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f29059r = i12;
            this.f29060s = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return I0.this.new i(this.f29059r, this.f29060s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(G1 g12, Continuation<? super kotlin.G0> continuation) {
            return ((i) create(g12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            I0.this.l(this.f29059r, this.f29060s);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j extends kotlin.jvm.internal.N implements Y41.l<Float, Float> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            C20689o0 c20689o0;
            float f13 = -f12.floatValue();
            I0 i02 = I0.this;
            if ((f13 >= 0.0f || i02.b()) && (f13 <= 0.0f || i02.d())) {
                if (Math.abs(i02.f29025g) > 0.5f) {
                    androidx.compose.foundation.internal.e.c("entered drag with non-zero pending scroll");
                }
                float f14 = i02.f29025g + f13;
                i02.f29025g = f14;
                if (Math.abs(f14) > 0.5f) {
                    float f15 = i02.f29025g;
                    int iB2 = kotlin.math.b.b(f15);
                    C20689o0 c20689o0A = ((C20689o0) ((C22082i3) i02.f29023e).getF42167b()).a(iB2, !i02.f29020b);
                    if (c20689o0A != null && (c20689o0 = i02.f29021c) != null) {
                        C20689o0 c20689o0A2 = c20689o0.a(iB2, true);
                        if (c20689o0A2 != null) {
                            i02.f29021c = c20689o0A2;
                        } else {
                            c20689o0A = null;
                        }
                    }
                    v0 v0Var = i02.f29019a;
                    e eVar = i02.f29034p;
                    if (c20689o0A != null) {
                        i02.g(c20689o0A, i02.f29020b, true);
                        androidx.compose.foundation.lazy.layout.F0.b(i02.f29036r);
                        float f16 = f15 - i02.f29025g;
                        if (i02.f29027i) {
                            v0Var.b(eVar, f16, c20689o0A);
                        }
                    } else {
                        LayoutNode layoutNode = i02.f29028j;
                        if (layoutNode != null) {
                            layoutNode.j();
                        }
                        float f17 = f15 - i02.f29025g;
                        InterfaceC20675h0 interfaceC20675h0J = i02.j();
                        if (i02.f29027i) {
                            v0Var.b(eVar, f17, interfaceC20675h0J);
                        }
                    }
                }
                if (Math.abs(i02.f29025g) > 0.5f) {
                    f13 -= i02.f29025g;
                    i02.f29025g = 0.0f;
                }
            } else {
                f13 = 0.0f;
            }
            return Float.valueOf(-f13);
        }
    }

    @W0
    public I0() {
        this(0, 0, null, 7, null);
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean a() {
        return this.f29026h.a();
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean b() {
        return ((Boolean) ((C22082i3) this.f29038t).getF42167b()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final float c(float f12) {
        return this.f29026h.c(f12);
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean d() {
        return ((Boolean) ((C22082i3) this.f29039u).getF42167b()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.U1
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@Y61.k androidx.compose.foundation.MutatePriority r6, @Y61.k Y41.p<? super androidx.compose.foundation.gestures.G1, ? super kotlin.coroutines.Continuation<? super kotlin.G0>, ? extends java.lang.Object> r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.I0.h
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.grid.I0$h r0 = (androidx.compose.foundation.lazy.grid.I0.h) r0
            int r1 = r0.f29057v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29057v = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.grid.I0$h r0 = new androidx.compose.foundation.lazy.grid.I0$h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29055t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f29057v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r8)
            goto L68
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            Y41.p r6 = r0.f29054s
            r7 = r6
            Y41.p r7 = (Y41.p) r7
            androidx.compose.foundation.MutatePriority r6 = r0.f29053r
            androidx.compose.foundation.lazy.grid.I0 r2 = r0.f29052q
            kotlin.C42729a0.b(r8)
            goto L56
        L41:
            kotlin.C42729a0.b(r8)
            r0.f29052q = r5
            r0.f29053r = r6
            r0.f29054s = r7
            r0.f29057v = r4
            androidx.compose.foundation.lazy.layout.d r8 = r5.f29030l
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            r2 = r5
        L56:
            androidx.compose.foundation.gestures.U1 r8 = r2.f29026h
            r2 = 0
            r0.f29052q = r2
            r0.f29053r = r2
            r0.f29054s = r2
            r0.f29057v = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L68
            return r1
        L68:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.I0.e(androidx.compose.foundation.MutatePriority, Y41.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Y61.l
    public final Object f(@j.F int i12, int i13, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objE = e(MutatePriority.f26797b, new d(i12, i13, null), continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : kotlin.G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(@Y61.k androidx.compose.foundation.lazy.grid.C20689o0 r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.I0.g(androidx.compose.foundation.lazy.grid.o0, boolean, boolean):void");
    }

    public final int h() {
        return ((C22061e3) this.f29022d.f28978a).e();
    }

    public final int i() {
        return ((C22061e3) this.f29022d.f28979b).e();
    }

    @Y61.k
    public final InterfaceC20675h0 j() {
        return (InterfaceC20675h0) ((C22082i3) this.f29023e).getF42167b();
    }

    @Y61.l
    public final Object k(@j.F int i12, int i13, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objE = e(MutatePriority.f26797b, new i(i12, i13, null), continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : kotlin.G0.f406611a;
    }

    public final void l(int i12, int i13) {
        A0 a02 = this.f29022d;
        if (((C22061e3) a02.f28978a).e() != i12 || ((C22061e3) a02.f28979b).e() != i13) {
            LazyLayoutItemAnimator<C20691p0> lazyLayoutItemAnimator = this.f29031m;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.f29318b = null;
            lazyLayoutItemAnimator.f29319c = -1;
        }
        a02.a(i12, i13);
        a02.f28981d = null;
        LayoutNode layoutNode = this.f29028j;
        if (layoutNode != null) {
            layoutNode.j();
        }
    }

    public I0(int i12, int i13) {
        this(i12, i13, new C20660a(2));
    }

    public I0(int i12, int i13, v0 v0Var, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? 0 : i12, (i14 & 2) != 0 ? 0 : i13, (i14 & 4) != 0 ? new C20660a(2) : v0Var);
    }

    @W0
    public I0(int i12, int i13, @Y61.k v0 v0Var) {
        this.f29019a = v0Var;
        this.f29022d = new A0(i12, i13);
        this.f29023e = C22126m3.f(M0.f29065a, C22126m3.h());
        this.f29024f = androidx.compose.foundation.interaction.l.a();
        this.f29026h = W1.a(new j());
        this.f29027i = true;
        this.f29029k = new g();
        this.f29030l = new C20713d();
        this.f29031m = new LazyLayoutItemAnimator<>();
        this.f29032n = new C20725j();
        v0Var.getClass();
        this.f29033o = new C20714d0(null, new f(i12));
        this.f29034p = new e();
        this.f29035q = new C20712c0();
        this.f29036r = androidx.compose.foundation.lazy.layout.F0.a();
        this.f29037s = androidx.compose.foundation.lazy.layout.F0.a();
        Boolean bool = Boolean.FALSE;
        this.f29038t = C22126m3.g(bool);
        this.f29039u = C22126m3.g(bool);
        this.f29040v = new C20718f0();
    }

    public /* synthetic */ I0(int i12, int i13, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? 0 : i12, (i14 & 2) != 0 ? 0 : i13);
    }
}
