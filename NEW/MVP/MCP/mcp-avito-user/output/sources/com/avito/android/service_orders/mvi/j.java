package com.avito.android.service_orders.mvi;

import Ju.InterfaceC14249c;
import Mu0.InterfaceC14531a;
import com.avito.android.service_booking.deeplinks.edit.ServiceBookingEditLink;
import com.avito.android.service_booking_calendar.link.ServiceBookingCalendarMonthLink;
import com.avito.android.service_booking_common.link.cancel.ServiceBookingCancelLink;
import com.avito.android.service_booking_common.link.confirm.ServiceBookingConfirmLink;
import com.avito.android.service_booking_common.link.details.ServiceBookingItemDetailsLink;
import com.avito.android.service_booking_settings_public.ServiceBookingWorkHoursLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_orders.mvi.ServiceOrdersListActor$deeplinkHandlerFlow$$inlined$flatMapLatest$1", f = "ServiceOrdersListActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class j extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC14531a>, C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f279604q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f279605r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f279606s;

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super InterfaceC14531a> interfaceC43172j, C43501a c43501a, Continuation<? super G0> continuation) {
        j jVar = new j(3, continuation);
        jVar.f279605r = interfaceC43172j;
        jVar.f279606s = c43501a;
        return jVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f279604q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f279605r;
            InterfaceC14249c interfaceC14249c = ((C43501a) this.f279606s).f413261b;
            InterfaceC43160i interfaceC43160iG = interfaceC14249c instanceof ServiceBookingConfirmLink.b.C8218b ? C43175k.G(new k(interfaceC14249c, null)) : interfaceC14249c instanceof ServiceBookingCancelLink.b.C8217b ? C43175k.G(new l(interfaceC14249c, null)) : interfaceC14249c instanceof ServiceBookingEditLink.b.c ? C43175k.G(new m(2, null)) : interfaceC14249c instanceof ServiceBookingItemDetailsLink.c.b ? C43175k.G(new n(2, null)) : interfaceC14249c instanceof ServiceBookingCalendarMonthLink.c.b ? C43175k.G(new o(2, null)) : interfaceC14249c instanceof ServiceBookingWorkHoursLink.c.b ? C43175k.G(new p(interfaceC14249c, null)) : interfaceC14249c instanceof ServiceBookingCalendarMonthLink.c.a ? C43175k.G(new q(interfaceC14249c, null)) : interfaceC14249c instanceof ServiceBookingWorkHoursLink.c.a ? C43175k.G(new r(interfaceC14249c, null)) : C43175k.w();
            this.f279604q = 1;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
