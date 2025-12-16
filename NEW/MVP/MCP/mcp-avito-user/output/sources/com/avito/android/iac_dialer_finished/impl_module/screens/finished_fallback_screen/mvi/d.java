package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi;

import Y41.p;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenInternalAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenState;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: IacFinishedFallbackScreenActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.IacFinishedFallbackScreenActor$onRecallByGsmClicked$1", f = "IacFinishedFallbackScreenActor.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super IacFinishedFallbackScreenInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f166589q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f166590r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ IacFinishedFallbackScreenState f166591s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f166592t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ IacFinishedFallbackScreenAction f166593u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(IacFinishedFallbackScreenState iacFinishedFallbackScreenState, a aVar, IacFinishedFallbackScreenAction iacFinishedFallbackScreenAction, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f166591s = iacFinishedFallbackScreenState;
        this.f166592t = aVar;
        this.f166593u = iacFinishedFallbackScreenAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f166591s, this.f166592t, this.f166593u, continuation);
        dVar.f166590r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super IacFinishedFallbackScreenInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f166589q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f166590r;
            IacFinishedFallbackScreenState iacFinishedFallbackScreenState = this.f166591s;
            IacPiiDeepLink gsmLink = iacFinishedFallbackScreenState.getArgument().getGsmLink();
            if (gsmLink == null) {
                a.c(this.f166592t, this.f166593u, "handle recall to gsm button");
                return G0.f406611a;
            }
            IacFinishedFallbackScreenInternalAction.HandleGsmLink handleGsmLink = new IacFinishedFallbackScreenInternalAction.HandleGsmLink(gsmLink, iacFinishedFallbackScreenState.getCallToSellerEventAnalytics());
            this.f166589q = 1;
            if (interfaceC43172j.emit(handleGsmLink, this) == coroutine_suspended) {
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
