package B81;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* loaded from: classes9.dex */
public final class c extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f887q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f888r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Integer f889s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f890t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, Integer num, e eVar, Continuation continuation) {
        super(2, continuation);
        this.f888r = str;
        this.f889s = num;
        this.f890t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f888r, this.f889s, this.f890t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f887q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z1 z12 = this.f890t.f898e;
            Q q12 = new Q(this.f888r, this.f889s);
            this.f887q = 1;
            if (z12.emit(q12, this) == coroutine_suspended) {
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
