package com.avito.android.photo_gallery_carousel;

import X70.c;
import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.photo_gallery_carousel.items.autoteka_teaser.GalleryAutotekaTeaserItem;
import com.avito.android.photo_gallery_carousel.items.autoteka_teaser.v4.GalleryAutotekaNewTeaserItem;
import com.avito.android.photo_gallery_carousel.items.beduin_teaser.GalleryBeduinItem;
import com.avito.android.photo_gallery_carousel.items.common.SizableGalleryItem;
import com.avito.android.photo_gallery_carousel.items.gallery_teaser.GalleryTeaserItem;
import com.avito.android.photo_gallery_carousel.items.image.GalleryImageItem;
import com.avito.android.photo_gallery_carousel.items.native_video.GalleryNativeVideoItem;
import com.avito.android.photo_gallery_carousel.items.video.GalleryVideoItem;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.remote.model.CarouselGalleryGroup;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserGallery;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CarouselPhotoGalleryItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/b;", "Lcom/avito/android/photo_gallery_carousel/a;", "<init>", "()V", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    public static SizableGalleryItem.Type b(Image image, boolean z12) {
        Map<Size, Uri> variants;
        Set<Size> setKeySet;
        Size size;
        return z12 ? SizableGalleryItem.Type.f217904b : (image == null || (variants = image.getVariants()) == null || (setKeySet = variants.keySet()) == null || (size = (Size) C42745f0.F(setKeySet)) == null || size.getWidth() >= size.getHeight()) ? SizableGalleryItem.Type.f217905c : SizableGalleryItem.Type.f217906d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [com.avito.android.photo_gallery_carousel.items.autoteka_teaser.GalleryAutotekaTeaserItem] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [com.avito.android.photo_gallery_carousel.items.gallery_teaser.GalleryTeaserItem] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    @Override // com.avito.android.photo_gallery_carousel.a
    @k
    public final ArrayList a(@l Video video, @l NativeVideo nativeVideo, @l List list, @l GalleryTeaser galleryTeaser, @l List list2, @l Map map, @l List list3, @l AutotekaTeaserResult autotekaTeaserResult, @l String str, @l CarouselGalleryGroup carouselGalleryGroup, @l PinchToZoomSource pinchToZoomSource, @l com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.d dVar) {
        int i12;
        ?? galleryAutotekaNewTeaserItem;
        X70.a.f18643a.getClass();
        ArrayList arrayListA = X70.a.a(nativeVideo, video, autotekaTeaserResult, galleryTeaser, list, null, list2, list3, map, false);
        if (arrayListA.isEmpty()) {
            i12 = 0;
        } else {
            Iterator it = arrayListA.iterator();
            i12 = 0;
            while (it.hasNext()) {
                X70.c cVar = (X70.c) it.next();
                if ((cVar instanceof c.C1319c) || (cVar instanceof c.d) || (cVar instanceof c.f) || (cVar instanceof c.e)) {
                    i12++;
                    if (i12 < 0) {
                        C42745f0.G0();
                        throw null;
                    }
                }
            }
        }
        boolean z12 = i12 == 1;
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListA, 10));
        Iterator it2 = arrayListA.iterator();
        while (it2.hasNext()) {
            X70.c cVar2 = (X70.c) it2.next();
            if (cVar2 instanceof c.b) {
                c.b bVar = (c.b) cVar2;
                galleryAutotekaNewTeaserItem = new GalleryBeduinItem(String.valueOf(bVar.f18645a.hashCode()), bVar.f18645a);
            } else if (cVar2 instanceof c.C1319c) {
                c.C1319c c1319c = (c.C1319c) cVar2;
                Image image = c1319c.f18646a;
                String strValueOf = String.valueOf(image != null ? image.hashCode() : 0);
                Image image2 = c1319c.f18646a;
                GalleryImageItem galleryImageItem = new GalleryImageItem(strValueOf, b(image2, z12), image2, str, c1319c.f18647b, carouselGalleryGroup, c1319c.f18648c, pinchToZoomSource);
                galleryImageItem.f217945j = dVar;
                galleryAutotekaNewTeaserItem = galleryImageItem;
            } else if (cVar2 instanceof c.d) {
                c.d dVar2 = (c.d) cVar2;
                String strValueOf2 = String.valueOf(dVar2.f18649a.hashCode());
                NativeVideo nativeVideo2 = dVar2.f18649a;
                galleryAutotekaNewTeaserItem = new GalleryNativeVideoItem(strValueOf2, b(nativeVideo2.getThumbnail(), z12), nativeVideo2, str, carouselGalleryGroup);
            } else {
                if (cVar2 instanceof c.e) {
                    c.e eVar = (c.e) cVar2;
                    galleryAutotekaNewTeaserItem = new GalleryTeaserItem(String.valueOf(eVar.f18650a.hashCode()), eVar.f18650a, pinchToZoomSource);
                    galleryAutotekaNewTeaserItem.f217917e = dVar;
                } else if (cVar2 instanceof c.f) {
                    c.f fVar = (c.f) cVar2;
                    String strValueOf3 = String.valueOf(fVar.f18651a.hashCode());
                    Video video2 = fVar.f18651a;
                    galleryAutotekaNewTeaserItem = new GalleryVideoItem(strValueOf3, b(video2.getPreviewImage(), z12), video2, str, carouselGalleryGroup);
                } else {
                    if (!(cVar2 instanceof c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c.a aVar = (c.a) cVar2;
                    AutotekaTeaserGallery gallery = aVar.f18644a.getGallery();
                    AutotekaTeaserResult autotekaTeaserResult2 = aVar.f18644a;
                    galleryAutotekaNewTeaserItem = gallery != null ? new GalleryAutotekaNewTeaserItem(String.valueOf(autotekaTeaserResult2.hashCode()), gallery) : new GalleryAutotekaTeaserItem(String.valueOf(autotekaTeaserResult2.hashCode()), autotekaTeaserResult2);
                }
                arrayList.add(galleryAutotekaNewTeaserItem);
            }
            arrayList.add(galleryAutotekaNewTeaserItem);
        }
        return arrayList;
    }
}
