package com.avito.android.photo_gallery_carousel.items.image;

import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryImageItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/image/i;", "LTV0/d;", "Lcom/avito/android/photo_gallery_carousel/items/image/k;", "Lcom/avito/android/photo_gallery_carousel/items/image/GalleryImageItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements TV0.d<k, GalleryImageItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.android.photo_gallery_carousel.gallery_view.a, G0> f217963b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f217964c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k Y41.l<? super com.avito.android.photo_gallery_carousel.gallery_view.a, G0> lVar, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        this.f217963b = lVar;
        this.f217964c = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        k kVar = (k) eVar;
        GalleryImageItem galleryImageItem = (GalleryImageItem) aVar;
        PinchToZoomSource pinchToZoomSource = galleryImageItem.f217944i;
        if (pinchToZoomSource != null) {
            kVar.H7(pinchToZoomSource);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            kVar.Ob();
        }
        com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.d dVar = galleryImageItem.f217945j;
        if (dVar != null) {
            kVar.p7(dVar);
        }
        kVar.T8(Integer.valueOf(i12));
        kVar.Fg(new g(this));
        kVar.a(new h(this, i12));
        kVar.uz(galleryImageItem.f217939d, galleryImageItem.f217940e, galleryImageItem.f217938c, galleryImageItem.f217942g);
    }
}
