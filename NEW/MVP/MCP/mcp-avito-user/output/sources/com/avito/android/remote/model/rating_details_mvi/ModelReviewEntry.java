package com.avito.android.remote.model.rating_details_mvi;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingDetailsEntry.kt */
@d
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001:\u0006XYZ[\\]B¥\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010\u001fJ\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b-\u0010*J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b/\u00100JÊ\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b3\u0010\u001fJ\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u000204HÖ\u0001¢\u0006\u0004\b<\u00106J \u0010A\u001a\u00020@2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u000204HÖ\u0001¢\u0006\u0004\bA\u0010BR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bG\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010H\u001a\u0004\bI\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bK\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bL\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bN\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bO\u0010\u001fR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u0010*R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010P\u001a\u0004\bR\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bS\u0010\u001fR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010P\u001a\u0004\bT\u0010*R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bU\u0010\u001fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010V\u001a\u0004\bW\u00100¨\u0006^"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEntry;", "", "reviewId", "", "title", "scoreDescription", "Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ReviewStatus;", "status", "", "score", "rated", "Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$Author;", "author", "modelTitle", "", "Lcom/avito/android/remote/model/rating_details_mvi/TextSection;", "textSections", "Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$Action;", "actions", "statusText", "Lcom/avito/android/remote/model/TnsGalleryImage;", "images", "rejectMessage", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Answer;", "answer", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ReviewStatus;Ljava/lang/Float;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$Author;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Answer;)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ReviewStatus;", "component5", "()Ljava/lang/Float;", "component6", "component7", "()Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$Author;", "component8", "component9", "()Ljava/util/List;", "component10", "component11", "component12", "component13", "component14", "()Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Answer;", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ReviewStatus;Ljava/lang/Float;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$Author;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Answer;)Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getReviewId", "Ljava/lang/String;", "getTitle", "getScoreDescription", "Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ReviewStatus;", "getStatus", "Ljava/lang/Float;", "getScore", "getRated", "Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$Author;", "getAuthor", "getModelTitle", "Ljava/util/List;", "getTextSections", "getActions", "getStatusText", "getImages", "getRejectMessage", "Lcom/avito/android/remote/model/rating_details_mvi/ReviewEntry$Answer;", "getAnswer", "Action", "ActionParams", "ActionType", "ActionValue", "Author", "ReviewStatus", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ModelReviewEntry implements RatingDetailsEntry {

    @k
    public static final Parcelable.Creator<ModelReviewEntry> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<Action> actions;

    @c("answer")
    @l
    private final ReviewEntry.Answer answer;

    @c("author")
    @l
    private final Author author;

    @c("images")
    @l
    private final List<TnsGalleryImage> images;

    @c("modelTitle")
    @l
    private final String modelTitle;

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

    @c("scoreDescription")
    @l
    private final String scoreDescription;

    @c("status")
    @l
    private final ReviewStatus status;

    @c("statusText")
    @l
    private final String statusText;

    @c("textSections")
    @l
    private final List<TextSection> textSections;

    @c("reviewTitle")
    @l
    private final String title;

    /* compiled from: RatingDetailsEntry.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$Action;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionType;", "type", "Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionValue;", "value", "<init>", "(Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionType;Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionValue;)V", "component1", "()Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionType;", "component2", "()Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionValue;", "copy", "(Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionType;Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionValue;)Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$Action;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionType;", "getType", "Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionValue;", "getValue", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new Creator();

        @c("type")
        @k
        private final ActionType type;

        @c("value")
        @k
        private final ActionValue value;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Action> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action createFromParcel(@k Parcel parcel) {
                return new Action(ActionType.CREATOR.createFromParcel(parcel), ActionValue.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k ActionType actionType, @k ActionValue actionValue) {
            this.type = actionType;
            this.value = actionValue;
        }

        public static /* synthetic */ Action copy$default(Action action, ActionType actionType, ActionValue actionValue, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                actionType = action.type;
            }
            if ((i12 & 2) != 0) {
                actionValue = action.value;
            }
            return action.copy(actionType, actionValue);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final ActionType getType() {
            return this.type;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final ActionValue getValue() {
            return this.value;
        }

        @k
        public final Action copy(@k ActionType type, @k ActionValue value) {
            return new Action(type, value);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return this.type == action.type && L.f(this.value, action.value);
        }

        @k
        public final ActionType getType() {
            return this.type;
        }

        @k
        public final ActionValue getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.type.hashCode() * 31);
        }

        @k
        public String toString() {
            return "Action(type=" + this.type + ", value=" + this.value + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.type.writeToParcel(parcel, flags);
            this.value.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionParams;", "Landroid/os/Parcelable;", "", "reviewId", "<init>", "(Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getReviewId", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActionParams implements Parcelable {

        @k
        public static final Parcelable.Creator<ActionParams> CREATOR = new Creator();

        @c("reviewId")
        @l
        private final Integer reviewId;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActionParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionParams createFromParcel(@k Parcel parcel) {
                return new ActionParams(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionParams[] newArray(int i12) {
                return new ActionParams[i12];
            }
        }

        public ActionParams(@l Integer num) {
            this.reviewId = num;
        }

        public static /* synthetic */ ActionParams copy$default(ActionParams actionParams, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                num = actionParams.reviewId;
            }
            return actionParams.copy(num);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Integer getReviewId() {
            return this.reviewId;
        }

        @k
        public final ActionParams copy(@l Integer reviewId) {
            return new ActionParams(reviewId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActionParams) && L.f(this.reviewId, ((ActionParams) other).reviewId);
        }

        @l
        public final Integer getReviewId() {
            return this.reviewId;
        }

        public int hashCode() {
            Integer num = this.reviewId;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @k
        public String toString() {
            return s.j(new StringBuilder("ActionParams(reviewId="), this.reviewId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Integer num = this.reviewId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "REMOVE_MODEL_REVIEW", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ActionType implements Parcelable {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        @k
        public static final Parcelable.Creator<ActionType> CREATOR;

        @c("removeModelReview")
        public static final ActionType REMOVE_MODEL_REVIEW = new ActionType("REMOVE_MODEL_REVIEW", 0);

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActionType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionType createFromParcel(@k Parcel parcel) {
                return ActionType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionType[] newArray(int i12) {
                return new ActionType[i12];
            }
        }

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{REMOVE_MODEL_REVIEW};
        }

        static {
            ActionType[] actionTypeArr$values = $values();
            $VALUES = actionTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(actionTypeArr$values);
            CREATOR = new Creator();
        }

        private ActionType(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<ActionType> getEntries() {
            return $ENTRIES;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
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
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionValue;", "Landroid/os/Parcelable;", "", "title", "requestUrl", "Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionParams;", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionParams;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionParams;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionParams;)Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getRequestUrl", "Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ActionParams;", "getParams", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActionValue implements Parcelable {

        @k
        public static final Parcelable.Creator<ActionValue> CREATOR = new Creator();

        @c("params")
        @k
        private final ActionParams params;

        @c("requestUrl")
        @k
        private final String requestUrl;

        @c("title")
        @k
        private final String title;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActionValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionValue createFromParcel(@k Parcel parcel) {
                return new ActionValue(parcel.readString(), parcel.readString(), ActionParams.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionValue[] newArray(int i12) {
                return new ActionValue[i12];
            }
        }

        public ActionValue(@k String str, @k String str2, @k ActionParams actionParams) {
            this.title = str;
            this.requestUrl = str2;
            this.params = actionParams;
        }

        public static /* synthetic */ ActionValue copy$default(ActionValue actionValue, String str, String str2, ActionParams actionParams, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = actionValue.title;
            }
            if ((i12 & 2) != 0) {
                str2 = actionValue.requestUrl;
            }
            if ((i12 & 4) != 0) {
                actionParams = actionValue.params;
            }
            return actionValue.copy(str, str2, actionParams);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getRequestUrl() {
            return this.requestUrl;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final ActionParams getParams() {
            return this.params;
        }

        @k
        public final ActionValue copy(@k String title, @k String requestUrl, @k ActionParams params) {
            return new ActionValue(title, requestUrl, params);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionValue)) {
                return false;
            }
            ActionValue actionValue = (ActionValue) other;
            return L.f(this.title, actionValue.title) && L.f(this.requestUrl, actionValue.requestUrl) && L.f(this.params, actionValue.params);
        }

        @k
        public final ActionParams getParams() {
            return this.params;
        }

        @k
        public final String getRequestUrl() {
            return this.requestUrl;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.params.hashCode() + H.d(this.title.hashCode() * 31, 31, this.requestUrl);
        }

        @k
        public String toString() {
            return "ActionValue(title=" + this.title + ", requestUrl=" + this.requestUrl + ", params=" + this.params + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.requestUrl);
            this.params.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$Author;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/Image;", "avatar", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$Author;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/Image;", "getAvatar", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Author implements Parcelable {

        @k
        public static final Parcelable.Creator<Author> CREATOR = new Creator();

        @c("avatar")
        @l
        private final Image avatar;

        @c("title")
        @k
        private final String title;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Author> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Author createFromParcel(@k Parcel parcel) {
                return new Author(parcel.readString(), (Image) parcel.readParcelable(Author.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Author[] newArray(int i12) {
                return new Author[i12];
            }
        }

        public Author(@k String str, @l Image image) {
            this.title = str;
            this.avatar = image;
        }

        public static /* synthetic */ Author copy$default(Author author, String str, Image image, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = author.title;
            }
            if ((i12 & 2) != 0) {
                image = author.avatar;
            }
            return author.copy(str, image);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Image getAvatar() {
            return this.avatar;
        }

        @k
        public final Author copy(@k String title, @l Image avatar) {
            return new Author(title, avatar);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Author)) {
                return false;
            }
            Author author = (Author) other;
            return L.f(this.title, author.title) && L.f(this.avatar, author.avatar);
        }

        @l
        public final Image getAvatar() {
            return this.avatar;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            Image image = this.avatar;
            return iHashCode + (image == null ? 0 : image.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Author(title=");
            sb2.append(this.title);
            sb2.append(", avatar=");
            return AK.c.o(sb2, this.avatar, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.avatar, flags);
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ModelReviewEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ModelReviewEntry createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            ReviewStatus reviewStatusValueOf = parcel.readInt() == 0 ? null : ReviewStatus.valueOf(parcel.readString());
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string3 = parcel.readString();
            Author authorCreateFromParcel = parcel.readInt() == 0 ? null : Author.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(TextSection.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = a.c(Action.CREATOR, parcel, arrayList2, iC3, 1);
                }
            }
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i14);
                while (iL2 != i14) {
                    iL2 = a.l(ModelReviewEntry.class, parcel, arrayList4, iL2, 1);
                    i14 = i14;
                }
                arrayList3 = arrayList4;
            }
            return new ModelReviewEntry(lValueOf, string, string2, reviewStatusValueOf, fValueOf, string3, authorCreateFromParcel, string4, arrayList, arrayList2, string5, arrayList3, parcel.readString(), parcel.readInt() == 0 ? null : ReviewEntry.Answer.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ModelReviewEntry[] newArray(int i12) {
            return new ModelReviewEntry[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/ModelReviewEntry$ReviewStatus;", "", "(Ljava/lang/String;I)V", "PUBLISHED", "DECLINED", "MODERATION", "APPROVED", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReviewStatus {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ ReviewStatus[] $VALUES;

        @c("published")
        public static final ReviewStatus PUBLISHED = new ReviewStatus("PUBLISHED", 0);

        @c("declined")
        public static final ReviewStatus DECLINED = new ReviewStatus("DECLINED", 1);

        @c("moderation")
        public static final ReviewStatus MODERATION = new ReviewStatus("MODERATION", 2);

        @c("approved")
        public static final ReviewStatus APPROVED = new ReviewStatus("APPROVED", 3);

        private static final /* synthetic */ ReviewStatus[] $values() {
            return new ReviewStatus[]{PUBLISHED, DECLINED, MODERATION, APPROVED};
        }

        static {
            ReviewStatus[] reviewStatusArr$values = $values();
            $VALUES = reviewStatusArr$values;
            $ENTRIES = kotlin.enums.c.a(reviewStatusArr$values);
        }

        private ReviewStatus(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<ReviewStatus> getEntries() {
            return $ENTRIES;
        }

        public static ReviewStatus valueOf(String str) {
            return (ReviewStatus) Enum.valueOf(ReviewStatus.class, str);
        }

        public static ReviewStatus[] values() {
            return (ReviewStatus[]) $VALUES.clone();
        }
    }

    public ModelReviewEntry(@l Long l12, @l String str, @l String str2, @l ReviewStatus reviewStatus, @l Float f12, @l String str3, @l Author author, @l String str4, @l List<TextSection> list, @l List<Action> list2, @l String str5, @l List<TnsGalleryImage> list3, @l String str6, @l ReviewEntry.Answer answer) {
        this.reviewId = l12;
        this.title = str;
        this.scoreDescription = str2;
        this.status = reviewStatus;
        this.score = f12;
        this.rated = str3;
        this.author = author;
        this.modelTitle = str4;
        this.textSections = list;
        this.actions = list2;
        this.statusText = str5;
        this.images = list3;
        this.rejectMessage = str6;
        this.answer = answer;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Long getReviewId() {
        return this.reviewId;
    }

    @l
    public final List<Action> component10() {
        return this.actions;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    @l
    public final List<TnsGalleryImage> component12() {
        return this.images;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final String getRejectMessage() {
        return this.rejectMessage;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final ReviewEntry.Answer getAnswer() {
        return this.answer;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getScoreDescription() {
        return this.scoreDescription;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final ReviewStatus getStatus() {
        return this.status;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Float getScore() {
        return this.score;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getRated() {
        return this.rated;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Author getAuthor() {
        return this.author;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getModelTitle() {
        return this.modelTitle;
    }

    @l
    public final List<TextSection> component9() {
        return this.textSections;
    }

    @k
    public final ModelReviewEntry copy(@l Long reviewId, @l String title, @l String scoreDescription, @l ReviewStatus status, @l Float score, @l String rated, @l Author author, @l String modelTitle, @l List<TextSection> textSections, @l List<Action> actions, @l String statusText, @l List<TnsGalleryImage> images, @l String rejectMessage, @l ReviewEntry.Answer answer) {
        return new ModelReviewEntry(reviewId, title, scoreDescription, status, score, rated, author, modelTitle, textSections, actions, statusText, images, rejectMessage, answer);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelReviewEntry)) {
            return false;
        }
        ModelReviewEntry modelReviewEntry = (ModelReviewEntry) other;
        return L.f(this.reviewId, modelReviewEntry.reviewId) && L.f(this.title, modelReviewEntry.title) && L.f(this.scoreDescription, modelReviewEntry.scoreDescription) && this.status == modelReviewEntry.status && L.f(this.score, modelReviewEntry.score) && L.f(this.rated, modelReviewEntry.rated) && L.f(this.author, modelReviewEntry.author) && L.f(this.modelTitle, modelReviewEntry.modelTitle) && L.f(this.textSections, modelReviewEntry.textSections) && L.f(this.actions, modelReviewEntry.actions) && L.f(this.statusText, modelReviewEntry.statusText) && L.f(this.images, modelReviewEntry.images) && L.f(this.rejectMessage, modelReviewEntry.rejectMessage) && L.f(this.answer, modelReviewEntry.answer);
    }

    @l
    public final List<Action> getActions() {
        return this.actions;
    }

    @l
    public final ReviewEntry.Answer getAnswer() {
        return this.answer;
    }

    @l
    public final Author getAuthor() {
        return this.author;
    }

    @l
    public final List<TnsGalleryImage> getImages() {
        return this.images;
    }

    @l
    public final String getModelTitle() {
        return this.modelTitle;
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
    public final String getScoreDescription() {
        return this.scoreDescription;
    }

    @l
    public final ReviewStatus getStatus() {
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

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Long l12 = this.reviewId;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scoreDescription;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReviewStatus reviewStatus = this.status;
        int iHashCode4 = (iHashCode3 + (reviewStatus == null ? 0 : reviewStatus.hashCode())) * 31;
        Float f12 = this.score;
        int iHashCode5 = (iHashCode4 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str3 = this.rated;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Author author = this.author;
        int iHashCode7 = (iHashCode6 + (author == null ? 0 : author.hashCode())) * 31;
        String str4 = this.modelTitle;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<TextSection> list = this.textSections;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<Action> list2 = this.actions;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.statusText;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<TnsGalleryImage> list3 = this.images;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str6 = this.rejectMessage;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ReviewEntry.Answer answer = this.answer;
        return iHashCode13 + (answer != null ? answer.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ModelReviewEntry(reviewId=" + this.reviewId + ", title=" + this.title + ", scoreDescription=" + this.scoreDescription + ", status=" + this.status + ", score=" + this.score + ", rated=" + this.rated + ", author=" + this.author + ", modelTitle=" + this.modelTitle + ", textSections=" + this.textSections + ", actions=" + this.actions + ", statusText=" + this.statusText + ", images=" + this.images + ", rejectMessage=" + this.rejectMessage + ", answer=" + this.answer + ')';
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
        parcel.writeString(this.scoreDescription);
        ReviewStatus reviewStatus = this.status;
        if (reviewStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(reviewStatus.name());
        }
        Float f12 = this.score;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        parcel.writeString(this.rated);
        Author author = this.author;
        if (author == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            author.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.modelTitle);
        List<TextSection> list = this.textSections;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((TextSection) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<Action> list2 = this.actions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((Action) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.statusText);
        List<TnsGalleryImage> list3 = this.images;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        parcel.writeString(this.rejectMessage);
        ReviewEntry.Answer answer = this.answer;
        if (answer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            answer.writeToParcel(parcel, flags);
        }
    }
}
