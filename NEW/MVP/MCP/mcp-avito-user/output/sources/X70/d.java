package X70;

import Y61.k;
import Y61.l;
import androidx.fragment.app.Fragment;
import com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.h;
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

/* compiled from: CarouselPhotoGalleryViewHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX70/d;", "Lcom/avito/konveyor/adapter/b;", "_avito_photo-gallery-carousel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class d extends com.avito.konveyor.adapter.b {
    public abstract void B80(@l List<Image> list, @l List<BeduinItemTeaser> list2, @l Video video, @l NativeVideo nativeVideo, @l List<Image> list3, @l Map<Integer, Image> map, @l GalleryTeaser galleryTeaser, @l AutotekaTeaserResult autotekaTeaserResult, int i12);

    public abstract void C80(@k Fragment fragment, @l h hVar, long j12, @l String str, @k h hVar2, @k Y41.l lVar, @k Y41.l lVar2, @k Y41.a aVar, @l CarouselGalleryGroup carouselGalleryGroup, @l PinchToZoomSource pinchToZoomSource, @l com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.d dVar);
}
