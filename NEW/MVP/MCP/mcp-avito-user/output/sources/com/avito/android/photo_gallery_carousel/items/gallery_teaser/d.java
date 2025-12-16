package com.avito.android.photo_gallery_carousel.items.gallery_teaser;

import Y41.l;
import Y61.k;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.android.remote.model.model_card.LinkInfo;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryTeaserItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/gallery_teaser/d;", "LTV0/d;", "Lcom/avito/android/photo_gallery_carousel/items/gallery_teaser/f;", "Lcom/avito/android/photo_gallery_carousel/items/gallery_teaser/GalleryTeaserItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements TV0.d<f, GalleryTeaserItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<com.avito.android.photo_gallery_carousel.gallery_view.a, G0> f217926b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super com.avito.android.photo_gallery_carousel.gallery_view.a, G0> lVar) {
        this.f217926b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        f fVar = (f) eVar;
        GalleryTeaserItem galleryTeaserItem = (GalleryTeaserItem) aVar;
        PinchToZoomSource pinchToZoomSource = galleryTeaserItem.f217916d;
        if (pinchToZoomSource != null) {
            fVar.H7(pinchToZoomSource);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            fVar.Ob();
        }
        com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.d dVar = galleryTeaserItem.f217917e;
        if (dVar != null) {
            fVar.p7(dVar);
        }
        fVar.T8(Integer.valueOf(i12));
        GalleryTeaser galleryTeaser = galleryTeaserItem.f217915c;
        fVar.z2(galleryTeaser.getImage());
        String title = galleryTeaser.getTitle();
        if (title == null) {
            title = "";
        }
        String subtitle = galleryTeaser.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        fVar.Ap(title, subtitle);
        LinkInfo button = galleryTeaser.getButton();
        String title2 = button != null ? button.getTitle() : null;
        fVar.w2(title2 != null ? title2 : "");
        fVar.Y(new c(this, galleryTeaserItem));
    }
}
