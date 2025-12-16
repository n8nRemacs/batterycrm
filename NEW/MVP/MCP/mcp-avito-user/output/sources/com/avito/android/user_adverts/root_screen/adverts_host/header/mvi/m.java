package com.avito.android.user_adverts.root_screen.adverts_host.header.mvi;

import com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.x;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;

/* compiled from: ProfileHeaderMviViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.ProfileHeaderMviViewModelComposite$bindSafetyInfoToOverlayQueue$2", f = "ProfileHeaderMviViewModel.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class m extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f312759q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f312760r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b bVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f312760r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new m(this.f312760r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((m) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f312759q;
        if (i12 == 0) {
            C42729a0.b(obj);
            b bVar = this.f312760r;
            n2<PI0.b> state = bVar.f312686L.getState();
            this.f312759q = 1;
            Object objCollect = new x(state).collect(bVar.f312690P, this);
            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollect = G0.f406611a;
            }
            if (objCollect == coroutine_suspended) {
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
