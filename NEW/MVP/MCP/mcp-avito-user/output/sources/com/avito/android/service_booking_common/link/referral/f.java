package com.avito.android.service_booking_common.link.referral;

import Y61.k;
import android.os.Bundle;
import com.avito.android.account.E;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MainScreenLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.SimpleMessageResult;
import com.avito.android.screen_flow.link.ScreenFlowLink;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceBookingReferralRegisterLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/link/referral/f;", "Lev/a;", "Lcom/avito/android/service_booking_common/link/referral/ServiceBookingReferralRegisterLink;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends AbstractC40161a<ServiceBookingReferralRegisterLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f276665f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f276666g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a f276667h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.g f276668i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final E f276669j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f276670k = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public f(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k InterfaceC35745a5 interfaceC35745a5, @k a aVar2, @k a.g gVar, @k E e12) {
        this.f276665f = aVar;
        this.f276666g = interfaceC35745a5;
        this.f276667h = aVar2;
        this.f276668i = gVar;
        this.f276669j = e12;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ServiceBookingReferralRegisterLink serviceBookingReferralRegisterLink = (ServiceBookingReferralRegisterLink) deepLink;
        if (!this.f276669j.b()) {
            b.a.a(this.f276665f, new ScreenFlowLink(new MainScreenLink(null, null, false, 7, null), new AuthenticateLink(AuthSource.f92679N, false, (DeepLink) serviceBookingReferralRegisterLink, 2, (C42822w) null)), null, null, 6);
        } else {
            z<P2<SimpleMessageResult>> zVarA = this.f276667h.a(serviceBookingReferralRegisterLink.getRefKey());
            InterfaceC35745a5 interfaceC35745a5 = this.f276666g;
            this.f276670k.b(zVarA.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new d(this, serviceBookingReferralRegisterLink), new e(this, serviceBookingReferralRegisterLink), io.reactivex.rxjava3.internal.functions.a.f401993c));
        }
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f276670k.e();
    }
}
