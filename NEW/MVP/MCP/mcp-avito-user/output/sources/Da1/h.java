package da1;

import L91.z;
import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.n;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;

/* loaded from: classes9.dex */
public final class h extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f393922q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.passport.ui.camera.m f393923r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar, Continuation continuation) {
        super(2, continuation);
        this.f393923r = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f393923r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f393922q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ru.mts.biometry.sdk.feature.passport.ui.camera.m mVar = this.f393923r;
            n nVar = ru.mts.biometry.sdk.feature.passport.ui.camera.m.f436487n0[0];
            n2 n2Var = ((z) mVar.f436488h0.a(mVar)).f9866P;
            C39695g c39695g = new C39695g(mVar);
            this.f393922q = 1;
            if (n2Var.collect(c39695g, this) == coroutine_suspended) {
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
