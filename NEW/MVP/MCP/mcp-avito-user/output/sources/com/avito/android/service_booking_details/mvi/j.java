package com.avito.android.service_booking_details.mvi;

import com.avito.android.service_booking_details.mvi.entity.ServiceBookingItemDetailsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceBookingItemDetailsBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_details/mvi/j;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/service_booking_details/mvi/entity/ServiceBookingItemDetailsInternalAction;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements com.avito.android.arch.mvi.b<ServiceBookingItemDetailsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_details.domain.a f277437a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f277438b;

    @Inject
    public j(@Y61.k com.avito.android.service_booking_details.domain.a aVar, @com.avito.android.service_booking_details.di.a @Y61.k String str) {
        this.f277437a = aVar;
        this.f277438b = str;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ServiceBookingItemDetailsInternalAction> a() {
        return this.f277437a.a(this.f277438b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
