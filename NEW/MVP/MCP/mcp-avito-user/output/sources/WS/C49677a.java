package ws;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.credits.f;
import com.avito.android.deep_linking.links.CreditPartnerLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35974x2;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CreditPartnerLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lws/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/CreditPartnerLink;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ws.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49677a extends AbstractC40162b<CreditPartnerLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f f441827d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f441828e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.navigation.a f441829f;

    @Inject
    public C49677a(@k f fVar, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.navigation.a aVar) {
        this.f441827d = fVar;
        this.f441828e = interfaceC4053a;
        this.f441829f = aVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        CreditPartnerLink creditPartnerLink = (CreditPartnerLink) deepLink;
        NavigationTabSetItem navigationTabSetItemA = this.f441829f.a();
        Intent intentA = this.f441827d.a(creditPartnerLink.f133160b, creditPartnerLink.f133163e, navigationTabSetItemA, null, creditPartnerLink.f133162d);
        C35974x2.d(intentA);
        this.f441828e.R(intentA, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
