package com.avito.android.service_booking.mvi.navigation.mvi;

import Fs0.b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceBookingNavigationBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/mvi/navigation/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "LFs0/b;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.arch.mvi.b<Fs0.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f274412a;

    @Inject
    public d(@com.avito.android.service_booking.mvi.di.f @Y61.k String str) {
        this.f274412a = str;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<Fs0.b> a() {
        return new C43210w(new b.a(this.f274412a));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
