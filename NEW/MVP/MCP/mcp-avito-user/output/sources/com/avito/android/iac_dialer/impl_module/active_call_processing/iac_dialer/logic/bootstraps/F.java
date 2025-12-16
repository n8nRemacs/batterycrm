package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.finalizing.OnFinalLinkResolvedAction;
import com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FinalizingBootstrap.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.FinalizingBootstrap$process$1$1$1", f = "FinalizingBootstrap.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class F extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f165103q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ FinalizingBootstrap f165104r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ IacEvent.Finalizing f165105s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ IacBootstrap.a f165106t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(FinalizingBootstrap finalizingBootstrap, IacEvent.Finalizing finalizing, IacBootstrap.a aVar, Continuation<? super F> continuation) {
        super(2, continuation);
        this.f165104r = finalizingBootstrap;
        this.f165105s = finalizing;
        this.f165106t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new F(this.f165104r, this.f165105s, this.f165106t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((F) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f165103q;
        if (i12 == 0) {
            C42729a0.b(obj);
            IacFinalLinkInteractor iacFinalLinkInteractor = this.f165104r.iacFinalLinkInteractor;
            IacFinalLinkInteractor.Params params = ((IacEvent.Finalizing.ResolveFinalLink) this.f165105s).getParams();
            this.f165103q = 1;
            obj = iacFinalLinkInteractor.a(params, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        this.f165106t.a(new OnFinalLinkResolvedAction(new IacPiiDeepLink((DeepLink) obj)));
        return G0.f406611a;
    }
}
