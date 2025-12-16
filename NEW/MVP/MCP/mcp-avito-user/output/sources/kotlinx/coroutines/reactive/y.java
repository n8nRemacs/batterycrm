package kotlinx.coroutines.reactive;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: Publish.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000 \u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.reactive.PublisherCoroutine$registerSelectForSend$1", f = "Publish.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class y extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f412028q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z<Object> f412029r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.selects.r<?> f412030s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z<Object> zVar, kotlinx.coroutines.selects.r<?> rVar, Continuation<? super y> continuation) {
        super(2, continuation);
        this.f412029r = zVar;
        this.f412030s = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new y(this.f412029r, this.f412030s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((y) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f412028q;
        z<Object> zVar = this.f412029r;
        if (i12 == 0) {
            C42729a0.b(obj);
            AtomicLongFieldUpdater atomicLongFieldUpdater = z.f412031e;
            zVar.getClass();
            this.f412028q = 1;
            throw null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        G0 g02 = G0.f406611a;
        if (this.f412030s.e(zVar, g02)) {
            return g02;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = z.f412031e;
        zVar.getClass();
        throw null;
    }
}
