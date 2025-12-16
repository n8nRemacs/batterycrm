package com.avito.android.remote.model.rating_details_mvi;

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
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: RatingDetailsEntry.kt */
@d
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001:\u0003NOPBÜ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0016\u0012\u0019\u0010 \u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\u0002\b\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#HÖ\u0001¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b2\u00101R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u00105R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u00101R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u00109R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b:\u00101R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b;\u00101R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b<\u00101R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b=\u00101R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b>\u00101R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\bB\u00101R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bD\u0010ER\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\bG\u0010HR\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010F\u001a\u0004\bI\u0010HR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010F\u001a\u0004\bJ\u0010HR-\u0010 \u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\u0002\b\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010K\u001a\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEntry;", "", "reviewId", "", "title", "titleCaption", "", "score", "rated", "Lcom/avito/android/remote/model/Image;", "avatar", "stageTitle", "itemTitle", "deliveryTitle", "status", "statusText", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedStatusText", "rejectMessage", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Answer;", "answer", "", "Lcom/avito/android/remote/model/TnsGalleryImage;", "images", "Lcom/avito/android/remote/model/rating_details_mvi/TextSection;", "textSections", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action;", "actions", "", "", "LK51/e;", "analyticalParams", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Answer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getReviewId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitleCaption", "Ljava/lang/Float;", "getScore", "()Ljava/lang/Float;", "getRated", "Lcom/avito/android/remote/model/Image;", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "getStageTitle", "getItemTitle", "getDeliveryTitle", "getStatus", "getStatusText", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedStatusText", "()Lcom/avito/android/remote/model/text/AttributedText;", "getRejectMessage", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Answer;", "getAnswer", "()Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Answer;", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "getTextSections", "getActions", "Ljava/util/Map;", "getAnalyticalParams", "()Ljava/util/Map;", "Action", "Answer", "ReviewStatus", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReviewEntry implements RatingDetailsEntry {

    @k
    public static final Parcelable.Creator<ReviewEntry> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<Action> actions;

    @c("analyticalParams")
    @l
    private final Map<String, Object> analyticalParams;

    @c("answer")
    @l
    private final Answer answer;

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
    private final String itemTitle;

    @c("rated")
    @l
    private final String rated;

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

    @c("textSections")
    @l
    private final List<TextSection> textSections;

    @c("title")
    @k
    private final String title;

    @c("titleCaption")
    @l
    private final String titleCaption;

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0017\u0018\u0019\u001a\u001bB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionType;", "type", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue;", "value", "<init>", "(Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionType;Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionType;", "getType", "()Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionType;", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue;", "getValue", "()Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue;", "ActionType", "ActionValue", "Button", "ButtonType", "ConfirmationDialog", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionType;", "", "(Ljava/lang/String;I)V", "ANSWER", "REMOVE_ANSWER", "REMOVE_REVIEW", "REMOVE_BUYER_REVIEW", "LINK", "NETWORK_REQUEST", "BOTTOM_SHEET", "TEXT_SHEET", "INFO", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ActionType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ ActionType[] $VALUES;

            @c("answer")
            public static final ActionType ANSWER = new ActionType("ANSWER", 0);

            @c("removeAnswer")
            public static final ActionType REMOVE_ANSWER = new ActionType("REMOVE_ANSWER", 1);

            @c("removeReview")
            public static final ActionType REMOVE_REVIEW = new ActionType("REMOVE_REVIEW", 2);

            @c("removeBuyerReview")
            public static final ActionType REMOVE_BUYER_REVIEW = new ActionType("REMOVE_BUYER_REVIEW", 3);

            @c("link")
            public static final ActionType LINK = new ActionType("LINK", 4);

            @c("networkRequest")
            public static final ActionType NETWORK_REQUEST = new ActionType("NETWORK_REQUEST", 5);

            @c("bottomSheet")
            public static final ActionType BOTTOM_SHEET = new ActionType("BOTTOM_SHEET", 6);

            @c("textSheet")
            public static final ActionType TEXT_SHEET = new ActionType("TEXT_SHEET", 7);

            @c(RequestReviewResultKt.INFO_TYPE)
            public static final ActionType INFO = new ActionType("INFO", 8);

            private static final /* synthetic */ ActionType[] $values() {
                return new ActionType[]{ANSWER, REMOVE_ANSWER, REMOVE_REVIEW, REMOVE_BUYER_REVIEW, LINK, NETWORK_REQUEST, BOTTOM_SHEET, TEXT_SHEET, INFO};
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

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u00002\u00020\u0001:\u0006FGHIJKB\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b)\u0010(R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b1\u00100R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b5\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b9\u00108R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010C\u001a\u0004\bD\u0010E¨\u0006L"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue;", "Landroid/os/Parcelable;", "", "title", ChannelContext.Item.PLACEHOLDER, "urlPath", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueParams;", "params", "", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action;", "actions", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueValidation;", "validations", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueButton;", "button", "header", "Lcom/avito/android/deep_linking/links/DeepLink;", "analyticsAction", "link", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionAnswerLengthValidation;", "lengthValidation", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ConfirmationDialog;", "confirmationDialog", "Lcom/avito/android/remote/model/text/AttributedText;", "content", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionInfoButtons;", "buttons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueParams;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueButton;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionAnswerLengthValidation;Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ConfirmationDialog;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionInfoButtons;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getPlaceholder", "getUrlPath", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueParams;", "getParams", "()Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueParams;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "getValidations", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueButton;", "getButton", "()Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueButton;", "getHeader", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAnalyticsAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionAnswerLengthValidation;", "getLengthValidation", "()Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionAnswerLengthValidation;", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ConfirmationDialog;", "getConfirmationDialog", "()Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ConfirmationDialog;", "Lcom/avito/android/remote/model/text/AttributedText;", "getContent", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionInfoButtons;", "getButtons", "()Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionInfoButtons;", "ActionAnswerLengthValidation", "ActionInfoButton", "ActionInfoButtons", "ActionValueButton", "ActionValueParams", "ActionValueValidation", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

            @c("buttons")
            @l
            private final ActionInfoButtons buttons;

            @c("confirmDialog")
            @l
            private final ConfirmationDialog confirmationDialog;

            @c("content")
            @l
            private final AttributedText content;

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

            /* compiled from: RatingDetailsEntry.kt */
            @d
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionAnswerLengthValidation;", "Landroid/os/Parcelable;", "", "min", "max", "<init>", "(II)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getMin", "getMax", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ActionAnswerLengthValidation implements Parcelable {

                @k
                public static final Parcelable.Creator<ActionAnswerLengthValidation> CREATOR = new Creator();

                @c("max")
                private final int max;

                @c("min")
                private final int min;

                /* compiled from: RatingDetailsEntry.kt */
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

            /* compiled from: RatingDetailsEntry.kt */
            @d
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionInfoButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ActionInfoButton implements Parcelable {

                @k
                public static final Parcelable.Creator<ActionInfoButton> CREATOR = new Creator();

                @c("link")
                @l
                private final DeepLink link;

                @c("title")
                @l
                private final String title;

                /* compiled from: RatingDetailsEntry.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ActionInfoButton> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ActionInfoButton createFromParcel(@k Parcel parcel) {
                        return new ActionInfoButton(parcel.readString(), (DeepLink) parcel.readParcelable(ActionInfoButton.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ActionInfoButton[] newArray(int i12) {
                        return new ActionInfoButton[i12];
                    }
                }

                public ActionInfoButton(@l String str, @l DeepLink deepLink) {
                    this.title = str;
                    this.link = deepLink;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @l
                public final DeepLink getLink() {
                    return this.link;
                }

                @l
                public final String getTitle() {
                    return this.title;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.title);
                    parcel.writeParcelable(this.link, flags);
                }
            }

            /* compiled from: RatingDetailsEntry.kt */
            @d
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionInfoButtons;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionInfoButton;", "primary", "secondary", "<init>", "(Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionInfoButton;Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionInfoButton;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionInfoButton;", "getPrimary", "()Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionInfoButton;", "getSecondary", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ActionInfoButtons implements Parcelable {

                @k
                public static final Parcelable.Creator<ActionInfoButtons> CREATOR = new Creator();

                @c("primary")
                @l
                private final ActionInfoButton primary;

                @c("secondary")
                @l
                private final ActionInfoButton secondary;

                /* compiled from: RatingDetailsEntry.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ActionInfoButtons> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ActionInfoButtons createFromParcel(@k Parcel parcel) {
                        return new ActionInfoButtons(parcel.readInt() == 0 ? null : ActionInfoButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ActionInfoButton.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final ActionInfoButtons[] newArray(int i12) {
                        return new ActionInfoButtons[i12];
                    }
                }

                public ActionInfoButtons(@l ActionInfoButton actionInfoButton, @l ActionInfoButton actionInfoButton2) {
                    this.primary = actionInfoButton;
                    this.secondary = actionInfoButton2;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @l
                public final ActionInfoButton getPrimary() {
                    return this.primary;
                }

                @l
                public final ActionInfoButton getSecondary() {
                    return this.secondary;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    ActionInfoButton actionInfoButton = this.primary;
                    if (actionInfoButton == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        actionInfoButton.writeToParcel(parcel, flags);
                    }
                    ActionInfoButton actionInfoButton2 = this.secondary;
                    if (actionInfoButton2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        actionInfoButton2.writeToParcel(parcel, flags);
                    }
                }
            }

            /* compiled from: RatingDetailsEntry.kt */
            @d
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueButton;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueParams;", "params", "", "title", "urlPath", "<init>", "(Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueParams;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueParams;", "getParams", "()Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueParams;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getUrlPath", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

                /* compiled from: RatingDetailsEntry.kt */
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

            /* compiled from: RatingDetailsEntry.kt */
            @d
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueParams;", "Landroid/os/Parcelable;", "", "reviewId", "typeId", "appealType", "", "text", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getReviewId", "()Ljava/lang/Integer;", "getTypeId", "getAppealType", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

                /* compiled from: RatingDetailsEntry.kt */
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

            /* compiled from: RatingDetailsEntry.kt */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueValidation;", "Landroid/os/Parcelable;", "", "max", "", "message", "min", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueValidation$ActionValueValidationRule;", "rule", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueValidation$ActionValueValidationRule;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getMax", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "getMin", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueValidation$ActionValueValidationRule;", "getRule", "()Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueValidation$ActionValueValidationRule;", "ActionValueValidationRule", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
                /* compiled from: RatingDetailsEntry.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ActionValue$ActionValueValidation$ActionValueValidationRule;", "", "(Ljava/lang/String;I)V", "LENGTH", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

                /* compiled from: RatingDetailsEntry.kt */
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

            /* compiled from: RatingDetailsEntry.kt */
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
                    return new ActionValue(string, string2, string3, actionValueParamsCreateFromParcel, arrayList, arrayList2, parcel.readInt() == 0 ? null : ActionValueButton.CREATOR.createFromParcel(parcel), parcel.readString(), (DeepLink) parcel.readParcelable(ActionValue.class.getClassLoader()), (DeepLink) parcel.readParcelable(ActionValue.class.getClassLoader()), parcel.readInt() == 0 ? null : ActionAnswerLengthValidation.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ConfirmationDialog.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(ActionValue.class.getClassLoader()), parcel.readInt() != 0 ? ActionInfoButtons.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ActionValue[] newArray(int i12) {
                    return new ActionValue[i12];
                }
            }

            public ActionValue(@k String str, @l String str2, @l String str3, @l ActionValueParams actionValueParams, @l List<Action> list, @l List<ActionValueValidation> list2, @l ActionValueButton actionValueButton, @l String str4, @l DeepLink deepLink, @l DeepLink deepLink2, @l ActionAnswerLengthValidation actionAnswerLengthValidation, @l ConfirmationDialog confirmationDialog, @l AttributedText attributedText, @l ActionInfoButtons actionInfoButtons) {
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
                this.content = attributedText;
                this.buttons = actionInfoButtons;
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
            public final ActionInfoButtons getButtons() {
                return this.buttons;
            }

            @l
            public final ConfirmationDialog getConfirmationDialog() {
                return this.confirmationDialog;
            }

            @l
            public final AttributedText getContent() {
                return this.content;
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
                parcel.writeParcelable(this.content, flags);
                ActionInfoButtons actionInfoButtons = this.buttons;
                if (actionInfoButtons == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    actionInfoButtons.writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: RatingDetailsEntry.kt */
        @d
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$Button;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ButtonType;", "type", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ButtonType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ButtonType;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ButtonType;)Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ButtonType;", "getType", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Button implements Parcelable {

            @k
            public static final Parcelable.Creator<Button> CREATOR = new Creator();

            @c("text")
            @k
            private final String text;

            @c("type")
            @k
            private final ButtonType type;

            /* compiled from: RatingDetailsEntry.kt */
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
        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ButtonType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "POSITIVE", "NEGATIVE", "NEUTRAL", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

            /* compiled from: RatingDetailsEntry.kt */
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

        /* compiled from: RatingDetailsEntry.kt */
        @d
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ConfirmationDialog;", "Landroid/os/Parcelable;", "", "title", "text", "", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$Button;", "buttons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Action$ConfirmationDialog;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getText", "Ljava/util/List;", "getButtons", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

            /* compiled from: RatingDetailsEntry.kt */
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

        /* compiled from: RatingDetailsEntry.kt */
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

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001:\u00017B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b&\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b'\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b\u0011\u00103R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b4\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b5\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b6\u0010%¨\u00068"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Answer;", "Landroid/os/Parcelable;", "", "id", "", "title", "titleCaption", "answered", "Lcom/avito/android/remote/model/Image;", "avatar", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "Lcom/avito/android/remote/model/TnsGalleryImage;", "images", "", "isShop", "status", "statusText", "rejectMessage", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitleCaption", "getAnswered", "Lcom/avito/android/remote/model/Image;", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getStatus", "getStatusText", "getRejectMessage", "ReviewAnswerStatus", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Answer implements Parcelable {

        @k
        public static final Parcelable.Creator<Answer> CREATOR = new Creator();

        @c("answered")
        @l
        private final String answered;

        @c("avatar")
        @l
        private final Image avatar;

        @c("answerId")
        private final long id;

        @c("images")
        @l
        private final List<TnsGalleryImage> images;

        @c("isShop")
        @l
        private final Boolean isShop;

        @c("link")
        @l
        private final DeepLink link;

        @c("rejectMessage")
        @l
        private final String rejectMessage;

        @c("status")
        @l
        private final String status;

        @c("statusText")
        @l
        private final String statusText;

        @c("text")
        @k
        private final String text;

        @c("title")
        @k
        private final String title;

        @c("titleCaption")
        @l
        private final String titleCaption;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Answer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Answer createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                Boolean boolValueOf;
                long j12 = parcel.readLong();
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Image image = (Image) parcel.readParcelable(Answer.class.getClassLoader());
                String string4 = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Answer.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(Answer.class, parcel, arrayList, iL2, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Answer(j12, string, string2, string3, image, string4, deepLink, arrayList, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Answer[] newArray(int i12) {
                return new Answer[i12];
            }
        }

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Answer$ReviewAnswerStatus;", "", "Companion", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @P41.c
        public @interface ReviewAnswerStatus {

            @k
            public static final String ACTIVE = "active";

            /* renamed from: Companion, reason: from kotlin metadata */
            @k
            public static final Companion INSTANCE = Companion.$$INSTANCE;

            @k
            public static final String DECLINED = "declined";

            @k
            public static final String MODERATION = "moderation";

            /* compiled from: RatingDetailsEntry.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Answer$ReviewAnswerStatus$Companion;", "", "()V", "ACTIVE", "", "DECLINED", "MODERATION", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                static final /* synthetic */ Companion $$INSTANCE = new Companion();

                @k
                public static final String ACTIVE = "active";

                @k
                public static final String DECLINED = "declined";

                @k
                public static final String MODERATION = "moderation";

                private Companion() {
                }
            }
        }

        public Answer(long j12, @k String str, @l String str2, @l String str3, @l Image image, @k String str4, @l DeepLink deepLink, @l List<TnsGalleryImage> list, @l Boolean bool, @l String str5, @l String str6, @l String str7) {
            this.id = j12;
            this.title = str;
            this.titleCaption = str2;
            this.answered = str3;
            this.avatar = image;
            this.text = str4;
            this.link = deepLink;
            this.images = list;
            this.isShop = bool;
            this.status = str5;
            this.statusText = str6;
            this.rejectMessage = str7;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getAnswered() {
            return this.answered;
        }

        @l
        public final Image getAvatar() {
            return this.avatar;
        }

        public final long getId() {
            return this.id;
        }

        @l
        public final List<TnsGalleryImage> getImages() {
            return this.images;
        }

        @l
        public final DeepLink getLink() {
            return this.link;
        }

        @l
        public final String getRejectMessage() {
            return this.rejectMessage;
        }

        @l
        public final String getStatus() {
            return this.status;
        }

        @l
        public final String getStatusText() {
            return this.statusText;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final String getTitleCaption() {
            return this.titleCaption;
        }

        @l
        /* renamed from: isShop, reason: from getter */
        public final Boolean getIsShop() {
            return this.isShop;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeLong(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.titleCaption);
            parcel.writeString(this.answered);
            parcel.writeParcelable(this.avatar, flags);
            parcel.writeString(this.text);
            parcel.writeParcelable(this.link, flags);
            List<TnsGalleryImage> list = this.images;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), flags);
                }
            }
            Boolean bool = this.isShop;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.status);
            parcel.writeString(this.statusText);
            parcel.writeString(this.rejectMessage);
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReviewEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ReviewEntry createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            LinkedHashMap linkedHashMap;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string3 = parcel.readString();
            Image image = (Image) parcel.readParcelable(ReviewEntry.class.getClassLoader());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ReviewEntry.class.getClassLoader());
            String string9 = parcel.readString();
            Answer answerCreateFromParcel = parcel.readInt() == 0 ? null : Answer.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(ReviewEntry.class, parcel, arrayList4, iL2, 1);
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(TextSection.CREATOR, parcel, arrayList5, iC2, 1);
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                int iC3 = 0;
                while (iC3 != i14) {
                    iC3 = com.avito.android.actions_sheet.a.c(Action.CREATOR, parcel, arrayList6, iC3, 1);
                }
                arrayList3 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i15 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i15);
                int iC4 = 0;
                while (iC4 != i15) {
                    iC4 = h.c(ReviewEntry.class, parcel, linkedHashMap2, parcel.readString(), iC4, 1);
                    linkedHashMap2 = linkedHashMap2;
                    i15 = i15;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ReviewEntry(lValueOf, string, string2, fValueOf, string3, image, string4, string5, string6, string7, string8, attributedText, string9, answerCreateFromParcel, arrayList, arrayList2, arrayList3, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ReviewEntry[] newArray(int i12) {
            return new ReviewEntry[i12];
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$ReviewStatus;", "", "Companion", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    public @interface ReviewStatus {

        @k
        public static final String APPROVED = "approved";

        @k
        public static final String ARBITRAGE_DECLINED = "arbitrageDeclined";

        @k
        public static final String ARBITRAGE_PENDING = "arbitragePending";

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @k
        public static final String DECLINED = "declined";

        @k
        public static final String MODERATION = "moderation";

        @k
        public static final String PUBLISHED = "published";

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$ReviewStatus$Companion;", "", "()V", "APPROVED", "", "ARBITRAGE_DECLINED", "ARBITRAGE_PENDING", "DECLINED", "MODERATION", "PUBLISHED", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @k
            public static final String APPROVED = "approved";

            @k
            public static final String ARBITRAGE_DECLINED = "arbitrageDeclined";

            @k
            public static final String ARBITRAGE_PENDING = "arbitragePending";

            @k
            public static final String DECLINED = "declined";

            @k
            public static final String MODERATION = "moderation";

            @k
            public static final String PUBLISHED = "published";

            private Companion() {
            }
        }
    }

    public ReviewEntry(@l Long l12, @k String str, @l String str2, @l Float f12, @l String str3, @l Image image, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l AttributedText attributedText, @l String str9, @l Answer answer, @l List<TnsGalleryImage> list, @l List<TextSection> list2, @l List<Action> list3, @l Map<String, ? extends Object> map) {
        this.reviewId = l12;
        this.title = str;
        this.titleCaption = str2;
        this.score = f12;
        this.rated = str3;
        this.avatar = image;
        this.stageTitle = str4;
        this.itemTitle = str5;
        this.deliveryTitle = str6;
        this.status = str7;
        this.statusText = str8;
        this.attributedStatusText = attributedText;
        this.rejectMessage = str9;
        this.answer = answer;
        this.images = list;
        this.textSections = list2;
        this.actions = list3;
        this.analyticalParams = map;
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
    public final Map<String, Object> getAnalyticalParams() {
        return this.analyticalParams;
    }

    @l
    public final Answer getAnswer() {
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
    public final List<TextSection> getTextSections() {
        return this.textSections;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getTitleCaption() {
        return this.titleCaption;
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
        parcel.writeString(this.titleCaption);
        Float f12 = this.score;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeString(this.rated);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.stageTitle);
        parcel.writeString(this.itemTitle);
        parcel.writeString(this.deliveryTitle);
        parcel.writeString(this.status);
        parcel.writeString(this.statusText);
        parcel.writeParcelable(this.attributedStatusText, flags);
        parcel.writeString(this.rejectMessage);
        Answer answer = this.answer;
        if (answer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            answer.writeToParcel(parcel, flags);
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
        Map<String, Object> map = this.analyticalParams;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            h.h(parcel, (String) entry.getKey(), entry);
        }
    }
}
