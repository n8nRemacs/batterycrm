package com.avito.android.service_booking_common.link.referral;

import com.avito.android.service_booking_common.link.referral.ServiceBookingReferralRegisterLink;
import kotlin.Metadata;

/* compiled from: ServiceBookingReferralRegisterLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f276663b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingReferralRegisterLink f276664c;

    public e(f fVar, ServiceBookingReferralRegisterLink serviceBookingReferralRegisterLink) {
        this.f276663b = fVar;
        this.f276664c = serviceBookingReferralRegisterLink;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        f fVar = this.f276663b;
        fVar.f276668i.g(fVar.d(), false);
        fVar.i(ServiceBookingReferralRegisterLink.b.a.f276654b, fVar.f276665f, this.f276664c.getRedirect());
    }
}
