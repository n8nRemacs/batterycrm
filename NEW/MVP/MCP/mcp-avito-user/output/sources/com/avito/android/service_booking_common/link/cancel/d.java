package com.avito.android.service_booking_common.link.cancel;

import Y61.k;
import android.content.Context;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.service_booking_common.link.cancel.ServiceBookingCancelLink;
import com.avito.android.service_booking_common.link.confirm.ServiceBookingOrderActionInteractor;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingCancelLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/link/cancel/d;", "Lev/a;", "Lcom/avito/android/service_booking_common/link/cancel/ServiceBookingCancelLink;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends AbstractC40161a<ServiceBookingCancelLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C25719a f276576f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f276577g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.g f276578h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f276579i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.i f276580j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final ServiceBookingOrderActionInteractor f276581k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final InterfaceC35741a1 f276582l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Context f276583m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f276584n = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public d(@k C25719a c25719a, @k InterfaceC35745a5 interfaceC35745a5, @k a.g gVar, @k com.avito.android.remote.error.f fVar, @k a.i iVar, @k ServiceBookingOrderActionInteractor serviceBookingOrderActionInteractor, @k InterfaceC35741a1 interfaceC35741a1, @k Context context) {
        this.f276576f = c25719a;
        this.f276577g = interfaceC35745a5;
        this.f276578h = gVar;
        this.f276579i = fVar;
        this.f276580j = iVar;
        this.f276581k = serviceBookingOrderActionInteractor;
        this.f276582l = interfaceC35741a1;
        this.f276583m = context;
    }

    public static final void k(d dVar, ApiError apiError) {
        dVar.f276578h.g(dVar.d(), false);
        PrintableText printableTextA = InterfaceC35741a1.a.a(dVar.f276582l, new ApiException(apiError, null, 2, null), null, null, 6);
        a.i.C4057a.d(dVar.f276580j, printableTextA, null, null, new f.c(apiError), 0, null, null, null, 2030);
        dVar.j(new ServiceBookingCancelLink.b.a(printableTextA.k0(dVar.f276583m)));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ServiceBookingCancelLink serviceBookingCancelLink = (ServiceBookingCancelLink) deepLink;
        this.f276576f.a(serviceBookingCancelLink, this, AuthSource.f92676K, new a(this, serviceBookingCancelLink));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f276584n.e();
    }
}
