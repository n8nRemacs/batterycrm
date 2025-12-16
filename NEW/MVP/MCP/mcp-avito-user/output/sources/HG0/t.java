package Hg0;

import com.avito.android.rating.generated.api.api_11_profile_ratings_get.AnswerEntityV2;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api11ProfileRatingsGetResponse.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b*\u0018\u00002\u00020\u0001Bß\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0002\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\b\u0010 \u001a\u0004\u0018\u00010\r¢\u0006\u0004\b!\u0010\"R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u00107R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b8\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b9\u00104R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b:\u00104R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b;\u00104R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\b<\u00104R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\b@\u00104R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00102\u001a\u0004\bA\u00104R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00102\u001a\u0004\bB\u00104R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\bC\u00104R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\bD\u0010%R\u001a\u0010\u001f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\bE\u00104R\u001c\u0010 \u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u00102\u001a\u0004\bF\u00104¨\u0006G"}, d2 = {"LHg0/t;", "", "", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b;", "actions", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/AnswerEntityV2;", "answer", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedStatusText", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c;", "avatar", "", "canAnswer", "", "deliveryTitle", "", "id", "LHg0/A;", "images", "itemTitle", "itemUrl", "rated", "reviewSubtitle", "", "score", "stageTitle", "status", "subtitle", "text", "LHg0/u;", "textSections", "title", "titleCaption", "<init>", "(Ljava/util/List;Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/AnswerEntityV2;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/AnswerEntityV2;", "getAnswer", "()Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/AnswerEntityV2;", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedStatusText", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c;", "getAvatar", "()Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c;", "Ljava/lang/Boolean;", "getCanAnswer", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getDeliveryTitle", "()Ljava/lang/String;", "Ljava/lang/Long;", "getId", "()Ljava/lang/Long;", "getImages", "getItemTitle", "getItemUrl", "getRated", "getReviewSubtitle", "Ljava/lang/Double;", "getScore", "()Ljava/lang/Double;", "getStageTitle", "getStatus", "getSubtitle", "getText", "getTextSections", "getTitle", "getTitleCaption", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class t {

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
    public t(@Y61.l List<? extends com.avito.android.rating.generated.api.api_11_profile_ratings_get.b> list, @Y61.l AnswerEntityV2 answerEntityV2, @Y61.l AttributedText attributedText, @Y61.l com.avito.android.rating.generated.api.api_11_profile_ratings_get.c cVar, @Y61.l Boolean bool, @Y61.l String str, @Y61.l Long l12, @Y61.l List<C13987A> list2, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Double d12, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l List<u> list3, @Y61.k String str10, @Y61.l String str11) {
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
}
