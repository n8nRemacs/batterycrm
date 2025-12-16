package e;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;
import sberid.sdk.global.models.StandName;

/* loaded from: classes.dex */
public final class d extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f394216q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f394217r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StandName f394218s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, StandName standName, Continuation continuation) {
        super(2, continuation);
        this.f394217r = hVar;
        this.f394218s = standName;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f394217r, this.f394218s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f394216q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z1 z12 = this.f394217r.f394240m;
            this.f394216q = 1;
            if (z12.emit(this.f394218s, this) == coroutine_suspended) {
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
