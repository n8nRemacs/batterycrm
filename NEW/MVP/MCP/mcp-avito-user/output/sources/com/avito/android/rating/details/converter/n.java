package com.avito.android.rating.details.converter;

import com.avito.android.di.InterfaceC30272y;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.reviews.model_review.Author;
import com.avito.android.rating_ui.reviews.model_review.ModelAction;
import com.avito.android.rating_ui.reviews.model_review.ModelActionParams;
import com.avito.android.rating_ui.reviews.model_review.ModelActionType;
import com.avito.android.rating_ui.reviews.model_review.ModelActionValue;
import com.avito.android.rating_ui.reviews.model_review.RatingModelReviewItem;
import com.avito.android.rating_ui.reviews.model_review.ReviewStatus;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.rating_details_mvi.ModelReviewEntry;
import com.avito.android.remote.model.rating_details_mvi.TextSection;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RatingDetailsModelReviewConverter.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/converter/n;", "Lcom/avito/android/rating/details/converter/m;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes16.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f246940a;

    /* compiled from: RatingDetailsModelReviewConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f246941a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f246942b;

        static {
            int[] iArr = new int[ModelReviewEntry.ReviewStatus.values().length];
            try {
                iArr[ModelReviewEntry.ReviewStatus.PUBLISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModelReviewEntry.ReviewStatus.DECLINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ModelReviewEntry.ReviewStatus.MODERATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ModelReviewEntry.ReviewStatus.APPROVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f246941a = iArr;
            int[] iArr2 = new int[ModelReviewEntry.ActionType.values().length];
            try {
                iArr2[ModelReviewEntry.ActionType.REMOVE_MODEL_REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            f246942b = iArr2;
        }
    }

    @Inject
    public n(@Y61.k u uVar) {
        this.f246940a = uVar;
    }

    @Override // com.avito.android.rating.details.converter.m
    @Y61.k
    public final RatingModelReviewItem a(@Y61.k ModelReviewEntry modelReviewEntry, boolean z12, @Y61.k RatingItemsMarginHorizontal.MarginNormal marginNormal) {
        ReviewStatus reviewStatus;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str = "model-review:" + modelReviewEntry.getReviewId();
        Long reviewId = modelReviewEntry.getReviewId();
        String scoreDescription = modelReviewEntry.getScoreDescription();
        Float score = modelReviewEntry.getScore();
        String rated = modelReviewEntry.getRated();
        ModelReviewEntry.ReviewStatus status = modelReviewEntry.getStatus();
        int i12 = 1;
        if (status != null) {
            int i13 = a.f246941a[status.ordinal()];
            reviewStatus = i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? ReviewStatus.f250165b : ReviewStatus.f250169f : ReviewStatus.f250168e : ReviewStatus.f250167d : ReviewStatus.f250166c;
        } else {
            reviewStatus = null;
        }
        String modelTitle = modelReviewEntry.getModelTitle();
        String title = modelReviewEntry.getTitle();
        ModelReviewEntry.Author author = modelReviewEntry.getAuthor();
        Author author2 = author != null ? new Author(author.getTitle(), author.getAvatar()) : null;
        List<TextSection> textSections = modelReviewEntry.getTextSections();
        if (textSections != null) {
            List<TextSection> list = textSections;
            ArrayList arrayList4 = new ArrayList(C42745f0.q(list, 10));
            for (TextSection textSection : list) {
                arrayList4.add(new BaseRatingReviewItem.ReviewTextSection(textSection.getTitle(), textSection.getText(), null, false, 4, null));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        List<ModelReviewEntry.Action> actions = modelReviewEntry.getActions();
        if (actions != null) {
            List<ModelReviewEntry.Action> list2 = actions;
            ArrayList arrayList5 = new ArrayList(C42745f0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ModelReviewEntry.Action action = (ModelReviewEntry.Action) it.next();
                arrayList5.add(new ModelAction(a.f246942b[action.getType().ordinal()] == i12 ? ModelActionType.f250140b : null, new ModelActionValue(action.getValue().getTitle(), new ModelActionParams(action.getValue().getParams().getReviewId()), action.getValue().getRequestUrl())));
                arrayList = arrayList;
                it = it;
                i12 = 1;
            }
            arrayList2 = arrayList;
            arrayList3 = arrayList5;
        } else {
            arrayList2 = arrayList;
            arrayList3 = null;
        }
        return new RatingModelReviewItem(str, reviewId, scoreDescription, rated, reviewStatus, score, modelTitle, title, author2, arrayList2, false, modelReviewEntry.getImages(), null, arrayList3, this.f246940a.a(modelReviewEntry.getAnswer(), null), modelReviewEntry.getStatusText(), modelReviewEntry.getRejectMessage(), marginNormal, z12, 5120, null);
    }
}
