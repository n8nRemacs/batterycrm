package com.avito.android.remote.model.ux_feedback;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: RatingUxFeedbackResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/ux_feedback/RatingUxFeedbackResult;", "", "Error", "Ok", "Lcom/avito/android/remote/model/ux_feedback/RatingUxFeedbackResult$Error;", "Lcom/avito/android/remote/model/ux_feedback/RatingUxFeedbackResult$Ok;", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RatingUxFeedbackResult {

    /* compiled from: RatingUxFeedbackResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/ux_feedback/RatingUxFeedbackResult$Error;", "Lcom/avito/android/remote/model/ux_feedback/RatingUxFeedbackResult;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error implements RatingUxFeedbackResult {

        @c("error")
        @l
        private final String error;

        public Error(@l String str) {
            this.error = str;
        }

        @l
        public final String getError() {
            return this.error;
        }
    }

    /* compiled from: RatingUxFeedbackResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/ux_feedback/RatingUxFeedbackResult$Ok;", "Lcom/avito/android/remote/model/ux_feedback/RatingUxFeedbackResult;", "eventName", "", "(Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok implements RatingUxFeedbackResult {

        @c("surveyID")
        @k
        private final String eventName;

        public Ok(@k String str) {
            this.eventName = str;
        }

        @k
        public final String getEventName() {
            return this.eventName;
        }
    }
}
