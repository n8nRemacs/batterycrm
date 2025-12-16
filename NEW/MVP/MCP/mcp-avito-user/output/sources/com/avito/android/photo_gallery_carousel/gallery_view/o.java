package com.avito.android.photo_gallery_carousel.gallery_view;

import Oi0.InterfaceC14697a;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.remote.model.CarouselGalleryGroup;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.beduin_teaser.BeduinItemTeaser;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CarouselPhotoGalleryViewHolderImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/o;", "LX70/d;", "LOi0/a;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o extends X70.d implements InterfaceC14697a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CarouselPhotoGalleryView f217846b;

    public o(@Y61.k View view) {
        super(view);
        this.f217846b = (CarouselPhotoGalleryView) view.findViewById(R.id.gallery_holder);
    }

    @Override // X70.d
    public final void B80(@Y61.l List<Image> list, @Y61.l List<BeduinItemTeaser> list2, @Y61.l Video video, @Y61.l NativeVideo nativeVideo, @Y61.l List<Image> list3, @Y61.l Map<Integer, Image> map, @Y61.l GalleryTeaser galleryTeaser, @Y61.l AutotekaTeaserResult autotekaTeaserResult, int i12) {
        this.f217846b.h(list, list2, video, nativeVideo, list3, map, galleryTeaser, autotekaTeaserResult, i12);
    }

    @Override // X70.d
    public final void C80(@Y61.k Fragment fragment, @Y61.l com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.h hVar, long j12, @Y61.l String str, @Y61.k com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.h hVar2, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.k Y41.a aVar, @Y61.l CarouselGalleryGroup carouselGalleryGroup, @Y61.l PinchToZoomSource pinchToZoomSource, @Y61.l com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.d dVar) {
        this.f217846b.i(fragment, hVar, j12, str, hVar2, lVar, lVar2, aVar, carouselGalleryGroup, pinchToZoomSource, dVar);
    }

    @Override // com.avito.konveyor.adapter.b, Oi0.InterfaceC14697a
    public final void destroy() {
        this.f217846b.g();
    }
}
