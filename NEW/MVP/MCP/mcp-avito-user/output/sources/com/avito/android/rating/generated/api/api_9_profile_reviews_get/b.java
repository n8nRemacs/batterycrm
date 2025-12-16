package com.avito.android.rating.generated.api.api_9_profile_reviews_get;

import Ig0.i;
import Ig0.j;
import Ig0.o;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Api9ProfileReviewsGetResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b;", "", "a", "b", "c", "d", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b$a;", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b$b;", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b$c;", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b$d;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: Api9ProfileReviewsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b$a;", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b;", "LIg0/k;", "buyer", "<init>", "(LIg0/k;)V", "LIg0/k;", "a", "()LIg0/k;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        @com.google.gson.annotations.c("buyer")
        @k
        private final Ig0.k buyer;

        public a(@k Ig0.k kVar) {
            this.buyer = kVar;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final Ig0.k getBuyer() {
            return this.buyer;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.buyer, ((a) obj).buyer);
        }

        public final int hashCode() {
            return this.buyer.hashCode();
        }

        @k
        public final String toString() {
            return "Buyer(buyer=" + this.buyer + ')';
        }
    }

    /* compiled from: Api9ProfileReviewsGetResponse.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\u0018\u00002\u00020\u0001B×\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0002¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b0\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b4\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b5\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b6\u0010,R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010*\u001a\u0004\b7\u0010,R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\b8\u0010,R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b9\u0010,R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b=\u0010,R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b>\u0010,R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010*\u001a\u0004\b?\u0010,R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b@\u0010,R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\bA\u0010#¨\u0006B"}, d2 = {"Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b$b;", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b;", "", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/f;", "actions", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/AnswerEntityV2;", "answer", "LIg0/i;", "author", "", "createdAt", "", "id", "LIg0/o;", "images", "Lcom/avito/android/deep_linking/links/DeepLink;", "modelCardLink", "modelExperience", "modelInfo", "modelTitle", "rated", "rejectMessage", "reviewTitle", "", "score", "scoreDescription", "status", "statusText", "text", "LIg0/j;", "textSections", "<init>", "(Ljava/util/List;Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/AnswerEntityV2;LIg0/i;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/AnswerEntityV2;", "b", "()Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/AnswerEntityV2;", "LIg0/i;", "c", "()LIg0/i;", "Ljava/lang/String;", "getCreatedAt", "()Ljava/lang/String;", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "e", "Lcom/avito/android/deep_linking/links/DeepLink;", "getModelCardLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getModelExperience", "getModelInfo", "f", "g", "h", "i", "Ljava/lang/Double;", "j", "()Ljava/lang/Double;", "k", "l", "m", "getText", "n", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.generated.api.api_9_profile_reviews_get.b$b, reason: collision with other inner class name */
    public static final class C7429b implements b {

        @com.google.gson.annotations.c("actions")
        @l
        private final List<f> actions;

        @com.google.gson.annotations.c("answer")
        @l
        private final AnswerEntityV2 answer;

        @com.google.gson.annotations.c("author")
        @l
        private final i author;

        @com.google.gson.annotations.c("createdAt")
        @l
        private final String createdAt;

        @com.google.gson.annotations.c("id")
        @l
        private final Long id;

        @com.google.gson.annotations.c("images")
        @l
        private final List<o> images;

        @com.google.gson.annotations.c("modelCardLink")
        @l
        private final DeepLink modelCardLink;

        @com.google.gson.annotations.c("modelExperience")
        @l
        private final String modelExperience;

        @com.google.gson.annotations.c("modelInfo")
        @l
        private final String modelInfo;

        @com.google.gson.annotations.c("modelTitle")
        @l
        private final String modelTitle;

        @com.google.gson.annotations.c("rated")
        @l
        private final String rated;

        @com.google.gson.annotations.c("rejectMessage")
        @l
        private final String rejectMessage;

        @com.google.gson.annotations.c("reviewTitle")
        @l
        private final String reviewTitle;

        @com.google.gson.annotations.c("score")
        @l
        private final Double score;

        @com.google.gson.annotations.c("scoreDescription")
        @l
        private final String scoreDescription;

        @com.google.gson.annotations.c("status")
        @l
        private final String status;

        @com.google.gson.annotations.c("statusText")
        @l
        private final String statusText;

        @com.google.gson.annotations.c("text")
        @l
        private final String text;

        @com.google.gson.annotations.c("textSections")
        @l
        private final List<j> textSections;

        /* JADX WARN: Multi-variable type inference failed */
        public C7429b(@l List<? extends f> list, @l AnswerEntityV2 answerEntityV2, @l i iVar, @l String str, @l Long l12, @l List<o> list2, @l DeepLink deepLink, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l Double d12, @l String str8, @l String str9, @l String str10, @l String str11, @l List<j> list3) {
            this.actions = list;
            this.answer = answerEntityV2;
            this.author = iVar;
            this.createdAt = str;
            this.id = l12;
            this.images = list2;
            this.modelCardLink = deepLink;
            this.modelExperience = str2;
            this.modelInfo = str3;
            this.modelTitle = str4;
            this.rated = str5;
            this.rejectMessage = str6;
            this.reviewTitle = str7;
            this.score = d12;
            this.scoreDescription = str8;
            this.status = str9;
            this.statusText = str10;
            this.text = str11;
            this.textSections = list3;
        }

        @l
        public final List<f> a() {
            return this.actions;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final AnswerEntityV2 getAnswer() {
            return this.answer;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final i getAuthor() {
            return this.author;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Long getId() {
            return this.id;
        }

        @l
        public final List<o> e() {
            return this.images;
        }

        @l
        /* renamed from: f, reason: from getter */
        public final String getModelTitle() {
            return this.modelTitle;
        }

        @l
        /* renamed from: g, reason: from getter */
        public final String getRated() {
            return this.rated;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final String getRejectMessage() {
            return this.rejectMessage;
        }

        @l
        /* renamed from: i, reason: from getter */
        public final String getReviewTitle() {
            return this.reviewTitle;
        }

        @l
        /* renamed from: j, reason: from getter */
        public final Double getScore() {
            return this.score;
        }

        @l
        /* renamed from: k, reason: from getter */
        public final String getScoreDescription() {
            return this.scoreDescription;
        }

        @l
        /* renamed from: l, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        @l
        /* renamed from: m, reason: from getter */
        public final String getStatusText() {
            return this.statusText;
        }

        @l
        public final List<j> n() {
            return this.textSections;
        }
    }

    /* compiled from: Api9ProfileReviewsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b$c;", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b;", "LIg0/k;", "seller", "<init>", "(LIg0/k;)V", "LIg0/k;", "a", "()LIg0/k;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        @com.google.gson.annotations.c("seller")
        @k
        private final Ig0.k seller;

        public c(@k Ig0.k kVar) {
            this.seller = kVar;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final Ig0.k getSeller() {
            return this.seller;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.seller, ((c) obj).seller);
        }

        public final int hashCode() {
            return this.seller.hashCode();
        }

        @k
        public final String toString() {
            return "Seller(seller=" + this.seller + ')';
        }
    }

    /* compiled from: Api9ProfileReviewsGetResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b$d;", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f247610a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1976776816;
        }

        @k
        public final String toString() {
            return "Unknown";
        }
    }
}
