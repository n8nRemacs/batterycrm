package iu0;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking_utils.events.HelpLinkClickedEvent;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingHelpLinkAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liu0/c;", "Liu0/b;", "_avito_service-booking-utils_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements InterfaceC42113b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f405353a;

    @Inject
    public c(@k InterfaceC28373a interfaceC28373a) {
        this.f405353a = interfaceC28373a;
    }

    @Override // iu0.InterfaceC42113b
    public final void a(@k HelpLinkClickedEvent.FromPage fromPage) {
        this.f405353a.c(new HelpLinkClickedEvent(fromPage));
    }
}
