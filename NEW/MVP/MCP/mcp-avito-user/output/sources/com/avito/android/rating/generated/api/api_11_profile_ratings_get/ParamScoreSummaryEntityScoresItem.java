package com.avito.android.rating.generated.api.api_11_profile_ratings_get;

import Hg0.o;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: Api11ProfileRatingsGetResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0018B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ParamScoreSummaryEntityScoresItem;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", "analyticsAction", "LHg0/o;", "details", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ParamScoreSummaryEntityScoresItem$ScoreState;", "scoreState", "", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;LHg0/o;Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ParamScoreSummaryEntityScoresItem$ScoreState;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAnalyticsAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LHg0/o;", "a", "()LHg0/o;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ParamScoreSummaryEntityScoresItem$ScoreState;", "b", "()Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ParamScoreSummaryEntityScoresItem$ScoreState;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "ScoreState", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ParamScoreSummaryEntityScoresItem {

    @com.google.gson.annotations.c("analyticsAction")
    @l
    private final DeepLink analyticsAction;

    @com.google.gson.annotations.c("details")
    @k
    private final o details;

    @com.google.gson.annotations.c("scoreState")
    @k
    private final ScoreState scoreState;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ParamScoreSummaryEntityScoresItem$ScoreState;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Positive", "Negative", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScoreState {

        @com.google.gson.annotations.c("negative")
        public static final ScoreState Negative;

        @com.google.gson.annotations.c("positive")
        public static final ScoreState Positive;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ScoreState[] f247580b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f247581c;

        static {
            ScoreState scoreState = new ScoreState("Positive", 0, "positive");
            Positive = scoreState;
            ScoreState scoreState2 = new ScoreState("Negative", 1, "negative");
            Negative = scoreState2;
            ScoreState[] scoreStateArr = {scoreState, scoreState2};
            f247580b = scoreStateArr;
            f247581c = kotlin.enums.c.a(scoreStateArr);
        }

        private ScoreState(String str, int i12, String str2) {
        }

        public static ScoreState valueOf(String str) {
            return (ScoreState) Enum.valueOf(ScoreState.class, str);
        }

        public static ScoreState[] values() {
            return (ScoreState[]) f247580b.clone();
        }
    }

    public ParamScoreSummaryEntityScoresItem(@l DeepLink deepLink, @k o oVar, @k ScoreState scoreState, @k String str) {
        this.analyticsAction = deepLink;
        this.details = oVar;
        this.scoreState = scoreState;
        this.title = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final o getDetails() {
        return this.details;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final ScoreState getScoreState() {
        return this.scoreState;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
