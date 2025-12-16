package Fc1;

import androidx.compose.runtime.C22082i3;
import kotlin.C42729a0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;

@DebugMetadata(c = "feedback.shared.sdk.ui.pages.transforms.impl.TransformManagerImpl$scrollToFirstRequiredField$1$1$1", f = "TransformManagerImpl.kt", i = {}, l = {343, 344}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class U0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f5206q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F0 f5207r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC13717r4 f5208s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(F0 f02, AbstractC13717r4 abstractC13717r4, Continuation<? super U0> continuation) {
        super(2, continuation);
        this.f5207r = f02;
        this.f5208s = abstractC13717r4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new U0(this.f5207r, this.f5208s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((U0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f5206q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f5206q = 1;
            if (C43131e0.b(50L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            C42729a0.b(obj);
        }
        androidx.compose.foundation.d2 d2Var = this.f5207r.f4938j;
        if (d2Var != null) {
            AbstractC13717r4 abstractC13717r4 = this.f5208s;
            kotlin.reflect.n<Object> nVar = AbstractC13717r4.f5782k[0];
            C13609f3 c13609f3 = abstractC13717r4.f5789g;
            c13609f3.getClass();
            int iH2 = (int) l0.g.h(((l0.g) ((C22082i3) c13609f3.f5502b).getF42167b()).f413387a);
            this.f5206q = 2;
            obj = d2Var.h(iH2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.G0.f406611a;
    }
}
