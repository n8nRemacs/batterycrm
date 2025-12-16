package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AbstractC20431a0;
import androidx.compose.foundation.gestures.N0;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import l0.g;

/* compiled from: AnchoredDraggable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/p;", "T", "Landroidx/compose/foundation/gestures/I0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.gestures.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20490p<T> extends I0 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public Orientation f27887A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public Boolean f27888B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public androidx.compose.foundation.M1 f27889C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public Boolean f27890D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public InterfaceC20432a1 f27891E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC20432a1 f27892F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.unit.d f27893G;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public C20501s<T> f27894z;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/gestures/a;", "Landroidx/compose/foundation/gestures/T0;", "it", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/a;Landroidx/compose/foundation/gestures/T0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {408}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.p$a */
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC20430a, T0<T>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27895q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC20430a f27896r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.p<Y41.l<? super AbstractC20431a0.b, kotlin.G0>, Continuation<? super kotlin.G0>, Object> f27897s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C20490p<T> f27898t;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/foundation/gestures/a0$b;", "dragDelta", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/gestures/a0$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.gestures.p$a$a, reason: collision with other inner class name */
        public static final class C1583a extends kotlin.jvm.internal.N implements Y41.l<AbstractC20431a0.b, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C20490p<T> f27899l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ InterfaceC20430a f27900m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1583a(C20490p<T> c20490p, InterfaceC20430a interfaceC20430a) {
                super(1);
                this.f27899l = c20490p;
                this.f27900m = interfaceC20430a;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(AbstractC20431a0.b bVar) {
                long j12 = bVar.f27545a;
                C20490p<T> c20490p = this.f27899l;
                Boolean bool = c20490p.f27888B;
                long jK2 = l0.g.k(j12, bool == null ? C22421l.g(c20490p).f40609C == LayoutDirection.f42839c && c20490p.f27887A == Orientation.f27426c : bool.booleanValue() ? -1.0f : 1.0f);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c20490p.f27887A == Orientation.f27425b ? jK2 & 4294967295L : jK2 >> 32));
                androidx.compose.foundation.M1 m12 = c20490p.f27889C;
                InterfaceC20430a interfaceC20430a = this.f27900m;
                if (m12 == null) {
                    interfaceC20430a.a(c20490p.f27894z.e(fIntBitsToFloat), 0.0f);
                } else {
                    long jX2 = C20490p.x2(c20490p, fIntBitsToFloat);
                    androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
                    m12.Q(jX2, androidx.compose.ui.input.nestedscroll.i.f40106c, new C20486o(c20490p, interfaceC20430a));
                }
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.p<? super Y41.l<? super AbstractC20431a0.b, kotlin.G0>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, C20490p<T> c20490p, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f27897s = pVar;
            this.f27898t = c20490p;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC20430a interfaceC20430a, Object obj, Continuation<? super kotlin.G0> continuation) {
            a aVar = new a(this.f27897s, this.f27898t, continuation);
            aVar.f27896r = interfaceC20430a;
            return aVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27895q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C1583a c1583a = new C1583a(this.f27898t, this.f27896r);
                this.f27895q = 1;
                if (((N0.a) this.f27897s).invoke(c1583a, this) == coroutine_suspended) {
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

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", i = {}, l = {434, 436}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.p$b */
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27901q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C20490p<T> f27902r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f27903s;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/ui/unit/B;", "availableVelocity", "<anonymous>", "(Landroidx/compose/ui/unit/B;)Landroidx/compose/ui/unit/B;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", i = {0}, l = {438}, m = "invokeSuspend", n = {"availableVelocity"}, s = {"J$0"})
        /* renamed from: androidx.compose.foundation.gestures.p$b$a */
        public static final class a extends SuspendLambda implements Y41.p<androidx.compose.ui.unit.B, Continuation<? super androidx.compose.ui.unit.B>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f27904q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ long f27905r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ C20490p<T> f27906s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C20490p<T> c20490p, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f27906s = c20490p;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f27906s, continuation);
                aVar.f27905r = ((androidx.compose.ui.unit.B) obj).f42837a;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(androidx.compose.ui.unit.B b12, Continuation<? super androidx.compose.ui.unit.B> continuation) {
                return ((a) create(androidx.compose.ui.unit.B.a(b12.f42837a), continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                long jA2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f27904q;
                C20490p<T> c20490p = this.f27906s;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    long j12 = this.f27905r;
                    float fD2 = c20490p.f27887A == Orientation.f27425b ? androidx.compose.ui.unit.B.d(j12) : androidx.compose.ui.unit.B.c(j12);
                    this.f27905r = j12;
                    this.f27904q = 1;
                    obj = C20490p.w2(c20490p, fD2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    jA2 = j12;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jA2 = this.f27905r;
                    C42729a0.b(obj);
                }
                float fFloatValue = ((Number) obj).floatValue();
                float f12 = c20490p.f27894z.f();
                float fE2 = c20490p.f27894z.c().e();
                if (f12 >= c20490p.f27894z.c().d() || f12 <= fE2) {
                    Orientation orientation = c20490p.f27887A;
                    float f13 = orientation == Orientation.f27426c ? fFloatValue : 0.0f;
                    if (orientation != Orientation.f27425b) {
                        fFloatValue = 0.0f;
                    }
                    jA2 = androidx.compose.ui.unit.C.a(f13, fFloatValue);
                }
                return androidx.compose.ui.unit.B.a(jA2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C20490p<T> c20490p, long j12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f27902r = c20490p;
            this.f27903s = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f27902r, this.f27903s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27901q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C20490p<T> c20490p = this.f27902r;
                Boolean bool = c20490p.f27888B;
                long jG2 = androidx.compose.ui.unit.B.g(this.f27903s, bool == null ? C22421l.g(c20490p).f40609C == LayoutDirection.f42839c && c20490p.f27887A == Orientation.f27426c : bool.booleanValue() ? -1.0f : 1.0f);
                Orientation orientation = c20490p.f27887A;
                Orientation orientation2 = Orientation.f27425b;
                float fD2 = orientation == orientation2 ? androidx.compose.ui.unit.B.d(jG2) : androidx.compose.ui.unit.B.c(jG2);
                androidx.compose.foundation.M1 m12 = c20490p.f27889C;
                if (m12 == null) {
                    this.f27901q = 1;
                    if (C20490p.w2(c20490p, fD2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Orientation orientation3 = c20490p.f27887A;
                    float f12 = orientation3 == Orientation.f27426c ? fD2 : 0.0f;
                    if (orientation3 != orientation2) {
                        fD2 = 0.0f;
                    }
                    long jA2 = androidx.compose.ui.unit.C.a(f12, fD2);
                    a aVar = new a(c20490p, null);
                    this.f27901q = 2;
                    if (m12.P(jA2, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    public C20490p() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w2(androidx.compose.foundation.gestures.C20490p r6, float r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.C20494q
            if (r0 == 0) goto L16
            r0 = r8
            androidx.compose.foundation.gestures.q r0 = (androidx.compose.foundation.gestures.C20494q) r0
            int r1 = r0.f27917t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f27917t = r1
            goto L1b
        L16:
            androidx.compose.foundation.gestures.q r0 = new androidx.compose.foundation.gestures.q
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f27915r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27917t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            kotlin.jvm.internal.l0$e r6 = r0.f27914q
            kotlin.C42729a0.b(r8)
            goto L70
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.C42729a0.b(r8)
            goto L53
        L3d:
            kotlin.C42729a0.b(r8)
            androidx.compose.foundation.gestures.s<T> r8 = r6.f27894z
            boolean r8 = r8.d()
            if (r8 == 0) goto L55
            androidx.compose.foundation.gestures.s<T> r6 = r6.f27894z
            r0.f27917t = r4
            java.lang.Object r8 = r6.h(r7, r0)
            if (r8 != r1) goto L53
            goto L76
        L53:
            r1 = r8
            goto L76
        L55:
            kotlin.jvm.internal.l0$e r8 = new kotlin.jvm.internal.l0$e
            r8.<init>()
            r8.f406839b = r7
            androidx.compose.foundation.gestures.s<T> r2 = r6.f27894z
            androidx.compose.foundation.gestures.r r4 = new androidx.compose.foundation.gestures.r
            r5 = 0
            r4.<init>(r6, r8, r7, r5)
            r0.f27914q = r8
            r0.f27917t = r3
            java.lang.Object r6 = androidx.compose.foundation.gestures.C20501s.b(r2, r4, r0)
            if (r6 != r1) goto L6f
            goto L76
        L6f:
            r6 = r8
        L70:
            float r6 = r6.f406839b
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r6)
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20490p.w2(androidx.compose.foundation.gestures.p, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final long x2(C20490p c20490p, float f12) {
        Orientation orientation = c20490p.f27887A;
        float f13 = orientation == Orientation.f27426c ? f12 : 0.0f;
        if (orientation != Orientation.f27425b) {
            f12 = 0.0f;
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
        g.a aVar = l0.g.f413384b;
        return jFloatToRawIntBits;
    }

    @Override // androidx.compose.ui.node.InterfaceC22419k, androidx.compose.ui.node.P0
    public final void B() {
        p1();
        if (this.f42893o) {
            androidx.compose.ui.unit.d dVar = C22421l.g(this).f40608B;
            androidx.compose.ui.unit.d dVar2 = this.f27893G;
            if (dVar2 == null || !dVar2.equals(dVar)) {
                this.f27893G = dVar;
                y2(this.f27891E);
            }
        }
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        y2(this.f27891E);
    }

    @Override // androidx.compose.foundation.gestures.I0
    @Y61.l
    public final Object r2(@Y61.k Y41.p<? super Y41.l<? super AbstractC20431a0.b, kotlin.G0>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objB = C20501s.b(this.f27894z, new a(pVar, this, null), (ContinuationImpl) continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : kotlin.G0.f406611a;
    }

    @Override // androidx.compose.foundation.gestures.I0
    public final void t2(long j12) {
        if (this.f42893o) {
            C43259k.d(Y1(), null, null, new b(this, j12, null), 3);
        }
    }

    @Override // androidx.compose.foundation.gestures.I0
    public final boolean u2() {
        Boolean bool = this.f27890D;
        return bool != null ? bool.booleanValue() : ((C22082i3) this.f27894z.f27974m).getF42167b() != null;
    }

    public final void y2(InterfaceC20432a1 interfaceC20432a1) {
        if (interfaceC20432a1 == null) {
            C20434b.f27562a.getClass();
            androidx.compose.animation.core.G1 g12 = C20434b.f27563b;
            Y41.l<Float, Float> lVar = C20434b.f27564c;
            androidx.compose.ui.unit.d dVar = C22421l.g(this).f40608B;
            this.f27893G = dVar;
            C20501s<T> c20501s = this.f27894z;
            androidx.compose.animation.core.H<Float> h12 = C20438c.f27583c;
            C20442d c20442d = new C20442d(c20501s, lVar, new C20454g(dVar));
            float f12 = androidx.compose.foundation.gestures.snapping.t.f28054a;
            interfaceC20432a1 = new androidx.compose.foundation.gestures.snapping.o(c20442d, h12, g12);
        }
        this.f27892F = interfaceC20432a1;
    }

    @Override // androidx.compose.foundation.gestures.I0
    public final void s2(long j12) {
    }
}
