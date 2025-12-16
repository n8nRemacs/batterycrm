package androidx.work;

import androidx.concurrent.futures.b;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ListenableFuture.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.work.ListenableFutureKt$launchFuture$1$2", f = "ListenableFuture.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class D extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f55368q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55369r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f55370s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.a<Object> f55371t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D(Y41.p<? super kotlinx.coroutines.T, ? super Continuation<Object>, ? extends Object> pVar, b.a<Object> aVar, Continuation<? super D> continuation) {
        super(2, continuation);
        this.f55370s = (SuspendLambda) pVar;
        this.f55371t = aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        D d12 = new D(this.f55370s, this.f55371t, continuation);
        d12.f55369r = obj;
        return d12;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((D) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f55368q;
        b.a<Object> aVar = this.f55371t;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f55369r;
                ?? r12 = this.f55370s;
                this.f55368q = 1;
                obj = r12.invoke(t12, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            aVar.b(obj);
        } catch (CancellationException unused) {
            aVar.c();
        } catch (Throwable th2) {
            aVar.d(th2);
        }
        return G0.f406611a;
    }
}
