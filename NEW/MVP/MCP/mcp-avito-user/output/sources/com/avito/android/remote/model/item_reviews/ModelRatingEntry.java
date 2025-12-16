package com.avito.android.remote.model.item_reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.item_reviews.ItemReviewsEntry;
import com.avito.android.remote.model.item_reviews.RatingEntry;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: ModelRatingEntry.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0006+,-./0R\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u0014\u0010 \u001a\u0004\u0018\u00010!X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0011R\u001a\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0006R\u0012\u0010)\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0011¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry;", "Lcom/avito/android/remote/model/item_reviews/ItemReviewsEntry;", "actions", "", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$Action;", "getActions", "()Ljava/util/List;", "author", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$Author;", "getAuthor", "()Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$Author;", "images", "Lcom/avito/android/remote/model/TnsGalleryImage;", "getImages", "modelTitle", "", "getModelTitle", "()Ljava/lang/String;", "rated", "getRated", "rejectMessage", "getRejectMessage", "reviewId", "", "getReviewId", "()J", "score", "", "getScore", "()F", "scoreDescription", "getScoreDescription", "status", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ReviewStatus;", "getStatus", "()Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ReviewStatus;", "statusText", "getStatusText", "textSections", "Lcom/avito/android/remote/model/item_reviews/RatingEntry$TextSection;", "getTextSections", "title", "getTitle", "Action", "ActionParams", "ActionType", "ActionValue", "Author", "ReviewStatus", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ModelRatingEntry extends ItemReviewsEntry {

    /* compiled from: ModelRatingEntry.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$Action;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionType;", "type", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionValue;", "value", "<init>", "(Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionType;Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionValue;)V", "component1", "()Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionType;", "component2", "()Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionValue;", "copy", "(Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionType;Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionValue;)Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$Action;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionType;", "getType", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionValue;", "getValue", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new Creator();

        @c("type")
        @k
        private final ActionType type;

        @c("value")
        @k
        private final ActionValue value;

        /* compiled from: ModelRatingEntry.kt */
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

    /* compiled from: ModelRatingEntry.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionParams;", "Landroid/os/Parcelable;", "", "reviewId", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getReviewId", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActionParams implements Parcelable {

        @k
        public static final Parcelable.Creator<ActionParams> CREATOR = new Creator();

        @c("reviewId")
        private final int reviewId;

        /* compiled from: ModelRatingEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActionParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionParams createFromParcel(@k Parcel parcel) {
                return new ActionParams(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionParams[] newArray(int i12) {
                return new ActionParams[i12];
            }
        }

        public ActionParams(int i12) {
            this.reviewId = i12;
        }

        public static /* synthetic */ ActionParams copy$default(ActionParams actionParams, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = actionParams.reviewId;
            }
            return actionParams.copy(i12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getReviewId() {
            return this.reviewId;
        }

        @k
        public final ActionParams copy(int reviewId) {
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
            return (other instanceof ActionParams) && this.reviewId == ((ActionParams) other).reviewId;
        }

        public final int getReviewId() {
            return this.reviewId;
        }

        public int hashCode() {
            return Integer.hashCode(this.reviewId);
        }

        @k
        public String toString() {
            return r.t(new StringBuilder("ActionParams(reviewId="), this.reviewId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.reviewId);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ModelRatingEntry.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "REMOVE_MODEL_REVIEW", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ActionType implements Parcelable {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        @k
        public static final Parcelable.Creator<ActionType> CREATOR;

        @c("removeModelReview")
        public static final ActionType REMOVE_MODEL_REVIEW = new ActionType("REMOVE_MODEL_REVIEW", 0);

        /* compiled from: ModelRatingEntry.kt */
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
        public static a<ActionType> getEntries() {
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

    /* compiled from: ModelRatingEntry.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionValue;", "Landroid/os/Parcelable;", "", "title", "requestUrl", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionParams;", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionParams;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionParams;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionParams;)Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getRequestUrl", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ActionParams;", "getParams", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* compiled from: ModelRatingEntry.kt */
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

    /* compiled from: ModelRatingEntry.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$Author;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/Image;", "avatar", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$Author;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/Image;", "getAvatar", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Author implements Parcelable {

        @k
        public static final Parcelable.Creator<Author> CREATOR = new Creator();

        @c("avatar")
        @l
        private final Image avatar;

        @c("title")
        @k
        private final String title;

        /* compiled from: ModelRatingEntry.kt */
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

    /* compiled from: ModelRatingEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static int describeContents(@k ModelRatingEntry modelRatingEntry) {
            return ItemReviewsEntry.DefaultImpls.describeContents(modelRatingEntry);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ModelRatingEntry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ReviewStatus;", "", "(Ljava/lang/String;I)V", "PUBLISHED", "DECLINED", "MODERATION", "APPROVED", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReviewStatus {
        private static final /* synthetic */ a $ENTRIES;
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
        public static a<ReviewStatus> getEntries() {
            return $ENTRIES;
        }

        public static ReviewStatus valueOf(String str) {
            return (ReviewStatus) Enum.valueOf(ReviewStatus.class, str);
        }

        public static ReviewStatus[] values() {
            return (ReviewStatus[]) $VALUES.clone();
        }
    }

    @l
    List<Action> getActions();

    @k
    Author getAuthor();

    @l
    List<TnsGalleryImage> getImages();

    @k
    String getModelTitle();

    @k
    String getRated();

    @l
    String getRejectMessage();

    long getReviewId();

    float getScore();

    @l
    String getScoreDescription();

    @l
    ReviewStatus getStatus();

    @l
    String getStatusText();

    @l
    List<RatingEntry.TextSection> getTextSections();

    @k
    String getTitle();
}
