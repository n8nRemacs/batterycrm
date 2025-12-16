package K91;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes9.dex */
public final class e extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f9309q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.address.ui.g f9310r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ru.mts.biometry.sdk.feature.address.ui.g gVar, Continuation continuation) {
        super(2, continuation);
        this.f9310r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f9310r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f9309q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ru.mts.biometry.sdk.feature.address.ui.g gVar = this.f9310r;
            Z1 z12 = ((A) gVar.f436420j0.getValue()).f9301M;
            d dVar = new d(gVar);
            this.f9309q = 1;
            if (z12.collect(dVar, this) == coroutine_suspended) {
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
