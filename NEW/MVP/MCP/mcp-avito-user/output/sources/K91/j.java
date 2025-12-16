package K91;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes9.dex */
public final class j extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f9315q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.address.ui.o f9316r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ru.mts.biometry.sdk.feature.address.ui.o oVar, Continuation continuation) {
        super(2, continuation);
        this.f9316r = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f9316r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f9315q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ru.mts.biometry.sdk.feature.address.ui.o oVar = this.f9316r;
            Z1 z12 = ((A) oVar.f436423i0.getValue()).f9300L;
            i iVar = new i(oVar);
            this.f9315q = 1;
            if (z12.collect(iVar, this) == coroutine_suspended) {
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
