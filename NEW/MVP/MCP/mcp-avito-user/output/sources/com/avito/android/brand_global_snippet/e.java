package com.avito.android.brand_global_snippet;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;

/* compiled from: BrandGlobalSnippetItemConverterImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brand_global_snippet/e;", "Lcom/avito/android/brand_global_snippet/d;", "_avito_bx-content_snippet_brand-global-snippet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements d {
    @Override // com.avito.android.serp.b
    @k
    public final Class<BrandGlobalSnippetNetworkModel> a() {
        return BrandGlobalSnippetNetworkModel.class;
    }

    @Override // com.avito.android.serp.b
    public final l1 b(SerpElement serpElement, String str, String str2, int i12) {
        BrandGlobalSnippetNetworkModel brandGlobalSnippetNetworkModel = (BrandGlobalSnippetNetworkModel) serpElement;
        String id2 = brandGlobalSnippetNetworkModel.getId();
        long id3 = brandGlobalSnippetNetworkModel.getCategory().getId();
        String name = brandGlobalSnippetNetworkModel.getCategory().getName();
        long locationId = brandGlobalSnippetNetworkModel.getLocationId();
        String locationName = brandGlobalSnippetNetworkModel.getLocationName();
        String str3 = locationName == null ? "" : locationName;
        String title = brandGlobalSnippetNetworkModel.getTitle();
        String price = brandGlobalSnippetNetworkModel.getPrice();
        boolean isFavorite = brandGlobalSnippetNetworkModel.getIsFavorite();
        DeepLink itemDeepLink = brandGlobalSnippetNetworkModel.getItemDeepLink();
        Image image = brandGlobalSnippetNetworkModel.getImages().getImage();
        String creationDate = brandGlobalSnippetNetworkModel.getCreationDate();
        if (creationDate == null) {
            creationDate = "";
        }
        return new BrandGlobalSnippetItemImpl(id3, name, str3, locationId, creationDate, title, price, itemDeepLink, image, isFavorite, 1, id2, null, null, null, false, 61440, null);
    }
}
