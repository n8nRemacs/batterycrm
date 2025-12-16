package com.avito.android.remote.model.user_reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.item_reviews.ModelRatingEntry;
import com.avito.android.remote.model.item_reviews.RatingEntry;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ModelRatingElement.kt */
@d
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u008f\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b,\u0010)J\u0012\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b-\u0010\u001eJ²\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b0\u0010\u001eJ\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u000201HÖ\u0001¢\u0006\u0004\b9\u00103J \u0010>\u001a\u00020=2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u000201HÖ\u0001¢\u0006\u0004\b>\u0010?R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\bA\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bC\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bD\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010!R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010#R\u001a\u0010\f\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bI\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bK\u0010&R\u001a\u0010\u000f\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bL\u0010\u001eR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\bN\u0010)R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bO\u0010)R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010B\u001a\u0004\bP\u0010\u001eR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010M\u001a\u0004\bQ\u0010)R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bR\u0010\u001e¨\u0006S"}, d2 = {"Lcom/avito/android/remote/model/user_reviews/ModelRatingElement;", "Lcom/avito/android/remote/model/user_reviews/ReviewElement;", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry;", "", "reviewId", "", "title", "scoreDescription", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ReviewStatus;", "status", "", "score", "rated", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$Author;", "author", "modelTitle", "", "Lcom/avito/android/remote/model/item_reviews/RatingEntry$TextSection;", "textSections", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$Action;", "actions", "statusText", "Lcom/avito/android/remote/model/TnsGalleryImage;", "images", "rejectMessage", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ReviewStatus;FLjava/lang/String;Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$Author;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ReviewStatus;", "component5", "()F", "component6", "component7", "()Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$Author;", "component8", "component9", "()Ljava/util/List;", "component10", "component11", "component12", "component13", "copy", "(JLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ReviewStatus;FLjava/lang/String;Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$Author;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/user_reviews/ModelRatingElement;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getReviewId", "Ljava/lang/String;", "getTitle", "getScoreDescription", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$ReviewStatus;", "getStatus", "F", "getScore", "getRated", "Lcom/avito/android/remote/model/item_reviews/ModelRatingEntry$Author;", "getAuthor", "getModelTitle", "Ljava/util/List;", "getTextSections", "getActions", "getStatusText", "getImages", "getRejectMessage", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ModelRatingElement implements ReviewElement, ModelRatingEntry {

    @k
    public static final Parcelable.Creator<ModelRatingElement> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<ModelRatingEntry.Action> actions;

    @c("author")
    @k
    private final ModelRatingEntry.Author author;

    @c("images")
    @l
    private final List<TnsGalleryImage> images;

    @c("modelTitle")
    @k
    private final String modelTitle;

    @c("rated")
    @k
    private final String rated;

    @c("rejectMessage")
    @l
    private final String rejectMessage;

    @c("id")
    private final long reviewId;

    @c("score")
    private final float score;

    @c("scoreDescription")
    @l
    private final String scoreDescription;

    @c("status")
    @l
    private final ModelRatingEntry.ReviewStatus status;

    @c("statusText")
    @l
    private final String statusText;

    @c("textSections")
    @l
    private final List<RatingEntry.TextSection> textSections;

    @c("reviewTitle")
    @k
    private final String title;

    /* compiled from: ModelRatingElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ModelRatingElement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ModelRatingElement createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String str;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ModelRatingEntry.ReviewStatus reviewStatusValueOf = parcel.readInt() == 0 ? null : ModelRatingEntry.ReviewStatus.valueOf(parcel.readString());
            float f12 = parcel.readFloat();
            String string3 = parcel.readString();
            ModelRatingEntry.Author authorCreateFromParcel = ModelRatingEntry.Author.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(RatingEntry.TextSection.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = a.c(ModelRatingEntry.Action.CREATOR, parcel, arrayList2, iC3, 1);
                }
            }
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string5;
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList3 = new ArrayList(i14);
                int iL2 = 0;
                while (iL2 != i14) {
                    iL2 = a.l(ModelRatingElement.class, parcel, arrayList3, iL2, 1);
                    i14 = i14;
                    string5 = string5;
                }
                str = string5;
            }
            return new ModelRatingElement(j12, string, string2, reviewStatusValueOf, f12, string3, authorCreateFromParcel, string4, arrayList, arrayList2, str, arrayList3, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ModelRatingElement[] newArray(int i12) {
            return new ModelRatingElement[i12];
        }
    }

    public ModelRatingElement(long j12, @k String str, @l String str2, @l ModelRatingEntry.ReviewStatus reviewStatus, float f12, @k String str3, @k ModelRatingEntry.Author author, @k String str4, @l List<RatingEntry.TextSection> list, @l List<ModelRatingEntry.Action> list2, @l String str5, @l List<TnsGalleryImage> list3, @l String str6) {
        this.reviewId = j12;
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
    }

    /* renamed from: component1, reason: from getter */
    public final long getReviewId() {
        return this.reviewId;
    }

    @l
    public final List<ModelRatingEntry.Action> component10() {
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

    @k
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
    public final ModelRatingEntry.ReviewStatus getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final float getScore() {
        return this.score;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getRated() {
        return this.rated;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final ModelRatingEntry.Author getAuthor() {
        return this.author;
    }

    @k
    /* renamed from: component8, reason: from getter */
    public final String getModelTitle() {
        return this.modelTitle;
    }

    @l
    public final List<RatingEntry.TextSection> component9() {
        return this.textSections;
    }

    @k
    public final ModelRatingElement copy(long reviewId, @k String title, @l String scoreDescription, @l ModelRatingEntry.ReviewStatus status, float score, @k String rated, @k ModelRatingEntry.Author author, @k String modelTitle, @l List<RatingEntry.TextSection> textSections, @l List<ModelRatingEntry.Action> actions, @l String statusText, @l List<TnsGalleryImage> images, @l String rejectMessage) {
        return new ModelRatingElement(reviewId, title, scoreDescription, status, score, rated, author, modelTitle, textSections, actions, statusText, images, rejectMessage);
    }

    @Override // com.avito.android.remote.model.item_reviews.ItemReviewsEntry, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelRatingElement)) {
            return false;
        }
        ModelRatingElement modelRatingElement = (ModelRatingElement) other;
        return this.reviewId == modelRatingElement.reviewId && L.f(this.title, modelRatingElement.title) && L.f(this.scoreDescription, modelRatingElement.scoreDescription) && this.status == modelRatingElement.status && Float.compare(this.score, modelRatingElement.score) == 0 && L.f(this.rated, modelRatingElement.rated) && L.f(this.author, modelRatingElement.author) && L.f(this.modelTitle, modelRatingElement.modelTitle) && L.f(this.textSections, modelRatingElement.textSections) && L.f(this.actions, modelRatingElement.actions) && L.f(this.statusText, modelRatingElement.statusText) && L.f(this.images, modelRatingElement.images) && L.f(this.rejectMessage, modelRatingElement.rejectMessage);
    }

    @Override // com.avito.android.remote.model.item_reviews.ModelRatingEntry
    @l
    public List<ModelRatingEntry.Action> getActions() {
        return this.actions;
    }

    @Override // com.avito.android.remote.model.item_reviews.ModelRatingEntry
    @k
    public ModelRatingEntry.Author getAuthor() {
        return this.author;
    }

    @Override // com.avito.android.remote.model.item_reviews.ModelRatingEntry
    @l
    public List<TnsGalleryImage> getImages() {
        return this.images;
    }

    @Override // com.avito.android.remote.model.item_reviews.ModelRatingEntry
    @k
    public String getModelTitle() {
        return this.modelTitle;
    }

    @Override // com.avito.android.remote.model.item_reviews.ModelRatingEntry
    @k
    public String getRated() {
        return this.rated;
    }

    @Override // com.avito.android.remote.model.item_reviews.ModelRatingEntry
    @l
    public String getRejectMessage() {
        return this.rejectMessage;
    }

    @Override // com.avito.android.remote.model.item_reviews.ModelRatingEntry
    public long getReviewId() {
        return this.reviewId;
    }

    @Override // com.avito.android.remote.model.item_reviews.ModelRatingEntry
    public float getScore() {
        return this.score;
    }

    @Override // com.avito.android.remote.model.item_reviews.ModelRatingEntry
    @l
    public String getScoreDescription() {
        return this.scoreDescription;
    }

    @Override // com.avito.android.remote.model.item_reviews.ModelRatingEntry
    @l
    public ModelRatingEntry.ReviewStatus getStatus() {
        return this.status;
    }

    @Override // com.avito.android.remote.model.item_reviews.ModelRatingEntry
    @l
    public String getStatusText() {
        return this.statusText;
    }

    @Override // com.avito.android.remote.model.item_reviews.ModelRatingEntry
    @l
    public List<RatingEntry.TextSection> getTextSections() {
        return this.textSections;
    }

    @Override // com.avito.android.remote.model.item_reviews.ModelRatingEntry
    @k
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(Long.hashCode(this.reviewId) * 31, 31, this.title);
        String str = this.scoreDescription;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        ModelRatingEntry.ReviewStatus reviewStatus = this.status;
        int iD3 = H.d((this.author.hashCode() + H.d(r.d(this.score, (iHashCode + (reviewStatus == null ? 0 : reviewStatus.hashCode())) * 31, 31), 31, this.rated)) * 31, 31, this.modelTitle);
        List<RatingEntry.TextSection> list = this.textSections;
        int iHashCode2 = (iD3 + (list == null ? 0 : list.hashCode())) * 31;
        List<ModelRatingEntry.Action> list2 = this.actions;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.statusText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TnsGalleryImage> list3 = this.images;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.rejectMessage;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ModelRatingElement(reviewId=");
        sb2.append(this.reviewId);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", scoreDescription=");
        sb2.append(this.scoreDescription);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", score=");
        sb2.append(this.score);
        sb2.append(", rated=");
        sb2.append(this.rated);
        sb2.append(", author=");
        sb2.append(this.author);
        sb2.append(", modelTitle=");
        sb2.append(this.modelTitle);
        sb2.append(", textSections=");
        sb2.append(this.textSections);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", statusText=");
        sb2.append(this.statusText);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", rejectMessage=");
        return C22026a.c(sb2, this.rejectMessage, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeLong(this.reviewId);
        parcel.writeString(this.title);
        parcel.writeString(this.scoreDescription);
        ModelRatingEntry.ReviewStatus reviewStatus = this.status;
        if (reviewStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(reviewStatus.name());
        }
        parcel.writeFloat(this.score);
        parcel.writeString(this.rated);
        this.author.writeToParcel(parcel, flags);
        parcel.writeString(this.modelTitle);
        List<RatingEntry.TextSection> list = this.textSections;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((RatingEntry.TextSection) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<ModelRatingEntry.Action> list2 = this.actions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((ModelRatingEntry.Action) itA2.next()).writeToParcel(parcel, flags);
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
    }
}
