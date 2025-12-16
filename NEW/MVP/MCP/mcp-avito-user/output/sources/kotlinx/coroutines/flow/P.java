package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.channels.B;

/* compiled from: Delay.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/flow/j;", "downstream", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {JfifUtil.MARKER_RST7, 418}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes8.dex */
final class P extends SuspendLambda implements Y41.q<kotlinx.coroutines.T, InterfaceC43172j<Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public l0.h f411189q;

    /* renamed from: r, reason: collision with root package name */
    public l0.g f411190r;

    /* renamed from: s, reason: collision with root package name */
    public int f411191s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f411192t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f411193u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f411194v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<Object> f411195w;

    /* compiled from: Delay.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f411196q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<Object> f411197r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ l0.h<Object> f411198s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, l0.h hVar, InterfaceC43172j interfaceC43172j) {
            super(1, continuation);
            this.f411197r = interfaceC43172j;
            this.f411198s = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.k Continuation<?> continuation) {
            return new a(continuation, this.f411198s, this.f411197r);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super kotlin.G0> continuation) {
            return ((a) create(continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f411196q;
            l0.h<Object> hVar = this.f411198s;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.internal.a0 a0Var = kotlinx.coroutines.flow.internal.z.f411583a;
                Object obj2 = hVar.f406842b;
                if (obj2 == a0Var) {
                    obj2 = null;
                }
                this.f411196q = 1;
                if (this.f411197r.emit(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            hVar.f406842b = null;
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Delay.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/channels/B;", "", "value", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/B;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {236}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.channels.B<? extends Object>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public l0.h f411199q;

        /* renamed from: r, reason: collision with root package name */
        public int f411200r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f411201s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ l0.h<Object> f411202t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<Object> f411203u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, l0.h hVar, InterfaceC43172j interfaceC43172j) {
            super(2, continuation);
            this.f411202t = hVar;
            this.f411203u = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(continuation, this.f411202t, this.f411203u);
            bVar.f411201s = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.channels.B<? extends Object> b12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(kotlinx.coroutines.channels.B.a(b12.f410774a), continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v7, types: [T, kotlinx.coroutines.internal.a0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
            l0.h<Object> hVar;
            l0.h<Object> hVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f411200r;
            if (i12 == 0) {
                C42729a0.b(obj);
                ?? r62 = ((kotlinx.coroutines.channels.B) this.f411201s).f410774a;
                boolean z12 = r62 instanceof B.c;
                hVar = this.f411202t;
                if (!z12) {
                    hVar.f406842b = r62;
                }
                if (z12) {
                    Throwable thB = kotlinx.coroutines.channels.B.b(r62);
                    if (thB != null) {
                        throw thB;
                    }
                    Object obj2 = hVar.f406842b;
                    if (obj2 != null) {
                        if (obj2 == kotlinx.coroutines.flow.internal.z.f411583a) {
                            obj2 = null;
                        }
                        this.f411201s = r62;
                        this.f411199q = hVar;
                        this.f411200r = 1;
                        if (this.f411203u.emit(obj2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        hVar2 = hVar;
                    }
                    hVar.f406842b = kotlinx.coroutines.flow.internal.z.f411585c;
                }
                return kotlin.G0.f406611a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar2 = this.f411199q;
            C42729a0.b(obj);
            hVar = hVar2;
            hVar.f406842b = kotlinx.coroutines.flow.internal.z.f411585c;
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Delay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/channels/I0;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.channels.I0<? super Object>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f411204q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f411205r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<Object> f411206s;

        /* compiled from: Delay.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.channels.I0<Object> f411207b;

            /* compiled from: Delay.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {204}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.P$c$a$a, reason: collision with other inner class name */
            public static final class C11713a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f411208q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ a<T> f411209r;

                /* renamed from: s, reason: collision with root package name */
                public int f411210s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C11713a(a<? super T> aVar, Continuation<? super C11713a> continuation) {
                    super(continuation);
                    this.f411209r = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f411208q = obj;
                    this.f411210s |= BeduinInputModel.MIN_TEXT_VERSION;
                    return this.f411209r.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.channels.I0<Object> i02) {
                this.f411207b = i02;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.P.c.a.C11713a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.P$c$a$a r0 = (kotlinx.coroutines.flow.P.c.a.C11713a) r0
                    int r1 = r0.f411210s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f411210s = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.P$c$a$a r0 = new kotlinx.coroutines.flow.P$c$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f411208q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f411210s
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    if (r5 != 0) goto L38
                    kotlinx.coroutines.internal.a0 r5 = kotlinx.coroutines.flow.internal.z.f411583a
                L38:
                    r0.f411210s = r3
                    kotlinx.coroutines.channels.I0<java.lang.Object> r6 = r4.f411207b
                    java.lang.Object r5 = r6.send(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.P.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC43160i<Object> interfaceC43160i, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f411206s = interfaceC43160i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f411206s, continuation);
            cVar.f411205r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.channels.I0<? super Object> i02, Continuation<? super kotlin.G0> continuation) {
            return ((c) create(i02, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f411204q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((kotlinx.coroutines.channels.I0) this.f411205r);
                this.f411204q = 1;
                if (this.f411206s.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public P(Y41.l lVar, Continuation continuation, InterfaceC43160i interfaceC43160i) {
        super(3, continuation);
        this.f411194v = (kotlin.jvm.internal.N) lVar;
        this.f411195w = interfaceC43160i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.q
    public final Object invoke(kotlinx.coroutines.T t12, InterfaceC43172j<Object> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        P p12 = new P(this.f411194v, continuation, this.f411195w);
        p12.f411192t = t12;
        p12.f411193u = interfaceC43172j;
        return p12.invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Type inference failed for: r9v0, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d7 -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.P.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
