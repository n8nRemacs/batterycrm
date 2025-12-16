package ha1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes9.dex */
public final class u extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f397260q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f397261r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f397262s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, Continuation continuation) {
        super(2, continuation);
        this.f397262s = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        u uVar = new u(this.f397262s, continuation);
        uVar.f397261r = obj;
        return uVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((ru.mts.biometry.sdk.domain.entity.polling.status.d) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f397260q;
        w wVar = this.f397262s;
        if (i12 == 0) {
            C42729a0.b(obj);
            ru.mts.biometry.sdk.domain.entity.polling.status.d dVar = (ru.mts.biometry.sdk.domain.entity.polling.status.d) this.f397261r;
            if (dVar == ru.mts.biometry.sdk.domain.entity.polling.status.d.f436406j) {
                return G0.f406611a;
            }
            if (dVar != ru.mts.biometry.sdk.domain.entity.polling.status.d.f436407k) {
                Z1 z12 = wVar.f397273N;
                E91.h hVar = wVar.f397268E.f395964a;
                z12.setValue(new r(hVar != null ? hVar.f3857g : null));
                this.f397260q = 1;
                if (C43131e0.b(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        wVar.f397269J.f17823e = false;
        wVar.f397270K.f2041e = null;
        return G0.f406611a;
    }
}
