package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* compiled from: Delay.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/flow/j;", "downstream", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {415}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes8.dex */
final class S extends SuspendLambda implements Y41.q<kotlinx.coroutines.T, InterfaceC43172j<Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public l0.h f411230q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.channels.K0 f411231r;

    /* renamed from: s, reason: collision with root package name */
    public int f411232s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f411233t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f411234u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f411235v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<Object> f411236w;

    /* compiled from: Delay.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/channels/B;", "", "result", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/B;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.channels.B<? extends Object>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f411237q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ l0.h<Object> f411238r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.channels.K0<kotlin.G0> f411239s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.h<Object> hVar, kotlinx.coroutines.channels.K0<kotlin.G0> k02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f411238r = hVar;
            this.f411239s = k02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f411238r, this.f411239s, continuation);
            aVar.f411237q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.channels.B<? extends Object> b12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(kotlinx.coroutines.channels.B.a(b12.f410774a), continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v7, types: [T, kotlinx.coroutines.internal.a0] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            ?? r32 = ((kotlinx.coroutines.channels.B) this.f411237q).f410774a;
            boolean z12 = r32 instanceof B.c;
            l0.h<Object> hVar = this.f411238r;
            if (!z12) {
                hVar.f406842b = r32;
            }
            if (z12) {
                Throwable thB = kotlinx.coroutines.channels.B.b(r32);
                if (thB != null) {
                    throw thB;
                }
                this.f411239s.c(new ChildCancelledException());
                hVar.f406842b = kotlinx.coroutines.flow.internal.z.f411585c;
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Delay.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlin.G0, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f411240q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ l0.h<Object> f411241r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<Object> f411242s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, l0.h hVar, InterfaceC43172j interfaceC43172j) {
            super(2, continuation);
            this.f411241r = hVar;
            this.f411242s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(continuation, this.f411241r, this.f411242s);
        }

        @Override // Y41.p
        public final Object invoke(kotlin.G0 g02, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(g02, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f411240q;
            if (i12 == 0) {
                C42729a0.b(obj);
                l0.h<Object> hVar = this.f411241r;
                Object obj2 = hVar.f406842b;
                if (obj2 == null) {
                    return kotlin.G0.f406611a;
                }
                hVar.f406842b = null;
                if (obj2 == kotlinx.coroutines.flow.internal.z.f411583a) {
                    obj2 = null;
                }
                this.f411240q = 1;
                if (this.f411242s.emit(obj2, this) == coroutine_suspended) {
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

    /* compiled from: Delay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/channels/I0;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.channels.I0<? super Object>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f411243q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f411244r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<Object> f411245s;

        /* compiled from: Delay.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.channels.I0<Object> f411246b;

            /* compiled from: Delay.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", i = {}, l = {273}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.S$c$a$a, reason: collision with other inner class name */
            public static final class C11714a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f411247q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ a<T> f411248r;

                /* renamed from: s, reason: collision with root package name */
                public int f411249s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C11714a(a<? super T> aVar, Continuation<? super C11714a> continuation) {
                    super(continuation);
                    this.f411248r = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f411247q = obj;
                    this.f411249s |= BeduinInputModel.MIN_TEXT_VERSION;
                    return this.f411248r.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.channels.I0<Object> i02) {
                this.f411246b = i02;
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
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.S.c.a.C11714a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.S$c$a$a r0 = (kotlinx.coroutines.flow.S.c.a.C11714a) r0
                    int r1 = r0.f411249s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f411249s = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.S$c$a$a r0 = new kotlinx.coroutines.flow.S$c$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f411247q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f411249s
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
                    r0.f411249s = r3
                    kotlinx.coroutines.channels.I0<java.lang.Object> r6 = r4.f411246b
                    java.lang.Object r5 = r6.send(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.S.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC43160i<Object> interfaceC43160i, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f411245s = interfaceC43160i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f411245s, continuation);
            cVar.f411244r = obj;
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
            int i12 = this.f411243q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((kotlinx.coroutines.channels.I0) this.f411244r);
                this.f411243q = 1;
                if (this.f411245s.collect(aVar, this) == coroutine_suspended) {
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
    public S(long j12, Continuation continuation, InterfaceC43160i interfaceC43160i) {
        super(3, continuation);
        this.f411235v = j12;
        this.f411236w = interfaceC43160i;
    }

    @Override // Y41.q
    public final Object invoke(kotlinx.coroutines.T t12, InterfaceC43172j<Object> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        S s5 = new S(this.f411235v, continuation, this.f411236w);
        s5.f411233t = t12;
        s5.f411234u = interfaceC43172j;
        return s5.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        kotlinx.coroutines.channels.K0 k0D;
        kotlinx.coroutines.channels.K0 k02;
        l0.h hVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411232s;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f411233t;
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f411234u;
            kotlinx.coroutines.channels.K0 k0D2 = kotlinx.coroutines.channels.F0.d(t12, null, -1, new c(this.f411236w, null), 1);
            l0.h hVar2 = new l0.h();
            interfaceC43172j = interfaceC43172j2;
            k0D = kotlinx.coroutines.channels.F0.d(t12, null, 0, new Q(this.f411235v, null), 1);
            k02 = k0D2;
            hVar = hVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0D = this.f411231r;
            hVar = this.f411230q;
            k02 = (kotlinx.coroutines.channels.K0) this.f411234u;
            interfaceC43172j = (InterfaceC43172j) this.f411233t;
            C42729a0.b(obj);
        }
        while (hVar.f406842b != kotlinx.coroutines.flow.internal.z.f411585c) {
            kotlinx.coroutines.selects.o oVar = new kotlinx.coroutines.selects.o(getF411447c());
            oVar.j(k02.E(), new a(hVar, k0D, null));
            oVar.j(k0D.v(), new b(null, hVar, interfaceC43172j));
            this.f411233t = interfaceC43172j;
            this.f411234u = k02;
            this.f411230q = hVar;
            this.f411231r = k0D;
            this.f411232s = 1;
            if (oVar.g(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.G0.f406611a;
    }
}
