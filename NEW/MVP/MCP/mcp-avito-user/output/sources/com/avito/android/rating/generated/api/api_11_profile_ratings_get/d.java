package com.avito.android.rating.generated.api.api_11_profile_ratings_get;

import Hg0.C13987A;
import Hg0.p;
import Hg0.r;
import Hg0.s;
import Hg0.u;
import Hg0.v;
import Hg0.w;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api11ProfileRatingsGetResponse.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$a;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$b;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$c;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$d;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$e;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$f;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$g;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$h;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$i;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$j;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$k;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$l;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$m;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$n;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface d {

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$a;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "", "caption", "scoreText", "", "scoreValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d {

        @com.google.gson.annotations.c("caption")
        @Y61.k
        private final String caption;

        @com.google.gson.annotations.c("scoreText")
        @Y61.k
        private final String scoreText;

        @com.google.gson.annotations.c("scoreValue")
        @Y61.l
        private final Double scoreValue;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.l Double d12) {
            this.caption = str;
            this.scoreText = str2;
            this.scoreValue = d12;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getCaption() {
            return this.caption;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getScoreText() {
            return this.scoreText;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final Double getScoreValue() {
            return this.scoreValue;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$b;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "LHg0/d;", "action", "<init>", "(LHg0/d;)V", "LHg0/d;", "a", "()LHg0/d;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements d {

        @com.google.gson.annotations.c("action")
        @Y61.k
        private final Hg0.d action;

        public b(@Y61.k Hg0.d dVar) {
            this.action = dVar;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final Hg0.d getAction() {
            return this.action;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$c;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "", "text", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements d {

        @com.google.gson.annotations.c("text")
        @Y61.k
        private final String text;

        public c(@Y61.k String str) {
            this.text = str;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$d;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "LHg0/e;", "hint", "", "reviewCount", "", "subTitle", "subTitleColor", "title", "titleColor", "titleSize", "<init>", "(LHg0/e;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LHg0/e;", "a", "()LHg0/e;", "Ljava/lang/Long;", "getReviewCount", "()Ljava/lang/Long;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.generated.api.api_11_profile_ratings_get.d$d, reason: collision with other inner class name */
    public static final class C7427d implements d {

        @com.google.gson.annotations.c("hint")
        @Y61.l
        private final Hg0.e hint;

        @com.google.gson.annotations.c("reviewCount")
        @Y61.l
        private final Long reviewCount;

        @com.google.gson.annotations.c("subTitle")
        @Y61.l
        private final String subTitle;

        @com.google.gson.annotations.c("subTitleColor")
        @Y61.l
        private final String subTitleColor;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        @com.google.gson.annotations.c("titleColor")
        @Y61.l
        private final String titleColor;

        @com.google.gson.annotations.c("titleSize")
        @Y61.l
        private final String titleSize;

        public C7427d(@Y61.l Hg0.e eVar, @Y61.l Long l12, @Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5) {
            this.hint = eVar;
            this.reviewCount = l12;
            this.subTitle = str;
            this.subTitleColor = str2;
            this.title = str3;
            this.titleColor = str4;
            this.titleSize = str5;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final Hg0.e getHint() {
            return this.hint;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getSubTitle() {
            return this.subTitle;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getSubTitleColor() {
            return this.subTitleColor;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final String getTitleColor() {
            return this.titleColor;
        }

        @Y61.l
        /* renamed from: f, reason: from getter */
        public final String getTitleSize() {
            return this.titleSize;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$e;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "", "LHg0/k;", "buttons", "LHg0/l;", "feedbackSentInfo", "LHg0/m;", "sections", "LHg0/n;", "title", "<init>", "(Ljava/util/List;LHg0/l;Ljava/util/List;LHg0/n;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "LHg0/l;", "b", "()LHg0/l;", "c", "LHg0/n;", "d", "()LHg0/n;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements d {

        @com.google.gson.annotations.c("buttons")
        @Y61.l
        private final List<Hg0.k> buttons;

        @com.google.gson.annotations.c("feedbackSentInfo")
        @Y61.l
        private final Hg0.l feedbackSentInfo;

        @com.google.gson.annotations.c("sections")
        @Y61.l
        private final List<Hg0.m> sections;

        @com.google.gson.annotations.c("title")
        @Y61.l
        private final Hg0.n title;

        public e(@Y61.l List<Hg0.k> list, @Y61.l Hg0.l lVar, @Y61.l List<Hg0.m> list2, @Y61.l Hg0.n nVar) {
            this.buttons = list;
            this.feedbackSentInfo = lVar;
            this.sections = list2;
            this.title = nVar;
        }

        @Y61.l
        public final List<Hg0.k> a() {
            return this.buttons;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final Hg0.l getFeedbackSentInfo() {
            return this.feedbackSentInfo;
        }

        @Y61.l
        public final List<Hg0.m> c() {
            return this.sections;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Hg0.n getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$f;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "Lcom/avito/android/deep_linking/links/DeepLink;", "analyticsAction", "", "buttonTitle", "", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ParamScoreSummaryEntityScoresItem;", "scores", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements d {

        @com.google.gson.annotations.c("analyticsAction")
        @Y61.l
        private final DeepLink analyticsAction;

        @com.google.gson.annotations.c("buttonTitle")
        @Y61.k
        private final String buttonTitle;

        @com.google.gson.annotations.c("scores")
        @Y61.k
        private final List<ParamScoreSummaryEntityScoresItem> scores;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public f(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.k List<ParamScoreSummaryEntityScoresItem> list, @Y61.k String str2) {
            this.analyticsAction = deepLink;
            this.buttonTitle = str;
            this.scores = list;
            this.title = str2;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final DeepLink getAnalyticsAction() {
            return this.analyticsAction;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @Y61.k
        public final List<ParamScoreSummaryEntityScoresItem> c() {
            return this.scores;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$g;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "LHg0/p;", AdvertDetailsBlockIdKt.BLOCK_ID_CONTACT_BAR, "", "navigationTitle", "nextPage", "", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$i;", "reviews", "<init>", "(LHg0/p;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "LHg0/p;", "a", "()LHg0/p;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements d {

        @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_CONTACT_BAR)
        @Y61.l
        private final p contactBar;

        @com.google.gson.annotations.c("navigationTitle")
        @Y61.l
        private final String navigationTitle;

        @com.google.gson.annotations.c("nextPage")
        @Y61.l
        private final String nextPage;

        @com.google.gson.annotations.c("reviews")
        @Y61.l
        private final List<i> reviews;

        public g(@Y61.l p pVar, @Y61.l String str, @Y61.l String str2, @Y61.l List<i> list) {
            this.contactBar = pVar;
            this.navigationTitle = str;
            this.nextPage = str2;
            this.reviews = list;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final p getContactBar() {
            return this.contactBar;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final String getNavigationTitle() {
            return this.navigationTitle;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getNextPage() {
            return this.nextPage;
        }

        @Y61.l
        public final List<i> d() {
            return this.reviews;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$h;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "LHg0/r;", "ratingAction", "", "reviewCount", "", "LHg0/s;", "statistic", "<init>", "(LHg0/r;JLjava/util/List;)V", "LHg0/r;", "getRatingAction", "()LHg0/r;", "J", "a", "()J", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements d {

        @com.google.gson.annotations.c("ratingAction")
        @Y61.l
        private final r ratingAction;

        @com.google.gson.annotations.c("reviewCount")
        private final long reviewCount;

        @com.google.gson.annotations.c("statistic")
        @Y61.k
        private final List<s> statistic;

        public h(@Y61.l r rVar, long j12, @Y61.k List<s> list) {
            this.ratingAction = rVar;
            this.reviewCount = j12;
            this.statistic = list;
        }

        /* renamed from: a, reason: from getter */
        public final long getReviewCount() {
            return this.reviewCount;
        }

        @Y61.k
        public final List<s> b() {
            return this.statistic;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b*\u0018\u00002\u00020\u0001Bß\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0002\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\b\u0010 \u001a\u0004\u0018\u00010\r¢\u0006\u0004\b!\u0010\"R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u00107R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b8\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b9\u00104R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b:\u00104R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b;\u00104R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\b<\u00104R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\b@\u00104R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\bA\u00104R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00102\u001a\u0004\bB\u00104R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\bC\u00104R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\bD\u0010%R\u001a\u0010\u001f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\bE\u00104R\u001c\u0010 \u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u00102\u001a\u0004\bF\u00104¨\u0006G"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$i;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b;", "actions", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/AnswerEntityV2;", "answer", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedStatusText", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c;", "avatar", "", "canAnswer", "", "deliveryTitle", "", "id", "LHg0/A;", "images", "itemTitle", "itemUrl", "rated", "reviewSubtitle", "", "score", "stageTitle", "status", "subtitle", "text", "LHg0/u;", "textSections", "title", "titleCaption", "<init>", "(Ljava/util/List;Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/AnswerEntityV2;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/AnswerEntityV2;", "b", "()Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/AnswerEntityV2;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c;", "d", "()Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c;", "Ljava/lang/Boolean;", "getCanAnswer", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "g", "h", "getItemUrl", "i", "getReviewSubtitle", "Ljava/lang/Double;", "j", "()Ljava/lang/Double;", "k", "l", "getSubtitle", "getText", "m", "n", "o", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements d {

        @com.google.gson.annotations.c("actions")
        @Y61.l
        private final List<com.avito.android.rating.generated.api.api_11_profile_ratings_get.b> actions;

        @com.google.gson.annotations.c("answer")
        @Y61.l
        private final AnswerEntityV2 answer;

        @com.google.gson.annotations.c("attributedStatusText")
        @Y61.l
        private final AttributedText attributedStatusText;

        @com.google.gson.annotations.c("avatar")
        @Y61.l
        private final com.avito.android.rating.generated.api.api_11_profile_ratings_get.c avatar;

        @com.google.gson.annotations.c("canAnswer")
        @Y61.l
        private final Boolean canAnswer;

        @com.google.gson.annotations.c("deliveryTitle")
        @Y61.l
        private final String deliveryTitle;

        @com.google.gson.annotations.c("id")
        @Y61.l
        private final Long id;

        @com.google.gson.annotations.c("images")
        @Y61.l
        private final List<C13987A> images;

        @com.google.gson.annotations.c("itemTitle")
        @Y61.l
        private final String itemTitle;

        @com.google.gson.annotations.c("itemUrl")
        @Y61.l
        private final String itemUrl;

        @com.google.gson.annotations.c("rated")
        @Y61.l
        private final String rated;

        @com.google.gson.annotations.c("reviewSubtitle")
        @Y61.l
        private final String reviewSubtitle;

        @com.google.gson.annotations.c("score")
        @Y61.l
        private final Double score;

        @com.google.gson.annotations.c("stageTitle")
        @Y61.l
        private final String stageTitle;

        @com.google.gson.annotations.c("status")
        @Y61.l
        private final String status;

        @com.google.gson.annotations.c("subtitle")
        @Y61.l
        private final String subtitle;

        @com.google.gson.annotations.c("text")
        @Y61.l
        private final String text;

        @com.google.gson.annotations.c("textSections")
        @Y61.l
        private final List<u> textSections;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        @com.google.gson.annotations.c("titleCaption")
        @Y61.l
        private final String titleCaption;

        /* JADX WARN: Multi-variable type inference failed */
        public i(@Y61.l List<? extends com.avito.android.rating.generated.api.api_11_profile_ratings_get.b> list, @Y61.l AnswerEntityV2 answerEntityV2, @Y61.l AttributedText attributedText, @Y61.l com.avito.android.rating.generated.api.api_11_profile_ratings_get.c cVar, @Y61.l Boolean bool, @Y61.l String str, @Y61.l Long l12, @Y61.l List<C13987A> list2, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Double d12, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l List<u> list3, @Y61.k String str10, @Y61.l String str11) {
            this.actions = list;
            this.answer = answerEntityV2;
            this.attributedStatusText = attributedText;
            this.avatar = cVar;
            this.canAnswer = bool;
            this.deliveryTitle = str;
            this.id = l12;
            this.images = list2;
            this.itemTitle = str2;
            this.itemUrl = str3;
            this.rated = str4;
            this.reviewSubtitle = str5;
            this.score = d12;
            this.stageTitle = str6;
            this.status = str7;
            this.subtitle = str8;
            this.text = str9;
            this.textSections = list3;
            this.title = str10;
            this.titleCaption = str11;
        }

        @Y61.l
        public final List<com.avito.android.rating.generated.api.api_11_profile_ratings_get.b> a() {
            return this.actions;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final AnswerEntityV2 getAnswer() {
            return this.answer;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final AttributedText getAttributedStatusText() {
            return this.attributedStatusText;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final com.avito.android.rating.generated.api.api_11_profile_ratings_get.c getAvatar() {
            return this.avatar;
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final String getDeliveryTitle() {
            return this.deliveryTitle;
        }

        @Y61.l
        /* renamed from: f, reason: from getter */
        public final Long getId() {
            return this.id;
        }

        @Y61.l
        public final List<C13987A> g() {
            return this.images;
        }

        @Y61.l
        /* renamed from: h, reason: from getter */
        public final String getItemTitle() {
            return this.itemTitle;
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final String getRated() {
            return this.rated;
        }

        @Y61.l
        /* renamed from: j, reason: from getter */
        public final Double getScore() {
            return this.score;
        }

        @Y61.l
        /* renamed from: k, reason: from getter */
        public final String getStageTitle() {
            return this.stageTitle;
        }

        @Y61.l
        /* renamed from: l, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        @Y61.l
        public final List<u> m() {
            return this.textSections;
        }

        @Y61.k
        /* renamed from: n, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Y61.l
        /* renamed from: o, reason: from getter */
        public final String getTitleCaption() {
            return this.titleCaption;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$j;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "", "activeReviewsCount", "", "LHg0/v;", "ratingStat", "reviewCount", "score", "", "scoreFloat", "", "subtitle", "title", "<init>", "(Ljava/lang/Long;Ljava/util/List;JJDLjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Long;", "getActiveReviewsCount", "()Ljava/lang/Long;", "Ljava/util/List;", "a", "()Ljava/util/List;", "J", "b", "()J", "c", "D", "d", "()D", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements d {

        @com.google.gson.annotations.c("activeReviewsCount")
        @Y61.l
        private final Long activeReviewsCount;

        @com.google.gson.annotations.c("ratingStat")
        @Y61.k
        private final List<v> ratingStat;

        @com.google.gson.annotations.c("reviewCount")
        private final long reviewCount;

        @com.google.gson.annotations.c("score")
        private final long score;

        @com.google.gson.annotations.c("scoreFloat")
        private final double scoreFloat;

        @com.google.gson.annotations.c("subtitle")
        @Y61.k
        private final String subtitle;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public j(@Y61.l Long l12, @Y61.k List<v> list, long j12, long j13, double d12, @Y61.k String str, @Y61.k String str2) {
            this.activeReviewsCount = l12;
            this.ratingStat = list;
            this.reviewCount = j12;
            this.score = j13;
            this.scoreFloat = d12;
            this.subtitle = str;
            this.title = str2;
        }

        @Y61.k
        public final List<v> a() {
            return this.ratingStat;
        }

        /* renamed from: b, reason: from getter */
        public final long getReviewCount() {
            return this.reviewCount;
        }

        /* renamed from: c, reason: from getter */
        public final long getScore() {
            return this.score;
        }

        /* renamed from: d, reason: from getter */
        public final double getScoreFloat() {
            return this.scoreFloat;
        }

        @Y61.k
        /* renamed from: e, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Y61.k
        /* renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$k;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "LHg0/w;", SearchParamsConverterKt.SORT, "<init>", "(LHg0/w;)V", "LHg0/w;", "getSort", "()LHg0/w;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements d {

        @com.google.gson.annotations.c(SearchParamsConverterKt.SORT)
        @Y61.l
        private final w sort;

        public k(@Y61.l w wVar) {
            this.sort = wVar;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$l;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/e;", "blocks", "", "requiredFilters", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements d {

        @com.google.gson.annotations.c("blocks")
        @Y61.k
        private final List<com.avito.android.rating.generated.api.api_11_profile_ratings_get.e> blocks;

        @com.google.gson.annotations.c("requiredFilters")
        @Y61.l
        private final List<String> requiredFilters;

        /* JADX WARN: Multi-variable type inference failed */
        public l(@Y61.k List<? extends com.avito.android.rating.generated.api.api_11_profile_ratings_get.e> list, @Y61.l List<String> list2) {
            this.blocks = list;
            this.requiredFilters = list2;
        }

        @Y61.k
        public final List<com.avito.android.rating.generated.api.api_11_profile_ratings_get.e> a() {
            return this.blocks;
        }

        @Y61.l
        public final List<String> b() {
            return this.requiredFilters;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$m;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m implements d {

        @com.google.gson.annotations.c("message")
        @Y61.k
        private final String message;

        public m(@Y61.k String str) {
            this.message = str;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d$n;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/d;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f247592a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 1169026522;
        }

        @Y61.k
        public final String toString() {
            return "Unknown";
        }
    }
}
