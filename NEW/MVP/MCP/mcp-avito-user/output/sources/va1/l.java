package va1;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;

/* loaded from: classes9.dex */
public final class l extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f440860q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f440861r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f440862s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Continuation continuation) {
        super(2, continuation);
        this.f440862s = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        l lVar = new l(this.f440862s, continuation);
        lVar.f440861r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ru.mts.biometry.sdk.domain.entity.polling.status.d) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f440860q;
        m mVar = this.f440862s;
        if (i12 == 0) {
            C42729a0.b(obj);
            ru.mts.biometry.sdk.domain.entity.polling.status.d dVar = (ru.mts.biometry.sdk.domain.entity.polling.status.d) this.f440861r;
            if (dVar == ru.mts.biometry.sdk.domain.entity.polling.status.d.f436398b || dVar == ru.mts.biometry.sdk.domain.entity.polling.status.d.f436399c) {
                return G0.f406611a;
            }
            if (dVar != ru.mts.biometry.sdk.domain.entity.polling.status.d.f436400d) {
                mVar.f440867M.setValue(i.f440854a);
                this.f440860q = 1;
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
        mVar.f440864J.f17823e = false;
        mVar.f440865K.f2041e = null;
        return G0.f406611a;
    }
}
