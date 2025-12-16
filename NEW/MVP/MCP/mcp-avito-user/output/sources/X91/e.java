package X91;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import ru.mts.biometry.sdk.feature.main.ui.BiometryActivity;

/* loaded from: classes9.dex */
public final class e extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f18731q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BiometryActivity f18732r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BiometryActivity biometryActivity, Continuation continuation) {
        super(2, continuation);
        this.f18732r = biometryActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f18732r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f18731q;
        if (i12 == 0) {
            C42729a0.b(obj);
            z91.s sVar = z91.e.f443908b;
            if (sVar != null) {
                C91.h hVarC = sVar.c();
                this.f18731q = 1;
                hVarC.getClass();
                Object objG = C43259k.g(C43262l0.f411947c, new C91.g(hVarC, null), this);
                if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objG = G0.f406611a;
                }
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.f18732r.finish();
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
