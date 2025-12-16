package L91;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;

/* loaded from: classes9.dex */
public final class i extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f9826q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.camera.ui.n f9827r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ru.mts.biometry.sdk.feature.document.camera.ui.n nVar, Continuation continuation) {
        super(2, continuation);
        this.f9827r = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f9827r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f9826q;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.document.camera.ui.n.f436424m0;
            ru.mts.biometry.sdk.feature.document.camera.ui.n nVar = this.f9827r;
            n2 n2Var = nVar.f5().f9866P;
            h hVar = new h(nVar);
            this.f9826q = 1;
            if (n2Var.collect(hVar, this) == coroutine_suspended) {
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
