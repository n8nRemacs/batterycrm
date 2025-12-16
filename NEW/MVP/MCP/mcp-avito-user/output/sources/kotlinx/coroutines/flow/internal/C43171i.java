package kotlinx.coroutines.flow.internal;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"S", "T", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: kotlinx.coroutines.flow.internal.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43171i extends SuspendLambda implements Y41.p<InterfaceC43172j<Object>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f411484q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411485r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j<Object, Object> f411486s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43171i(j<Object, Object> jVar, Continuation<? super C43171i> continuation) {
        super(2, continuation);
        this.f411486s = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C43171i c43171i = new C43171i(this.f411486s, continuation);
        c43171i.f411485r = obj;
        return c43171i;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C43171i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411484q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j<? super Object> interfaceC43172j = (InterfaceC43172j) this.f411485r;
            this.f411484q = 1;
            if (this.f411486s.f(interfaceC43172j, this) == coroutine_suspended) {
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
