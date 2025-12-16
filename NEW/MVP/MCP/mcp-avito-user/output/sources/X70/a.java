package X70;

import X70.c;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.beduin_teaser.BeduinItemTeaser;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CarouselPhotoGalleryConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LX70/a;", "", "<init>", "()V", "_avito_photo-gallery-carousel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f18643a = new a();

    @k
    public static ArrayList a(@l NativeVideo nativeVideo, @l Video video, @l AutotekaTeaserResult autotekaTeaserResult, @l GalleryTeaser galleryTeaser, @l List list, @l List list2, @l List list3, @l List list4, @l Map map, boolean z12) {
        ArrayList arrayList = new ArrayList();
        f18643a.getClass();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            List list5 = list;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list5, 10));
            int i12 = 0;
            for (Object obj : list5) {
                int i13 = i12 + 1;
                Image image = null;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Image image2 = (Image) obj;
                boolean zContains = list2 != null ? list2.contains(Integer.valueOf(i12)) : false;
                if (map != null) {
                    image = (Image) map.get(Integer.valueOf(i12));
                }
                arrayList3.add(new c.C1319c(image2, zContains, image));
                i12 = i13;
            }
            arrayList2.addAll(arrayList3);
        }
        if (video != null && video.hasPreviewImage()) {
            arrayList2.add(Math.min(arrayList2.size(), 1), new c.f(video));
        }
        if (nativeVideo != null && ((nativeVideo.hasThumbnail() && nativeVideo.getUrl() != null) || (nativeVideo.getStatus() != null && !z12))) {
            int size = arrayList2.size();
            Integer position = nativeVideo.getPosition();
            arrayList2.add(Math.min(size, position != null ? position.intValue() : arrayList2.size()), new c.d(nativeVideo));
        }
        arrayList.addAll(arrayList2);
        if (list3 != null) {
            List list6 = list3;
            ArrayList arrayList4 = new ArrayList(C42745f0.q(list6, 10));
            Iterator it = list6.iterator();
            while (it.hasNext()) {
                arrayList4.add(new c.C1319c((Image) it.next(), true, null, 4, null));
            }
            arrayList.addAll(arrayList.size() <= 4 ? arrayList.size() : 4, arrayList4);
        }
        ArrayList arrayList5 = new ArrayList();
        if (autotekaTeaserResult != null && autotekaTeaserResult.getCpo() == null) {
            arrayList5.add(new c.a(autotekaTeaserResult));
        }
        if (galleryTeaser != null) {
            arrayList5.add(new c.e(galleryTeaser));
        }
        if (list4 != null) {
            List list7 = list4;
            ArrayList arrayList6 = new ArrayList(C42745f0.q(list7, 10));
            Iterator it2 = list7.iterator();
            while (it2.hasNext()) {
                arrayList6.add(new c.b((BeduinItemTeaser) it2.next()));
            }
            arrayList5.addAll(arrayList6);
        }
        arrayList.addAll(arrayList5);
        return arrayList;
    }
}
