package com.avito.android.service_booking_additional_settings.deeplink.toggle_link;

import com.avito.android.service_booking_additional_settings.deeplink.toggle_service_booking_link.ServiceBookingToggleLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* compiled from: ServiceBookingToggleLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f275139l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingToggleLink f275140m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, ServiceBookingToggleLink serviceBookingToggleLink) {
        super(0);
        this.f275139l = dVar;
        this.f275140m = serviceBookingToggleLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f275139l;
        C43259k.d(dVar.f275151k, dVar.f275150j, null, new b(dVar, this.f275140m, null), 2);
        return G0.f406611a;
    }
}
