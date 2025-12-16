package com.avito.android.service_booking_details.domain;

import Y61.k;
import Y61.l;
import com.avito.android.A0;
import com.avito.android.B2;
import com.avito.android.service_booking.api.remote.model.details.ServiceBookingItemDetailsResult;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;
import rt0.InterfaceC47722d;

/* compiled from: ServiceBookingItemDetailsConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/domain/h;", "Lcom/avito/android/service_booking_details/domain/g;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC47722d f277344a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final B2 f277345b;

    @Inject
    public h(@k InterfaceC47722d interfaceC47722d, @k B2 b22) {
        this.f277344a = interfaceC47722d;
        this.f277345b = b22;
    }

    @Override // com.avito.android.service_booking_details.domain.g
    @l
    public final Bt0.c a(@k ServiceBookingItemDetailsResult serviceBookingItemDetailsResult) {
        ArrayList arrayListA = this.f277344a.a(serviceBookingItemDetailsResult.f());
        boolean hasCloseButton = serviceBookingItemDetailsResult.getHasCloseButton();
        String title = serviceBookingItemDetailsResult.getTitle();
        String prevActionButton = serviceBookingItemDetailsResult.getPrevActionButton();
        B2 b22 = this.f277345b;
        b22.getClass();
        n<Object>[] nVarArr = B2.f67184X;
        n<Object> nVar = nVarArr[7];
        A0.a aVar = b22.f67215i;
        List<ServiceBookingItemDetailsResult.ServiceBookingItemDetailsAction> listA = ((Boolean) aVar.a().invoke()).booleanValue() ? null : serviceBookingItemDetailsResult.a();
        n<Object> nVar2 = nVarArr[7];
        return new Bt0.c(hasCloseButton, title, prevActionButton, arrayListA, listA, ((Boolean) aVar.a().invoke()).booleanValue() ? serviceBookingItemDetailsResult.b() : null, serviceBookingItemDetailsResult.getDisclaimer(), null, false, 0);
    }
}
