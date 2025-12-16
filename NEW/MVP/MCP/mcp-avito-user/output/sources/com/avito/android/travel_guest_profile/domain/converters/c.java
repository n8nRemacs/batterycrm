package com.avito.android.travel_guest_profile.domain.converters;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TravelGuestProfileRatingActionsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_guest_profile/domain/converters/c;", "", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* compiled from: TravelGuestProfileRatingActionsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f301939a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f301940b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f301941c;

        static {
            int[] iArr = new int[ReviewEntry.Action.ActionValue.ActionValueValidation.ActionValueValidationRule.values().length];
            try {
                iArr[ReviewEntry.Action.ActionValue.ActionValueValidation.ActionValueValidationRule.LENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f301939a = iArr;
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
            f301940b = iArr2;
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
            f301941c = iArr3;
        }
    }

    @Inject
    public c() {
    }

    @Y61.l
    public static ArrayList a(@Y61.l List list) {
        BaseRatingReviewItem.ReviewAction.ReviewActionType reviewActionType;
        Iterator it;
        ArrayList arrayList;
        BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueButton reviewActionValueButton;
        ArrayList arrayList2;
        DeepLink deepLink;
        BaseRatingReviewItem.ReviewAction.ReviewActionType reviewActionType2;
        BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionAnswerLengthValidation reviewActionAnswerLengthValidation;
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
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            ReviewEntry.Action action2 = (ReviewEntry.Action) it3.next();
            ReviewEntry.Action.ActionType type = action2.getType();
            switch (type == null ? -1 : a.f301940b[type.ordinal()]) {
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
                ArrayList arrayList5 = new ArrayList(C42745f0.q(list2, 10));
                for (ReviewEntry.Action.ActionValue.ActionValueValidation actionValueValidation : list2) {
                    Integer max = actionValueValidation.getMax();
                    String message = actionValueValidation.getMessage();
                    Integer min = actionValueValidation.getMin();
                    ReviewEntry.Action.ActionValue.ActionValueValidation.ActionValueValidationRule rule = actionValueValidation.getRule();
                    if (rule == null) {
                        it2 = it3;
                        i13 = 1;
                        i12 = -1;
                    } else {
                        i12 = a.f301939a[rule.ordinal()];
                        it2 = it3;
                        i13 = 1;
                    }
                    arrayList5.add(new BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueValidation(max, message, min, i12 == i13 ? BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionValueValidation.ReviewActionValueValidationRule.f250300b : null));
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
            BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionAnswerLengthValidation reviewActionAnswerLengthValidation2 = lengthValidation != null ? new BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionAnswerLengthValidation(lengthValidation.getMin(), lengthValidation.getMax()) : null;
            ReviewEntry.Action.ConfirmationDialog confirmationDialog = value.getConfirmationDialog();
            if (confirmationDialog != null) {
                String title2 = confirmationDialog.getTitle();
                arrayList2 = arrayList4;
                String text = confirmationDialog.getText();
                List<ReviewEntry.Action.Button> buttons = confirmationDialog.getButtons();
                reviewActionType2 = reviewActionType;
                reviewActionAnswerLengthValidation = reviewActionAnswerLengthValidation2;
                ArrayList arrayList6 = new ArrayList(C42745f0.q(buttons, 10));
                Iterator it4 = buttons.iterator();
                while (it4.hasNext()) {
                    ReviewEntry.Action.Button button2 = (ReviewEntry.Action.Button) it4.next();
                    Iterator it5 = it4;
                    int i14 = a.f301941c[button2.getType().ordinal()];
                    DeepLink deepLink2 = link;
                    if (i14 == 1) {
                        buttonType = BaseRatingReviewItem.ReviewAction.ButtonType.f250251c;
                    } else if (i14 == 2) {
                        buttonType = BaseRatingReviewItem.ReviewAction.ButtonType.f250250b;
                    } else {
                        if (i14 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        buttonType = BaseRatingReviewItem.ReviewAction.ButtonType.f250252d;
                    }
                    arrayList6.add(new BaseRatingReviewItem.ReviewAction.Button(button2.getText(), buttonType));
                    link = deepLink2;
                    it4 = it5;
                }
                deepLink = link;
                confirmDialog = new BaseRatingReviewItem.ReviewAction.ConfirmDialog(title2, text, arrayList6);
            } else {
                arrayList2 = arrayList4;
                deepLink = link;
                reviewActionType2 = reviewActionType;
                reviewActionAnswerLengthValidation = reviewActionAnswerLengthValidation2;
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
            ArrayList arrayList7 = arrayList2;
            arrayList7.add(new BaseRatingReviewItem.ReviewAction(reviewActionType2, new BaseRatingReviewItem.ReviewAction.ReviewActionValue(title, placeholder, urlPath, reviewActionValueParam, arrayListA, arrayList, reviewActionValueButton, header, analyticsAction, deepLink, reviewActionAnswerLengthValidation, confirmDialog, content, reviewActionInfoButtons)));
            arrayList4 = arrayList7;
            it3 = it;
        }
        return arrayList4;
    }
}
