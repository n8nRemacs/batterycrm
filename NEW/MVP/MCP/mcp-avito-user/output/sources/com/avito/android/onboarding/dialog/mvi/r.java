package com.avito.android.onboarding.dialog.mvi;

import android.net.Uri;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.J0;
import com.avito.android.arch.mvi.u;
import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogInternalAction;
import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogState;
import com.avito.android.onboarding.dialog.mvi.entity.item.OnboardingResultItem;
import com.avito.android.onboarding.dialog.view.carousel.AdditionalActionItem;
import com.avito.android.onboarding.dialog.view.quiz.AnswerChipable;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.onboarding.AdditionalAction;
import com.avito.android.remote.model.onboarding.ButtonAction;
import com.avito.android.remote.model.onboarding.OnboardingCarousel;
import com.avito.android.remote.model.onboarding.OnboardingCarouselItem;
import com.avito.android.remote.model.onboarding.OnboardingItem;
import com.avito.android.remote.model.onboarding.OnboardingPreview;
import com.avito.android.remote.model.onboarding.OnboardingPreviewItem;
import com.avito.android.remote.model.onboarding.OnboardingQuiz;
import com.avito.android.remote.model.onboarding.OnboardingQuizItem;
import com.avito.android.remote.model.onboarding.QuizAnswersItem;
import com.avito.android.remote.model.onboarding.QuizQuestion;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: OnboardingDialogReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/onboarding/dialog/mvi/r;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogInternalAction;", "Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogState;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r implements u<OnboardingDialogInternalAction, OnboardingDialogState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final J0 f208959b;

    @Inject
    public r(@Y61.k J0 j02) {
        this.f208959b = j02;
    }

    @Override // com.avito.android.arch.mvi.u
    public final OnboardingDialogState a(OnboardingDialogInternalAction onboardingDialogInternalAction, OnboardingDialogState onboardingDialogState) throws NumberFormatException {
        OnboardingResultItem.OnboardingResultQuizItem onboardingResultQuizItem;
        ArrayList arrayList;
        OnboardingResultItem.OnboardingResultCarouselItem onboardingResultCarouselItem;
        boolean z12;
        String str;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        Iterator it2;
        OnboardingResultItem.OnboardingResultQuizItem onboardingResultQuizItem2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        OnboardingResultItem onboardingResultPreviewItem;
        ArrayList arrayList6;
        OnboardingResultItem onboardingResultQuizItem3;
        Iterator it3;
        ArrayList arrayList7;
        String id2;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        OnboardingDialogInternalAction onboardingDialogInternalAction2 = onboardingDialogInternalAction;
        OnboardingDialogState onboardingDialogState2 = onboardingDialogState;
        int i12 = 10;
        if (onboardingDialogInternalAction2 instanceof OnboardingDialogInternalAction.OnboardingLoaded) {
            OnboardingDialogInternalAction.OnboardingLoaded onboardingLoaded = (OnboardingDialogInternalAction.OnboardingLoaded) onboardingDialogInternalAction2;
            OnboardingItem onboardingItem = onboardingLoaded.f208896c;
            boolean z13 = onboardingItem instanceof OnboardingPreview;
            J0 j02 = this.f208959b;
            if (z13) {
                OnboardingPreview onboardingPreview = (OnboardingPreview) onboardingItem;
                List<OnboardingPreviewItem> items = onboardingPreview.getItems();
                if (items != null) {
                    List<OnboardingPreviewItem> list = items;
                    arrayList10 = new ArrayList(C42745f0.q(list, 10));
                    for (OnboardingPreviewItem onboardingPreviewItem : list) {
                        arrayList10.add(new com.avito.android.onboarding.dialog.view.preview.OnboardingPreviewItem(j02.a(), onboardingPreviewItem.getImage(), onboardingPreviewItem.getTitle(), onboardingPreviewItem.getUri()));
                    }
                } else {
                    arrayList10 = null;
                }
                onboardingResultPreviewItem = new OnboardingResultItem.OnboardingResultPreviewItem(onboardingPreview.getTitle(), arrayList10);
            } else {
                if (onboardingItem instanceof OnboardingCarousel) {
                    List<OnboardingCarouselItem> items2 = ((OnboardingCarousel) onboardingItem).getItems();
                    if (items2 != null) {
                        List<OnboardingCarouselItem> list2 = items2;
                        ArrayList arrayList11 = new ArrayList(C42745f0.q(list2, 10));
                        int i13 = 0;
                        for (Object obj : list2) {
                            int i14 = i13 + 1;
                            if (i13 < 0) {
                                C42745f0.H0();
                                throw null;
                            }
                            OnboardingCarouselItem onboardingCarouselItem = (OnboardingCarouselItem) obj;
                            long jA2 = j02.a();
                            UniversalImage image = onboardingCarouselItem.getImage();
                            AttributedText title = onboardingCarouselItem.getTitle();
                            AttributedText description = onboardingCarouselItem.getDescription();
                            String buttonTitle = onboardingCarouselItem.getButtonTitle();
                            Uri uri = onboardingCarouselItem.getUri();
                            ButtonAction buttonAction = onboardingCarouselItem.getButtonAction();
                            List<AdditionalAction> additionalActions = onboardingCarouselItem.getAdditionalActions();
                            if (additionalActions != null) {
                                List<AdditionalAction> list3 = additionalActions;
                                ArrayList arrayList12 = new ArrayList(C42745f0.q(list3, i12));
                                for (AdditionalAction additionalAction : list3) {
                                    arrayList12.add(new AdditionalActionItem(j02.a(), additionalAction.getButtonTitle(), additionalAction.getButtonAction(), additionalAction.getUri(), additionalAction.getParams(), additionalAction.getRequestType(), additionalAction.getStyle(), false));
                                }
                                arrayList9 = arrayList12;
                            } else {
                                arrayList9 = null;
                            }
                            arrayList11.add(new com.avito.android.onboarding.dialog.view.carousel.OnboardingCarouselItem(jA2, image, title, description, buttonTitle, uri, buttonAction, arrayList9, onboardingCarouselItem.getGradient(), Integer.valueOf(i14)));
                            i13 = i14;
                            i12 = 10;
                        }
                        arrayList8 = arrayList11;
                    } else {
                        arrayList8 = null;
                    }
                    onboardingResultQuizItem3 = new OnboardingResultItem.OnboardingResultCarouselItem(arrayList8);
                } else if (onboardingItem instanceof OnboardingQuiz) {
                    List<OnboardingQuizItem> items3 = ((OnboardingQuiz) onboardingItem).getItems();
                    if (items3 != null) {
                        List<OnboardingQuizItem> list4 = items3;
                        ArrayList arrayList13 = new ArrayList(C42745f0.q(list4, 10));
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            OnboardingQuizItem onboardingQuizItem = (OnboardingQuizItem) it4.next();
                            long jA3 = j02.a();
                            List<QuizAnswersItem> answers = onboardingQuizItem.getAnswers();
                            if (answers != null) {
                                List<QuizAnswersItem> list5 = answers;
                                ArrayList arrayList14 = new ArrayList(C42745f0.q(list5, 10));
                                for (QuizAnswersItem quizAnswersItem : list5) {
                                    int i15 = Integer.parseInt(quizAnswersItem.getId());
                                    QuizQuestion question = onboardingQuizItem.getQuestion();
                                    arrayList14.add(new AnswerChipable(i15, (question == null || (id2 = question.getId()) == null) ? null : Integer.valueOf(Integer.parseInt(id2)), quizAnswersItem.getText(), false, 8, null));
                                    it4 = it4;
                                }
                                it3 = it4;
                                arrayList7 = arrayList14;
                            } else {
                                it3 = it4;
                                arrayList7 = null;
                            }
                            arrayList13.add(new com.avito.android.onboarding.dialog.view.quiz.OnboardingQuizItem(jA3, arrayList7, onboardingQuizItem.getButtonTitle(), onboardingQuizItem.getButtonAction(), Boolean.FALSE, onboardingQuizItem.getRequestType(), onboardingQuizItem.getQuestion(), onboardingQuizItem.getTitle(), onboardingQuizItem.getQuestionText(), onboardingQuizItem.getImage()));
                            it4 = it3;
                        }
                        arrayList6 = arrayList13;
                    } else {
                        arrayList6 = null;
                    }
                    onboardingResultQuizItem3 = new OnboardingResultItem.OnboardingResultQuizItem(arrayList6);
                } else {
                    onboardingResultPreviewItem = null;
                }
                onboardingResultPreviewItem = onboardingResultQuizItem3;
            }
            return OnboardingDialogState.a(onboardingDialogState2, onboardingLoaded.f208895b, onboardingResultPreviewItem, false, 4);
        }
        if (onboardingDialogInternalAction2 instanceof OnboardingDialogInternalAction.SetContentWasShown) {
            return OnboardingDialogState.a(onboardingDialogState2, null, null, ((OnboardingDialogInternalAction.SetContentWasShown) onboardingDialogInternalAction2).f208897b, 3);
        }
        boolean z14 = onboardingDialogInternalAction2 instanceof OnboardingDialogInternalAction.ChangeQuizAnswer;
        OnboardingResultItem onboardingResultItem = onboardingDialogState2.f208912c;
        int i16 = 5;
        if (z14) {
            OnboardingResultItem.OnboardingResultQuizItem onboardingResultQuizItem4 = onboardingResultItem instanceof OnboardingResultItem.OnboardingResultQuizItem ? (OnboardingResultItem.OnboardingResultQuizItem) onboardingResultItem : null;
            if (onboardingResultQuizItem4 != null) {
                ArrayList<com.avito.android.onboarding.dialog.view.quiz.OnboardingQuizItem> arrayList15 = onboardingResultQuizItem4.f208917b;
                if (arrayList15 != null) {
                    arrayList4 = new ArrayList(C42745f0.q(arrayList15, 10));
                    for (com.avito.android.onboarding.dialog.view.quiz.OnboardingQuizItem onboardingQuizItemA : arrayList15) {
                        OnboardingDialogInternalAction.ChangeQuizAnswer changeQuizAnswer = (OnboardingDialogInternalAction.ChangeQuizAnswer) onboardingDialogInternalAction2;
                        if (onboardingQuizItemA.f209031b == changeQuizAnswer.f208889b) {
                            List<AnswerChipable> list6 = onboardingQuizItemA.f209032c;
                            if (list6 != null) {
                                List<AnswerChipable> list7 = list6;
                                arrayList5 = new ArrayList(C42745f0.q(list7, 10));
                                for (AnswerChipable answerChipable : list7) {
                                    int i17 = answerChipable.f209027b;
                                    if (i17 == changeQuizAnswer.f208890c) {
                                        answerChipable = new AnswerChipable(i17, answerChipable.f209028c, answerChipable.f209029d, changeQuizAnswer.f208891d);
                                    }
                                    arrayList5.add(answerChipable);
                                }
                            } else {
                                arrayList5 = null;
                            }
                            onboardingQuizItemA = com.avito.android.onboarding.dialog.view.quiz.OnboardingQuizItem.a(onboardingQuizItemA, arrayList5, null, 1021);
                        }
                        arrayList4.add(onboardingQuizItemA);
                    }
                } else {
                    arrayList4 = null;
                }
                onboardingResultQuizItem2 = new OnboardingResultItem.OnboardingResultQuizItem(arrayList4);
            } else {
                onboardingResultQuizItem2 = null;
            }
            return OnboardingDialogState.a(onboardingDialogState2, null, onboardingResultQuizItem2, false, 5);
        }
        if (!(onboardingDialogInternalAction2 instanceof OnboardingDialogInternalAction.UpdateAdditionalButtonLoadingState)) {
            if (!(onboardingDialogInternalAction2 instanceof OnboardingDialogInternalAction.UpdateQuizActionButtonLoadingState)) {
                return onboardingDialogState2;
            }
            OnboardingResultItem.OnboardingResultQuizItem onboardingResultQuizItem5 = onboardingResultItem instanceof OnboardingResultItem.OnboardingResultQuizItem ? (OnboardingResultItem.OnboardingResultQuizItem) onboardingResultItem : null;
            if (onboardingResultQuizItem5 != null) {
                ArrayList<com.avito.android.onboarding.dialog.view.quiz.OnboardingQuizItem> arrayList16 = onboardingResultQuizItem5.f208917b;
                if (arrayList16 != null) {
                    ArrayList arrayList17 = new ArrayList(C42745f0.q(arrayList16, 10));
                    for (com.avito.android.onboarding.dialog.view.quiz.OnboardingQuizItem onboardingQuizItemA2 : arrayList16) {
                        OnboardingDialogInternalAction.UpdateQuizActionButtonLoadingState updateQuizActionButtonLoadingState = (OnboardingDialogInternalAction.UpdateQuizActionButtonLoadingState) onboardingDialogInternalAction2;
                        if (onboardingQuizItemA2.f209031b == updateQuizActionButtonLoadingState.f208907b) {
                            onboardingQuizItemA2 = com.avito.android.onboarding.dialog.view.quiz.OnboardingQuizItem.a(onboardingQuizItemA2, null, Boolean.valueOf(updateQuizActionButtonLoadingState.f208908c), ErrorCodes.IO_EXCEPTION);
                        }
                        arrayList17.add(onboardingQuizItemA2);
                    }
                    arrayList = arrayList17;
                } else {
                    arrayList = null;
                }
                onboardingResultQuizItem = new OnboardingResultItem.OnboardingResultQuizItem(arrayList);
            } else {
                onboardingResultQuizItem = null;
            }
            return OnboardingDialogState.a(onboardingDialogState2, null, onboardingResultQuizItem, false, 5);
        }
        OnboardingResultItem.OnboardingResultCarouselItem onboardingResultCarouselItem2 = onboardingResultItem instanceof OnboardingResultItem.OnboardingResultCarouselItem ? (OnboardingResultItem.OnboardingResultCarouselItem) onboardingResultItem : null;
        if (onboardingResultCarouselItem2 != null) {
            ArrayList arrayList18 = onboardingResultCarouselItem2.f208914b;
            if (arrayList18 != null) {
                arrayList2 = new ArrayList(C42745f0.q(arrayList18, 10));
                Iterator it5 = arrayList18.iterator();
                while (it5.hasNext()) {
                    com.avito.android.onboarding.dialog.view.carousel.OnboardingCarouselItem onboardingCarouselItem2 = (com.avito.android.onboarding.dialog.view.carousel.OnboardingCarouselItem) it5.next();
                    OnboardingDialogInternalAction.UpdateAdditionalButtonLoadingState updateAdditionalButtonLoadingState = (OnboardingDialogInternalAction.UpdateAdditionalButtonLoadingState) onboardingDialogInternalAction2;
                    if (onboardingCarouselItem2.f208969b == updateAdditionalButtonLoadingState.f208904b) {
                        List<AdditionalActionItem> list8 = onboardingCarouselItem2.f208976i;
                        if (list8 != null) {
                            List<AdditionalActionItem> list9 = list8;
                            ArrayList arrayList19 = new ArrayList(C42745f0.q(list9, 10));
                            for (AdditionalActionItem additionalActionItem : list9) {
                                long j12 = additionalActionItem.f208961b;
                                if (j12 == updateAdditionalButtonLoadingState.f208905c) {
                                    it2 = it5;
                                    additionalActionItem = new AdditionalActionItem(j12, additionalActionItem.f208962c, additionalActionItem.f208963d, additionalActionItem.f208964e, additionalActionItem.f208965f, additionalActionItem.f208966g, additionalActionItem.f208967h, updateAdditionalButtonLoadingState.f208906d);
                                } else {
                                    it2 = it5;
                                }
                                arrayList19.add(additionalActionItem);
                                it5 = it2;
                            }
                            it = it5;
                            arrayList3 = arrayList19;
                        } else {
                            it = it5;
                            arrayList3 = null;
                        }
                        onboardingCarouselItem2 = new com.avito.android.onboarding.dialog.view.carousel.OnboardingCarouselItem(onboardingCarouselItem2.f208969b, onboardingCarouselItem2.f208970c, onboardingCarouselItem2.f208971d, onboardingCarouselItem2.f208972e, onboardingCarouselItem2.f208973f, onboardingCarouselItem2.f208974g, onboardingCarouselItem2.f208975h, arrayList3, onboardingCarouselItem2.f208977j, onboardingCarouselItem2.f208978k);
                    } else {
                        it = it5;
                    }
                    arrayList2.add(onboardingCarouselItem2);
                    it5 = it;
                }
            } else {
                arrayList2 = null;
            }
            onboardingResultCarouselItem = new OnboardingResultItem.OnboardingResultCarouselItem(arrayList2);
            z12 = false;
            str = null;
            i16 = 5;
        } else {
            onboardingResultCarouselItem = null;
            z12 = false;
            str = null;
        }
        return OnboardingDialogState.a(onboardingDialogState2, str, onboardingResultCarouselItem, z12, i16);
    }
}
