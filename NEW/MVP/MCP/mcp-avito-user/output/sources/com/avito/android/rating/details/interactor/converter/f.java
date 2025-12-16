package com.avito.android.rating.details.interactor.converter;

import Ig0.C14104a;
import Ig0.C14105b;
import Ig0.C14106c;
import Ig0.C14107d;
import Ig0.i;
import Ig0.j;
import Ig0.l;
import Ig0.m;
import Ig0.o;
import Y61.k;
import android.net.Uri;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.AnswerEntityV2;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.a;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.b;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.c;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.d;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.e;
import com.avito.android.rating.generated.api.api_9_profile_reviews_get.f;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.rating_details_mvi.BuyerReviewEntry;
import com.avito.android.remote.model.rating_details_mvi.ModelReviewEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsEmptyState;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import com.avito.android.remote.model.rating_details_mvi.TextSection;
import com.avito.android.remote.model.text.AttributedText;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ProfileReviewsConverter.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/interactor/converter/f;", "Lcom/avito/android/rating/details/interactor/converter/e;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {

    /* compiled from: ProfileReviewsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ModelReviewEntry.ReviewStatus> f247031a = kotlin.enums.c.a(ModelReviewEntry.ReviewStatus.values());

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ReviewEntry.Action.ButtonType> f247032b = kotlin.enums.c.a(ReviewEntry.Action.ButtonType.values());
    }

    @Inject
    public f() {
    }

    public static TnsGalleryImage b(o oVar) {
        return new TnsGalleryImage(oVar.getImage(), (oVar.getOriginalSize().getWidth() == null || oVar.getOriginalSize().getHeight() == null) ? null : new Size((int) oVar.getOriginalSize().getWidth().longValue(), (int) oVar.getOriginalSize().getHeight().longValue()));
    }

    public static ReviewEntry.Answer c(AnswerEntityV2 answerEntityV2) {
        ArrayList arrayList;
        long answerId = answerEntityV2.getAnswerId();
        String title = answerEntityV2.getTitle();
        String answered = answerEntityV2.getAnswered();
        Image api = answerEntityV2.getAvatar() instanceof a.C7428a ? ((a.C7428a) answerEntityV2.getAvatar()).getApi() : null;
        String text = answerEntityV2.getText();
        DeepLink link = answerEntityV2.getLink();
        List<o> listD = answerEntityV2.d();
        if (listD != null) {
            List<o> list = listD;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b((o) it.next()));
            }
        } else {
            arrayList = null;
        }
        Boolean bool = Boolean.FALSE;
        AnswerEntityV2.Status status = answerEntityV2.getStatus();
        return new ReviewEntry.Answer(answerId, title, null, answered, api, text, link, arrayList, bool, status != null ? status.f247596b : null, answerEntityV2.getStatusText(), answerEntityV2.getRejectMessage());
    }

    public static ReviewEntry.Action d(f fVar, String str, ReviewEntry.Action.ActionType actionType, String str2, Map map, DeepLink deepLink, C14104a c14104a, int i12) {
        ReviewEntry.Action.ActionValue.ActionValueParams actionValueParams;
        Object next;
        ReviewEntry.Action.ActionValue.ActionValueParams actionValueParams2;
        String string;
        String string2;
        String string3;
        ReviewEntry.Action.ConfirmationDialog confirmationDialog = null;
        String str3 = (i12 & 4) != 0 ? null : str2;
        Map map2 = (i12 & 8) != 0 ? null : map;
        DeepLink deepLink2 = (i12 & 16) != 0 ? null : deepLink;
        C14104a c14104a2 = (i12 & 32) != 0 ? null : c14104a;
        fVar.getClass();
        if (map2 != null) {
            if (map2.isEmpty()) {
                map2 = null;
            }
            if (map2 != null) {
                Object obj = map2.get("reviewId");
                Integer numY0 = (obj == null || (string3 = obj.toString()) == null) ? null : C43066x.y0(string3);
                Object obj2 = map2.get("typeId");
                Integer numY02 = (obj2 == null || (string2 = obj2.toString()) == null) ? null : C43066x.y0(string2);
                Object obj3 = map2.get("appealType");
                Integer numY03 = (obj3 == null || (string = obj3.toString()) == null) ? null : C43066x.y0(string);
                Object obj4 = map2.get("text");
                actionValueParams2 = new ReviewEntry.Action.ActionValue.ActionValueParams(numY0, numY02, numY03, obj4 != null ? obj4.toString() : null);
            } else {
                actionValueParams2 = null;
            }
            actionValueParams = actionValueParams2;
        } else {
            actionValueParams = null;
        }
        if (c14104a2 != null) {
            String title = c14104a2.getTitle();
            String text = c14104a2.getText();
            List<C14105b> listA = c14104a2.a();
            ArrayList arrayList = new ArrayList();
            for (C14105b c14105b : listA) {
                Iterator it = ((AbstractC42738c) a.f247032b).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (C43066x.C(((ReviewEntry.Action.ButtonType) next).name(), c14105b.getType(), true)) {
                        break;
                    }
                }
                ReviewEntry.Action.ButtonType buttonType = (ReviewEntry.Action.ButtonType) next;
                ReviewEntry.Action.Button button = buttonType != null ? new ReviewEntry.Action.Button(c14105b.getText(), buttonType) : null;
                if (button != null) {
                    arrayList.add(button);
                }
            }
            confirmationDialog = new ReviewEntry.Action.ConfirmationDialog(title, text, arrayList);
        }
        return new ReviewEntry.Action(actionType, new ReviewEntry.Action.ActionValue(str, null, str3, actionValueParams, null, null, null, null, null, deepLink2, null, confirmationDialog, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.rating.details.interactor.converter.e
    @k
    public final TypedResult<RatingDetailsResult> a(@k TypedResult<C14106c> typedResult) {
        RatingDetailsEmptyState ratingDetailsEmptyState;
        C14106c c14106c;
        Iterator it;
        ArrayList arrayList;
        Parcelable buyerReviewEntry;
        ArrayList arrayList2;
        String str;
        String str2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Object objD;
        Object next;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        C14106c c14106c2;
        Iterator it2;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ModelReviewEntry.Action action;
        String string;
        ArrayList arrayList12;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ReviewEntry.Action actionD;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        C14106c c14106c3 = (C14106c) ((TypedResult.Success) typedResult).getResult();
        List<com.avito.android.rating.generated.api.api_9_profile_reviews_get.b> listB = c14106c3.b();
        ArrayList arrayList15 = new ArrayList();
        Iterator it3 = listB.iterator();
        while (it3.hasNext()) {
            com.avito.android.rating.generated.api.api_9_profile_reviews_get.b bVar = (com.avito.android.rating.generated.api.api_9_profile_reviews_get.b) it3.next();
            if (bVar instanceof b.c) {
                Ig0.k seller = ((b.c) bVar).getSeller();
                Long id2 = seller.getId();
                String title = seller.getTitle();
                Double score = seller.getScore();
                Float fValueOf = score != null ? Float.valueOf((float) score.doubleValue()) : null;
                String rated = seller.getRated();
                Image api = seller.getAvatar() instanceof d.a ? ((d.a) seller.getAvatar()).getApi() : null;
                String stageTitle = seller.getStageTitle();
                String itemTitle = seller.getItemTitle();
                String deliveryTitle = seller.getDeliveryTitle();
                String status = seller.getStatus();
                String statusText = seller.getStatusText();
                AttributedText attributedStatusText = seller.getAttributedStatusText();
                String rejectMessage = seller.getRejectMessage();
                AnswerEntityV2 answer = seller.getAnswer();
                ReviewEntry.Answer answerC = answer != null ? c(answer) : null;
                List<o> listH = seller.h();
                if (listH != null) {
                    List<o> list = listH;
                    ArrayList arrayList16 = new ArrayList(C42745f0.q(list, 10));
                    Iterator<T> it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList16.add(b((o) it4.next()));
                    }
                    arrayList12 = arrayList16;
                } else {
                    arrayList12 = null;
                }
                List<m> listR = seller.r();
                if (listR != null) {
                    List<m> list2 = listR;
                    ArrayList arrayList17 = new ArrayList(C42745f0.q(list2, 10));
                    for (m mVar : list2) {
                        arrayList17.add(new TextSection(mVar.getTitle(), mVar.getText(), null));
                    }
                    arrayList13 = arrayList17;
                } else {
                    arrayList13 = null;
                }
                List<com.avito.android.rating.generated.api.api_9_profile_reviews_get.f> listA = seller.a();
                if (listA != null) {
                    ArrayList arrayList18 = new ArrayList();
                    for (com.avito.android.rating.generated.api.api_9_profile_reviews_get.f fVar : listA) {
                        if (fVar instanceof f.i) {
                            f.i iVar = (f.i) fVar;
                            actionD = d(this, iVar.getTitle(), ReviewEntry.Action.ActionType.REMOVE_REVIEW, null, null, null, iVar.getConfirmDialog(), 28);
                        } else if (fVar instanceof f.d) {
                            f.d dVar = (f.d) fVar;
                            actionD = d(this, dVar.getTitle(), ReviewEntry.Action.ActionType.LINK, null, null, dVar.getLink(), null, 44);
                        } else if (fVar instanceof f.e) {
                            f.e eVar = (f.e) fVar;
                            actionD = d(this, eVar.getTitle(), ReviewEntry.Action.ActionType.NETWORK_REQUEST, eVar.getUrlPath(), eVar.a(), null, null, 48);
                        } else {
                            if (!(fVar instanceof f.h ? true : fVar instanceof f.g ? true : fVar instanceof f.a ? true : fVar instanceof f.C7430f ? true : fVar instanceof f.b ? true : fVar instanceof f.j ? true : fVar instanceof f.c ? true : fVar instanceof f.k ? true : L.f(fVar, f.l.f247611a))) {
                                throw new NoWhenBranchMatchedException();
                            }
                            actionD = null;
                        }
                        if (actionD != null) {
                            arrayList18.add(actionD);
                        }
                    }
                    arrayList14 = arrayList18;
                } else {
                    arrayList14 = null;
                }
                buyerReviewEntry = new ReviewEntry(id2, title, null, fValueOf, rated, api, stageTitle, itemTitle, deliveryTitle, status, statusText, attributedStatusText, rejectMessage, answerC, arrayList12, arrayList13, arrayList14, null);
                c14106c = c14106c3;
                it = it3;
                arrayList = arrayList15;
            } else if (bVar instanceof b.C7429b) {
                b.C7429b c7429b = (b.C7429b) bVar;
                Long id3 = c7429b.getId();
                String reviewTitle = c7429b.getReviewTitle();
                String scoreDescription = c7429b.getScoreDescription();
                Iterator it5 = ((AbstractC42738c) a.f247031a).iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it5.next();
                    if (L.f(((ModelReviewEntry.ReviewStatus) next).toString(), c7429b.getStatus())) {
                        break;
                    }
                }
                ModelReviewEntry.ReviewStatus reviewStatus = (ModelReviewEntry.ReviewStatus) next;
                Double score2 = c7429b.getScore();
                Float fValueOf2 = score2 != null ? Float.valueOf((float) score2.doubleValue()) : null;
                String rated2 = c7429b.getRated();
                i author = c7429b.getAuthor();
                ModelReviewEntry.Author author2 = author != null ? new ModelReviewEntry.Author(author.getTitle(), author.getAvatar() instanceof c.a ? ((c.a) author.getAvatar()).getApi() : null) : null;
                String modelTitle = c7429b.getModelTitle();
                List<j> listN = c7429b.n();
                if (listN != null) {
                    List<j> list3 = listN;
                    arrayList6 = new ArrayList(C42745f0.q(list3, 10));
                    for (j jVar : list3) {
                        arrayList6.add(new TextSection(jVar.getTitle(), jVar.getText(), null));
                        it3 = it3;
                    }
                    it = it3;
                } else {
                    it = it3;
                    arrayList6 = null;
                }
                List<com.avito.android.rating.generated.api.api_9_profile_reviews_get.f> listA2 = c7429b.a();
                if (listA2 != null) {
                    arrayList8 = new ArrayList();
                    Iterator it6 = listA2.iterator();
                    while (it6.hasNext()) {
                        com.avito.android.rating.generated.api.api_9_profile_reviews_get.f fVar2 = (com.avito.android.rating.generated.api.api_9_profile_reviews_get.f) it6.next();
                        if (fVar2 instanceof f.h) {
                            f.h hVar = (f.h) fVar2;
                            ModelReviewEntry.ActionType actionType = ModelReviewEntry.ActionType.REMOVE_MODEL_REVIEW;
                            it2 = it6;
                            String title2 = hVar.getTitle();
                            c14106c2 = c14106c3;
                            arrayList10 = arrayList15;
                            arrayList11 = arrayList6;
                            Object obj = hVar.a().get("reviewId");
                            action = new ModelReviewEntry.Action(actionType, new ModelReviewEntry.ActionValue(title2, hVar.getRequestUrl(), new ModelReviewEntry.ActionParams((obj == null || (string = obj.toString()) == null) ? null : C43066x.y0(string))));
                        } else {
                            c14106c2 = c14106c3;
                            it2 = it6;
                            arrayList10 = arrayList15;
                            arrayList11 = arrayList6;
                            if (!(fVar2 instanceof f.i ? true : fVar2 instanceof f.g ? true : fVar2 instanceof f.d ? true : fVar2 instanceof f.e ? true : fVar2 instanceof f.a ? true : fVar2 instanceof f.C7430f ? true : fVar2 instanceof f.b ? true : fVar2 instanceof f.j ? true : fVar2 instanceof f.c ? true : fVar2 instanceof f.k ? true : L.f(fVar2, f.l.f247611a))) {
                                throw new NoWhenBranchMatchedException();
                            }
                            action = null;
                        }
                        if (action != null) {
                            arrayList8.add(action);
                        }
                        it6 = it2;
                        arrayList6 = arrayList11;
                        c14106c3 = c14106c2;
                        arrayList15 = arrayList10;
                    }
                    c14106c = c14106c3;
                    arrayList = arrayList15;
                    arrayList7 = arrayList6;
                } else {
                    c14106c = c14106c3;
                    arrayList = arrayList15;
                    arrayList7 = arrayList6;
                    arrayList8 = null;
                }
                String statusText2 = c7429b.getStatusText();
                List<o> listE = c7429b.e();
                if (listE != null) {
                    List<o> list4 = listE;
                    arrayList9 = new ArrayList(C42745f0.q(list4, 10));
                    Iterator<T> it7 = list4.iterator();
                    while (it7.hasNext()) {
                        arrayList9.add(b((o) it7.next()));
                    }
                } else {
                    arrayList9 = null;
                }
                String rejectMessage2 = c7429b.getRejectMessage();
                AnswerEntityV2 answer2 = c7429b.getAnswer();
                buyerReviewEntry = new ModelReviewEntry(id3, reviewTitle, scoreDescription, reviewStatus, fValueOf2, rated2, author2, modelTitle, arrayList7, arrayList8, statusText2, arrayList9, rejectMessage2, answer2 != null ? c(answer2) : null);
            } else {
                c14106c = c14106c3;
                it = it3;
                arrayList = arrayList15;
                if (bVar instanceof b.a) {
                    Ig0.k buyer = ((b.a) bVar).getBuyer();
                    Long id4 = buyer.getId();
                    String createdAt = buyer.getCreatedAt();
                    String status2 = buyer.getStatus();
                    String statusText3 = buyer.getStatusText();
                    String rejectMessage3 = buyer.getRejectMessage();
                    l recipient = buyer.getRecipient();
                    BuyerReviewEntry.Recipient recipient2 = recipient != null ? new BuyerReviewEntry.Recipient(recipient.getTitle(), recipient.getAvatar() instanceof e.a ? ((e.a) recipient.getAvatar()).getApi() : null) : null;
                    List<o> listH2 = buyer.h();
                    if (listH2 != null) {
                        List<o> list5 = listH2;
                        arrayList2 = new ArrayList(C42745f0.q(list5, 10));
                        Iterator<T> it8 = list5.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(b((o) it8.next()));
                        }
                    } else {
                        arrayList2 = null;
                    }
                    String reviewSubtitle = buyer.getReviewSubtitle();
                    AttributedText attributedStatusText2 = buyer.getAttributedStatusText();
                    Double score3 = buyer.getScore();
                    Float fValueOf3 = score3 != null ? Float.valueOf((float) score3.doubleValue()) : null;
                    String itemTitle2 = buyer.getItemTitle();
                    String stageTitle2 = buyer.getStageTitle();
                    List<m> listR2 = buyer.r();
                    if (listR2 != null) {
                        List<m> list6 = listR2;
                        arrayList4 = new ArrayList(C42745f0.q(list6, 10));
                        Iterator it9 = list6.iterator();
                        while (it9.hasNext()) {
                            m mVar2 = (m) it9.next();
                            arrayList4.add(new TextSection(mVar2.getTitle(), mVar2.getText(), null));
                            it9 = it9;
                            stageTitle2 = stageTitle2;
                            itemTitle2 = itemTitle2;
                        }
                        str = itemTitle2;
                        str2 = stageTitle2;
                        arrayList3 = null;
                    } else {
                        str = itemTitle2;
                        str2 = stageTitle2;
                        arrayList3 = null;
                        arrayList4 = null;
                    }
                    List<com.avito.android.rating.generated.api.api_9_profile_reviews_get.f> listA3 = buyer.a();
                    if (listA3 != null) {
                        ArrayList arrayList19 = new ArrayList();
                        for (com.avito.android.rating.generated.api.api_9_profile_reviews_get.f fVar3 : listA3) {
                            if (fVar3 instanceof f.g) {
                                f.g gVar = (f.g) fVar3;
                                objD = d(this, gVar.getTitle(), ReviewEntry.Action.ActionType.REMOVE_BUYER_REVIEW, null, gVar.b(), null, gVar.getConfirmDialog(), 20);
                            } else if (fVar3 instanceof f.e) {
                                f.e eVar2 = (f.e) fVar3;
                                objD = d(this, eVar2.getTitle(), ReviewEntry.Action.ActionType.NETWORK_REQUEST, eVar2.getUrlPath(), eVar2.a(), null, null, 48);
                            } else {
                                if (!(fVar3 instanceof f.i ? true : fVar3 instanceof f.h ? true : fVar3 instanceof f.a ? true : fVar3 instanceof f.C7430f ? true : fVar3 instanceof f.d ? true : fVar3 instanceof f.b ? true : fVar3 instanceof f.j ? true : fVar3 instanceof f.c ? true : fVar3 instanceof f.k ? true : L.f(fVar3, f.l.f247611a))) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                objD = arrayList3;
                            }
                            if (objD != null) {
                                arrayList19.add(objD);
                            }
                        }
                        arrayList5 = arrayList19;
                    } else {
                        arrayList5 = arrayList3;
                    }
                    buyerReviewEntry = new BuyerReviewEntry(id4, createdAt, status2, statusText3, rejectMessage3, recipient2, arrayList2, reviewSubtitle, attributedStatusText2, fValueOf3, str, str2, arrayList4, arrayList5);
                } else {
                    if (!(bVar instanceof b.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    buyerReviewEntry = null;
                }
            }
            ArrayList arrayList20 = arrayList;
            if (buyerReviewEntry != null) {
                arrayList20.add(buyerReviewEntry);
            }
            arrayList15 = arrayList20;
            it3 = it;
            c14106c3 = c14106c;
        }
        C14106c c14106c4 = c14106c3;
        ArrayList arrayList21 = arrayList15;
        String nextPage = c14106c4.getNextPage();
        Uri uri = nextPage != null ? Uri.parse(nextPage) : null;
        C14107d emptyState = c14106c4.getEmptyState();
        if (emptyState != null) {
            String title3 = emptyState.getTitle();
            String text = emptyState.getText();
            Ig0.e button = emptyState.getButton();
            ratingDetailsEmptyState = new RatingDetailsEmptyState(title3, text, button != null ? new RatingDetailsEmptyState.RatingDetailsEmptyStateButton(button.getTitle(), button.getUri()) : null);
        } else {
            ratingDetailsEmptyState = null;
        }
        return new TypedResult.Success(new RatingDetailsResult(arrayList21, uri, null, ratingDetailsEmptyState, null, null));
    }
}
