package nC0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.tariff_cpt.configure.landing.deeplink.TariffCptConfigureLandingLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCptConfigureLandingDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LnC0/a;", "Lev/b;", "Lcom/avito/android/tariff_cpt/configure/landing/deeplink/TariffCptConfigureLandingLink;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nC0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44231a extends AbstractC40162b<TariffCptConfigureLandingLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f414922d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final hC0.c f414923e;

    @Inject
    public C44231a(@k a.InterfaceC4053a interfaceC4053a, @k hC0.c cVar) {
        this.f414922d = interfaceC4053a;
        this.f414923e = cVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        TariffCptConfigureLandingLink tariffCptConfigureLandingLink = (TariffCptConfigureLandingLink) deepLink;
        this.f414922d.R(this.f414923e.c(tariffCptConfigureLandingLink.f297737b, tariffCptConfigureLandingLink.f297738c), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
