package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacBootstrap;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.recall.OnRecallAvailableAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.recall.OnRecallUnavailableAction;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CanRecallInteractorBootstrap.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.CanRecallInteractorBootstrap$process$1$1$1", f = "CanRecallInteractorBootstrap.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class C extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f165085q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CanRecallInteractorBootstrap f165086r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ IacEvent.CanRecallInteractor f165087s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ IacBootstrap.a f165088t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(CanRecallInteractorBootstrap canRecallInteractorBootstrap, IacEvent.CanRecallInteractor canRecallInteractor, IacBootstrap.a aVar, Continuation<? super C> continuation) {
        super(2, continuation);
        this.f165086r = canRecallInteractorBootstrap;
        this.f165087s = canRecallInteractor;
        this.f165088t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C(this.f165086r, this.f165087s, this.f165088t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object objA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f165085q;
        IacEvent.CanRecallInteractor canRecallInteractor = this.f165087s;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.iac_dialer.impl_module.canrecall_interactor.a aVar = this.f165086r.iacCanRecallInteractor;
            IacEvent.CanRecallInteractor.CheckCanRecall checkCanRecall = (IacEvent.CanRecallInteractor.CheckCanRecall) canRecallInteractor;
            String prevCallId = checkCanRecall.getCallInput().getPrevCallId();
            String callId = checkCanRecall.getCallInput().getCallId();
            String scenario = checkCanRecall.getCallInput().getScenario();
            this.f165085q = 1;
            objA = aVar.a(prevCallId, callId, scenario);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            objA = ((kotlin.Z) obj).f406625b;
        }
        Throwable thB = kotlin.Z.b(objA);
        IacBootstrap.a aVar2 = this.f165088t;
        if (thB == null) {
            IacCanCallResult iacCanCallResult = (IacCanCallResult) objA;
            if (iacCanCallResult instanceof IacCanCallResult.Can) {
                aVar2.a(new OnRecallAvailableAction(((IacEvent.CanRecallInteractor.CheckCanRecall) canRecallInteractor).getCallInput(), (IacCanCallResult.Can) iacCanCallResult));
            } else if (iacCanCallResult instanceof IacCanCallResult.CanNot) {
                aVar2.a(new OnRecallUnavailableAction(((IacEvent.CanRecallInteractor.CheckCanRecall) canRecallInteractor).getCallInput(), new OnRecallUnavailableAction.a.C4904a(((IacCanCallResult.CanNot) iacCanCallResult).getReason())));
            }
        } else {
            aVar2.a(new OnRecallUnavailableAction(((IacEvent.CanRecallInteractor.CheckCanRecall) canRecallInteractor).getCallInput(), new OnRecallUnavailableAction.a.b(thB)));
        }
        return G0.f406611a;
    }
}
