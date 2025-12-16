package Ca1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.mts.biometry.sdk.view.SdkBioPassportFrame;

/* loaded from: classes9.dex */
public final class n extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ boolean f2268q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SdkBioPassportFrame f2269r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(SdkBioPassportFrame sdkBioPassportFrame, Continuation continuation) {
        super(2, continuation);
        this.f2269r = sdkBioPassportFrame;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        n nVar = new n(this.f2269r, continuation);
        nVar.f2268q = ((Boolean) obj).booleanValue();
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((n) create(bool, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f2269r.setActive(this.f2268q);
        return G0.f406611a;
    }
}
