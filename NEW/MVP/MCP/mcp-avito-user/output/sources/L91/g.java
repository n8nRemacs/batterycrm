package L91;

import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class g extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f9823q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.camera.ui.n f9824r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ru.mts.biometry.sdk.feature.document.camera.ui.n nVar, Continuation continuation) {
        super(2, continuation);
        this.f9824r = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f9824r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f9823q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            ru.mts.biometry.sdk.feature.document.camera.ui.n nVar = this.f9824r;
            f fVar = new f(nVar, null);
            this.f9823q = 1;
            if (C23056p0.b(nVar, state, fVar, this) == coroutine_suspended) {
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
