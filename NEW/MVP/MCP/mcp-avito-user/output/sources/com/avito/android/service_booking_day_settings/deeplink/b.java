package com.avito.android.service_booking_day_settings.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_calendar.r;
import com.avito.android.service_booking_day_settings.DaySettingsActivity;
import com.avito.android.service_booking_day_settings.ServiceBookingDayScheduleSettingsLink;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import rv.C47918a;
import sv.C48421d;
import tt0.InterfaceC48717c;

/* compiled from: ServiceBookingDayScheduleSettingsLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_day_settings/deeplink/b;", "Lev/a;", "Lcom/avito/android/service_booking_day_settings/ServiceBookingDayScheduleSettingsLink;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends AbstractC40161a<ServiceBookingDayScheduleSettingsLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f277090f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.b f277091g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC48717c f277092h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final r f277093i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C25719a f277094j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f277095k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ServiceBookingDayScheduleSettingsLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    /* compiled from: ServiceBookingDayScheduleSettingsLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service_booking_day_settings.deeplink.b$b, reason: collision with other inner class name */
    public static final class C8226b<T> implements g {
        public C8226b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Serializable] */
        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c.b aVar;
            Object serializableExtra;
            C47918a c47918a = (C47918a) obj;
            b bVar = b.this;
            if (c47918a.f437156b == -1) {
                aVar = ServiceBookingDayScheduleSettingsLink.b.C8222b.f276690b;
            } else {
                Intent intent = c47918a.f437157c;
                if (intent != null) {
                    DaySettingsActivity.f276682n.getClass();
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializableExtra = intent.getSerializableExtra("result_key.settings_status", BookingSettingsStatus.class);
                    } else {
                        ?? serializableExtra2 = intent.getSerializableExtra("result_key.settings_status");
                        serializableExtra = serializableExtra2 instanceof BookingSettingsStatus ? serializableExtra2 : null;
                    }
                    bookingSettingsStatus = (BookingSettingsStatus) serializableExtra;
                }
                aVar = new ServiceBookingDayScheduleSettingsLink.b.a(bookingSettingsStatus);
            }
            bVar.j(aVar);
        }
    }

    @Inject
    public b(@k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k InterfaceC48717c interfaceC48717c, @k r rVar, @k C25719a c25719a) {
        this.f277090f = interfaceC4053a;
        this.f277091g = bVar;
        this.f277092h = interfaceC48717c;
        this.f277093i = rVar;
        this.f277094j = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ServiceBookingDayScheduleSettingsLink serviceBookingDayScheduleSettingsLink = (ServiceBookingDayScheduleSettingsLink) deepLink;
        this.f277094j.a(serviceBookingDayScheduleSettingsLink, this, AuthSource.f92672G, new com.avito.android.service_booking_day_settings.deeplink.a(serviceBookingDayScheduleSettingsLink, this));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f277095k.b(this.f277091g.Q().N(new a()).t0(new C8226b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f277095k.e();
    }
}
