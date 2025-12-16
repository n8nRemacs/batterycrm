package com.avito.android.rating.details.converter;

import android.net.Uri;
import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.C27637a2;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryContactBar;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryEntry;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryReview;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: RatingDetailsGalleryConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/converter/l;", "Lcom/avito/android/rating/details/converter/k;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final VD.b f246939a;

    public l(@Y61.k VD.b bVar) {
        this.f246939a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.rating.details.converter.k
    @Y61.l
    public final GalleryItem a(@Y61.k PhotoGalleryEntry photoGalleryEntry, long j12) {
        C42784z0 c42784z0;
        VD.b bVar = this.f246939a;
        bVar.getClass();
        kotlin.reflect.n<Object> nVar = VD.b.f16995i[5];
        if (!((Boolean) bVar.f17001g.a().invoke()).booleanValue()) {
            return null;
        }
        String strA = C21030p.a(j12, "gallery:");
        List<PhotoGalleryReview> reviews = photoGalleryEntry.getReviews();
        if (reviews != null) {
            List<PhotoGalleryReview> list = reviews;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C27637a2.b((PhotoGalleryReview) it.next()));
            }
            c42784z0 = arrayList;
        } else {
            c42784z0 = C42784z0.f406748b;
        }
        Uri nextPage = photoGalleryEntry.getNextPage();
        List<GalleryItem.GalleryImage> listC = C27637a2.c(photoGalleryEntry);
        String navigationTitle = photoGalleryEntry.getNavigationTitle();
        PhotoGalleryContactBar contactBar = photoGalleryEntry.getContactBar();
        return new GalleryItem(strA, 0, navigationTitle, c42784z0, contactBar != null ? C27637a2.a(contactBar) : null, listC, 0, 0, null, nextPage, 450, null);
    }
}
