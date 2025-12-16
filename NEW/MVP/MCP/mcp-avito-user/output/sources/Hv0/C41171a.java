package hv0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv0.InterfaceC25722a;
import com.avito.android.B2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.services_portfolio.deeplink.ServicesPortfolioProjectBuyerLink;
import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServicesPortfolioProjectBuyerLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhv0/a;", "Lev/b;", "Lcom/avito/android/services_portfolio/deeplink/ServicesPortfolioProjectBuyerLink;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hv0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41171a extends AbstractC40162b<ServicesPortfolioProjectBuyerLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f398296d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final B2 f398297e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC25722a f398298f;

    @Inject
    public C41171a(@k a.InterfaceC4053a interfaceC4053a, @k B2 b22, @k InterfaceC25722a interfaceC25722a) {
        this.f398296d = interfaceC4053a;
        this.f398297e = b22;
        this.f398298f = interfaceC25722a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ServicesPortfolioProjectBuyerLink servicesPortfolioProjectBuyerLink = (ServicesPortfolioProjectBuyerLink) deepLink;
        if (!this.f398297e.x().invoke().booleanValue()) {
            return AbstractC14250d.b.f9170c;
        }
        String str2 = servicesPortfolioProjectBuyerLink.f279983e;
        boolean z12 = servicesPortfolioProjectBuyerLink.f279982d;
        String str3 = servicesPortfolioProjectBuyerLink.f279984f;
        this.f398296d.R(this.f398298f.a(new PortfolioProjectArguments.BuyerArgs(servicesPortfolioProjectBuyerLink.f279980b, str2, str3, servicesPortfolioProjectBuyerLink.f279985g, servicesPortfolioProjectBuyerLink.f279986h, servicesPortfolioProjectBuyerLink.f279981c, z12)), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
