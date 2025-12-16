package com.avito.android.service_booking.mvi.navigation.mvi;

import Fs0.InterfaceC13831a;
import Fs0.b;
import Y41.p;
import com.avito.android.service_booking.remote.result.ServiceBookingError;
import com.avito.android.service_booking.remote.result.ServiceBookingResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ServiceBookingNavigationActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LFs0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking.mvi.navigation.mvi.ServiceBookingNavigationActor$process$1", f = "ServiceBookingNavigationActor.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF, 33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super Fs0.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f274407q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f274408r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Fs0.d f274409s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13831a f274410t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Fs0.d dVar, InterfaceC13831a interfaceC13831a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f274409s = dVar;
        this.f274410t = interfaceC13831a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f274409s, this.f274410t, continuation);
        aVar.f274408r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Fs0.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f274407q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f274408r;
            Fs0.d dVar = this.f274409s;
            ServiceBookingError serviceBookingError = dVar.f6008b;
            boolean z12 = serviceBookingError instanceof ServiceBookingResult.WrongSlotError;
            InterfaceC13831a interfaceC13831a = this.f274410t;
            if (z12) {
                String strC = ((ServiceBookingResult.WrongSlotError) serviceBookingError).getMoveToStepId();
                if (strC != null) {
                    b.C0306b c0306b = new b.C0306b(strC, ((InterfaceC13831a.b) interfaceC13831a).f5997b);
                    this.f274407q = 1;
                    if (interfaceC43172j.emit(c0306b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                InterfaceC13831a.b bVar = (InterfaceC13831a.b) interfaceC13831a;
                String strB = com.avito.android.service_booking.mvi.domain.d.b(bVar.f5996a, dVar.f6007a);
                if (strB != null) {
                    b.C0306b c0306b2 = new b.C0306b(strB, bVar.f5997b);
                    this.f274407q = 2;
                    if (interfaceC43172j.emit(c0306b2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
