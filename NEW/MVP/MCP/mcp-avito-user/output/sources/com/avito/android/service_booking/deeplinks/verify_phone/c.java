package com.avito.android.service_booking.deeplinks.verify_phone;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ServiceBookingVerifyPhoneLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/verify_phone/c;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/service_booking/deeplinks/verify_phone/ServiceBookingVerifyPhoneLink;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends com.avito.android.deeplink_handler.handler.base.coroutines.a<ServiceBookingVerifyPhoneLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C25719a f274267g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking.interactors.a f274268h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.g f274269i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f274270j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final a.i f274271k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final InterfaceC28373a f274272l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final InterfaceC35741a1 f274273m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final R0 f274274n;

    @Inject
    public c(@k C25719a c25719a, @k com.avito.android.service_booking.interactors.a aVar, @k a.g gVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k a.i iVar, @k InterfaceC28373a interfaceC28373a, @k InterfaceC35741a1 interfaceC35741a1, @k R0 r02) {
        super(r02);
        this.f274267g = c25719a;
        this.f274268h = aVar;
        this.f274269i = gVar;
        this.f274270j = aVar2;
        this.f274271k = iVar;
        this.f274272l = interfaceC28373a;
        this.f274273m = interfaceC35741a1;
        this.f274274n = r02;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        ServiceBookingVerifyPhoneLink serviceBookingVerifyPhoneLink = (ServiceBookingVerifyPhoneLink) deepLink;
        this.f274267g.a(serviceBookingVerifyPhoneLink, this, AuthSource.f92677L, new a(this, serviceBookingVerifyPhoneLink));
        return G0.f406611a;
    }
}
