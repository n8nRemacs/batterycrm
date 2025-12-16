package kotlinx.coroutines.flow.internal;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.K0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: kotlinx.coroutines.flow.internal.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43166d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f411459q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411460r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<Object> f411461s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC43168f<Object> f411462t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43166d(InterfaceC43172j<Object> interfaceC43172j, AbstractC43168f<Object> abstractC43168f, Continuation<? super C43166d> continuation) {
        super(2, continuation);
        this.f411461s = interfaceC43172j;
        this.f411462t = abstractC43168f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C43166d c43166d = new C43166d(this.f411461s, this.f411462t, continuation);
        c43166d.f411460r = obj;
        return c43166d;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C43166d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411459q;
        if (i12 == 0) {
            C42729a0.b(obj);
            K0<Object> k0E = this.f411462t.e((T) this.f411460r);
            this.f411459q = 1;
            if (C43175k.v(this.f411461s, k0E, this) == coroutine_suspended) {
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
