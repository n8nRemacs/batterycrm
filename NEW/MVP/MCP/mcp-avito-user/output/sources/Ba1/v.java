package Ba1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* loaded from: classes9.dex */
public final class v extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f1548q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1549r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f1550s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j f1551t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Continuation continuation, InterfaceC43160i interfaceC43160i, InterfaceC43172j interfaceC43172j) {
        super(2, continuation);
        this.f1550s = interfaceC43160i;
        this.f1551t = interfaceC43172j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        v vVar = new v(continuation, this.f1550s, this.f1551t);
        vVar.f1549r = obj;
        return vVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f1548q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f1549r;
            CoroutineContext f38162b = t12.getF38162b();
            u uVar = new u(new l0.g(), this.f1551t, new l0.h(), t12, f38162b);
            this.f1548q = 1;
            if (this.f1550s.collect(uVar, this) == coroutine_suspended) {
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
