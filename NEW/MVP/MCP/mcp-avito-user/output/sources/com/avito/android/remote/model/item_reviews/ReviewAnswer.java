package com.avito.android.remote.model.item_reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ReviewAnswer.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/ReviewAnswer;", "Landroid/os/Parcelable;", "", "id", "", "title", "answered", "Lcom/avito/android/remote/model/Image;", "avatar", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "Lcom/avito/android/remote/model/TnsGalleryImage;", "images", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getAnswered", "Lcom/avito/android/remote/model/Image;", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReviewAnswer implements Parcelable {

    @k
    public static final Parcelable.Creator<ReviewAnswer> CREATOR = new Creator();

    @c("answered")
    @k
    private final String answered;

    @c("avatar")
    @l
    private final Image avatar;

    @c("answerId")
    private final long id;

    @c("images")
    @l
    private final List<TnsGalleryImage> images;

    @c("link")
    @l
    private final DeepLink link;

    @c("text")
    @k
    private final String text;

    @c("title")
    @k
    private final String title;

    /* compiled from: ReviewAnswer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReviewAnswer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ReviewAnswer createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(ReviewAnswer.class.getClassLoader());
            String string3 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ReviewAnswer.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(ReviewAnswer.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new ReviewAnswer(j12, string, string2, image, string3, deepLink, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ReviewAnswer[] newArray(int i12) {
            return new ReviewAnswer[i12];
        }
    }

    public ReviewAnswer(long j12, @k String str, @k String str2, @l Image image, @k String str3, @l DeepLink deepLink, @l List<TnsGalleryImage> list) {
        this.id = j12;
        this.title = str;
        this.answered = str2;
        this.avatar = image;
        this.text = str3;
        this.link = deepLink;
        this.images = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
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

    @k
    public final String getText() {
        return this.text;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeLong(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.answered);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.link, flags);
        List<TnsGalleryImage> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }
}
