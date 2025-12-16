package K91;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes9.dex */
public final class y extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f9331q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ A f9332r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a12, Continuation continuation) {
        super(2, continuation);
        this.f9332r = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        y yVar = new y(this.f9332r, continuation);
        yVar.f9331q = obj;
        return yVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((ru.mts.biometry.sdk.domain.entity.polling.status.d) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (((ru.mts.biometry.sdk.domain.entity.polling.status.d) this.f9331q) != ru.mts.biometry.sdk.domain.entity.polling.status.d.f436405i) {
            this.f9332r.f9298J.f17823e = false;
        }
        return G0.f406611a;
    }
}
