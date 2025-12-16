package androidx.compose.material3;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BasicTooltip.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.BasicTooltipStateImpl$show$2", f = "BasicTooltip.kt", i = {}, l = {159, 161}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class R0 extends SuspendLambda implements Y41.l<Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f35361q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ T0 f35362r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Continuation<? super kotlin.G0>, Object> f35363s;

    /* compiled from: BasicTooltip.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.BasicTooltipStateImpl$show$2$1", f = "BasicTooltip.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f35364q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Continuation<? super kotlin.G0>, Object> f35365r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Continuation<? super kotlin.G0>, ? extends Object> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35365r = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f35365r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f35364q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f35364q = 1;
                if (((S0) this.f35365r).invoke(this) == coroutine_suspended) {
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
    public R0(T0 t02, Y41.l<? super Continuation<? super kotlin.G0>, ? extends Object> lVar, Continuation<? super R0> continuation) {
        super(1, continuation);
        this.f35362r = t02;
        this.f35363s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.k Continuation<?> continuation) {
        return new R0(this.f35362r, this.f35363s, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super kotlin.G0> continuation) {
        return ((R0) create(continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f35361q;
        T0 t02 = this.f35362r;
        if (i12 == 0) {
            C42729a0.b(obj);
            t02.getClass();
            Y41.l<Continuation<? super kotlin.G0>, Object> lVar = this.f35363s;
            this.f35361q = 1;
            if (((S0) lVar).invoke(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        t02.getClass();
        throw null;
    }
}
