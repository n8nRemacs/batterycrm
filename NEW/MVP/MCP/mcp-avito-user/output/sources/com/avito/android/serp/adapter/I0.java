package com.avito.android.serp.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.developments_catalog.serp.SerpDevelopment;
import com.avito.android.serp.adapter.rich_snippets.realty.DevelopmentItem;
import kotlin.Metadata;

/* compiled from: SerpDevelopmentConverter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/I0;", "Lcom/avito/android/serp/adapter/H0;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class I0 implements H0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final G f268506a;

    public I0(@Y61.k G g12) {
        this.f268506a = g12;
    }

    @Override // com.avito.android.serp.adapter.H0
    @Y61.k
    public final DevelopmentItem a(@Y61.k SerpDevelopment serpDevelopment, @Y61.k SerpDisplayType serpDisplayType) {
        long jA2 = N0.a(serpDevelopment.getUniqueId(), String.valueOf(serpDevelopment.getDevelopmentId()));
        String strValueOf = String.valueOf(serpDevelopment.getDevelopmentId());
        String name = serpDevelopment.getName();
        String developer = serpDevelopment.getDeveloper();
        String price = serpDevelopment.getPrice();
        String promoPrice = serpDevelopment.getPromoPrice();
        int iA2 = this.f268506a.a(serpDisplayType);
        SerpViewType serpViewTypeA = X0.a(serpDisplayType, false);
        DeepLink deepLink = serpDevelopment.getDeepLink();
        if (deepLink == null) {
            deepLink = new NoMatchLink();
        }
        return new DevelopmentItem(jA2, strValueOf, name, developer, price, promoPrice, iA2, serpViewTypeA, serpDisplayType, deepLink, serpDevelopment.getImageList(), serpDevelopment.getContacts(), serpDevelopment.getGalleryContacts(), serpDevelopment.getGeoReferences(), serpDevelopment.getAdditionalLines(), serpDevelopment.getBadgeBar(), serpDevelopment.getDeveloperProfile());
    }
}
