package com.avito.android.photo_gallery.adapter;

import com.avito.android.photo_gallery.adapter.q;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.beduin_teaser.BeduinItemTeaser;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_photo-gallery_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class p {
    @Y61.k
    public static final ArrayList a(@Y61.l NativeVideo nativeVideo, @Y61.l Video video, @Y61.l AutotekaTeaserResult autotekaTeaserResult, @Y61.l GalleryTeaser galleryTeaser, @Y61.l List list, @Y61.l List list2, @Y61.l List list3, @Y61.l List list4, @Y61.l Map map, boolean z12) {
        Collection collectionSingletonList;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list3 != null) {
            List list5 = list3;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list5, 10));
            Iterator it = list5.iterator();
            while (it.hasNext()) {
                arrayList3.add(new q.e((Image) it.next()));
            }
            arrayList2.addAll(arrayList3);
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList4 = new ArrayList();
        if (list != null) {
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Image image = (Image) obj;
                Image image2 = map != null ? (Image) map.get(Integer.valueOf(i12)) : null;
                arrayList4.add(image2 != null ? new q.a(image, image2) : (list2 == null || !list2.contains(Integer.valueOf(i12))) ? new q.c(image) : new q.e(image));
                i12 = i13;
            }
        }
        if (video != null) {
            X70.a.f18643a.getClass();
            if (video.hasPreviewImage()) {
                arrayList4.add(Math.min(arrayList4.size(), 1), new q.h(video));
            }
        }
        if (nativeVideo != null) {
            X70.a.f18643a.getClass();
            if ((nativeVideo.hasThumbnail() && nativeVideo.getUrl() != null) || (nativeVideo.getStatus() != null && !z12)) {
                int size = arrayList4.size();
                Integer position = nativeVideo.getPosition();
                arrayList4.add(Math.min(size, position != null ? position.intValue() : arrayList4.size()), new q.d(nativeVideo));
            }
        }
        arrayList.addAll(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        if (autotekaTeaserResult != null && autotekaTeaserResult.getCpo() == null) {
            collectionSingletonList = Collections.singletonList(new q.g(autotekaTeaserResult, z12));
        } else if (galleryTeaser != null) {
            collectionSingletonList = Collections.singletonList(new q.f(galleryTeaser));
        } else if (list4 != null) {
            List list6 = list4;
            ArrayList arrayList6 = new ArrayList(C42745f0.q(list6, 10));
            Iterator it2 = list6.iterator();
            while (it2.hasNext()) {
                arrayList6.add(new q.b((BeduinItemTeaser) it2.next()));
            }
            collectionSingletonList = arrayList6;
        } else {
            collectionSingletonList = C42784z0.f406748b;
        }
        arrayList5.addAll(collectionSingletonList);
        arrayList.addAll(arrayList5);
        return arrayList;
    }

    public static /* synthetic */ ArrayList b(Video video, NativeVideo nativeVideo, List list, AutotekaTeaserResult autotekaTeaserResult, GalleryTeaser galleryTeaser, boolean z12, List list2, List list3, Map map, List list4, int i12) {
        AutotekaTeaserResult autotekaTeaserResult2 = (i12 & 8) != 0 ? null : autotekaTeaserResult;
        GalleryTeaser galleryTeaser2 = (i12 & 16) != 0 ? null : galleryTeaser;
        boolean z13 = (i12 & 32) != 0 ? false : z12;
        return a(nativeVideo, video, autotekaTeaserResult2, galleryTeaser2, list, (i12 & 64) != 0 ? null : list2, (i12 & 128) != 0 ? null : list3, (i12 & 512) != 0 ? null : list4, (i12 & 256) != 0 ? null : map, z13);
    }
}
