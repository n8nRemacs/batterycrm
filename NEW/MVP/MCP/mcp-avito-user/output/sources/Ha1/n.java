package ha1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class n extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f397247q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.camera.p f397248r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ru.mts.biometry.sdk.feature.recognition.ui.camera.p pVar, Continuation continuation) {
        super(2, continuation);
        this.f397248r = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f397248r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f397247q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f397247q = 1;
            if (C43131e0.b(1500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        int i13 = ru.mts.biometry.sdk.feature.recognition.ui.camera.p.f436498o0;
        ru.mts.biometry.sdk.feature.recognition.ui.camera.p pVar = this.f397248r;
        pVar.j5().f14152k = false;
        pVar.d();
        pVar.f436499m0 = null;
        return G0.f406611a;
    }
}
