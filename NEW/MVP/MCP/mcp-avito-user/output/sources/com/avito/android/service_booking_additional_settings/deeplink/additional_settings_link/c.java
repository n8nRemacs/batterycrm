package com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link.ServiceBookingAdditionalSettingsLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ServiceBookingAdditionalSettingsLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/deeplink/additional_settings_link/c;", "Lev/a;", "Lcom/avito/android/service_booking_additional_settings/deeplink/additional_settings_link/ServiceBookingAdditionalSettingsLink;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends AbstractC40161a<ServiceBookingAdditionalSettingsLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f275128f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link.a f275129g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f275130h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25719a f275131i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f275132j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ServiceBookingAdditionalSettingsLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(c.this);
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            c.this.j(((C47918a) obj).f437156b == -1 ? ServiceBookingAdditionalSettingsLink.b.C8158b.f275126b : ServiceBookingAdditionalSettingsLink.b.a.f275125b);
        }
    }

    @Inject
    public c(@k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link.a aVar, @k a.b bVar, @k C25719a c25719a) {
        this.f275128f = interfaceC4053a;
        this.f275129g = aVar;
        this.f275130h = bVar;
        this.f275131i = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AuthSource authSource = AuthSource.f92673H;
        com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link.b bVar = new com.avito.android.service_booking_additional_settings.deeplink.additional_settings_link.b(this);
        this.f275131i.a((ServiceBookingAdditionalSettingsLink) deepLink, this, authSource, bVar);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f275132j.b(this.f275130h.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f275132j.e();
    }
}
