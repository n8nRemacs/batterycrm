package com.avito.android.service_booking_schedule_repetition_impl.link;

import android.os.Bundle;
import com.avito.android.service_booking_schedule_repetition_impl.ServiceBookingScheduleRepetitionSheet;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.domain.RepetitionSchedule;
import com.avito.android.service_booking_schedule_repetition_public.ServiceBookingScheduleRepetitionLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingScheduleRepetitionLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f277604l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingScheduleRepetitionLink f277605m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ServiceBookingScheduleRepetitionLink serviceBookingScheduleRepetitionLink) {
        super(0);
        this.f277604l = bVar;
        this.f277605m = serviceBookingScheduleRepetitionLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f277604l;
        ServiceBookingScheduleRepetitionSheet.a aVar = ServiceBookingScheduleRepetitionSheet.f277534o0;
        String str = bVar.f395444b;
        ServiceBookingScheduleRepetitionLink serviceBookingScheduleRepetitionLink = this.f277605m;
        RepetitionSchedule repetitionSchedule = new RepetitionSchedule(serviceBookingScheduleRepetitionLink.f277759b, serviceBookingScheduleRepetitionLink.f277760c, serviceBookingScheduleRepetitionLink.f277761d, serviceBookingScheduleRepetitionLink.f277762e, serviceBookingScheduleRepetitionLink.f277763f);
        aVar.getClass();
        ServiceBookingScheduleRepetitionSheet serviceBookingScheduleRepetitionSheet = new ServiceBookingScheduleRepetitionSheet();
        Bundle bundle = new Bundle();
        bundle.putString("arg.schedule_repetition.request_key", str);
        bundle.putParcelable("arg.schedule_repetition.schedule", repetitionSchedule);
        serviceBookingScheduleRepetitionSheet.setArguments(bundle);
        bVar.f277607g.w1(serviceBookingScheduleRepetitionSheet, bVar.f395444b);
        return G0.f406611a;
    }
}
