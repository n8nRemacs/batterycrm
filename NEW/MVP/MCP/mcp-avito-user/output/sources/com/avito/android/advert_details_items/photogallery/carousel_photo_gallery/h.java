package com.avito.android.advert_details_items.photogallery.carousel_photo_gallery;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.account.E;
import com.avito.android.advert_core.advert.l;
import com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem;
import com.avito.android.advert_details_items.photogallery.c;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import t3.InterfaceC48490v;

/* compiled from: AdvertDetailsCarouselPhotoGalleryPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/photogallery/carousel_photo_gallery/h;", "Lcom/avito/android/advert_details_items/photogallery/carousel_photo_gallery/c;", "LY70/b;", "LY70/a;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements c, Y70.b, Y70.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_details_items.photogallery.c f85049b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R70.b f85050c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l f85051d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC28373a f85052e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final E f85053f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final u3.l<SimpleTestGroupWithNone> f85054g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsGalleryItem f85055h;

    @Inject
    public h(@k com.avito.android.advert_details_items.photogallery.c cVar, @k R70.b bVar, @k l lVar, @k InterfaceC28373a interfaceC28373a, @k E e12, @k @InterfaceC48490v u3.l<SimpleTestGroupWithNone> lVar2) {
        this.f85049b = cVar;
        this.f85050c = bVar;
        this.f85051d = lVar;
        this.f85052e = interfaceC28373a;
        this.f85053f = e12;
        this.f85054g = lVar2;
    }

    public final void O(int i12, boolean z12) {
        AdvertDetailsGalleryItem advertDetailsGalleryItem = this.f85055h;
        c.a.a(this.f85049b, i12, advertDetailsGalleryItem != null ? Long.valueOf(advertDetailsGalleryItem.f85013l) : null, Boolean.valueOf(z12), 4);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        PinchToZoomSource pinchToZoomSource;
        d dVar;
        X70.d dVar2 = (X70.d) eVar;
        AdvertDetailsGalleryItem advertDetailsGalleryItem = (AdvertDetailsGalleryItem) aVar;
        this.f85055h = advertDetailsGalleryItem;
        u3.l<SimpleTestGroupWithNone> lVar = this.f85054g;
        lVar.b();
        if (lVar.f439745a.f439749b.b()) {
            pinchToZoomSource = PinchToZoomSource.f219965d;
            dVar = new d(this, advertDetailsGalleryItem);
        } else {
            pinchToZoomSource = null;
            dVar = null;
        }
        dVar2.C80(this.f85051d.b(), this, advertDetailsGalleryItem.f85013l, advertDetailsGalleryItem.f85014m, this, new e(this, advertDetailsGalleryItem), new f(this, advertDetailsGalleryItem), new g(this, advertDetailsGalleryItem), advertDetailsGalleryItem.f85025x, pinchToZoomSource, dVar);
        int i13 = advertDetailsGalleryItem.f85012k;
        Integer numValueOf = i13 > -1 ? Integer.valueOf(i13) : null;
        dVar2.B80(advertDetailsGalleryItem.f85005d, advertDetailsGalleryItem.f85023v, advertDetailsGalleryItem.f85009h, advertDetailsGalleryItem.f85010i, advertDetailsGalleryItem.f85006e, advertDetailsGalleryItem.f85008g, advertDetailsGalleryItem.f85022u, advertDetailsGalleryItem.f85021t, numValueOf != null ? numValueOf.intValue() : 0);
    }

    public final void k(int i12, long j12) {
        AdvertDetailsGalleryItem advertDetailsGalleryItem = this.f85055h;
        if (advertDetailsGalleryItem == null || advertDetailsGalleryItem.f85012k != i12) {
            this.f85050c.O(i12, j12);
            this.f85049b.r1();
            AdvertDetailsGalleryItem advertDetailsGalleryItem2 = this.f85055h;
            if (advertDetailsGalleryItem2 == null) {
                return;
            }
            advertDetailsGalleryItem2.f85012k = i12;
        }
    }
}
