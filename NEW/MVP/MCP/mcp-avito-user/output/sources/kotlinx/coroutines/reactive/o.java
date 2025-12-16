package kotlinx.coroutines.reactive;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.C43243m;

/* compiled from: Continuation.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/coroutines/ContinuationKt$Continuation$1", "Lkotlin/coroutines/Continuation;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class o implements Continuation<G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f411998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f411999c;

    public o(CoroutineContext coroutineContext, r rVar) {
        this.f411998b = coroutineContext;
        this.f411999c = rVar;
    }

    @Override // kotlin.coroutines.Continuation
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final CoroutineContext getF411447c() {
        return this.f411998b;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@Y61.k Object obj) {
        r rVar = this.f411999c;
        try {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(new p(1, rVar, r.class, "flowProcessing", "flowProcessing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), rVar));
            int i12 = Z.f406624c;
            C43243m.a(G0.f406611a, continuationIntercepted);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            rVar.resumeWith(new Z.b(th2));
            throw th2;
        }
    }
}
