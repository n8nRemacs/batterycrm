package com.avito.android.remote.model.rating_details_legacy;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.rating_details_legacy.RatingDetailsElement;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: RatingDetailsElement.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/rating_details_legacy/CommentElement;", "Lcom/avito/android/remote/model/rating_details_legacy/RatingDetailsElement;", "", "title", "", "score", "subtitle", "rated", "Lcom/avito/android/remote/model/Image;", "avatar", "text", "<init>", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "F", "getScore", "()F", "getSubtitle", "getRated", "Lcom/avito/android/remote/model/Image;", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "getText", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CommentElement implements RatingDetailsElement {

    @k
    public static final Parcelable.Creator<CommentElement> CREATOR = new Creator();

    @c("avatar")
    @l
    private final Image avatar;

    @c("rated")
    @l
    private final String rated;

    @c("score")
    private final float score;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("text")
    @l
    private final String text;

    @c("title")
    @k
    private final String title;

    /* compiled from: RatingDetailsElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CommentElement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CommentElement createFromParcel(@k Parcel parcel) {
            return new CommentElement(parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(CommentElement.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CommentElement[] newArray(int i12) {
            return new CommentElement[i12];
        }
    }

    public CommentElement(@k String str, float f12, @l String str2, @l String str3, @l Image image, @l String str4) {
        this.title = str;
        this.score = f12;
        this.subtitle = str2;
        this.rated = str3;
        this.avatar = image;
        this.text = str4;
    }

    @Override // com.avito.android.remote.model.rating_details_legacy.RatingDetailsElement, android.os.Parcelable
    public int describeContents() {
        return RatingDetailsElement.DefaultImpls.describeContents(this);
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    public final String getRated() {
        return this.rated;
    }

    public final float getScore() {
        return this.score;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeFloat(this.score);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.rated);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.text);
    }
}
