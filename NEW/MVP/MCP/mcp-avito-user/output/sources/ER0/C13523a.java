package Er0;

import Y61.k;
import Y61.l;
import com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageGalleryItemModel;
import com.avito.android.remote.model.VideoGalleryItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ConstructorAdvertGalleryItemModelExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Er0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13523a {
    @l
    public static final ArrayList a(@l List list) {
        DimmedImage image;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ConstructorAdvertGalleryItemModel constructorAdvertGalleryItemModel = (ConstructorAdvertGalleryItemModel) it.next();
            if ((constructorAdvertGalleryItemModel instanceof ImageGalleryItemModel) && (image = ((ImageGalleryItemModel) constructorAdvertGalleryItemModel).getImage()) != null) {
                arrayList.add(image);
            }
        }
        return arrayList;
    }

    @l
    public static final ArrayList b(@l List list) {
        Image thumbnail;
        DimmedImage image;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ConstructorAdvertGalleryItemModel constructorAdvertGalleryItemModel = (ConstructorAdvertGalleryItemModel) it.next();
            if ((constructorAdvertGalleryItemModel instanceof ImageGalleryItemModel) && (image = ((ImageGalleryItemModel) constructorAdvertGalleryItemModel).getImage()) != null) {
                arrayList.add(image.getImage());
            }
            if ((constructorAdvertGalleryItemModel instanceof VideoGalleryItemModel) && (thumbnail = ((VideoGalleryItemModel) constructorAdvertGalleryItemModel).getThumbnail()) != null) {
                arrayList.add(thumbnail);
            }
        }
        return arrayList;
    }

    @l
    public static final b c(@k String str, @l List list) {
        VideoGalleryItemModel videoGalleryItemModel;
        String videoUrl;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ConstructorAdvertGalleryItemModel constructorAdvertGalleryItemModel = (ConstructorAdvertGalleryItemModel) it.next();
            if ((constructorAdvertGalleryItemModel instanceof VideoGalleryItemModel) && (videoUrl = (videoGalleryItemModel = (VideoGalleryItemModel) constructorAdvertGalleryItemModel).getVideoUrl()) != null) {
                arrayList.add(new b(str, videoUrl, com.avito.android.image_loader.b.b(videoGalleryItemModel.getThumbnail()), null, videoGalleryItemModel.getConfig(), 8, null));
            }
        }
        return (b) C42745f0.G(arrayList);
    }
}
