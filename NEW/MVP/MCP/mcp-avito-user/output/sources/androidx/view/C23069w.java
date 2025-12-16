package androidx.view;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.view.Lifecycle;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FlowExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23069w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowExt.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
    /* renamed from: androidx.lifecycle.w$a */
    public static final class a<T> extends SuspendLambda implements p<I0<? super T>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f46900q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f46901r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f46902s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.State f46903t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<T> f46904u;

        /* compiled from: FlowExt.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.lifecycle.w$a$a, reason: collision with other inner class name */
        public static final class C1801a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f46905q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i<T> f46906r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ I0<T> f46907s;

            /* compiled from: FlowExt.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.lifecycle.w$a$a$a, reason: collision with other inner class name */
            public static final class C1802a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I0<T> f46908b;

                /* JADX WARN: Multi-variable type inference failed */
                public C1802a(I0<? super T> i02) {
                    this.f46908b = i02;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @l
                public final Object emit(T t12, @k Continuation<? super G0> continuation) {
                    Object objSend = this.f46908b.send(t12, continuation);
                    return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1801a(InterfaceC43160i<? extends T> interfaceC43160i, I0<? super T> i02, Continuation<? super C1801a> continuation) {
                super(2, continuation);
                this.f46906r = interfaceC43160i;
                this.f46907s = i02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C1801a(this.f46906r, this.f46907s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C1801a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f46905q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    C1802a c1802a = new C1802a(this.f46907s);
                    this.f46905q = 1;
                    if (this.f46906r.collect(c1802a, this) == coroutine_suspended) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public a(Lifecycle lifecycle, Lifecycle.State state, InterfaceC43160i<? extends T> interfaceC43160i, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f46902s = lifecycle;
            this.f46903t = state;
            this.f46904u = interfaceC43160i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f46902s, this.f46903t, this.f46904u, continuation);
            aVar.f46901r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((a) create((I0) obj, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            I0 i02;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f46900q;
            if (i12 == 0) {
                C42729a0.b(obj);
                I0 i03 = (I0) this.f46901r;
                C1801a c1801a = new C1801a(this.f46904u, i03, null);
                this.f46901r = i03;
                this.f46900q = 1;
                if (C23056p0.a(this.f46902s, this.f46903t, c1801a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i02 = i03;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i02 = (I0) this.f46901r;
                C42729a0.b(obj);
            }
            i02.h(null);
            return G0.f406611a;
        }
    }

    @k
    public static final <T> InterfaceC43160i<T> a(@k InterfaceC43160i<? extends T> interfaceC43160i, @k Lifecycle lifecycle, @k Lifecycle.State state) {
        return C43175k.d(new a(lifecycle, state, interfaceC43160i, null));
    }
}
