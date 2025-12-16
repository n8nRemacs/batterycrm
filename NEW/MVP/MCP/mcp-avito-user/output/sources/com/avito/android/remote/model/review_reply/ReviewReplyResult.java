package com.avito.android.remote.model.review_reply;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ReviewReplyResult.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b)\u0010$R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b\u000e\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b/\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b0\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b1\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/review_reply/ReviewReplyResult;", "Landroid/os/Parcelable;", "", "id", "", "title", "answerDate", "Lcom/avito/android/remote/model/Image;", "avatar", "text", "", "Lcom/avito/android/remote/model/TnsGalleryImage;", "images", "", "isShop", "status", "statusText", "rejectMessage", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getAnswerDate", "Lcom/avito/android/remote/model/Image;", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "getText", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getStatus", "getStatusText", "getRejectMessage", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReviewReplyResult implements Parcelable {

    @k
    public static final Parcelable.Creator<ReviewReplyResult> CREATOR = new Creator();

    @c("answered")
    @k
    private final String answerDate;

    @c("avatar")
    @l
    private final Image avatar;

    @c("answerId")
    @l
    private final Long id;

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

    /* compiled from: ReviewReplyResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReviewReplyResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ReviewReplyResult createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(ReviewReplyResult.class.getClassLoader());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(ReviewReplyResult.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ReviewReplyResult(lValueOf, string, string2, image, string3, arrayList, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ReviewReplyResult.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ReviewReplyResult[] newArray(int i12) {
            return new ReviewReplyResult[i12];
        }
    }

    public ReviewReplyResult(@l Long l12, @k String str, @k String str2, @l Image image, @k String str3, @l List<TnsGalleryImage> list, @l Boolean bool, @l String str4, @l String str5, @l String str6, @l DeepLink deepLink) {
        this.id = l12;
        this.title = str;
        this.answerDate = str2;
        this.avatar = image;
        this.text = str3;
        this.images = list;
        this.isShop = bool;
        this.status = str4;
        this.statusText = str5;
        this.rejectMessage = str6;
        this.link = deepLink;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final String getAnswerDate() {
        return this.answerDate;
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
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
    /* renamed from: isShop, reason: from getter */
    public final Boolean getIsShop() {
        return this.isShop;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Long l12 = this.id;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.answerDate);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.text);
        List<TnsGalleryImage> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
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
        parcel.writeParcelable(this.link, flags);
    }
}
