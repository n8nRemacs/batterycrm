package com.avito.android.service_booking_additional_settings.deeplink.toggle_link;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_additional_settings.deeplink.toggle_service_booking_link.ServiceBookingToggleLink;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: ServiceBookingToggleLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/deeplink/toggle_link/d;", "Lev/a;", "Lcom/avito/android/service_booking_additional_settings/deeplink/toggle_service_booking_link/ServiceBookingToggleLink;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends AbstractC40161a<ServiceBookingToggleLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C25719a f275146f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.f f275147g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.g f275148h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.i f275149i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a f275150j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final C43238h f275151k;

    /* compiled from: CoroutineExceptionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractCoroutineContextElement implements N {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f275152b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(N.b bVar, d dVar) {
            super(bVar);
            this.f275152b = dVar;
        }

        @Override // kotlinx.coroutines.N
        public final void handleException(@k CoroutineContext coroutineContext, @k Throwable th2) {
            V2.f318762a.b("ServiceBookingToggleLinkHandler got " + th2, null);
            this.f275152b.j(ServiceBookingToggleLink.b.a.f275159b);
        }
    }

    @Inject
    public d(@k C25719a c25719a, @k com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case.f fVar, @k a.g gVar, @k a.i iVar, @k R0 r02) {
        this.f275146f = c25719a;
        this.f275147g = fVar;
        this.f275148h = gVar;
        this.f275149i = iVar;
        a aVar = new a(N.f410714t2, this);
        this.f275150j = aVar;
        this.f275151k = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()).plus(aVar));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ServiceBookingToggleLink serviceBookingToggleLink = (ServiceBookingToggleLink) deepLink;
        this.f275146f.a(serviceBookingToggleLink, this, AuthSource.f92678M, new com.avito.android.service_booking_additional_settings.deeplink.toggle_link.a(this, serviceBookingToggleLink));
    }
}
