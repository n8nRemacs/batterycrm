package com.avito.android.tariff_cpt.info.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCptInfoMonthsDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/info/deeplink/e;", "Lev/b;", "Lcom/avito/android/tariff_cpt/info/deeplink/TariffCptInfoMonthsLink;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends AbstractC40162b<TariffCptInfoMonthsLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.d f298156d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f298157e;

    @Inject
    public e(@Y61.k a.d dVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f298156d = dVar;
        this.f298157e = aVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f298156d.k0(new d((TariffCptInfoMonthsLink) deepLink, this));
        return AbstractC14250d.c.f9171c;
    }
}
