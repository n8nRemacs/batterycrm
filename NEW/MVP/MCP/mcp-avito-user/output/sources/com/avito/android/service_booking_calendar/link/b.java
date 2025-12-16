package com.avito.android.service_booking_calendar.link;

import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_calendar.flexible.ServiceBookingFlexibleCalendarFragment;
import com.avito.android.service_booking_calendar.link.ServiceBookingCalendarMonthLink;
import com.avito.android.service_booking_calendar.r;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ServiceBookingCalendarMonthLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/link/b;", "Lev/a;", "Lcom/avito/android/service_booking_calendar/link/ServiceBookingCalendarMonthLink;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends AbstractC40161a<ServiceBookingCalendarMonthLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f276129f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final r f276130g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f276131h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25719a f276132i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f276133j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ServiceBookingCalendarMonthLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    @Inject
    public b(@k a.InterfaceC4053a interfaceC4053a, @k r rVar, @k a.b bVar, @k C25719a c25719a) {
        this.f276129f = interfaceC4053a;
        this.f276130g = rVar;
        this.f276131h = bVar;
        this.f276132i = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ServiceBookingCalendarMonthLink serviceBookingCalendarMonthLink = (ServiceBookingCalendarMonthLink) deepLink;
        this.f276132i.a(serviceBookingCalendarMonthLink, this, AuthSource.f92680O, new com.avito.android.service_booking_calendar.link.a(serviceBookingCalendarMonthLink, this));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f276133j.b(this.f276131h.Q().N(new a()).t0(new g() { // from class: com.avito.android.service_booking_calendar.link.b.b
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Serializable] */
            @Override // l41.g
            public final void accept(Object obj) {
                InterfaceC14249c.b aVar;
                Object serializableExtra;
                C47918a c47918a = (C47918a) obj;
                b bVar = b.this;
                if (c47918a.f437156b == -1) {
                    aVar = ServiceBookingCalendarMonthLink.c.b.f276126b;
                } else {
                    Intent intent = c47918a.f437157c;
                    if (intent != null) {
                        ServiceBookingFlexibleCalendarFragment.f275609x0.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializableExtra = intent.getSerializableExtra("result_key.settings_status", BookingSettingsStatus.class);
                        } else {
                            ?? serializableExtra2 = intent.getSerializableExtra("result_key.settings_status");
                            serializableExtra = serializableExtra2 instanceof BookingSettingsStatus ? serializableExtra2 : null;
                        }
                        bookingSettingsStatus = (BookingSettingsStatus) serializableExtra;
                    }
                    aVar = new ServiceBookingCalendarMonthLink.c.a(bookingSettingsStatus);
                }
                bVar.j(aVar);
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f276133j.e();
    }
}
