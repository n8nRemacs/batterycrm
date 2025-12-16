package Ls0;

import Ls0.AbstractC14436a;
import Y61.k;
import com.avito.android.B2;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.reflect.n;

/* compiled from: ServiceBookingAdditionalSettingsUxfLinksFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLs0/d;", "LLs0/c;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final B2 f10164a;

    @Inject
    public d(@k B2 b22) {
        this.f10164a = b22;
    }

    @Override // Ls0.c
    @k
    public final UxFeedbackStartCampaignLink a(@k AbstractC14436a.C0635a c0635a) {
        Map mapC = P0.c();
        B2 b22 = this.f10164a;
        b22.getClass();
        n<Object> nVar = B2.f67184X[16];
        return new UxFeedbackStartCampaignLink(c0635a.f10162a, ((Boolean) b22.f67224r.a().invoke()).booleanValue(), P0.c(), mapC);
    }
}
