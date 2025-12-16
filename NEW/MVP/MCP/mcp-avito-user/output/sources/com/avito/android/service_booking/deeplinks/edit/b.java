package com.avito.android.service_booking.deeplinks.edit;

import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory;
import com.avito.android.service_booking.deeplinks.edit.ServiceBookingEditLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ServiceBookingEditLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/edit/b;", "Lev/a;", "Lcom/avito/android/service_booking/deeplinks/edit/ServiceBookingEditLink;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends AbstractC40161a<ServiceBookingEditLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f274245f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f274246g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f274247h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ServiceBookingFlowIntentFactory f274248i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.i f274249j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final C25719a f274250k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f274251l = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ServiceBookingEditLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    /* compiled from: ServiceBookingEditLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service_booking.deeplinks.edit.b$b, reason: collision with other inner class name */
    public static final class C8144b<T> implements g {
        public C8144b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ServiceBookingFlowIntentFactory.Result resultA;
            b bVar = b.this;
            Intent intent = ((C47918a) obj).f437157c;
            if (intent != null) {
                ServiceBookingFlowIntentFactory.f274177a.getClass();
                resultA = ServiceBookingFlowIntentFactory.a.a(intent);
            } else {
                resultA = null;
            }
            if (resultA instanceof ServiceBookingFlowIntentFactory.Result.Redirect) {
                bVar.i(ServiceBookingEditLink.b.c.f274242b, bVar.f274247h, ((ServiceBookingFlowIntentFactory.Result.Redirect) resultA).f274181b);
            } else {
                if (resultA instanceof ServiceBookingFlowIntentFactory.Result.Cancel) {
                    bVar.j(ServiceBookingEditLink.b.a.f274240b);
                    return;
                }
                if (!(resultA instanceof ServiceBookingFlowIntentFactory.Result.Error)) {
                    bVar.j(ServiceBookingEditLink.b.C8143b.f274241b);
                    return;
                }
                PrintableText printableTextF = com.avito.android.printable_text.b.f(((ServiceBookingFlowIntentFactory.Result.Error) resultA).f274180b);
                f.c.f125255c.getClass();
                a.i.C4057a.d(bVar.f274249j, printableTextF, null, null, f.c.a.b(), 0, null, null, null, 2030);
            }
        }
    }

    @Inject
    public b(@k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k ServiceBookingFlowIntentFactory serviceBookingFlowIntentFactory, @k a.i iVar, @k C25719a c25719a) {
        this.f274245f = bVar;
        this.f274246g = interfaceC4053a;
        this.f274247h = aVar;
        this.f274248i = serviceBookingFlowIntentFactory;
        this.f274249j = iVar;
        this.f274250k = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ServiceBookingEditLink serviceBookingEditLink = (ServiceBookingEditLink) deepLink;
        this.f274250k.a(serviceBookingEditLink, this, AuthSource.f92669D, new com.avito.android.service_booking.deeplinks.edit.a(this, serviceBookingEditLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f274251l.b(this.f274245f.Q().N(new a()).t0(new C8144b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f274251l.e();
    }
}
