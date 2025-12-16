package com.avito.android.rating.details.converter;

import android.net.Uri;
import androidx.compose.foundation.text.selection.C21030p;
import com.avito.android.R;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.rating.details.adapter.action.ActionItem;
import com.avito.android.rating.details.adapter.button.ButtonItem;
import com.avito.android.rating.details.adapter.summary.SummaryItem;
import com.avito.android.rating.details.adapter.text.TextItem;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.aspects.a;
import com.avito.android.rating_ui.info_with_hint.RatingInfoWithHintItem;
import com.avito.android.rating_ui.lmm_summary.BaseRatingLLMSummaryItem;
import com.avito.android.rating_ui.lmm_summary.RatingLLMSummaryItem;
import com.avito.android.rating_ui.loading.RatingLoadingItem;
import com.avito.android.rating_ui.rating_stat.RatingStatEntry;
import com.avito.android.rating_ui.score_with_statistic.RatingScoreWithStatisticItem;
import com.avito.android.rating_ui.sort.a;
import com.avito.android.rating_ui.statistic.RatingStatisticRow;
import com.avito.android.remote.model.Action;
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
import com.avito.android.remote.model.rating_details_mvi.RatingLLMSummaryEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingStatisticEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingStatisticWithScoreEntry;
import com.avito.android.remote.model.rating_details_mvi.RatingSummaryEntry;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import com.avito.android.remote.model.rating_details_mvi.TextEntry;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RatingDetailsConverter.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/converter/h;", "Lcom/avito/android/rating/details/converter/g;", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes16.dex */
public final class h implements g {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f246926f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final y f246927a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f246928b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34171c f246929c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final k f246930d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f246931e;

    /* compiled from: RatingDetailsConverter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/converter/h$a;", "", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingDetailsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f246932a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f246933b;

        static {
            int[] iArr = new int[InfoEntry.InfoHorizontalAlign.values().length];
            try {
                iArr[InfoEntry.InfoHorizontalAlign.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f246932a = iArr;
            int[] iArr2 = new int[RatingSummaryEntry.RatingSummaryScore.RatingSummaryScoreState.values().length];
            try {
                iArr2[RatingSummaryEntry.RatingSummaryScore.RatingSummaryScoreState.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[RatingSummaryEntry.RatingSummaryScore.RatingSummaryScoreState.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f246933b = iArr2;
        }
    }

    @Inject
    public h(@Y61.k y yVar, @Y61.k m mVar, @Y61.k InterfaceC34171c interfaceC34171c, @Y61.k k kVar, @com.avito.android.rating.details.di.a boolean z12) {
        this.f246927a = yVar;
        this.f246928b = mVar;
        this.f246929c = interfaceC34171c;
        this.f246930d = kVar;
        this.f246931e = z12;
    }

    @Override // com.avito.android.rating.details.converter.g
    @Y61.k
    public final ArrayList a(@Y61.k List list, @Y61.l Uri uri, int i12, boolean z12, boolean z13, boolean z14) {
        long j12;
        a.b bVar;
        RatingAspectsEntry.Tooltip.Action action;
        Object c7508a;
        Object next;
        a.AbstractC7507a.b.C7509a c7509a;
        SearchParametersEntry.SearchParametersBlock.Sort.Tooltip.Action action2;
        RatingInfoWithHintItem.Hint hint;
        Integer numQ;
        SummaryItem.SummaryScore.SummaryScoreState summaryScoreState;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        long size = arrayList3.size() + i12;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RatingDetailsEntry ratingDetailsEntry = (RatingDetailsEntry) it.next();
            if (ratingDetailsEntry instanceof BadgeScoreEntry) {
                BadgeScoreEntry badgeScoreEntry = (BadgeScoreEntry) ratingDetailsEntry;
                j12 = 1 + size;
                arrayList3.add(new com.avito.android.rating_ui.badge_score.c(C21030p.a(size, "badge-score:"), badgeScoreEntry.getScoreValue(), badgeScoreEntry.getScoreText(), badgeScoreEntry.getCaption(), null, RatingItemsMarginHorizontal.MarginNormal.f249854b, 16, null));
            } else {
                ArrayList arrayList4 = null;
                text = null;
                String text = null;
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
                        List<RatingStatisticWithScoreEntry.RatingStatistic> list2 = statistic;
                        arrayList4 = new ArrayList(C42745f0.q(list2, 10));
                        for (RatingStatisticWithScoreEntry.RatingStatistic ratingStatistic : list2) {
                            arrayList4.add(new RatingStatEntry(ratingStatistic.getScore(), ratingStatisticWithScoreEntry.getReviewCount() != null ? ratingStatistic.getCount() / r11.intValue() : 0.0f, ratingStatistic.getTitle()));
                        }
                    }
                    ArrayList arrayList5 = arrayList4;
                    Boolean isCompact = ratingStatisticWithScoreEntry.getIsCompact();
                    arrayList3.add(new RatingScoreWithStatisticItem(strA, score, scoreFloat, title, subtitle, reviewCount, arrayList5, isCompact != null ? isCompact.booleanValue() : false, marginNormal));
                } else if (ratingDetailsEntry instanceof RatingStatisticEntry) {
                    RatingStatisticEntry ratingStatisticEntry = (RatingStatisticEntry) ratingDetailsEntry;
                    j12 = 1 + size;
                    RatingItemsMarginHorizontal.MarginNormal marginNormal2 = RatingItemsMarginHorizontal.MarginNormal.f249854b;
                    String strA2 = C21030p.a(size, "statistic:");
                    int reviewCount2 = ratingStatisticEntry.getReviewCount();
                    List<RatingStatisticEntry.RatingStatistic> statistic2 = ratingStatisticEntry.getStatistic();
                    ArrayList arrayList6 = new ArrayList(C42745f0.q(statistic2, 10));
                    for (RatingStatisticEntry.RatingStatistic ratingStatistic2 : statistic2) {
                        arrayList6.add(new RatingStatisticRow(ratingStatistic2.getCount() / ratingStatisticEntry.getReviewCount(), ratingStatistic2.getTitle(), ratingStatistic2.getScore()));
                    }
                    arrayList3.add(new com.avito.android.rating_ui.statistic.b(strA2, reviewCount2, arrayList6, marginNormal2));
                } else if (ratingDetailsEntry instanceof RatingAspectsEntry) {
                    RatingAspectsEntry ratingAspectsEntry = (RatingAspectsEntry) ratingDetailsEntry;
                    j12 = 1 + size;
                    String strA3 = C21030p.a(size, "aspects:");
                    String paramName = ratingAspectsEntry.getParamName();
                    List<RatingAspectsEntry.Aspect> options = ratingAspectsEntry.getOptions();
                    ArrayList arrayList7 = new ArrayList(C42745f0.q(options, 10));
                    for (RatingAspectsEntry.Aspect aspect : options) {
                        String title2 = aspect.getTitle();
                        String description = aspect.getDescription();
                        long value = aspect.getValue();
                        long value2 = aspect.getValue();
                        Long selectedOption = ratingAspectsEntry.getSelectedOption();
                        arrayList7.add(new a.C7491a(value, selectedOption != null && value2 == selectedOption.longValue(), title2, description));
                    }
                    RatingAspectsEntry.Tooltip tooltip = ratingAspectsEntry.getTooltip();
                    if (tooltip != null) {
                        String text2 = tooltip.getText();
                        List<RatingAspectsEntry.Tooltip.Action> actions = tooltip.getActions();
                        if (actions != null && (action = (RatingAspectsEntry.Tooltip.Action) C42745f0.G(actions)) != null) {
                            text = action.getText();
                        }
                        bVar = new a.b(text2, text);
                    } else {
                        bVar = null;
                    }
                    arrayList3.add(new com.avito.android.rating_ui.aspects.a(strA3, paramName, arrayList7, bVar, !z13, false, 32, null));
                } else if (ratingDetailsEntry instanceof OldSearchParametersEntry) {
                    continue;
                } else if (ratingDetailsEntry instanceof SearchParametersEntry) {
                    j12 = 1 + size;
                    String strA4 = C21030p.a(size, "sort:");
                    List<SearchParametersEntry.SearchParametersBlock> blocks = ((SearchParametersEntry) ratingDetailsEntry).getBlocks();
                    ArrayList arrayList8 = new ArrayList(C42745f0.q(blocks, 10));
                    for (SearchParametersEntry.SearchParametersBlock searchParametersBlock : blocks) {
                        if (searchParametersBlock instanceof SearchParametersEntry.SearchParametersBlock.Sort) {
                            SearchParametersEntry.SearchParametersBlock.Sort sort = (SearchParametersEntry.SearchParametersBlock.Sort) searchParametersBlock;
                            f246926f.getClass();
                            Iterator<T> it2 = sort.getOptions().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                if (L.f(((SearchParametersEntry.SearchParametersBlock.Sort.SortOption) next).getValue(), sort.getSelectedOption())) {
                                    break;
                                }
                            }
                            SearchParametersEntry.SearchParametersBlock.Sort.SortOption sortOption = (SearchParametersEntry.SearchParametersBlock.Sort.SortOption) next;
                            String label = sortOption != null ? sortOption.getLabel() : null;
                            String paramName2 = sort.getParamName();
                            SearchParametersEntry.SearchParametersBlock.Sort.Tooltip tooltip2 = sort.getTooltip();
                            if (tooltip2 != null) {
                                String text3 = tooltip2.getText();
                                List<SearchParametersEntry.SearchParametersBlock.Sort.Tooltip.Action> actions2 = tooltip2.getActions();
                                c7509a = new a.AbstractC7507a.b.C7509a(text3, (actions2 == null || (action2 = (SearchParametersEntry.SearchParametersBlock.Sort.Tooltip.Action) C42745f0.G(actions2)) == null) ? null : action2.getText());
                            } else {
                                c7509a = null;
                            }
                            c7508a = new a.AbstractC7507a.b(label, paramName2, c7509a, !z14);
                        } else {
                            if (!(searchParametersBlock instanceof SearchParametersEntry.SearchParametersBlock.InlineBoolFilter)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            SearchParametersEntry.SearchParametersBlock.InlineBoolFilter inlineBoolFilter = (SearchParametersEntry.SearchParametersBlock.InlineBoolFilter) searchParametersBlock;
                            String label2 = inlineBoolFilter.getLabel();
                            String paramName3 = inlineBoolFilter.getParamName();
                            Boolean selected = inlineBoolFilter.getSelected();
                            c7508a = new a.AbstractC7507a.C7508a(label2, paramName3, selected != null ? selected.booleanValue() : false);
                        }
                        arrayList8.add(c7508a);
                    }
                    arrayList3.add(new com.avito.android.rating_ui.sort.a(strA4, arrayList8, false));
                } else {
                    boolean z15 = ratingDetailsEntry instanceof ReviewEntry;
                    boolean z16 = this.f246931e;
                    if (z15) {
                        size++;
                        arrayList3.add(this.f246927a.a((ReviewEntry) ratingDetailsEntry, z16, RatingItemsMarginHorizontal.MarginNormal.f249854b));
                    } else if (ratingDetailsEntry instanceof ModelReviewEntry) {
                        size++;
                        arrayList3.add(this.f246928b.a((ModelReviewEntry) ratingDetailsEntry, z16, RatingItemsMarginHorizontal.MarginNormal.f249854b));
                    } else if (ratingDetailsEntry instanceof BuyerReviewEntry) {
                        size++;
                        arrayList3.add(this.f246929c.a((BuyerReviewEntry) ratingDetailsEntry, z16, RatingItemsMarginHorizontal.MarginNormal.f249854b));
                    } else if (ratingDetailsEntry instanceof PhotoGalleryEntry) {
                        j12 = 1 + size;
                        GalleryItem galleryItemA = this.f246930d.a((PhotoGalleryEntry) ratingDetailsEntry, size);
                        if (galleryItemA != null) {
                            arrayList3.add(galleryItemA);
                        }
                    } else if (ratingDetailsEntry instanceof InfoEntry) {
                        InfoEntry infoEntry = (InfoEntry) ratingDetailsEntry;
                        j12 = 1 + size;
                        RatingItemsMarginHorizontal.MarginNormal marginNormal3 = RatingItemsMarginHorizontal.MarginNormal.f249854b;
                        String strA5 = C21030p.a(size, "info-with-hint:");
                        String title3 = infoEntry.getTitle();
                        String titleSize = infoEntry.getTitleSize();
                        int iIntValue = (titleSize == null || (numQ = com.avito.android.lib.util.f.q(titleSize)) == null) ? R.attr.textH30 : numQ.intValue();
                        String titleColor = infoEntry.getTitleColor();
                        Integer numA = titleColor != null ? com.avito.android.lib.util.e.a(titleColor) : null;
                        String subtitle2 = infoEntry.getSubtitle();
                        String subtitleColor = infoEntry.getSubtitleColor();
                        Integer numA2 = subtitleColor != null ? com.avito.android.lib.util.e.a(subtitleColor) : null;
                        InfoEntry.InfoHint hint2 = infoEntry.getHint();
                        if (hint2 != null) {
                            String title4 = hint2.getTitle();
                            String text4 = hint2.getText();
                            Action action3 = hint2.getAction();
                            String title5 = action3 != null ? action3.getTitle() : null;
                            Action action4 = hint2.getAction();
                            hint = new RatingInfoWithHintItem.Hint(title4, text4, title5, action4 != null ? action4.getDeepLink() : null);
                        } else {
                            hint = null;
                        }
                        InfoEntry.InfoHorizontalAlign horizontalAlign = infoEntry.getHorizontalAlign();
                        RatingInfoWithHintItem.InfoHorizontalAlign infoHorizontalAlign = (horizontalAlign == null ? -1 : b.f246932a[horizontalAlign.ordinal()]) == 1 ? RatingInfoWithHintItem.InfoHorizontalAlign.f250033b : null;
                        InfoEntry.InfoImage imageInfo = infoEntry.getImageInfo();
                        arrayList3.add(new RatingInfoWithHintItem(strA5, title3, iIntValue, numA, subtitle2, numA2, hint, infoHorizontalAlign, imageInfo != null ? new RatingInfoWithHintItem.InfoImage(imageInfo.getImage(), imageInfo.getWidth()) : null, marginNormal3));
                    } else if (ratingDetailsEntry instanceof ActionEntry) {
                        ActionEntry actionEntry = (ActionEntry) ratingDetailsEntry;
                        j12 = 1 + size;
                        arrayList3.add(new ActionItem(C21030p.a(size, "action:"), actionEntry.getAction().getTitle(), actionEntry.getAction().getDeepLink(), RatingItemsMarginHorizontal.MarginNormal.f249854b));
                    } else if (ratingDetailsEntry instanceof ButtonEntry) {
                        ButtonEntry buttonEntry = (ButtonEntry) ratingDetailsEntry;
                        j12 = 1 + size;
                        arrayList3.add(new ButtonItem(C21030p.a(size, "button:"), buttonEntry.getAction().getTitle(), buttonEntry.getAction().getDeepLink(), RatingItemsMarginHorizontal.MarginNormal.f249854b));
                    } else if (ratingDetailsEntry instanceof TextEntry) {
                        j12 = 1 + size;
                        arrayList3.add(new TextItem(C21030p.a(size, "text:"), ((TextEntry) ratingDetailsEntry).getMessage(), RatingItemsMarginHorizontal.MarginNormal.f249854b));
                    } else if (ratingDetailsEntry instanceof RatingSummaryEntry) {
                        RatingSummaryEntry ratingSummaryEntry = (RatingSummaryEntry) ratingDetailsEntry;
                        j12 = 1 + size;
                        RatingItemsMarginHorizontal.MarginNormal marginNormal4 = RatingItemsMarginHorizontal.MarginNormal.f249854b;
                        String strA6 = C21030p.a(size, "summary:");
                        List<RatingSummaryEntry.RatingSummaryScore> scores = ratingSummaryEntry.getScores();
                        ArrayList arrayList9 = new ArrayList(C42745f0.q(scores, 10));
                        for (RatingSummaryEntry.RatingSummaryScore ratingSummaryScore : scores) {
                            String title6 = ratingSummaryScore.getTitle();
                            int i13 = b.f246933b[ratingSummaryScore.getScoreState().ordinal()];
                            if (i13 == 1) {
                                summaryScoreState = SummaryItem.SummaryScore.SummaryScoreState.f246550b;
                            } else {
                                if (i13 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                summaryScoreState = SummaryItem.SummaryScore.SummaryScoreState.f246551c;
                            }
                            arrayList9.add(new SummaryItem.SummaryScore(title6, summaryScoreState, new SummaryItem.SummaryScore.SummaryScoreDetails(ratingSummaryScore.getDetails().getTitle(), ratingSummaryScore.getDetails().getDescription())));
                        }
                        arrayList3.add(new SummaryItem(strA6, arrayList9, ratingSummaryEntry.getTitle(), ratingSummaryEntry.getButtonTitle(), ratingSummaryEntry.getAnalyticsAction(), marginNormal4));
                    } else if (ratingDetailsEntry instanceof RatingLLMSummaryEntry) {
                        RatingLLMSummaryEntry ratingLLMSummaryEntry = (RatingLLMSummaryEntry) ratingDetailsEntry;
                        j12 = 1 + size;
                        String strA7 = C21030p.a(size, "llm-summary:");
                        BaseRatingLLMSummaryItem.Title title7 = new BaseRatingLLMSummaryItem.Title(ratingLLMSummaryEntry.getTitle().getText(), ratingLLMSummaryEntry.getTitle().getAction());
                        List<RatingLLMSummaryEntry.Section> sections = ratingLLMSummaryEntry.getSections();
                        if (sections != null) {
                            List<RatingLLMSummaryEntry.Section> list3 = sections;
                            ArrayList arrayList10 = new ArrayList(C42745f0.q(list3, 10));
                            for (RatingLLMSummaryEntry.Section section : list3) {
                                arrayList10.add(new BaseRatingLLMSummaryItem.Section(section.getTitle(), section.getText()));
                            }
                            arrayList = arrayList10;
                        } else {
                            arrayList = null;
                        }
                        List<RatingLLMSummaryEntry.Button> buttons = ratingLLMSummaryEntry.getButtons();
                        if (buttons != null) {
                            List<RatingLLMSummaryEntry.Button> list4 = buttons;
                            ArrayList arrayList11 = new ArrayList(C42745f0.q(list4, 10));
                            for (RatingLLMSummaryEntry.Button button : list4) {
                                arrayList11.add(new BaseRatingLLMSummaryItem.Button(button.getTitle(), button.getAction()));
                            }
                            arrayList2 = arrayList11;
                        } else {
                            arrayList2 = null;
                        }
                        RatingLLMSummaryEntry.FeedbackSent feedbackSent = ratingLLMSummaryEntry.getFeedbackSent();
                        String title8 = feedbackSent != null ? feedbackSent.getTitle() : null;
                        RatingLLMSummaryEntry.FeedbackSent feedbackSent2 = ratingLLMSummaryEntry.getFeedbackSent();
                        arrayList3.add(new RatingLLMSummaryItem(strA7, title7, arrayList, arrayList2, new BaseRatingLLMSummaryItem.FeedbackSent(title8, feedbackSent2 != null ? feedbackSent2.getText() : null), !z12));
                    }
                }
            }
            size = j12;
        }
        if (!arrayList3.isEmpty() && uri != null) {
            arrayList3.add(new RatingLoadingItem(String.valueOf(size)));
        }
        return arrayList3;
    }
}
