package kotlinx.coroutines.flow.internal;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/flow/internal/l;", "T", "R", "Lkotlinx/coroutines/flow/internal/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class l<T, R> extends j<T, R> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.q<InterfaceC43172j<? super R>, T, Continuation<? super G0>, Object> f411488f;

    /* compiled from: Merge.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f411489q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f411490r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ l<T, R> f411491s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<R> f411492t;

        /* compiled from: Merge.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlinx.coroutines.flow.internal.l$a$a, reason: collision with other inner class name */
        public static final class C11720a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0.h<N0> f411493b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ T f411494c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l<T, R> f411495d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<R> f411496e;

            /* compiled from: Merge.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.internal.l$a$a$a, reason: collision with other inner class name */
            public static final class C11721a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f411497q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ l<T, R> f411498r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j<R> f411499s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ T f411500t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C11721a(l<T, R> lVar, InterfaceC43172j<? super R> interfaceC43172j, T t12, Continuation<? super C11721a> continuation) {
                    super(2, continuation);
                    this.f411498r = lVar;
                    this.f411499s = interfaceC43172j;
                    this.f411500t = t12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C11721a(this.f411498r, this.f411499s, this.f411500t, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C11721a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f411497q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        Y41.q<InterfaceC43172j<? super R>, T, Continuation<? super G0>, Object> qVar = this.f411498r.f411488f;
                        this.f411497q = 1;
                        if (qVar.invoke(this.f411499s, this.f411500t, this) == coroutine_suspended) {
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

            /* compiled from: Merge.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
            /* renamed from: kotlinx.coroutines.flow.internal.l$a$a$b */
            public static final class b extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public Object f411501q;

                /* renamed from: r, reason: collision with root package name */
                public Object f411502r;

                /* renamed from: s, reason: collision with root package name */
                public N0 f411503s;

                /* renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f411504t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ C11720a<T> f411505u;

                /* renamed from: v, reason: collision with root package name */
                public int f411506v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C11720a<? super T> c11720a, Continuation<? super b> continuation) {
                    super(continuation);
                    this.f411505u = c11720a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f411504t = obj;
                    this.f411506v |= BeduinInputModel.MIN_TEXT_VERSION;
                    return this.f411505u.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C11720a(l0.h<N0> hVar, T t12, l<T, R> lVar, InterfaceC43172j<? super R> interfaceC43172j) {
                this.f411493b = hVar;
                this.f411494c = t12;
                this.f411495d = lVar;
                this.f411496e = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.l.a.C11720a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    kotlinx.coroutines.flow.internal.l$a$a$b r0 = (kotlinx.coroutines.flow.internal.l.a.C11720a.b) r0
                    int r1 = r0.f411506v
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f411506v = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.l$a$a$b r0 = new kotlinx.coroutines.flow.internal.l$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f411504t
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f411506v
                    r3 = 1
                    if (r2 == 0) goto L37
                    if (r2 != r3) goto L2f
                    java.lang.Object r8 = r0.f411502r
                    java.lang.Object r0 = r0.f411501q
                    kotlinx.coroutines.flow.internal.l$a$a r0 = (kotlinx.coroutines.flow.internal.l.a.C11720a) r0
                    kotlin.C42729a0.b(r9)
                    goto L5a
                L2f:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L37:
                    kotlin.C42729a0.b(r9)
                    kotlin.jvm.internal.l0$h<kotlinx.coroutines.N0> r9 = r7.f411493b
                    T r9 = r9.f406842b
                    kotlinx.coroutines.N0 r9 = (kotlinx.coroutines.N0) r9
                    if (r9 == 0) goto L59
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.c(r2)
                    r0.f411501q = r7
                    r0.f411502r = r8
                    r0.f411503s = r9
                    r0.f411506v = r3
                    java.lang.Object r9 = r9.A(r0)
                    if (r9 != r1) goto L59
                    return r1
                L59:
                    r0 = r7
                L5a:
                    kotlin.jvm.internal.l0$h<kotlinx.coroutines.N0> r9 = r0.f411493b
                    kotlinx.coroutines.CoroutineStart r1 = kotlinx.coroutines.CoroutineStart.f410683e
                    kotlinx.coroutines.flow.internal.l$a$a$a r2 = new kotlinx.coroutines.flow.internal.l$a$a$a
                    kotlinx.coroutines.flow.j<R> r4 = r0.f411496e
                    kotlinx.coroutines.flow.internal.l<T, R> r5 = r0.f411495d
                    r6 = 0
                    r2.<init>(r5, r4, r8, r6)
                    kotlinx.coroutines.T r8 = r0.f411494c
                    kotlinx.coroutines.N0 r8 = kotlinx.coroutines.C43259k.d(r8, r6, r1, r2, r3)
                    r9.f406842b = r8
                    kotlin.G0 r8 = kotlin.G0.f406611a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.l.a.C11720a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<T, R> lVar, InterfaceC43172j<? super R> interfaceC43172j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f411491s = lVar;
            this.f411492t = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f411491s, this.f411492t, continuation);
            aVar.f411490r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f411489q;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.f411490r;
                l0.h hVar = new l0.h();
                l<T, R> lVar = this.f411491s;
                InterfaceC43160i<S> interfaceC43160i = lVar.f411487e;
                C11720a c11720a = new C11720a(hVar, t12, lVar, this.f411492t);
                this.f411489q = 1;
                if (interfaceC43160i.collect(c11720a, this) == coroutine_suspended) {
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

    public /* synthetic */ l(Y41.q qVar, InterfaceC43160i interfaceC43160i, CoroutineContext coroutineContext, int i12, BufferOverflow bufferOverflow, int i13, C42822w c42822w) {
        this(qVar, interfaceC43160i, (i13 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i13 & 8) != 0 ? -2 : i12, (i13 & 16) != 0 ? BufferOverflow.f410777b : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43168f
    @Y61.k
    public final AbstractC43168f<R> c(@Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        return new l(this.f411488f, this.f411487e, coroutineContext, i12, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.j
    @Y61.l
    public final Object f(@Y61.k InterfaceC43172j<? super R> interfaceC43172j, @Y61.k Continuation<? super G0> continuation) {
        Object objC = U.c(new a(this, interfaceC43172j, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.k Y41.q<? super InterfaceC43172j<? super R>, ? super T, ? super Continuation<? super G0>, ? extends Object> qVar, @Y61.k InterfaceC43160i<? extends T> interfaceC43160i, @Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        super(i12, coroutineContext, bufferOverflow, interfaceC43160i);
        this.f411488f = qVar;
    }
}
