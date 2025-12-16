package com.avito.android.service_booking.mvi.domain.interactors;

import Y61.k;
import Y61.l;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qt0.C47440d;

/* compiled from: ServiceBookingCoroutinesInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/domain/interactors/a;", "", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: ServiceBookingCoroutinesInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.service_booking.mvi.domain.interactors.a$a, reason: collision with other inner class name */
    public static final class C8148a {
    }

    @k
    InterfaceC43160i a(@l String str, @k C47440d.a aVar, @k Map map);

    @k
    InterfaceC43160i<ServiceBookingMviStepInternalAction> b(@l String str, @k String str2, @l String str3, boolean z12);
}
