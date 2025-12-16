package T91;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;

/* loaded from: classes9.dex */
public final class m extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f15461q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.documentResult.ui.o f15462r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ru.mts.biometry.sdk.feature.documentResult.ui.o oVar, Continuation continuation) {
        super(2, continuation);
        this.f15462r = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f15462r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f15461q;
        if (i12 == 0) {
            C42729a0.b(obj);
            k kVar = ru.mts.biometry.sdk.feature.documentResult.ui.o.f436456l0;
            ru.mts.biometry.sdk.feature.documentResult.ui.o oVar = this.f15462r;
            n2 n2Var = oVar.e5().f15494M;
            l lVar = new l(oVar);
            this.f15461q = 1;
            if (n2Var.collect(lVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
