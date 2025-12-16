package com.avito.android.tariff_cpt.info.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import l90.o;

/* compiled from: CptInfoDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/info/deeplink/a;", "Lev/b;", "Lcom/avito/android/tariff_cpt/info/deeplink/TariffCptInfoLink;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC40162b<TariffCptInfoLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f298148d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final hC0.c f298149e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final o f298150f;

    @Inject
    public a(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k hC0.c cVar, @Y61.k o oVar) {
        this.f298148d = interfaceC4053a;
        this.f298149e = cVar;
        this.f298150f = oVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        Intent intentE = this.f298149e.e(((TariffCptInfoLink) deepLink).f298142b);
        intentE.setFlags(603979776);
        intentE.putExtra("up_intent", this.f298150f.b());
        this.f298148d.R(intentE, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
