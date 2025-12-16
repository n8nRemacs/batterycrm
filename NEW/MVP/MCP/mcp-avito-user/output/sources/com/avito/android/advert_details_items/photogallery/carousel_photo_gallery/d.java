package com.avito.android.advert_details_items.photogallery.carousel_photo_gallery;

import Y61.l;
import com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import kotlin.Metadata;
import y80.C50082a;
import y80.C50083b;

/* compiled from: AdvertDetailsCarouselPhotoGalleryPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/photogallery/carousel_photo_gallery/d;", "Lz80/e;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements z80.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f85041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsGalleryItem f85042b;

    public d(h hVar, AdvertDetailsGalleryItem advertDetailsGalleryItem) {
        PinchToZoomSource pinchToZoomSource = PinchToZoomSource.f219964c;
        this.f85041a = hVar;
        this.f85042b = advertDetailsGalleryItem;
    }

    @Override // z80.e
    public final void a(@l Integer num) {
        h hVar = this.f85041a;
        hVar.f85052e.c(new C50082a(hVar.f85053f.a(), null, this.f85042b.f85014m, num, null, PinchToZoomSource.f219965d));
    }

    @Override // z80.e
    public final void b() {
        h hVar = this.f85041a;
        hVar.f85052e.c(new C50083b(hVar.f85053f.a(), null, this.f85042b.f85014m, null, PinchToZoomSource.f219965d));
    }
}
