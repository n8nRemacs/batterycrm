package com.avito.android.advert_details_items.carousel_photogallery;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CarouselPhotoGalleryPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/carousel_photogallery/e;", "Lcom/avito/android/advert_details_items/carousel_photogallery/c;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_details_items.photogallery.c f84549b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R70.b f84550c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f84551d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public CarouselPhotoGalleryItem f84552e;

    @Inject
    public e(@Y61.k com.avito.android.advert_details_items.photogallery.c cVar, @Y61.k R70.b bVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f84549b = cVar;
        this.f84550c = bVar;
        this.f84551d = interfaceC28373a;
    }

    @Override // R70.b
    public final void O(int i12, long j12) {
        CarouselPhotoGalleryItem carouselPhotoGalleryItem = this.f84552e;
        if (carouselPhotoGalleryItem == null || carouselPhotoGalleryItem.f84534f != i12) {
            this.f84550c.O(i12, j12);
            CarouselPhotoGalleryItem carouselPhotoGalleryItem2 = this.f84552e;
            if (carouselPhotoGalleryItem2 == null) {
                return;
            }
            carouselPhotoGalleryItem2.f84534f = i12;
        }
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        CarouselPhotoGalleryItem carouselPhotoGalleryItem = (CarouselPhotoGalleryItem) aVar;
        this.f84552e = carouselPhotoGalleryItem;
        gVar.xB(carouselPhotoGalleryItem.f84532d, carouselPhotoGalleryItem.f84533e, carouselPhotoGalleryItem.f84535g, this, this, carouselPhotoGalleryItem.f84534f, carouselPhotoGalleryItem.f84536h);
        gVar.Z70(new d(this));
    }
}
