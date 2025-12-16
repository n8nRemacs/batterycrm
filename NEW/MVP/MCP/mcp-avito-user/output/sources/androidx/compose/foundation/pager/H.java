package androidx.compose.foundation.pager;

import androidx.compose.animation.core.C20310q;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Pager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performBackwardPaging$1", f = "Pager.kt", i = {}, l = {554}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class H extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f29814q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m0 f29815r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(m0 m0Var, Continuation<? super H> continuation) {
        super(2, continuation);
        this.f29815r = m0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new H(this.f29815r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((H) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f29814q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f29814q = 1;
            float f12 = p0.f30020a;
            m0 m0Var = this.f29815r;
            if (m0Var.j() - 1 < 0 || (objF = m0Var.f(m0Var.j() - 1, C20310q.d(0.0f, 7, null), this)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objF = G0.f406611a;
            }
            if (objF == coroutine_suspended) {
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
