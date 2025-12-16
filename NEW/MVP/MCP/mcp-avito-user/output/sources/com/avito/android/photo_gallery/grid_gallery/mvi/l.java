package com.avito.android.photo_gallery.grid_gallery.mvi;

import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryPositionsBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/mvi/l;", "", "<init>", "()V", "", "Lcom/avito/android/photo_gallery/adapter/q;", "fullScreenOldGalleryItems", "LX70/c;", "fullScreenCarouselGalleryItems", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l {
    @Inject
    public l() {
    }

    public static Integer a(Y41.l lVar, List list) {
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (((Boolean) lVar.invoke(it.next())).booleanValue()) {
                break;
            }
            i12++;
        }
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 != -1) {
            return numValueOf;
        }
        return null;
    }
}
