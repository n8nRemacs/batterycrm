package com.avito.android.photo_gallery_carousel.gallery_view;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.photo_gallery_carousel.gallery_view.a;
import com.avito.android.util.L5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: CarouselPhotoGalleryView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class n extends H implements Y41.l<a, G0> {
    @Override // Y41.l
    public final G0 invoke(a aVar) {
        a aVar2 = aVar;
        CarouselPhotoGalleryView carouselPhotoGalleryView = (CarouselPhotoGalleryView) this.receiver;
        int i12 = CarouselPhotoGalleryView.f217796D;
        carouselPhotoGalleryView.getClass();
        if (aVar2 instanceof a.f) {
            L5.b(carouselPhotoGalleryView.getContext(), ((a.f) aVar2).f217832a.k0(carouselPhotoGalleryView.getContext()), 0);
        } else if (aVar2 instanceof a.e) {
            com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.h hVar = carouselPhotoGalleryView.f217819u;
            if (hVar != null) {
                hVar.O(((a.e) aVar2).f217831a, false);
            }
        } else if (aVar2 instanceof a.C6530a) {
            com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.h hVar2 = carouselPhotoGalleryView.f217819u;
            if (hVar2 != null) {
                hVar2.O(((a.C6530a) aVar2).f217827a, false);
            }
        } else if (aVar2 instanceof a.c) {
            DeepLink deepLink = ((a.c) aVar2).f217829a;
            if (deepLink != null) {
                b.a.a(carouselPhotoGalleryView.getDeeplinkHandler(), deepLink, null, null, 6);
            }
        } else if (aVar2 instanceof a.d) {
            carouselPhotoGalleryView.getContext().startActivity(((a.d) aVar2).f217830a);
        } else if (aVar2 instanceof a.g) {
            com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.h hVar3 = carouselPhotoGalleryView.f217819u;
            if (hVar3 != null) {
                int i13 = ((a.g) aVar2).f217833a;
                hVar3.f85049b.a0();
            }
            carouselPhotoGalleryView.getContext().startActivity(((a.g) aVar2).f217834b);
        } else if (aVar2 instanceof a.b) {
            b.a.a(carouselPhotoGalleryView.getDeeplinkHandler(), ((a.b) aVar2).f217828a, null, null, 6);
        }
        return G0.f406611a;
    }
}
