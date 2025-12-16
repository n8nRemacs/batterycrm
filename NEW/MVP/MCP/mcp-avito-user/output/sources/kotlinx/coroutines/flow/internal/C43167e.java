package kotlinx.coroutines.flow.internal;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.I0;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/channels/I0;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: kotlinx.coroutines.flow.internal.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43167e extends SuspendLambda implements Y41.p<I0<Object>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f411463q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411464r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC43168f<Object> f411465s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43167e(AbstractC43168f<Object> abstractC43168f, Continuation<? super C43167e> continuation) {
        super(2, continuation);
        this.f411465s = abstractC43168f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C43167e c43167e = new C43167e(this.f411465s, continuation);
        c43167e.f411464r = obj;
        return c43167e;
    }

    @Override // Y41.p
    public final Object invoke(I0<Object> i02, Continuation<? super G0> continuation) {
        return ((C43167e) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411463q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0<? super Object> i02 = (I0) this.f411464r;
            this.f411463q = 1;
            if (this.f411465s.b(i02, this) == coroutine_suspended) {
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
