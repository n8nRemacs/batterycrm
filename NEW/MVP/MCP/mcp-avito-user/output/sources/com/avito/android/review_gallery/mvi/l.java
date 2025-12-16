package com.avito.android.review_gallery.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.review_gallery.mvi.entity.ReviewGalleryInternalAction;
import gn0.InterfaceC40713b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ReviewGalleryOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/review_gallery/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction;", "Lgn0/b;", "<init>", "()V", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements t<ReviewGalleryInternalAction, InterfaceC40713b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40713b b(ReviewGalleryInternalAction reviewGalleryInternalAction) {
        InterfaceC40713b dVar;
        ReviewGalleryInternalAction reviewGalleryInternalAction2 = reviewGalleryInternalAction;
        if (reviewGalleryInternalAction2.equals(ReviewGalleryInternalAction.NavigateBack.f255534b)) {
            return InterfaceC40713b.C11230b.f396853a;
        }
        if (reviewGalleryInternalAction2 instanceof ReviewGalleryInternalAction.NavigateToDetails) {
            dVar = new InterfaceC40713b.c(((ReviewGalleryInternalAction.NavigateToDetails) reviewGalleryInternalAction2).f255535b);
        } else if (reviewGalleryInternalAction2 instanceof ReviewGalleryInternalAction.NewItemsLoaded) {
            dVar = new InterfaceC40713b.a(((ReviewGalleryInternalAction.NewItemsLoaded) reviewGalleryInternalAction2).f255536b);
        } else {
            if (!(reviewGalleryInternalAction2 instanceof ReviewGalleryInternalAction.OpenDeeplink)) {
                if (reviewGalleryInternalAction2 instanceof ReviewGalleryInternalAction.UpdateContent) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            dVar = new InterfaceC40713b.d(((ReviewGalleryInternalAction.OpenDeeplink) reviewGalleryInternalAction2).f255537b);
        }
        return dVar;
    }
}
