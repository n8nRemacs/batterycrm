package com.avito.android.remote.model.item_reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.item_reviews.ItemReviewsEntry;
import com.avito.android.remote.model.item_reviews.RatingEntry;
import com.avito.android.remote.model.user_reviews.ReviewElement;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: BuyerReviewEntry.kt */
@d
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\tRSTUVWXYZB\u0099\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010&J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b-\u0010&J¼\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b0\u0010\u001eJ\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b7\u00108J \u0010=\u001a\u00020<2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u000201HÖ\u0001¢\u0006\u0004\b=\u0010>R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bE\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bF\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bH\u0010$R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bJ\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bK\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010L\u001a\u0004\bM\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bN\u0010\u001eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bO\u0010\u001eR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bP\u0010&R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010I\u001a\u0004\bQ\u0010&¨\u0006["}, d2 = {"Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry;", "Lcom/avito/android/remote/model/user_reviews/ReviewElement;", "Lcom/avito/android/remote/model/item_reviews/ItemReviewsEntry;", "", "id", "", "createdAt", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ReviewStatus;", "status", "statusText", "rejectMessage", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$Recipient;", "recipient", "", "Lcom/avito/android/remote/model/TnsGalleryImage;", "images", "reviewSubtitle", "", "score", "itemTitle", "stageTitle", "Lcom/avito/android/remote/model/item_reviews/RatingEntry$TextSection;", "textSections", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$Action;", "actions", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ReviewStatus;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$Recipient;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ReviewStatus;", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$Recipient;", "component7", "()Ljava/util/List;", "component8", "component9", "()Ljava/lang/Float;", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Long;Ljava/lang/String;Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ReviewStatus;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$Recipient;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getId", "Ljava/lang/String;", "getCreatedAt", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ReviewStatus;", "getStatus", "getStatusText", "getRejectMessage", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$Recipient;", "getRecipient", "Ljava/util/List;", "getImages", "getReviewSubtitle", "Ljava/lang/Float;", "getScore", "getItemTitle", "getStageTitle", "getTextSections", "getActions", "Action", "ActionParams", "ActionType", "ActionValue", "Button", "ButtonType", "ConfirmationDialog", "Recipient", "ReviewStatus", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BuyerReviewEntry implements ReviewElement, ItemReviewsEntry {

    @k
    public static final Parcelable.Creator<BuyerReviewEntry> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<Action> actions;

    @c("createdAt")
    @l
    private final String createdAt;

    @c("id")
    @l
    private final Long id;

    @c("images")
    @l
    private final List<TnsGalleryImage> images;

    @c("itemTitle")
    @l
    private final String itemTitle;

    @c("recipient")
    @k
    private final Recipient recipient;

    @c("rejectMessage")
    @l
    private final String rejectMessage;

    @c("reviewSubtitle")
    @l
    private final String reviewSubtitle;

    @c("score")
    @l
    private final Float score;

    @c("stageTitle")
    @l
    private final String stageTitle;

    @c("status")
    @l
    private final ReviewStatus status;

    @c("statusText")
    @l
    private final String statusText;

    @c("textSections")
    @l
    private final List<RatingEntry.TextSection> textSections;

    /* compiled from: BuyerReviewEntry.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$Action;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionType;", "type", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionValue;", "value", "<init>", "(Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionType;Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionValue;)V", "component1", "()Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionType;", "component2", "()Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionValue;", "copy", "(Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionType;Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionValue;)Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$Action;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionType;", "getType", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionValue;", "getValue", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new Creator();

        @c("type")
        @k
        private final ActionType type;

        @c("value")
        @k
        private final ActionValue value;

        /* compiled from: BuyerReviewEntry.kt */
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

    /* compiled from: BuyerReviewEntry.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionParams;", "Landroid/os/Parcelable;", "", "reviewId", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getReviewId", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActionParams implements Parcelable {

        @k
        public static final Parcelable.Creator<ActionParams> CREATOR = new Creator();

        @c("reviewId")
        private final int reviewId;

        /* compiled from: BuyerReviewEntry.kt */
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
    /* compiled from: BuyerReviewEntry.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "REMOVE_BUYER_REVIEW", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ActionType implements Parcelable {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        @k
        public static final Parcelable.Creator<ActionType> CREATOR;

        @c("removeBuyerReview")
        public static final ActionType REMOVE_BUYER_REVIEW = new ActionType("REMOVE_BUYER_REVIEW", 0);

        /* compiled from: BuyerReviewEntry.kt */
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
            return new ActionType[]{REMOVE_BUYER_REVIEW};
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

    /* compiled from: BuyerReviewEntry.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionValue;", "Landroid/os/Parcelable;", "", "title", "requestUrl", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionParams;", "params", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ConfirmationDialog;", "confirmationDialog", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionParams;Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ConfirmationDialog;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionParams;", "component4", "()Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ConfirmationDialog;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionParams;Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ConfirmationDialog;)Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getRequestUrl", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ActionParams;", "getParams", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ConfirmationDialog;", "getConfirmationDialog", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActionValue implements Parcelable {

        @k
        public static final Parcelable.Creator<ActionValue> CREATOR = new Creator();

        @c("confirmDialog")
        @l
        private final ConfirmationDialog confirmationDialog;

        @c("params")
        @k
        private final ActionParams params;

        @c("requestUrl")
        @k
        private final String requestUrl;

        @c("title")
        @k
        private final String title;

        /* compiled from: BuyerReviewEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActionValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionValue createFromParcel(@k Parcel parcel) {
                return new ActionValue(parcel.readString(), parcel.readString(), ActionParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ConfirmationDialog.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionValue[] newArray(int i12) {
                return new ActionValue[i12];
            }
        }

        public ActionValue(@k String str, @k String str2, @k ActionParams actionParams, @l ConfirmationDialog confirmationDialog) {
            this.title = str;
            this.requestUrl = str2;
            this.params = actionParams;
            this.confirmationDialog = confirmationDialog;
        }

        public static /* synthetic */ ActionValue copy$default(ActionValue actionValue, String str, String str2, ActionParams actionParams, ConfirmationDialog confirmationDialog, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = actionValue.title;
            }
            if ((i12 & 2) != 0) {
                str2 = actionValue.requestUrl;
            }
            if ((i12 & 4) != 0) {
                actionParams = actionValue.params;
            }
            if ((i12 & 8) != 0) {
                confirmationDialog = actionValue.confirmationDialog;
            }
            return actionValue.copy(str, str2, actionParams, confirmationDialog);
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

        @l
        /* renamed from: component4, reason: from getter */
        public final ConfirmationDialog getConfirmationDialog() {
            return this.confirmationDialog;
        }

        @k
        public final ActionValue copy(@k String title, @k String requestUrl, @k ActionParams params, @l ConfirmationDialog confirmationDialog) {
            return new ActionValue(title, requestUrl, params, confirmationDialog);
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
            return L.f(this.title, actionValue.title) && L.f(this.requestUrl, actionValue.requestUrl) && L.f(this.params, actionValue.params) && L.f(this.confirmationDialog, actionValue.confirmationDialog);
        }

        @l
        public final ConfirmationDialog getConfirmationDialog() {
            return this.confirmationDialog;
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
            int iHashCode = (this.params.hashCode() + H.d(this.title.hashCode() * 31, 31, this.requestUrl)) * 31;
            ConfirmationDialog confirmationDialog = this.confirmationDialog;
            return iHashCode + (confirmationDialog == null ? 0 : confirmationDialog.hashCode());
        }

        @k
        public String toString() {
            return "ActionValue(title=" + this.title + ", requestUrl=" + this.requestUrl + ", params=" + this.params + ", confirmationDialog=" + this.confirmationDialog + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.requestUrl);
            this.params.writeToParcel(parcel, flags);
            ConfirmationDialog confirmationDialog = this.confirmationDialog;
            if (confirmationDialog == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                confirmationDialog.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: BuyerReviewEntry.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$Button;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ButtonType;", "type", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ButtonType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ButtonType;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ButtonType;)Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ButtonType;", "getType", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new Creator();

        @c("text")
        @k
        private final String text;

        @c("type")
        @k
        private final ButtonType type;

        /* compiled from: BuyerReviewEntry.kt */
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
    /* compiled from: BuyerReviewEntry.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ButtonType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "POSITIVE", "NEGATIVE", "NEUTRAL", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* compiled from: BuyerReviewEntry.kt */
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

    /* compiled from: BuyerReviewEntry.kt */
    @d
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ConfirmationDialog;", "Landroid/os/Parcelable;", "", "title", "text", "", "Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$Button;", "buttons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ConfirmationDialog;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getText", "Ljava/util/List;", "getButtons", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* compiled from: BuyerReviewEntry.kt */
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

    /* compiled from: BuyerReviewEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BuyerReviewEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuyerReviewEntry createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            ReviewStatus reviewStatusValueOf = parcel.readInt() == 0 ? null : ReviewStatus.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Recipient recipientCreateFromParcel = Recipient.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BuyerReviewEntry.class, parcel, arrayList, iL2, 1);
                }
            }
            String string4 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(RatingEntry.TextSection.CREATOR, parcel, arrayList2, iC2, 1);
                    i13 = i13;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                arrayList4 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i14);
                int iC3 = 0;
                while (iC3 != i14) {
                    iC3 = com.avito.android.actions_sheet.a.c(Action.CREATOR, parcel, arrayList5, iC3, 1);
                    i14 = i14;
                    arrayList2 = arrayList2;
                }
                arrayList3 = arrayList2;
                arrayList4 = arrayList5;
            }
            return new BuyerReviewEntry(lValueOf, string, reviewStatusValueOf, string2, string3, recipientCreateFromParcel, arrayList, string4, fValueOf, string5, string6, arrayList3, arrayList4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuyerReviewEntry[] newArray(int i12) {
            return new BuyerReviewEntry[i12];
        }
    }

    /* compiled from: BuyerReviewEntry.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$Recipient;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/Image;", "avatar", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$Recipient;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/Image;", "getAvatar", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Recipient implements Parcelable {

        @k
        public static final Parcelable.Creator<Recipient> CREATOR = new Creator();

        @c("avatar")
        @l
        private final Image avatar;

        @c("title")
        @k
        private final String title;

        /* compiled from: BuyerReviewEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Recipient> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Recipient createFromParcel(@k Parcel parcel) {
                return new Recipient(parcel.readString(), (Image) parcel.readParcelable(Recipient.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Recipient[] newArray(int i12) {
                return new Recipient[i12];
            }
        }

        public Recipient(@k String str, @l Image image) {
            this.title = str;
            this.avatar = image;
        }

        public static /* synthetic */ Recipient copy$default(Recipient recipient, String str, Image image, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = recipient.title;
            }
            if ((i12 & 2) != 0) {
                image = recipient.avatar;
            }
            return recipient.copy(str, image);
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
        public final Recipient copy(@k String title, @l Image avatar) {
            return new Recipient(title, avatar);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Recipient)) {
                return false;
            }
            Recipient recipient = (Recipient) other;
            return L.f(this.title, recipient.title) && L.f(this.avatar, recipient.avatar);
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
            StringBuilder sb2 = new StringBuilder("Recipient(title=");
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BuyerReviewEntry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/BuyerReviewEntry$ReviewStatus;", "", "(Ljava/lang/String;I)V", "PUBLISHED", "DECLINED", "APPROVED", "MODERATION", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReviewStatus {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ReviewStatus[] $VALUES;

        @c("published")
        public static final ReviewStatus PUBLISHED = new ReviewStatus("PUBLISHED", 0);

        @c("declined")
        public static final ReviewStatus DECLINED = new ReviewStatus("DECLINED", 1);

        @c("approved")
        public static final ReviewStatus APPROVED = new ReviewStatus("APPROVED", 2);

        @c("moderation")
        public static final ReviewStatus MODERATION = new ReviewStatus("MODERATION", 3);

        private static final /* synthetic */ ReviewStatus[] $values() {
            return new ReviewStatus[]{PUBLISHED, DECLINED, APPROVED, MODERATION};
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

    public BuyerReviewEntry(@l Long l12, @l String str, @l ReviewStatus reviewStatus, @l String str2, @l String str3, @k Recipient recipient, @l List<TnsGalleryImage> list, @l String str4, @l Float f12, @l String str5, @l String str6, @l List<RatingEntry.TextSection> list2, @l List<Action> list3) {
        this.id = l12;
        this.createdAt = str;
        this.status = reviewStatus;
        this.statusText = str2;
        this.rejectMessage = str3;
        this.recipient = recipient;
        this.images = list;
        this.reviewSubtitle = str4;
        this.score = f12;
        this.itemTitle = str5;
        this.stageTitle = str6;
        this.textSections = list2;
        this.actions = list3;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getItemTitle() {
        return this.itemTitle;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getStageTitle() {
        return this.stageTitle;
    }

    @l
    public final List<RatingEntry.TextSection> component12() {
        return this.textSections;
    }

    @l
    public final List<Action> component13() {
        return this.actions;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ReviewStatus getStatus() {
        return this.status;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getRejectMessage() {
        return this.rejectMessage;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final Recipient getRecipient() {
        return this.recipient;
    }

    @l
    public final List<TnsGalleryImage> component7() {
        return this.images;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getReviewSubtitle() {
        return this.reviewSubtitle;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Float getScore() {
        return this.score;
    }

    @k
    public final BuyerReviewEntry copy(@l Long id2, @l String createdAt, @l ReviewStatus status, @l String statusText, @l String rejectMessage, @k Recipient recipient, @l List<TnsGalleryImage> images, @l String reviewSubtitle, @l Float score, @l String itemTitle, @l String stageTitle, @l List<RatingEntry.TextSection> textSections, @l List<Action> actions) {
        return new BuyerReviewEntry(id2, createdAt, status, statusText, rejectMessage, recipient, images, reviewSubtitle, score, itemTitle, stageTitle, textSections, actions);
    }

    @Override // com.avito.android.remote.model.item_reviews.ItemReviewsEntry, android.os.Parcelable
    public int describeContents() {
        return ItemReviewsEntry.DefaultImpls.describeContents(this);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyerReviewEntry)) {
            return false;
        }
        BuyerReviewEntry buyerReviewEntry = (BuyerReviewEntry) other;
        return L.f(this.id, buyerReviewEntry.id) && L.f(this.createdAt, buyerReviewEntry.createdAt) && this.status == buyerReviewEntry.status && L.f(this.statusText, buyerReviewEntry.statusText) && L.f(this.rejectMessage, buyerReviewEntry.rejectMessage) && L.f(this.recipient, buyerReviewEntry.recipient) && L.f(this.images, buyerReviewEntry.images) && L.f(this.reviewSubtitle, buyerReviewEntry.reviewSubtitle) && L.f(this.score, buyerReviewEntry.score) && L.f(this.itemTitle, buyerReviewEntry.itemTitle) && L.f(this.stageTitle, buyerReviewEntry.stageTitle) && L.f(this.textSections, buyerReviewEntry.textSections) && L.f(this.actions, buyerReviewEntry.actions);
    }

    @l
    public final List<Action> getActions() {
        return this.actions;
    }

    @l
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @l
    public final Long getId() {
        return this.id;
    }

    @l
    public final List<TnsGalleryImage> getImages() {
        return this.images;
    }

    @l
    public final String getItemTitle() {
        return this.itemTitle;
    }

    @k
    public final Recipient getRecipient() {
        return this.recipient;
    }

    @l
    public final String getRejectMessage() {
        return this.rejectMessage;
    }

    @l
    public final String getReviewSubtitle() {
        return this.reviewSubtitle;
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
    public final ReviewStatus getStatus() {
        return this.status;
    }

    @l
    public final String getStatusText() {
        return this.statusText;
    }

    @l
    public final List<RatingEntry.TextSection> getTextSections() {
        return this.textSections;
    }

    public int hashCode() {
        Long l12 = this.id;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        String str = this.createdAt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ReviewStatus reviewStatus = this.status;
        int iHashCode3 = (iHashCode2 + (reviewStatus == null ? 0 : reviewStatus.hashCode())) * 31;
        String str2 = this.statusText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rejectMessage;
        int iHashCode5 = (this.recipient.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        List<TnsGalleryImage> list = this.images;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.reviewSubtitle;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f12 = this.score;
        int iHashCode8 = (iHashCode7 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str5 = this.itemTitle;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.stageTitle;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<RatingEntry.TextSection> list2 = this.textSections;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Action> list3 = this.actions;
        return iHashCode11 + (list3 != null ? list3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BuyerReviewEntry(id=");
        sb2.append(this.id);
        sb2.append(", createdAt=");
        sb2.append(this.createdAt);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", statusText=");
        sb2.append(this.statusText);
        sb2.append(", rejectMessage=");
        sb2.append(this.rejectMessage);
        sb2.append(", recipient=");
        sb2.append(this.recipient);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", reviewSubtitle=");
        sb2.append(this.reviewSubtitle);
        sb2.append(", score=");
        sb2.append(this.score);
        sb2.append(", itemTitle=");
        sb2.append(this.itemTitle);
        sb2.append(", stageTitle=");
        sb2.append(this.stageTitle);
        sb2.append(", textSections=");
        sb2.append(this.textSections);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Long l12 = this.id;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.createdAt);
        ReviewStatus reviewStatus = this.status;
        if (reviewStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(reviewStatus.name());
        }
        parcel.writeString(this.statusText);
        parcel.writeString(this.rejectMessage);
        this.recipient.writeToParcel(parcel, flags);
        List<TnsGalleryImage> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.reviewSubtitle);
        Float f12 = this.score;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeString(this.itemTitle);
        parcel.writeString(this.stageTitle);
        List<RatingEntry.TextSection> list2 = this.textSections;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((RatingEntry.TextSection) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        List<Action> list3 = this.actions;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
        while (itA3.hasNext()) {
            ((Action) itA3.next()).writeToParcel(parcel, flags);
        }
    }
}
