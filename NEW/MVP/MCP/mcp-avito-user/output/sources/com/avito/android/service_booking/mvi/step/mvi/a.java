package com.avito.android.service_booking.mvi.step.mvi;

import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceBookingMviStepActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking.mvi.step.mvi.ServiceBookingMviStepActor$process$1", f = "ServiceBookingMviStepActor.kt", i = {}, l = {67, 69, 71}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ServiceBookingMviStepInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f274654q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f274655r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f274656s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingMviStepState f274657t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, ServiceBookingMviStepState serviceBookingMviStepState, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f274656s = gVar;
        this.f274657t = serviceBookingMviStepState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f274656s, this.f274657t, continuation);
        aVar.f274655r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ServiceBookingMviStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f274654q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            kotlin.C42729a0.b(r10)
            goto L77
        L1e:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f274655r
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            com.avito.android.service_booking.mvi.step.mvi.g r1 = r9.f274656s
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Set<java.lang.Object>>> r5 = r1.f274751b
            java.lang.String r1 = r1.f274752c
            java.lang.String r5 = com.avito.android.service_booking.mvi.domain.d.b(r1, r5)
            r6 = 0
            com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState r7 = r9.f274657t
            if (r5 == 0) goto L4e
            com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState$ServiceBookingContent r8 = r7.f274716e
            if (r8 == 0) goto L3b
            java.lang.String r8 = r8.f274724f
            goto L3c
        L3b:
            r8 = r6
        L3c:
            if (r8 != 0) goto L4e
            com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction$Finish r1 = new com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction$Finish
            com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory$Result$Close r2 = com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory.Result.Close.f274179b
            r1.<init>(r2)
            r9.f274654q = r4
            java.lang.Object r10 = r10.emit(r1, r9)
            if (r10 != r0) goto L77
            return r0
        L4e:
            if (r5 == 0) goto L67
            com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState$ServiceBookingContent r4 = r7.f274716e
            if (r4 == 0) goto L56
            java.lang.String r6 = r4.f274724f
        L56:
            if (r6 != 0) goto L59
            goto L67
        L59:
            com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction$OpenPreviousStep r3 = new com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction$OpenPreviousStep
            r3.<init>(r1)
            r9.f274654q = r2
            java.lang.Object r10 = r10.emit(r3, r9)
            if (r10 != r0) goto L77
            return r0
        L67:
            com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction$Finish r1 = new com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction$Finish
            com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory$Result$Cancel r2 = com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory.Result.Cancel.f274178b
            r1.<init>(r2)
            r9.f274654q = r3
            java.lang.Object r10 = r10.emit(r1, r9)
            if (r10 != r0) goto L77
            return r0
        L77:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_booking.mvi.step.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
