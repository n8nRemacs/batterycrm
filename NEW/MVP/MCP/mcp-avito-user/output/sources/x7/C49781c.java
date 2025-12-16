package x7;

import SK0.b;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.service_booking.ux_feedback.CsatCampaignEvent;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CsatServiceBookingFeedbackHelper.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx7/c;", "Lx7/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x7.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C49781c implements InterfaceC49780b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f442241a;

    @Inject
    public C49781c(@k SK0.b bVar) {
        this.f442241a = bVar;
    }

    @Override // x7.InterfaceC49780b
    public final void a(boolean z12) {
        C49779a c49779a;
        if (z12) {
            CsatCampaignEvent[] csatCampaignEventArr = CsatCampaignEvent.f80980b;
            c49779a = new C49779a("csat_service_booking_canceled");
        } else {
            CsatCampaignEvent[] csatCampaignEventArr2 = CsatCampaignEvent.f80980b;
            c49779a = new C49779a("csat_service_booking_finished");
        }
        b.a.a(this.f442241a, c49779a, null, null, null, 14);
    }
}
