package com.avito.android.service_booking_settings;

import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_settings_public.ServiceBookingWorkHoursLink;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ServiceBookingWorkHoursLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_settings/c;", "Lev/a;", "Lcom/avito/android/service_booking_settings_public/ServiceBookingWorkHoursLink;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends AbstractC40161a<ServiceBookingWorkHoursLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f277771f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Context f277772g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f277773h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25719a f277774i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f277775j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ServiceBookingWorkHoursLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(c.this);
        }
    }

    @Inject
    public c(@k Context context, @k C25719a c25719a, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar) {
        this.f277771f = interfaceC4053a;
        this.f277772g = context;
        this.f277773h = bVar;
        this.f277774i = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ServiceBookingWorkHoursLink serviceBookingWorkHoursLink = (ServiceBookingWorkHoursLink) deepLink;
        this.f277774i.a(serviceBookingWorkHoursLink, this, AuthSource.f92671F, new com.avito.android.service_booking_settings.b(this, serviceBookingWorkHoursLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f277775j.b(this.f277773h.Q().N(new a()).t0(new g() { // from class: com.avito.android.service_booking_settings.c.b
            @Override // l41.g
            public final void accept(Object obj) {
                InterfaceC14249c.b aVar;
                Object serializableExtra;
                C47918a c47918a = (C47918a) obj;
                c cVar = c.this;
                int i12 = c47918a.f437156b;
                BookingSettingsStatus bookingSettingsStatus = null;
                String stringExtra = null;
                Intent intent = c47918a.f437157c;
                if (i12 == -1) {
                    if (intent != null) {
                        ServiceBookingSettingsActivity.f277768m.getClass();
                        stringExtra = intent.getStringExtra("result_key.message");
                    }
                    aVar = new ServiceBookingWorkHoursLink.c.b(stringExtra);
                } else {
                    if (intent != null) {
                        ServiceBookingSettingsActivity.f277768m.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializableExtra = intent.getSerializableExtra("result_key.settings_status", BookingSettingsStatus.class);
                        } else {
                            Object serializableExtra2 = intent.getSerializableExtra("result_key.settings_status");
                            serializableExtra = (BookingSettingsStatus) (serializableExtra2 instanceof BookingSettingsStatus ? serializableExtra2 : null);
                        }
                        bookingSettingsStatus = (BookingSettingsStatus) serializableExtra;
                    }
                    aVar = new ServiceBookingWorkHoursLink.c.a(bookingSettingsStatus);
                }
                cVar.j(aVar);
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f277775j.e();
    }
}
