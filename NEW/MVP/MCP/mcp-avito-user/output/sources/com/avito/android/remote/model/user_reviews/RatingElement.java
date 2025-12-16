package com.avito.android.remote.model.user_reviews;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.rating_details.CommentElement;
import com.avito.android.remote.model.review_reply.ReviewReplyResult;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RatingElement.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001:\u0001>BÓ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0010\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0010¢\u0006\u0002\u0010 R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\"R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010*¨\u0006?"}, d2 = {"Lcom/avito/android/remote/model/user_reviews/RatingElement;", "Lcom/avito/android/remote/model/user_reviews/ReviewElement;", "reviewId", "", "title", "", "subtitle", "itemTitle", "stageTitle", "deliveryTitle", "score", "", "rated", "avatar", "Lcom/avito/android/remote/model/Image;", "textSections", "", "Lcom/avito/android/remote/model/user_reviews/RatingElement$TextSection;", "answer", "Lcom/avito/android/remote/model/review_reply/ReviewReplyResult;", "status", "statusText", "attributedStatusText", "Lcom/avito/android/remote/model/text/AttributedText;", "createdAt", "rejectMessage", "recipient", "Lcom/avito/android/remote/model/user_reviews/Recipient;", "images", "Lcom/avito/android/remote/model/TnsGalleryImage;", "actions", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/util/List;Lcom/avito/android/remote/model/review_reply/ReviewReplyResult;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/user_reviews/Recipient;Ljava/util/List;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getAnswer", "()Lcom/avito/android/remote/model/review_reply/ReviewReplyResult;", "getAttributedStatusText", "()Lcom/avito/android/remote/model/text/AttributedText;", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "getCreatedAt", "()Ljava/lang/String;", "getDeliveryTitle", "getImages", "getItemTitle", "getRated", "getRecipient", "()Lcom/avito/android/remote/model/user_reviews/Recipient;", "getRejectMessage", "getReviewId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getScore", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getStageTitle", "getStatus", "getStatusText", "getSubtitle", "getTextSections", "getTitle", "TextSection", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RatingElement implements ReviewElement {

    @c("actions")
    @l
    private final List<CommentElement.Action> actions;

    @c("answer")
    @l
    private final ReviewReplyResult answer;

    @c("attributedStatusText")
    @l
    private final AttributedText attributedStatusText;

    @c("avatar")
    @l
    private final Image avatar;

    @c("createdAt")
    @l
    private final String createdAt;

    @c("deliveryTitle")
    @l
    private final String deliveryTitle;

    @c("images")
    @l
    private final List<TnsGalleryImage> images;

    @c("itemTitle")
    @l
    private final String itemTitle;

    @c("rated")
    @l
    private final String rated;

    @c("recipient")
    @l
    private final Recipient recipient;

    @c("rejectMessage")
    @l
    private final String rejectMessage;

    @c("id")
    @l
    private final Long reviewId;

    @c("score")
    @l
    private final Float score;

    @c("stageTitle")
    @l
    private final String stageTitle;

    @c("status")
    @l
    private final String status;

    @c("statusText")
    @l
    private final String statusText;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("textSections")
    @l
    private final List<TextSection> textSections;

    @c("title")
    @k
    private final String title;

    /* compiled from: RatingElement.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/user_reviews/RatingElement$TextSection;", "", "title", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getTitle", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TextSection {

        @c("text")
        @k
        private final String text;

        @c("title")
        @l
        private final String title;

        public TextSection(@l String str, @k String str2) {
            this.title = str;
            this.text = str2;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @l
        public final String getTitle() {
            return this.title;
        }
    }

    public RatingElement(@l Long l12, @k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l Float f12, @l String str6, @l Image image, @l List<TextSection> list, @l ReviewReplyResult reviewReplyResult, @l String str7, @l String str8, @l AttributedText attributedText, @l String str9, @l String str10, @l Recipient recipient, @l List<TnsGalleryImage> list2, @l List<CommentElement.Action> list3) {
        this.reviewId = l12;
        this.title = str;
        this.subtitle = str2;
        this.itemTitle = str3;
        this.stageTitle = str4;
        this.deliveryTitle = str5;
        this.score = f12;
        this.rated = str6;
        this.avatar = image;
        this.textSections = list;
        this.answer = reviewReplyResult;
        this.status = str7;
        this.statusText = str8;
        this.attributedStatusText = attributedText;
        this.createdAt = str9;
        this.rejectMessage = str10;
        this.recipient = recipient;
        this.images = list2;
        this.actions = list3;
    }

    @l
    public final List<CommentElement.Action> getActions() {
        return this.actions;
    }

    @l
    public final ReviewReplyResult getAnswer() {
        return this.answer;
    }

    @l
    public final AttributedText getAttributedStatusText() {
        return this.attributedStatusText;
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @l
    public final String getDeliveryTitle() {
        return this.deliveryTitle;
    }

    @l
    public final List<TnsGalleryImage> getImages() {
        return this.images;
    }

    @l
    public final String getItemTitle() {
        return this.itemTitle;
    }

    @l
    public final String getRated() {
        return this.rated;
    }

    @l
    public final Recipient getRecipient() {
        return this.recipient;
    }

    @l
    public final String getRejectMessage() {
        return this.rejectMessage;
    }

    @l
    public final Long getReviewId() {
        return this.reviewId;
    }

    @l
    public final Float getScore() {
        return this.score;
    }

    @l
    public final String getStageTitle() {
        return this.stageTitle;
    }

    @l
    public final String getStatus() {
        return this.status;
    }

    @l
    public final String getStatusText() {
        return this.statusText;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final List<TextSection> getTextSections() {
        return this.textSections;
    }

    @k
    public final String getTitle() {
        return this.title;
    }
}
