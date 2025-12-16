package com.avito.android.photo_gallery_carousel.items.native_video;

import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.NativeVideoStatus;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GalleryNativeVideoItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/native_video/i;", "LTV0/d;", "Lcom/avito/android/photo_gallery_carousel/items/native_video/k;", "Lcom/avito/android/photo_gallery_carousel/items/native_video/GalleryNativeVideoItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements TV0.d<k, GalleryNativeVideoItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.android.photo_gallery_carousel.gallery_view.a, G0> f217997b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f217998c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.player.router.d f217999d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k Y41.l<? super com.avito.android.photo_gallery_carousel.gallery_view.a, G0> lVar, @Y61.k com.avito.android.connection_quality.connectivity.a aVar, @Y61.k com.avito.android.player.router.d dVar) {
        this.f217997b = lVar;
        this.f217998c = aVar;
        this.f217999d = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        GalleryNativeVideoItem galleryNativeVideoItem = (GalleryNativeVideoItem) aVar;
        kVar.Fg(new g(this));
        NativeVideo nativeVideo = galleryNativeVideoItem.f217981d;
        kVar.uW(nativeVideo.getStatus() == null);
        kVar.CR(nativeVideo.getStatus() != null);
        NativeVideoStatus status = nativeVideo.getStatus();
        kVar.dP(status != null ? status.getIcon() : null);
        NativeVideoStatus status2 = nativeVideo.getStatus();
        kVar.J8(status2 != null ? status2.getText() : null);
        kVar.a(new h(galleryNativeVideoItem, this));
        kVar.uz(nativeVideo.getThumbnail(), galleryNativeVideoItem.f217982e, galleryNativeVideoItem.f217980c, galleryNativeVideoItem.f217983f);
    }
}
