package com.avito.android.remote.model.rating_details;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.rating_details.RatingDetailsElement;
import com.avito.android.remote.model.review_reply.ReviewReplyResult;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: RatingDetailsElement.kt */
@d
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001:\u0002?@B¡\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b0\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b1\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b2\u0010(R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b7\u00108R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b9\u00108R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\b:\u00108R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b;\u0010(R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010<\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/avito/android/remote/model/rating_details/CommentElement;", "Lcom/avito/android/remote/model/rating_details/RatingDetailsElement;", "", "reviewId", "", "title", "", "score", "rated", "Lcom/avito/android/remote/model/Image;", "avatar", "stage", "item", "deliveryTitle", "Lcom/avito/android/remote/model/review_reply/ReviewReplyResult;", "reply", "", "Lcom/avito/android/remote/model/TnsGalleryImage;", "images", "Lcom/avito/android/remote/model/rating_details/CommentElement$TextSection;", "textSections", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action;", "actions", "status", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedStatusText", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/review_reply/ReviewReplyResult;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getReviewId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/lang/Float;", "getScore", "()Ljava/lang/Float;", "getRated", "Lcom/avito/android/remote/model/Image;", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "getStage", "getItem", "getDeliveryTitle", "Lcom/avito/android/remote/model/review_reply/ReviewReplyResult;", "getReply", "()Lcom/avito/android/remote/model/review_reply/ReviewReplyResult;", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "getTextSections", "getActions", "getStatus", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedStatusText", "()Lcom/avito/android/remote/model/text/AttributedText;", "Action", "TextSection", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CommentElement implements RatingDetailsElement {

    @k
    public static final Parcelable.Creator<CommentElement> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<Action> actions;

    @c("attributedStatusText")
    @l
    private final AttributedText attributedStatusText;

    @c("avatar")
    @l
    private final Image avatar;

    @c("deliveryTitle")
    @l
    private final String deliveryTitle;

    @c("images")
    @l
    private final List<TnsGalleryImage> images;

    @c("itemTitle")
    @l
    private final String item;

    @c("rated")
    @k
    private final String rated;

    @c("answer")
    @l
    private final ReviewReplyResult reply;

    @c("id")
    @l
    private final Long reviewId;

    @c("score")
    @l
    private final Float score;

    @c("stageTitle")
    @l
    private final String stage;

    @c("status")
    @l
    private final String status;

    @c("textSections")
    @l
    private final List<TextSection> textSections;

    @c("title")
    @k
    private final String title;

    /* compiled from: RatingDetailsElement.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0017\u0018\u0019\u001a\u001bB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/rating_details/CommentElement$Action;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionType;", "type", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue;", "value", "<init>", "(Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionType;Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionType;", "getType", "()Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionType;", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue;", "getValue", "()Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue;", "ActionType", "ActionValue", "Button", "ButtonType", "ConfirmationDialog", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new Creator();

        @c("type")
        @l
        private final ActionType type;

        @c("value")
        @k
        private final ActionValue value;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: RatingDetailsElement.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionType;", "", "(Ljava/lang/String;I)V", "ANSWER", "REMOVE_ANSWER", "REMOVE_REVIEW", "LINK", "NETWORK_REQUEST", "BOTTOM_SHEET", "TEXT_SHEET", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ActionType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ActionType[] $VALUES;

            @c("answer")
            public static final ActionType ANSWER = new ActionType("ANSWER", 0);

            @c("removeAnswer")
            public static final ActionType REMOVE_ANSWER = new ActionType("REMOVE_ANSWER", 1);

            @c("removeReview")
            public static final ActionType REMOVE_REVIEW = new ActionType("REMOVE_REVIEW", 2);

            @c("link")
            public static final ActionType LINK = new ActionType("LINK", 3);

            @c("networkRequest")
            public static final ActionType NETWORK_REQUEST = new ActionType("NETWORK_REQUEST", 4);

            @c("bottomSheet")
            public static final ActionType BOTTOM_SHEET = new ActionType("BOTTOM_SHEET", 5);

            @c("textSheet")
            public static final ActionType TEXT_SHEET = new ActionType("TEXT_SHEET", 6);

            private static final /* synthetic */ ActionType[] $values() {
                return new ActionType[]{ANSWER, REMOVE_ANSWER, REMOVE_REVIEW, LINK, NETWORK_REQUEST, BOTTOM_SHEET, TEXT_SHEET};
            }

            static {
                ActionType[] actionTypeArr$values = $values();
                $VALUES = actionTypeArr$values;
                $ENTRIES = kotlin.enums.c.a(actionTypeArr$values);
            }

            private ActionType(String str, int i12) {
            }

            @k
            public static a<ActionType> getEntries() {
                return $ENTRIES;
            }

            public static ActionType valueOf(String str) {
                return (ActionType) Enum.valueOf(ActionType.class, str);
            }

            public static ActionType[] values() {
                return (ActionType[]) $VALUES.clone();
            }
        }

        /* compiled from: RatingDetailsElement.kt */
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001:\u0004<=>?B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b&\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b-\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b1\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b5\u00104R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\b:\u0010;¨\u0006@"}, d2 = {"Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue;", "Landroid/os/Parcelable;", "", "title", ChannelContext.Item.PLACEHOLDER, "urlPath", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueParams;", "params", "", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action;", "actions", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueValidation;", "validations", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueButton;", "button", "header", "Lcom/avito/android/deep_linking/links/DeepLink;", "analyticsAction", "link", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionAnswerLengthValidation;", "lengthValidation", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ConfirmationDialog;", "confirmationDialog", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueParams;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueButton;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionAnswerLengthValidation;Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ConfirmationDialog;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getPlaceholder", "getUrlPath", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueParams;", "getParams", "()Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueParams;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "getValidations", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueButton;", "getButton", "()Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueButton;", "getHeader", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAnalyticsAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionAnswerLengthValidation;", "getLengthValidation", "()Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionAnswerLengthValidation;", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ConfirmationDialog;", "getConfirmationDialog", "()Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ConfirmationDialog;", "ActionAnswerLengthValidation", "ActionValueButton", "ActionValueParams", "ActionValueValidation", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class ActionValue implements Parcelable {

            @k
            public static final Parcelable.Creator<ActionValue> CREATOR = new Creator();

            @c("actions")
            @l
            private final List<Action> actions;

            @c("analyticsAction")
            @l
            private final DeepLink analyticsAction;

            @c("button")
            @l
            private final ActionValueButton button;

            @c("confirmDialog")
            @l
            private final ConfirmationDialog confirmationDialog;

            @c("header")
            @l
            private final String header;

            @c("lengthValidation")
            @l
            private final ActionAnswerLengthValidation lengthValidation;

            @c("link")
            @l
            private final DeepLink link;

            @c("params")
            @l
            private final ActionValueParams params;

            @c(ChannelContext.Item.PLACEHOLDER)
            @l
            private final String placeholder;

            @c("title")
            @k
            private final String title;

            @c("urlPath")
            @l
            private final String urlPath;

            @c("validations")
            @l
            private final List<ActionValueValidation> validations;

            /* compiled from: RatingDetailsElement.kt */
            @d
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionAnswerLengthValidation;", "Landroid/os/Parcelable;", "", "min", "max", "<init>", "(II)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getMin", "getMax", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ActionAnswerLengthValidation implements Parcelable {

                @k
                public static final Parcelable.Creator<ActionAnswerLengthValidation> CREATOR = new Creator();

                @c("max")
                private final int max;

                @c("min")
                private final int min;

                /* compiled from: RatingDetailsElement.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ActionAnswerLengthValidation> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ActionAnswerLengthValidation createFromParcel(@k Parcel parcel) {
                        return new ActionAnswerLengthValidation(parcel.readInt(), parcel.readInt());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ActionAnswerLengthValidation[] newArray(int i12) {
                        return new ActionAnswerLengthValidation[i12];
                    }
                }

                public ActionAnswerLengthValidation(int i12, int i13) {
                    this.min = i12;
                    this.max = i13;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public final int getMax() {
                    return this.max;
                }

                public final int getMin() {
                    return this.min;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeInt(this.min);
                    parcel.writeInt(this.max);
                }
            }

            /* compiled from: RatingDetailsElement.kt */
            @d
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueButton;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueParams;", "params", "", "title", "urlPath", "<init>", "(Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueParams;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueParams;", "getParams", "()Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueParams;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getUrlPath", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ActionValueButton implements Parcelable {

                @k
                public static final Parcelable.Creator<ActionValueButton> CREATOR = new Creator();

                @c("params")
                @l
                private final ActionValueParams params;

                @c("title")
                @k
                private final String title;

                @c("urlPath")
                @k
                private final String urlPath;

                /* compiled from: RatingDetailsElement.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ActionValueButton> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ActionValueButton createFromParcel(@k Parcel parcel) {
                        return new ActionValueButton(parcel.readInt() == 0 ? null : ActionValueParams.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ActionValueButton[] newArray(int i12) {
                        return new ActionValueButton[i12];
                    }
                }

                public ActionValueButton(@l ActionValueParams actionValueParams, @k String str, @k String str2) {
                    this.params = actionValueParams;
                    this.title = str;
                    this.urlPath = str2;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @l
                public final ActionValueParams getParams() {
                    return this.params;
                }

                @k
                public final String getTitle() {
                    return this.title;
                }

                @k
                public final String getUrlPath() {
                    return this.urlPath;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    ActionValueParams actionValueParams = this.params;
                    if (actionValueParams == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        actionValueParams.writeToParcel(parcel, flags);
                    }
                    parcel.writeString(this.title);
                    parcel.writeString(this.urlPath);
                }
            }

            /* compiled from: RatingDetailsElement.kt */
            @d
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueParams;", "Landroid/os/Parcelable;", "", "reviewId", "typeId", "appealType", "", "text", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getReviewId", "()Ljava/lang/Integer;", "getTypeId", "getAppealType", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ActionValueParams implements Parcelable {

                @k
                public static final Parcelable.Creator<ActionValueParams> CREATOR = new Creator();

                @c("appealType")
                @l
                private final Integer appealType;

                @c("reviewId")
                @l
                private final Integer reviewId;

                @c("text")
                @l
                private final String text;

                @c("typeId")
                @l
                private final Integer typeId;

                /* compiled from: RatingDetailsElement.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ActionValueParams> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ActionValueParams createFromParcel(@k Parcel parcel) {
                        return new ActionValueParams(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ActionValueParams[] newArray(int i12) {
                        return new ActionValueParams[i12];
                    }
                }

                public ActionValueParams(@l Integer num, @l Integer num2, @l Integer num3, @l String str) {
                    this.reviewId = num;
                    this.typeId = num2;
                    this.appealType = num3;
                    this.text = str;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @l
                public final Integer getAppealType() {
                    return this.appealType;
                }

                @l
                public final Integer getReviewId() {
                    return this.reviewId;
                }

                @l
                public final String getText() {
                    return this.text;
                }

                @l
                public final Integer getTypeId() {
                    return this.typeId;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    Integer num = this.reviewId;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num);
                    }
                    Integer num2 = this.typeId;
                    if (num2 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num2);
                    }
                    Integer num3 = this.appealType;
                    if (num3 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num3);
                    }
                    parcel.writeString(this.text);
                }
            }

            /* compiled from: RatingDetailsElement.kt */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueValidation;", "Landroid/os/Parcelable;", "", "max", "", "message", "min", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueValidation$ActionValueValidationRule;", "rule", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueValidation$ActionValueValidationRule;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getMax", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "getMin", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueValidation$ActionValueValidationRule;", "getRule", "()Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueValidation$ActionValueValidationRule;", "ActionValueValidationRule", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class ActionValueValidation implements Parcelable {

                @k
                public static final Parcelable.Creator<ActionValueValidation> CREATOR = new Creator();

                @c("max")
                @l
                private final Integer max;

                @c("message")
                @l
                private final String message;

                @c("min")
                @l
                private final Integer min;

                @c("rule")
                @l
                private final ActionValueValidationRule rule;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: RatingDetailsElement.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ActionValue$ActionValueValidation$ActionValueValidationRule;", "", "(Ljava/lang/String;I)V", "LENGTH", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class ActionValueValidationRule {
                    private static final /* synthetic */ a $ENTRIES;
                    private static final /* synthetic */ ActionValueValidationRule[] $VALUES;

                    @c("length")
                    public static final ActionValueValidationRule LENGTH = new ActionValueValidationRule("LENGTH", 0);

                    private static final /* synthetic */ ActionValueValidationRule[] $values() {
                        return new ActionValueValidationRule[]{LENGTH};
                    }

                    static {
                        ActionValueValidationRule[] actionValueValidationRuleArr$values = $values();
                        $VALUES = actionValueValidationRuleArr$values;
                        $ENTRIES = kotlin.enums.c.a(actionValueValidationRuleArr$values);
                    }

                    private ActionValueValidationRule(String str, int i12) {
                    }

                    @k
                    public static a<ActionValueValidationRule> getEntries() {
                        return $ENTRIES;
                    }

                    public static ActionValueValidationRule valueOf(String str) {
                        return (ActionValueValidationRule) Enum.valueOf(ActionValueValidationRule.class, str);
                    }

                    public static ActionValueValidationRule[] values() {
                        return (ActionValueValidationRule[]) $VALUES.clone();
                    }
                }

                /* compiled from: RatingDetailsElement.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ActionValueValidation> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ActionValueValidation createFromParcel(@k Parcel parcel) {
                        return new ActionValueValidation(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? ActionValueValidationRule.valueOf(parcel.readString()) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ActionValueValidation[] newArray(int i12) {
                        return new ActionValueValidation[i12];
                    }
                }

                public ActionValueValidation(@l Integer num, @l String str, @l Integer num2, @l ActionValueValidationRule actionValueValidationRule) {
                    this.max = num;
                    this.message = str;
                    this.min = num2;
                    this.rule = actionValueValidationRule;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @l
                public final Integer getMax() {
                    return this.max;
                }

                @l
                public final String getMessage() {
                    return this.message;
                }

                @l
                public final Integer getMin() {
                    return this.min;
                }

                @l
                public final ActionValueValidationRule getRule() {
                    return this.rule;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    Integer num = this.max;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num);
                    }
                    parcel.writeString(this.message);
                    Integer num2 = this.min;
                    if (num2 == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num2);
                    }
                    ActionValueValidationRule actionValueValidationRule = this.rule;
                    if (actionValueValidationRule == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeString(actionValueValidationRule.name());
                    }
                }
            }

            /* compiled from: RatingDetailsElement.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ActionValue> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ActionValue createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    ActionValueParams actionValueParamsCreateFromParcel = parcel.readInt() == 0 ? null : ActionValueParams.CREATOR.createFromParcel(parcel);
                    int iC2 = 0;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iC3 = 0;
                        while (iC3 != i12) {
                            iC3 = com.avito.android.actions_sheet.a.c(Action.CREATOR, parcel, arrayList, iC3, 1);
                        }
                    }
                    if (parcel.readInt() == 0) {
                        arrayList2 = null;
                    } else {
                        int i13 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i13);
                        while (iC2 != i13) {
                            iC2 = com.avito.android.actions_sheet.a.c(ActionValueValidation.CREATOR, parcel, arrayList3, iC2, 1);
                        }
                        arrayList2 = arrayList3;
                    }
                    return new ActionValue(string, string2, string3, actionValueParamsCreateFromParcel, arrayList, arrayList2, parcel.readInt() == 0 ? null : ActionValueButton.CREATOR.createFromParcel(parcel), parcel.readString(), (DeepLink) parcel.readParcelable(ActionValue.class.getClassLoader()), (DeepLink) parcel.readParcelable(ActionValue.class.getClassLoader()), parcel.readInt() == 0 ? null : ActionAnswerLengthValidation.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ConfirmationDialog.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ActionValue[] newArray(int i12) {
                    return new ActionValue[i12];
                }
            }

            public ActionValue(@k String str, @l String str2, @l String str3, @l ActionValueParams actionValueParams, @l List<Action> list, @l List<ActionValueValidation> list2, @l ActionValueButton actionValueButton, @l String str4, @l DeepLink deepLink, @l DeepLink deepLink2, @l ActionAnswerLengthValidation actionAnswerLengthValidation, @l ConfirmationDialog confirmationDialog) {
                this.title = str;
                this.placeholder = str2;
                this.urlPath = str3;
                this.params = actionValueParams;
                this.actions = list;
                this.validations = list2;
                this.button = actionValueButton;
                this.header = str4;
                this.analyticsAction = deepLink;
                this.link = deepLink2;
                this.lengthValidation = actionAnswerLengthValidation;
                this.confirmationDialog = confirmationDialog;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final List<Action> getActions() {
                return this.actions;
            }

            @l
            public final DeepLink getAnalyticsAction() {
                return this.analyticsAction;
            }

            @l
            public final ActionValueButton getButton() {
                return this.button;
            }

            @l
            public final ConfirmationDialog getConfirmationDialog() {
                return this.confirmationDialog;
            }

            @l
            public final String getHeader() {
                return this.header;
            }

            @l
            public final ActionAnswerLengthValidation getLengthValidation() {
                return this.lengthValidation;
            }

            @l
            public final DeepLink getLink() {
                return this.link;
            }

            @l
            public final ActionValueParams getParams() {
                return this.params;
            }

            @l
            public final String getPlaceholder() {
                return this.placeholder;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @l
            public final String getUrlPath() {
                return this.urlPath;
            }

            @l
            public final List<ActionValueValidation> getValidations() {
                return this.validations;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.placeholder);
                parcel.writeString(this.urlPath);
                ActionValueParams actionValueParams = this.params;
                if (actionValueParams == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    actionValueParams.writeToParcel(parcel, flags);
                }
                List<Action> list = this.actions;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        ((Action) itA.next()).writeToParcel(parcel, flags);
                    }
                }
                List<ActionValueValidation> list2 = this.validations;
                if (list2 == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
                    while (itA2.hasNext()) {
                        ((ActionValueValidation) itA2.next()).writeToParcel(parcel, flags);
                    }
                }
                ActionValueButton actionValueButton = this.button;
                if (actionValueButton == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    actionValueButton.writeToParcel(parcel, flags);
                }
                parcel.writeString(this.header);
                parcel.writeParcelable(this.analyticsAction, flags);
                parcel.writeParcelable(this.link, flags);
                ActionAnswerLengthValidation actionAnswerLengthValidation = this.lengthValidation;
                if (actionAnswerLengthValidation == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    actionAnswerLengthValidation.writeToParcel(parcel, flags);
                }
                ConfirmationDialog confirmationDialog = this.confirmationDialog;
                if (confirmationDialog == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    confirmationDialog.writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: RatingDetailsElement.kt */
        @d
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/rating_details/CommentElement$Action$Button;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ButtonType;", "type", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ButtonType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ButtonType;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ButtonType;)Lcom/avito/android/remote/model/rating_details/CommentElement$Action$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ButtonType;", "getType", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Button implements Parcelable {

            @k
            public static final Parcelable.Creator<Button> CREATOR = new Creator();

            @c("text")
            @k
            private final String text;

            @c("type")
            @k
            private final ButtonType type;

            /* compiled from: RatingDetailsElement.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Button> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Button createFromParcel(@k Parcel parcel) {
                    return new Button(parcel.readString(), ButtonType.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Button[] newArray(int i12) {
                    return new Button[i12];
                }
            }

            public Button(@k String str, @k ButtonType buttonType) {
                this.text = str;
                this.type = buttonType;
            }

            public static /* synthetic */ Button copy$default(Button button, String str, ButtonType buttonType, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = button.text;
                }
                if ((i12 & 2) != 0) {
                    buttonType = button.type;
                }
                return button.copy(str, buttonType);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final ButtonType getType() {
                return this.type;
            }

            @k
            public final Button copy(@k String text, @k ButtonType type) {
                return new Button(text, type);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Button)) {
                    return false;
                }
                Button button = (Button) other;
                return L.f(this.text, button.text) && this.type == button.type;
            }

            @k
            public final String getText() {
                return this.text;
            }

            @k
            public final ButtonType getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode() + (this.text.hashCode() * 31);
            }

            @k
            public String toString() {
                return "Button(text=" + this.text + ", type=" + this.type + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.text);
                this.type.writeToParcel(parcel, flags);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: RatingDetailsElement.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ButtonType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "POSITIVE", "NEGATIVE", "NEUTRAL", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class ButtonType implements Parcelable {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ButtonType[] $VALUES;

            @k
            public static final Parcelable.Creator<ButtonType> CREATOR;

            @c("positive")
            public static final ButtonType POSITIVE = new ButtonType("POSITIVE", 0);

            @c("negative")
            public static final ButtonType NEGATIVE = new ButtonType("NEGATIVE", 1);

            @c("neutral")
            public static final ButtonType NEUTRAL = new ButtonType("NEUTRAL", 2);

            /* compiled from: RatingDetailsElement.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ButtonType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ButtonType createFromParcel(@k Parcel parcel) {
                    return ButtonType.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ButtonType[] newArray(int i12) {
                    return new ButtonType[i12];
                }
            }

            private static final /* synthetic */ ButtonType[] $values() {
                return new ButtonType[]{POSITIVE, NEGATIVE, NEUTRAL};
            }

            static {
                ButtonType[] buttonTypeArr$values = $values();
                $VALUES = buttonTypeArr$values;
                $ENTRIES = kotlin.enums.c.a(buttonTypeArr$values);
                CREATOR = new Creator();
            }

            private ButtonType(String str, int i12) {
            }

            @k
            public static a<ButtonType> getEntries() {
                return $ENTRIES;
            }

            public static ButtonType valueOf(String str) {
                return (ButtonType) Enum.valueOf(ButtonType.class, str);
            }

            public static ButtonType[] values() {
                return (ButtonType[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(name());
            }
        }

        /* compiled from: RatingDetailsElement.kt */
        @d
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ConfirmationDialog;", "Landroid/os/Parcelable;", "", "title", "text", "", "Lcom/avito/android/remote/model/rating_details/CommentElement$Action$Button;", "buttons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/rating_details/CommentElement$Action$ConfirmationDialog;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getText", "Ljava/util/List;", "getButtons", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ConfirmationDialog implements Parcelable {

            @k
            public static final Parcelable.Creator<ConfirmationDialog> CREATOR = new Creator();

            @c("buttons")
            @k
            private final List<Button> buttons;

            @c("text")
            @k
            private final String text;

            @c("title")
            @k
            private final String title;

            /* compiled from: RatingDetailsElement.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ConfirmationDialog> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ConfirmationDialog createFromParcel(@k Parcel parcel) {
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(Button.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new ConfirmationDialog(string, string2, arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ConfirmationDialog[] newArray(int i12) {
                    return new ConfirmationDialog[i12];
                }
            }

            public ConfirmationDialog(@k String str, @k String str2, @k List<Button> list) {
                this.title = str;
                this.text = str2;
                this.buttons = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ConfirmationDialog copy$default(ConfirmationDialog confirmationDialog, String str, String str2, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = confirmationDialog.title;
                }
                if ((i12 & 2) != 0) {
                    str2 = confirmationDialog.text;
                }
                if ((i12 & 4) != 0) {
                    list = confirmationDialog.buttons;
                }
                return confirmationDialog.copy(str, str2, list);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @k
            public final List<Button> component3() {
                return this.buttons;
            }

            @k
            public final ConfirmationDialog copy(@k String title, @k String text, @k List<Button> buttons) {
                return new ConfirmationDialog(title, text, buttons);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ConfirmationDialog)) {
                    return false;
                }
                ConfirmationDialog confirmationDialog = (ConfirmationDialog) other;
                return L.f(this.title, confirmationDialog.title) && L.f(this.text, confirmationDialog.text) && L.f(this.buttons, confirmationDialog.buttons);
            }

            @k
            public final List<Button> getButtons() {
                return this.buttons;
            }

            @k
            public final String getText() {
                return this.text;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.buttons.hashCode() + H.d(this.title.hashCode() * 31, 31, this.text);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ConfirmationDialog(title=");
                sb2.append(this.title);
                sb2.append(", text=");
                sb2.append(this.text);
                sb2.append(", buttons=");
                return H.p(sb2, this.buttons, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.text);
                Iterator itJ = C0.j(this.buttons, parcel);
                while (itJ.hasNext()) {
                    ((Button) itJ.next()).writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: RatingDetailsElement.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Action> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action createFromParcel(@k Parcel parcel) {
                return new Action(parcel.readInt() == 0 ? null : ActionType.valueOf(parcel.readString()), ActionValue.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@l ActionType actionType, @k ActionValue actionValue) {
            this.type = actionType;
            this.value = actionValue;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final ActionType getType() {
            return this.type;
        }

        @k
        public final ActionValue getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            ActionType actionType = this.type;
            if (actionType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(actionType.name());
            }
            this.value.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: RatingDetailsElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CommentElement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CommentElement createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(CommentElement.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ReviewReplyResult reviewReplyResultCreateFromParcel = parcel.readInt() == 0 ? null : ReviewReplyResult.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(CommentElement.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(TextSection.CREATOR, parcel, arrayList5, iC2, 1);
                    i13 = i13;
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                arrayList4 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                int iC3 = 0;
                while (iC3 != i14) {
                    iC3 = com.avito.android.actions_sheet.a.c(Action.CREATOR, parcel, arrayList6, iC3, 1);
                    i14 = i14;
                    arrayList2 = arrayList2;
                }
                arrayList3 = arrayList2;
                arrayList4 = arrayList6;
            }
            return new CommentElement(lValueOf, string, fValueOf, string2, image, string3, string4, string5, reviewReplyResultCreateFromParcel, arrayList, arrayList3, arrayList4, parcel.readString(), (AttributedText) parcel.readParcelable(CommentElement.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CommentElement[] newArray(int i12) {
            return new CommentElement[i12];
        }
    }

    /* compiled from: RatingDetailsElement.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/rating_details/CommentElement$TextSection;", "Landroid/os/Parcelable;", "", "title", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getText", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TextSection implements Parcelable {

        @k
        public static final Parcelable.Creator<TextSection> CREATOR = new Creator();

        @c("text")
        @k
        private final String text;

        @c("title")
        @l
        private final String title;

        /* compiled from: RatingDetailsElement.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextSection> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextSection createFromParcel(@k Parcel parcel) {
                return new TextSection(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextSection[] newArray(int i12) {
                return new TextSection[i12];
            }
        }

        public TextSection(@l String str, @k String str2) {
            this.title = str;
            this.text = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.text);
        }
    }

    public CommentElement(@l Long l12, @k String str, @l Float f12, @k String str2, @l Image image, @l String str3, @l String str4, @l String str5, @l ReviewReplyResult reviewReplyResult, @l List<TnsGalleryImage> list, @l List<TextSection> list2, @l List<Action> list3, @l String str6, @l AttributedText attributedText) {
        this.reviewId = l12;
        this.title = str;
        this.score = f12;
        this.rated = str2;
        this.avatar = image;
        this.stage = str3;
        this.item = str4;
        this.deliveryTitle = str5;
        this.reply = reviewReplyResult;
        this.images = list;
        this.textSections = list2;
        this.actions = list3;
        this.status = str6;
        this.attributedStatusText = attributedText;
    }

    @Override // com.avito.android.remote.model.rating_details.RatingDetailsElement, android.os.Parcelable
    public int describeContents() {
        return RatingDetailsElement.DefaultImpls.describeContents(this);
    }

    @l
    public final List<Action> getActions() {
        return this.actions;
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
    public final String getDeliveryTitle() {
        return this.deliveryTitle;
    }

    @l
    public final List<TnsGalleryImage> getImages() {
        return this.images;
    }

    @l
    public final String getItem() {
        return this.item;
    }

    @k
    public final String getRated() {
        return this.rated;
    }

    @l
    public final ReviewReplyResult getReply() {
        return this.reply;
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
    public final String getStage() {
        return this.stage;
    }

    @l
    public final String getStatus() {
        return this.status;
    }

    @l
    public final List<TextSection> getTextSections() {
        return this.textSections;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Long l12 = this.reviewId;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.title);
        Float f12 = this.score;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeString(this.rated);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.stage);
        parcel.writeString(this.item);
        parcel.writeString(this.deliveryTitle);
        ReviewReplyResult reviewReplyResult = this.reply;
        if (reviewReplyResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewReplyResult.writeToParcel(parcel, flags);
        }
        List<TnsGalleryImage> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<TextSection> list2 = this.textSections;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((TextSection) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        List<Action> list3 = this.actions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                ((Action) itA3.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.status);
        parcel.writeParcelable(this.attributedStatusText, flags);
    }
}
