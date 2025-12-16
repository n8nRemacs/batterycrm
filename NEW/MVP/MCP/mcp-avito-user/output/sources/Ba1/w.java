package Ba1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* loaded from: classes9.dex */
public final class w extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f1552q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1553r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f1554s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(InterfaceC43160i interfaceC43160i, Continuation continuation) {
        super(2, continuation);
        this.f1554s = interfaceC43160i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        w wVar = new w(this.f1554s, continuation);
        wVar.f1553r = obj;
        return wVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((InterfaceC43172j) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f1552q;
        if (i12 == 0) {
            C42729a0.b(obj);
            v vVar = new v(null, this.f1554s, (InterfaceC43172j) this.f1553r);
            this.f1552q = 1;
            if (U.c(vVar, this) == coroutine_suspended) {
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
