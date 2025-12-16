package com.avito.android.service_booking_common.link.referral;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_common.link.referral.ServiceBookingReferralRegisterLink;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: ServiceBookingReferralRegisterLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SimpleMessageResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f276661b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingReferralRegisterLink f276662c;

    public d(f fVar, ServiceBookingReferralRegisterLink serviceBookingReferralRegisterLink) {
        this.f276661b = fVar;
        this.f276662c = serviceBookingReferralRegisterLink;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean z12 = ((P2) obj) instanceof P2.c;
        f fVar = this.f276661b;
        a.g gVar = fVar.f276668i;
        if (z12) {
            gVar.g(fVar.d(), true);
            return;
        }
        gVar.g(fVar.d(), false);
        fVar.i(ServiceBookingReferralRegisterLink.b.a.f276654b, fVar.f276665f, this.f276662c.getRedirect());
    }
}
