package com.avito.android.rating.details.answer.text.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.rating.details.answer.photo.RatingAddAnswerPhotoArguments;
import com.avito.android.rating.details.answer.text.RatingAddAnswerTextValidationInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingAddAnswerTextInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Continue", "HideKeyboard", "ShowKeyboard", "UpdateState", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction$Continue;", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction$HideKeyboard;", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction$ShowKeyboard;", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction$UpdateState;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RatingAddAnswerTextInternalAction extends n {

    /* compiled from: RatingAddAnswerTextInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction$Continue;", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Continue implements RatingAddAnswerTextInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RatingAddAnswerPhotoArguments f246878b;

        public Continue(@k RatingAddAnswerPhotoArguments ratingAddAnswerPhotoArguments) {
            this.f246878b = ratingAddAnswerPhotoArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Continue) && L.f(this.f246878b, ((Continue) obj).f246878b);
        }

        public final int hashCode() {
            return this.f246878b.hashCode();
        }

        @k
        public final String toString() {
            return "Continue(arguments=" + this.f246878b + ')';
        }
    }

    /* compiled from: RatingAddAnswerTextInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction$HideKeyboard;", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction;", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HideKeyboard implements RatingAddAnswerTextInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideKeyboard f246879b = new HideKeyboard();

        private HideKeyboard() {
        }
    }

    /* compiled from: RatingAddAnswerTextInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction$ShowKeyboard;", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction;", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowKeyboard implements RatingAddAnswerTextInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowKeyboard f246880b = new ShowKeyboard();

        private ShowKeyboard() {
        }
    }

    /* compiled from: RatingAddAnswerTextInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction$UpdateState;", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateState implements RatingAddAnswerTextInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f246881b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final RatingAddAnswerTextValidationInteractor.ValidationTextResult f246882c;

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateState() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateState)) {
                return false;
            }
            UpdateState updateState = (UpdateState) obj;
            return L.f(this.f246881b, updateState.f246881b) && L.f(this.f246882c, updateState.f246882c);
        }

        public final int hashCode() {
            String str = this.f246881b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            RatingAddAnswerTextValidationInteractor.ValidationTextResult validationTextResult = this.f246882c;
            return iHashCode + (validationTextResult != null ? validationTextResult.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "UpdateState(text=" + this.f246881b + ", validationTextResult=" + this.f246882c + ')';
        }

        public UpdateState(@l String str, @l RatingAddAnswerTextValidationInteractor.ValidationTextResult validationTextResult) {
            this.f246881b = str;
            this.f246882c = validationTextResult;
        }

        public /* synthetic */ UpdateState(String str, RatingAddAnswerTextValidationInteractor.ValidationTextResult validationTextResult, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : validationTextResult);
        }
    }
}
