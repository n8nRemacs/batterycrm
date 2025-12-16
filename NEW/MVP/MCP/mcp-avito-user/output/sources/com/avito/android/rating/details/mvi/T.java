package com.avito.android.rating.details.mvi;

import com.avito.android.rating.details.adapter.seller.RatingDetailsReviewItem;
import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.rating_ui.loading.RatingLoadingItem;
import com.avito.android.rating_ui.reviews.model_review.RatingModelReviewItem;
import com.avito.android.rating_ui.reviews.model_review.ReviewStatus;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import tg0.InterfaceC48669b;

/* compiled from: RatingDetailsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/details/mvi/T;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lcom/avito/android/rating/details/mvi/entity/b;", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class T implements com.avito.android.arch.mvi.u<RatingDetailsInternalAction, com.avito.android.rating.details.mvi.entity.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating.details.converter.g f247265b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating.details.converter.q f247266c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48669b f247267d;

    /* compiled from: RatingDetailsReducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating/details/mvi/T$a;", "", "<init>", "()V", "", "SKELETON_ITEM_ID", "Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public T(@Y61.k com.avito.android.rating.details.converter.g gVar, @Y61.k com.avito.android.rating.details.converter.q qVar, @Y61.k InterfaceC48669b interfaceC48669b) {
        this.f247265b = gVar;
        this.f247266c = qVar;
        this.f247267d = interfaceC48669b;
    }

    public static void b(ArrayList arrayList, Integer num, com.avito.conveyor_item.a aVar) {
        if (aVar == null || !new kotlin.ranges.l(0, arrayList.size(), 1).h(num.intValue())) {
            return;
        }
        arrayList.set(num.intValue(), aVar);
    }

    public static ArrayList d(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((com.avito.conveyor_item.a) obj) instanceof RatingLoadingItem)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0326  */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.lang.Object] */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.rating.details.mvi.entity.b a(com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction r44, com.avito.android.rating.details.mvi.entity.b r45) {
        /*
            Method dump skipped, instructions count: 1918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.mvi.T.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final void c(List<? extends com.avito.conveyor_item.a> list) {
        List<? extends com.avito.conveyor_item.a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        for (com.avito.conveyor_item.a aVar : list2) {
            List listU = C42745f0.U(BaseRatingReviewItem.ReviewStatus.f250324c, BaseRatingReviewItem.ReviewStatus.f250323b);
            RatingDetailsReviewItem ratingDetailsReviewItem = aVar instanceof RatingDetailsReviewItem ? (RatingDetailsReviewItem) aVar : null;
            if (!C42745f0.r(listU, ratingDetailsReviewItem != null ? ratingDetailsReviewItem.f246519D : null)) {
                List listU2 = C42745f0.U(ReviewStatus.f250166c, ReviewStatus.f250165b);
                RatingModelReviewItem ratingModelReviewItem = aVar instanceof RatingModelReviewItem ? (RatingModelReviewItem) aVar : null;
                if (C42745f0.r(listU2, ratingModelReviewItem != null ? ratingModelReviewItem.f250150f : null)) {
                }
            }
            this.f247267d.c();
            return;
        }
    }
}
