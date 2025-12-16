package Ca1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ru.mts.biometry.sdk.view.SdkBioPassportFrame;

/* loaded from: classes9.dex */
public final class o extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f2270q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SdkBioPassportFrame f2271r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(SdkBioPassportFrame sdkBioPassportFrame, Continuation continuation) {
        super(2, continuation);
        this.f2271r = sdkBioPassportFrame;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f2271r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f2270q;
        if (i12 == 0) {
            C42729a0.b(obj);
            SdkBioPassportFrame sdkBioPassportFrame = this.f2271r;
            InterfaceC43160i interfaceC43160iG = C43175k.G(new Ba1.w(sdkBioPassportFrame.f436548f, null));
            n nVar = new n(sdkBioPassportFrame, null);
            this.f2270q = 1;
            if (C43175k.j(interfaceC43160iG, nVar, this) == coroutine_suspended) {
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
