package T91;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes9.dex */
public final class v extends SuspendLambda implements Y41.l {

    /* renamed from: q, reason: collision with root package name */
    public int f15480q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z f15481r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, Continuation continuation) {
        super(1, continuation);
        this.f15481r = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new v(this.f15481r, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        return ((v) create((Continuation) obj)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f15480q;
        if (i12 == 0) {
            C42729a0.b(obj);
            z zVar = this.f15481r;
            this.f15480q = 1;
            Object objN = zVar.f15490E.f19947a.f436344a.n(this);
            if (objN != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objN = G0.f406611a;
            }
            if (objN != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objN = G0.f406611a;
            }
            if (objN == coroutine_suspended) {
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
