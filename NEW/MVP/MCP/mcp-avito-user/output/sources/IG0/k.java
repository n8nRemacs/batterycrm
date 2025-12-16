package Ig0;

import com.avito.android.rating.generated.api.api_9_profile_reviews_get.AnswerEntityV2;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api9ProfileReviewsGetResponse.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b*\u0018\u00002\u00020\u0001Bé\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0002\u0012\u0006\u0010!\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b3\u00102R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u00106R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b7\u0010&R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b8\u00102R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b9\u00102R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\b=\u00102R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\b>\u00102R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\bB\u00102R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00100\u001a\u0004\bC\u00102R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00100\u001a\u0004\bD\u00102R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\bE\u00102R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00100\u001a\u0004\bF\u00102R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\bG\u0010&R\u001a\u0010!\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00100\u001a\u0004\bH\u00102¨\u0006I"}, d2 = {"LIg0/k;", "", "", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/f;", "actions", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/AnswerEntityV2;", "answer", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedStatusText", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/d;", "avatar", "", "createdAt", "deliveryTitle", "", "id", "LIg0/o;", "images", "itemTitle", "rated", "LIg0/l;", "recipient", "rejectMessage", "reviewSubtitle", "", "score", "stageTitle", "status", "statusText", "subtitle", "text", "LIg0/m;", "textSections", "title", "<init>", "(Ljava/util/List;Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/AnswerEntityV2;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LIg0/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/AnswerEntityV2;", "b", "()Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/AnswerEntityV2;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/d;", "d", "()Lcom/avito/android/rating/generated/api/api_9_profile_reviews_get/d;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "h", "i", "j", "LIg0/l;", "k", "()LIg0/l;", "l", "m", "Ljava/lang/Double;", "n", "()Ljava/lang/Double;", "o", "p", "q", "getSubtitle", "getText", "r", "s", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k {

    @com.google.gson.annotations.c("actions")
    @Y61.l
    private final List<com.avito.android.rating.generated.api.api_9_profile_reviews_get.f> actions;

    @com.google.gson.annotations.c("answer")
    @Y61.l
    private final AnswerEntityV2 answer;

    @com.google.gson.annotations.c("attributedStatusText")
    @Y61.l
    private final AttributedText attributedStatusText;

    @com.google.gson.annotations.c("avatar")
    @Y61.l
    private final com.avito.android.rating.generated.api.api_9_profile_reviews_get.d avatar;

    @com.google.gson.annotations.c("createdAt")
    @Y61.l
    private final String createdAt;

    @com.google.gson.annotations.c("deliveryTitle")
    @Y61.l
    private final String deliveryTitle;

    @com.google.gson.annotations.c("id")
    @Y61.l
    private final Long id;

    @com.google.gson.annotations.c("images")
    @Y61.l
    private final List<o> images;

    @com.google.gson.annotations.c("itemTitle")
    @Y61.l
    private final String itemTitle;

    @com.google.gson.annotations.c("rated")
    @Y61.l
    private final String rated;

    @com.google.gson.annotations.c("recipient")
    @Y61.l
    private final l recipient;

    @com.google.gson.annotations.c("rejectMessage")
    @Y61.l
    private final String rejectMessage;

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

    @com.google.gson.annotations.c("statusText")
    @Y61.l
    private final String statusText;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final String subtitle;

    @com.google.gson.annotations.c("text")
    @Y61.l
    private final String text;

    @com.google.gson.annotations.c("textSections")
    @Y61.l
    private final List<m> textSections;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@Y61.l List<? extends com.avito.android.rating.generated.api.api_9_profile_reviews_get.f> list, @Y61.l AnswerEntityV2 answerEntityV2, @Y61.l AttributedText attributedText, @Y61.l com.avito.android.rating.generated.api.api_9_profile_reviews_get.d dVar, @Y61.l String str, @Y61.l String str2, @Y61.l Long l12, @Y61.l List<o> list2, @Y61.l String str3, @Y61.l String str4, @Y61.l l lVar, @Y61.l String str5, @Y61.l String str6, @Y61.l Double d12, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10, @Y61.l String str11, @Y61.l List<m> list3, @Y61.k String str12) {
        this.actions = list;
        this.answer = answerEntityV2;
        this.attributedStatusText = attributedText;
        this.avatar = dVar;
        this.createdAt = str;
        this.deliveryTitle = str2;
        this.id = l12;
        this.images = list2;
        this.itemTitle = str3;
        this.rated = str4;
        this.recipient = lVar;
        this.rejectMessage = str5;
        this.reviewSubtitle = str6;
        this.score = d12;
        this.stageTitle = str7;
        this.status = str8;
        this.statusText = str9;
        this.subtitle = str10;
        this.text = str11;
        this.textSections = list3;
        this.title = str12;
    }

    @Y61.l
    public final List<com.avito.android.rating.generated.api.api_9_profile_reviews_get.f> a() {
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
    public final com.avito.android.rating.generated.api.api_9_profile_reviews_get.d getAvatar() {
        return this.avatar;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final String getDeliveryTitle() {
        return this.deliveryTitle;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @Y61.l
    public final List<o> h() {
        return this.images;
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final String getItemTitle() {
        return this.itemTitle;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final String getRated() {
        return this.rated;
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final l getRecipient() {
        return this.recipient;
    }

    @Y61.l
    /* renamed from: l, reason: from getter */
    public final String getRejectMessage() {
        return this.rejectMessage;
    }

    @Y61.l
    /* renamed from: m, reason: from getter */
    public final String getReviewSubtitle() {
        return this.reviewSubtitle;
    }

    @Y61.l
    /* renamed from: n, reason: from getter */
    public final Double getScore() {
        return this.score;
    }

    @Y61.l
    /* renamed from: o, reason: from getter */
    public final String getStageTitle() {
        return this.stageTitle;
    }

    @Y61.l
    /* renamed from: p, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Y61.l
    /* renamed from: q, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    @Y61.l
    public final List<m> r() {
        return this.textSections;
    }

    @Y61.k
    /* renamed from: s, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
