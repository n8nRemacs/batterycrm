package coil;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.K;

/* compiled from: RealImageLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcoil/request/q;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcoil/request/q;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class o extends SuspendLambda implements Y41.p<T, Continuation<? super coil.request.q>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f58581q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f58582r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ coil.request.p f58583s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f58584t;

    /* compiled from: RealImageLoader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcoil/request/q;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcoil/request/q;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super coil.request.q>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f58585q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ n f58586r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ coil.request.p f58587s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, coil.request.p pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f58586r = nVar;
            this.f58587s = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f58586r, this.f58587s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super coil.request.q> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f58585q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f58585q = 1;
                obj = n.d(this.f58586r, this.f58587s, 1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, coil.request.p pVar, Continuation continuation) {
        super(2, continuation);
        this.f58583s = pVar;
        this.f58584t = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        o oVar = new o(this.f58584t, this.f58583s, continuation);
        oVar.f58582r = obj;
        return oVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super coil.request.q> continuation) {
        return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f58581q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f58582r;
            kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
            AbstractC43129d1 abstractC43129d1Y = K.f411877a.y();
            coil.request.p pVar = this.f58583s;
            InterfaceC43076a0<? extends coil.request.q> interfaceC43076a0B = C43259k.b(t12, abstractC43129d1Y, new a(this.f58584t, pVar, null), 2);
            K2.c cVar2 = pVar.f58661c;
            if (cVar2 instanceof K2.d) {
                coil.util.l.c(((K2.d) cVar2).getView()).b(interfaceC43076a0B);
            }
            this.f58581q = 1;
            obj = interfaceC43076a0B.F(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
