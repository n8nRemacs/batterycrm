package com.avito.android.travel_guest_profile.mvi;

import PE0.c;
import QE0.e;
import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.R;
import com.avito.android.arch.mvi.utils.c;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.info_with_hint.RatingInfoWithHintItem;
import com.avito.android.rating_ui.loading.RatingLoadingItem;
import com.avito.android.rating_ui.rating_stat.RatingStatEntry;
import com.avito.android.rating_ui.reviews.model_review.Author;
import com.avito.android.rating_ui.reviews.model_review.ModelAction;
import com.avito.android.rating_ui.reviews.model_review.ModelActionParams;
import com.avito.android.rating_ui.reviews.model_review.ModelActionType;
import com.avito.android.rating_ui.reviews.model_review.ModelActionValue;
import com.avito.android.rating_ui.reviews.model_review.RatingModelReviewItem;
import com.avito.android.rating_ui.reviews.model_review.ReviewStatus;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.rating_ui.score_with_statistic.RatingScoreWithStatisticItem;
import com.avito.android.rating_ui.sort.a;
import com.avito.android.rating_ui.statistic.RatingStatisticRow;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.rating_details_mvi.ActionEntry;
import com.avito.android.remote.model.rating_details_mvi.BadgeScoreEntry;
import com.avito.android.remote.model.rating_details_mvi.ButtonEntry;
import com.avito.android.remote.model.rating_details_mvi.BuyerReviewEntry;
import com.avito.android.remote.model.rating_details_mvi.InfoEntry;
import com.avito.android.remote.model.rating_details_mvi.ModelReviewEntry;
import com.avito.android.remote.model.rating_details_mvi.OldSearchParametersEntry;
import com.avito.android.remote.model.rating_details_mvi.PhotoGalleryEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingAspectsEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult;
import com.avito.android.remote.model.rating_details_mvi.RatingLLMSummaryEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingStatisticEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingStatisticWithScoreEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingSummaryEntry;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import com.avito.android.remote.model.rating_details_mvi.TextEntry;
import com.avito.android.remote.model.rating_details_mvi.TextSection;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.travel_guest_profile.domain.converters.k;
import com.avito.android.travel_guest_profile.domain.converters.o;
import com.avito.android.travel_guest_profile.items.review.TravelGuestProfileReviewItem;
import com.avito.android.util.P2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TravelGuestProfileViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_guest_profile/mvi/l;", "", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_guest_profile.domain.b f302199a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_guest_profile.domain.converters.a f302200b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_guest_profile.domain.converters.i f302201c;

    @Inject
    public l(@Y61.k com.avito.android.travel_guest_profile.domain.b bVar, @Y61.k com.avito.android.travel_guest_profile.domain.converters.a aVar, @Y61.k com.avito.android.travel_guest_profile.domain.converters.i iVar) {
        this.f302199a = bVar;
        this.f302200b = aVar;
        this.f302201c = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final QE0.d a(@Y61.k QE0.d dVar) {
        QE0.e bVar;
        Iterable iterableSingletonList;
        Iterator it;
        a.AbstractC7507a.b bVar2;
        Object obj;
        long j12;
        RatingInfoWithHintItem.Hint hint;
        Integer numQ;
        ArrayList arrayList;
        ReviewStatus reviewStatus;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Q q12;
        ArrayList arrayList4;
        ArrayList arrayList5;
        com.avito.conveyor_item.a dVar2;
        P2<OE0.b> p22 = dVar.f13626f;
        if (p22 instanceof P2.c) {
            bVar = e.c.f13634a;
        } else {
            boolean z12 = p22 instanceof P2.b;
            com.avito.android.travel_guest_profile.domain.b bVar3 = this.f302199a;
            if (z12) {
                List<OE0.a> list = ((OE0.b) ((P2.b) p22).f318720a).f12098a;
                ArrayList arrayList6 = new ArrayList();
                for (OE0.a aVar : list) {
                    this.f302200b.getClass();
                    if (aVar instanceof PE0.h) {
                        PE0.h hVar = (PE0.h) aVar;
                        dVar2 = new com.avito.android.travel_guest_profile.items.profile_header.a(hVar.f12901a, hVar.f12902b, hVar.f12903c, hVar.f12904d, hVar.f12905e, hVar.f12906f, hVar.f12907g);
                    } else if (aVar instanceof PE0.d) {
                        PE0.d dVar3 = (PE0.d) aVar;
                        dVar2 = new com.avito.android.travel_guest_profile.items.extended_plan.a(dVar3.f12887a, dVar3.f12888b, dVar3.f12889c, dVar3.f12890d);
                    } else if (aVar instanceof PE0.i) {
                        PE0.i iVar = (PE0.i) aVar;
                        dVar2 = new com.avito.android.travel_guest_profile.items.statistics_item.a(iVar.f12908a, iVar.f12909b);
                    } else if (aVar instanceof PE0.a) {
                        StringBuilder sb2 = new StringBuilder("EmptyState");
                        PE0.a aVar2 = (PE0.a) aVar;
                        AttributedText attributedText = aVar2.f12880b;
                        sb2.append(attributedText);
                        String string = sb2.toString();
                        com.avito.android.arch.mvi.utils.c.f92026a.getClass();
                        c.b bVar4 = new c.b(attributedText);
                        PE0.b bVar5 = aVar2.f12882d;
                        dVar2 = new com.avito.android.travel_guest_profile.items.empty_state_banner.d(string, aVar2.f12879a, bVar4, aVar2.f12881c, bVar5 != null ? new com.avito.android.travel_guest_profile.items.empty_state_banner.a(com.avito.android.printable_text.b.f(bVar5.f12883a), bVar5.f12884b) : null);
                    } else {
                        dVar2 = null;
                    }
                    if (dVar2 != null) {
                        arrayList6.add(dVar2);
                    }
                }
                List<RatingDetailsEntry> list2 = dVar.f13629i;
                boolean zIsEmpty = list2.isEmpty();
                P2<RatingDetailsResult> p23 = dVar.f13627g;
                if ((p23 instanceof P2.c) && zIsEmpty) {
                    iterableSingletonList = Collections.singletonList(new com.avito.android.travel_guest_profile.items.spinner.a());
                } else if ((p23 instanceof P2.a) && zIsEmpty) {
                    c.a aVar3 = com.avito.android.arch.mvi.utils.c.f92026a;
                    PrintableText printableText = bVar3.f301935c;
                    aVar3.getClass();
                    iterableSingletonList = Collections.singletonList(new com.avito.android.travel_guest_profile.items.empty_state_banner.d("ReviewsEmptyStateBannerItem", null, new c.C2712c(printableText), null, new com.avito.android.travel_guest_profile.items.empty_state_banner.a(bVar3.f301936d, c.b.f12886a)));
                } else if ((p23 instanceof P2.b) || !zIsEmpty) {
                    com.avito.android.travel_guest_profile.domain.converters.i iVar2 = this.f302201c;
                    iVar2.getClass();
                    ArrayList arrayList7 = new ArrayList();
                    long size = arrayList7.size();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        RatingDetailsEntry ratingDetailsEntry = (RatingDetailsEntry) it2.next();
                        if (ratingDetailsEntry instanceof RatingStatisticWithScoreEntry) {
                            RatingStatisticWithScoreEntry ratingStatisticWithScoreEntry = (RatingStatisticWithScoreEntry) ratingDetailsEntry;
                            j12 = 1 + size;
                            RatingItemsMarginHorizontal.MarginNormal marginNormal = RatingItemsMarginHorizontal.MarginNormal.f249854b;
                            String strA = C21030p.a(size, "score-with-statistic:");
                            Float score = ratingStatisticWithScoreEntry.getScore();
                            Float scoreFloat = ratingStatisticWithScoreEntry.getScoreFloat();
                            String title = ratingStatisticWithScoreEntry.getTitle();
                            String subtitle = ratingStatisticWithScoreEntry.getSubtitle();
                            Integer reviewCount = ratingStatisticWithScoreEntry.getReviewCount();
                            List<RatingStatisticWithScoreEntry.RatingStatistic> statistic = ratingStatisticWithScoreEntry.getStatistic();
                            if (statistic != null) {
                                List<RatingStatisticWithScoreEntry.RatingStatistic> list3 = statistic;
                                ArrayList arrayList8 = new ArrayList(C42745f0.q(list3, 10));
                                for (RatingStatisticWithScoreEntry.RatingStatistic ratingStatistic : list3) {
                                    arrayList8.add(new RatingStatEntry(ratingStatistic.getScore(), ratingStatisticWithScoreEntry.getReviewCount() != null ? ratingStatistic.getCount() / r15.intValue() : 0.0f, ratingStatistic.getTitle()));
                                }
                                arrayList5 = arrayList8;
                            } else {
                                arrayList5 = null;
                            }
                            arrayList7.add(new RatingScoreWithStatisticItem(strA, score, scoreFloat, title, subtitle, reviewCount, arrayList5, false, marginNormal, 128, null));
                            it = it2;
                        } else {
                            if (ratingDetailsEntry instanceof RatingStatisticEntry) {
                                RatingStatisticEntry ratingStatisticEntry = (RatingStatisticEntry) ratingDetailsEntry;
                                long j13 = 1 + size;
                                RatingItemsMarginHorizontal.MarginNormal marginNormal2 = RatingItemsMarginHorizontal.MarginNormal.f249854b;
                                String strA2 = C21030p.a(size, "statistic:");
                                int reviewCount2 = ratingStatisticEntry.getReviewCount();
                                List<RatingStatisticEntry.RatingStatistic> statistic2 = ratingStatisticEntry.getStatistic();
                                ArrayList arrayList9 = new ArrayList(C42745f0.q(statistic2, 10));
                                Iterator it3 = statistic2.iterator();
                                while (it3.hasNext()) {
                                    RatingStatisticEntry.RatingStatistic ratingStatistic2 = (RatingStatisticEntry.RatingStatistic) it3.next();
                                    arrayList9.add(new RatingStatisticRow(ratingStatistic2.getCount() / ratingStatisticEntry.getReviewCount(), ratingStatistic2.getTitle(), ratingStatistic2.getScore()));
                                    it2 = it2;
                                    it3 = it3;
                                    j13 = j13;
                                }
                                it = it2;
                                arrayList7.add(new com.avito.android.rating_ui.statistic.b(strA2, reviewCount2, arrayList9, marginNormal2));
                                size = j13;
                            } else {
                                it = it2;
                                if (ratingDetailsEntry instanceof ReviewEntry) {
                                    ReviewEntry reviewEntry = (ReviewEntry) ratingDetailsEntry;
                                    j12 = 1 + size;
                                    Long lValueOf = Long.valueOf(size);
                                    RatingItemsMarginHorizontal.MarginNormal marginNormal3 = RatingItemsMarginHorizontal.MarginNormal.f249854b;
                                    com.avito.android.travel_guest_profile.domain.converters.m mVar = iVar2.f301949a;
                                    mVar.getClass();
                                    List<ReviewEntry.Action> actions = reviewEntry.getActions();
                                    if (actions != null) {
                                        ArrayList arrayList10 = new ArrayList();
                                        ArrayList arrayList11 = new ArrayList();
                                        Iterator it4 = actions.iterator();
                                        while (it4.hasNext()) {
                                            Object next = it4.next();
                                            Iterator it5 = it4;
                                            if (((ReviewEntry.Action) next).getType() != ReviewEntry.Action.ActionType.REMOVE_ANSWER) {
                                                arrayList10.add(next);
                                            } else {
                                                arrayList11.add(next);
                                            }
                                            it4 = it5;
                                        }
                                        q12 = new Q(arrayList10, arrayList11);
                                    } else {
                                        q12 = new Q(null, null);
                                    }
                                    List list4 = (List) q12.f406619b;
                                    List list5 = (List) q12.f406620c;
                                    String str = "review:" + reviewEntry.getReviewId() + ':' + lValueOf;
                                    Long reviewId = reviewEntry.getReviewId();
                                    Image avatar = reviewEntry.getAvatar();
                                    String title2 = reviewEntry.getTitle();
                                    String rated = reviewEntry.getRated();
                                    String titleCaption = reviewEntry.getTitleCaption();
                                    String status = reviewEntry.getStatus();
                                    mVar.f301959a.getClass();
                                    BaseRatingReviewItem.ReviewStatus reviewStatusA = o.a(status);
                                    AttributedText attributedStatusText = reviewEntry.getAttributedStatusText();
                                    Float score2 = reviewEntry.getScore();
                                    String stageTitle = reviewEntry.getStageTitle();
                                    String itemTitle = reviewEntry.getItemTitle();
                                    String deliveryTitle = reviewEntry.getDeliveryTitle();
                                    List<TnsGalleryImage> images = reviewEntry.getImages();
                                    List<TextSection> textSections = reviewEntry.getTextSections();
                                    if (textSections != null) {
                                        List<TextSection> list6 = textSections;
                                        ArrayList arrayList12 = new ArrayList(C42745f0.q(list6, 10));
                                        for (TextSection textSection : list6) {
                                            arrayList12.add(new BaseRatingReviewItem.ReviewTextSection(textSection.getTitle(), textSection.getText(), null, false, 12, null));
                                        }
                                        arrayList4 = arrayList12;
                                    } else {
                                        arrayList4 = null;
                                    }
                                    ReviewEntry.Answer answer = reviewEntry.getAnswer();
                                    mVar.f301961c.getClass();
                                    ArrayList arrayListA = com.avito.android.travel_guest_profile.domain.converters.c.a(list5);
                                    mVar.f301960b.getClass();
                                    arrayList7.add(new TravelGuestProfileReviewItem(str, reviewId, avatar, title2, rated, titleCaption, reviewStatusA, null, attributedStatusText, score2, stageTitle, itemTitle, deliveryTitle, images, arrayList4, com.avito.android.travel_guest_profile.domain.converters.e.a(answer, arrayListA), com.avito.android.travel_guest_profile.domain.converters.c.a(list4), marginNormal3, false, false, false, reviewEntry.getAnalyticalParams(), 524288, null));
                                } else {
                                    int i12 = 1;
                                    if (ratingDetailsEntry instanceof ModelReviewEntry) {
                                        ModelReviewEntry modelReviewEntry = (ModelReviewEntry) ratingDetailsEntry;
                                        j12 = 1 + size;
                                        RatingItemsMarginHorizontal.MarginNormal marginNormal4 = RatingItemsMarginHorizontal.MarginNormal.f249854b;
                                        com.avito.android.travel_guest_profile.domain.converters.k kVar = iVar2.f301950b;
                                        kVar.getClass();
                                        String str2 = "model-review:" + modelReviewEntry.getReviewId() + ':' + size;
                                        Long reviewId2 = modelReviewEntry.getReviewId();
                                        String scoreDescription = modelReviewEntry.getScoreDescription();
                                        Float score3 = modelReviewEntry.getScore();
                                        String rated2 = modelReviewEntry.getRated();
                                        ModelReviewEntry.ReviewStatus status2 = modelReviewEntry.getStatus();
                                        if (status2 != null) {
                                            int i13 = k.a.f301956a[status2.ordinal()];
                                            reviewStatus = i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? ReviewStatus.f250165b : ReviewStatus.f250169f : ReviewStatus.f250168e : ReviewStatus.f250167d : ReviewStatus.f250166c;
                                        } else {
                                            reviewStatus = null;
                                        }
                                        String modelTitle = modelReviewEntry.getModelTitle();
                                        String title3 = modelReviewEntry.getTitle();
                                        ModelReviewEntry.Author author = modelReviewEntry.getAuthor();
                                        Author author2 = author != null ? new Author(author.getTitle(), author.getAvatar()) : null;
                                        List<TextSection> textSections2 = modelReviewEntry.getTextSections();
                                        if (textSections2 != null) {
                                            List<TextSection> list7 = textSections2;
                                            ArrayList arrayList13 = new ArrayList(C42745f0.q(list7, 10));
                                            for (TextSection textSection2 : list7) {
                                                arrayList13.add(new BaseRatingReviewItem.ReviewTextSection(textSection2.getTitle(), textSection2.getText(), null, false, 4, null));
                                            }
                                            arrayList2 = arrayList13;
                                        } else {
                                            arrayList2 = null;
                                        }
                                        List<ModelReviewEntry.Action> actions2 = modelReviewEntry.getActions();
                                        if (actions2 != null) {
                                            List<ModelReviewEntry.Action> list8 = actions2;
                                            ArrayList arrayList14 = new ArrayList(C42745f0.q(list8, 10));
                                            Iterator it6 = list8.iterator();
                                            while (it6.hasNext()) {
                                                ModelReviewEntry.Action action = (ModelReviewEntry.Action) it6.next();
                                                arrayList14.add(new ModelAction(k.a.f301957b[action.getType().ordinal()] == i12 ? ModelActionType.f250140b : null, new ModelActionValue(action.getValue().getTitle(), new ModelActionParams(action.getValue().getParams().getReviewId()), action.getValue().getRequestUrl())));
                                                it6 = it6;
                                                i12 = 1;
                                            }
                                            arrayList3 = arrayList14;
                                        } else {
                                            arrayList3 = null;
                                        }
                                        String statusText = modelReviewEntry.getStatusText();
                                        List<TnsGalleryImage> images2 = modelReviewEntry.getImages();
                                        String rejectMessage = modelReviewEntry.getRejectMessage();
                                        ReviewEntry.Answer answer2 = modelReviewEntry.getAnswer();
                                        kVar.f301955a.getClass();
                                        arrayList7.add(new RatingModelReviewItem(str2, reviewId2, scoreDescription, rated2, reviewStatus, score3, modelTitle, title3, author2, arrayList2, false, images2, null, arrayList3, com.avito.android.travel_guest_profile.domain.converters.e.a(answer2, null), statusText, rejectMessage, marginNormal4, false, 5120, null));
                                    } else if (ratingDetailsEntry instanceof BuyerReviewEntry) {
                                        BuyerReviewEntry buyerReviewEntry = (BuyerReviewEntry) ratingDetailsEntry;
                                        j12 = 1 + size;
                                        RatingItemsMarginHorizontal.MarginNormal marginNormal5 = RatingItemsMarginHorizontal.MarginNormal.f249854b;
                                        com.avito.android.travel_guest_profile.domain.converters.g gVar = iVar2.f301951c;
                                        gVar.getClass();
                                        String str3 = "review:" + buyerReviewEntry.getId() + ':' + size;
                                        Long id2 = buyerReviewEntry.getId();
                                        BuyerReviewEntry.Recipient recipient = buyerReviewEntry.getRecipient();
                                        Image avatar2 = recipient != null ? recipient.getAvatar() : null;
                                        BuyerReviewEntry.Recipient recipient2 = buyerReviewEntry.getRecipient();
                                        String title4 = recipient2 != null ? recipient2.getTitle() : null;
                                        String createdAt = buyerReviewEntry.getCreatedAt();
                                        String status3 = buyerReviewEntry.getStatus();
                                        gVar.f301944a.getClass();
                                        BaseRatingReviewItem.ReviewStatus reviewStatusA2 = o.a(status3);
                                        String rejectMessage2 = L.f(buyerReviewEntry.getStatus(), "declined") ? buyerReviewEntry.getRejectMessage() : buyerReviewEntry.getStatusText();
                                        AttributedText attributedStatusText2 = buyerReviewEntry.getAttributedStatusText();
                                        Float score4 = buyerReviewEntry.getScore();
                                        String stageTitle2 = buyerReviewEntry.getStageTitle();
                                        String itemTitle2 = buyerReviewEntry.getItemTitle();
                                        String reviewSubtitle = buyerReviewEntry.getReviewSubtitle();
                                        List<TnsGalleryImage> images3 = buyerReviewEntry.getImages();
                                        List<TextSection> textSections3 = buyerReviewEntry.getTextSections();
                                        if (textSections3 != null) {
                                            List<TextSection> list9 = textSections3;
                                            ArrayList arrayList15 = new ArrayList(C42745f0.q(list9, 10));
                                            for (TextSection textSection3 : list9) {
                                                arrayList15.add(new BaseRatingReviewItem.ReviewTextSection(textSection3.getTitle(), textSection3.getText(), null, false, 12, null));
                                            }
                                            arrayList = arrayList15;
                                        } else {
                                            arrayList = null;
                                        }
                                        List<ReviewEntry.Action> actions3 = buyerReviewEntry.getActions();
                                        gVar.f301945b.getClass();
                                        arrayList7.add(new TravelGuestProfileReviewItem(str3, id2, avatar2, title4, createdAt, null, reviewStatusA2, rejectMessage2, attributedStatusText2, score4, stageTitle2, itemTitle2, reviewSubtitle, images3, arrayList, null, com.avito.android.travel_guest_profile.domain.converters.c.a(actions3), marginNormal5, false, false, false, null, 786464, null));
                                    } else if (ratingDetailsEntry instanceof InfoEntry) {
                                        InfoEntry infoEntry = (InfoEntry) ratingDetailsEntry;
                                        j12 = 1 + size;
                                        RatingItemsMarginHorizontal.MarginNormal marginNormal6 = RatingItemsMarginHorizontal.MarginNormal.f249854b;
                                        String strA3 = C21030p.a(size, "info-with-hint:");
                                        String title5 = infoEntry.getTitle();
                                        String titleSize = infoEntry.getTitleSize();
                                        int iIntValue = (titleSize == null || (numQ = com.avito.android.lib.util.f.q(titleSize)) == null) ? R.attr.textH30 : numQ.intValue();
                                        String titleColor = infoEntry.getTitleColor();
                                        Integer numA = titleColor != null ? com.avito.android.lib.util.e.a(titleColor) : null;
                                        String subtitle2 = infoEntry.getSubtitle();
                                        String subtitleColor = infoEntry.getSubtitleColor();
                                        Integer numA2 = subtitleColor != null ? com.avito.android.lib.util.e.a(subtitleColor) : null;
                                        InfoEntry.InfoHint hint2 = infoEntry.getHint();
                                        if (hint2 != null) {
                                            String title6 = hint2.getTitle();
                                            String text = hint2.getText();
                                            Action action2 = hint2.getAction();
                                            String title7 = action2 != null ? action2.getTitle() : null;
                                            Action action3 = hint2.getAction();
                                            hint = new RatingInfoWithHintItem.Hint(title6, text, title7, action3 != null ? action3.getDeepLink() : null);
                                        } else {
                                            hint = null;
                                        }
                                        arrayList7.add(new RatingInfoWithHintItem(strA3, title5, iIntValue, numA, subtitle2, numA2, hint, null, null, marginNormal6));
                                    } else {
                                        if (!(ratingDetailsEntry instanceof OldSearchParametersEntry)) {
                                            if (ratingDetailsEntry instanceof SearchParametersEntry) {
                                                long j14 = 1 + size;
                                                String strA4 = C21030p.a(size, "sort:");
                                                List<SearchParametersEntry.SearchParametersBlock> blocks = ((SearchParametersEntry) ratingDetailsEntry).getBlocks();
                                                ArrayList arrayList16 = new ArrayList();
                                                for (SearchParametersEntry.SearchParametersBlock searchParametersBlock : blocks) {
                                                    if (searchParametersBlock instanceof SearchParametersEntry.SearchParametersBlock.Sort) {
                                                        SearchParametersEntry.SearchParametersBlock.Sort sort = (SearchParametersEntry.SearchParametersBlock.Sort) searchParametersBlock;
                                                        com.avito.android.travel_guest_profile.domain.converters.i.f301948d.getClass();
                                                        Iterator<T> it7 = sort.getOptions().iterator();
                                                        while (true) {
                                                            if (!it7.hasNext()) {
                                                                obj = null;
                                                                break;
                                                            }
                                                            Object next2 = it7.next();
                                                            if (L.f(((SearchParametersEntry.SearchParametersBlock.Sort.SortOption) next2).getValue(), sort.getSelectedOption())) {
                                                                obj = next2;
                                                                break;
                                                            }
                                                        }
                                                        SearchParametersEntry.SearchParametersBlock.Sort.SortOption sortOption = (SearchParametersEntry.SearchParametersBlock.Sort.SortOption) obj;
                                                        bVar2 = new a.AbstractC7507a.b(sortOption != null ? sortOption.getLabel() : null, sort.getParamName(), null, false);
                                                    } else {
                                                        if (!(searchParametersBlock instanceof SearchParametersEntry.SearchParametersBlock.InlineBoolFilter)) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        bVar2 = null;
                                                    }
                                                    if (bVar2 != null) {
                                                        arrayList16.add(bVar2);
                                                    }
                                                }
                                                arrayList7.add(new com.avito.android.rating_ui.sort.a(strA4, arrayList16, false));
                                                size = j14;
                                            } else if (!(ratingDetailsEntry instanceof RatingLLMSummaryEntry ? true : ratingDetailsEntry instanceof RatingAspectsEntry ? true : ratingDetailsEntry instanceof BadgeScoreEntry)) {
                                                if (!(ratingDetailsEntry instanceof PhotoGalleryEntry ? true : ratingDetailsEntry instanceof ActionEntry ? true : ratingDetailsEntry instanceof ButtonEntry ? true : ratingDetailsEntry instanceof TextEntry)) {
                                                    boolean z13 = ratingDetailsEntry instanceof RatingSummaryEntry;
                                                }
                                            }
                                        }
                                        it2 = it;
                                    }
                                }
                            }
                            it2 = it;
                        }
                        size = j12;
                        it2 = it;
                    }
                    if (!arrayList7.isEmpty() && dVar.f13628h != null) {
                        arrayList7.add(new RatingLoadingItem(String.valueOf(size)));
                    }
                    iterableSingletonList = arrayList7;
                } else {
                    iterableSingletonList = C42784z0.f406748b;
                }
                bVar = new e.a(C42745f0.h0(iterableSingletonList, arrayList6));
            } else {
                if (!(p22 instanceof P2.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new e.b(bVar3.f301933a, bVar3.f301934b);
            }
        }
        return QE0.d.a(dVar, null, null, null, null, null, null, null, null, bVar, 255);
    }
}
