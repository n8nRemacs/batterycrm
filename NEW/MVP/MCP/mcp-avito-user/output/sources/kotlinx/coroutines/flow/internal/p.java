package kotlinx.coroutines.flow.internal;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.P0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.channels.K0;
import kotlinx.coroutines.channels.M0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.g0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Combine.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0, 0}, l = {123}, m = "invokeSuspend", n = {"second", "collectJob"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class p extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public P0 f411534q;

    /* renamed from: r, reason: collision with root package name */
    public int f411535r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f411536s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f411537t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<Object> f411538u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<Object> f411539v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y41.q<Object, Object, Continuation<Object>, Object> f411540w;

    /* compiled from: Combine.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T1", "T2", "R", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ P0 f411541l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(P0 p02) {
            super(1);
            this.f411541l = p02;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            P0 p02 = this.f411541l;
            if (p02.isActive()) {
                p02.V(new AbortFlowException(p02));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Combine.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f411542q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<Object> f411543r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f411544s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Object f411545t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ K0<Object> f411546u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<Object> f411547v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Y41.q<Object, Object, Continuation<Object>, Object> f411548w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ P0 f411549x;

        /* compiled from: Combine.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoroutineContext f411550b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f411551c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ K0<Object> f411552d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<Object> f411553e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Y41.q<Object, Object, Continuation<Object>, Object> f411554f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ P0 f411555g;

            /* compiled from: Combine.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT, 129, 129}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.internal.p$b$a$a, reason: collision with other inner class name */
            public static final class C11725a extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public InterfaceC43172j f411556q;

                /* renamed from: r, reason: collision with root package name */
                public int f411557r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ K0<Object> f411558s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j<Object> f411559t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Y41.q<Object, Object, Continuation<Object>, Object> f411560u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ Object f411561v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ P0 f411562w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11725a(K0 k02, InterfaceC43172j interfaceC43172j, Y41.q qVar, Object obj, P0 p02, Continuation continuation) {
                    super(2, continuation);
                    this.f411558s = k02;
                    this.f411559t = interfaceC43172j;
                    this.f411560u = qVar;
                    this.f411561v = obj;
                    this.f411562w = p02;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    P0 p02 = this.f411562w;
                    return new C11725a(this.f411558s, this.f411559t, this.f411560u, this.f411561v, p02, continuation);
                }

                @Override // Y41.p
                public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
                    return ((C11725a) create(g02, continuation)).invokeSuspend(G0.f406611a);
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[RETURN] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) throws java.lang.Throwable {
                    /*
                        r6 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r6.f411557r
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L2c
                        if (r1 == r5) goto L24
                        if (r1 == r4) goto L1e
                        if (r1 != r3) goto L16
                        kotlin.C42729a0.b(r7)
                        goto L6f
                    L16:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1e:
                        kotlinx.coroutines.flow.j r1 = r6.f411556q
                        kotlin.C42729a0.b(r7)
                        goto L64
                    L24:
                        kotlin.C42729a0.b(r7)
                        kotlinx.coroutines.channels.B r7 = (kotlinx.coroutines.channels.B) r7
                        java.lang.Object r7 = r7.f410774a
                        goto L3c
                    L2c:
                        kotlin.C42729a0.b(r7)
                        r6.f411557r = r5
                        kotlinx.coroutines.channels.K0<java.lang.Object> r7 = r6.f411558s
                        kotlinx.coroutines.channels.x r7 = (kotlinx.coroutines.channels.C43124x) r7
                        java.lang.Object r7 = r7.s(r6)
                        if (r7 != r0) goto L3c
                        return r0
                    L3c:
                        boolean r1 = r7 instanceof kotlinx.coroutines.channels.B.c
                        if (r1 == 0) goto L4e
                        java.lang.Throwable r7 = kotlinx.coroutines.channels.B.b(r7)
                        if (r7 != 0) goto L4d
                        kotlinx.coroutines.flow.internal.AbortFlowException r7 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        kotlinx.coroutines.P0 r0 = r6.f411562w
                        r7.<init>(r0)
                    L4d:
                        throw r7
                    L4e:
                        kotlinx.coroutines.internal.a0 r1 = kotlinx.coroutines.flow.internal.z.f411583a
                        if (r7 != r1) goto L53
                        r7 = r2
                    L53:
                        kotlinx.coroutines.flow.j<java.lang.Object> r1 = r6.f411559t
                        r6.f411556q = r1
                        r6.f411557r = r4
                        Y41.q<java.lang.Object, java.lang.Object, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> r4 = r6.f411560u
                        java.lang.Object r5 = r6.f411561v
                        java.lang.Object r7 = r4.invoke(r5, r7, r6)
                        if (r7 != r0) goto L64
                        return r0
                    L64:
                        r6.f411556q = r2
                        r6.f411557r = r3
                        java.lang.Object r7 = r1.emit(r7, r6)
                        if (r7 != r0) goto L6f
                        return r0
                    L6f:
                        kotlin.G0 r7 = kotlin.G0.f406611a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.p.b.a.C11725a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* compiled from: Combine.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {125}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.internal.p$b$a$b, reason: collision with other inner class name */
            public static final class C11726b extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f411563q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ a<T> f411564r;

                /* renamed from: s, reason: collision with root package name */
                public int f411565s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C11726b(a<? super T> aVar, Continuation<? super C11726b> continuation) {
                    super(continuation);
                    this.f411564r = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f411563q = obj;
                    this.f411565s |= BeduinInputModel.MIN_TEXT_VERSION;
                    return this.f411564r.emit(null, this);
                }
            }

            public a(CoroutineContext coroutineContext, Object obj, K0 k02, InterfaceC43172j interfaceC43172j, Y41.q qVar, P0 p02) {
                this.f411550b = coroutineContext;
                this.f411551c = obj;
                this.f411552d = k02;
                this.f411553e = interfaceC43172j;
                this.f411554f = qVar;
                this.f411555g = p02;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r12, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof kotlinx.coroutines.flow.internal.p.b.a.C11726b
                    if (r0 == 0) goto L13
                    r0 = r13
                    kotlinx.coroutines.flow.internal.p$b$a$b r0 = (kotlinx.coroutines.flow.internal.p.b.a.C11726b) r0
                    int r1 = r0.f411565s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f411565s = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.p$b$a$b r0 = new kotlinx.coroutines.flow.internal.p$b$a$b
                    r0.<init>(r11, r13)
                L18:
                    java.lang.Object r13 = r0.f411563q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f411565s
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r13)
                    goto L53
                L29:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L31:
                    kotlin.C42729a0.b(r13)
                    kotlin.G0 r13 = kotlin.G0.f406611a
                    kotlinx.coroutines.flow.internal.p$b$a$a r2 = new kotlinx.coroutines.flow.internal.p$b$a$a
                    kotlinx.coroutines.P0 r9 = r11.f411555g
                    kotlinx.coroutines.channels.K0<java.lang.Object> r5 = r11.f411552d
                    Y41.q<java.lang.Object, java.lang.Object, kotlin.coroutines.Continuation<java.lang.Object>, java.lang.Object> r7 = r11.f411554f
                    kotlinx.coroutines.flow.j<java.lang.Object> r6 = r11.f411553e
                    r10 = 0
                    r4 = r2
                    r8 = r12
                    r4.<init>(r5, r6, r7, r8, r9, r10)
                    r0.f411565s = r3
                    kotlin.coroutines.CoroutineContext r12 = r11.f411550b
                    java.lang.Object r3 = r11.f411551c
                    java.lang.Object r12 = kotlinx.coroutines.flow.internal.C43169g.a(r12, r13, r3, r2, r0)
                    if (r12 != r1) goto L53
                    return r1
                L53:
                    kotlin.G0 r12 = kotlin.G0.f406611a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.p.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC43160i interfaceC43160i, CoroutineContext coroutineContext, Object obj, K0 k02, InterfaceC43172j interfaceC43172j, Y41.q qVar, P0 p02, Continuation continuation) {
            super(2, continuation);
            this.f411543r = interfaceC43160i;
            this.f411544s = coroutineContext;
            this.f411545t = obj;
            this.f411546u = k02;
            this.f411547v = interfaceC43172j;
            this.f411548w = qVar;
            this.f411549x = p02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f411543r, this.f411544s, this.f411545t, this.f411546u, this.f411547v, this.f411548w, this.f411549x, continuation);
        }

        @Override // Y41.p
        public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
            return ((b) create(g02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f411542q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a(this.f411544s, this.f411545t, this.f411546u, this.f411547v, this.f411548w, this.f411549x);
                this.f411542q = 1;
                if (this.f411543r.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: Combine.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/channels/I0;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<I0<? super Object>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f411566q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f411567r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ m f411568s;

        /* compiled from: Combine.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I0<Object> f411569b;

            /* compiled from: Combine.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {87}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.internal.p$c$a$a, reason: collision with other inner class name */
            public static final class C11727a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f411570q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ a<T> f411571r;

                /* renamed from: s, reason: collision with root package name */
                public int f411572s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C11727a(a<? super T> aVar, Continuation<? super C11727a> continuation) {
                    super(continuation);
                    this.f411571r = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f411570q = obj;
                    this.f411572s |= BeduinInputModel.MIN_TEXT_VERSION;
                    return this.f411571r.emit(null, this);
                }
            }

            public a(I0<Object> i02) {
                this.f411569b = i02;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.internal.p.c.a.C11727a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.internal.p$c$a$a r0 = (kotlinx.coroutines.flow.internal.p.c.a.C11727a) r0
                    int r1 = r0.f411572s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f411572s = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.p$c$a$a r0 = new kotlinx.coroutines.flow.internal.p$c$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f411570q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f411572s
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    kotlinx.coroutines.channels.I0<java.lang.Object> r6 = r4.f411569b
                    kotlinx.coroutines.channels.M0 r6 = r6.r()
                    if (r5 != 0) goto L3e
                    kotlinx.coroutines.internal.a0 r5 = kotlinx.coroutines.flow.internal.z.f411583a
                L3e:
                    r0.f411572s = r3
                    java.lang.Object r5 = r6.send(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.p.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m mVar, Continuation continuation) {
            super(2, continuation);
            this.f411568s = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f411568s, continuation);
            cVar.f411567r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super Object> i02, Continuation<? super G0> continuation) {
            return ((c) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f411566q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((I0) this.f411567r);
                this.f411566q = 1;
                if (this.f411568s.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, InterfaceC43160i interfaceC43160i, InterfaceC43172j interfaceC43172j, Y41.q qVar, Continuation continuation) {
        super(2, continuation);
        this.f411537t = mVar;
        this.f411538u = interfaceC43160i;
        this.f411539v = interfaceC43172j;
        this.f411540w = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f411537t, this.f411538u, this.f411539v, this.f411540w, continuation);
        pVar.f411536s = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((p) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        K0 k02;
        P0 p02;
        Y41.p<Object, CoroutineContext.Element, Object> pVar;
        CoroutineContext coroutineContextPlus;
        G0 g02;
        b bVar;
        CancellationException cancellationException;
        CancellationException cancellationException2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411535r;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p02 = this.f411534q;
                k02 = (K0) this.f411536s;
                try {
                    C42729a0.b(obj);
                    cancellationException2 = null;
                } catch (AbortFlowException e12) {
                    e = e12;
                } catch (Throwable th2) {
                    th = th2;
                    cancellationException = null;
                    k02.c(cancellationException);
                    throw th;
                }
                k02.c(cancellationException2);
                return G0.f406611a;
            }
            C42729a0.b(obj);
            T t12 = (T) this.f411536s;
            K0 k0D = F0.d(t12, null, 0, new c(this.f411537t, null), 3);
            P0 p0A = Q0.a();
            ((M0) k0D).g(new a(p0A));
            try {
                CoroutineContext f401642c = t12.getF401596i();
                pVar = g0.f411899b;
                Object objFold = f401642c.fold(0, pVar);
                coroutineContextPlus = t12.getF401596i().plus(p0A);
                g02 = G0.f406611a;
                bVar = new b(this.f411538u, f401642c, objFold, k0D, this.f411539v, this.f411540w, p0A, null);
                this.f411536s = k0D;
                this.f411534q = p0A;
                this.f411535r = 1;
            } catch (AbortFlowException e13) {
                e = e13;
                k02 = k0D;
                p02 = p0A;
            } catch (Throwable th3) {
                th = th3;
                k02 = k0D;
                cancellationException = null;
                k02.c(cancellationException);
                throw th;
            }
            if (C43169g.a(coroutineContextPlus, g02, coroutineContextPlus.fold(0, pVar), bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            k02 = k0D;
            cancellationException2 = null;
            k02.c(cancellationException2);
            return G0.f406611a;
            if (e.f411440b != p02) {
                throw e;
            }
            cancellationException2 = null;
            k02.c(cancellationException2);
            return G0.f406611a;
        } catch (Throwable th4) {
            th = th4;
            cancellationException = null;
            k02.c(cancellationException);
            throw th;
        }
    }
}
