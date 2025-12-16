package Ba1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* loaded from: classes9.dex */
public final class r extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f1529q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j f1530r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1531s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC43172j interfaceC43172j, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f1530r = interfaceC43172j;
        this.f1531s = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.f1530r, this.f1531s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f1529q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f1529q = 1;
            if (this.f1530r.emit(this.f1531s, this) == coroutine_suspended) {
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
