package T91;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes9.dex */
public final class u extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f15478q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z f15479r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z zVar, Continuation continuation) {
        super(2, continuation);
        this.f15479r = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        u uVar = new u(this.f15479r, continuation);
        uVar.f15478q = obj;
        return uVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((ru.mts.biometry.sdk.domain.entity.polling.status.d) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (((ru.mts.biometry.sdk.domain.entity.polling.status.d) this.f15478q) != ru.mts.biometry.sdk.domain.entity.polling.status.d.f436403g) {
            this.f15479r.f15492K.f17823e = false;
        }
        return G0.f406611a;
    }
}
