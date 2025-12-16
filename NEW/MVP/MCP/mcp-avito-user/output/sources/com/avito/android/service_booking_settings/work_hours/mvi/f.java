package com.avito.android.service_booking_settings.work_hours.mvi;

import com.avito.android.service_booking_settings.work_hours.ServiceBookingWorkHoursArgument;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.ServiceBookingWorkHoursInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceBookingWorkHoursBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements com.avito.android.arch.mvi.b<ServiceBookingWorkHoursInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_settings.domain.a f278110a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ServiceBookingWorkHoursArgument f278111b;

    @Inject
    public f(@Y61.k com.avito.android.service_booking_settings.domain.a aVar, @Y61.k ServiceBookingWorkHoursArgument serviceBookingWorkHoursArgument) {
        this.f278110a = aVar;
        this.f278111b = serviceBookingWorkHoursArgument;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ServiceBookingWorkHoursInternalAction> a() {
        return this.f278110a.a(this.f278111b.f277895c);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
