package com.avito.android.service_booking_settings;

import android.content.Intent;
import com.avito.android.service_booking_settings.ServiceBookingSettingsActivity;
import com.avito.android.service_booking_settings_public.ServiceBookingWorkHoursLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sv.C48421d;

/* compiled from: ServiceBookingWorkHoursLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f277769l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingWorkHoursLink f277770m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ServiceBookingWorkHoursLink serviceBookingWorkHoursLink) {
        super(0);
        this.f277769l = cVar;
        this.f277770m = serviceBookingWorkHoursLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ServiceBookingSettingsActivity.a aVar = ServiceBookingSettingsActivity.f277768m;
        c cVar = this.f277769l;
        ServiceBookingWorkHoursLink serviceBookingWorkHoursLink = this.f277770m;
        boolean isScheduleRequired = serviceBookingWorkHoursLink.getIsScheduleRequired();
        String flow = serviceBookingWorkHoursLink.getFlow();
        aVar.getClass();
        Intent intent = new Intent(cVar.f277772g, (Class<?>) ServiceBookingSettingsActivity.class);
        intent.putExtra("from_extra", flow);
        intent.putExtra("is_schedule_required", isScheduleRequired);
        cVar.f277771f.J(intent, C48421d.a(cVar), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}
