package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.F3;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import l0.n;

/* compiled from: SuspendingPointerInputFilter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/g0;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/input/pointer/b0;", "Landroidx/compose/ui/input/pointer/K;", "Landroidx/compose/ui/unit/d;", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g0 extends v.d implements b0, K, androidx.compose.ui.unit.d {

    /* renamed from: A, reason: collision with root package name */
    public long f40229A;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public Object f40230p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public Object f40231q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public Object[] f40232r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public SuspendLambda f40233s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public PointerInputEventHandler f40234t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public N0 f40235u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public C22340s f40236v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<a<?>> f40237w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e f40238x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<a<?>> f40239y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public C22340s f40240z;

    /* compiled from: SuspendingPointerInputFilter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/g0$a;", "R", "Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/unit/d;", "Lkotlin/coroutines/Continuation;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a<R> implements InterfaceC22325c, androidx.compose.ui.unit.d, Continuation<R> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final kotlinx.coroutines.r f40241b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g0 f40242c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public kotlinx.coroutines.r f40243d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public PointerEventPass f40244e = PointerEventPass.f40174c;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final EmptyCoroutineContext f40245f = EmptyCoroutineContext.INSTANCE;

        public a(@Y61.k kotlinx.coroutines.r rVar) {
            this.f40241b = rVar;
            this.f40242c = g0.this;
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final float A0(long j12) {
            return this.f40242c.A0(j12);
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC22325c
        @Y61.k
        public final C22340s C0() {
            return g0.this.f40236v;
        }

        @Override // androidx.compose.ui.unit.n
        @F3
        public final float E(long j12) {
            return this.f40242c.E(j12);
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final float J(int i12) {
            return this.f40242c.J(i12);
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC22325c
        public final long J1() {
            g0 g0Var = g0.this;
            g0Var.getClass();
            long jL2 = g0Var.L(C22421l.g(g0Var).f40610D.f());
            long j12 = g0Var.f40229A;
            float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jL2 >> 32)) - ((int) (j12 >> 32))) / 2.0f;
            float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jL2 & 4294967295L)) - ((int) (j12 & 4294967295L))) / 2.0f;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
            n.a aVar = l0.n.f413402b;
            return jFloatToRawIntBits;
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final float K(float f12) {
            return this.f40242c.K(f12);
        }

        @Override // androidx.compose.ui.unit.n
        /* renamed from: K0 */
        public final float getF40390d() {
            return this.f40242c.getF40390d();
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final long L(long j12) {
            return this.f40242c.L(j12);
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final float M0(float f12) {
            return this.f40242c.getF40389c() * f12;
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC22325c
        @Y61.l
        public final Object N1(@Y61.k PointerEventPass pointerEventPass, @Y61.k Continuation<? super C22340s> continuation) {
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
            rVar.p();
            this.f40244e = pointerEventPass;
            this.f40243d = rVar;
            Object objO = rVar.o();
            if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objO;
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final int O0(long j12) {
            return this.f40242c.O0(j12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r7v0, types: [long] */
        /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.N0] */
        /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.N0] */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // androidx.compose.ui.input.pointer.InterfaceC22325c
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object U1(long r7, @Y61.k Y41.p r9, @Y61.k kotlin.coroutines.jvm.internal.BaseContinuationImpl r10) {
            /*
                r6 = this;
                boolean r0 = r10 instanceof androidx.compose.ui.input.pointer.d0
                if (r0 == 0) goto L13
                r0 = r10
                androidx.compose.ui.input.pointer.d0 r0 = (androidx.compose.ui.input.pointer.d0) r0
                int r1 = r0.f40208t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f40208t = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.d0 r0 = new androidx.compose.ui.input.pointer.d0
                r0.<init>(r6, r10)
            L18:
                java.lang.Object r10 = r0.f40206r
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f40208t
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r7 = r0.f40205q
                kotlinx.coroutines.N0 r7 = (kotlinx.coroutines.N0) r7
                kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L2d
                goto L6f
            L2d:
                r8 = move-exception
                goto L75
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                kotlin.C42729a0.b(r10)
                r4 = 0
                int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r10 > 0) goto L53
                kotlinx.coroutines.r r10 = r6.f40243d
                if (r10 == 0) goto L53
                int r2 = kotlin.Z.f406624c
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r7)
                kotlin.Z$b r4 = new kotlin.Z$b
                r4.<init>(r2)
                r10.resumeWith(r4)
            L53:
                androidx.compose.ui.input.pointer.g0 r10 = androidx.compose.ui.input.pointer.g0.this
                kotlinx.coroutines.T r10 = r10.Y1()
                androidx.compose.ui.input.pointer.e0 r2 = new androidx.compose.ui.input.pointer.e0
                r4 = 0
                r2.<init>(r7, r6, r4)
                r7 = 3
                kotlinx.coroutines.N0 r7 = kotlinx.coroutines.C43259k.d(r10, r4, r4, r2, r7)
                r0.f40205q = r7     // Catch: java.lang.Throwable -> L2d
                r0.f40208t = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r10 = r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> L2d
                if (r10 != r1) goto L6f
                return r1
            L6f:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r8 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f40131b
                r7.c(r8)
                return r10
            L75:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r9 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f40131b
                r7.c(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.g0.a.U1(long, Y41.p, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.pointer.InterfaceC22325c
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object W0(long r5, @Y61.k Y41.p r7, @Y61.k kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.f0
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.f0 r0 = (androidx.compose.ui.input.pointer.f0) r0
                int r1 = r0.f40227s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f40227s = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.f0 r0 = new androidx.compose.ui.input.pointer.f0
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.f40225q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f40227s
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                goto L3e
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r8)
                r0.f40227s = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                java.lang.Object r8 = r4.U1(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                if (r8 != r1) goto L3e
                return r1
            L3d:
                r8 = 0
            L3e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.g0.a.W0(long, Y41.p, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC22325c
        public final long a() {
            return g0.this.f40229A;
        }

        @Override // kotlin.coroutines.Continuation
        @Y61.k
        /* renamed from: getContext */
        public final CoroutineContext getF411447c() {
            return this.f40245f;
        }

        @Override // androidx.compose.ui.unit.d
        /* renamed from: getDensity */
        public final float getF40389c() {
            return this.f40242c.getF40389c();
        }

        @Override // androidx.compose.ui.input.pointer.InterfaceC22325c
        @Y61.k
        public final InterfaceC22544x2 getViewConfiguration() {
            g0 g0Var = g0.this;
            g0Var.getClass();
            return C22421l.g(g0Var).f40610D;
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final long n(long j12) {
            return this.f40242c.n(j12);
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final long o(float f12) {
            return this.f40242c.o(f12);
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(@Y61.k Object obj) {
            g0 g0Var = g0.this;
            synchronized (g0Var.f40238x) {
                g0Var.f40237w.j(this);
                G0 g02 = G0.f406611a;
            }
            this.f40241b.resumeWith(obj);
        }

        @Override // androidx.compose.ui.unit.n
        @F3
        public final long s(float f12) {
            return this.f40242c.s(f12);
        }

        @Override // androidx.compose.ui.unit.d
        @F3
        public final int y0(float f12) {
            return this.f40242c.y0(f12);
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PointerEventPass pointerEventPass = PointerEventPass.f40173b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PointerEventPass pointerEventPass2 = PointerEventPass.f40173b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a<R> f40247l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a<R> aVar) {
            super(1);
            this.f40247l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            a<R> aVar = this.f40247l;
            kotlinx.coroutines.r rVar = aVar.f40243d;
            if (rVar != null) {
                rVar.f(th3);
            }
            aVar.f40243d = null;
            return G0.f406611a;
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {717, 719}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f40248q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return g0.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f40248q;
            if (i12 == 0) {
                C42729a0.b(obj);
                g0 g0Var = g0.this;
                ?? r12 = g0Var.f40233s;
                if (r12 != 0) {
                    this.f40248q = 1;
                    if (r12.invoke(g0Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    PointerInputEventHandler pointerInputEventHandler = g0Var.f40234t;
                    this.f40248q = 2;
                    if (pointerInputEventHandler.invoke(g0Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @InterfaceC42830m
    public g0() {
        throw null;
    }

    public /* synthetic */ g0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : obj, (i12 & 2) != 0 ? null : obj2, (i12 & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    @Override // androidx.compose.ui.node.InterfaceC22419k, androidx.compose.ui.node.P0
    public final void B() {
        B0();
    }

    @Override // androidx.compose.ui.input.pointer.b0
    public final void B0() {
        N0 n02 = this.f40235u;
        if (n02 != null) {
            ((V0) n02).V(new PointerInputResetException());
            this.f40235u = null;
        }
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: K0 */
    public final float getF40390d() {
        return C22421l.g(this).f40608B.getF40390d();
    }

    @Override // androidx.compose.ui.input.pointer.K
    @Y61.l
    public final <R> Object N0(@Y61.k Y41.p<? super InterfaceC22325c, ? super Continuation<? super R>, ? extends Object> pVar, @Y61.k Continuation<? super R> continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        a aVar = new a(rVar);
        synchronized (this.f40238x) {
            this.f40237w.b(aVar);
            Continuation<G0> continuationCreateCoroutine = ContinuationKt.createCoroutine(pVar, aVar, aVar);
            int i12 = kotlin.Z.f406624c;
            continuationCreateCoroutine.resumeWith(G0.f406611a);
        }
        rVar.r(new c(aVar));
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO;
    }

    @Override // androidx.compose.ui.node.P0
    public final void Q0() {
        B0();
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        B0();
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: getDensity */
    public final float getF40389c() {
        return C22421l.g(this).f40608B.getF40389c();
    }

    @Override // androidx.compose.ui.input.pointer.K
    @Y61.k
    public final InterfaceC22544x2 getViewConfiguration() {
        return C22421l.g(this).f40610D;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:6:0x000e, B:12:0x001b, B:15:0x0027, B:17:0x002f, B:19:0x0033, B:20:0x003a, B:23:0x003f, B:25:0x0048, B:27:0x0050, B:29:0x0054), top: B:40:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k2(androidx.compose.ui.input.pointer.C22340s r8, androidx.compose.ui.input.pointer.PointerEventPass r9) {
        /*
            r7 = this;
            r0 = 1
            androidx.compose.runtime.collection.e r1 = r7.f40238x
            monitor-enter(r1)
            androidx.compose.runtime.collection.e<androidx.compose.ui.input.pointer.g0$a<?>> r2 = r7.f40239y     // Catch: java.lang.Throwable -> L69
            androidx.compose.runtime.collection.e<androidx.compose.ui.input.pointer.g0$a<?>> r3 = r7.f40237w     // Catch: java.lang.Throwable -> L69
            int r4 = r2.f38262d     // Catch: java.lang.Throwable -> L69
            r2.c(r4, r3)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r1)
            int r1 = r9.ordinal()     // Catch: java.lang.Throwable -> L3d
            r2 = 0
            if (r1 == 0) goto L3f
            if (r1 == r0) goto L1b
            r3 = 2
            if (r1 == r3) goto L3f
            goto L5d
        L1b:
            androidx.compose.runtime.collection.e<androidx.compose.ui.input.pointer.g0$a<?>> r1 = r7.f40239y     // Catch: java.lang.Throwable -> L3d
            int r3 = r1.f38262d     // Catch: java.lang.Throwable -> L3d
            int r3 = r3 - r0
            T[] r0 = r1.f38260b     // Catch: java.lang.Throwable -> L3d
            int r1 = r0.length     // Catch: java.lang.Throwable -> L3d
            if (r3 >= r1) goto L5d
        L25:
            if (r3 < 0) goto L5d
            r1 = r0[r3]     // Catch: java.lang.Throwable -> L3d
            androidx.compose.ui.input.pointer.g0$a r1 = (androidx.compose.ui.input.pointer.g0.a) r1     // Catch: java.lang.Throwable -> L3d
            androidx.compose.ui.input.pointer.PointerEventPass r4 = r1.f40244e     // Catch: java.lang.Throwable -> L3d
            if (r9 != r4) goto L3a
            kotlinx.coroutines.r r4 = r1.f40243d     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L3a
            r1.f40243d = r2     // Catch: java.lang.Throwable -> L3d
            int r1 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L3d
            r4.resumeWith(r8)     // Catch: java.lang.Throwable -> L3d
        L3a:
            int r3 = r3 + (-1)
            goto L25
        L3d:
            r8 = move-exception
            goto L63
        L3f:
            androidx.compose.runtime.collection.e<androidx.compose.ui.input.pointer.g0$a<?>> r1 = r7.f40239y     // Catch: java.lang.Throwable -> L3d
            T[] r3 = r1.f38260b     // Catch: java.lang.Throwable -> L3d
            int r1 = r1.f38262d     // Catch: java.lang.Throwable -> L3d
            r4 = 0
        L46:
            if (r4 >= r1) goto L5d
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L3d
            androidx.compose.ui.input.pointer.g0$a r5 = (androidx.compose.ui.input.pointer.g0.a) r5     // Catch: java.lang.Throwable -> L3d
            androidx.compose.ui.input.pointer.PointerEventPass r6 = r5.f40244e     // Catch: java.lang.Throwable -> L3d
            if (r9 != r6) goto L5b
            kotlinx.coroutines.r r6 = r5.f40243d     // Catch: java.lang.Throwable -> L3d
            if (r6 == 0) goto L5b
            r5.f40243d = r2     // Catch: java.lang.Throwable -> L3d
            int r5 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L3d
            r6.resumeWith(r8)     // Catch: java.lang.Throwable -> L3d
        L5b:
            int r4 = r4 + r0
            goto L46
        L5d:
            androidx.compose.runtime.collection.e<androidx.compose.ui.input.pointer.g0$a<?>> r8 = r7.f40239y
            r8.g()
            return
        L63:
            androidx.compose.runtime.collection.e<androidx.compose.ui.input.pointer.g0$a<?>> r9 = r7.f40239y
            r9.g()
            throw r8
        L69:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.g0.k2(androidx.compose.ui.input.pointer.s, androidx.compose.ui.input.pointer.PointerEventPass):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.ui.node.P0
    public final void p1() {
        C22340s c22340s = this.f40240z;
        if (c22340s == null) {
            return;
        }
        ?? r12 = c22340s.f40278a;
        int size = ((Collection) r12).size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            if (((C) r12.get(i13)).f40119d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = ((Collection) r12).size();
                List list = r12;
                while (i12 < size2) {
                    C c12 = (C) list.get(i12);
                    long j12 = c12.f40116a;
                    int i14 = c12.f40124i;
                    long j13 = c12.f40117b;
                    long j14 = c12.f40118c;
                    float f12 = c12.f40120e;
                    boolean z12 = c12.f40119d;
                    arrayList.add(new C(j12, j13, j14, false, f12, j13, j14, z12, z12, i14, 0L, 1024, null));
                    i12++;
                    list = list;
                }
                C22340s c22340s2 = new C22340s(arrayList, null);
                this.f40236v = c22340s2;
                k2(c22340s2, PointerEventPass.f40173b);
                k2(c22340s2, PointerEventPass.f40174c);
                k2(c22340s2, PointerEventPass.f40175d);
                this.f40240z = null;
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.ui.node.P0
    public final void r0(@Y61.k C22340s c22340s, @Y61.k PointerEventPass pointerEventPass, long j12) {
        this.f40229A = j12;
        if (pointerEventPass == PointerEventPass.f40173b) {
            this.f40236v = c22340s;
        }
        if (this.f40235u == null) {
            this.f40235u = C43259k.d(Y1(), null, CoroutineStart.f410683e, new d(null), 1);
        }
        k2(c22340s, pointerEventPass);
        ?? r52 = c22340s.f40278a;
        int size = ((Collection) r52).size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                c22340s = null;
                break;
            } else if (!C22341t.c((C) r52.get(i12))) {
                break;
            } else {
                i12++;
            }
        }
        this.f40240z = c22340s;
    }

    public g0(@Y61.l Object obj, @Y61.l Object obj2, @Y61.l Object[] objArr, @Y61.k PointerInputEventHandler pointerInputEventHandler) {
        this.f40230p = obj;
        this.f40231q = obj2;
        this.f40232r = objArr;
        this.f40234t = pointerInputEventHandler;
        this.f40236v = Z.f40198a;
        androidx.compose.runtime.collection.e<a<?>> eVar = new androidx.compose.runtime.collection.e<>(new a[16], 0);
        this.f40237w = eVar;
        this.f40238x = eVar;
        this.f40239y = new androidx.compose.runtime.collection.e<>(new a[16], 0);
        androidx.compose.ui.unit.u.f42871b.getClass();
        this.f40229A = 0L;
    }

    @Override // androidx.compose.ui.input.pointer.K
    public final void F1() {
    }
}
