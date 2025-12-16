package com.avito.android.service_booking_calendar.flexible;

import Ju.InterfaceC14249c;
import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.service_booking.deeplinks.create_by_seller.ServiceBookingCreateBySellerLink;
import com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link.ServiceBookingAdditionalSettingsLink;
import com.avito.android.service_booking_additional_settings.deeplink.toggle_service_booking_link.ServiceBookingToggleLink;
import com.avito.android.service_booking_calendar.flexible.ServiceBookingFlexibleCalendarFragment;
import com.avito.android.service_booking_day_settings.ServiceBookingDayScheduleSettingsLink;
import com.avito.android.service_booking_schedule_repetition_public.ServiceBookingScheduleRepetitionLink;
import gt0.InterfaceC40733a;
import ht0.InterfaceC40984a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kv.C43501a;

/* compiled from: ServiceBookingFlexibleCalendarFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.ServiceBookingFlexibleCalendarFragment$observeDeeplinkResult$1", f = "ServiceBookingFlexibleCalendarFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class g extends SuspendLambda implements p<C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f275855q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l<d, G0> f275856r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(l<? super d, G0> lVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f275856r = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        g gVar = new g(this.f275856r, continuation);
        gVar.f275855q = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        return ((g) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = ((C43501a) this.f275855q).f413261b;
        boolean z12 = interfaceC14249c instanceof ServiceBookingScheduleRepetitionLink.b.C8246b;
        l<d, G0> lVar = this.f275856r;
        if (z12) {
            ServiceBookingFlexibleCalendarFragment.j jVar = (ServiceBookingFlexibleCalendarFragment.j) lVar;
            jVar.invoke(new InterfaceC40733a.e(((ServiceBookingScheduleRepetitionLink.b.C8246b) interfaceC14249c).f277767b));
            jVar.invoke(new InterfaceC40984a.d(true));
            jVar.invoke(InterfaceC40984a.c.f397444a);
        } else if (interfaceC14249c instanceof ServiceBookingToggleLink.b.C8159b) {
            ServiceBookingFlexibleCalendarFragment.j jVar2 = (ServiceBookingFlexibleCalendarFragment.j) lVar;
            jVar2.invoke(new InterfaceC40984a.d(true));
            jVar2.invoke(InterfaceC40984a.c.f397444a);
        } else if (interfaceC14249c instanceof ServiceBookingDayScheduleSettingsLink.b.C8222b) {
            ServiceBookingFlexibleCalendarFragment.j jVar3 = (ServiceBookingFlexibleCalendarFragment.j) lVar;
            jVar3.invoke(new InterfaceC40984a.d(true));
            jVar3.invoke(InterfaceC40984a.c.f397444a);
        } else {
            if (interfaceC14249c instanceof ServiceBookingCreateBySellerLink.b.c ? true : L.f(interfaceC14249c, ServiceBookingCreateBySellerLink.b.C8139b.f274211b) ? true : L.f(interfaceC14249c, ServiceBookingAdditionalSettingsLink.b.C8158b.f275126b)) {
                ((ServiceBookingFlexibleCalendarFragment.j) lVar).invoke(new InterfaceC40984a.d(true));
            } else if (interfaceC14249c instanceof ServiceBookingDayScheduleSettingsLink.b.a) {
                ((ServiceBookingFlexibleCalendarFragment.j) lVar).invoke(new InterfaceC40984a.b(((ServiceBookingDayScheduleSettingsLink.b.a) interfaceC14249c).f276689b));
            } else if (interfaceC14249c instanceof ServiceBookingScheduleRepetitionLink.b.a) {
                ((ServiceBookingFlexibleCalendarFragment.j) lVar).invoke(new InterfaceC40984a.b(((ServiceBookingScheduleRepetitionLink.b.a) interfaceC14249c).f277766b));
            }
        }
        return G0.f406611a;
    }
}
