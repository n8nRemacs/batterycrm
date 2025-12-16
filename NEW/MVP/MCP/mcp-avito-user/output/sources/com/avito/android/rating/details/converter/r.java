package com.avito.android.rating.details.converter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import com.avito.android.remote.model.text.AttributedText;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RatingDetailsReviewActionsConverter.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/converter/r;", "Lcom/avito/android/rating/details/converter/q;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes16.dex */
public final class r implements q {

    /* compiled from: RatingDetailsReviewActionsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f246944a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f246945b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f246946c;

        static {
            int[] iArr = new int[ReviewEntry.Action.ActionValue.ActionValueValidation.ActionValueValidationRule.values().length];
            try {
                iArr[ReviewEntry.Action.ActionValue.ActionValueValidation.ActionValueValidationRule.LENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f246944a = iArr;
            int[] iArr2 = new int[ReviewEntry.Action.ActionType.values().length];
            try {
                iArr2[ReviewEntry.Action.ActionType.ANSWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ReviewEntry.Action.ActionType.REMOVE_ANSWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ReviewEntry.Action.ActionType.REMOVE_REVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ReviewEntry.Action.ActionType.REMOVE_BUYER_REVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ReviewEntry.Action.ActionType.LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ReviewEntry.Action.ActionType.NETWORK_REQUEST.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ReviewEntry.Action.ActionType.BOTTOM_SHEET.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ReviewEntry.Action.ActionType.TEXT_SHEET.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ReviewEntry.Action.ActionType.INFO.ordinal()] = 9;
            } catch (NoSuchFieldError unused10) {
            }
            f246945b = iArr2;
            int[] iArr3 = new int[ReviewEntry.Action.ButtonType.values().length];
            try {
                iArr3[ReviewEntry.Action.ButtonType.NEGATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ReviewEntry.Action.ButtonType.POSITIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ReviewEntry.Action.ButtonType.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f246946c = iArr3;
        }
    }

    @Inject
    public r() {
    }

    @Override // com.avito.android.rating.details.converter.q
    @Y61.l
    public final ArrayList a(@Y61.l List list) {
        BaseRatingReviewItem.ReviewAction.ReviewActionType reviewActionType;
        Iterator it;
        ArrayList arrayList;
        BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueButton reviewActionValueButton;
        ArrayList arrayList2;
        BaseRatingReviewItem.ReviewAction.ReviewActionType reviewActionType2;
        BaseRatingReviewItem.ReviewAction.ConfirmDialog confirmDialog;
        BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionInfoButtons reviewActionInfoButtons;
        BaseRatingReviewItem.ReviewAction.ButtonType buttonType;
        int i12;
        Iterator it2;
        int i13;
        if (list == null) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            ReviewEntry.Action action = (ReviewEntry.Action) obj;
            if (action.getType() != null && (action.getType() != ReviewEntry.Action.ActionType.LINK || action.getValue().getLink() != null)) {
                if (!(action.getValue().getLink() instanceof NoMatchLink) && (action.getType() != ReviewEntry.Action.ActionType.NETWORK_REQUEST || action.getValue().getUrlPath() != null)) {
                    arrayList3.add(obj);
                }
            }
        }
        int i14 = 10;
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            ReviewEntry.Action action2 = (ReviewEntry.Action) it3.next();
            ReviewEntry.Action.ActionType type = action2.getType();
            switch (type == null ? -1 : a.f246945b[type.ordinal()]) {
                case -1:
                    reviewActionType = null;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    reviewActionType = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250258b;
                    break;
                case 2:
                    reviewActionType = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250259c;
                    break;
                case 3:
                    reviewActionType = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250260d;
                    break;
                case 4:
                    reviewActionType = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250261e;
                    break;
                case 5:
                    reviewActionType = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250262f;
                    break;
                case 6:
                    reviewActionType = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250263g;
                    break;
                case 7:
                    reviewActionType = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250264h;
                    break;
                case 8:
                    reviewActionType = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250265i;
                    break;
                case 9:
                    reviewActionType = BaseRatingReviewItem.ReviewAction.ReviewActionType.f250266j;
                    break;
            }
            ReviewEntry.Action.ActionValue value = action2.getValue();
            String title = value.getTitle();
            String placeholder = value.getPlaceholder();
            String urlPath = value.getUrlPath();
            ReviewEntry.Action.ActionValue.ActionValueParams params = value.getParams();
            BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueParam reviewActionValueParam = params != null ? new BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueParam(params.getReviewId(), params.getTypeId(), params.getAppealType(), params.getText()) : null;
            ArrayList arrayListA = a(value.getActions());
            List<ReviewEntry.Action.ActionValue.ActionValueValidation> validations = value.getValidations();
            if (validations != null) {
                List<ReviewEntry.Action.ActionValue.ActionValueValidation> list2 = validations;
                ArrayList arrayList5 = new ArrayList(C42745f0.q(list2, i14));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    ReviewEntry.Action.ActionValue.ActionValueValidation actionValueValidation = (ReviewEntry.Action.ActionValue.ActionValueValidation) it4.next();
                    Integer max = actionValueValidation.getMax();
                    String message = actionValueValidation.getMessage();
                    Iterator it5 = it4;
                    Integer min = actionValueValidation.getMin();
                    ReviewEntry.Action.ActionValue.ActionValueValidation.ActionValueValidationRule rule = actionValueValidation.getRule();
                    if (rule == null) {
                        it2 = it3;
                        i13 = 1;
                        i12 = -1;
                    } else {
                        i12 = a.f246944a[rule.ordinal()];
                        it2 = it3;
                        i13 = 1;
                    }
                    arrayList5.add(new BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueValidation(max, message, min, i12 == i13 ? BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueValidation.ReviewActionValueValidationRule.f250300b : null));
                    it4 = it5;
                    it3 = it2;
                }
                it = it3;
                arrayList = arrayList5;
            } else {
                it = it3;
                arrayList = null;
            }
            ReviewEntry.Action.ActionValue.ActionValueButton button = value.getButton();
            if (button != null) {
                ReviewEntry.Action.ActionValue.ActionValueParams params2 = button.getParams();
                reviewActionValueButton = new BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueButton(params2 != null ? new BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueParam(params2.getReviewId(), params2.getTypeId(), params2.getAppealType(), params2.getText()) : null, button.getTitle(), button.getUrlPath());
            } else {
                reviewActionValueButton = null;
            }
            String header = value.getHeader();
            DeepLink analyticsAction = value.getAnalyticsAction();
            DeepLink link = value.getLink();
            ReviewEntry.Action.ActionValue.ActionAnswerLengthValidation lengthValidation = value.getLengthValidation();
            BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionAnswerLengthValidation reviewActionAnswerLengthValidation = lengthValidation != null ? new BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionAnswerLengthValidation(lengthValidation.getMin(), lengthValidation.getMax()) : null;
            ReviewEntry.Action.ConfirmationDialog confirmationDialog = value.getConfirmationDialog();
            if (confirmationDialog != null) {
                String title2 = confirmationDialog.getTitle();
                String text = confirmationDialog.getText();
                List<ReviewEntry.Action.Button> buttons = confirmationDialog.getButtons();
                arrayList2 = arrayList4;
                reviewActionType2 = reviewActionType;
                ArrayList arrayList6 = new ArrayList(C42745f0.q(buttons, 10));
                Iterator it6 = buttons.iterator();
                while (it6.hasNext()) {
                    ReviewEntry.Action.Button button2 = (ReviewEntry.Action.Button) it6.next();
                    int i15 = a.f246946c[button2.getType().ordinal()];
                    Iterator it7 = it6;
                    if (i15 == 1) {
                        buttonType = BaseRatingReviewItem.ReviewAction.ButtonType.f250251c;
                    } else if (i15 == 2) {
                        buttonType = BaseRatingReviewItem.ReviewAction.ButtonType.f250250b;
                    } else {
                        if (i15 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        buttonType = BaseRatingReviewItem.ReviewAction.ButtonType.f250252d;
                    }
                    arrayList6.add(new BaseRatingReviewItem.ReviewAction.Button(button2.getText(), buttonType));
                    it6 = it7;
                }
                confirmDialog = new BaseRatingReviewItem.ReviewAction.ConfirmDialog(title2, text, arrayList6);
            } else {
                arrayList2 = arrayList4;
                reviewActionType2 = reviewActionType;
                confirmDialog = null;
            }
            AttributedText content = value.getContent();
            ReviewEntry.Action.ActionValue.ActionInfoButtons buttons2 = value.getButtons();
            if (buttons2 == null) {
                reviewActionInfoButtons = null;
            } else {
                ReviewEntry.Action.ActionValue.ActionInfoButton primary = buttons2.getPrimary();
                BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionInfoButton reviewActionInfoButton = primary != null ? new BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionInfoButton(primary.getTitle(), primary.getLink()) : null;
                ReviewEntry.Action.ActionValue.ActionInfoButton secondary = buttons2.getSecondary();
                reviewActionInfoButtons = new BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionInfoButtons(reviewActionInfoButton, secondary != null ? new BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionInfoButton(secondary.getTitle(), secondary.getLink()) : null);
            }
            arrayList4 = arrayList2;
            arrayList4.add(new BaseRatingReviewItem.ReviewAction(reviewActionType2, new BaseRatingReviewItem.ReviewAction.ReviewActionValue(title, placeholder, urlPath, reviewActionValueParam, arrayListA, arrayList, reviewActionValueButton, header, analyticsAction, link, reviewActionAnswerLengthValidation, confirmDialog, content, reviewActionInfoButtons)));
            it3 = it;
            i14 = 10;
        }
        return arrayList4;
    }
}
