package androidx.compose.foundation.lazy;

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
import androidx.compose.foundation.lazy.layout.F0;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.ui.layout.O0;
import androidx.compose.ui.node.LayoutNode;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyListState.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/w0;", "Landroidx/compose/foundation/gestures/U1;", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w0 implements U1 {

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public static final c f29712w = new c(null);

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.runtime.saveable.w f29713x = androidx.compose.runtime.saveable.b.a(b.f29737l, a.f29736l);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k0 f29714a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29715b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public f0 f29716c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final r0 f29717d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<f0> f29718e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.interaction.m f29719f;

    /* renamed from: g, reason: collision with root package name */
    public float f29720g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final U1 f29721h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f29722i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public LayoutNode f29723j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final g f29724k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C20713d f29725l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final LazyLayoutItemAnimator<g0> f29726m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C20725j f29727n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C20714d0 f29728o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final e f29729p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final C20712c0 f29730q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<G0> f29731r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29732s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29733t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<G0> f29734u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final C20718f0 f29735v;

    /* compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/foundation/lazy/w0;", "it", "", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/foundation/lazy/w0;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, w0, List<? extends Integer>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f29736l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final List<? extends Integer> invoke(androidx.compose.runtime.saveable.x xVar, w0 w0Var) {
            w0 w0Var2 = w0Var;
            return C42745f0.U(Integer.valueOf(w0Var2.h()), Integer.valueOf(w0Var2.i()));
        }
    }

    /* compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Landroidx/compose/foundation/lazy/w0;", "invoke", "(Ljava/util/List;)Landroidx/compose/foundation/lazy/w0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<List<? extends Integer>, w0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f29737l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final w0 invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            return new w0(list2.get(0).intValue(), list2.get(1).intValue());
        }
    }

    /* compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/w0$c;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/G1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/G1;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", i = {}, l = {481}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<G1, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f29738q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f29739r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f29741t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f29742u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i12, int i13, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f29741t = i12;
            this.f29742u = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            d dVar = w0.this.new d(this.f29741t, this.f29742u, continuation);
            dVar.f29739r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(G1 g12, Continuation<? super G0> continuation) {
            return ((d) create(g12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f29738q;
            if (i12 == 0) {
                C42729a0.b(obj);
                G1 g12 = (G1) this.f29739r;
                w0 w0Var = w0.this;
                t0 t0Var = new t0(g12, w0Var);
                androidx.compose.ui.unit.d dVar = ((f0) ((C22082i3) w0Var.f29718e).getF42167b()).f28943i;
                this.f29738q = 1;
                if (C20730l0.b(t0Var, this.f29741t, this.f29742u, 100, dVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyListState.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/lazy/w0$e", "Landroidx/compose/foundation/lazy/j0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements j0 {
        public e() {
        }
    }

    /* compiled from: LazyListState.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/E0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/layout/E0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.foundation.lazy.layout.E0, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f29745m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i12) {
            super(1);
            this.f29745m = i12;
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.foundation.lazy.layout.E0 e02) {
            androidx.compose.foundation.lazy.layout.E0 e03 = e02;
            k0 k0Var = w0.this.f29714a;
            AbstractC22167l.f38720e.getClass();
            AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
            AbstractC22167l.a.e(abstractC22167lA, AbstractC22167l.a.b(abstractC22167lA), abstractC22167lA != null ? abstractC22167lA.getF38696h() : null);
            k0Var.a(e03, this.f29745m);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/lazy/w0$g", "Landroidx/compose/ui/layout/O0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements O0 {
        public g() {
        }

        @Override // androidx.compose.ui.layout.O0
        public final void X(LayoutNode layoutNode) {
            w0.this.f29723j = layoutNode;
        }
    }

    /* compiled from: LazyListState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", i = {0, 0, 0}, l = {365, 366}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
    public static final class h extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public w0 f29747q;

        /* renamed from: r, reason: collision with root package name */
        public MutatePriority f29748r;

        /* renamed from: s, reason: collision with root package name */
        public Y41.p f29749s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f29750t;

        /* renamed from: v, reason: collision with root package name */
        public int f29752v;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f29750t = obj;
            this.f29752v |= BeduinInputModel.MIN_TEXT_VERSION;
            return w0.this.e(null, null, this);
        }
    }

    /* compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/G1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/G1;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Y41.p<G1, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f29754r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f29755s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i12, int i13, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f29754r = i12;
            this.f29755s = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return w0.this.new i(this.f29754r, this.f29755s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(G1 g12, Continuation<? super G0> continuation) {
            return ((i) create(g12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            w0.this.l(this.f29754r, this.f29755s);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyListState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j extends kotlin.jvm.internal.N implements Y41.l<Float, Float> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            f0 f0Var;
            float f13 = -f12.floatValue();
            w0 w0Var = w0.this;
            if ((f13 >= 0.0f || w0Var.b()) && (f13 <= 0.0f || w0Var.d())) {
                if (Math.abs(w0Var.f29720g) > 0.5f) {
                    androidx.compose.foundation.internal.e.c("entered drag with non-zero pending scroll");
                }
                float f14 = w0Var.f29720g + f13;
                w0Var.f29720g = f14;
                if (Math.abs(f14) > 0.5f) {
                    float f15 = w0Var.f29720g;
                    int iRound = Math.round(f15);
                    f0 f0VarA = ((f0) ((C22082i3) w0Var.f29718e).getF42167b()).a(iRound, !w0Var.f29715b);
                    if (f0VarA != null && (f0Var = w0Var.f29716c) != null) {
                        f0 f0VarA2 = f0Var.a(iRound, true);
                        if (f0VarA2 != null) {
                            w0Var.f29716c = f0VarA2;
                        } else {
                            f0VarA = null;
                        }
                    }
                    k0 k0Var = w0Var.f29714a;
                    e eVar = w0Var.f29729p;
                    if (f0VarA != null) {
                        w0Var.g(f0VarA, w0Var.f29715b, true);
                        F0.b(w0Var.f29734u);
                        float f16 = f15 - w0Var.f29720g;
                        if (w0Var.f29722i) {
                            k0Var.c(eVar, f16, f0VarA);
                        }
                    } else {
                        LayoutNode layoutNode = w0Var.f29723j;
                        if (layoutNode != null) {
                            layoutNode.j();
                        }
                        float f17 = f15 - w0Var.f29720g;
                        Y yJ2 = w0Var.j();
                        if (w0Var.f29722i) {
                            k0Var.c(eVar, f17, yJ2);
                        }
                    }
                }
                if (Math.abs(w0Var.f29720g) > 0.5f) {
                    f13 -= w0Var.f29720g;
                    w0Var.f29720g = 0.0f;
                }
            } else {
                f13 = 0.0f;
            }
            return Float.valueOf(-f13);
        }
    }

    @W0
    public w0() {
        this(0, 0, null, 7, null);
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean a() {
        return this.f29721h.a();
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean b() {
        return ((Boolean) ((C22082i3) this.f29732s).getF42167b()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final float c(float f12) {
        return this.f29721h.c(f12);
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean d() {
        return ((Boolean) ((C22082i3) this.f29733t).getF42167b()).booleanValue();
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.w0.h
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.w0$h r0 = (androidx.compose.foundation.lazy.w0.h) r0
            int r1 = r0.f29752v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29752v = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.w0$h r0 = new androidx.compose.foundation.lazy.w0$h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29750t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f29752v
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
            Y41.p r6 = r0.f29749s
            r7 = r6
            Y41.p r7 = (Y41.p) r7
            androidx.compose.foundation.MutatePriority r6 = r0.f29748r
            androidx.compose.foundation.lazy.w0 r2 = r0.f29747q
            kotlin.C42729a0.b(r8)
            goto L56
        L41:
            kotlin.C42729a0.b(r8)
            r0.f29747q = r5
            r0.f29748r = r6
            r0.f29749s = r7
            r0.f29752v = r4
            androidx.compose.foundation.lazy.layout.d r8 = r5.f29725l
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            r2 = r5
        L56:
            androidx.compose.foundation.gestures.U1 r8 = r2.f29721h
            r2 = 0
            r0.f29747q = r2
            r0.f29748r = r2
            r0.f29749s = r2
            r0.f29752v = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L68
            return r1
        L68:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.w0.e(androidx.compose.foundation.MutatePriority, Y41.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Y61.l
    public final Object f(@j.F int i12, int i13, @Y61.k Continuation<? super G0> continuation) {
        Object objE = e(MutatePriority.f26797b, new d(i12, i13, null), continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : G0.f406611a;
    }

    public final void g(@Y61.k f0 f0Var, boolean z12, boolean z13) {
        if (!z12 && this.f29715b) {
            this.f29716c = f0Var;
            return;
        }
        if (z12) {
            this.f29715b = true;
        }
        g0 g0Var = f0Var.f28935a;
        int i12 = g0Var != null ? g0Var.f28953a : 0;
        int i13 = f0Var.f28936b;
        ((C22082i3) this.f29733t).setValue(Boolean.valueOf((i12 == 0 && i13 == 0) ? false : true));
        ((C22082i3) this.f29732s).setValue(Boolean.valueOf(f0Var.f28937c));
        this.f29720g -= f0Var.f28938d;
        ((C22082i3) this.f29718e).setValue(f0Var);
        r0 r0Var = this.f29717d;
        if (z13) {
            r0Var.getClass();
            if (i13 < 0.0f) {
                androidx.compose.foundation.internal.e.c("scrollOffset should be non-negative");
            }
            ((C22061e3) r0Var.f29562b).L3(i13);
        } else {
            r0Var.getClass();
            r0Var.f29564d = g0Var != null ? g0Var.f28964l : null;
            if (r0Var.f29563c || f0Var.f28948n > 0) {
                r0Var.f29563c = true;
                if (i13 < 0.0f) {
                    androidx.compose.foundation.internal.e.c("scrollOffset should be non-negative");
                }
                r0Var.a(g0Var != null ? g0Var.f28953a : 0, i13);
            }
            if (this.f29722i) {
                this.f29714a.b(f0Var);
            }
        }
        if (z12) {
            this.f29735v.a(f0Var.f28940f, f0Var.f28943i, f0Var.f28942h);
        }
    }

    public final int h() {
        return ((C22061e3) this.f29717d.f29561a).e();
    }

    public final int i() {
        return ((C22061e3) this.f29717d.f29562b).e();
    }

    @Y61.k
    public final Y j() {
        return (Y) ((C22082i3) this.f29718e).getF42167b();
    }

    @Y61.l
    public final Object k(@j.F int i12, int i13, @Y61.k Continuation<? super G0> continuation) {
        Object objE = e(MutatePriority.f26797b, new i(i12, i13, null), continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : G0.f406611a;
    }

    public final void l(int i12, int i13) {
        r0 r0Var = this.f29717d;
        if (((C22061e3) r0Var.f29561a).e() != i12 || ((C22061e3) r0Var.f29562b).e() != i13) {
            LazyLayoutItemAnimator<g0> lazyLayoutItemAnimator = this.f29726m;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.f29318b = null;
            lazyLayoutItemAnimator.f29319c = -1;
        }
        r0Var.a(i12, i13);
        r0Var.f29564d = null;
        LayoutNode layoutNode = this.f29723j;
        if (layoutNode != null) {
            layoutNode.j();
        }
    }

    public w0(int i12, int i13) {
        this(i12, i13, new C20648a(2));
    }

    public w0(int i12, int i13, k0 k0Var, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? 0 : i12, (i14 & 2) != 0 ? 0 : i13, (i14 & 4) != 0 ? new C20648a(2) : k0Var);
    }

    @W0
    public w0(int i12, int i13, @Y61.k k0 k0Var) {
        this.f29714a = k0Var;
        this.f29717d = new r0(i12, i13);
        this.f29718e = C22126m3.f(A0.f28808a, C22126m3.h());
        this.f29719f = androidx.compose.foundation.interaction.l.a();
        this.f29721h = W1.a(new j());
        this.f29722i = true;
        this.f29724k = new g();
        this.f29725l = new C20713d();
        this.f29726m = new LazyLayoutItemAnimator<>();
        this.f29727n = new C20725j();
        k0Var.getClass();
        this.f29728o = new C20714d0(null, new f(i12));
        this.f29729p = new e();
        this.f29730q = new C20712c0();
        this.f29731r = F0.a();
        Boolean bool = Boolean.FALSE;
        this.f29732s = C22126m3.g(bool);
        this.f29733t = C22126m3.g(bool);
        this.f29734u = F0.a();
        this.f29735v = new C20718f0();
    }

    public /* synthetic */ w0(int i12, int i13, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? 0 : i12, (i14 & 2) != 0 ? 0 : i13);
    }
}
