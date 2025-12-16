package com.avito.android.photo_gallery_carousel.items.video;

import com.avito.android.util.InterfaceC35845m2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GalleryVideoItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/video/i;", "LTV0/d;", "Lcom/avito/android/photo_gallery_carousel/items/video/k;", "Lcom/avito/android/photo_gallery_carousel/items/video/GalleryVideoItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements TV0.d<k, GalleryVideoItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.android.photo_gallery_carousel.gallery_view.a, G0> f218031b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f218032c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f218033d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k Y41.l<? super com.avito.android.photo_gallery_carousel.gallery_view.a, G0> lVar, @Y61.k com.avito.android.connection_quality.connectivity.a aVar, @Y61.k InterfaceC35845m2 interfaceC35845m2) {
        this.f218031b = lVar;
        this.f218032c = aVar;
        this.f218033d = interfaceC35845m2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        GalleryVideoItem galleryVideoItem = (GalleryVideoItem) aVar;
        kVar.Fg(new g(this));
        kVar.a(new h(this, i12, galleryVideoItem));
        kVar.uz(galleryVideoItem.f218014d.getPreviewImage(), galleryVideoItem.f218015e, galleryVideoItem.f218013c, galleryVideoItem.f218016f);
    }
}
