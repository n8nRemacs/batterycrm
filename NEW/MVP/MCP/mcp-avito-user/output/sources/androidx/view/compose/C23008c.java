package androidx.view.compose;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.U1;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: FlowExt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/runtime/U1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/runtime/U1;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.lifecycle.compose.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23008c extends SuspendLambda implements p<U1<Object>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f46736q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f46737r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f46738s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f46739t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f46740u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n2 f46741v;

    /* compiled from: FlowExt.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", i = {}, l = {174, 175}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.compose.c$a */
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f46742q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f46743r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n2 f46744s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ U1<Object> f46745t;

        /* compiled from: FlowExt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.lifecycle.compose.c$a$a, reason: collision with other inner class name */
        public static final class C1794a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ U1<T> f46746b;

            public C1794a(U1<T> u12) {
                this.f46746b = u12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @l
            public final Object emit(T t12, @k Continuation<? super G0> continuation) {
                this.f46746b.setValue(t12);
                return G0.f406611a;
            }
        }

        /* compiled from: FlowExt.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.lifecycle.compose.c$a$b */
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f46747q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ n2 f46748r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ U1<Object> f46749s;

            /* compiled from: FlowExt.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.lifecycle.compose.c$a$b$a, reason: collision with other inner class name */
            public static final class C1795a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ U1<T> f46750b;

                public C1795a(U1<T> u12) {
                    this.f46750b = u12;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @l
                public final Object emit(T t12, @k Continuation<? super G0> continuation) {
                    this.f46750b.setValue(t12);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n2 n2Var, U1 u12, Continuation continuation) {
                super(2, continuation);
                this.f46748r = n2Var;
                this.f46749s = u12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new b(this.f46748r, this.f46749s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f46747q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C1795a c1795a = new C1795a(this.f46749s);
                    this.f46747q = 1;
                    if (this.f46748r.collect(c1795a, this) == coroutine_suspended) {
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
        public a(CoroutineContext coroutineContext, n2 n2Var, U1 u12, Continuation continuation) {
            super(2, continuation);
            this.f46743r = coroutineContext;
            this.f46744s = n2Var;
            this.f46745t = u12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f46743r, this.f46744s, this.f46745t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f46742q;
            if (i12 == 0) {
                C42729a0.b(obj);
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                CoroutineContext coroutineContext = this.f46743r;
                boolean zF2 = L.f(coroutineContext, emptyCoroutineContext);
                U1<Object> u12 = this.f46745t;
                n2 n2Var = this.f46744s;
                if (zF2) {
                    C1794a c1794a = new C1794a(u12);
                    this.f46742q = 1;
                    if (n2Var.collect(c1794a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    b bVar = new b(n2Var, u12, null);
                    this.f46742q = 2;
                    if (C43259k.g(coroutineContext, bVar, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23008c(Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, n2 n2Var, Continuation continuation) {
        super(2, continuation);
        this.f46738s = lifecycle;
        this.f46739t = state;
        this.f46740u = coroutineContext;
        this.f46741v = n2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        C23008c c23008c = new C23008c(this.f46738s, this.f46739t, this.f46740u, this.f46741v, continuation);
        c23008c.f46737r = obj;
        return c23008c;
    }

    @Override // Y41.p
    public final Object invoke(U1<Object> u12, Continuation<? super G0> continuation) {
        return ((C23008c) create(u12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f46736q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f46740u, this.f46741v, (U1) this.f46737r, null);
            this.f46736q = 1;
            if (C23056p0.a(this.f46738s, this.f46739t, aVar, this) == coroutine_suspended) {
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
