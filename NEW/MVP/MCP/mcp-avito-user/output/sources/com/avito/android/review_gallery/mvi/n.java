package com.avito.android.review_gallery.mvi;

import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.arch.mvi.u;
import com.avito.android.review_gallery.mvi.entity.ReviewGalleryInternalAction;
import gn0.C40714c;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ReviewGalleryReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/review_gallery/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction;", "Lgn0/c;", "<init>", "()V", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements u<ReviewGalleryInternalAction, C40714c> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C40714c a(ReviewGalleryInternalAction reviewGalleryInternalAction, C40714c c40714c) {
        GalleryItem.ReviewTextSection reviewTextSection;
        ReviewGalleryInternalAction reviewGalleryInternalAction2 = reviewGalleryInternalAction;
        C40714c c40714c2 = c40714c;
        if (!(reviewGalleryInternalAction2 instanceof ReviewGalleryInternalAction.UpdateContent)) {
            return c40714c2;
        }
        GalleryItem.GalleyReview galleyReview = ((ReviewGalleryInternalAction.UpdateContent) reviewGalleryInternalAction2).f255538b;
        String str = galleyReview.f68428c;
        ArrayList arrayList = galleyReview.f68434i;
        return new C40714c(c40714c2.f396857b, str, galleyReview.f68429d, galleyReview.f68433h, (arrayList == null || (reviewTextSection = (GalleryItem.ReviewTextSection) C42745f0.G(arrayList)) == null) ? null : reviewTextSection.f68437c, c40714c2.f396862g, c40714c2.f396863h, c40714c2.f396864i, c40714c2.f396865j, c40714c2.f396866k, c40714c2.f396867l);
    }
}
