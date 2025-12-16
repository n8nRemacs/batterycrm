package com.avito.android.developments_agency_search.deeplink;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffCardRegionSelectorLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/G;", "Lev/a;", "Lcom/avito/android/developments_agency_search/deeplink/TariffCardRegionSelectorLink;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class G extends AbstractC40161a<TariffCardRegionSelectorLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.d f136379f;

    @Inject
    public G(@Y61.k a.d dVar) {
        this.f136379f = dVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f136379f.k0(new F((TariffCardRegionSelectorLink) deepLink, this));
    }
}
