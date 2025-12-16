package com.avito.android.remote.model.onboarding;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OnboardingQuiz.kt */
@d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b/\u0010+R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/onboarding/OnboardingQuizItem;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/onboarding/QuizAnswersItem;", "answers", "", "buttonTitle", "Lcom/avito/android/remote/model/onboarding/ButtonAction;", "buttonAction", "Lcom/avito/android/remote/model/onboarding/RequestType;", "requestType", "Lcom/avito/android/remote/model/text/AttributedText;", "questionText", "Lcom/avito/android/remote/model/onboarding/QuizQuestion;", "question", "title", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/onboarding/ButtonAction;Lcom/avito/android/remote/model/onboarding/RequestType;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/onboarding/QuizQuestion;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getAnswers", "()Ljava/util/List;", "Ljava/lang/String;", "getButtonTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/onboarding/ButtonAction;", "getButtonAction", "()Lcom/avito/android/remote/model/onboarding/ButtonAction;", "Lcom/avito/android/remote/model/onboarding/RequestType;", "getRequestType", "()Lcom/avito/android/remote/model/onboarding/RequestType;", "Lcom/avito/android/remote/model/text/AttributedText;", "getQuestionText", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/onboarding/QuizQuestion;", "getQuestion", "()Lcom/avito/android/remote/model/onboarding/QuizQuestion;", "getTitle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OnboardingQuizItem implements Parcelable {

    @k
    public static final Parcelable.Creator<OnboardingQuizItem> CREATOR = new Creator();

    @c("answers")
    @l
    private final List<QuizAnswersItem> answers;

    @c("buttonAction")
    @l
    private final ButtonAction buttonAction;

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c("image")
    @l
    private final UniversalImage image;

    @c("question")
    @l
    private final QuizQuestion question;

    @c("questionText")
    @l
    private final AttributedText questionText;

    @c("requestType")
    @l
    private final RequestType requestType;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: OnboardingQuiz.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnboardingQuizItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OnboardingQuizItem createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(QuizAnswersItem.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new OnboardingQuizItem(arrayList, parcel.readString(), parcel.readInt() == 0 ? null : ButtonAction.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RequestType.valueOf(parcel.readString()), (AttributedText) parcel.readParcelable(OnboardingQuizItem.class.getClassLoader()), parcel.readInt() != 0 ? QuizQuestion.CREATOR.createFromParcel(parcel) : null, (AttributedText) parcel.readParcelable(OnboardingQuizItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(OnboardingQuizItem.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OnboardingQuizItem[] newArray(int i12) {
            return new OnboardingQuizItem[i12];
        }
    }

    public OnboardingQuizItem() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<QuizAnswersItem> getAnswers() {
        return this.answers;
    }

    @l
    public final ButtonAction getButtonAction() {
        return this.buttonAction;
    }

    @l
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final QuizQuestion getQuestion() {
        return this.question;
    }

    @l
    public final AttributedText getQuestionText() {
        return this.questionText;
    }

    @l
    public final RequestType getRequestType() {
        return this.requestType;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<QuizAnswersItem> list = this.answers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((QuizAnswersItem) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.buttonTitle);
        ButtonAction buttonAction = this.buttonAction;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(buttonAction.name());
        }
        RequestType requestType = this.requestType;
        if (requestType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(requestType.name());
        }
        parcel.writeParcelable(this.questionText, flags);
        QuizQuestion quizQuestion = this.question;
        if (quizQuestion == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quizQuestion.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.image, flags);
    }

    public OnboardingQuizItem(@l List<QuizAnswersItem> list, @l String str, @l ButtonAction buttonAction, @l RequestType requestType, @l AttributedText attributedText, @l QuizQuestion quizQuestion, @l AttributedText attributedText2, @l UniversalImage universalImage) {
        this.answers = list;
        this.buttonTitle = str;
        this.buttonAction = buttonAction;
        this.requestType = requestType;
        this.questionText = attributedText;
        this.question = quizQuestion;
        this.title = attributedText2;
        this.image = universalImage;
    }

    public /* synthetic */ OnboardingQuizItem(List list, String str, ButtonAction buttonAction, RequestType requestType, AttributedText attributedText, QuizQuestion quizQuestion, AttributedText attributedText2, UniversalImage universalImage, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : buttonAction, (i12 & 8) != 0 ? null : requestType, (i12 & 16) != 0 ? null : attributedText, (i12 & 32) != 0 ? null : quizQuestion, (i12 & 64) != 0 ? null : attributedText2, (i12 & 128) == 0 ? universalImage : null);
    }
}
