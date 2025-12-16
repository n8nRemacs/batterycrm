package com.avito.android.str_calendar.seller.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.short_term_rent.StrBookingIntentFactory;
import com.avito.android.str_calendar.deeplink.StrSellerCalendarLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.o;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: StrSellerCalendarLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/deeplink/a;", "Lev/a;", "Lcom/avito/android/str_calendar/deeplink/StrSellerCalendarLink;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC40161a<StrSellerCalendarLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f287830f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final StrBookingIntentFactory f287831g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f287832h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f287833i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: StrSellerCalendarLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.str_calendar.seller.deeplink.a$a, reason: collision with other inner class name */
    public static final class C8645a<T> implements r {
        public C8645a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: StrSellerCalendarLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "LJu/c$b;", "apply", "(Lrv/a;)LJu/c$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f287835b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((C47918a) obj).f437156b == -1 ? StrSellerCalendarLink.b.C8587b.f286657b : StrSellerCalendarLink.b.a.f286656b;
        }
    }

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k StrBookingIntentFactory strBookingIntentFactory) {
        this.f287830f = bVar;
        this.f287831g = strBookingIntentFactory;
        this.f287832h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        StrSellerCalendarLink strSellerCalendarLink = (StrSellerCalendarLink) deepLink;
        this.f287832h.J(this.f287831g.e(strSellerCalendarLink.f286653b, strSellerCalendarLink.f286654c, strSellerCalendarLink.f286655d), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f287833i.b(this.f287830f.Q().N(new C8645a()).d0(b.f287835b).t0(new g() { // from class: com.avito.android.str_calendar.seller.deeplink.a.c
            @Override // l41.g
            public final void accept(Object obj) {
                a.this.j((InterfaceC14249c.b) obj);
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f287833i.e();
    }
}
