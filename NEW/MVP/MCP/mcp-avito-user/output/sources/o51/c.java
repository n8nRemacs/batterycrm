package O51;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes8.dex */
public final class c extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f12001q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f12002r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f12003s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, boolean z12, Continuation continuation) {
        super(2, continuation);
        this.f12002r = dVar;
        this.f12003s = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f12002r, this.f12003s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f12001q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z1 z12 = this.f12002r.f12007d;
            Boolean boolBoxBoolean = Boxing.boxBoolean(this.f12003s);
            this.f12001q = 1;
            if (z12.emit(boolBoxBoolean, this) == coroutine_suspended) {
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
