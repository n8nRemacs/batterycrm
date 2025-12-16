package com.avito.android.advert_details_items.photogallery;

import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import kotlin.Metadata;
import y80.C50082a;
import y80.C50083b;

/* compiled from: AdvertDetailsGalleryPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/photogallery/e;", "Lz80/e;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements z80.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f85062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsGalleryItem f85063b;

    public e(AdvertDetailsGalleryItem advertDetailsGalleryItem, k kVar) {
        PinchToZoomSource pinchToZoomSource = PinchToZoomSource.f219964c;
        this.f85062a = kVar;
        this.f85063b = advertDetailsGalleryItem;
    }

    @Override // z80.e
    public final void a(@Y61.l Integer num) {
        k kVar = this.f85062a;
        kVar.f85077e.c(new C50082a(kVar.f85080h.a(), null, this.f85063b.f85004c, num, null, PinchToZoomSource.f219965d));
    }

    @Override // z80.e
    public final void b() {
        k kVar = this.f85062a;
        kVar.f85077e.c(new C50083b(kVar.f85080h.a(), null, this.f85063b.f85004c, null, PinchToZoomSource.f219965d));
    }
}
