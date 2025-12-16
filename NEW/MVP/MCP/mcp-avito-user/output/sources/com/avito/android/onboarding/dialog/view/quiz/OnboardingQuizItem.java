package com.avito.android.onboarding.dialog.view.quiz;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.onboarding.dialog.view.OnboardingDialogItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.onboarding.ButtonAction;
import com.avito.android.remote.model.onboarding.QuizQuestion;
import com.avito.android.remote.model.onboarding.RequestType;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnboardingQuizItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/view/quiz/OnboardingQuizItem;", "Lcom/avito/android/onboarding/dialog/view/OnboardingDialogItem;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OnboardingQuizItem implements OnboardingDialogItem {

    @k
    public static final Parcelable.Creator<OnboardingQuizItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f209031b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<AnswerChipable> f209032c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f209033d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ButtonAction f209034e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Boolean f209035f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final RequestType f209036g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final QuizQuestion f209037h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final AttributedText f209038i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final AttributedText f209039j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final UniversalImage f209040k;

    /* compiled from: OnboardingQuizItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OnboardingQuizItem> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingQuizItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            long j12 = parcel.readLong();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AnswerChipable.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            String string = parcel.readString();
            ButtonAction buttonActionValueOf = parcel.readInt() == 0 ? null : ButtonAction.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OnboardingQuizItem(j12, arrayList, string, buttonActionValueOf, boolValueOf, parcel.readInt() == 0 ? null : RequestType.valueOf(parcel.readString()), (QuizQuestion) parcel.readParcelable(OnboardingQuizItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(OnboardingQuizItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(OnboardingQuizItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(OnboardingQuizItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingQuizItem[] newArray(int i12) {
            return new OnboardingQuizItem[i12];
        }
    }

    public OnboardingQuizItem(long j12, @l List<AnswerChipable> list, @l String str, @l ButtonAction buttonAction, @l Boolean bool, @l RequestType requestType, @l QuizQuestion quizQuestion, @l AttributedText attributedText, @l AttributedText attributedText2, @l UniversalImage universalImage) {
        this.f209031b = j12;
        this.f209032c = list;
        this.f209033d = str;
        this.f209034e = buttonAction;
        this.f209035f = bool;
        this.f209036g = requestType;
        this.f209037h = quizQuestion;
        this.f209038i = attributedText;
        this.f209039j = attributedText2;
        this.f209040k = universalImage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OnboardingQuizItem a(OnboardingQuizItem onboardingQuizItem, ArrayList arrayList, Boolean bool, int i12) {
        List list = arrayList;
        if ((i12 & 2) != 0) {
            list = onboardingQuizItem.f209032c;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            bool = onboardingQuizItem.f209035f;
        }
        return new OnboardingQuizItem(onboardingQuizItem.f209031b, list2, onboardingQuizItem.f209033d, onboardingQuizItem.f209034e, bool, onboardingQuizItem.f209036g, onboardingQuizItem.f209037h, onboardingQuizItem.f209038i, onboardingQuizItem.f209039j, onboardingQuizItem.f209040k);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingQuizItem)) {
            return false;
        }
        OnboardingQuizItem onboardingQuizItem = (OnboardingQuizItem) obj;
        return this.f209031b == onboardingQuizItem.f209031b && L.f(this.f209032c, onboardingQuizItem.f209032c) && L.f(this.f209033d, onboardingQuizItem.f209033d) && this.f209034e == onboardingQuizItem.f209034e && L.f(this.f209035f, onboardingQuizItem.f209035f) && this.f209036g == onboardingQuizItem.f209036g && L.f(this.f209037h, onboardingQuizItem.f209037h) && L.f(this.f209038i, onboardingQuizItem.f209038i) && L.f(this.f209039j, onboardingQuizItem.f209039j) && L.f(this.f209040k, onboardingQuizItem.f209040k);
    }

    @Override // com.avito.android.onboarding.dialog.view.OnboardingDialogItem
    /* renamed from: getId, reason: from getter */
    public final long getF209023b() {
        return this.f209031b;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f209031b) * 31;
        List<AnswerChipable> list = this.f209032c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f209033d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ButtonAction buttonAction = this.f209034e;
        int iHashCode4 = (iHashCode3 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        Boolean bool = this.f209035f;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        RequestType requestType = this.f209036g;
        int iHashCode6 = (iHashCode5 + (requestType == null ? 0 : requestType.hashCode())) * 31;
        QuizQuestion quizQuestion = this.f209037h;
        int iHashCode7 = (iHashCode6 + (quizQuestion == null ? 0 : quizQuestion.hashCode())) * 31;
        AttributedText attributedText = this.f209038i;
        int iHashCode8 = (iHashCode7 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f209039j;
        int iHashCode9 = (iHashCode8 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        UniversalImage universalImage = this.f209040k;
        return iHashCode9 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingQuizItem(id=");
        sb2.append(this.f209031b);
        sb2.append(", answers=");
        sb2.append(this.f209032c);
        sb2.append(", buttonTitle=");
        sb2.append(this.f209033d);
        sb2.append(", buttonAction=");
        sb2.append(this.f209034e);
        sb2.append(", isButtonLoading=");
        sb2.append(this.f209035f);
        sb2.append(", requestType=");
        sb2.append(this.f209036g);
        sb2.append(", question=");
        sb2.append(this.f209037h);
        sb2.append(", title=");
        sb2.append(this.f209038i);
        sb2.append(", questionText=");
        sb2.append(this.f209039j);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f209040k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f209031b);
        List<AnswerChipable> list = this.f209032c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AnswerChipable) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeString(this.f209033d);
        ButtonAction buttonAction = this.f209034e;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(buttonAction.name());
        }
        Boolean bool = this.f209035f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        RequestType requestType = this.f209036g;
        if (requestType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(requestType.name());
        }
        parcel.writeParcelable(this.f209037h, i12);
        parcel.writeParcelable(this.f209038i, i12);
        parcel.writeParcelable(this.f209039j, i12);
        parcel.writeParcelable(this.f209040k, i12);
    }
}
