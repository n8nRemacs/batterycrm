package com.avito.android.service_booking.deeplinks.verify_phone;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;

/* compiled from: ServiceBookingVerifyPhoneLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f274262l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingVerifyPhoneLink f274263m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ServiceBookingVerifyPhoneLink serviceBookingVerifyPhoneLink) {
        super(0);
        this.f274262l = cVar;
        this.f274263m = serviceBookingVerifyPhoneLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        c cVar = this.f274262l;
        cVar.getClass();
        ServiceBookingVerifyPhoneLink serviceBookingVerifyPhoneLink = this.f274263m;
        C43175k.K(new C43197r1(new b(cVar, serviceBookingVerifyPhoneLink, null), C43175k.I(cVar.f274274n.a(), cVar.f274268h.a(serviceBookingVerifyPhoneLink.getAdvertId()))), cVar.f134492f);
        return G0.f406611a;
    }
}
