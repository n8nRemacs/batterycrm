package com.avito.android.advert.item.brandingGallery.items;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BrandingGalleryBlockElementPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/brandingGallery/items/d;", "LTV0/d;", "Lcom/avito/android/advert/item/brandingGallery/items/g;", "Lcom/avito/android/advert/item/brandingGallery/items/BrandingGalleryBlockElementItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.d<g, BrandingGalleryBlockElementItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f74159b;

    @Inject
    public d(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f74159b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        BrandingGalleryBlockElementItem brandingGalleryBlockElementItem = (BrandingGalleryBlockElementItem) aVar;
        DeepLink deepLink = brandingGalleryBlockElementItem.f74150c;
        boolean z12 = deepLink != null;
        SimpleDraweeView simpleDraweeView = gVar.f74165c;
        simpleDraweeView.setAspectRatio(1.5f);
        C35949t5.b(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(brandingGalleryBlockElementItem.f74149b, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))), new f(gVar, z12));
        D6.a(deepLink != null ? new c(this, brandingGalleryBlockElementItem) : null, gVar.f74164b);
    }
}
