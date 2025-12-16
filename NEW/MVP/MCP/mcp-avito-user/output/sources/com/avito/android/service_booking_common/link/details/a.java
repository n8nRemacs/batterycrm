package com.avito.android.service_booking_common.link.details;

import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_common.link.details.ServiceBookingItemDetailsLink;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.disposables.c;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ServiceBookingItemDetailsLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/link/details/a;", "Lev/a;", "Lcom/avito/android/service_booking_common/link/details/ServiceBookingItemDetailsLink;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends AbstractC40161a<ServiceBookingItemDetailsLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_details.b f276631f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.b f276632g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f276633h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final c f276634i = new c();

    /* compiled from: ServiceBookingItemDetailsLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service_booking_common.link.details.a$a, reason: collision with other inner class name */
    public static final class C8219a<T> implements r {
        public C8219a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: ServiceBookingItemDetailsLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a.this.j(((C47918a) obj).f437156b == -1 ? ServiceBookingItemDetailsLink.c.b.f276630b : ServiceBookingItemDetailsLink.c.a.f276629b);
        }
    }

    @Inject
    public a(@k com.avito.android.service_booking_details.b bVar, @k a.b bVar2, @k a.InterfaceC4053a interfaceC4053a) {
        this.f276631f = bVar;
        this.f276632g = bVar2;
        this.f276633h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f276633h.J(this.f276631f.a(((ServiceBookingItemDetailsLink) deepLink).getBookingId()), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f276634i.b(this.f276632g.Q().N(new C8219a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f276634i.e();
    }
}
