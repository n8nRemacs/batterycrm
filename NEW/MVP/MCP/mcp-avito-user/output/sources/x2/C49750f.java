package x2;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;

/* renamed from: x2.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C49750f extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f442127q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C49751g f442128r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49750f(C49751g c49751g, Continuation continuation) {
        super(2, continuation);
        this.f442128r = c49751g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C49750f(this.f442128r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return new C49750f(this.f442128r, (Continuation) obj2).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f442127q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C49751g c49751g = this.f442128r;
            C43197r1 c43197r1 = new C43197r1(new C49746b(c49751g, null), C43175k.I(C43262l0.f411945a, new C49749e(C43175k.d(new l31.g(c49751g.f442129a, null)), c49751g)));
            this.f442127q = 1;
            if (C43175k.i(c43197r1, this) == coroutine_suspended) {
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
