package com.avito.android.remote.model.item_reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.remote.model.item_reviews.ItemReviewsEntry;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RatingEntry.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001:\u00013Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b&\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b*\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b+\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b2\u00101¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/RatingEntry;", "Lcom/avito/android/remote/model/item_reviews/ItemReviewsEntry;", "", "reviewId", "", "title", "", "score", "rated", "Lcom/avito/android/remote/model/Image;", "avatar", "stageTitle", "itemTitle", "Lcom/avito/android/remote/model/item_reviews/ReviewAnswer;", "answer", "", "Lcom/avito/android/remote/model/TnsGalleryImage;", "images", "Lcom/avito/android/remote/model/item_reviews/RatingEntry$TextSection;", "textSections", "<init>", "(JLjava/lang/String;FLjava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/item_reviews/ReviewAnswer;Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getReviewId", "()J", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "F", "getScore", "()F", "getRated", "Lcom/avito/android/remote/model/Image;", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "getStageTitle", "getItemTitle", "Lcom/avito/android/remote/model/item_reviews/ReviewAnswer;", "getAnswer", "()Lcom/avito/android/remote/model/item_reviews/ReviewAnswer;", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "getTextSections", "TextSection", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RatingEntry implements ItemReviewsEntry {

    @k
    public static final Parcelable.Creator<RatingEntry> CREATOR = new Creator();

    @c("answer")
    @l
    private final ReviewAnswer answer;

    @c("avatar")
    @l
    private final Image avatar;

    @c("images")
    @l
    private final List<TnsGalleryImage> images;

    @c("itemTitle")
    @l
    private final String itemTitle;

    @c("rated")
    @k
    private final String rated;

    @c("id")
    private final long reviewId;

    @c("score")
    private final float score;

    @c("stageTitle")
    @k
    private final String stageTitle;

    @c("textSections")
    @l
    private final List<TextSection> textSections;

    @c("title")
    @k
    private final String title;

    /* compiled from: RatingEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingEntry createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            float f12 = parcel.readFloat();
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(RatingEntry.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ReviewAnswer reviewAnswerCreateFromParcel = parcel.readInt() == 0 ? null : ReviewAnswer.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(RatingEntry.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(TextSection.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new RatingEntry(j12, string, f12, string2, image, string3, string4, reviewAnswerCreateFromParcel, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingEntry[] newArray(int i12) {
            return new RatingEntry[i12];
        }
    }

    /* compiled from: RatingEntry.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/RatingEntry$TextSection;", "Landroid/os/Parcelable;", "", "title", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getText", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TextSection implements Parcelable {

        @k
        public static final Parcelable.Creator<TextSection> CREATOR = new Creator();

        @c("text")
        @k
        private final String text;

        @c("title")
        @l
        private final String title;

        /* compiled from: RatingEntry.kt */
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

    public RatingEntry(long j12, @k String str, float f12, @k String str2, @l Image image, @k String str3, @l String str4, @l ReviewAnswer reviewAnswer, @l List<TnsGalleryImage> list, @l List<TextSection> list2) {
        this.reviewId = j12;
        this.title = str;
        this.score = f12;
        this.rated = str2;
        this.avatar = image;
        this.stageTitle = str3;
        this.itemTitle = str4;
        this.answer = reviewAnswer;
        this.images = list;
        this.textSections = list2;
    }

    @Override // com.avito.android.remote.model.item_reviews.ItemReviewsEntry, android.os.Parcelable
    public int describeContents() {
        return ItemReviewsEntry.DefaultImpls.describeContents(this);
    }

    @l
    public final ReviewAnswer getAnswer() {
        return this.answer;
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
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
    public final String getRated() {
        return this.rated;
    }

    public final long getReviewId() {
        return this.reviewId;
    }

    public final float getScore() {
        return this.score;
    }

    @k
    public final String getStageTitle() {
        return this.stageTitle;
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
        parcel.writeLong(this.reviewId);
        parcel.writeString(this.title);
        parcel.writeFloat(this.score);
        parcel.writeString(this.rated);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.stageTitle);
        parcel.writeString(this.itemTitle);
        ReviewAnswer reviewAnswer = this.answer;
        if (reviewAnswer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reviewAnswer.writeToParcel(parcel, flags);
        }
        List<TnsGalleryImage> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<TextSection> list2 = this.textSections;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((TextSection) itA2.next()).writeToParcel(parcel, flags);
        }
    }
}
