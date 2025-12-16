package com.avito.android.photo_gallery_carousel.items.autoteka_teaser.v4;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserGallery;
import com.avito.android.remote.model.autotekateaser.MiniGallery;
import com.avito.android.remote.model.autotekateaser.PersonalDiscount;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GalleryAutotekaNewTeaserItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/autoteka_teaser/v4/d;", "LTV0/d;", "Lcom/avito/android/photo_gallery_carousel/items/autoteka_teaser/v4/g;", "Lcom/avito/android/photo_gallery_carousel/items/autoteka_teaser/v4/GalleryAutotekaNewTeaserItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements TV0.d<g, GalleryAutotekaNewTeaserItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<com.avito.android.photo_gallery_carousel.gallery_view.a, G0> f217878b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super com.avito.android.photo_gallery_carousel.gallery_view.a, G0> lVar) {
        this.f217878b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AutotekaTeaserGallery autotekaTeaserGallery = ((GalleryAutotekaNewTeaserItem) aVar).f217871c;
        MiniGallery mini = autotekaTeaserGallery.getMini();
        gVar.setTitle(mini.getTitle());
        gVar.h(mini.getSubtitle());
        gVar.Hg(mini.getButton(), new c(this, mini));
        if (L.f(mini.getImage().getIconPhoto(), Boolean.TRUE)) {
            gVar.c9();
        } else {
            gVar.u9();
        }
        PersonalDiscount personalDiscount = autotekaTeaserGallery.getUserData().getPersonalDiscount();
        if (personalDiscount != null) {
            gVar.oz(personalDiscount);
        }
    }
}
