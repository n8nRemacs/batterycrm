package l31;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;

/* loaded from: classes8.dex */
public final class g extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f413441q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f413442r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f413443s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(2, continuation);
        this.f413443s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(this.f413443s, continuation);
        gVar.f413442r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((I0) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f413441q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f413442r;
            f fVar = new f(i02);
            h hVar = this.f413443s;
            hVar.f413448e = fVar;
            C43540e c43540e = new C43540e(hVar);
            this.f413441q = 1;
            if (F0.a(i02, c43540e, this) == coroutine_suspended) {
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
