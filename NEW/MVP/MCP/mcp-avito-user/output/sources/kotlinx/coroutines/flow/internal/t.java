package kotlinx.coroutines.flow.internal;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FlowCoroutine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class t extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f411576q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411577r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f411578s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<Object> f411579t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(Y41.q<? super T, ? super InterfaceC43172j<Object>, ? super Continuation<? super G0>, ? extends Object> qVar, InterfaceC43172j<Object> interfaceC43172j, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f411578s = (SuspendLambda) qVar;
        this.f411579t = interfaceC43172j;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        t tVar = new t(this.f411578s, this.f411579t, continuation);
        tVar.f411577r = obj;
        return tVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((t) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411576q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f411577r;
            this.f411576q = 1;
            if (this.f411578s.invoke(t12, this.f411579t, this) == coroutine_suspended) {
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
