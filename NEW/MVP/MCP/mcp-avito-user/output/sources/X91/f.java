package X91;

import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ru.mts.biometry.sdk.feature.main.ui.BiometryActivity;

/* loaded from: classes9.dex */
public final class f extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f18733q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BiometryActivity f18734r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BiometryActivity biometryActivity, Continuation continuation) {
        super(2, continuation);
        this.f18734r = biometryActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f18734r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f18733q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46683f;
            BiometryActivity biometryActivity = this.f18734r;
            e eVar = new e(biometryActivity, null);
            this.f18733q = 1;
            if (C23056p0.b(biometryActivity, state, eVar, this) == coroutine_suspended) {
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
