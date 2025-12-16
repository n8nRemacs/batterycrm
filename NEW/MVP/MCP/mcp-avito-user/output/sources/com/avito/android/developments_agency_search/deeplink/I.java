package com.avito.android.developments_agency_search.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: TariffCardRegionSelectorLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/I;", "LKu/a;", "Lcom/avito/android/developments_agency_search/deeplink/TariffCardRegionSelectorLink;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class I extends AbstractC14350a<TariffCardRegionSelectorLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) {
        return new TariffCardRegionSelectorLink(Ku.i.p(uri, SearchParamsConverterKt.LOCATION_ID));
    }
}
