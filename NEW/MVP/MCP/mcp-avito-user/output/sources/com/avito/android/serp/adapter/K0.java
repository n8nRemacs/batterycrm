package com.avito.android.serp.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.developments_catalog.serp.SerpDevelopmentXl;
import com.avito.android.serp.adapter.rich_snippets.realty.DevelopmentXlItem;
import kotlin.Metadata;

/* compiled from: SerpDevelopmentXlConverter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/K0;", "Lcom/avito/android/serp/adapter/J0;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class K0 implements J0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final G f268510a;

    public K0(@Y61.k G g12) {
        this.f268510a = g12;
    }

    @Override // com.avito.android.serp.adapter.J0
    @Y61.k
    public final DevelopmentXlItem a(@Y61.k SerpDevelopmentXl serpDevelopmentXl, @Y61.k SerpDisplayType serpDisplayType) {
        long jA2 = N0.a(serpDevelopmentXl.getUniqueId(), String.valueOf(serpDevelopmentXl.getDevelopmentId()));
        String strValueOf = String.valueOf(serpDevelopmentXl.getDevelopmentId());
        String name = serpDevelopmentXl.getName();
        String developer = serpDevelopmentXl.getDeveloper();
        String price = serpDevelopmentXl.getPrice();
        int iA2 = this.f268510a.a(serpDisplayType);
        SerpViewType serpViewTypeA = X0.a(serpDisplayType, false);
        DeepLink deepLink = serpDevelopmentXl.getDeepLink();
        if (deepLink == null) {
            deepLink = new NoMatchLink();
        }
        return new DevelopmentXlItem(jA2, strValueOf, name, developer, price, iA2, serpViewTypeA, serpDisplayType, deepLink, serpDevelopmentXl.getImageList(), serpDevelopmentXl.getContacts(), serpDevelopmentXl.getGalleryContacts(), serpDevelopmentXl.getGeoReferences(), serpDevelopmentXl.getAdditionalLines(), serpDevelopmentXl.getBadgeBar(), serpDevelopmentXl.getDeveloperProfile());
    }
}
