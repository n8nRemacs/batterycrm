package com.avito.android.advertising.adapter.items.adstub.profile_promo_gallery;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.AdProfilePromoGalleryViewHolderImpl;
import com.avito.android.util.D6;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LoadingProfilePromoGalleryBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/adstub/profile_promo_gallery/a;", "LTV0/b;", "Lcom/avito/android/advertising/adapter/items/avito/profile_promo_gallery/a;", "Lcom/avito/android/advertising/adapter/CommercialBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<com.avito.android.advertising.adapter.items.avito.profile_promo_gallery.a, CommercialBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f86972a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f86973b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<AdProfilePromoGalleryViewHolderImpl> f86974c = new g.a<>(R.layout.ad_profile_promo_gallery, new C2591a());

    /* compiled from: LoadingProfilePromoGalleryBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/advertising/adapter/items/avito/profile_promo_gallery/AdProfilePromoGalleryViewHolderImpl;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advertising.adapter.items.adstub.profile_promo_gallery.a$a, reason: collision with other inner class name */
    public static final class C2591a extends N implements p<ViewGroup, View, AdProfilePromoGalleryViewHolderImpl> {
        public C2591a() {
            super(2);
        }

        @Override // Y41.p
        public final AdProfilePromoGalleryViewHolderImpl invoke(ViewGroup viewGroup, View view) {
            AdProfilePromoGalleryViewHolderImpl adProfilePromoGalleryViewHolderImpl = new AdProfilePromoGalleryViewHolderImpl(view, Collections.singletonList(new c(a.this.f86973b)), null, null);
            adProfilePromoGalleryViewHolderImpl.f87215h = false;
            D6.g(adProfilePromoGalleryViewHolderImpl.f87217j);
            D6.H(adProfilePromoGalleryViewHolderImpl.f87218k);
            return adProfilePromoGalleryViewHolderImpl;
        }
    }

    @Inject
    public a(@k g gVar, @k e eVar) {
        this.f86972a = gVar;
        this.f86973b = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f86972a;
    }

    @Override // TV0.b
    @k
    public final g.a<AdProfilePromoGalleryViewHolderImpl> b() {
        return this.f86974c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof CommercialBannerItem) {
            CommercialBannerItem commercialBannerItem = (CommercialBannerItem) aVar;
            if (commercialBannerItem.getHasNotLoadedAd() && commercialBannerItem.isProfilePromoGallery()) {
                return true;
            }
        }
        return false;
    }
}
