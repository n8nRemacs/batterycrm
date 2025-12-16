package com.avito.android.service_booking.deeplinks.edit;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sv.C48421d;

/* compiled from: ServiceBookingEditLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f274243l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingEditLink f274244m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ServiceBookingEditLink serviceBookingEditLink) {
        super(0);
        this.f274243l = bVar;
        this.f274244m = serviceBookingEditLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f274243l;
        ServiceBookingEditLink serviceBookingEditLink = this.f274244m;
        bVar.f274246g.J(bVar.f274248i.c(serviceBookingEditLink.getAdvertId(), serviceBookingEditLink.getStepId(), serviceBookingEditLink.getBookingId(), serviceBookingEditLink.getMicroCategoryId(), serviceBookingEditLink.getSource()), C48421d.a(bVar), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}
