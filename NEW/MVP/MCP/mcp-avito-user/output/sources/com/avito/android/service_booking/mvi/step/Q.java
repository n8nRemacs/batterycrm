package com.avito.android.service_booking.mvi.step;

import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState;
import kotlin.AbstractC40048c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ServiceBookingMviStepViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepState;", "mviStep", "LeT/c;", "bdui", "LHs0/b;", "<anonymous>", "(Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepState;LeT/c;)LHs0/b;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking.mvi.step.ServiceBookingMviStepViewModel$state$2$1", f = "ServiceBookingMviStepViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class Q extends SuspendLambda implements Y41.q<ServiceBookingMviStepState, AbstractC40048c, Continuation<? super Hs0.b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ ServiceBookingMviStepState f274479q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ AbstractC40048c f274480r;

    public Q() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(ServiceBookingMviStepState serviceBookingMviStepState, AbstractC40048c abstractC40048c, Continuation<? super Hs0.b> continuation) {
        Q q12 = new Q(3, continuation);
        q12.f274479q = serviceBookingMviStepState;
        q12.f274480r = abstractC40048c;
        return q12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new Hs0.b(this.f274479q, this.f274480r);
    }
}
