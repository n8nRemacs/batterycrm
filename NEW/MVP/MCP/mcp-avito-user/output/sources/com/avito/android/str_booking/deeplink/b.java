package com.avito.android.str_booking.deeplink;

import Y61.k;
import android.app.Application;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.str_core.OpenBuyerOrderBookingDeepLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: OpenBuyerOrderBookingLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/deeplink/b;", "Lev/a;", "Lcom/avito/android/str_core/OpenBuyerOrderBookingDeepLink;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends AbstractC40161a<OpenBuyerOrderBookingDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Application f285388f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f285389g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f285390h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.b f285391i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f285392j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: OpenBuyerOrderBookingLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    /* compiled from: OpenBuyerOrderBookingLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.str_booking.deeplink.b$b, reason: collision with other inner class name */
    public static final class C8539b<T> implements g {
        public C8539b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.this.j(OpenBuyerOrderBookingDeepLink.c.f288527b);
        }
    }

    @Inject
    public b(@k Application application, @k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a, @k a.b bVar) {
        this.f285388f = application;
        this.f285389g = interfaceC4053a;
        this.f285390h = c25719a;
        this.f285391i = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        OpenBuyerOrderBookingDeepLink openBuyerOrderBookingDeepLink = (OpenBuyerOrderBookingDeepLink) deepLink;
        this.f285390h.b(openBuyerOrderBookingDeepLink, this, null, new com.avito.android.str_booking.deeplink.a(this, openBuyerOrderBookingDeepLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f285392j.b(this.f285391i.Q().N(new a()).t0(new C8539b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f285392j.e();
    }
}
