package androidx.compose.runtime;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SnapshotFlow.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Landroidx/compose/runtime/U1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/runtime/U1;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", i = {}, l = {67, 68}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class u3 extends SuspendLambda implements Y41.p<U1<Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f38776q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f38777r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f38778s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<Object> f38779t;

    /* compiled from: SnapshotFlow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ U1<Object> f38780b;

        public a(U1<Object> u12) {
            this.f38780b = u12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(T t12, Continuation<? super kotlin.G0> continuation) {
            this.f38780b.setValue(t12);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SnapshotFlow.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f38781q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<Object> f38782r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ U1<Object> f38783s;

        /* compiled from: SnapshotFlow.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ U1<Object> f38784b;

            public a(U1<Object> u12) {
                this.f38784b = u12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(T t12, Continuation<? super kotlin.G0> continuation) {
                this.f38784b.setValue(t12);
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC43160i<Object> interfaceC43160i, U1<Object> u12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f38782r = interfaceC43160i;
            this.f38783s = u12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f38782r, this.f38783s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f38781q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a(this.f38783s);
                this.f38781q = 1;
                if (this.f38782r.collect(aVar, this) == coroutine_suspended) {
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
    public u3(CoroutineContext coroutineContext, InterfaceC43160i<Object> interfaceC43160i, Continuation<? super u3> continuation) {
        super(2, continuation);
        this.f38778s = coroutineContext;
        this.f38779t = interfaceC43160i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        u3 u3Var = new u3(this.f38778s, this.f38779t, continuation);
        u3Var.f38777r = obj;
        return u3Var;
    }

    @Override // Y41.p
    public final Object invoke(U1<Object> u12, Continuation<? super kotlin.G0> continuation) {
        return ((u3) create(u12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f38776q;
        if (i12 == 0) {
            C42729a0.b(obj);
            U1 u12 = (U1) this.f38777r;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            CoroutineContext coroutineContext = this.f38778s;
            boolean zF2 = kotlin.jvm.internal.L.f(coroutineContext, emptyCoroutineContext);
            InterfaceC43160i<Object> interfaceC43160i = this.f38779t;
            if (zF2) {
                a aVar = new a(u12);
                this.f38776q = 1;
                if (interfaceC43160i.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                b bVar = new b(interfaceC43160i, u12, null);
                this.f38776q = 2;
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
        return kotlin.G0.f406611a;
    }
}
