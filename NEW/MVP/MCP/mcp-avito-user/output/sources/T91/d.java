package T91;

import B91.H;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;

/* loaded from: classes9.dex */
public final class d extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f15446q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.documentResult.ui.h f15447r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H f15448s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Continuation continuation, H h12, ru.mts.biometry.sdk.feature.documentResult.ui.h hVar) {
        super(2, continuation);
        this.f15447r = hVar;
        this.f15448s = h12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(continuation, this.f15448s, this.f15447r);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f15446q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C15343a c15343a = ru.mts.biometry.sdk.feature.documentResult.ui.h.f436451k0;
            ru.mts.biometry.sdk.feature.documentResult.ui.h hVar = this.f15447r;
            n2 n2Var = hVar.e5().f15494M;
            C15345c c15345c = new C15345c(this.f15448s, hVar);
            this.f15446q = 1;
            if (n2Var.collect(c15345c, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
